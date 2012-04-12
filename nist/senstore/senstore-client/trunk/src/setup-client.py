# Gwendolyn van der Linden
# (C) Copyright 2010 SC Solutions, Inc.
# All Rights Reserved.
# $Id: setup-client.py,v 1.2 2010/06/16 19:01:14 glinden Exp $
import sys
import glob
from distutils.core import setup

setup(name='SenStoreClient',
      version='0.1.1',
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
                    'senstore.narada-create',
                    'senstore.narada-save',
                    'senstore.narada-query',
                    'senstore.setup-client'
                    ],
      data_files = [('Lib/site-packages/senstore/config/client',
                     ['senstore/config/client/SenStore.cfg']),
                    ('Lib/site-packages/senstore',
                     ['LICENSE.txt', 'README.txt', 'senstore/sevenbeambridge.svg',
                      'senstore/narada.cfg']),
                    ('Lib/site-packages/senstore/scshm/database', 
                     ['senstore/scshm/database/SenStore.ice'])
                    ]
      )
