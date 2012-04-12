# Gwendolyn van der Linden
# (C) Copyright 2010 SC Solutions, Inc.
# All Rights Reserved.
# $Id: setup-server.py,v 1.1 2010/05/21 15:48:05 glinden Exp $
import sys
import glob
from distutils.core import setup

setup(name='SenStoreServer',
      version='0.1.1',
      description='SenStore Structural Health Monitoring System Server',
      author='SC Solutions, Inc.',
      author_email='info@scsolutions.com',
      license='See LICENSE.txt', 
      url='http://www.scsolutions.com/',
      packages = ['senstore.scshm',
                  'senstore.scshm.database',
                  'senstore.scshm.database.server',
                  ],
      py_modules = ['senstore.scshm-create',
                    'senstore.scshm-start'
                    ],
      data_files = [('Lib/site-packages/senstore/config/server',
                     ['senstore/config/server/SenStore.cfg']),
                    ('Lib/site-packages/senstore/install',
                     ['senstore/install/database_create.sql',
                      'senstore/install/tables_create.sql']),
                    ('Lib/site-packages/senstore',
                     ['LICENSE.txt', 'README.txt']),
                    ('Lib/site-packages/senstore/scshm/database',
                     ['senstore/scshm/database/SenStore.ice'])
                    ]
      )
