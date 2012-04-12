# DANGER: wipes out database
import os, os.path
import pg
import Ice

def execSql(dbname, script):
    props = Ice.createProperties()
    props.load('config/server/SenStore.cfg')
    host = props.getProperty('PostgreSQL.hostname')
    user = props.getProperty('PostgreSQL.username')
    password = props.getProperty('PostgreSQL.password')
    
    db = pg.connect(dbname=dbname, host=host, user=user,
                    passwd=password)
    f = open(script, 'r')
    cmd = ''
    for line in f:
        cmd += line
        if ';' in cmd:
            cmd = cmd.strip()
            print cmd
            db.query(cmd)
            cmd = ''

if __name__ == '__main__':
    execSql('template1', 'install/database_create.sql')
    execSql('senstore', 'install/tables_create.sql')

    # Remove old HDF5 database
    if os.path.exists('SenStore.h5'):
        os.unlink('SenStore.h5')
