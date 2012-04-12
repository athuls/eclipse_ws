# Gwendolyn van der Linden
# (C) Copyright 2010 SC Solutions, Inc.
# All Rights Reserved.
# $Id: setup-client.py,v 1.5 2011/05/10 22:04:38 glinden Exp $
import sys
import glob
from distutils.core import setup

setup(name='SenStoreClient',
      version='0.2.2',
      description='SenStore Structural Health Monitoring System Client',
      author='SC Solutions, Inc.',
      author_email='info@scsolutions.com',
      license='See LICENSE.txt', 
      url='http://www.scsolutions.com/',
      packages = ['senstore.scshm',
                  'senstore.scshm.database',
                  'senstore.scshm.database.client',
                  ],
      py_modules = ['senstore.sevenbeambridge',
                    'senstore.narada_create',
                    'senstore.narada_save',
                    'senstore.narada_load',
                    'senstore.narada_query',
                    'setup-client'
                    ],
      data_files = [('Lib/site-packages/senstore/config/client',
                     ['senstore/config/client/SenStore.cfg']),
                    ('Lib/site-packages/senstore',
                     ['LICENSE.txt', 'README.txt', 'CHANGES.txt',
                      'senstore/sevenbeambridge.svg',
                      'senstore/narada.cfg']),
                    ('Lib/site-packages/senstore/scshm/database', 
                     ['senstore/scshm/database/SenStore.ice'])
                    ]
      )
