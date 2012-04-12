# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: test_find.py,v 1.2 2011/05/10 18:17:14 glinden Exp $
import numpy
import unittest
from find import *

class TestFind(unittest.TestCase):
    def testEmpty(self):
        self.assertEqual(findNextClosest([], 2.0), None)
        self.assertEqual(findNextClosest([], 2.0, 0), None)
        self.assertEqual(findNextClosest([], 2.0, 0, 0), None)
        self.assertEqual(findNextClosest([], 2.0, 0,-1), None)
    def testOne(self):
        self.assertEqual(findNextClosest([2.0], 2.0), 0)
        self.assertEqual(findNextClosest([1.0], 2.0), None)
        self.assertEqual(findNextClosest([3.0], 2.0), 0)
    def testTwo(self):
        self.assertEqual(findNextClosest([2.0, 3.0], 1.0), 0)
        self.assertEqual(findNextClosest([2.0, 3.0], 2.0), 0)
        self.assertEqual(findNextClosest([2.0, 3.0], 2.5), 1)
        self.assertEqual(findNextClosest([2.0, 3.0], 3.0), 1)
        self.assertEqual(findNextClosest([2.0, 3.0], 4.0), None)
    def testThree(self):
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 1.0), 0)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 2.0), 0)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 2.1), 1)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 2.5), 1)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 2.6), 2)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 3.0), 2)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0], 3.1), None)
    def testFour(self):
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 1.0), 0)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 2.0), 0)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 2.1), 1)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 2.5), 1)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 2.6), 2)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 3.0), 2)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 3.1, 2, 3), 3)
        self.assertEqual(findNextClosest([2.0, 2.5, 3.0, 4.0], 4.1), None)

class TestFindList(unittest.TestCase):
    def testEmpty(self):
        values = []
        self.assertEqual(findNextClosestList(values, []), ([],[]))
        self.assertEqual(findNextClosestList(values, [2.0]), ([],[]))
    def testOne(self):
        values = [1.0]
        self.assertEqual(findNextClosestList(values, []), ([1.0],[0]))
        self.assertEqual(findNextClosestList(values, [2.0]), ([],[]))
        self.assertEqual(findNextClosestList(values, [1.0]), ([1.0],[0]))
        self.assertEqual(findNextClosestList(values, [0.0]), ([1.0],[0]))
        self.assertEqual(findNextClosestList(values, [0.0,0.5]), ([1.0],[0]))
    def testTwo(self):
        values = [1.0,2.0]
        self.assertEqual(findNextClosestList(values, []), ([1.0,2.0],[0,1]))
        self.assertEqual(findNextClosestList(values, [3.0]), ([],[]))
        self.assertEqual(findNextClosestList(values, [2.0]), ([2.0],[1]))
        self.assertEqual(findNextClosestList(values, [1.0]), ([1.0],[0]))
    def testFew(self):
        values = numpy.linspace(10.0,20.0,num=11)
        self.assertEqual(findNextClosestList(values, []), ([10.0,20.0],[0,10]))
        self.assertEqual(findNextClosestList(values, [21.0]), ([],[]))
        self.assertEqual(findNextClosestList(values, [20.0]), ([20.0],[10]))
        self.assertEqual(findNextClosestList(values, [10.0]), ([10.0],[0]))
        self.assertEqual(findNextClosestList(values, [0.0]),  ([10.0],[0]))
        self.assertEqual(findNextClosestList(values, [0.0,10.0,10.5]),  ([10.0,11.0],[0,1]))
        self.assertEqual(findNextClosestList(values, [0.0,10.0,12.5]),  ([10.0,13.0],[0,3]))
    def testMany(self):
        N = 10000000
        values = numpy.linspace(10.0,20.0,num=N+1)
        vTarget = numpy.linspace(14.0,16.0,num=40001)
        self.assertEqual(findNextClosestList(values, []), ([10.0,20.0],[0,N]))
        vActual, idxActual = findNextClosestList(values, vTarget)
        self.assertEqual(len(vActual), len(vTarget))
        self.assertEqual(vActual[0], vTarget[0])
        self.assertEqual(vActual[-1], vTarget[-1])


if __name__ == '__main__':
    unittest.main()
