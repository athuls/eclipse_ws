#!/usr/bin/env python
# Copyright (c) 2010 SC Solutions, Inc.
# See LICENCE.TXT for licensing terms.
# $Id: scshm_backup_trim.py,v 1.2 2011/05/10 18:17:14 glinden Exp $
import glob
import os
import os.path
import logging
import ConfigParser

## \file scshm_backup_trim.py  Database backup file pruning script.

## \package scshm_backup_trim  Database backup file pruning script.

## Reduces the number of old backup files.
#
# Keeps all backup files of the most recent day for which backups are
# available, and the last backup of each prior day.
def main():
    # Load configuration
    config = ConfigParser.ConfigParser()
    config.read(['config/client/SenStore.cfg'])
    # Setup logging
    try:
        level = config.get('Logging', 'LEVEL').upper()
        loglevel = logging.__dict__[level]
    except:
        loglevel = logging.INFO
    FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
    logging.basicConfig(level=loglevel,format=FORMAT)
    # Get file names
    fileNames = glob.glob('backup-*.h5')
    fileNames.sort()
    fileNames.reverse()
    lastDay = None
    currentDay = None
    lastFile = True
    deleteFile = False
    for fileName in fileNames:
        try:
            fileRoot,fileExt = os.path.splitext(fileName)
            fileBase, fileTime = fileRoot.split('_')
            dummy1,dummy2,fileYear,fileMonth,fileDay = fileBase.split('-')
        except:
            logging.warning('Skipping %s, unkown name format' % fileName)
            continue
        if not lastDay:
            # Initialize lastDay variable
            lastDay = (fileYear,fileMonth,fileDay)
        if not currentDay:
            # Initialize currentDay variable
            currentDay = (fileYear,fileMonth,fileDay)
            lastFile = True
        if currentDay != (fileYear,fileMonth,fileDay):
            # We have moved to another day, so we'll need to store the
            # latest file of that day
            lastFile = True
        currentDay = (fileYear,fileMonth,fileDay)
        if lastDay == currentDay:
            # Keep all backup files of the most recent day
            deleteFile = False
        else:
            if lastFile:
                # Keep last backup file of the day
                lastFile = False
                deleteFile = False
            else:
                # Remove all other files of this day
                deleteFile = True
        if deleteFile:
            logging.info('Removing %s' % fileName)
            os.unlink(fileName)
        else:
            logging.info('Keeping %s' % fileName)

if __name__ == '__main__':
    main()
