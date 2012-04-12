# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: find.py,v 1.3 2010/06/18 23:21:50 glinden Exp $
import unittest

def findNextClosest(array, v, idx1=0, idx2=-1):
    if len(array) == 0: return None
    if idx1 >= len(array): return None
    if (idx2 == -1) or (idx2 >= len(array)):
        idx2 = len(array)-1
    if idx1 > idx2: return None
    v1 = array[idx1]
    v2 = array[idx2]
    if v < v1: return idx1
    if v > v2: return None
    if v == v1: return idx1
    if v == v2: return idx2
    if idx2-idx1 <= 1: return idx2
    idx3 = int(idx1 + 0.5*(idx2-idx1))
    v3 = array[idx3]
    if v < v3:
        return findNextClosest(array, v, idx1, idx3)
    return findNextClosest(array, v, idx3, idx2)

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

if __name__ == '__main__':
    unittest.main()
