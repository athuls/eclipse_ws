# Gwendolyn van der Linden
# (C) Copyright 2010 SC Solutions, Inc.
# All Rights Reserved.
# $Id: setup-extras.py,v 1.3 2011/05/10 22:04:38 glinden Exp $
import sys
import glob
from distutils.core import setup

setup(name='SenStoreExtras',
      version='0.2.1',
      description='SenStore Structural Health Monitoring System Server',
      author='SC Solutions, Inc.',
      author_email='info@scsolutions.com',
      license='See LICENSE.txt', 
      url='http://www.scsolutions.com/',
      packages = ['senstore.buildtools'],
      data_files = [('Lib/site-packages/senstore',
                     ['LICENSE.txt', 'README.txt', 'CHANGES.txt'])]
      )
