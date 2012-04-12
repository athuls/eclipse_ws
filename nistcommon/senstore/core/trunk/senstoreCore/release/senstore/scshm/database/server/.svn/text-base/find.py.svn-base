# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: find.py,v 1.5 2011/05/10 18:17:14 glinden Exp $

## \package scshm.database.server.find
#
# Utilities to search arrays.

## Finds the closest value v in a slice 
# of a monotonically increasing array.
#
# @param array  monotonically increasing array
# @param v      target value
# @param idx1   start index (optional, default is first element)
# @param idx2   end index (optional, default is last element)
# @return index of closest value in array
def findNextClosest(array, v, idx1=0, idx2=-1):
    if len(array) == 0: return None
    if idx1 >= len(array): return None
    if (idx2 == -1) or (idx2 >= len(array)):
        idx2 = len(array)-1
    if idx1 > idx2: return None
    v1 = array[idx1]
    v2 = array[idx2]
    if v <= v1: return idx1
    if v > v2: return None
    if v == v2: return idx2
    if idx2-idx1 <= 1:
        # The bracketing is no more than one sample apart
        return idx2
    # Look at center of current bracket
    idx3 = int(idx1 + 0.5*(idx2-idx1))
    v3 = array[idx3]
    if v < v3:
        return findNextClosest(array, v, idx1, idx3)
    return findNextClosest(array, v, idx3, idx2)

## Finds the closest matches in a monotonically increasing array.
#
# If vTarget is empty, the beginning and end of the list are returned.
#
# @param values  list (or array) of monotonically increasing values
# @param vTarget list (or array) of target values
# @return  closest index and value in the array (vActual,idxActual)
def findNextClosestList(values, vTarget):
    vActual = []
    idxActual = []
    n = len(values)
    if n == 0:
        # The signal is empty; return empty result
        return vActual, idxActual
    if len(vTarget) == 0:
        # Handle special case: empty request should return first and last sample
        if n == 1:
            return ([values[0]],[0])
        return ([values[0],values[-1]],[0,n-1])
    # Find first and last value of target range, for efficient bracketing
    idx1 = findNextClosest(values, vTarget[0])
    if idx1 == None:
        # No values larger than the first target value
        return vActual, idxActual
    idx3 = findNextClosest(values, vTarget[-1], idx1)
    if idx3 == None:
        idx3 = n - 1
    # Add first actual value
    vActual.append(values[idx1])
    idxActual.append(idx1)
    # Process remaining target values
    for v in vTarget[1:]:
        idx2 = findNextClosest(values, v, idx1, idx3)
        if idx2 == None:
            idx2 = n - 1
            vActual.append(values[idx2])
            idxActual.append(idx2)
            break
        if idx1 != idx2:
            # Found a new index
            vActual.append(values[idx2])
            idxActual.append(idx2)
            idx1 = idx2
    return vActual, idxActual
    