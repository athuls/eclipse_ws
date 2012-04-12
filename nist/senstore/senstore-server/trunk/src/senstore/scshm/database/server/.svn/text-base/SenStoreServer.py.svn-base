# Copyright (c) 2010 SC Solutions, Inc.
# All rights reserved
# $Id: server-tpl.py,v 1.5 2010/06/16 19:01:14 glinden Exp $
from __future__ import with_statement
import sys
import traceback
import logging
import threading
import os.path
import SenStore_h5db as h5database
import Ice
Ice.loadSlice(os.path.join(os.path.dirname(__file__),\
                           '..', 'SenStore.ice'))
import SenStore
import SenStore_h5db as h5db
import SenStore_pgdb as pgdb

class InspectorI(SenStore.Info.Inspector):
  ## Creates and initializes the servant.
  def __init__(self, ic):
    # Get properties
    props = ic.getProperties()
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = 'Inspector'
    self.classDefs = {}
    self.arrayDefs = {}
    self.signalDefs = {}
    # Define Structure class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Name'
    varInfo.descr     = 'Short name. '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = 'One-line description. '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Type'
    varInfo.descr     = 'Type of structure, e.g. suspension bridge. '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DistanceUnit'
    varInfo.descr     = 'Unit of distance '
    varInfo.varType   = 'Unit'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ForceUnit'
    varInfo.descr     = 'Unit of force '
    varInfo.varType   = 'Unit'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'WeightUnit'
    varInfo.descr     = 'Unit of weight '
    varInfo.varType   = 'Unit'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'Structure'
    info.descr = 'Structure, such as a bridge. '
    info.vars  = varInfoList
    self.classDefs['Structure'] = info
    # Define FEMDof class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = 'Structure '
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalId'
    varInfo.descr     = 'Local DOF number. '
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = 'Finite element node. '
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Direction'
    varInfo.descr     = 'Direction of motion. '
    varInfo.varType   = 'Quantity'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMDof'
    info.descr = 'Finite element model degrees of freedom. '
    info.vars  = varInfoList
    self.classDefs['FEMDof'] = info
    # Define FEMNodalMass class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass3'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass4'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass5'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass6'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNodalMass'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNodalMass'] = info
    # Define FEMNLElasticStrainStress class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNumber'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Strain'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Stress'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNLElasticStrainStress'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNLElasticStrainStress'] = info
    # Define FEMBoundary class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Ovalization'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Phi'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Rx'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Ry'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Rz'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Ux'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Uy'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Uz'
    varInfo.descr     = ''
    varInfo.varType   = 'BoundaryType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Warping'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMBoundary'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMBoundary'] = info
    # Define FEMSectionPipe class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Diameter'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thickness'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Torfac'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSectionPipe'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSectionPipe'] = info
    # Define FEMCoordSystem class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AX'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AY'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AZ'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BBY'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BX'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BZ'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mode'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P1'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P2'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P3'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Type'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Xorigin'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Yorigin'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Zorigin'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMCoordSystem'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMCoordSystem'] = info
    # Define FEMNode class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'System'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMCoordSystem'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'X'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Y'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Z'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNode'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNode'] = info
    # Define FEMTruss class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Epsin'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Gapwidth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionArea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTruss'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTruss'] = info
    # Define FEMTimeFunctionData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DataTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GMRecordID'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeValue'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTimeFunctionData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTimeFunctionData'] = info
    # Define FEMPlasticMlMaterials class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'E'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Hardening'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NU'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TREF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPlasticMlMaterials'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPlasticMlMaterials'] = info
    # Define FEMPlateGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IniStrain'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPlateGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPlateGroup'] = info
    # Define FEMBeam class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AuxNode'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EndRelease'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Epsin'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IRigidEnd'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'JRigidEnd'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Subdivision'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMBeam'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMBeam'] = info
    # Define FEMCurvMomentData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Curvature'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'CurvMomentID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMCurvMomentData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMCurvMomentData'] = info
    # Define FEMPropertysets class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'C'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'K'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'M'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NC'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NK'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NM'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Nonlinear'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertysetID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'S'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPropertysets'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPropertysets'] = info
    # Define FEMOrthotropicMaterial class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GAB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GAC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GBC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUAB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUAC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUBC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMOrthotropicMaterial'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMOrthotropicMaterial'] = info
    # Define FEMAppliedLoads class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AppliedLoadNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LoadID'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LoadType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SiteType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMAppliedLoads'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMAppliedLoads'] = info
    # Define FEMThermoOrthData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHAA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHAB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHAC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GAB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GAC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GBC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUAB'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUAC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NUBC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Theta'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThermoOrthData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThermoOrthData'] = info
    # Define FEMContactPairs class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContactorSurf'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContGroupID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContPair'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'FContactor'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Friction'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'FTarget'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'HeatTransf'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TargetSurf'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMContactPairs'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMContactPairs'] = info
    # Define FEMGeneral class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixSet'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAmount'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMGeneral'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMGeneral'] = info
    # Define FEMBeamNode class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IniStrain'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MC'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MCrigidity'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'REmultiplyer'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'REtype'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RINT'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SINT'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TINT'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMBeamNode'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMBeamNode'] = info
    # Define FEMSectionRect class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Height'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IShear'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Torfac'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Width'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSectionRect'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSectionRect'] = info
    # Define FEMBeamLoad class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DeformDepend'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DirectFilter'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Face'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMBeamLoad'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMBeamLoad'] = info
    # Define FEMLoadMassProportional class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AX'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AY'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AZ'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LoadID'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Magnitude'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = ''
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMLoadMassProportional'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMLoadMassProportional'] = info
    # Define FEMLink class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MasterNode'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RLID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SlaveNode'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMLink'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMLink'] = info
    # Define FEMAxesNode class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AxNodeID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMAxesNode'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMAxesNode'] = info
    # Define FEMNMTimeMass class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertyID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeValue'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNMTimeMass'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNMTimeMass'] = info
    # Define FEMAppliedDisplacement class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Direction'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Factor'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMAppliedDisplacement'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMAppliedDisplacement'] = info
    # Define FEMTimeFunctions class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTimeFunctions'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTimeFunctions'] = info
    # Define FEMForceStrainData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Force'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ForceAxID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Strain'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMForceStrainData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMForceStrainData'] = info
    # Define FEMSkewDOF class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SkewSystemID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSkewDOF'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSkewDOF'] = info
    # Define FEMSectionI class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Height'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick3'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Torfac'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Width1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Width2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSectionI'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSectionI'] = info
    # Define FEMPlasticBilinearMaterial class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Alpha'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'E'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EPA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ET'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Hardening'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NU'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TRef'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Yield'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPlasticBilinearMaterial'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPlasticBilinearMaterial'] = info
    # Define FEMMTForceData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Force'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MomentRID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TwistMomentID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMTForceData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMTForceData'] = info
    # Define FEMShellPressure class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DeformDepend'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DirectFilter'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Face'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Nodaux'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P3'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P4'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellPressure'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellPressure'] = info
    # Define FEMMatrices class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Lump'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ND'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NS'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMatrices'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMatrices'] = info
    # Define FEMDamping class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BETA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMDamping'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMDamping'] = info
    # Define FEMMaterial class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialType'
    varInfo.descr     = ''
    varInfo.varType   = 'MaterialType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = ''
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMaterial'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMaterial'] = info
    # Define FEMMatrixData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Coeff'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ColumnIndex'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RowIndex'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMatrixData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMatrixData'] = info
    # Define FEMShellAxesOrtho class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALFA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AxOrthoID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LineID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellAxesOrtho'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellAxesOrtho'] = info
    # Define FEMEndreleases class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'EndRelease'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment1'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment2'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment3'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment4'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment5'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment6'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMEndreleases'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMEndreleases'] = info
    # Define FEMTrussGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GAPS'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IniStrain'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionArea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTrussGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTrussGroup'] = info
    # Define FEMInitialTemperature class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Temperature'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMInitialTemperature'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMInitialTemperature'] = info
    # Define FEMThermoIsoMaterials class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TREF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThermoIsoMaterials'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThermoIsoMaterials'] = info
    # Define FEMThermoIsoData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ALPHA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'E'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NU'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Theta'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThermoIsoData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThermoIsoData'] = info
    # Define FEMContactGroup3 class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContGroupID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Depth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Forces'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Friction'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IniPenetration'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeToNode'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Offset'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PenetrAlgorithm'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Tied'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TiedOffset'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Tolerance'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Tractions'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMContactGroup3'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMContactGroup3'] = info
    # Define FEMNLElasticMaterials class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Dcurve'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNLElasticMaterials'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNLElasticMaterials'] = info
    # Define FEMPlate class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Flex11'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Flex12'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Flex22'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Meps11'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Meps12'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Meps22'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPlate'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPlate'] = info
    # Define FEMIsoBeam class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AUX'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Epaxl'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Ephoop'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N4'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAmount'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMIsoBeam'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMIsoBeam'] = info
    # Define FEMAppliedConcentratedLoad class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Direction'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Factor'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAux'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeID'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMAppliedConcentratedLoad'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMAppliedConcentratedLoad'] = info
    # Define FEMTwoDSolidGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AuxNode'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Subtype'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTwoDSolidGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTwoDSolidGroup'] = info
    # Define FEMGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GroupType'
    varInfo.descr     = ''
    varInfo.varType   = 'GroupType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = ''
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMGroup'] = info
    # Define FEMProperties class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertyID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertyType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Rupture'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'XC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'XN'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMProperties'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMProperties'] = info
    # Define FEMThreeDSolidGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThreeDSolidGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThreeDSolidGroup'] = info
    # Define FEMThreeDSolid class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Maxes'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N10'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N11'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N12'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N13'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N14'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N15'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N16'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N17'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N18'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N19'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N20'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N21'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N22'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N23'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N24'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N25'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N26'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N27'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N4'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N5'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N6'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N7'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N8'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N9'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAmount'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThreeDSolid'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThreeDSolid'] = info
    # Define FEMSectionProp class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Area'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Rinertia'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Sarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Sinertia'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Tarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Tinertia'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSectionProp'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSectionProp'] = info
    # Define FEMElasticMaterial class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Alpha'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'E'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NU'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMElasticMaterial'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMElasticMaterial'] = info
    # Define FEMPoints class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PointID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SystemID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'X'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Y'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Z'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPoints'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPoints'] = info
    # Define FEMThermoOrthMaterials class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TREF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMThermoOrthMaterials'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMThermoOrthMaterials'] = info
    # Define FEMConstraints class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ConstraintID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SlaveDOF'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SlaveNode'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMConstraints'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMConstraints'] = info
    # Define FEMMCrigidities class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AcurveType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Alpha'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AxialCF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BcurveType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BendingCF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Beta'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Density'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ForceAxID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Hardening'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MassArea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MassR'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MassS'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MassT'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MomentRID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MomentSID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MomentTID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RigidityID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TcurveType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TorsionCF'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMCrigidities'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMCrigidities'] = info
    # Define FEMSkeySysNode class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SkewSystemID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSkeySysNode'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSkeySysNode'] = info
    # Define FEMIsoBeamGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'IniStrain'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMIsoBeamGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMIsoBeamGroup'] = info
    # Define FEMShellDOF class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'DOFnumber'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'VectorID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellDOF'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellDOF'] = info
    # Define FEMCrossSections class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionType'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMCrossSections'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMCrossSections'] = info
    # Define FEMTwistMomentData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Moment'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Twist'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TwistMomentID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTwistMomentData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTwistMomentData'] = info
    # Define FEMShell class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N4'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N5'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N6'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N7'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N8'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N9'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAmount'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T3'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T4'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T5'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T6'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T7'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T8'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'T9'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShell'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShell'] = info
    # Define FEMNTNContact class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContactorNode'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContGroupID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContPair'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PrintRes'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SaveRes'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TargetNode'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TargetNx'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TargetNy'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TargetNz'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNTNContact'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNTNContact'] = info
    # Define FEMShellLayer class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LayerNumber'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PThick'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellLayer'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellLayer'] = info
    # Define FEMSkewSysAngles class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PHI'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SkewSystemID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'THETA'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'XSI'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSkewSysAngles'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSkewSysAngles'] = info
    # Define FEMGroundMotionRecord class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GMRecordID'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'GMRecordName'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMGroundMotionRecord'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMGroundMotionRecord'] = info
    # Define FEMGeneralGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixSet'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SkewSystem'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMGeneralGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMGeneralGroup'] = info
    # Define FEMTwoDSolid class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Bet'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N4'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N5'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N6'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N7'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N8'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N9'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NodeAmount'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMTwoDSolid'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMTwoDSolid'] = info
    # Define FEMAppliedTemperature class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ArrivalTime'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Factor'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmbr'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TimeFunctionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMAppliedTemperature'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMAppliedTemperature'] = info
    # Define FEMMatrixSets class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Damping'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Mass'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MatrixSetID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Stiffness'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Stress'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMatrixSets'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMatrixSets'] = info
    # Define FEMConstraintCoef class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Coefficient'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ConstraintID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MasterDOF'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MasterNode'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMConstraintCoef'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMConstraintCoef'] = info
    # Define FEMSectionBox class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Height'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TC'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick1'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thick2'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Torfac'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TSarea'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Width'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSectionBox'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSectionBox'] = info
    # Define FEMNKDisplForce class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Force'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertyID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMNKDisplForce'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMNKDisplForce'] = info
    # Define FEMPlasticStrainStress class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MaterialID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNumber'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Strain'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Stress'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMPlasticStrainStress'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMPlasticStrainStress'] = info
    # Define FEMShellAxesOrthoData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AxOrthoID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellAxesOrthoData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellAxesOrthoData'] = info
    # Define FEMGeneralNode class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LocalNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMGeneralNode'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMGeneralNode'] = info
    # Define FEMStrLines class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'LineID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P1'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'P2'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMStrLines'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMStrLines'] = info
    # Define FEMContactSurface class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContGroupID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContSegment'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ContSurface'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N3'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N4'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMContactSurface'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMContactSurface'] = info
    # Define FEMMCForceData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'CurvMomentID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Force'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'MomentSTID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMMCForceData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMMCForceData'] = info
    # Define FEMSpring class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AX'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AY'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'AZ'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ElementID'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ID1'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'ID2'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N1'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'N2'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertySet'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'RecordNmb'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Save'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TBirth'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'TDeath'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSpring'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSpring'] = info
    # Define FEMSpringGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Bolt'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Nonlinear'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'PropertySet'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SkewSystem'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMSpringGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMSpringGroup'] = info
    # Define FEMShellGroup class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Displacement'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Group'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMGroup'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Material'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMMaterial'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'NLayers'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Result'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SectionResult'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'StressReference'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Thickness'
    varInfo.descr     = ''
    varInfo.varType   = 'float64'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'FEMShellGroup'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['FEMShellGroup'] = info
    # Define DaqUnit class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Model'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Identifier'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'DaqUnit'
    info.descr = 'Data acquisition unit (e.g. Narada node). '
    info.vars  = varInfoList
    self.classDefs['DaqUnit'] = info
    # Define DaqUnitChannel class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Unit'
    varInfo.descr     = 'Corresponding data acquisition unit. '
    varInfo.varType   = 'DaqUnit'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Number'
    varInfo.descr     = 'Local channel number. '
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'DaqUnitChannel'
    info.descr = 'Data acquisition unit channel. '
    info.vars  = varInfoList
    self.classDefs['DaqUnitChannel'] = info
    # Define Sensor class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Type'
    varInfo.descr     = ''
    varInfo.varType   = 'SensorType'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Model'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Identifier'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'Sensor'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['Sensor'] = info
    # Define Transducer class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Model'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Identifier'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'Transducer'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['Transducer'] = info
    # Define Experiment class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Frequency'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Duration'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'BufferData'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'Experiment'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['Experiment'] = info
    # Define Cycle class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Time'
    varInfo.descr     = ''
    varInfo.varType   = 'timestamp'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Experiment'
    varInfo.descr     = ''
    varInfo.varType   = 'Experiment'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'Cycle'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['Cycle'] = info
    # Define SensorTimeData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = ''
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Sensor'
    varInfo.descr     = ''
    varInfo.varType   = 'Sensor'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Channel'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'StartTime'
    varInfo.descr     = ''
    varInfo.varType   = 'timestamp'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Status'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'SensorTimeData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['SensorTimeData'] = info
    # Define TransducerTimeData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Transducer'
    varInfo.descr     = ''
    varInfo.varType   = 'Transducer'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Sensor'
    varInfo.descr     = ''
    varInfo.varType   = 'Sensor'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Node'
    varInfo.descr     = ''
    varInfo.varType   = 'FEMNode'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Orientation'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Amplification'
    varInfo.descr     = ''
    varInfo.varType   = 'int32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Channel'
    varInfo.descr     = ''
    varInfo.varType   = 'int16'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Filter'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'StartTime'
    varInfo.descr     = ''
    varInfo.varType   = 'timestamp'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Status'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'TransducerTimeData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['TransducerTimeData'] = info
    # Define ExperimentStructureData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Experiment'
    varInfo.descr     = ''
    varInfo.varType   = 'Experiment'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = ''
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'StartTime'
    varInfo.descr     = ''
    varInfo.varType   = 'timestamp'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Status'
    varInfo.descr     = ''
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'ExperimentStructureData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['ExperimentStructureData'] = info
    # Define TransducerCycleData class info
    varInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Transducer'
    varInfo.descr     = ''
    varInfo.varType   = 'Transducer'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Cycle'
    varInfo.descr     = ''
    varInfo.varType   = 'Cycle'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'SoftwareScaling'
    varInfo.descr     = ''
    varInfo.varType   = 'float32'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    info = SenStore.Info.ClassInfo()
    info.clsType = SenStore.ClassType.ClassTypeCLASS
    info.name  = 'TransducerCycleData'
    info.descr = ''
    info.vars  = varInfoList
    self.classDefs['TransducerCycleData'] = info
    # Define MappingMatrix class info
    varInfoList = []
    axesInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Structure'
    varInfo.descr     = 'Parent structure '
    varInfo.varType   = 'Structure'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Name'
    varInfo.descr     = 'Short name '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = 'Description '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'OutputQuantity'
    varInfo.descr     = 'Output quantity '
    varInfo.varType   = 'Quantity'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'InputQuantity'
    varInfo.descr     = 'Input quantity '
    varInfo.varType   = 'Quantity'
    varInfo.className = 'enumref'
    varInfoList.append(varInfo)
    axisInfo = SenStore.Info.VarInfo()
    axisInfo.name      = 'OutputNode'
    axisInfo.descr     = 'Output node '
    axisInfo.varType   = 'FEMNode'
    axisInfo.className = 'ref'
    axesInfoList.append(axisInfo)
    axisInfo = SenStore.Info.VarInfo()
    axisInfo.name      = 'InputNode'
    axisInfo.descr     = 'Input node '
    axisInfo.varType   = 'FEMNode'
    axisInfo.className = 'ref'
    axesInfoList.append(axisInfo)
    info = SenStore.Info.ArrayInfo()
    info.clsType = SenStore.ClassType.ClassTypeARRAY
    info.name     = 'MappingMatrix'
    info.descr    = 'Linear mapping between two node-related quantities. '
    info.dataType = 'float64'
    info.vars     = varInfoList
    info.axes     = axesInfoList
    self.arrayDefs['MappingMatrix'] = info
    # Define DaqUnitChannelData class info
    varInfoList = []
    axesInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Channel'
    varInfo.descr     = 'Parent sensor '
    varInfo.varType   = 'DaqUnitChannel'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    axisInfo = SenStore.Info.VarInfo()
    axisInfo.name      = 'SubChannels'
    axisInfo.descr     = 'Subchannels '
    axisInfo.varType   = 'Quantity'
    axisInfo.className = 'enumref'
    axesInfoList.append(axisInfo)
    info = SenStore.Info.SignalInfo()
    info.clsType = SenStore.ClassType.ClassTypeSIGNAL
    info.name     = 'DaqUnitChannelData'
    info.descr    = 'Data acquisition unit raw channel data. '
    info.dataType = 'int32'
    info.vars     = varInfoList
    info.axes     = axesInfoList
    self.signalDefs['DaqUnitChannelData'] = info
    # Define AccelMeas class info
    varInfoList = []
    axesInfoList = []
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Sensor'
    varInfo.descr     = 'Parent sensor '
    varInfo.varType   = 'Sensor'
    varInfo.className = 'ref'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Name'
    varInfo.descr     = 'Short name '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    varInfo = SenStore.Info.VarInfo()
    varInfo.name      = 'Description'
    varInfo.descr     = 'Description '
    varInfo.varType   = 'string'
    varInfo.className = 'var'
    varInfoList.append(varInfo)
    axisInfo = SenStore.Info.VarInfo()
    axisInfo.name      = 'Direction'
    axisInfo.descr     = 'Directions '
    axisInfo.varType   = 'Quantity'
    axisInfo.className = 'enumref'
    axesInfoList.append(axisInfo)
    info = SenStore.Info.SignalInfo()
    info.clsType = SenStore.ClassType.ClassTypeSIGNAL
    info.name     = 'AccelMeas'
    info.descr    = 'Multi-axis accelerometer measurement data. '
    info.dataType = 'float32'
    info.vars     = varInfoList
    info.axes     = axesInfoList
    self.signalDefs['AccelMeas'] = info
    # Create dictionary with all class/array/signal types
    self.allDefs = {}
    self.allDefs.update(self.classDefs)
    self.allDefs.update(self.arrayDefs)
    self.allDefs.update(self.signalDefs)

  ## Activates the servant.
  #
  # @param adapter  Ice adapter
  def activate(self, adapter):
    # Remember adapter, for creating servants later on
    self._adapter = adapter
    # Add myself to the adapter
    return adapter.add(self, self._id)

  def getClassNames(self, clsTypes, current=None):
    names = []
    if len(clsTypes) == 0:
      clsTypes = [SenStore.ClassType.ClassTypeCLASS,
                  SenStore.ClassType.ClassTypeARRAY,
                  SenStore.ClassType.ClassTypeSIGNAL]
    if SenStore.ClassType.ClassTypeCLASS in clsTypes:
      names += self.classDefs.keys()
    if SenStore.ClassType.ClassTypeARRAY in clsTypes:
      names += self.arrayDefs.keys()
    if SenStore.ClassType.ClassTypeSIGNAL in clsTypes:
      names += self.signalDefs.keys()
    return names

  def getClassInfo(self, name, current=None):
    return self.allDefs[name]


## Implementation of Structure servant.
class StructureI(SenStore.Structure):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id Structure object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return StructureFields object
  def getFields(self, current=None):
    logging.debug('Structure[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getStructureFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Name
  # - Description
  # - Type
  # - DistanceUnit
  # - ForceUnit
  # - WeightUnit
  #
  # @param fields updated fields (StructureFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('Structure[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setStructureFields(fields, fieldNames, current)


## Implementation of FEMDof servant.
class FEMDofI(SenStore.FEMDof):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMDof object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMDofFields object
  def getFields(self, current=None):
    logging.debug('FEMDof[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMDofFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Structure
  # - LocalId
  # - Node
  # - Direction
  #
  # @param fields updated fields (FEMDofFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMDof[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMDofFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMNodalMass servant.
class FEMNodalMassI(SenStore.FEMNodalMass):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNodalMass object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNodalMassFields object
  def getFields(self, current=None):
    logging.debug('FEMNodalMass[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNodalMassFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - Mass1
  # - Mass2
  # - Mass3
  # - Mass4
  # - Mass5
  # - Mass6
  # - Node
  #
  # @param fields updated fields (FEMNodalMassFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNodalMass[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNodalMassFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMNLElasticStrainStress servant.
class FEMNLElasticStrainStressI(SenStore.FEMNLElasticStrainStress):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNLElasticStrainStress object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNLElasticStrainStressFields object
  def getFields(self, current=None):
    logging.debug('FEMNLElasticStrainStress[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNLElasticStrainStressFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - MaterialID
  # - RecordNumber
  # - Strain
  # - Stress
  #
  # @param fields updated fields (FEMNLElasticStrainStressFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNLElasticStrainStress[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNLElasticStrainStressFields(fields, fieldNames, current)


## Implementation of FEMBoundary servant.
class FEMBoundaryI(SenStore.FEMBoundary):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMBoundary object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMBoundaryFields object
  def getFields(self, current=None):
    logging.debug('FEMBoundary[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMBoundaryFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Node
  # - Ovalization
  # - Phi
  # - Rx
  # - Ry
  # - Rz
  # - Ux
  # - Uy
  # - Uz
  # - Warping
  #
  # @param fields updated fields (FEMBoundaryFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMBoundary[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMBoundaryFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMSectionPipe servant.
class FEMSectionPipeI(SenStore.FEMSectionPipe):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSectionPipe object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSectionPipeFields object
  def getFields(self, current=None):
    logging.debug('FEMSectionPipe[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSectionPipeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Diameter
  # - SC
  # - SectionID
  # - SSarea
  # - TC
  # - Thickness
  # - Torfac
  # - TSarea
  #
  # @param fields updated fields (FEMSectionPipeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSectionPipe[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSectionPipeFields(fields, fieldNames, current)


## Implementation of FEMCoordSystem servant.
class FEMCoordSystemI(SenStore.FEMCoordSystem):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMCoordSystem object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMCoordSystemFields object
  def getFields(self, current=None):
    logging.debug('FEMCoordSystem[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMCoordSystemFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AX
  # - AY
  # - AZ
  # - BBY
  # - BX
  # - BZ
  # - Description
  # - Mode
  # - P1
  # - P2
  # - P3
  # - Type
  # - Xorigin
  # - Yorigin
  # - Zorigin
  # - LocalID
  #
  # @param fields updated fields (FEMCoordSystemFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMCoordSystem[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMCoordSystemFields(fields, fieldNames, current)


## Implementation of FEMNode servant.
class FEMNodeI(SenStore.FEMNode):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNode object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNodeFields object
  def getFields(self, current=None):
    logging.debug('FEMNode[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNodeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - System
  # - X
  # - Y
  # - Z
  # - LocalID
  #
  # @param fields updated fields (FEMNodeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNode[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNodeFields(fields, fieldNames, current)

  ## Gets the servant of the refered System object.
  def getSystem(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMCoordSystem(fields.mSystem, current)


## Implementation of FEMTruss servant.
class FEMTrussI(SenStore.FEMTruss):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTruss object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTrussFields object
  def getFields(self, current=None):
    logging.debug('FEMTruss[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTrussFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - ElementID
  # - Epsin
  # - Gapwidth
  # - Group
  # - Material
  # - N1
  # - N2
  # - RecordNmb
  # - Save
  # - SectionArea
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMTrussFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTruss[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTrussFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)


## Implementation of FEMTimeFunctionData servant.
class FEMTimeFunctionDataI(SenStore.FEMTimeFunctionData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTimeFunctionData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTimeFunctionDataFields object
  def getFields(self, current=None):
    logging.debug('FEMTimeFunctionData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTimeFunctionDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - DataTime
  # - GMRecordID
  # - RecordNmb
  # - TimeFunctionID
  # - TimeValue
  #
  # @param fields updated fields (FEMTimeFunctionDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTimeFunctionData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTimeFunctionDataFields(fields, fieldNames, current)


## Implementation of FEMPlasticMlMaterials servant.
class FEMPlasticMlMaterialsI(SenStore.FEMPlasticMlMaterials):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPlasticMlMaterials object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPlasticMlMaterialsFields object
  def getFields(self, current=None):
    logging.debug('FEMPlasticMlMaterials[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPlasticMlMaterialsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ALPHA
  # - Density
  # - E
  # - Hardening
  # - MaterialID
  # - NU
  # - TREF
  #
  # @param fields updated fields (FEMPlasticMlMaterialsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPlasticMlMaterials[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPlasticMlMaterialsFields(fields, fieldNames, current)


## Implementation of FEMPlateGroup servant.
class FEMPlateGroupI(SenStore.FEMPlateGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPlateGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPlateGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMPlateGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPlateGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Group
  # - IniStrain
  # - MaterialID
  # - Result
  #
  # @param fields updated fields (FEMPlateGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPlateGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPlateGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMBeam servant.
class FEMBeamI(SenStore.FEMBeam):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMBeam object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMBeamFields object
  def getFields(self, current=None):
    logging.debug('FEMBeam[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMBeamFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AuxNode
  # - Description
  # - ElementID
  # - EndRelease
  # - Epsin
  # - Group
  # - IRigidEnd
  # - JRigidEnd
  # - MaterialID
  # - Node1
  # - Node2
  # - RecordNmb
  # - Save
  # - SectionID
  # - Subdivision
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMBeamFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMBeam[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMBeamFields(fields, fieldNames, current)

  ## Gets the servant of the refered AuxNode object.
  def getAuxNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mAuxNode, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Node1 object.
  def getNode1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode1, current)

  ## Gets the servant of the refered Node2 object.
  def getNode2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode2, current)


## Implementation of FEMCurvMomentData servant.
class FEMCurvMomentDataI(SenStore.FEMCurvMomentData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMCurvMomentData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMCurvMomentDataFields object
  def getFields(self, current=None):
    logging.debug('FEMCurvMomentData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMCurvMomentDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Curvature
  # - CurvMomentID
  # - Moment
  # - RecordNmb
  #
  # @param fields updated fields (FEMCurvMomentDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMCurvMomentData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMCurvMomentDataFields(fields, fieldNames, current)


## Implementation of FEMPropertysets servant.
class FEMPropertysetsI(SenStore.FEMPropertysets):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPropertysets object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPropertysetsFields object
  def getFields(self, current=None):
    logging.debug('FEMPropertysets[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPropertysetsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - C
  # - Description
  # - K
  # - M
  # - NC
  # - NK
  # - NM
  # - Nonlinear
  # - PropertysetID
  # - S
  #
  # @param fields updated fields (FEMPropertysetsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPropertysets[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPropertysetsFields(fields, fieldNames, current)


## Implementation of FEMOrthotropicMaterial servant.
class FEMOrthotropicMaterialI(SenStore.FEMOrthotropicMaterial):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMOrthotropicMaterial object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMOrthotropicMaterialFields object
  def getFields(self, current=None):
    logging.debug('FEMOrthotropicMaterial[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMOrthotropicMaterialFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Density
  # - EA
  # - EB
  # - EC
  # - GAB
  # - GAC
  # - GBC
  # - Material
  # - NUAB
  # - NUAC
  # - NUBC
  #
  # @param fields updated fields (FEMOrthotropicMaterialFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMOrthotropicMaterial[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMOrthotropicMaterialFields(fields, fieldNames, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)


## Implementation of FEMAppliedLoads servant.
class FEMAppliedLoadsI(SenStore.FEMAppliedLoads):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMAppliedLoads object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMAppliedLoadsFields object
  def getFields(self, current=None):
    logging.debug('FEMAppliedLoads[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMAppliedLoadsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AppliedLoadNmb
  # - ArrivalTime
  # - LoadID
  # - LoadType
  # - SiteType
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMAppliedLoadsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMAppliedLoads[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMAppliedLoadsFields(fields, fieldNames, current)


## Implementation of FEMThermoOrthData servant.
class FEMThermoOrthDataI(SenStore.FEMThermoOrthData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThermoOrthData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThermoOrthDataFields object
  def getFields(self, current=None):
    logging.debug('FEMThermoOrthData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThermoOrthDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ALPHAA
  # - ALPHAB
  # - ALPHAC
  # - EA
  # - EB
  # - EC
  # - GAB
  # - GAC
  # - GBC
  # - MaterialID
  # - NUAB
  # - NUAC
  # - NUBC
  # - RecordNmb
  # - Theta
  #
  # @param fields updated fields (FEMThermoOrthDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThermoOrthData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThermoOrthDataFields(fields, fieldNames, current)


## Implementation of FEMContactPairs servant.
class FEMContactPairsI(SenStore.FEMContactPairs):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMContactPairs object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMContactPairsFields object
  def getFields(self, current=None):
    logging.debug('FEMContactPairs[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMContactPairsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ContactorSurf
  # - ContGroupID
  # - ContPair
  # - FContactor
  # - Friction
  # - FTarget
  # - HeatTransf
  # - RecordNmb
  # - TargetSurf
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMContactPairsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMContactPairs[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMContactPairsFields(fields, fieldNames, current)


## Implementation of FEMGeneral servant.
class FEMGeneralI(SenStore.FEMGeneral):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMGeneral object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMGeneralFields object
  def getFields(self, current=None):
    logging.debug('FEMGeneral[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMGeneralFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - ElementID
  # - Group
  # - MatrixSet
  # - NodeAmount
  # - RecordNmb
  # - Save
  #
  # @param fields updated fields (FEMGeneralFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMGeneral[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMGeneralFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMBeamNode servant.
class FEMBeamNodeI(SenStore.FEMBeamNode):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMBeamNode object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMBeamNodeFields object
  def getFields(self, current=None):
    logging.debug('FEMBeamNode[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMBeamNodeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Group
  # - IniStrain
  # - MaterialID
  # - MC
  # - MCrigidity
  # - REmultiplyer
  # - Result
  # - REtype
  # - RINT
  # - SectionID
  # - SINT
  # - TINT
  #
  # @param fields updated fields (FEMBeamNodeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMBeamNode[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMBeamNodeFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMSectionRect servant.
class FEMSectionRectI(SenStore.FEMSectionRect):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSectionRect object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSectionRectFields object
  def getFields(self, current=None):
    logging.debug('FEMSectionRect[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSectionRectFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Height
  # - IShear
  # - SC
  # - SectionID
  # - SSarea
  # - TC
  # - Torfac
  # - TSarea
  # - Width
  #
  # @param fields updated fields (FEMSectionRectFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSectionRect[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSectionRectFields(fields, fieldNames, current)


## Implementation of FEMBeamLoad servant.
class FEMBeamLoadI(SenStore.FEMBeamLoad):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMBeamLoad object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMBeamLoadFields object
  def getFields(self, current=None):
    logging.debug('FEMBeamLoad[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMBeamLoadFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ArrivalTime
  # - DeformDepend
  # - DirectFilter
  # - ElementID
  # - Face
  # - Group
  # - P1
  # - P2
  # - RecordNmb
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMBeamLoadFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMBeamLoad[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMBeamLoadFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMLoadMassProportional servant.
class FEMLoadMassProportionalI(SenStore.FEMLoadMassProportional):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMLoadMassProportional object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMLoadMassProportionalFields object
  def getFields(self, current=None):
    logging.debug('FEMLoadMassProportional[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMLoadMassProportionalFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AX
  # - AY
  # - AZ
  # - LoadID
  # - Magnitude
  # - Structure
  #
  # @param fields updated fields (FEMLoadMassProportionalFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMLoadMassProportional[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMLoadMassProportionalFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)


## Implementation of FEMLink servant.
class FEMLinkI(SenStore.FEMLink):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMLink object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMLinkFields object
  def getFields(self, current=None):
    logging.debug('FEMLink[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMLinkFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - Displacement
  # - MasterNode
  # - RLID
  # - SlaveNode
  #
  # @param fields updated fields (FEMLinkFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMLink[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMLinkFields(fields, fieldNames, current)

  ## Gets the servant of the refered MasterNode object.
  def getMasterNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mMasterNode, current)

  ## Gets the servant of the refered SlaveNode object.
  def getSlaveNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mSlaveNode, current)


## Implementation of FEMAxesNode servant.
class FEMAxesNodeI(SenStore.FEMAxesNode):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMAxesNode object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMAxesNodeFields object
  def getFields(self, current=None):
    logging.debug('FEMAxesNode[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMAxesNodeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AxNodeID
  # - Group
  # - Node1
  # - Node2
  # - Node3
  # - RecordNmb
  #
  # @param fields updated fields (FEMAxesNodeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMAxesNode[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMAxesNodeFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Node1 object.
  def getNode1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode1, current)

  ## Gets the servant of the refered Node2 object.
  def getNode2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode2, current)

  ## Gets the servant of the refered Node3 object.
  def getNode3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode3, current)


## Implementation of FEMNMTimeMass servant.
class FEMNMTimeMassI(SenStore.FEMNMTimeMass):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNMTimeMass object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNMTimeMassFields object
  def getFields(self, current=None):
    logging.debug('FEMNMTimeMass[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNMTimeMassFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Mass
  # - PropertyID
  # - RecordNmb
  # - TimeValue
  #
  # @param fields updated fields (FEMNMTimeMassFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNMTimeMass[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNMTimeMassFields(fields, fieldNames, current)


## Implementation of FEMAppliedDisplacement servant.
class FEMAppliedDisplacementI(SenStore.FEMAppliedDisplacement):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMAppliedDisplacement object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMAppliedDisplacementFields object
  def getFields(self, current=None):
    logging.debug('FEMAppliedDisplacement[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMAppliedDisplacementFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ArrivalTime
  # - Description
  # - Direction
  # - Factor
  # - Node
  # - RecordNmb
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMAppliedDisplacementFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMAppliedDisplacement[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMAppliedDisplacementFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMTimeFunctions servant.
class FEMTimeFunctionsI(SenStore.FEMTimeFunctions):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTimeFunctions object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTimeFunctionsFields object
  def getFields(self, current=None):
    logging.debug('FEMTimeFunctions[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTimeFunctionsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMTimeFunctionsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTimeFunctions[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTimeFunctionsFields(fields, fieldNames, current)


## Implementation of FEMForceStrainData servant.
class FEMForceStrainDataI(SenStore.FEMForceStrainData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMForceStrainData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMForceStrainDataFields object
  def getFields(self, current=None):
    logging.debug('FEMForceStrainData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMForceStrainDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Force
  # - ForceAxID
  # - RecordNmb
  # - Strain
  #
  # @param fields updated fields (FEMForceStrainDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMForceStrainData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMForceStrainDataFields(fields, fieldNames, current)


## Implementation of FEMSkewDOF servant.
class FEMSkewDOFI(SenStore.FEMSkewDOF):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSkewDOF object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSkewDOFFields object
  def getFields(self, current=None):
    logging.debug('FEMSkewDOF[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSkewDOFFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - Node
  # - SkewSystemID
  #
  # @param fields updated fields (FEMSkewDOFFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSkewDOF[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSkewDOFFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMSectionI servant.
class FEMSectionII(SenStore.FEMSectionI):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSectionI object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSectionIFields object
  def getFields(self, current=None):
    logging.debug('FEMSectionI[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSectionIFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Height
  # - SC
  # - SectionID
  # - SSarea
  # - TC
  # - Thick1
  # - Thick2
  # - Thick3
  # - Torfac
  # - TSarea
  # - Width1
  # - Width2
  #
  # @param fields updated fields (FEMSectionIFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSectionI[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSectionIFields(fields, fieldNames, current)


## Implementation of FEMPlasticBilinearMaterial servant.
class FEMPlasticBilinearMaterialI(SenStore.FEMPlasticBilinearMaterial):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPlasticBilinearMaterial object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPlasticBilinearMaterialFields object
  def getFields(self, current=None):
    logging.debug('FEMPlasticBilinearMaterial[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPlasticBilinearMaterialFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Alpha
  # - Density
  # - E
  # - EPA
  # - ET
  # - Hardening
  # - Material
  # - NU
  # - TRef
  # - Yield
  #
  # @param fields updated fields (FEMPlasticBilinearMaterialFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPlasticBilinearMaterial[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPlasticBilinearMaterialFields(fields, fieldNames, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)


## Implementation of FEMMTForceData servant.
class FEMMTForceDataI(SenStore.FEMMTForceData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMTForceData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMTForceDataFields object
  def getFields(self, current=None):
    logging.debug('FEMMTForceData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMTForceDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Force
  # - MomentRID
  # - RecordNmb
  # - TwistMomentID
  #
  # @param fields updated fields (FEMMTForceDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMTForceData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMTForceDataFields(fields, fieldNames, current)


## Implementation of FEMShellPressure servant.
class FEMShellPressureI(SenStore.FEMShellPressure):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellPressure object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellPressureFields object
  def getFields(self, current=None):
    logging.debug('FEMShellPressure[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellPressureFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ArrivalTime
  # - DeformDepend
  # - Description
  # - DirectFilter
  # - ElementID
  # - Face
  # - Group
  # - Nodaux
  # - P1
  # - P2
  # - P3
  # - P4
  # - RecordNmb
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMShellPressureFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellPressure[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellPressureFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMMatrices servant.
class FEMMatricesI(SenStore.FEMMatrices):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMatrices object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMatricesFields object
  def getFields(self, current=None):
    logging.debug('FEMMatrices[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMatricesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - Lump
  # - MatrixID
  # - MatrixType
  # - ND
  # - NS
  #
  # @param fields updated fields (FEMMatricesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMatrices[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMatricesFields(fields, fieldNames, current)


## Implementation of FEMDamping servant.
class FEMDampingI(SenStore.FEMDamping):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMDamping object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMDampingFields object
  def getFields(self, current=None):
    logging.debug('FEMDamping[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMDampingFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ALPHA
  # - BETA
  # - Group
  #
  # @param fields updated fields (FEMDampingFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMDamping[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMDampingFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMMaterial servant.
class FEMMaterialI(SenStore.FEMMaterial):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMaterial object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMaterialFields object
  def getFields(self, current=None):
    logging.debug('FEMMaterial[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMaterialFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - MaterialType
  # - LocalID
  # - Structure
  #
  # @param fields updated fields (FEMMaterialFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMaterial[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMaterialFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)


## Implementation of FEMMatrixData servant.
class FEMMatrixDataI(SenStore.FEMMatrixData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMatrixData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMatrixDataFields object
  def getFields(self, current=None):
    logging.debug('FEMMatrixData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMatrixDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Coeff
  # - ColumnIndex
  # - MatrixID
  # - RecordNmb
  # - RowIndex
  #
  # @param fields updated fields (FEMMatrixDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMatrixData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMatrixDataFields(fields, fieldNames, current)


## Implementation of FEMShellAxesOrtho servant.
class FEMShellAxesOrthoI(SenStore.FEMShellAxesOrtho):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellAxesOrtho object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellAxesOrthoFields object
  def getFields(self, current=None):
    logging.debug('FEMShellAxesOrtho[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellAxesOrthoFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ALFA
  # - AxOrthoID
  # - Group
  # - LineID
  # - RecordNmb
  #
  # @param fields updated fields (FEMShellAxesOrthoFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellAxesOrtho[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellAxesOrthoFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMEndreleases servant.
class FEMEndreleasesI(SenStore.FEMEndreleases):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMEndreleases object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMEndreleasesFields object
  def getFields(self, current=None):
    logging.debug('FEMEndreleases[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMEndreleasesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - EndRelease
  # - Moment1
  # - Moment2
  # - Moment3
  # - Moment4
  # - Moment5
  # - Moment6
  #
  # @param fields updated fields (FEMEndreleasesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMEndreleases[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMEndreleasesFields(fields, fieldNames, current)


## Implementation of FEMTrussGroup servant.
class FEMTrussGroupI(SenStore.FEMTrussGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTrussGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTrussGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMTrussGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTrussGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - GAPS
  # - Group
  # - IniStrain
  # - Material
  # - SectionArea
  #
  # @param fields updated fields (FEMTrussGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTrussGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTrussGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)


## Implementation of FEMInitialTemperature servant.
class FEMInitialTemperatureI(SenStore.FEMInitialTemperature):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMInitialTemperature object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMInitialTemperatureFields object
  def getFields(self, current=None):
    logging.debug('FEMInitialTemperature[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMInitialTemperatureFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Node
  # - Temperature
  #
  # @param fields updated fields (FEMInitialTemperatureFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMInitialTemperature[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMInitialTemperatureFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMThermoIsoMaterials servant.
class FEMThermoIsoMaterialsI(SenStore.FEMThermoIsoMaterials):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThermoIsoMaterials object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThermoIsoMaterialsFields object
  def getFields(self, current=None):
    logging.debug('FEMThermoIsoMaterials[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThermoIsoMaterialsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Density
  # - MaterialID
  # - TREF
  #
  # @param fields updated fields (FEMThermoIsoMaterialsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThermoIsoMaterials[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThermoIsoMaterialsFields(fields, fieldNames, current)


## Implementation of FEMThermoIsoData servant.
class FEMThermoIsoDataI(SenStore.FEMThermoIsoData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThermoIsoData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThermoIsoDataFields object
  def getFields(self, current=None):
    logging.debug('FEMThermoIsoData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThermoIsoDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ALPHA
  # - E
  # - MaterialID
  # - NU
  # - RecordNmb
  # - Theta
  #
  # @param fields updated fields (FEMThermoIsoDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThermoIsoData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThermoIsoDataFields(fields, fieldNames, current)


## Implementation of FEMContactGroup3 servant.
class FEMContactGroup3I(SenStore.FEMContactGroup3):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMContactGroup3 object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMContactGroup3Fields object
  def getFields(self, current=None):
    logging.debug('FEMContactGroup3[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMContactGroup3Fields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ContGroupID
  # - Depth
  # - Description
  # - Forces
  # - Friction
  # - IniPenetration
  # - NodeToNode
  # - Offset
  # - PenetrAlgorithm
  # - TBirth
  # - TDeath
  # - Tied
  # - TiedOffset
  # - Tolerance
  # - Tractions
  #
  # @param fields updated fields (FEMContactGroup3Fields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMContactGroup3[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMContactGroup3Fields(fields, fieldNames, current)


## Implementation of FEMNLElasticMaterials servant.
class FEMNLElasticMaterialsI(SenStore.FEMNLElasticMaterials):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNLElasticMaterials object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNLElasticMaterialsFields object
  def getFields(self, current=None):
    logging.debug('FEMNLElasticMaterials[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNLElasticMaterialsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Dcurve
  # - Density
  # - MaterialID
  #
  # @param fields updated fields (FEMNLElasticMaterialsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNLElasticMaterials[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNLElasticMaterialsFields(fields, fieldNames, current)


## Implementation of FEMPlate servant.
class FEMPlateI(SenStore.FEMPlate):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPlate object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPlateFields object
  def getFields(self, current=None):
    logging.debug('FEMPlate[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPlateFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - ElementID
  # - Flex11
  # - Flex12
  # - Flex22
  # - Group
  # - MaterialID
  # - Meps11
  # - Meps12
  # - Meps22
  # - N1
  # - N2
  # - N3
  # - RecordNmb
  # - Save
  # - TBirth
  # - TDeath
  # - Thick
  #
  # @param fields updated fields (FEMPlateFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPlate[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPlateFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)


## Implementation of FEMIsoBeam servant.
class FEMIsoBeamI(SenStore.FEMIsoBeam):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMIsoBeam object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMIsoBeamFields object
  def getFields(self, current=None):
    logging.debug('FEMIsoBeam[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMIsoBeamFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AUX
  # - Description
  # - ElementID
  # - Epaxl
  # - Ephoop
  # - Group
  # - MaterialID
  # - N1
  # - N2
  # - N3
  # - N4
  # - NodeAmount
  # - RecordNmb
  # - Save
  # - SectionID
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMIsoBeamFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMIsoBeam[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMIsoBeamFields(fields, fieldNames, current)

  ## Gets the servant of the refered AUX object.
  def getAUX(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mAUX, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)

  ## Gets the servant of the refered N4 object.
  def getN4(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN4, current)


## Implementation of FEMAppliedConcentratedLoad servant.
class FEMAppliedConcentratedLoadI(SenStore.FEMAppliedConcentratedLoad):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMAppliedConcentratedLoad object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMAppliedConcentratedLoadFields object
  def getFields(self, current=None):
    logging.debug('FEMAppliedConcentratedLoad[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMAppliedConcentratedLoadFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ArrivalTime
  # - Description
  # - Direction
  # - Factor
  # - NodeAux
  # - NodeID
  # - RecordNmb
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMAppliedConcentratedLoadFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMAppliedConcentratedLoad[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMAppliedConcentratedLoadFields(fields, fieldNames, current)

  ## Gets the servant of the refered NodeAux object.
  def getNodeAux(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNodeAux, current)

  ## Gets the servant of the refered NodeID object.
  def getNodeID(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNodeID, current)


## Implementation of FEMTwoDSolidGroup servant.
class FEMTwoDSolidGroupI(SenStore.FEMTwoDSolidGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTwoDSolidGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTwoDSolidGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMTwoDSolidGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTwoDSolidGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AuxNode
  # - Displacement
  # - Group
  # - MaterialID
  # - Result
  # - Subtype
  #
  # @param fields updated fields (FEMTwoDSolidGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTwoDSolidGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTwoDSolidGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered AuxNode object.
  def getAuxNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mAuxNode, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMGroup servant.
class FEMGroupI(SenStore.FEMGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - GroupType
  # - LocalID
  # - Structure
  #
  # @param fields updated fields (FEMGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)


## Implementation of FEMProperties servant.
class FEMPropertiesI(SenStore.FEMProperties):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMProperties object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPropertiesFields object
  def getFields(self, current=None):
    logging.debug('FEMProperties[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPropertiesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - PropertyID
  # - PropertyType
  # - Rupture
  # - XC
  # - XN
  #
  # @param fields updated fields (FEMPropertiesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMProperties[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPropertiesFields(fields, fieldNames, current)


## Implementation of FEMThreeDSolidGroup servant.
class FEMThreeDSolidGroupI(SenStore.FEMThreeDSolidGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThreeDSolidGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThreeDSolidGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMThreeDSolidGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThreeDSolidGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Group
  # - MaterialID
  # - Result
  #
  # @param fields updated fields (FEMThreeDSolidGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThreeDSolidGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThreeDSolidGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMThreeDSolid servant.
class FEMThreeDSolidI(SenStore.FEMThreeDSolid):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThreeDSolid object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThreeDSolidFields object
  def getFields(self, current=None):
    logging.debug('FEMThreeDSolid[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThreeDSolidFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - ElementID
  # - Group
  # - MaterialID
  # - Maxes
  # - N1
  # - N10
  # - N11
  # - N12
  # - N13
  # - N14
  # - N15
  # - N16
  # - N17
  # - N18
  # - N19
  # - N2
  # - N20
  # - N21
  # - N22
  # - N23
  # - N24
  # - N25
  # - N26
  # - N27
  # - N3
  # - N4
  # - N5
  # - N6
  # - N7
  # - N8
  # - N9
  # - NodeAmount
  # - RecordNmb
  # - Save
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMThreeDSolidFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThreeDSolid[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThreeDSolidFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N10 object.
  def getN10(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN10, current)

  ## Gets the servant of the refered N11 object.
  def getN11(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN11, current)

  ## Gets the servant of the refered N12 object.
  def getN12(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN12, current)

  ## Gets the servant of the refered N13 object.
  def getN13(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN13, current)

  ## Gets the servant of the refered N14 object.
  def getN14(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN14, current)

  ## Gets the servant of the refered N15 object.
  def getN15(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN15, current)

  ## Gets the servant of the refered N16 object.
  def getN16(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN16, current)

  ## Gets the servant of the refered N17 object.
  def getN17(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN17, current)

  ## Gets the servant of the refered N18 object.
  def getN18(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN18, current)

  ## Gets the servant of the refered N19 object.
  def getN19(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN19, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N20 object.
  def getN20(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN20, current)

  ## Gets the servant of the refered N21 object.
  def getN21(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN21, current)

  ## Gets the servant of the refered N22 object.
  def getN22(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN22, current)

  ## Gets the servant of the refered N23 object.
  def getN23(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN23, current)

  ## Gets the servant of the refered N24 object.
  def getN24(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN24, current)

  ## Gets the servant of the refered N25 object.
  def getN25(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN25, current)

  ## Gets the servant of the refered N26 object.
  def getN26(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN26, current)

  ## Gets the servant of the refered N27 object.
  def getN27(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN27, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)

  ## Gets the servant of the refered N4 object.
  def getN4(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN4, current)

  ## Gets the servant of the refered N5 object.
  def getN5(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN5, current)

  ## Gets the servant of the refered N6 object.
  def getN6(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN6, current)

  ## Gets the servant of the refered N7 object.
  def getN7(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN7, current)

  ## Gets the servant of the refered N8 object.
  def getN8(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN8, current)

  ## Gets the servant of the refered N9 object.
  def getN9(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN9, current)


## Implementation of FEMSectionProp servant.
class FEMSectionPropI(SenStore.FEMSectionProp):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSectionProp object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSectionPropFields object
  def getFields(self, current=None):
    logging.debug('FEMSectionProp[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSectionPropFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Area
  # - Rinertia
  # - Sarea
  # - SectionID
  # - Sinertia
  # - Tarea
  # - Tinertia
  #
  # @param fields updated fields (FEMSectionPropFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSectionProp[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSectionPropFields(fields, fieldNames, current)


## Implementation of FEMElasticMaterial servant.
class FEMElasticMaterialI(SenStore.FEMElasticMaterial):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMElasticMaterial object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMElasticMaterialFields object
  def getFields(self, current=None):
    logging.debug('FEMElasticMaterial[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMElasticMaterialFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Alpha
  # - Density
  # - E
  # - Material
  # - NU
  #
  # @param fields updated fields (FEMElasticMaterialFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMElasticMaterial[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMElasticMaterialFields(fields, fieldNames, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)


## Implementation of FEMPoints servant.
class FEMPointsI(SenStore.FEMPoints):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPoints object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPointsFields object
  def getFields(self, current=None):
    logging.debug('FEMPoints[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPointsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - PointID
  # - SystemID
  # - X
  # - Y
  # - Z
  #
  # @param fields updated fields (FEMPointsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPoints[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPointsFields(fields, fieldNames, current)


## Implementation of FEMThermoOrthMaterials servant.
class FEMThermoOrthMaterialsI(SenStore.FEMThermoOrthMaterials):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMThermoOrthMaterials object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMThermoOrthMaterialsFields object
  def getFields(self, current=None):
    logging.debug('FEMThermoOrthMaterials[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMThermoOrthMaterialsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Density
  # - MaterialID
  # - TREF
  #
  # @param fields updated fields (FEMThermoOrthMaterialsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMThermoOrthMaterials[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMThermoOrthMaterialsFields(fields, fieldNames, current)


## Implementation of FEMConstraints servant.
class FEMConstraintsI(SenStore.FEMConstraints):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMConstraints object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMConstraintsFields object
  def getFields(self, current=None):
    logging.debug('FEMConstraints[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMConstraintsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ConstraintID
  # - Description
  # - SlaveDOF
  # - SlaveNode
  #
  # @param fields updated fields (FEMConstraintsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMConstraints[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMConstraintsFields(fields, fieldNames, current)


## Implementation of FEMMCrigidities servant.
class FEMMCrigiditiesI(SenStore.FEMMCrigidities):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMCrigidities object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMCrigiditiesFields object
  def getFields(self, current=None):
    logging.debug('FEMMCrigidities[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMCrigiditiesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AcurveType
  # - Alpha
  # - AxialCF
  # - BcurveType
  # - BendingCF
  # - Beta
  # - Density
  # - ForceAxID
  # - Hardening
  # - MassArea
  # - MassR
  # - MassS
  # - MassT
  # - MomentRID
  # - MomentSID
  # - MomentTID
  # - RigidityID
  # - TcurveType
  # - TorsionCF
  #
  # @param fields updated fields (FEMMCrigiditiesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMCrigidities[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMCrigiditiesFields(fields, fieldNames, current)


## Implementation of FEMSkeySysNode servant.
class FEMSkeySysNodeI(SenStore.FEMSkeySysNode):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSkeySysNode object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSkeySysNodeFields object
  def getFields(self, current=None):
    logging.debug('FEMSkeySysNode[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSkeySysNodeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - Node1
  # - Node2
  # - Node3
  # - SkewSystemID
  #
  # @param fields updated fields (FEMSkeySysNodeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSkeySysNode[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSkeySysNodeFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node1 object.
  def getNode1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode1, current)

  ## Gets the servant of the refered Node2 object.
  def getNode2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode2, current)

  ## Gets the servant of the refered Node3 object.
  def getNode3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode3, current)


## Implementation of FEMIsoBeamGroup servant.
class FEMIsoBeamGroupI(SenStore.FEMIsoBeamGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMIsoBeamGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMIsoBeamGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMIsoBeamGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMIsoBeamGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Group
  # - IniStrain
  # - MaterialID
  # - Result
  # - SectionID
  #
  # @param fields updated fields (FEMIsoBeamGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMIsoBeamGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMIsoBeamGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMShellDOF servant.
class FEMShellDOFI(SenStore.FEMShellDOF):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellDOF object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellDOFFields object
  def getFields(self, current=None):
    logging.debug('FEMShellDOF[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellDOFFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - DOFnumber
  # - Node
  # - VectorID
  #
  # @param fields updated fields (FEMShellDOFFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellDOF[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellDOFFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMCrossSections servant.
class FEMCrossSectionsI(SenStore.FEMCrossSections):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMCrossSections object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMCrossSectionsFields object
  def getFields(self, current=None):
    logging.debug('FEMCrossSections[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMCrossSectionsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - SectionID
  # - SectionType
  #
  # @param fields updated fields (FEMCrossSectionsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMCrossSections[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMCrossSectionsFields(fields, fieldNames, current)


## Implementation of FEMTwistMomentData servant.
class FEMTwistMomentDataI(SenStore.FEMTwistMomentData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTwistMomentData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTwistMomentDataFields object
  def getFields(self, current=None):
    logging.debug('FEMTwistMomentData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTwistMomentDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Moment
  # - RecordNmb
  # - Twist
  # - TwistMomentID
  #
  # @param fields updated fields (FEMTwistMomentDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTwistMomentData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTwistMomentDataFields(fields, fieldNames, current)


## Implementation of FEMShell servant.
class FEMShellI(SenStore.FEMShell):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShell object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellFields object
  def getFields(self, current=None):
    logging.debug('FEMShell[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - ElementID
  # - Group
  # - Material
  # - N1
  # - N2
  # - N3
  # - N4
  # - N5
  # - N6
  # - N7
  # - N8
  # - N9
  # - NodeAmount
  # - RecordNmb
  # - Save
  # - T1
  # - T2
  # - T3
  # - T4
  # - T5
  # - T6
  # - T7
  # - T8
  # - T9
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMShellFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShell[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)

  ## Gets the servant of the refered N4 object.
  def getN4(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN4, current)

  ## Gets the servant of the refered N5 object.
  def getN5(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN5, current)

  ## Gets the servant of the refered N6 object.
  def getN6(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN6, current)

  ## Gets the servant of the refered N7 object.
  def getN7(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN7, current)

  ## Gets the servant of the refered N8 object.
  def getN8(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN8, current)

  ## Gets the servant of the refered N9 object.
  def getN9(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN9, current)


## Implementation of FEMNTNContact servant.
class FEMNTNContactI(SenStore.FEMNTNContact):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNTNContact object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNTNContactFields object
  def getFields(self, current=None):
    logging.debug('FEMNTNContact[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNTNContactFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ContactorNode
  # - ContGroupID
  # - ContPair
  # - PrintRes
  # - RecordNmb
  # - SaveRes
  # - TargetNode
  # - TargetNx
  # - TargetNy
  # - TargetNz
  #
  # @param fields updated fields (FEMNTNContactFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNTNContact[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNTNContactFields(fields, fieldNames, current)


## Implementation of FEMShellLayer servant.
class FEMShellLayerI(SenStore.FEMShellLayer):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellLayer object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellLayerFields object
  def getFields(self, current=None):
    logging.debug('FEMShellLayer[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellLayerFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Group
  # - LayerNumber
  # - MaterialID
  # - PThick
  # - RecordNmb
  #
  # @param fields updated fields (FEMShellLayerFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellLayer[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellLayerFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMSkewSysAngles servant.
class FEMSkewSysAnglesI(SenStore.FEMSkewSysAngles):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSkewSysAngles object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSkewSysAnglesFields object
  def getFields(self, current=None):
    logging.debug('FEMSkewSysAngles[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSkewSysAnglesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - PHI
  # - SkewSystemID
  # - THETA
  # - XSI
  #
  # @param fields updated fields (FEMSkewSysAnglesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSkewSysAngles[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSkewSysAnglesFields(fields, fieldNames, current)


## Implementation of FEMGroundMotionRecord servant.
class FEMGroundMotionRecordI(SenStore.FEMGroundMotionRecord):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMGroundMotionRecord object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMGroundMotionRecordFields object
  def getFields(self, current=None):
    logging.debug('FEMGroundMotionRecord[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMGroundMotionRecordFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Description
  # - GMRecordID
  # - GMRecordName
  #
  # @param fields updated fields (FEMGroundMotionRecordFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMGroundMotionRecord[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMGroundMotionRecordFields(fields, fieldNames, current)


## Implementation of FEMGeneralGroup servant.
class FEMGeneralGroupI(SenStore.FEMGeneralGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMGeneralGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMGeneralGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMGeneralGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMGeneralGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Group
  # - MatrixSet
  # - Result
  # - SkewSystem
  #
  # @param fields updated fields (FEMGeneralGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMGeneralGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMGeneralGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMTwoDSolid servant.
class FEMTwoDSolidI(SenStore.FEMTwoDSolid):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMTwoDSolid object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMTwoDSolidFields object
  def getFields(self, current=None):
    logging.debug('FEMTwoDSolid[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMTwoDSolidFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Bet
  # - Description
  # - ElementID
  # - Group
  # - MaterialID
  # - N1
  # - N2
  # - N3
  # - N4
  # - N5
  # - N6
  # - N7
  # - N8
  # - N9
  # - NodeAmount
  # - RecordNmb
  # - Save
  # - TBirth
  # - TDeath
  # - Thick
  #
  # @param fields updated fields (FEMTwoDSolidFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMTwoDSolid[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMTwoDSolidFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)

  ## Gets the servant of the refered N4 object.
  def getN4(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN4, current)

  ## Gets the servant of the refered N5 object.
  def getN5(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN5, current)

  ## Gets the servant of the refered N6 object.
  def getN6(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN6, current)

  ## Gets the servant of the refered N7 object.
  def getN7(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN7, current)

  ## Gets the servant of the refered N8 object.
  def getN8(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN8, current)

  ## Gets the servant of the refered N9 object.
  def getN9(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN9, current)


## Implementation of FEMAppliedTemperature servant.
class FEMAppliedTemperatureI(SenStore.FEMAppliedTemperature):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMAppliedTemperature object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMAppliedTemperatureFields object
  def getFields(self, current=None):
    logging.debug('FEMAppliedTemperature[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMAppliedTemperatureFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ArrivalTime
  # - Factor
  # - Node
  # - RecordNmbr
  # - TimeFunctionID
  #
  # @param fields updated fields (FEMAppliedTemperatureFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMAppliedTemperature[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMAppliedTemperatureFields(fields, fieldNames, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMMatrixSets servant.
class FEMMatrixSetsI(SenStore.FEMMatrixSets):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMatrixSets object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMatrixSetsFields object
  def getFields(self, current=None):
    logging.debug('FEMMatrixSets[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMatrixSetsFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Damping
  # - Description
  # - Mass
  # - MatrixSetID
  # - Stiffness
  # - Stress
  #
  # @param fields updated fields (FEMMatrixSetsFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMatrixSets[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMatrixSetsFields(fields, fieldNames, current)


## Implementation of FEMConstraintCoef servant.
class FEMConstraintCoefI(SenStore.FEMConstraintCoef):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMConstraintCoef object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMConstraintCoefFields object
  def getFields(self, current=None):
    logging.debug('FEMConstraintCoef[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMConstraintCoefFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Coefficient
  # - ConstraintID
  # - Description
  # - MasterDOF
  # - MasterNode
  # - RecordNmb
  #
  # @param fields updated fields (FEMConstraintCoefFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMConstraintCoef[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMConstraintCoefFields(fields, fieldNames, current)


## Implementation of FEMSectionBox servant.
class FEMSectionBoxI(SenStore.FEMSectionBox):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSectionBox object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSectionBoxFields object
  def getFields(self, current=None):
    logging.debug('FEMSectionBox[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSectionBoxFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Height
  # - SC
  # - SectionID
  # - SSarea
  # - TC
  # - Thick1
  # - Thick2
  # - Torfac
  # - TSarea
  # - Width
  #
  # @param fields updated fields (FEMSectionBoxFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSectionBox[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSectionBoxFields(fields, fieldNames, current)


## Implementation of FEMNKDisplForce servant.
class FEMNKDisplForceI(SenStore.FEMNKDisplForce):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMNKDisplForce object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMNKDisplForceFields object
  def getFields(self, current=None):
    logging.debug('FEMNKDisplForce[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMNKDisplForceFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Force
  # - PropertyID
  # - RecordNmb
  #
  # @param fields updated fields (FEMNKDisplForceFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMNKDisplForce[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMNKDisplForceFields(fields, fieldNames, current)


## Implementation of FEMPlasticStrainStress servant.
class FEMPlasticStrainStressI(SenStore.FEMPlasticStrainStress):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMPlasticStrainStress object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMPlasticStrainStressFields object
  def getFields(self, current=None):
    logging.debug('FEMPlasticStrainStress[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMPlasticStrainStressFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - MaterialID
  # - RecordNumber
  # - Strain
  # - Stress
  #
  # @param fields updated fields (FEMPlasticStrainStressFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMPlasticStrainStress[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMPlasticStrainStressFields(fields, fieldNames, current)


## Implementation of FEMShellAxesOrthoData servant.
class FEMShellAxesOrthoDataI(SenStore.FEMShellAxesOrthoData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellAxesOrthoData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellAxesOrthoDataFields object
  def getFields(self, current=None):
    logging.debug('FEMShellAxesOrthoData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellAxesOrthoDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AxOrthoID
  # - ElementID
  # - RecordNmb
  #
  # @param fields updated fields (FEMShellAxesOrthoDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellAxesOrthoData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellAxesOrthoDataFields(fields, fieldNames, current)


## Implementation of FEMGeneralNode servant.
class FEMGeneralNodeI(SenStore.FEMGeneralNode):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMGeneralNode object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMGeneralNodeFields object
  def getFields(self, current=None):
    logging.debug('FEMGeneralNode[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMGeneralNodeFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ElementID
  # - Group
  # - LocalNmb
  # - Node
  # - RecordNmb
  #
  # @param fields updated fields (FEMGeneralNodeFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMGeneralNode[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMGeneralNodeFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of FEMStrLines servant.
class FEMStrLinesI(SenStore.FEMStrLines):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMStrLines object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMStrLinesFields object
  def getFields(self, current=None):
    logging.debug('FEMStrLines[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMStrLinesFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - LineID
  # - P1
  # - P2
  #
  # @param fields updated fields (FEMStrLinesFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMStrLines[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMStrLinesFields(fields, fieldNames, current)


## Implementation of FEMContactSurface servant.
class FEMContactSurfaceI(SenStore.FEMContactSurface):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMContactSurface object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMContactSurfaceFields object
  def getFields(self, current=None):
    logging.debug('FEMContactSurface[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMContactSurfaceFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - ContGroupID
  # - ContSegment
  # - ContSurface
  # - N1
  # - N2
  # - N3
  # - N4
  # - RecordNmb
  #
  # @param fields updated fields (FEMContactSurfaceFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMContactSurface[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMContactSurfaceFields(fields, fieldNames, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)

  ## Gets the servant of the refered N3 object.
  def getN3(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN3, current)

  ## Gets the servant of the refered N4 object.
  def getN4(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN4, current)


## Implementation of FEMMCForceData servant.
class FEMMCForceDataI(SenStore.FEMMCForceData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMMCForceData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMMCForceDataFields object
  def getFields(self, current=None):
    logging.debug('FEMMCForceData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMMCForceDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - CurvMomentID
  # - Force
  # - MomentSTID
  # - RecordNmb
  #
  # @param fields updated fields (FEMMCForceDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMMCForceData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMMCForceDataFields(fields, fieldNames, current)


## Implementation of FEMSpring servant.
class FEMSpringI(SenStore.FEMSpring):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSpring object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSpringFields object
  def getFields(self, current=None):
    logging.debug('FEMSpring[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSpringFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - AX
  # - AY
  # - AZ
  # - Description
  # - ElementID
  # - Group
  # - ID1
  # - ID2
  # - N1
  # - N2
  # - PropertySet
  # - RecordNmb
  # - Save
  # - TBirth
  # - TDeath
  #
  # @param fields updated fields (FEMSpringFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSpring[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSpringFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered N1 object.
  def getN1(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN1, current)

  ## Gets the servant of the refered N2 object.
  def getN2(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mN2, current)


## Implementation of FEMSpringGroup servant.
class FEMSpringGroupI(SenStore.FEMSpringGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMSpringGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMSpringGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMSpringGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMSpringGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Bolt
  # - Group
  # - Nonlinear
  # - PropertySet
  # - Result
  # - SkewSystem
  #
  # @param fields updated fields (FEMSpringGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMSpringGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMSpringGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)


## Implementation of FEMShellGroup servant.
class FEMShellGroupI(SenStore.FEMShellGroup):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id FEMShellGroup object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return FEMShellGroupFields object
  def getFields(self, current=None):
    logging.debug('FEMShellGroup[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getFEMShellGroupFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Displacement
  # - Group
  # - Material
  # - NLayers
  # - Result
  # - SectionResult
  # - StressReference
  # - Thickness
  #
  # @param fields updated fields (FEMShellGroupFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('FEMShellGroup[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setFEMShellGroupFields(fields, fieldNames, current)

  ## Gets the servant of the refered Group object.
  def getGroup(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMGroup(fields.mGroup, current)

  ## Gets the servant of the refered Material object.
  def getMaterial(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMMaterial(fields.mMaterial, current)


## Implementation of DaqUnit servant.
class DaqUnitI(SenStore.DaqUnit):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id DaqUnit object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return DaqUnitFields object
  def getFields(self, current=None):
    logging.debug('DaqUnit[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getDaqUnitFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Model
  # - Identifier
  #
  # @param fields updated fields (DaqUnitFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('DaqUnit[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setDaqUnitFields(fields, fieldNames, current)


## Implementation of DaqUnitChannel servant.
class DaqUnitChannelI(SenStore.DaqUnitChannel):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id DaqUnitChannel object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return DaqUnitChannelFields object
  def getFields(self, current=None):
    logging.debug('DaqUnitChannel[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getDaqUnitChannelFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Unit
  # - Number
  #
  # @param fields updated fields (DaqUnitChannelFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('DaqUnitChannel[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setDaqUnitChannelFields(fields, fieldNames, current)

  ## Gets the servant of the refered Unit object.
  def getUnit(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getDaqUnit(fields.mUnit, current)


## Implementation of Sensor servant.
class SensorI(SenStore.Sensor):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id Sensor object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return SensorFields object
  def getFields(self, current=None):
    logging.debug('Sensor[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getSensorFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Type
  # - Model
  # - Identifier
  #
  # @param fields updated fields (SensorFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('Sensor[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setSensorFields(fields, fieldNames, current)


## Implementation of Transducer servant.
class TransducerI(SenStore.Transducer):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id Transducer object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return TransducerFields object
  def getFields(self, current=None):
    logging.debug('Transducer[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getTransducerFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Model
  # - Identifier
  #
  # @param fields updated fields (TransducerFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('Transducer[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setTransducerFields(fields, fieldNames, current)


## Implementation of Experiment servant.
class ExperimentI(SenStore.Experiment):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id Experiment object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return ExperimentFields object
  def getFields(self, current=None):
    logging.debug('Experiment[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getExperimentFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Frequency
  # - Duration
  # - BufferData
  #
  # @param fields updated fields (ExperimentFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('Experiment[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setExperimentFields(fields, fieldNames, current)


## Implementation of Cycle servant.
class CycleI(SenStore.Cycle):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id Cycle object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return CycleFields object
  def getFields(self, current=None):
    logging.debug('Cycle[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getCycleFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Time
  # - Experiment
  #
  # @param fields updated fields (CycleFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('Cycle[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setCycleFields(fields, fieldNames, current)

  ## Gets the servant of the refered Experiment object.
  def getExperiment(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getExperiment(fields.mExperiment, current)


## Implementation of SensorTimeData servant.
class SensorTimeDataI(SenStore.SensorTimeData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id SensorTimeData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return SensorTimeDataFields object
  def getFields(self, current=None):
    logging.debug('SensorTimeData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getSensorTimeDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Structure
  # - Sensor
  # - Channel
  # - StartTime
  # - Status
  # - Node
  #
  # @param fields updated fields (SensorTimeDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('SensorTimeData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setSensorTimeDataFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)

  ## Gets the servant of the refered Sensor object.
  def getSensor(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getSensor(fields.mSensor, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of TransducerTimeData servant.
class TransducerTimeDataI(SenStore.TransducerTimeData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id TransducerTimeData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return TransducerTimeDataFields object
  def getFields(self, current=None):
    logging.debug('TransducerTimeData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getTransducerTimeDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Transducer
  # - Sensor
  # - Node
  # - Orientation
  # - Amplification
  # - Channel
  # - Filter
  # - StartTime
  # - Status
  #
  # @param fields updated fields (TransducerTimeDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('TransducerTimeData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setTransducerTimeDataFields(fields, fieldNames, current)

  ## Gets the servant of the refered Transducer object.
  def getTransducer(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getTransducer(fields.mTransducer, current)

  ## Gets the servant of the refered Sensor object.
  def getSensor(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getSensor(fields.mSensor, current)

  ## Gets the servant of the refered Node object.
  def getNode(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getFEMNode(fields.mNode, current)


## Implementation of ExperimentStructureData servant.
class ExperimentStructureDataI(SenStore.ExperimentStructureData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id ExperimentStructureData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return ExperimentStructureDataFields object
  def getFields(self, current=None):
    logging.debug('ExperimentStructureData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getExperimentStructureDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Experiment
  # - Structure
  # - StartTime
  # - Status
  #
  # @param fields updated fields (ExperimentStructureDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('ExperimentStructureData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setExperimentStructureDataFields(fields, fieldNames, current)

  ## Gets the servant of the refered Experiment object.
  def getExperiment(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getExperiment(fields.mExperiment, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)


## Implementation of TransducerCycleData servant.
class TransducerCycleDataI(SenStore.TransducerCycleData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id TransducerCycleData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return TransducerCycleDataFields object
  def getFields(self, current=None):
    logging.debug('TransducerCycleData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getTransducerCycleDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Transducer
  # - Cycle
  # - SoftwareScaling
  #
  # @param fields updated fields (TransducerCycleDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('TransducerCycleData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setTransducerCycleDataFields(fields, fieldNames, current)

  ## Gets the servant of the refered Transducer object.
  def getTransducer(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getTransducer(fields.mTransducer, current)

  ## Gets the servant of the refered Cycle object.
  def getCycle(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getCycle(fields.mCycle, current)


## Implementation of MappingMatrix servant.
class MappingMatrixI(SenStore.MappingMatrix):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id MappingMatrix object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return MappingMatrixFields object
  def getFields(self, current=None):
    logging.debug('MappingMatrix[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getMappingMatrixFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Structure
  # - Name
  # - Description
  # - OutputQuantity
  # - InputQuantity
  #
  # @param fields updated fields (MappingMatrixFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('MappingMatrix[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setMappingMatrixFields(fields, fieldNames, current)

  ## Gets the servant of the refered Structure object.
  def getStructure(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getStructure(fields.mStructure, current)


  ## Gets the OutputNode axis.
  #
  # @return list of FEMNode IDs
  def getOutputNodeAxis(self, current=None):
    # Relay request to manager
    return self._mngr.getMappingMatrixOutputNodeAxis(self.id, current)

  ##
  # Sets the OutputNode axis.
  #
  # @param data list of FEMNode IDs
  def setOutputNodeAxis(self, data, current=None):
    # Relay request to manager
    self._mngr.setMappingMatrixOutputNodeAxis(self.id, data, current)

  ## Gets the InputNode axis.
  #
  # @return list of FEMNode IDs
  def getInputNodeAxis(self, current=None):
    # Relay request to manager
    return self._mngr.getMappingMatrixInputNodeAxis(self.id, current)

  ##
  # Sets the InputNode axis.
  #
  # @param data list of FEMNode IDs
  def setInputNodeAxis(self, data, current=None):
    # Relay request to manager
    self._mngr.setMappingMatrixInputNodeAxis(self.id, data, current)

  ## Gets the array dimensions.
  #
  # @return array dimensions
  def getArraySize(self, current=None):
    # Relay request to manager
    self._mngr.getMappingMatrixArraySize(self.id, current)

  ## Creates the data array.
  #
  # @param dims array dimensions
  def createArray(self, dims, current=None):
    # Relay request to manager
    return self._mngr.createMappingMatrixArray(self.id, dims, current)

  ## Gets the array data of the i'th dimension, at the given indices.
  #
  # The index at the requested dimension will be ignored.  For
  # example, getDim(1,[10,0,4]) will get the vector of data along
  # the second dimension, with the first index set to 10, and the
  # third to 4.
  # 
  # @param i dimension number (0 ...)
  # @param idxs dimension indices (0 ...)
  # @return vector data
  def getArrayData(self, i, idxs, current=None):
    # Relay request to manager
    self._mngr.getMappingMatrixArrayData(self.id, i, idxs, current)

  ## Sets the array data of the i'th dimension, at the given indices.
  #
  # @param i dimension number (0 ...)
  # @param dims dimension indices (0 ...)
  # @param data vector data
  def setArrayData(self, i, idxs, data, current=None):
    # Relay request to manager
    return self._mngr.setMappingMatrixArrayData(self.id, i, idxs, data,
                                                 current)


## Implementation of DaqUnitChannelData servant.
class DaqUnitChannelDataI(SenStore.DaqUnitChannelData):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id DaqUnitChannelData object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return DaqUnitChannelDataFields object
  def getFields(self, current=None):
    logging.debug('DaqUnitChannelData[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Channel
  #
  # @param fields updated fields (DaqUnitChannelDataFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('DaqUnitChannelData[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setDaqUnitChannelDataFields(fields, fieldNames, current)

  ## Gets the servant of the refered Channel object.
  def getChannel(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getDaqUnitChannel(fields.mChannel, current)


  ## Gets the SubChannels axis.
  #
  # @return list of Quantity IDs
  def getSubChannelsAxis(self, current=None):
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataSubChannelsAxis(self.id, current)

  ##
  # Sets the SubChannels axis.
  #
  # @param data list of Quantity IDs
  def setSubChannelsAxis(self, data, current=None):
    # Relay request to manager
    self._mngr.setDaqUnitChannelDataSubChannelsAxis(self.id, data, current)

  ## Creates the signal array.
  #
  # Note that the array size reflects the size of each axis, not
  # including the time axis.  The signal will grow along the time
  # axis as arrays are added.
  #
  # This method must be called before signal samples can be added,
  # or axes can be set.
  #
  # @param dims signal array dimensions
  def createSignal(self, dims, current=None):
    # Relay request to manager
    self._mngr.createDaqUnitChannelDataSignal(self.id, dims, current)

  ## Gets the signal dimensions.
  #
  # @return signal dimensions
  def getSignalSize(self, current=None):
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataSignalSize(self.id, current)

  ## Gets the signal time axis information.
  #
  # @param t  time vector [s]
  # @return signal time axis information
  def getTimeAxisInfo(self, t, current=None):
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataTimeAxisInfo(self.id, t, current)

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getSignalData(self, tStart, tStep, tEnd, slices, current=None):
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataSignalData(self.id, tStart, tStep,
        tEnd, slices, current)

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getSignalDataByIndexRange(self, idxStart, idxStep, idxEnd, slices, current=None):
    # Relay request to manager
    return self._mngr.getDaqUnitChannelDataSignalDataByIndexRange(self.id, idxStart, idxStep, idxEnd,
        slices, current)

  ## Appends a set of data points to the signal.
  #
  # @param t ordered list of timestamps
  # @param data vector data
  def appendToSignal(self, t, data, current=None):
    # Relay request to manager
    return self._mngr.appendToDaqUnitChannelDataSignal(self.id, t, data, current)


## Implementation of AccelMeas servant.
class AccelMeasI(SenStore.AccelMeas):
  ## Initializes the servant
  #
  # @param mngr  SenStore manager
  # @param id AccelMeas object ID
  def __init__(self, mngr, id):
    # Remember manager, to relay calls to later on
    self._mngr = mngr
    # Remember my object ID
    self.id = id
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = Ice.generateUUID()

  ## Activates the servant
  #
  # @param adapter  Ice adapter
  # @return servant proxy
  def activate(self, adapter):
    return adapter.add(self, self._id)

  ## Gets the fields of this object.
  #
  # @return AccelMeasFields object
  def getFields(self, current=None):
    logging.debug('AccelMeas[oid=%d]::getFields()', self.id)
    # Relay request to manager
    return self._mngr.getAccelMeasFields(self.id, current)

  ## Updates the fields of this object.
  #
  # If one or more fields are specified, only the fields listed
  # will be updated, the other fields will be left unchanged.  If
  # the field list is empty ALL fields will be updated.
  # The available fields are:
  # - Sensor
  # - Name
  # - Description
  #
  # @param fields updated fields (AccelMeasFields object)
  # @param fieldNames list names of fields to update
  def setFields(self, fields, fieldNames, current=None):
    logging.debug('AccelMeas[oid=%d]::setFields()', self.id)
    # Make sure object fields ID is set to this object
    fields.id = self.id
    # Relay request to manager
    self._mngr.setAccelMeasFields(fields, fieldNames, current)

  ## Gets the servant of the refered Sensor object.
  def getSensor(self, current=None):
    fields = self.getFields(current)
    return self._mngr.getSensor(fields.mSensor, current)


  ## Gets the Direction axis.
  #
  # @return list of Quantity IDs
  def getDirectionAxis(self, current=None):
    # Relay request to manager
    return self._mngr.getAccelMeasDirectionAxis(self.id, current)

  ##
  # Sets the Direction axis.
  #
  # @param data list of Quantity IDs
  def setDirectionAxis(self, data, current=None):
    # Relay request to manager
    self._mngr.setAccelMeasDirectionAxis(self.id, data, current)

  ## Creates the signal array.
  #
  # Note that the array size reflects the size of each axis, not
  # including the time axis.  The signal will grow along the time
  # axis as arrays are added.
  #
  # This method must be called before signal samples can be added,
  # or axes can be set.
  #
  # @param dims signal array dimensions
  def createSignal(self, dims, current=None):
    # Relay request to manager
    self._mngr.createAccelMeasSignal(self.id, dims, current)

  ## Gets the signal dimensions.
  #
  # @return signal dimensions
  def getSignalSize(self, current=None):
    # Relay request to manager
    return self._mngr.getAccelMeasSignalSize(self.id, current)

  ## Gets the signal time axis information.
  #
  # @param t  time vector [s]
  # @return signal time axis information
  def getTimeAxisInfo(self, t, current=None):
    # Relay request to manager
    return self._mngr.getAccelMeasTimeAxisInfo(self.id, t, current)

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getSignalData(self, tStart, tStep, tEnd, slices, current=None):
    # Relay request to manager
    return self._mngr.getAccelMeasSignalData(self.id, tStart, tStep,
        tEnd, slices, current)

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getSignalDataByIndexRange(self, idxStart, idxStep, idxEnd, slices, current=None):
    # Relay request to manager
    return self._mngr.getAccelMeasSignalDataByIndexRange(self.id, idxStart, idxStep, idxEnd,
        slices, current)

  ## Appends a set of data points to the signal.
  #
  # @param t ordered list of timestamps
  # @param data vector data
  def appendToSignal(self, t, data, current=None):
    # Relay request to manager
    return self._mngr.appendToAccelMeasSignal(self.id, t, data, current)


## Implementation of SenStore manager servant.
class SenStoreMngrI(SenStore.SenStoreMngr):
  ## Creates and initializes the servant.
  def __init__(self, ic):
    # Get properties
    props = ic.getProperties()
    # Create mutex for regulating access to the database
    self.lock = threading.RLock()
    # Open connections to PostgreSQL database and HDF5 file
    # TODO: hostname
    username = props.getProperty('PostgreSQL.username')
    password = props.getProperty('PostgreSQL.password')
    self.pg = pgdb.Database(username, password)
    self.h5 = h5db.Database('SenStore.h5')
    # Create unique Ice identity
    self._id = Ice.Identity()
    self._id.name = 'SenStore'
    # Create registry of Ice objects
    # TODO: client time-out and object garbage collection
    self.registryStructure = {}
    self.registryFEMDof = {}
    self.registryFEMNodalMass = {}
    self.registryFEMNLElasticStrainStress = {}
    self.registryFEMBoundary = {}
    self.registryFEMSectionPipe = {}
    self.registryFEMCoordSystem = {}
    self.registryFEMNode = {}
    self.registryFEMTruss = {}
    self.registryFEMTimeFunctionData = {}
    self.registryFEMPlasticMlMaterials = {}
    self.registryFEMPlateGroup = {}
    self.registryFEMBeam = {}
    self.registryFEMCurvMomentData = {}
    self.registryFEMPropertysets = {}
    self.registryFEMOrthotropicMaterial = {}
    self.registryFEMAppliedLoads = {}
    self.registryFEMThermoOrthData = {}
    self.registryFEMContactPairs = {}
    self.registryFEMGeneral = {}
    self.registryFEMBeamNode = {}
    self.registryFEMSectionRect = {}
    self.registryFEMBeamLoad = {}
    self.registryFEMLoadMassProportional = {}
    self.registryFEMLink = {}
    self.registryFEMAxesNode = {}
    self.registryFEMNMTimeMass = {}
    self.registryFEMAppliedDisplacement = {}
    self.registryFEMTimeFunctions = {}
    self.registryFEMForceStrainData = {}
    self.registryFEMSkewDOF = {}
    self.registryFEMSectionI = {}
    self.registryFEMPlasticBilinearMaterial = {}
    self.registryFEMMTForceData = {}
    self.registryFEMShellPressure = {}
    self.registryFEMMatrices = {}
    self.registryFEMDamping = {}
    self.registryFEMMaterial = {}
    self.registryFEMMatrixData = {}
    self.registryFEMShellAxesOrtho = {}
    self.registryFEMEndreleases = {}
    self.registryFEMTrussGroup = {}
    self.registryFEMInitialTemperature = {}
    self.registryFEMThermoIsoMaterials = {}
    self.registryFEMThermoIsoData = {}
    self.registryFEMContactGroup3 = {}
    self.registryFEMNLElasticMaterials = {}
    self.registryFEMPlate = {}
    self.registryFEMIsoBeam = {}
    self.registryFEMAppliedConcentratedLoad = {}
    self.registryFEMTwoDSolidGroup = {}
    self.registryFEMGroup = {}
    self.registryFEMProperties = {}
    self.registryFEMThreeDSolidGroup = {}
    self.registryFEMThreeDSolid = {}
    self.registryFEMSectionProp = {}
    self.registryFEMElasticMaterial = {}
    self.registryFEMPoints = {}
    self.registryFEMThermoOrthMaterials = {}
    self.registryFEMConstraints = {}
    self.registryFEMMCrigidities = {}
    self.registryFEMSkeySysNode = {}
    self.registryFEMIsoBeamGroup = {}
    self.registryFEMShellDOF = {}
    self.registryFEMCrossSections = {}
    self.registryFEMTwistMomentData = {}
    self.registryFEMShell = {}
    self.registryFEMNTNContact = {}
    self.registryFEMShellLayer = {}
    self.registryFEMSkewSysAngles = {}
    self.registryFEMGroundMotionRecord = {}
    self.registryFEMGeneralGroup = {}
    self.registryFEMTwoDSolid = {}
    self.registryFEMAppliedTemperature = {}
    self.registryFEMMatrixSets = {}
    self.registryFEMConstraintCoef = {}
    self.registryFEMSectionBox = {}
    self.registryFEMNKDisplForce = {}
    self.registryFEMPlasticStrainStress = {}
    self.registryFEMShellAxesOrthoData = {}
    self.registryFEMGeneralNode = {}
    self.registryFEMStrLines = {}
    self.registryFEMContactSurface = {}
    self.registryFEMMCForceData = {}
    self.registryFEMSpring = {}
    self.registryFEMSpringGroup = {}
    self.registryFEMShellGroup = {}
    self.registryDaqUnit = {}
    self.registryDaqUnitChannel = {}
    self.registrySensor = {}
    self.registryTransducer = {}
    self.registryExperiment = {}
    self.registryCycle = {}
    self.registrySensorTimeData = {}
    self.registryTransducerTimeData = {}
    self.registryExperimentStructureData = {}
    self.registryTransducerCycleData = {}
    self.registryMappingMatrix = {}
    self.registryDaqUnitChannelData = {}
    self.registryAccelMeas = {}

  ## Activates the servant.
  #
  # @param adapter  Ice adapter
  def activate(self, adapter):
    # Remember adapter, for creating servants later on
    self._adapter = adapter
    # Add myself to the adapter
    return adapter.add(self, self._id)

  ## Adds a Structure object to the store.
  #
  # @param fields  StructureFields object
  # @return newly assigned ID
  def addStructure(self, fields, current=None):
    logging.debug('addStructure()')
    with self.lock:
      self.pg.addStructure(fields)
    return fields.id


  ## Adds a set of Structure objects to the store.
  #
  # @param fieldsList  list of StructureFields objects
  # @return list of newly assigned IDs
  def addStructureList(self, fieldsList, current=None):
    logging.debug('addStructureList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addStructureList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a Structure object proxy by its ID.
  #
  # @param id Structure object ID
  # @return Structure object proxy
  def getStructure(self, id, current=None):
    logging.debug('getStructure(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryStructure.has_key(id):
        logging.debug('Fetched Structure[oid=%d] servant from cache', id)
        return self.registryStructure[id]
      obj = StructureI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.StructurePrx.uncheckedCast(srvt)
      self.registryStructure[id] = prx
    logging.debug('Activated Structure[oid=%d] servant', id)
    return prx

  ## Gets the Structure object fields.
  #
  # @param id Structure object ID
  # @return StructureFields object
  def getStructureFields(self, id, current=None):
    logging.debug('getStructureFields(oid=%d)' % id)
    return self._getStructureFields(id, current)

  ## Gets the Structure object fields.
  #
  # @param id Structure object ID
  # @return StructureFields object
  def _getStructureFields(self, id, current=None):
    fields = SenStore.StructureFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getStructure(fields):
          return None
    return fields

  ## Sets the Structure object fields.
  #
  # @param fields     Structure fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setStructureFields(self, fields, fieldNames, current=None):
    logging.debug('setStructureFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setStructure(fields, fieldNames)

  ## Gets a list of IDs of all Structure objects.
  #
  # @return ids list of Structure object IDs
  def getStructureIds(self, current=None):
    logging.debug('getStructureList()')
    with self.lock:
      return self.pg.getStructureIds()

  ## Gets a list of Structure object proxies.
  #
  # @param ids list of Structure object IDs
  # @return list of Structure object proxies
  def getStructureList(self, ids, current=None):
    logging.debug('getStructureList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getStructure(id) for id in ids]

  ## Gets a list of Structure fields objects.
  #
  # @param ids list of Structure object IDs
  # @return list of Structure fields objects
  def getStructureFieldsList(self, ids, current=None):
    logging.debug('getStructureFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getStructureFields(id) for id in ids]

  ## Gets a list of all Structure object IDs.
  #
  # @param fields Structure object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching Structure objects
  #
  def findEqualStructure(self, fields, fieldNames, current=None):
    logging.debug('findEqualStructure()')
    with self.lock:
      ids = self.pg.findEqualStructure(fields, fieldNames)
    return ids

  ## Adds a FEMDof object to the store.
  #
  # @param fields  FEMDofFields object
  # @return newly assigned ID
  def addFEMDof(self, fields, current=None):
    logging.debug('addFEMDof()')
    with self.lock:
      self.pg.addFEMDof(fields)
    return fields.id


  ## Adds a set of FEMDof objects to the store.
  #
  # @param fieldsList  list of FEMDofFields objects
  # @return list of newly assigned IDs
  def addFEMDofList(self, fieldsList, current=None):
    logging.debug('addFEMDofList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMDofList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMDof object proxy by its ID.
  #
  # @param id FEMDof object ID
  # @return FEMDof object proxy
  def getFEMDof(self, id, current=None):
    logging.debug('getFEMDof(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMDof.has_key(id):
        logging.debug('Fetched FEMDof[oid=%d] servant from cache', id)
        return self.registryFEMDof[id]
      obj = FEMDofI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMDofPrx.uncheckedCast(srvt)
      self.registryFEMDof[id] = prx
    logging.debug('Activated FEMDof[oid=%d] servant', id)
    return prx

  ## Gets the FEMDof object fields.
  #
  # @param id FEMDof object ID
  # @return FEMDofFields object
  def getFEMDofFields(self, id, current=None):
    logging.debug('getFEMDofFields(oid=%d)' % id)
    return self._getFEMDofFields(id, current)

  ## Gets the FEMDof object fields.
  #
  # @param id FEMDof object ID
  # @return FEMDofFields object
  def _getFEMDofFields(self, id, current=None):
    fields = SenStore.FEMDofFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMDof(fields):
          return None
    return fields

  ## Sets the FEMDof object fields.
  #
  # @param fields     FEMDof fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMDofFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMDofFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMDof(fields, fieldNames)

  ## Gets a list of IDs of all FEMDof objects.
  #
  # @return ids list of FEMDof object IDs
  def getFEMDofIds(self, current=None):
    logging.debug('getFEMDofList()')
    with self.lock:
      return self.pg.getFEMDofIds()

  ## Gets a list of FEMDof object proxies.
  #
  # @param ids list of FEMDof object IDs
  # @return list of FEMDof object proxies
  def getFEMDofList(self, ids, current=None):
    logging.debug('getFEMDofList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMDof(id) for id in ids]

  ## Gets a list of FEMDof fields objects.
  #
  # @param ids list of FEMDof object IDs
  # @return list of FEMDof fields objects
  def getFEMDofFieldsList(self, ids, current=None):
    logging.debug('getFEMDofFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMDofFields(id) for id in ids]

  ## Gets a list of all FEMDof object IDs.
  #
  # @param fields FEMDof object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMDof objects
  #
  def findEqualFEMDof(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMDof()')
    with self.lock:
      ids = self.pg.findEqualFEMDof(fields, fieldNames)
    return ids

  ## Adds a FEMNodalMass object to the store.
  #
  # @param fields  FEMNodalMassFields object
  # @return newly assigned ID
  def addFEMNodalMass(self, fields, current=None):
    logging.debug('addFEMNodalMass()')
    with self.lock:
      self.pg.addFEMNodalMass(fields)
    return fields.id


  ## Adds a set of FEMNodalMass objects to the store.
  #
  # @param fieldsList  list of FEMNodalMassFields objects
  # @return list of newly assigned IDs
  def addFEMNodalMassList(self, fieldsList, current=None):
    logging.debug('addFEMNodalMassList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNodalMassList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNodalMass object proxy by its ID.
  #
  # @param id FEMNodalMass object ID
  # @return FEMNodalMass object proxy
  def getFEMNodalMass(self, id, current=None):
    logging.debug('getFEMNodalMass(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNodalMass.has_key(id):
        logging.debug('Fetched FEMNodalMass[oid=%d] servant from cache', id)
        return self.registryFEMNodalMass[id]
      obj = FEMNodalMassI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNodalMassPrx.uncheckedCast(srvt)
      self.registryFEMNodalMass[id] = prx
    logging.debug('Activated FEMNodalMass[oid=%d] servant', id)
    return prx

  ## Gets the FEMNodalMass object fields.
  #
  # @param id FEMNodalMass object ID
  # @return FEMNodalMassFields object
  def getFEMNodalMassFields(self, id, current=None):
    logging.debug('getFEMNodalMassFields(oid=%d)' % id)
    return self._getFEMNodalMassFields(id, current)

  ## Gets the FEMNodalMass object fields.
  #
  # @param id FEMNodalMass object ID
  # @return FEMNodalMassFields object
  def _getFEMNodalMassFields(self, id, current=None):
    fields = SenStore.FEMNodalMassFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNodalMass(fields):
          return None
    return fields

  ## Sets the FEMNodalMass object fields.
  #
  # @param fields     FEMNodalMass fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNodalMassFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNodalMassFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNodalMass(fields, fieldNames)

  ## Gets a list of IDs of all FEMNodalMass objects.
  #
  # @return ids list of FEMNodalMass object IDs
  def getFEMNodalMassIds(self, current=None):
    logging.debug('getFEMNodalMassList()')
    with self.lock:
      return self.pg.getFEMNodalMassIds()

  ## Gets a list of FEMNodalMass object proxies.
  #
  # @param ids list of FEMNodalMass object IDs
  # @return list of FEMNodalMass object proxies
  def getFEMNodalMassList(self, ids, current=None):
    logging.debug('getFEMNodalMassList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNodalMass(id) for id in ids]

  ## Gets a list of FEMNodalMass fields objects.
  #
  # @param ids list of FEMNodalMass object IDs
  # @return list of FEMNodalMass fields objects
  def getFEMNodalMassFieldsList(self, ids, current=None):
    logging.debug('getFEMNodalMassFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNodalMassFields(id) for id in ids]

  ## Gets a list of all FEMNodalMass object IDs.
  #
  # @param fields FEMNodalMass object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNodalMass objects
  #
  def findEqualFEMNodalMass(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNodalMass()')
    with self.lock:
      ids = self.pg.findEqualFEMNodalMass(fields, fieldNames)
    return ids

  ## Adds a FEMNLElasticStrainStress object to the store.
  #
  # @param fields  FEMNLElasticStrainStressFields object
  # @return newly assigned ID
  def addFEMNLElasticStrainStress(self, fields, current=None):
    logging.debug('addFEMNLElasticStrainStress()')
    with self.lock:
      self.pg.addFEMNLElasticStrainStress(fields)
    return fields.id


  ## Adds a set of FEMNLElasticStrainStress objects to the store.
  #
  # @param fieldsList  list of FEMNLElasticStrainStressFields objects
  # @return list of newly assigned IDs
  def addFEMNLElasticStrainStressList(self, fieldsList, current=None):
    logging.debug('addFEMNLElasticStrainStressList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNLElasticStrainStressList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNLElasticStrainStress object proxy by its ID.
  #
  # @param id FEMNLElasticStrainStress object ID
  # @return FEMNLElasticStrainStress object proxy
  def getFEMNLElasticStrainStress(self, id, current=None):
    logging.debug('getFEMNLElasticStrainStress(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNLElasticStrainStress.has_key(id):
        logging.debug('Fetched FEMNLElasticStrainStress[oid=%d] servant from cache', id)
        return self.registryFEMNLElasticStrainStress[id]
      obj = FEMNLElasticStrainStressI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNLElasticStrainStressPrx.uncheckedCast(srvt)
      self.registryFEMNLElasticStrainStress[id] = prx
    logging.debug('Activated FEMNLElasticStrainStress[oid=%d] servant', id)
    return prx

  ## Gets the FEMNLElasticStrainStress object fields.
  #
  # @param id FEMNLElasticStrainStress object ID
  # @return FEMNLElasticStrainStressFields object
  def getFEMNLElasticStrainStressFields(self, id, current=None):
    logging.debug('getFEMNLElasticStrainStressFields(oid=%d)' % id)
    return self._getFEMNLElasticStrainStressFields(id, current)

  ## Gets the FEMNLElasticStrainStress object fields.
  #
  # @param id FEMNLElasticStrainStress object ID
  # @return FEMNLElasticStrainStressFields object
  def _getFEMNLElasticStrainStressFields(self, id, current=None):
    fields = SenStore.FEMNLElasticStrainStressFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNLElasticStrainStress(fields):
          return None
    return fields

  ## Sets the FEMNLElasticStrainStress object fields.
  #
  # @param fields     FEMNLElasticStrainStress fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNLElasticStrainStressFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNLElasticStrainStressFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNLElasticStrainStress(fields, fieldNames)

  ## Gets a list of IDs of all FEMNLElasticStrainStress objects.
  #
  # @return ids list of FEMNLElasticStrainStress object IDs
  def getFEMNLElasticStrainStressIds(self, current=None):
    logging.debug('getFEMNLElasticStrainStressList()')
    with self.lock:
      return self.pg.getFEMNLElasticStrainStressIds()

  ## Gets a list of FEMNLElasticStrainStress object proxies.
  #
  # @param ids list of FEMNLElasticStrainStress object IDs
  # @return list of FEMNLElasticStrainStress object proxies
  def getFEMNLElasticStrainStressList(self, ids, current=None):
    logging.debug('getFEMNLElasticStrainStressList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNLElasticStrainStress(id) for id in ids]

  ## Gets a list of FEMNLElasticStrainStress fields objects.
  #
  # @param ids list of FEMNLElasticStrainStress object IDs
  # @return list of FEMNLElasticStrainStress fields objects
  def getFEMNLElasticStrainStressFieldsList(self, ids, current=None):
    logging.debug('getFEMNLElasticStrainStressFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNLElasticStrainStressFields(id) for id in ids]

  ## Gets a list of all FEMNLElasticStrainStress object IDs.
  #
  # @param fields FEMNLElasticStrainStress object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNLElasticStrainStress objects
  #
  def findEqualFEMNLElasticStrainStress(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNLElasticStrainStress()')
    with self.lock:
      ids = self.pg.findEqualFEMNLElasticStrainStress(fields, fieldNames)
    return ids

  ## Adds a FEMBoundary object to the store.
  #
  # @param fields  FEMBoundaryFields object
  # @return newly assigned ID
  def addFEMBoundary(self, fields, current=None):
    logging.debug('addFEMBoundary()')
    with self.lock:
      self.pg.addFEMBoundary(fields)
    return fields.id


  ## Adds a set of FEMBoundary objects to the store.
  #
  # @param fieldsList  list of FEMBoundaryFields objects
  # @return list of newly assigned IDs
  def addFEMBoundaryList(self, fieldsList, current=None):
    logging.debug('addFEMBoundaryList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMBoundaryList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMBoundary object proxy by its ID.
  #
  # @param id FEMBoundary object ID
  # @return FEMBoundary object proxy
  def getFEMBoundary(self, id, current=None):
    logging.debug('getFEMBoundary(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMBoundary.has_key(id):
        logging.debug('Fetched FEMBoundary[oid=%d] servant from cache', id)
        return self.registryFEMBoundary[id]
      obj = FEMBoundaryI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMBoundaryPrx.uncheckedCast(srvt)
      self.registryFEMBoundary[id] = prx
    logging.debug('Activated FEMBoundary[oid=%d] servant', id)
    return prx

  ## Gets the FEMBoundary object fields.
  #
  # @param id FEMBoundary object ID
  # @return FEMBoundaryFields object
  def getFEMBoundaryFields(self, id, current=None):
    logging.debug('getFEMBoundaryFields(oid=%d)' % id)
    return self._getFEMBoundaryFields(id, current)

  ## Gets the FEMBoundary object fields.
  #
  # @param id FEMBoundary object ID
  # @return FEMBoundaryFields object
  def _getFEMBoundaryFields(self, id, current=None):
    fields = SenStore.FEMBoundaryFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMBoundary(fields):
          return None
    return fields

  ## Sets the FEMBoundary object fields.
  #
  # @param fields     FEMBoundary fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMBoundaryFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMBoundaryFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMBoundary(fields, fieldNames)

  ## Gets a list of IDs of all FEMBoundary objects.
  #
  # @return ids list of FEMBoundary object IDs
  def getFEMBoundaryIds(self, current=None):
    logging.debug('getFEMBoundaryList()')
    with self.lock:
      return self.pg.getFEMBoundaryIds()

  ## Gets a list of FEMBoundary object proxies.
  #
  # @param ids list of FEMBoundary object IDs
  # @return list of FEMBoundary object proxies
  def getFEMBoundaryList(self, ids, current=None):
    logging.debug('getFEMBoundaryList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMBoundary(id) for id in ids]

  ## Gets a list of FEMBoundary fields objects.
  #
  # @param ids list of FEMBoundary object IDs
  # @return list of FEMBoundary fields objects
  def getFEMBoundaryFieldsList(self, ids, current=None):
    logging.debug('getFEMBoundaryFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMBoundaryFields(id) for id in ids]

  ## Gets a list of all FEMBoundary object IDs.
  #
  # @param fields FEMBoundary object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMBoundary objects
  #
  def findEqualFEMBoundary(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMBoundary()')
    with self.lock:
      ids = self.pg.findEqualFEMBoundary(fields, fieldNames)
    return ids

  ## Adds a FEMSectionPipe object to the store.
  #
  # @param fields  FEMSectionPipeFields object
  # @return newly assigned ID
  def addFEMSectionPipe(self, fields, current=None):
    logging.debug('addFEMSectionPipe()')
    with self.lock:
      self.pg.addFEMSectionPipe(fields)
    return fields.id


  ## Adds a set of FEMSectionPipe objects to the store.
  #
  # @param fieldsList  list of FEMSectionPipeFields objects
  # @return list of newly assigned IDs
  def addFEMSectionPipeList(self, fieldsList, current=None):
    logging.debug('addFEMSectionPipeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSectionPipeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSectionPipe object proxy by its ID.
  #
  # @param id FEMSectionPipe object ID
  # @return FEMSectionPipe object proxy
  def getFEMSectionPipe(self, id, current=None):
    logging.debug('getFEMSectionPipe(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSectionPipe.has_key(id):
        logging.debug('Fetched FEMSectionPipe[oid=%d] servant from cache', id)
        return self.registryFEMSectionPipe[id]
      obj = FEMSectionPipeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSectionPipePrx.uncheckedCast(srvt)
      self.registryFEMSectionPipe[id] = prx
    logging.debug('Activated FEMSectionPipe[oid=%d] servant', id)
    return prx

  ## Gets the FEMSectionPipe object fields.
  #
  # @param id FEMSectionPipe object ID
  # @return FEMSectionPipeFields object
  def getFEMSectionPipeFields(self, id, current=None):
    logging.debug('getFEMSectionPipeFields(oid=%d)' % id)
    return self._getFEMSectionPipeFields(id, current)

  ## Gets the FEMSectionPipe object fields.
  #
  # @param id FEMSectionPipe object ID
  # @return FEMSectionPipeFields object
  def _getFEMSectionPipeFields(self, id, current=None):
    fields = SenStore.FEMSectionPipeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSectionPipe(fields):
          return None
    return fields

  ## Sets the FEMSectionPipe object fields.
  #
  # @param fields     FEMSectionPipe fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSectionPipeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSectionPipeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSectionPipe(fields, fieldNames)

  ## Gets a list of IDs of all FEMSectionPipe objects.
  #
  # @return ids list of FEMSectionPipe object IDs
  def getFEMSectionPipeIds(self, current=None):
    logging.debug('getFEMSectionPipeList()')
    with self.lock:
      return self.pg.getFEMSectionPipeIds()

  ## Gets a list of FEMSectionPipe object proxies.
  #
  # @param ids list of FEMSectionPipe object IDs
  # @return list of FEMSectionPipe object proxies
  def getFEMSectionPipeList(self, ids, current=None):
    logging.debug('getFEMSectionPipeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSectionPipe(id) for id in ids]

  ## Gets a list of FEMSectionPipe fields objects.
  #
  # @param ids list of FEMSectionPipe object IDs
  # @return list of FEMSectionPipe fields objects
  def getFEMSectionPipeFieldsList(self, ids, current=None):
    logging.debug('getFEMSectionPipeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSectionPipeFields(id) for id in ids]

  ## Gets a list of all FEMSectionPipe object IDs.
  #
  # @param fields FEMSectionPipe object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSectionPipe objects
  #
  def findEqualFEMSectionPipe(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSectionPipe()')
    with self.lock:
      ids = self.pg.findEqualFEMSectionPipe(fields, fieldNames)
    return ids

  ## Adds a FEMCoordSystem object to the store.
  #
  # @param fields  FEMCoordSystemFields object
  # @return newly assigned ID
  def addFEMCoordSystem(self, fields, current=None):
    logging.debug('addFEMCoordSystem()')
    with self.lock:
      self.pg.addFEMCoordSystem(fields)
    return fields.id


  ## Adds a set of FEMCoordSystem objects to the store.
  #
  # @param fieldsList  list of FEMCoordSystemFields objects
  # @return list of newly assigned IDs
  def addFEMCoordSystemList(self, fieldsList, current=None):
    logging.debug('addFEMCoordSystemList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMCoordSystemList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMCoordSystem object proxy by its ID.
  #
  # @param id FEMCoordSystem object ID
  # @return FEMCoordSystem object proxy
  def getFEMCoordSystem(self, id, current=None):
    logging.debug('getFEMCoordSystem(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMCoordSystem.has_key(id):
        logging.debug('Fetched FEMCoordSystem[oid=%d] servant from cache', id)
        return self.registryFEMCoordSystem[id]
      obj = FEMCoordSystemI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMCoordSystemPrx.uncheckedCast(srvt)
      self.registryFEMCoordSystem[id] = prx
    logging.debug('Activated FEMCoordSystem[oid=%d] servant', id)
    return prx

  ## Gets the FEMCoordSystem object fields.
  #
  # @param id FEMCoordSystem object ID
  # @return FEMCoordSystemFields object
  def getFEMCoordSystemFields(self, id, current=None):
    logging.debug('getFEMCoordSystemFields(oid=%d)' % id)
    return self._getFEMCoordSystemFields(id, current)

  ## Gets the FEMCoordSystem object fields.
  #
  # @param id FEMCoordSystem object ID
  # @return FEMCoordSystemFields object
  def _getFEMCoordSystemFields(self, id, current=None):
    fields = SenStore.FEMCoordSystemFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMCoordSystem(fields):
          return None
    return fields

  ## Sets the FEMCoordSystem object fields.
  #
  # @param fields     FEMCoordSystem fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMCoordSystemFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMCoordSystemFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMCoordSystem(fields, fieldNames)

  ## Gets a list of IDs of all FEMCoordSystem objects.
  #
  # @return ids list of FEMCoordSystem object IDs
  def getFEMCoordSystemIds(self, current=None):
    logging.debug('getFEMCoordSystemList()')
    with self.lock:
      return self.pg.getFEMCoordSystemIds()

  ## Gets a list of FEMCoordSystem object proxies.
  #
  # @param ids list of FEMCoordSystem object IDs
  # @return list of FEMCoordSystem object proxies
  def getFEMCoordSystemList(self, ids, current=None):
    logging.debug('getFEMCoordSystemList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMCoordSystem(id) for id in ids]

  ## Gets a list of FEMCoordSystem fields objects.
  #
  # @param ids list of FEMCoordSystem object IDs
  # @return list of FEMCoordSystem fields objects
  def getFEMCoordSystemFieldsList(self, ids, current=None):
    logging.debug('getFEMCoordSystemFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMCoordSystemFields(id) for id in ids]

  ## Gets a list of all FEMCoordSystem object IDs.
  #
  # @param fields FEMCoordSystem object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMCoordSystem objects
  #
  def findEqualFEMCoordSystem(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMCoordSystem()')
    with self.lock:
      ids = self.pg.findEqualFEMCoordSystem(fields, fieldNames)
    return ids

  ## Adds a FEMNode object to the store.
  #
  # @param fields  FEMNodeFields object
  # @return newly assigned ID
  def addFEMNode(self, fields, current=None):
    logging.debug('addFEMNode()')
    with self.lock:
      self.pg.addFEMNode(fields)
    return fields.id


  ## Adds a set of FEMNode objects to the store.
  #
  # @param fieldsList  list of FEMNodeFields objects
  # @return list of newly assigned IDs
  def addFEMNodeList(self, fieldsList, current=None):
    logging.debug('addFEMNodeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNodeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNode object proxy by its ID.
  #
  # @param id FEMNode object ID
  # @return FEMNode object proxy
  def getFEMNode(self, id, current=None):
    logging.debug('getFEMNode(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNode.has_key(id):
        logging.debug('Fetched FEMNode[oid=%d] servant from cache', id)
        return self.registryFEMNode[id]
      obj = FEMNodeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNodePrx.uncheckedCast(srvt)
      self.registryFEMNode[id] = prx
    logging.debug('Activated FEMNode[oid=%d] servant', id)
    return prx

  ## Gets the FEMNode object fields.
  #
  # @param id FEMNode object ID
  # @return FEMNodeFields object
  def getFEMNodeFields(self, id, current=None):
    logging.debug('getFEMNodeFields(oid=%d)' % id)
    return self._getFEMNodeFields(id, current)

  ## Gets the FEMNode object fields.
  #
  # @param id FEMNode object ID
  # @return FEMNodeFields object
  def _getFEMNodeFields(self, id, current=None):
    fields = SenStore.FEMNodeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNode(fields):
          return None
    return fields

  ## Sets the FEMNode object fields.
  #
  # @param fields     FEMNode fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNodeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNodeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNode(fields, fieldNames)

  ## Gets a list of IDs of all FEMNode objects.
  #
  # @return ids list of FEMNode object IDs
  def getFEMNodeIds(self, current=None):
    logging.debug('getFEMNodeList()')
    with self.lock:
      return self.pg.getFEMNodeIds()

  ## Gets a list of FEMNode object proxies.
  #
  # @param ids list of FEMNode object IDs
  # @return list of FEMNode object proxies
  def getFEMNodeList(self, ids, current=None):
    logging.debug('getFEMNodeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNode(id) for id in ids]

  ## Gets a list of FEMNode fields objects.
  #
  # @param ids list of FEMNode object IDs
  # @return list of FEMNode fields objects
  def getFEMNodeFieldsList(self, ids, current=None):
    logging.debug('getFEMNodeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNodeFields(id) for id in ids]

  ## Gets a list of all FEMNode object IDs.
  #
  # @param fields FEMNode object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNode objects
  #
  def findEqualFEMNode(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNode()')
    with self.lock:
      ids = self.pg.findEqualFEMNode(fields, fieldNames)
    return ids

  ## Adds a FEMTruss object to the store.
  #
  # @param fields  FEMTrussFields object
  # @return newly assigned ID
  def addFEMTruss(self, fields, current=None):
    logging.debug('addFEMTruss()')
    with self.lock:
      self.pg.addFEMTruss(fields)
    return fields.id


  ## Adds a set of FEMTruss objects to the store.
  #
  # @param fieldsList  list of FEMTrussFields objects
  # @return list of newly assigned IDs
  def addFEMTrussList(self, fieldsList, current=None):
    logging.debug('addFEMTrussList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTrussList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTruss object proxy by its ID.
  #
  # @param id FEMTruss object ID
  # @return FEMTruss object proxy
  def getFEMTruss(self, id, current=None):
    logging.debug('getFEMTruss(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTruss.has_key(id):
        logging.debug('Fetched FEMTruss[oid=%d] servant from cache', id)
        return self.registryFEMTruss[id]
      obj = FEMTrussI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTrussPrx.uncheckedCast(srvt)
      self.registryFEMTruss[id] = prx
    logging.debug('Activated FEMTruss[oid=%d] servant', id)
    return prx

  ## Gets the FEMTruss object fields.
  #
  # @param id FEMTruss object ID
  # @return FEMTrussFields object
  def getFEMTrussFields(self, id, current=None):
    logging.debug('getFEMTrussFields(oid=%d)' % id)
    return self._getFEMTrussFields(id, current)

  ## Gets the FEMTruss object fields.
  #
  # @param id FEMTruss object ID
  # @return FEMTrussFields object
  def _getFEMTrussFields(self, id, current=None):
    fields = SenStore.FEMTrussFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTruss(fields):
          return None
    return fields

  ## Sets the FEMTruss object fields.
  #
  # @param fields     FEMTruss fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTrussFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTrussFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTruss(fields, fieldNames)

  ## Gets a list of IDs of all FEMTruss objects.
  #
  # @return ids list of FEMTruss object IDs
  def getFEMTrussIds(self, current=None):
    logging.debug('getFEMTrussList()')
    with self.lock:
      return self.pg.getFEMTrussIds()

  ## Gets a list of FEMTruss object proxies.
  #
  # @param ids list of FEMTruss object IDs
  # @return list of FEMTruss object proxies
  def getFEMTrussList(self, ids, current=None):
    logging.debug('getFEMTrussList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTruss(id) for id in ids]

  ## Gets a list of FEMTruss fields objects.
  #
  # @param ids list of FEMTruss object IDs
  # @return list of FEMTruss fields objects
  def getFEMTrussFieldsList(self, ids, current=None):
    logging.debug('getFEMTrussFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTrussFields(id) for id in ids]

  ## Gets a list of all FEMTruss object IDs.
  #
  # @param fields FEMTruss object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTruss objects
  #
  def findEqualFEMTruss(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTruss()')
    with self.lock:
      ids = self.pg.findEqualFEMTruss(fields, fieldNames)
    return ids

  ## Adds a FEMTimeFunctionData object to the store.
  #
  # @param fields  FEMTimeFunctionDataFields object
  # @return newly assigned ID
  def addFEMTimeFunctionData(self, fields, current=None):
    logging.debug('addFEMTimeFunctionData()')
    with self.lock:
      self.pg.addFEMTimeFunctionData(fields)
    return fields.id


  ## Adds a set of FEMTimeFunctionData objects to the store.
  #
  # @param fieldsList  list of FEMTimeFunctionDataFields objects
  # @return list of newly assigned IDs
  def addFEMTimeFunctionDataList(self, fieldsList, current=None):
    logging.debug('addFEMTimeFunctionDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTimeFunctionDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTimeFunctionData object proxy by its ID.
  #
  # @param id FEMTimeFunctionData object ID
  # @return FEMTimeFunctionData object proxy
  def getFEMTimeFunctionData(self, id, current=None):
    logging.debug('getFEMTimeFunctionData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTimeFunctionData.has_key(id):
        logging.debug('Fetched FEMTimeFunctionData[oid=%d] servant from cache', id)
        return self.registryFEMTimeFunctionData[id]
      obj = FEMTimeFunctionDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTimeFunctionDataPrx.uncheckedCast(srvt)
      self.registryFEMTimeFunctionData[id] = prx
    logging.debug('Activated FEMTimeFunctionData[oid=%d] servant', id)
    return prx

  ## Gets the FEMTimeFunctionData object fields.
  #
  # @param id FEMTimeFunctionData object ID
  # @return FEMTimeFunctionDataFields object
  def getFEMTimeFunctionDataFields(self, id, current=None):
    logging.debug('getFEMTimeFunctionDataFields(oid=%d)' % id)
    return self._getFEMTimeFunctionDataFields(id, current)

  ## Gets the FEMTimeFunctionData object fields.
  #
  # @param id FEMTimeFunctionData object ID
  # @return FEMTimeFunctionDataFields object
  def _getFEMTimeFunctionDataFields(self, id, current=None):
    fields = SenStore.FEMTimeFunctionDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTimeFunctionData(fields):
          return None
    return fields

  ## Sets the FEMTimeFunctionData object fields.
  #
  # @param fields     FEMTimeFunctionData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTimeFunctionDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTimeFunctionDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTimeFunctionData(fields, fieldNames)

  ## Gets a list of IDs of all FEMTimeFunctionData objects.
  #
  # @return ids list of FEMTimeFunctionData object IDs
  def getFEMTimeFunctionDataIds(self, current=None):
    logging.debug('getFEMTimeFunctionDataList()')
    with self.lock:
      return self.pg.getFEMTimeFunctionDataIds()

  ## Gets a list of FEMTimeFunctionData object proxies.
  #
  # @param ids list of FEMTimeFunctionData object IDs
  # @return list of FEMTimeFunctionData object proxies
  def getFEMTimeFunctionDataList(self, ids, current=None):
    logging.debug('getFEMTimeFunctionDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTimeFunctionData(id) for id in ids]

  ## Gets a list of FEMTimeFunctionData fields objects.
  #
  # @param ids list of FEMTimeFunctionData object IDs
  # @return list of FEMTimeFunctionData fields objects
  def getFEMTimeFunctionDataFieldsList(self, ids, current=None):
    logging.debug('getFEMTimeFunctionDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTimeFunctionDataFields(id) for id in ids]

  ## Gets a list of all FEMTimeFunctionData object IDs.
  #
  # @param fields FEMTimeFunctionData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTimeFunctionData objects
  #
  def findEqualFEMTimeFunctionData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTimeFunctionData()')
    with self.lock:
      ids = self.pg.findEqualFEMTimeFunctionData(fields, fieldNames)
    return ids

  ## Adds a FEMPlasticMlMaterials object to the store.
  #
  # @param fields  FEMPlasticMlMaterialsFields object
  # @return newly assigned ID
  def addFEMPlasticMlMaterials(self, fields, current=None):
    logging.debug('addFEMPlasticMlMaterials()')
    with self.lock:
      self.pg.addFEMPlasticMlMaterials(fields)
    return fields.id


  ## Adds a set of FEMPlasticMlMaterials objects to the store.
  #
  # @param fieldsList  list of FEMPlasticMlMaterialsFields objects
  # @return list of newly assigned IDs
  def addFEMPlasticMlMaterialsList(self, fieldsList, current=None):
    logging.debug('addFEMPlasticMlMaterialsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPlasticMlMaterialsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPlasticMlMaterials object proxy by its ID.
  #
  # @param id FEMPlasticMlMaterials object ID
  # @return FEMPlasticMlMaterials object proxy
  def getFEMPlasticMlMaterials(self, id, current=None):
    logging.debug('getFEMPlasticMlMaterials(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPlasticMlMaterials.has_key(id):
        logging.debug('Fetched FEMPlasticMlMaterials[oid=%d] servant from cache', id)
        return self.registryFEMPlasticMlMaterials[id]
      obj = FEMPlasticMlMaterialsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPlasticMlMaterialsPrx.uncheckedCast(srvt)
      self.registryFEMPlasticMlMaterials[id] = prx
    logging.debug('Activated FEMPlasticMlMaterials[oid=%d] servant', id)
    return prx

  ## Gets the FEMPlasticMlMaterials object fields.
  #
  # @param id FEMPlasticMlMaterials object ID
  # @return FEMPlasticMlMaterialsFields object
  def getFEMPlasticMlMaterialsFields(self, id, current=None):
    logging.debug('getFEMPlasticMlMaterialsFields(oid=%d)' % id)
    return self._getFEMPlasticMlMaterialsFields(id, current)

  ## Gets the FEMPlasticMlMaterials object fields.
  #
  # @param id FEMPlasticMlMaterials object ID
  # @return FEMPlasticMlMaterialsFields object
  def _getFEMPlasticMlMaterialsFields(self, id, current=None):
    fields = SenStore.FEMPlasticMlMaterialsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPlasticMlMaterials(fields):
          return None
    return fields

  ## Sets the FEMPlasticMlMaterials object fields.
  #
  # @param fields     FEMPlasticMlMaterials fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPlasticMlMaterialsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPlasticMlMaterialsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPlasticMlMaterials(fields, fieldNames)

  ## Gets a list of IDs of all FEMPlasticMlMaterials objects.
  #
  # @return ids list of FEMPlasticMlMaterials object IDs
  def getFEMPlasticMlMaterialsIds(self, current=None):
    logging.debug('getFEMPlasticMlMaterialsList()')
    with self.lock:
      return self.pg.getFEMPlasticMlMaterialsIds()

  ## Gets a list of FEMPlasticMlMaterials object proxies.
  #
  # @param ids list of FEMPlasticMlMaterials object IDs
  # @return list of FEMPlasticMlMaterials object proxies
  def getFEMPlasticMlMaterialsList(self, ids, current=None):
    logging.debug('getFEMPlasticMlMaterialsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPlasticMlMaterials(id) for id in ids]

  ## Gets a list of FEMPlasticMlMaterials fields objects.
  #
  # @param ids list of FEMPlasticMlMaterials object IDs
  # @return list of FEMPlasticMlMaterials fields objects
  def getFEMPlasticMlMaterialsFieldsList(self, ids, current=None):
    logging.debug('getFEMPlasticMlMaterialsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPlasticMlMaterialsFields(id) for id in ids]

  ## Gets a list of all FEMPlasticMlMaterials object IDs.
  #
  # @param fields FEMPlasticMlMaterials object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPlasticMlMaterials objects
  #
  def findEqualFEMPlasticMlMaterials(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPlasticMlMaterials()')
    with self.lock:
      ids = self.pg.findEqualFEMPlasticMlMaterials(fields, fieldNames)
    return ids

  ## Adds a FEMPlateGroup object to the store.
  #
  # @param fields  FEMPlateGroupFields object
  # @return newly assigned ID
  def addFEMPlateGroup(self, fields, current=None):
    logging.debug('addFEMPlateGroup()')
    with self.lock:
      self.pg.addFEMPlateGroup(fields)
    return fields.id


  ## Adds a set of FEMPlateGroup objects to the store.
  #
  # @param fieldsList  list of FEMPlateGroupFields objects
  # @return list of newly assigned IDs
  def addFEMPlateGroupList(self, fieldsList, current=None):
    logging.debug('addFEMPlateGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPlateGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPlateGroup object proxy by its ID.
  #
  # @param id FEMPlateGroup object ID
  # @return FEMPlateGroup object proxy
  def getFEMPlateGroup(self, id, current=None):
    logging.debug('getFEMPlateGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPlateGroup.has_key(id):
        logging.debug('Fetched FEMPlateGroup[oid=%d] servant from cache', id)
        return self.registryFEMPlateGroup[id]
      obj = FEMPlateGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPlateGroupPrx.uncheckedCast(srvt)
      self.registryFEMPlateGroup[id] = prx
    logging.debug('Activated FEMPlateGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMPlateGroup object fields.
  #
  # @param id FEMPlateGroup object ID
  # @return FEMPlateGroupFields object
  def getFEMPlateGroupFields(self, id, current=None):
    logging.debug('getFEMPlateGroupFields(oid=%d)' % id)
    return self._getFEMPlateGroupFields(id, current)

  ## Gets the FEMPlateGroup object fields.
  #
  # @param id FEMPlateGroup object ID
  # @return FEMPlateGroupFields object
  def _getFEMPlateGroupFields(self, id, current=None):
    fields = SenStore.FEMPlateGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPlateGroup(fields):
          return None
    return fields

  ## Sets the FEMPlateGroup object fields.
  #
  # @param fields     FEMPlateGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPlateGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPlateGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPlateGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMPlateGroup objects.
  #
  # @return ids list of FEMPlateGroup object IDs
  def getFEMPlateGroupIds(self, current=None):
    logging.debug('getFEMPlateGroupList()')
    with self.lock:
      return self.pg.getFEMPlateGroupIds()

  ## Gets a list of FEMPlateGroup object proxies.
  #
  # @param ids list of FEMPlateGroup object IDs
  # @return list of FEMPlateGroup object proxies
  def getFEMPlateGroupList(self, ids, current=None):
    logging.debug('getFEMPlateGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPlateGroup(id) for id in ids]

  ## Gets a list of FEMPlateGroup fields objects.
  #
  # @param ids list of FEMPlateGroup object IDs
  # @return list of FEMPlateGroup fields objects
  def getFEMPlateGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMPlateGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPlateGroupFields(id) for id in ids]

  ## Gets a list of all FEMPlateGroup object IDs.
  #
  # @param fields FEMPlateGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPlateGroup objects
  #
  def findEqualFEMPlateGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPlateGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMPlateGroup(fields, fieldNames)
    return ids

  ## Adds a FEMBeam object to the store.
  #
  # @param fields  FEMBeamFields object
  # @return newly assigned ID
  def addFEMBeam(self, fields, current=None):
    logging.debug('addFEMBeam()')
    with self.lock:
      self.pg.addFEMBeam(fields)
    return fields.id


  ## Adds a set of FEMBeam objects to the store.
  #
  # @param fieldsList  list of FEMBeamFields objects
  # @return list of newly assigned IDs
  def addFEMBeamList(self, fieldsList, current=None):
    logging.debug('addFEMBeamList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMBeamList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMBeam object proxy by its ID.
  #
  # @param id FEMBeam object ID
  # @return FEMBeam object proxy
  def getFEMBeam(self, id, current=None):
    logging.debug('getFEMBeam(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMBeam.has_key(id):
        logging.debug('Fetched FEMBeam[oid=%d] servant from cache', id)
        return self.registryFEMBeam[id]
      obj = FEMBeamI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMBeamPrx.uncheckedCast(srvt)
      self.registryFEMBeam[id] = prx
    logging.debug('Activated FEMBeam[oid=%d] servant', id)
    return prx

  ## Gets the FEMBeam object fields.
  #
  # @param id FEMBeam object ID
  # @return FEMBeamFields object
  def getFEMBeamFields(self, id, current=None):
    logging.debug('getFEMBeamFields(oid=%d)' % id)
    return self._getFEMBeamFields(id, current)

  ## Gets the FEMBeam object fields.
  #
  # @param id FEMBeam object ID
  # @return FEMBeamFields object
  def _getFEMBeamFields(self, id, current=None):
    fields = SenStore.FEMBeamFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMBeam(fields):
          return None
    return fields

  ## Sets the FEMBeam object fields.
  #
  # @param fields     FEMBeam fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMBeamFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMBeamFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMBeam(fields, fieldNames)

  ## Gets a list of IDs of all FEMBeam objects.
  #
  # @return ids list of FEMBeam object IDs
  def getFEMBeamIds(self, current=None):
    logging.debug('getFEMBeamList()')
    with self.lock:
      return self.pg.getFEMBeamIds()

  ## Gets a list of FEMBeam object proxies.
  #
  # @param ids list of FEMBeam object IDs
  # @return list of FEMBeam object proxies
  def getFEMBeamList(self, ids, current=None):
    logging.debug('getFEMBeamList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMBeam(id) for id in ids]

  ## Gets a list of FEMBeam fields objects.
  #
  # @param ids list of FEMBeam object IDs
  # @return list of FEMBeam fields objects
  def getFEMBeamFieldsList(self, ids, current=None):
    logging.debug('getFEMBeamFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMBeamFields(id) for id in ids]

  ## Gets a list of all FEMBeam object IDs.
  #
  # @param fields FEMBeam object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMBeam objects
  #
  def findEqualFEMBeam(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMBeam()')
    with self.lock:
      ids = self.pg.findEqualFEMBeam(fields, fieldNames)
    return ids

  ## Adds a FEMCurvMomentData object to the store.
  #
  # @param fields  FEMCurvMomentDataFields object
  # @return newly assigned ID
  def addFEMCurvMomentData(self, fields, current=None):
    logging.debug('addFEMCurvMomentData()')
    with self.lock:
      self.pg.addFEMCurvMomentData(fields)
    return fields.id


  ## Adds a set of FEMCurvMomentData objects to the store.
  #
  # @param fieldsList  list of FEMCurvMomentDataFields objects
  # @return list of newly assigned IDs
  def addFEMCurvMomentDataList(self, fieldsList, current=None):
    logging.debug('addFEMCurvMomentDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMCurvMomentDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMCurvMomentData object proxy by its ID.
  #
  # @param id FEMCurvMomentData object ID
  # @return FEMCurvMomentData object proxy
  def getFEMCurvMomentData(self, id, current=None):
    logging.debug('getFEMCurvMomentData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMCurvMomentData.has_key(id):
        logging.debug('Fetched FEMCurvMomentData[oid=%d] servant from cache', id)
        return self.registryFEMCurvMomentData[id]
      obj = FEMCurvMomentDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMCurvMomentDataPrx.uncheckedCast(srvt)
      self.registryFEMCurvMomentData[id] = prx
    logging.debug('Activated FEMCurvMomentData[oid=%d] servant', id)
    return prx

  ## Gets the FEMCurvMomentData object fields.
  #
  # @param id FEMCurvMomentData object ID
  # @return FEMCurvMomentDataFields object
  def getFEMCurvMomentDataFields(self, id, current=None):
    logging.debug('getFEMCurvMomentDataFields(oid=%d)' % id)
    return self._getFEMCurvMomentDataFields(id, current)

  ## Gets the FEMCurvMomentData object fields.
  #
  # @param id FEMCurvMomentData object ID
  # @return FEMCurvMomentDataFields object
  def _getFEMCurvMomentDataFields(self, id, current=None):
    fields = SenStore.FEMCurvMomentDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMCurvMomentData(fields):
          return None
    return fields

  ## Sets the FEMCurvMomentData object fields.
  #
  # @param fields     FEMCurvMomentData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMCurvMomentDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMCurvMomentDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMCurvMomentData(fields, fieldNames)

  ## Gets a list of IDs of all FEMCurvMomentData objects.
  #
  # @return ids list of FEMCurvMomentData object IDs
  def getFEMCurvMomentDataIds(self, current=None):
    logging.debug('getFEMCurvMomentDataList()')
    with self.lock:
      return self.pg.getFEMCurvMomentDataIds()

  ## Gets a list of FEMCurvMomentData object proxies.
  #
  # @param ids list of FEMCurvMomentData object IDs
  # @return list of FEMCurvMomentData object proxies
  def getFEMCurvMomentDataList(self, ids, current=None):
    logging.debug('getFEMCurvMomentDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMCurvMomentData(id) for id in ids]

  ## Gets a list of FEMCurvMomentData fields objects.
  #
  # @param ids list of FEMCurvMomentData object IDs
  # @return list of FEMCurvMomentData fields objects
  def getFEMCurvMomentDataFieldsList(self, ids, current=None):
    logging.debug('getFEMCurvMomentDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMCurvMomentDataFields(id) for id in ids]

  ## Gets a list of all FEMCurvMomentData object IDs.
  #
  # @param fields FEMCurvMomentData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMCurvMomentData objects
  #
  def findEqualFEMCurvMomentData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMCurvMomentData()')
    with self.lock:
      ids = self.pg.findEqualFEMCurvMomentData(fields, fieldNames)
    return ids

  ## Adds a FEMPropertysets object to the store.
  #
  # @param fields  FEMPropertysetsFields object
  # @return newly assigned ID
  def addFEMPropertysets(self, fields, current=None):
    logging.debug('addFEMPropertysets()')
    with self.lock:
      self.pg.addFEMPropertysets(fields)
    return fields.id


  ## Adds a set of FEMPropertysets objects to the store.
  #
  # @param fieldsList  list of FEMPropertysetsFields objects
  # @return list of newly assigned IDs
  def addFEMPropertysetsList(self, fieldsList, current=None):
    logging.debug('addFEMPropertysetsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPropertysetsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPropertysets object proxy by its ID.
  #
  # @param id FEMPropertysets object ID
  # @return FEMPropertysets object proxy
  def getFEMPropertysets(self, id, current=None):
    logging.debug('getFEMPropertysets(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPropertysets.has_key(id):
        logging.debug('Fetched FEMPropertysets[oid=%d] servant from cache', id)
        return self.registryFEMPropertysets[id]
      obj = FEMPropertysetsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPropertysetsPrx.uncheckedCast(srvt)
      self.registryFEMPropertysets[id] = prx
    logging.debug('Activated FEMPropertysets[oid=%d] servant', id)
    return prx

  ## Gets the FEMPropertysets object fields.
  #
  # @param id FEMPropertysets object ID
  # @return FEMPropertysetsFields object
  def getFEMPropertysetsFields(self, id, current=None):
    logging.debug('getFEMPropertysetsFields(oid=%d)' % id)
    return self._getFEMPropertysetsFields(id, current)

  ## Gets the FEMPropertysets object fields.
  #
  # @param id FEMPropertysets object ID
  # @return FEMPropertysetsFields object
  def _getFEMPropertysetsFields(self, id, current=None):
    fields = SenStore.FEMPropertysetsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPropertysets(fields):
          return None
    return fields

  ## Sets the FEMPropertysets object fields.
  #
  # @param fields     FEMPropertysets fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPropertysetsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPropertysetsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPropertysets(fields, fieldNames)

  ## Gets a list of IDs of all FEMPropertysets objects.
  #
  # @return ids list of FEMPropertysets object IDs
  def getFEMPropertysetsIds(self, current=None):
    logging.debug('getFEMPropertysetsList()')
    with self.lock:
      return self.pg.getFEMPropertysetsIds()

  ## Gets a list of FEMPropertysets object proxies.
  #
  # @param ids list of FEMPropertysets object IDs
  # @return list of FEMPropertysets object proxies
  def getFEMPropertysetsList(self, ids, current=None):
    logging.debug('getFEMPropertysetsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPropertysets(id) for id in ids]

  ## Gets a list of FEMPropertysets fields objects.
  #
  # @param ids list of FEMPropertysets object IDs
  # @return list of FEMPropertysets fields objects
  def getFEMPropertysetsFieldsList(self, ids, current=None):
    logging.debug('getFEMPropertysetsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPropertysetsFields(id) for id in ids]

  ## Gets a list of all FEMPropertysets object IDs.
  #
  # @param fields FEMPropertysets object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPropertysets objects
  #
  def findEqualFEMPropertysets(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPropertysets()')
    with self.lock:
      ids = self.pg.findEqualFEMPropertysets(fields, fieldNames)
    return ids

  ## Adds a FEMOrthotropicMaterial object to the store.
  #
  # @param fields  FEMOrthotropicMaterialFields object
  # @return newly assigned ID
  def addFEMOrthotropicMaterial(self, fields, current=None):
    logging.debug('addFEMOrthotropicMaterial()')
    with self.lock:
      self.pg.addFEMOrthotropicMaterial(fields)
    return fields.id


  ## Adds a set of FEMOrthotropicMaterial objects to the store.
  #
  # @param fieldsList  list of FEMOrthotropicMaterialFields objects
  # @return list of newly assigned IDs
  def addFEMOrthotropicMaterialList(self, fieldsList, current=None):
    logging.debug('addFEMOrthotropicMaterialList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMOrthotropicMaterialList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMOrthotropicMaterial object proxy by its ID.
  #
  # @param id FEMOrthotropicMaterial object ID
  # @return FEMOrthotropicMaterial object proxy
  def getFEMOrthotropicMaterial(self, id, current=None):
    logging.debug('getFEMOrthotropicMaterial(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMOrthotropicMaterial.has_key(id):
        logging.debug('Fetched FEMOrthotropicMaterial[oid=%d] servant from cache', id)
        return self.registryFEMOrthotropicMaterial[id]
      obj = FEMOrthotropicMaterialI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMOrthotropicMaterialPrx.uncheckedCast(srvt)
      self.registryFEMOrthotropicMaterial[id] = prx
    logging.debug('Activated FEMOrthotropicMaterial[oid=%d] servant', id)
    return prx

  ## Gets the FEMOrthotropicMaterial object fields.
  #
  # @param id FEMOrthotropicMaterial object ID
  # @return FEMOrthotropicMaterialFields object
  def getFEMOrthotropicMaterialFields(self, id, current=None):
    logging.debug('getFEMOrthotropicMaterialFields(oid=%d)' % id)
    return self._getFEMOrthotropicMaterialFields(id, current)

  ## Gets the FEMOrthotropicMaterial object fields.
  #
  # @param id FEMOrthotropicMaterial object ID
  # @return FEMOrthotropicMaterialFields object
  def _getFEMOrthotropicMaterialFields(self, id, current=None):
    fields = SenStore.FEMOrthotropicMaterialFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMOrthotropicMaterial(fields):
          return None
    return fields

  ## Sets the FEMOrthotropicMaterial object fields.
  #
  # @param fields     FEMOrthotropicMaterial fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMOrthotropicMaterialFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMOrthotropicMaterialFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMOrthotropicMaterial(fields, fieldNames)

  ## Gets a list of IDs of all FEMOrthotropicMaterial objects.
  #
  # @return ids list of FEMOrthotropicMaterial object IDs
  def getFEMOrthotropicMaterialIds(self, current=None):
    logging.debug('getFEMOrthotropicMaterialList()')
    with self.lock:
      return self.pg.getFEMOrthotropicMaterialIds()

  ## Gets a list of FEMOrthotropicMaterial object proxies.
  #
  # @param ids list of FEMOrthotropicMaterial object IDs
  # @return list of FEMOrthotropicMaterial object proxies
  def getFEMOrthotropicMaterialList(self, ids, current=None):
    logging.debug('getFEMOrthotropicMaterialList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMOrthotropicMaterial(id) for id in ids]

  ## Gets a list of FEMOrthotropicMaterial fields objects.
  #
  # @param ids list of FEMOrthotropicMaterial object IDs
  # @return list of FEMOrthotropicMaterial fields objects
  def getFEMOrthotropicMaterialFieldsList(self, ids, current=None):
    logging.debug('getFEMOrthotropicMaterialFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMOrthotropicMaterialFields(id) for id in ids]

  ## Gets a list of all FEMOrthotropicMaterial object IDs.
  #
  # @param fields FEMOrthotropicMaterial object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMOrthotropicMaterial objects
  #
  def findEqualFEMOrthotropicMaterial(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMOrthotropicMaterial()')
    with self.lock:
      ids = self.pg.findEqualFEMOrthotropicMaterial(fields, fieldNames)
    return ids

  ## Adds a FEMAppliedLoads object to the store.
  #
  # @param fields  FEMAppliedLoadsFields object
  # @return newly assigned ID
  def addFEMAppliedLoads(self, fields, current=None):
    logging.debug('addFEMAppliedLoads()')
    with self.lock:
      self.pg.addFEMAppliedLoads(fields)
    return fields.id


  ## Adds a set of FEMAppliedLoads objects to the store.
  #
  # @param fieldsList  list of FEMAppliedLoadsFields objects
  # @return list of newly assigned IDs
  def addFEMAppliedLoadsList(self, fieldsList, current=None):
    logging.debug('addFEMAppliedLoadsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMAppliedLoadsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMAppliedLoads object proxy by its ID.
  #
  # @param id FEMAppliedLoads object ID
  # @return FEMAppliedLoads object proxy
  def getFEMAppliedLoads(self, id, current=None):
    logging.debug('getFEMAppliedLoads(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMAppliedLoads.has_key(id):
        logging.debug('Fetched FEMAppliedLoads[oid=%d] servant from cache', id)
        return self.registryFEMAppliedLoads[id]
      obj = FEMAppliedLoadsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMAppliedLoadsPrx.uncheckedCast(srvt)
      self.registryFEMAppliedLoads[id] = prx
    logging.debug('Activated FEMAppliedLoads[oid=%d] servant', id)
    return prx

  ## Gets the FEMAppliedLoads object fields.
  #
  # @param id FEMAppliedLoads object ID
  # @return FEMAppliedLoadsFields object
  def getFEMAppliedLoadsFields(self, id, current=None):
    logging.debug('getFEMAppliedLoadsFields(oid=%d)' % id)
    return self._getFEMAppliedLoadsFields(id, current)

  ## Gets the FEMAppliedLoads object fields.
  #
  # @param id FEMAppliedLoads object ID
  # @return FEMAppliedLoadsFields object
  def _getFEMAppliedLoadsFields(self, id, current=None):
    fields = SenStore.FEMAppliedLoadsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMAppliedLoads(fields):
          return None
    return fields

  ## Sets the FEMAppliedLoads object fields.
  #
  # @param fields     FEMAppliedLoads fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMAppliedLoadsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMAppliedLoadsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMAppliedLoads(fields, fieldNames)

  ## Gets a list of IDs of all FEMAppliedLoads objects.
  #
  # @return ids list of FEMAppliedLoads object IDs
  def getFEMAppliedLoadsIds(self, current=None):
    logging.debug('getFEMAppliedLoadsList()')
    with self.lock:
      return self.pg.getFEMAppliedLoadsIds()

  ## Gets a list of FEMAppliedLoads object proxies.
  #
  # @param ids list of FEMAppliedLoads object IDs
  # @return list of FEMAppliedLoads object proxies
  def getFEMAppliedLoadsList(self, ids, current=None):
    logging.debug('getFEMAppliedLoadsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMAppliedLoads(id) for id in ids]

  ## Gets a list of FEMAppliedLoads fields objects.
  #
  # @param ids list of FEMAppliedLoads object IDs
  # @return list of FEMAppliedLoads fields objects
  def getFEMAppliedLoadsFieldsList(self, ids, current=None):
    logging.debug('getFEMAppliedLoadsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMAppliedLoadsFields(id) for id in ids]

  ## Gets a list of all FEMAppliedLoads object IDs.
  #
  # @param fields FEMAppliedLoads object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMAppliedLoads objects
  #
  def findEqualFEMAppliedLoads(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMAppliedLoads()')
    with self.lock:
      ids = self.pg.findEqualFEMAppliedLoads(fields, fieldNames)
    return ids

  ## Adds a FEMThermoOrthData object to the store.
  #
  # @param fields  FEMThermoOrthDataFields object
  # @return newly assigned ID
  def addFEMThermoOrthData(self, fields, current=None):
    logging.debug('addFEMThermoOrthData()')
    with self.lock:
      self.pg.addFEMThermoOrthData(fields)
    return fields.id


  ## Adds a set of FEMThermoOrthData objects to the store.
  #
  # @param fieldsList  list of FEMThermoOrthDataFields objects
  # @return list of newly assigned IDs
  def addFEMThermoOrthDataList(self, fieldsList, current=None):
    logging.debug('addFEMThermoOrthDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThermoOrthDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThermoOrthData object proxy by its ID.
  #
  # @param id FEMThermoOrthData object ID
  # @return FEMThermoOrthData object proxy
  def getFEMThermoOrthData(self, id, current=None):
    logging.debug('getFEMThermoOrthData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThermoOrthData.has_key(id):
        logging.debug('Fetched FEMThermoOrthData[oid=%d] servant from cache', id)
        return self.registryFEMThermoOrthData[id]
      obj = FEMThermoOrthDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThermoOrthDataPrx.uncheckedCast(srvt)
      self.registryFEMThermoOrthData[id] = prx
    logging.debug('Activated FEMThermoOrthData[oid=%d] servant', id)
    return prx

  ## Gets the FEMThermoOrthData object fields.
  #
  # @param id FEMThermoOrthData object ID
  # @return FEMThermoOrthDataFields object
  def getFEMThermoOrthDataFields(self, id, current=None):
    logging.debug('getFEMThermoOrthDataFields(oid=%d)' % id)
    return self._getFEMThermoOrthDataFields(id, current)

  ## Gets the FEMThermoOrthData object fields.
  #
  # @param id FEMThermoOrthData object ID
  # @return FEMThermoOrthDataFields object
  def _getFEMThermoOrthDataFields(self, id, current=None):
    fields = SenStore.FEMThermoOrthDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThermoOrthData(fields):
          return None
    return fields

  ## Sets the FEMThermoOrthData object fields.
  #
  # @param fields     FEMThermoOrthData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThermoOrthDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThermoOrthDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThermoOrthData(fields, fieldNames)

  ## Gets a list of IDs of all FEMThermoOrthData objects.
  #
  # @return ids list of FEMThermoOrthData object IDs
  def getFEMThermoOrthDataIds(self, current=None):
    logging.debug('getFEMThermoOrthDataList()')
    with self.lock:
      return self.pg.getFEMThermoOrthDataIds()

  ## Gets a list of FEMThermoOrthData object proxies.
  #
  # @param ids list of FEMThermoOrthData object IDs
  # @return list of FEMThermoOrthData object proxies
  def getFEMThermoOrthDataList(self, ids, current=None):
    logging.debug('getFEMThermoOrthDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThermoOrthData(id) for id in ids]

  ## Gets a list of FEMThermoOrthData fields objects.
  #
  # @param ids list of FEMThermoOrthData object IDs
  # @return list of FEMThermoOrthData fields objects
  def getFEMThermoOrthDataFieldsList(self, ids, current=None):
    logging.debug('getFEMThermoOrthDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThermoOrthDataFields(id) for id in ids]

  ## Gets a list of all FEMThermoOrthData object IDs.
  #
  # @param fields FEMThermoOrthData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThermoOrthData objects
  #
  def findEqualFEMThermoOrthData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThermoOrthData()')
    with self.lock:
      ids = self.pg.findEqualFEMThermoOrthData(fields, fieldNames)
    return ids

  ## Adds a FEMContactPairs object to the store.
  #
  # @param fields  FEMContactPairsFields object
  # @return newly assigned ID
  def addFEMContactPairs(self, fields, current=None):
    logging.debug('addFEMContactPairs()')
    with self.lock:
      self.pg.addFEMContactPairs(fields)
    return fields.id


  ## Adds a set of FEMContactPairs objects to the store.
  #
  # @param fieldsList  list of FEMContactPairsFields objects
  # @return list of newly assigned IDs
  def addFEMContactPairsList(self, fieldsList, current=None):
    logging.debug('addFEMContactPairsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMContactPairsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMContactPairs object proxy by its ID.
  #
  # @param id FEMContactPairs object ID
  # @return FEMContactPairs object proxy
  def getFEMContactPairs(self, id, current=None):
    logging.debug('getFEMContactPairs(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMContactPairs.has_key(id):
        logging.debug('Fetched FEMContactPairs[oid=%d] servant from cache', id)
        return self.registryFEMContactPairs[id]
      obj = FEMContactPairsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMContactPairsPrx.uncheckedCast(srvt)
      self.registryFEMContactPairs[id] = prx
    logging.debug('Activated FEMContactPairs[oid=%d] servant', id)
    return prx

  ## Gets the FEMContactPairs object fields.
  #
  # @param id FEMContactPairs object ID
  # @return FEMContactPairsFields object
  def getFEMContactPairsFields(self, id, current=None):
    logging.debug('getFEMContactPairsFields(oid=%d)' % id)
    return self._getFEMContactPairsFields(id, current)

  ## Gets the FEMContactPairs object fields.
  #
  # @param id FEMContactPairs object ID
  # @return FEMContactPairsFields object
  def _getFEMContactPairsFields(self, id, current=None):
    fields = SenStore.FEMContactPairsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMContactPairs(fields):
          return None
    return fields

  ## Sets the FEMContactPairs object fields.
  #
  # @param fields     FEMContactPairs fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMContactPairsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMContactPairsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMContactPairs(fields, fieldNames)

  ## Gets a list of IDs of all FEMContactPairs objects.
  #
  # @return ids list of FEMContactPairs object IDs
  def getFEMContactPairsIds(self, current=None):
    logging.debug('getFEMContactPairsList()')
    with self.lock:
      return self.pg.getFEMContactPairsIds()

  ## Gets a list of FEMContactPairs object proxies.
  #
  # @param ids list of FEMContactPairs object IDs
  # @return list of FEMContactPairs object proxies
  def getFEMContactPairsList(self, ids, current=None):
    logging.debug('getFEMContactPairsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMContactPairs(id) for id in ids]

  ## Gets a list of FEMContactPairs fields objects.
  #
  # @param ids list of FEMContactPairs object IDs
  # @return list of FEMContactPairs fields objects
  def getFEMContactPairsFieldsList(self, ids, current=None):
    logging.debug('getFEMContactPairsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMContactPairsFields(id) for id in ids]

  ## Gets a list of all FEMContactPairs object IDs.
  #
  # @param fields FEMContactPairs object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMContactPairs objects
  #
  def findEqualFEMContactPairs(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMContactPairs()')
    with self.lock:
      ids = self.pg.findEqualFEMContactPairs(fields, fieldNames)
    return ids

  ## Adds a FEMGeneral object to the store.
  #
  # @param fields  FEMGeneralFields object
  # @return newly assigned ID
  def addFEMGeneral(self, fields, current=None):
    logging.debug('addFEMGeneral()')
    with self.lock:
      self.pg.addFEMGeneral(fields)
    return fields.id


  ## Adds a set of FEMGeneral objects to the store.
  #
  # @param fieldsList  list of FEMGeneralFields objects
  # @return list of newly assigned IDs
  def addFEMGeneralList(self, fieldsList, current=None):
    logging.debug('addFEMGeneralList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMGeneralList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMGeneral object proxy by its ID.
  #
  # @param id FEMGeneral object ID
  # @return FEMGeneral object proxy
  def getFEMGeneral(self, id, current=None):
    logging.debug('getFEMGeneral(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMGeneral.has_key(id):
        logging.debug('Fetched FEMGeneral[oid=%d] servant from cache', id)
        return self.registryFEMGeneral[id]
      obj = FEMGeneralI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMGeneralPrx.uncheckedCast(srvt)
      self.registryFEMGeneral[id] = prx
    logging.debug('Activated FEMGeneral[oid=%d] servant', id)
    return prx

  ## Gets the FEMGeneral object fields.
  #
  # @param id FEMGeneral object ID
  # @return FEMGeneralFields object
  def getFEMGeneralFields(self, id, current=None):
    logging.debug('getFEMGeneralFields(oid=%d)' % id)
    return self._getFEMGeneralFields(id, current)

  ## Gets the FEMGeneral object fields.
  #
  # @param id FEMGeneral object ID
  # @return FEMGeneralFields object
  def _getFEMGeneralFields(self, id, current=None):
    fields = SenStore.FEMGeneralFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMGeneral(fields):
          return None
    return fields

  ## Sets the FEMGeneral object fields.
  #
  # @param fields     FEMGeneral fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMGeneralFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMGeneralFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMGeneral(fields, fieldNames)

  ## Gets a list of IDs of all FEMGeneral objects.
  #
  # @return ids list of FEMGeneral object IDs
  def getFEMGeneralIds(self, current=None):
    logging.debug('getFEMGeneralList()')
    with self.lock:
      return self.pg.getFEMGeneralIds()

  ## Gets a list of FEMGeneral object proxies.
  #
  # @param ids list of FEMGeneral object IDs
  # @return list of FEMGeneral object proxies
  def getFEMGeneralList(self, ids, current=None):
    logging.debug('getFEMGeneralList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMGeneral(id) for id in ids]

  ## Gets a list of FEMGeneral fields objects.
  #
  # @param ids list of FEMGeneral object IDs
  # @return list of FEMGeneral fields objects
  def getFEMGeneralFieldsList(self, ids, current=None):
    logging.debug('getFEMGeneralFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMGeneralFields(id) for id in ids]

  ## Gets a list of all FEMGeneral object IDs.
  #
  # @param fields FEMGeneral object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMGeneral objects
  #
  def findEqualFEMGeneral(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMGeneral()')
    with self.lock:
      ids = self.pg.findEqualFEMGeneral(fields, fieldNames)
    return ids

  ## Adds a FEMBeamNode object to the store.
  #
  # @param fields  FEMBeamNodeFields object
  # @return newly assigned ID
  def addFEMBeamNode(self, fields, current=None):
    logging.debug('addFEMBeamNode()')
    with self.lock:
      self.pg.addFEMBeamNode(fields)
    return fields.id


  ## Adds a set of FEMBeamNode objects to the store.
  #
  # @param fieldsList  list of FEMBeamNodeFields objects
  # @return list of newly assigned IDs
  def addFEMBeamNodeList(self, fieldsList, current=None):
    logging.debug('addFEMBeamNodeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMBeamNodeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMBeamNode object proxy by its ID.
  #
  # @param id FEMBeamNode object ID
  # @return FEMBeamNode object proxy
  def getFEMBeamNode(self, id, current=None):
    logging.debug('getFEMBeamNode(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMBeamNode.has_key(id):
        logging.debug('Fetched FEMBeamNode[oid=%d] servant from cache', id)
        return self.registryFEMBeamNode[id]
      obj = FEMBeamNodeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMBeamNodePrx.uncheckedCast(srvt)
      self.registryFEMBeamNode[id] = prx
    logging.debug('Activated FEMBeamNode[oid=%d] servant', id)
    return prx

  ## Gets the FEMBeamNode object fields.
  #
  # @param id FEMBeamNode object ID
  # @return FEMBeamNodeFields object
  def getFEMBeamNodeFields(self, id, current=None):
    logging.debug('getFEMBeamNodeFields(oid=%d)' % id)
    return self._getFEMBeamNodeFields(id, current)

  ## Gets the FEMBeamNode object fields.
  #
  # @param id FEMBeamNode object ID
  # @return FEMBeamNodeFields object
  def _getFEMBeamNodeFields(self, id, current=None):
    fields = SenStore.FEMBeamNodeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMBeamNode(fields):
          return None
    return fields

  ## Sets the FEMBeamNode object fields.
  #
  # @param fields     FEMBeamNode fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMBeamNodeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMBeamNodeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMBeamNode(fields, fieldNames)

  ## Gets a list of IDs of all FEMBeamNode objects.
  #
  # @return ids list of FEMBeamNode object IDs
  def getFEMBeamNodeIds(self, current=None):
    logging.debug('getFEMBeamNodeList()')
    with self.lock:
      return self.pg.getFEMBeamNodeIds()

  ## Gets a list of FEMBeamNode object proxies.
  #
  # @param ids list of FEMBeamNode object IDs
  # @return list of FEMBeamNode object proxies
  def getFEMBeamNodeList(self, ids, current=None):
    logging.debug('getFEMBeamNodeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMBeamNode(id) for id in ids]

  ## Gets a list of FEMBeamNode fields objects.
  #
  # @param ids list of FEMBeamNode object IDs
  # @return list of FEMBeamNode fields objects
  def getFEMBeamNodeFieldsList(self, ids, current=None):
    logging.debug('getFEMBeamNodeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMBeamNodeFields(id) for id in ids]

  ## Gets a list of all FEMBeamNode object IDs.
  #
  # @param fields FEMBeamNode object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMBeamNode objects
  #
  def findEqualFEMBeamNode(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMBeamNode()')
    with self.lock:
      ids = self.pg.findEqualFEMBeamNode(fields, fieldNames)
    return ids

  ## Adds a FEMSectionRect object to the store.
  #
  # @param fields  FEMSectionRectFields object
  # @return newly assigned ID
  def addFEMSectionRect(self, fields, current=None):
    logging.debug('addFEMSectionRect()')
    with self.lock:
      self.pg.addFEMSectionRect(fields)
    return fields.id


  ## Adds a set of FEMSectionRect objects to the store.
  #
  # @param fieldsList  list of FEMSectionRectFields objects
  # @return list of newly assigned IDs
  def addFEMSectionRectList(self, fieldsList, current=None):
    logging.debug('addFEMSectionRectList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSectionRectList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSectionRect object proxy by its ID.
  #
  # @param id FEMSectionRect object ID
  # @return FEMSectionRect object proxy
  def getFEMSectionRect(self, id, current=None):
    logging.debug('getFEMSectionRect(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSectionRect.has_key(id):
        logging.debug('Fetched FEMSectionRect[oid=%d] servant from cache', id)
        return self.registryFEMSectionRect[id]
      obj = FEMSectionRectI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSectionRectPrx.uncheckedCast(srvt)
      self.registryFEMSectionRect[id] = prx
    logging.debug('Activated FEMSectionRect[oid=%d] servant', id)
    return prx

  ## Gets the FEMSectionRect object fields.
  #
  # @param id FEMSectionRect object ID
  # @return FEMSectionRectFields object
  def getFEMSectionRectFields(self, id, current=None):
    logging.debug('getFEMSectionRectFields(oid=%d)' % id)
    return self._getFEMSectionRectFields(id, current)

  ## Gets the FEMSectionRect object fields.
  #
  # @param id FEMSectionRect object ID
  # @return FEMSectionRectFields object
  def _getFEMSectionRectFields(self, id, current=None):
    fields = SenStore.FEMSectionRectFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSectionRect(fields):
          return None
    return fields

  ## Sets the FEMSectionRect object fields.
  #
  # @param fields     FEMSectionRect fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSectionRectFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSectionRectFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSectionRect(fields, fieldNames)

  ## Gets a list of IDs of all FEMSectionRect objects.
  #
  # @return ids list of FEMSectionRect object IDs
  def getFEMSectionRectIds(self, current=None):
    logging.debug('getFEMSectionRectList()')
    with self.lock:
      return self.pg.getFEMSectionRectIds()

  ## Gets a list of FEMSectionRect object proxies.
  #
  # @param ids list of FEMSectionRect object IDs
  # @return list of FEMSectionRect object proxies
  def getFEMSectionRectList(self, ids, current=None):
    logging.debug('getFEMSectionRectList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSectionRect(id) for id in ids]

  ## Gets a list of FEMSectionRect fields objects.
  #
  # @param ids list of FEMSectionRect object IDs
  # @return list of FEMSectionRect fields objects
  def getFEMSectionRectFieldsList(self, ids, current=None):
    logging.debug('getFEMSectionRectFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSectionRectFields(id) for id in ids]

  ## Gets a list of all FEMSectionRect object IDs.
  #
  # @param fields FEMSectionRect object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSectionRect objects
  #
  def findEqualFEMSectionRect(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSectionRect()')
    with self.lock:
      ids = self.pg.findEqualFEMSectionRect(fields, fieldNames)
    return ids

  ## Adds a FEMBeamLoad object to the store.
  #
  # @param fields  FEMBeamLoadFields object
  # @return newly assigned ID
  def addFEMBeamLoad(self, fields, current=None):
    logging.debug('addFEMBeamLoad()')
    with self.lock:
      self.pg.addFEMBeamLoad(fields)
    return fields.id


  ## Adds a set of FEMBeamLoad objects to the store.
  #
  # @param fieldsList  list of FEMBeamLoadFields objects
  # @return list of newly assigned IDs
  def addFEMBeamLoadList(self, fieldsList, current=None):
    logging.debug('addFEMBeamLoadList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMBeamLoadList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMBeamLoad object proxy by its ID.
  #
  # @param id FEMBeamLoad object ID
  # @return FEMBeamLoad object proxy
  def getFEMBeamLoad(self, id, current=None):
    logging.debug('getFEMBeamLoad(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMBeamLoad.has_key(id):
        logging.debug('Fetched FEMBeamLoad[oid=%d] servant from cache', id)
        return self.registryFEMBeamLoad[id]
      obj = FEMBeamLoadI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMBeamLoadPrx.uncheckedCast(srvt)
      self.registryFEMBeamLoad[id] = prx
    logging.debug('Activated FEMBeamLoad[oid=%d] servant', id)
    return prx

  ## Gets the FEMBeamLoad object fields.
  #
  # @param id FEMBeamLoad object ID
  # @return FEMBeamLoadFields object
  def getFEMBeamLoadFields(self, id, current=None):
    logging.debug('getFEMBeamLoadFields(oid=%d)' % id)
    return self._getFEMBeamLoadFields(id, current)

  ## Gets the FEMBeamLoad object fields.
  #
  # @param id FEMBeamLoad object ID
  # @return FEMBeamLoadFields object
  def _getFEMBeamLoadFields(self, id, current=None):
    fields = SenStore.FEMBeamLoadFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMBeamLoad(fields):
          return None
    return fields

  ## Sets the FEMBeamLoad object fields.
  #
  # @param fields     FEMBeamLoad fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMBeamLoadFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMBeamLoadFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMBeamLoad(fields, fieldNames)

  ## Gets a list of IDs of all FEMBeamLoad objects.
  #
  # @return ids list of FEMBeamLoad object IDs
  def getFEMBeamLoadIds(self, current=None):
    logging.debug('getFEMBeamLoadList()')
    with self.lock:
      return self.pg.getFEMBeamLoadIds()

  ## Gets a list of FEMBeamLoad object proxies.
  #
  # @param ids list of FEMBeamLoad object IDs
  # @return list of FEMBeamLoad object proxies
  def getFEMBeamLoadList(self, ids, current=None):
    logging.debug('getFEMBeamLoadList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMBeamLoad(id) for id in ids]

  ## Gets a list of FEMBeamLoad fields objects.
  #
  # @param ids list of FEMBeamLoad object IDs
  # @return list of FEMBeamLoad fields objects
  def getFEMBeamLoadFieldsList(self, ids, current=None):
    logging.debug('getFEMBeamLoadFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMBeamLoadFields(id) for id in ids]

  ## Gets a list of all FEMBeamLoad object IDs.
  #
  # @param fields FEMBeamLoad object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMBeamLoad objects
  #
  def findEqualFEMBeamLoad(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMBeamLoad()')
    with self.lock:
      ids = self.pg.findEqualFEMBeamLoad(fields, fieldNames)
    return ids

  ## Adds a FEMLoadMassProportional object to the store.
  #
  # @param fields  FEMLoadMassProportionalFields object
  # @return newly assigned ID
  def addFEMLoadMassProportional(self, fields, current=None):
    logging.debug('addFEMLoadMassProportional()')
    with self.lock:
      self.pg.addFEMLoadMassProportional(fields)
    return fields.id


  ## Adds a set of FEMLoadMassProportional objects to the store.
  #
  # @param fieldsList  list of FEMLoadMassProportionalFields objects
  # @return list of newly assigned IDs
  def addFEMLoadMassProportionalList(self, fieldsList, current=None):
    logging.debug('addFEMLoadMassProportionalList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMLoadMassProportionalList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMLoadMassProportional object proxy by its ID.
  #
  # @param id FEMLoadMassProportional object ID
  # @return FEMLoadMassProportional object proxy
  def getFEMLoadMassProportional(self, id, current=None):
    logging.debug('getFEMLoadMassProportional(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMLoadMassProportional.has_key(id):
        logging.debug('Fetched FEMLoadMassProportional[oid=%d] servant from cache', id)
        return self.registryFEMLoadMassProportional[id]
      obj = FEMLoadMassProportionalI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMLoadMassProportionalPrx.uncheckedCast(srvt)
      self.registryFEMLoadMassProportional[id] = prx
    logging.debug('Activated FEMLoadMassProportional[oid=%d] servant', id)
    return prx

  ## Gets the FEMLoadMassProportional object fields.
  #
  # @param id FEMLoadMassProportional object ID
  # @return FEMLoadMassProportionalFields object
  def getFEMLoadMassProportionalFields(self, id, current=None):
    logging.debug('getFEMLoadMassProportionalFields(oid=%d)' % id)
    return self._getFEMLoadMassProportionalFields(id, current)

  ## Gets the FEMLoadMassProportional object fields.
  #
  # @param id FEMLoadMassProportional object ID
  # @return FEMLoadMassProportionalFields object
  def _getFEMLoadMassProportionalFields(self, id, current=None):
    fields = SenStore.FEMLoadMassProportionalFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMLoadMassProportional(fields):
          return None
    return fields

  ## Sets the FEMLoadMassProportional object fields.
  #
  # @param fields     FEMLoadMassProportional fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMLoadMassProportionalFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMLoadMassProportionalFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMLoadMassProportional(fields, fieldNames)

  ## Gets a list of IDs of all FEMLoadMassProportional objects.
  #
  # @return ids list of FEMLoadMassProportional object IDs
  def getFEMLoadMassProportionalIds(self, current=None):
    logging.debug('getFEMLoadMassProportionalList()')
    with self.lock:
      return self.pg.getFEMLoadMassProportionalIds()

  ## Gets a list of FEMLoadMassProportional object proxies.
  #
  # @param ids list of FEMLoadMassProportional object IDs
  # @return list of FEMLoadMassProportional object proxies
  def getFEMLoadMassProportionalList(self, ids, current=None):
    logging.debug('getFEMLoadMassProportionalList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMLoadMassProportional(id) for id in ids]

  ## Gets a list of FEMLoadMassProportional fields objects.
  #
  # @param ids list of FEMLoadMassProportional object IDs
  # @return list of FEMLoadMassProportional fields objects
  def getFEMLoadMassProportionalFieldsList(self, ids, current=None):
    logging.debug('getFEMLoadMassProportionalFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMLoadMassProportionalFields(id) for id in ids]

  ## Gets a list of all FEMLoadMassProportional object IDs.
  #
  # @param fields FEMLoadMassProportional object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMLoadMassProportional objects
  #
  def findEqualFEMLoadMassProportional(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMLoadMassProportional()')
    with self.lock:
      ids = self.pg.findEqualFEMLoadMassProportional(fields, fieldNames)
    return ids

  ## Adds a FEMLink object to the store.
  #
  # @param fields  FEMLinkFields object
  # @return newly assigned ID
  def addFEMLink(self, fields, current=None):
    logging.debug('addFEMLink()')
    with self.lock:
      self.pg.addFEMLink(fields)
    return fields.id


  ## Adds a set of FEMLink objects to the store.
  #
  # @param fieldsList  list of FEMLinkFields objects
  # @return list of newly assigned IDs
  def addFEMLinkList(self, fieldsList, current=None):
    logging.debug('addFEMLinkList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMLinkList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMLink object proxy by its ID.
  #
  # @param id FEMLink object ID
  # @return FEMLink object proxy
  def getFEMLink(self, id, current=None):
    logging.debug('getFEMLink(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMLink.has_key(id):
        logging.debug('Fetched FEMLink[oid=%d] servant from cache', id)
        return self.registryFEMLink[id]
      obj = FEMLinkI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMLinkPrx.uncheckedCast(srvt)
      self.registryFEMLink[id] = prx
    logging.debug('Activated FEMLink[oid=%d] servant', id)
    return prx

  ## Gets the FEMLink object fields.
  #
  # @param id FEMLink object ID
  # @return FEMLinkFields object
  def getFEMLinkFields(self, id, current=None):
    logging.debug('getFEMLinkFields(oid=%d)' % id)
    return self._getFEMLinkFields(id, current)

  ## Gets the FEMLink object fields.
  #
  # @param id FEMLink object ID
  # @return FEMLinkFields object
  def _getFEMLinkFields(self, id, current=None):
    fields = SenStore.FEMLinkFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMLink(fields):
          return None
    return fields

  ## Sets the FEMLink object fields.
  #
  # @param fields     FEMLink fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMLinkFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMLinkFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMLink(fields, fieldNames)

  ## Gets a list of IDs of all FEMLink objects.
  #
  # @return ids list of FEMLink object IDs
  def getFEMLinkIds(self, current=None):
    logging.debug('getFEMLinkList()')
    with self.lock:
      return self.pg.getFEMLinkIds()

  ## Gets a list of FEMLink object proxies.
  #
  # @param ids list of FEMLink object IDs
  # @return list of FEMLink object proxies
  def getFEMLinkList(self, ids, current=None):
    logging.debug('getFEMLinkList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMLink(id) for id in ids]

  ## Gets a list of FEMLink fields objects.
  #
  # @param ids list of FEMLink object IDs
  # @return list of FEMLink fields objects
  def getFEMLinkFieldsList(self, ids, current=None):
    logging.debug('getFEMLinkFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMLinkFields(id) for id in ids]

  ## Gets a list of all FEMLink object IDs.
  #
  # @param fields FEMLink object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMLink objects
  #
  def findEqualFEMLink(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMLink()')
    with self.lock:
      ids = self.pg.findEqualFEMLink(fields, fieldNames)
    return ids

  ## Adds a FEMAxesNode object to the store.
  #
  # @param fields  FEMAxesNodeFields object
  # @return newly assigned ID
  def addFEMAxesNode(self, fields, current=None):
    logging.debug('addFEMAxesNode()')
    with self.lock:
      self.pg.addFEMAxesNode(fields)
    return fields.id


  ## Adds a set of FEMAxesNode objects to the store.
  #
  # @param fieldsList  list of FEMAxesNodeFields objects
  # @return list of newly assigned IDs
  def addFEMAxesNodeList(self, fieldsList, current=None):
    logging.debug('addFEMAxesNodeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMAxesNodeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMAxesNode object proxy by its ID.
  #
  # @param id FEMAxesNode object ID
  # @return FEMAxesNode object proxy
  def getFEMAxesNode(self, id, current=None):
    logging.debug('getFEMAxesNode(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMAxesNode.has_key(id):
        logging.debug('Fetched FEMAxesNode[oid=%d] servant from cache', id)
        return self.registryFEMAxesNode[id]
      obj = FEMAxesNodeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMAxesNodePrx.uncheckedCast(srvt)
      self.registryFEMAxesNode[id] = prx
    logging.debug('Activated FEMAxesNode[oid=%d] servant', id)
    return prx

  ## Gets the FEMAxesNode object fields.
  #
  # @param id FEMAxesNode object ID
  # @return FEMAxesNodeFields object
  def getFEMAxesNodeFields(self, id, current=None):
    logging.debug('getFEMAxesNodeFields(oid=%d)' % id)
    return self._getFEMAxesNodeFields(id, current)

  ## Gets the FEMAxesNode object fields.
  #
  # @param id FEMAxesNode object ID
  # @return FEMAxesNodeFields object
  def _getFEMAxesNodeFields(self, id, current=None):
    fields = SenStore.FEMAxesNodeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMAxesNode(fields):
          return None
    return fields

  ## Sets the FEMAxesNode object fields.
  #
  # @param fields     FEMAxesNode fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMAxesNodeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMAxesNodeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMAxesNode(fields, fieldNames)

  ## Gets a list of IDs of all FEMAxesNode objects.
  #
  # @return ids list of FEMAxesNode object IDs
  def getFEMAxesNodeIds(self, current=None):
    logging.debug('getFEMAxesNodeList()')
    with self.lock:
      return self.pg.getFEMAxesNodeIds()

  ## Gets a list of FEMAxesNode object proxies.
  #
  # @param ids list of FEMAxesNode object IDs
  # @return list of FEMAxesNode object proxies
  def getFEMAxesNodeList(self, ids, current=None):
    logging.debug('getFEMAxesNodeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMAxesNode(id) for id in ids]

  ## Gets a list of FEMAxesNode fields objects.
  #
  # @param ids list of FEMAxesNode object IDs
  # @return list of FEMAxesNode fields objects
  def getFEMAxesNodeFieldsList(self, ids, current=None):
    logging.debug('getFEMAxesNodeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMAxesNodeFields(id) for id in ids]

  ## Gets a list of all FEMAxesNode object IDs.
  #
  # @param fields FEMAxesNode object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMAxesNode objects
  #
  def findEqualFEMAxesNode(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMAxesNode()')
    with self.lock:
      ids = self.pg.findEqualFEMAxesNode(fields, fieldNames)
    return ids

  ## Adds a FEMNMTimeMass object to the store.
  #
  # @param fields  FEMNMTimeMassFields object
  # @return newly assigned ID
  def addFEMNMTimeMass(self, fields, current=None):
    logging.debug('addFEMNMTimeMass()')
    with self.lock:
      self.pg.addFEMNMTimeMass(fields)
    return fields.id


  ## Adds a set of FEMNMTimeMass objects to the store.
  #
  # @param fieldsList  list of FEMNMTimeMassFields objects
  # @return list of newly assigned IDs
  def addFEMNMTimeMassList(self, fieldsList, current=None):
    logging.debug('addFEMNMTimeMassList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNMTimeMassList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNMTimeMass object proxy by its ID.
  #
  # @param id FEMNMTimeMass object ID
  # @return FEMNMTimeMass object proxy
  def getFEMNMTimeMass(self, id, current=None):
    logging.debug('getFEMNMTimeMass(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNMTimeMass.has_key(id):
        logging.debug('Fetched FEMNMTimeMass[oid=%d] servant from cache', id)
        return self.registryFEMNMTimeMass[id]
      obj = FEMNMTimeMassI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNMTimeMassPrx.uncheckedCast(srvt)
      self.registryFEMNMTimeMass[id] = prx
    logging.debug('Activated FEMNMTimeMass[oid=%d] servant', id)
    return prx

  ## Gets the FEMNMTimeMass object fields.
  #
  # @param id FEMNMTimeMass object ID
  # @return FEMNMTimeMassFields object
  def getFEMNMTimeMassFields(self, id, current=None):
    logging.debug('getFEMNMTimeMassFields(oid=%d)' % id)
    return self._getFEMNMTimeMassFields(id, current)

  ## Gets the FEMNMTimeMass object fields.
  #
  # @param id FEMNMTimeMass object ID
  # @return FEMNMTimeMassFields object
  def _getFEMNMTimeMassFields(self, id, current=None):
    fields = SenStore.FEMNMTimeMassFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNMTimeMass(fields):
          return None
    return fields

  ## Sets the FEMNMTimeMass object fields.
  #
  # @param fields     FEMNMTimeMass fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNMTimeMassFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNMTimeMassFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNMTimeMass(fields, fieldNames)

  ## Gets a list of IDs of all FEMNMTimeMass objects.
  #
  # @return ids list of FEMNMTimeMass object IDs
  def getFEMNMTimeMassIds(self, current=None):
    logging.debug('getFEMNMTimeMassList()')
    with self.lock:
      return self.pg.getFEMNMTimeMassIds()

  ## Gets a list of FEMNMTimeMass object proxies.
  #
  # @param ids list of FEMNMTimeMass object IDs
  # @return list of FEMNMTimeMass object proxies
  def getFEMNMTimeMassList(self, ids, current=None):
    logging.debug('getFEMNMTimeMassList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNMTimeMass(id) for id in ids]

  ## Gets a list of FEMNMTimeMass fields objects.
  #
  # @param ids list of FEMNMTimeMass object IDs
  # @return list of FEMNMTimeMass fields objects
  def getFEMNMTimeMassFieldsList(self, ids, current=None):
    logging.debug('getFEMNMTimeMassFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNMTimeMassFields(id) for id in ids]

  ## Gets a list of all FEMNMTimeMass object IDs.
  #
  # @param fields FEMNMTimeMass object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNMTimeMass objects
  #
  def findEqualFEMNMTimeMass(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNMTimeMass()')
    with self.lock:
      ids = self.pg.findEqualFEMNMTimeMass(fields, fieldNames)
    return ids

  ## Adds a FEMAppliedDisplacement object to the store.
  #
  # @param fields  FEMAppliedDisplacementFields object
  # @return newly assigned ID
  def addFEMAppliedDisplacement(self, fields, current=None):
    logging.debug('addFEMAppliedDisplacement()')
    with self.lock:
      self.pg.addFEMAppliedDisplacement(fields)
    return fields.id


  ## Adds a set of FEMAppliedDisplacement objects to the store.
  #
  # @param fieldsList  list of FEMAppliedDisplacementFields objects
  # @return list of newly assigned IDs
  def addFEMAppliedDisplacementList(self, fieldsList, current=None):
    logging.debug('addFEMAppliedDisplacementList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMAppliedDisplacementList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMAppliedDisplacement object proxy by its ID.
  #
  # @param id FEMAppliedDisplacement object ID
  # @return FEMAppliedDisplacement object proxy
  def getFEMAppliedDisplacement(self, id, current=None):
    logging.debug('getFEMAppliedDisplacement(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMAppliedDisplacement.has_key(id):
        logging.debug('Fetched FEMAppliedDisplacement[oid=%d] servant from cache', id)
        return self.registryFEMAppliedDisplacement[id]
      obj = FEMAppliedDisplacementI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMAppliedDisplacementPrx.uncheckedCast(srvt)
      self.registryFEMAppliedDisplacement[id] = prx
    logging.debug('Activated FEMAppliedDisplacement[oid=%d] servant', id)
    return prx

  ## Gets the FEMAppliedDisplacement object fields.
  #
  # @param id FEMAppliedDisplacement object ID
  # @return FEMAppliedDisplacementFields object
  def getFEMAppliedDisplacementFields(self, id, current=None):
    logging.debug('getFEMAppliedDisplacementFields(oid=%d)' % id)
    return self._getFEMAppliedDisplacementFields(id, current)

  ## Gets the FEMAppliedDisplacement object fields.
  #
  # @param id FEMAppliedDisplacement object ID
  # @return FEMAppliedDisplacementFields object
  def _getFEMAppliedDisplacementFields(self, id, current=None):
    fields = SenStore.FEMAppliedDisplacementFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMAppliedDisplacement(fields):
          return None
    return fields

  ## Sets the FEMAppliedDisplacement object fields.
  #
  # @param fields     FEMAppliedDisplacement fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMAppliedDisplacementFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMAppliedDisplacementFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMAppliedDisplacement(fields, fieldNames)

  ## Gets a list of IDs of all FEMAppliedDisplacement objects.
  #
  # @return ids list of FEMAppliedDisplacement object IDs
  def getFEMAppliedDisplacementIds(self, current=None):
    logging.debug('getFEMAppliedDisplacementList()')
    with self.lock:
      return self.pg.getFEMAppliedDisplacementIds()

  ## Gets a list of FEMAppliedDisplacement object proxies.
  #
  # @param ids list of FEMAppliedDisplacement object IDs
  # @return list of FEMAppliedDisplacement object proxies
  def getFEMAppliedDisplacementList(self, ids, current=None):
    logging.debug('getFEMAppliedDisplacementList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMAppliedDisplacement(id) for id in ids]

  ## Gets a list of FEMAppliedDisplacement fields objects.
  #
  # @param ids list of FEMAppliedDisplacement object IDs
  # @return list of FEMAppliedDisplacement fields objects
  def getFEMAppliedDisplacementFieldsList(self, ids, current=None):
    logging.debug('getFEMAppliedDisplacementFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMAppliedDisplacementFields(id) for id in ids]

  ## Gets a list of all FEMAppliedDisplacement object IDs.
  #
  # @param fields FEMAppliedDisplacement object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMAppliedDisplacement objects
  #
  def findEqualFEMAppliedDisplacement(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMAppliedDisplacement()')
    with self.lock:
      ids = self.pg.findEqualFEMAppliedDisplacement(fields, fieldNames)
    return ids

  ## Adds a FEMTimeFunctions object to the store.
  #
  # @param fields  FEMTimeFunctionsFields object
  # @return newly assigned ID
  def addFEMTimeFunctions(self, fields, current=None):
    logging.debug('addFEMTimeFunctions()')
    with self.lock:
      self.pg.addFEMTimeFunctions(fields)
    return fields.id


  ## Adds a set of FEMTimeFunctions objects to the store.
  #
  # @param fieldsList  list of FEMTimeFunctionsFields objects
  # @return list of newly assigned IDs
  def addFEMTimeFunctionsList(self, fieldsList, current=None):
    logging.debug('addFEMTimeFunctionsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTimeFunctionsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTimeFunctions object proxy by its ID.
  #
  # @param id FEMTimeFunctions object ID
  # @return FEMTimeFunctions object proxy
  def getFEMTimeFunctions(self, id, current=None):
    logging.debug('getFEMTimeFunctions(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTimeFunctions.has_key(id):
        logging.debug('Fetched FEMTimeFunctions[oid=%d] servant from cache', id)
        return self.registryFEMTimeFunctions[id]
      obj = FEMTimeFunctionsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTimeFunctionsPrx.uncheckedCast(srvt)
      self.registryFEMTimeFunctions[id] = prx
    logging.debug('Activated FEMTimeFunctions[oid=%d] servant', id)
    return prx

  ## Gets the FEMTimeFunctions object fields.
  #
  # @param id FEMTimeFunctions object ID
  # @return FEMTimeFunctionsFields object
  def getFEMTimeFunctionsFields(self, id, current=None):
    logging.debug('getFEMTimeFunctionsFields(oid=%d)' % id)
    return self._getFEMTimeFunctionsFields(id, current)

  ## Gets the FEMTimeFunctions object fields.
  #
  # @param id FEMTimeFunctions object ID
  # @return FEMTimeFunctionsFields object
  def _getFEMTimeFunctionsFields(self, id, current=None):
    fields = SenStore.FEMTimeFunctionsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTimeFunctions(fields):
          return None
    return fields

  ## Sets the FEMTimeFunctions object fields.
  #
  # @param fields     FEMTimeFunctions fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTimeFunctionsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTimeFunctionsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTimeFunctions(fields, fieldNames)

  ## Gets a list of IDs of all FEMTimeFunctions objects.
  #
  # @return ids list of FEMTimeFunctions object IDs
  def getFEMTimeFunctionsIds(self, current=None):
    logging.debug('getFEMTimeFunctionsList()')
    with self.lock:
      return self.pg.getFEMTimeFunctionsIds()

  ## Gets a list of FEMTimeFunctions object proxies.
  #
  # @param ids list of FEMTimeFunctions object IDs
  # @return list of FEMTimeFunctions object proxies
  def getFEMTimeFunctionsList(self, ids, current=None):
    logging.debug('getFEMTimeFunctionsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTimeFunctions(id) for id in ids]

  ## Gets a list of FEMTimeFunctions fields objects.
  #
  # @param ids list of FEMTimeFunctions object IDs
  # @return list of FEMTimeFunctions fields objects
  def getFEMTimeFunctionsFieldsList(self, ids, current=None):
    logging.debug('getFEMTimeFunctionsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTimeFunctionsFields(id) for id in ids]

  ## Gets a list of all FEMTimeFunctions object IDs.
  #
  # @param fields FEMTimeFunctions object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTimeFunctions objects
  #
  def findEqualFEMTimeFunctions(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTimeFunctions()')
    with self.lock:
      ids = self.pg.findEqualFEMTimeFunctions(fields, fieldNames)
    return ids

  ## Adds a FEMForceStrainData object to the store.
  #
  # @param fields  FEMForceStrainDataFields object
  # @return newly assigned ID
  def addFEMForceStrainData(self, fields, current=None):
    logging.debug('addFEMForceStrainData()')
    with self.lock:
      self.pg.addFEMForceStrainData(fields)
    return fields.id


  ## Adds a set of FEMForceStrainData objects to the store.
  #
  # @param fieldsList  list of FEMForceStrainDataFields objects
  # @return list of newly assigned IDs
  def addFEMForceStrainDataList(self, fieldsList, current=None):
    logging.debug('addFEMForceStrainDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMForceStrainDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMForceStrainData object proxy by its ID.
  #
  # @param id FEMForceStrainData object ID
  # @return FEMForceStrainData object proxy
  def getFEMForceStrainData(self, id, current=None):
    logging.debug('getFEMForceStrainData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMForceStrainData.has_key(id):
        logging.debug('Fetched FEMForceStrainData[oid=%d] servant from cache', id)
        return self.registryFEMForceStrainData[id]
      obj = FEMForceStrainDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMForceStrainDataPrx.uncheckedCast(srvt)
      self.registryFEMForceStrainData[id] = prx
    logging.debug('Activated FEMForceStrainData[oid=%d] servant', id)
    return prx

  ## Gets the FEMForceStrainData object fields.
  #
  # @param id FEMForceStrainData object ID
  # @return FEMForceStrainDataFields object
  def getFEMForceStrainDataFields(self, id, current=None):
    logging.debug('getFEMForceStrainDataFields(oid=%d)' % id)
    return self._getFEMForceStrainDataFields(id, current)

  ## Gets the FEMForceStrainData object fields.
  #
  # @param id FEMForceStrainData object ID
  # @return FEMForceStrainDataFields object
  def _getFEMForceStrainDataFields(self, id, current=None):
    fields = SenStore.FEMForceStrainDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMForceStrainData(fields):
          return None
    return fields

  ## Sets the FEMForceStrainData object fields.
  #
  # @param fields     FEMForceStrainData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMForceStrainDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMForceStrainDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMForceStrainData(fields, fieldNames)

  ## Gets a list of IDs of all FEMForceStrainData objects.
  #
  # @return ids list of FEMForceStrainData object IDs
  def getFEMForceStrainDataIds(self, current=None):
    logging.debug('getFEMForceStrainDataList()')
    with self.lock:
      return self.pg.getFEMForceStrainDataIds()

  ## Gets a list of FEMForceStrainData object proxies.
  #
  # @param ids list of FEMForceStrainData object IDs
  # @return list of FEMForceStrainData object proxies
  def getFEMForceStrainDataList(self, ids, current=None):
    logging.debug('getFEMForceStrainDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMForceStrainData(id) for id in ids]

  ## Gets a list of FEMForceStrainData fields objects.
  #
  # @param ids list of FEMForceStrainData object IDs
  # @return list of FEMForceStrainData fields objects
  def getFEMForceStrainDataFieldsList(self, ids, current=None):
    logging.debug('getFEMForceStrainDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMForceStrainDataFields(id) for id in ids]

  ## Gets a list of all FEMForceStrainData object IDs.
  #
  # @param fields FEMForceStrainData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMForceStrainData objects
  #
  def findEqualFEMForceStrainData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMForceStrainData()')
    with self.lock:
      ids = self.pg.findEqualFEMForceStrainData(fields, fieldNames)
    return ids

  ## Adds a FEMSkewDOF object to the store.
  #
  # @param fields  FEMSkewDOFFields object
  # @return newly assigned ID
  def addFEMSkewDOF(self, fields, current=None):
    logging.debug('addFEMSkewDOF()')
    with self.lock:
      self.pg.addFEMSkewDOF(fields)
    return fields.id


  ## Adds a set of FEMSkewDOF objects to the store.
  #
  # @param fieldsList  list of FEMSkewDOFFields objects
  # @return list of newly assigned IDs
  def addFEMSkewDOFList(self, fieldsList, current=None):
    logging.debug('addFEMSkewDOFList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSkewDOFList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSkewDOF object proxy by its ID.
  #
  # @param id FEMSkewDOF object ID
  # @return FEMSkewDOF object proxy
  def getFEMSkewDOF(self, id, current=None):
    logging.debug('getFEMSkewDOF(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSkewDOF.has_key(id):
        logging.debug('Fetched FEMSkewDOF[oid=%d] servant from cache', id)
        return self.registryFEMSkewDOF[id]
      obj = FEMSkewDOFI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSkewDOFPrx.uncheckedCast(srvt)
      self.registryFEMSkewDOF[id] = prx
    logging.debug('Activated FEMSkewDOF[oid=%d] servant', id)
    return prx

  ## Gets the FEMSkewDOF object fields.
  #
  # @param id FEMSkewDOF object ID
  # @return FEMSkewDOFFields object
  def getFEMSkewDOFFields(self, id, current=None):
    logging.debug('getFEMSkewDOFFields(oid=%d)' % id)
    return self._getFEMSkewDOFFields(id, current)

  ## Gets the FEMSkewDOF object fields.
  #
  # @param id FEMSkewDOF object ID
  # @return FEMSkewDOFFields object
  def _getFEMSkewDOFFields(self, id, current=None):
    fields = SenStore.FEMSkewDOFFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSkewDOF(fields):
          return None
    return fields

  ## Sets the FEMSkewDOF object fields.
  #
  # @param fields     FEMSkewDOF fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSkewDOFFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSkewDOFFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSkewDOF(fields, fieldNames)

  ## Gets a list of IDs of all FEMSkewDOF objects.
  #
  # @return ids list of FEMSkewDOF object IDs
  def getFEMSkewDOFIds(self, current=None):
    logging.debug('getFEMSkewDOFList()')
    with self.lock:
      return self.pg.getFEMSkewDOFIds()

  ## Gets a list of FEMSkewDOF object proxies.
  #
  # @param ids list of FEMSkewDOF object IDs
  # @return list of FEMSkewDOF object proxies
  def getFEMSkewDOFList(self, ids, current=None):
    logging.debug('getFEMSkewDOFList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSkewDOF(id) for id in ids]

  ## Gets a list of FEMSkewDOF fields objects.
  #
  # @param ids list of FEMSkewDOF object IDs
  # @return list of FEMSkewDOF fields objects
  def getFEMSkewDOFFieldsList(self, ids, current=None):
    logging.debug('getFEMSkewDOFFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSkewDOFFields(id) for id in ids]

  ## Gets a list of all FEMSkewDOF object IDs.
  #
  # @param fields FEMSkewDOF object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSkewDOF objects
  #
  def findEqualFEMSkewDOF(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSkewDOF()')
    with self.lock:
      ids = self.pg.findEqualFEMSkewDOF(fields, fieldNames)
    return ids

  ## Adds a FEMSectionI object to the store.
  #
  # @param fields  FEMSectionIFields object
  # @return newly assigned ID
  def addFEMSectionI(self, fields, current=None):
    logging.debug('addFEMSectionI()')
    with self.lock:
      self.pg.addFEMSectionI(fields)
    return fields.id


  ## Adds a set of FEMSectionI objects to the store.
  #
  # @param fieldsList  list of FEMSectionIFields objects
  # @return list of newly assigned IDs
  def addFEMSectionIList(self, fieldsList, current=None):
    logging.debug('addFEMSectionIList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSectionIList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSectionI object proxy by its ID.
  #
  # @param id FEMSectionI object ID
  # @return FEMSectionI object proxy
  def getFEMSectionI(self, id, current=None):
    logging.debug('getFEMSectionI(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSectionI.has_key(id):
        logging.debug('Fetched FEMSectionI[oid=%d] servant from cache', id)
        return self.registryFEMSectionI[id]
      obj = FEMSectionII(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSectionIPrx.uncheckedCast(srvt)
      self.registryFEMSectionI[id] = prx
    logging.debug('Activated FEMSectionI[oid=%d] servant', id)
    return prx

  ## Gets the FEMSectionI object fields.
  #
  # @param id FEMSectionI object ID
  # @return FEMSectionIFields object
  def getFEMSectionIFields(self, id, current=None):
    logging.debug('getFEMSectionIFields(oid=%d)' % id)
    return self._getFEMSectionIFields(id, current)

  ## Gets the FEMSectionI object fields.
  #
  # @param id FEMSectionI object ID
  # @return FEMSectionIFields object
  def _getFEMSectionIFields(self, id, current=None):
    fields = SenStore.FEMSectionIFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSectionI(fields):
          return None
    return fields

  ## Sets the FEMSectionI object fields.
  #
  # @param fields     FEMSectionI fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSectionIFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSectionIFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSectionI(fields, fieldNames)

  ## Gets a list of IDs of all FEMSectionI objects.
  #
  # @return ids list of FEMSectionI object IDs
  def getFEMSectionIIds(self, current=None):
    logging.debug('getFEMSectionIList()')
    with self.lock:
      return self.pg.getFEMSectionIIds()

  ## Gets a list of FEMSectionI object proxies.
  #
  # @param ids list of FEMSectionI object IDs
  # @return list of FEMSectionI object proxies
  def getFEMSectionIList(self, ids, current=None):
    logging.debug('getFEMSectionIList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSectionI(id) for id in ids]

  ## Gets a list of FEMSectionI fields objects.
  #
  # @param ids list of FEMSectionI object IDs
  # @return list of FEMSectionI fields objects
  def getFEMSectionIFieldsList(self, ids, current=None):
    logging.debug('getFEMSectionIFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSectionIFields(id) for id in ids]

  ## Gets a list of all FEMSectionI object IDs.
  #
  # @param fields FEMSectionI object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSectionI objects
  #
  def findEqualFEMSectionI(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSectionI()')
    with self.lock:
      ids = self.pg.findEqualFEMSectionI(fields, fieldNames)
    return ids

  ## Adds a FEMPlasticBilinearMaterial object to the store.
  #
  # @param fields  FEMPlasticBilinearMaterialFields object
  # @return newly assigned ID
  def addFEMPlasticBilinearMaterial(self, fields, current=None):
    logging.debug('addFEMPlasticBilinearMaterial()')
    with self.lock:
      self.pg.addFEMPlasticBilinearMaterial(fields)
    return fields.id


  ## Adds a set of FEMPlasticBilinearMaterial objects to the store.
  #
  # @param fieldsList  list of FEMPlasticBilinearMaterialFields objects
  # @return list of newly assigned IDs
  def addFEMPlasticBilinearMaterialList(self, fieldsList, current=None):
    logging.debug('addFEMPlasticBilinearMaterialList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPlasticBilinearMaterialList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPlasticBilinearMaterial object proxy by its ID.
  #
  # @param id FEMPlasticBilinearMaterial object ID
  # @return FEMPlasticBilinearMaterial object proxy
  def getFEMPlasticBilinearMaterial(self, id, current=None):
    logging.debug('getFEMPlasticBilinearMaterial(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPlasticBilinearMaterial.has_key(id):
        logging.debug('Fetched FEMPlasticBilinearMaterial[oid=%d] servant from cache', id)
        return self.registryFEMPlasticBilinearMaterial[id]
      obj = FEMPlasticBilinearMaterialI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPlasticBilinearMaterialPrx.uncheckedCast(srvt)
      self.registryFEMPlasticBilinearMaterial[id] = prx
    logging.debug('Activated FEMPlasticBilinearMaterial[oid=%d] servant', id)
    return prx

  ## Gets the FEMPlasticBilinearMaterial object fields.
  #
  # @param id FEMPlasticBilinearMaterial object ID
  # @return FEMPlasticBilinearMaterialFields object
  def getFEMPlasticBilinearMaterialFields(self, id, current=None):
    logging.debug('getFEMPlasticBilinearMaterialFields(oid=%d)' % id)
    return self._getFEMPlasticBilinearMaterialFields(id, current)

  ## Gets the FEMPlasticBilinearMaterial object fields.
  #
  # @param id FEMPlasticBilinearMaterial object ID
  # @return FEMPlasticBilinearMaterialFields object
  def _getFEMPlasticBilinearMaterialFields(self, id, current=None):
    fields = SenStore.FEMPlasticBilinearMaterialFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPlasticBilinearMaterial(fields):
          return None
    return fields

  ## Sets the FEMPlasticBilinearMaterial object fields.
  #
  # @param fields     FEMPlasticBilinearMaterial fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPlasticBilinearMaterialFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPlasticBilinearMaterialFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPlasticBilinearMaterial(fields, fieldNames)

  ## Gets a list of IDs of all FEMPlasticBilinearMaterial objects.
  #
  # @return ids list of FEMPlasticBilinearMaterial object IDs
  def getFEMPlasticBilinearMaterialIds(self, current=None):
    logging.debug('getFEMPlasticBilinearMaterialList()')
    with self.lock:
      return self.pg.getFEMPlasticBilinearMaterialIds()

  ## Gets a list of FEMPlasticBilinearMaterial object proxies.
  #
  # @param ids list of FEMPlasticBilinearMaterial object IDs
  # @return list of FEMPlasticBilinearMaterial object proxies
  def getFEMPlasticBilinearMaterialList(self, ids, current=None):
    logging.debug('getFEMPlasticBilinearMaterialList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPlasticBilinearMaterial(id) for id in ids]

  ## Gets a list of FEMPlasticBilinearMaterial fields objects.
  #
  # @param ids list of FEMPlasticBilinearMaterial object IDs
  # @return list of FEMPlasticBilinearMaterial fields objects
  def getFEMPlasticBilinearMaterialFieldsList(self, ids, current=None):
    logging.debug('getFEMPlasticBilinearMaterialFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPlasticBilinearMaterialFields(id) for id in ids]

  ## Gets a list of all FEMPlasticBilinearMaterial object IDs.
  #
  # @param fields FEMPlasticBilinearMaterial object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPlasticBilinearMaterial objects
  #
  def findEqualFEMPlasticBilinearMaterial(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPlasticBilinearMaterial()')
    with self.lock:
      ids = self.pg.findEqualFEMPlasticBilinearMaterial(fields, fieldNames)
    return ids

  ## Adds a FEMMTForceData object to the store.
  #
  # @param fields  FEMMTForceDataFields object
  # @return newly assigned ID
  def addFEMMTForceData(self, fields, current=None):
    logging.debug('addFEMMTForceData()')
    with self.lock:
      self.pg.addFEMMTForceData(fields)
    return fields.id


  ## Adds a set of FEMMTForceData objects to the store.
  #
  # @param fieldsList  list of FEMMTForceDataFields objects
  # @return list of newly assigned IDs
  def addFEMMTForceDataList(self, fieldsList, current=None):
    logging.debug('addFEMMTForceDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMTForceDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMTForceData object proxy by its ID.
  #
  # @param id FEMMTForceData object ID
  # @return FEMMTForceData object proxy
  def getFEMMTForceData(self, id, current=None):
    logging.debug('getFEMMTForceData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMTForceData.has_key(id):
        logging.debug('Fetched FEMMTForceData[oid=%d] servant from cache', id)
        return self.registryFEMMTForceData[id]
      obj = FEMMTForceDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMTForceDataPrx.uncheckedCast(srvt)
      self.registryFEMMTForceData[id] = prx
    logging.debug('Activated FEMMTForceData[oid=%d] servant', id)
    return prx

  ## Gets the FEMMTForceData object fields.
  #
  # @param id FEMMTForceData object ID
  # @return FEMMTForceDataFields object
  def getFEMMTForceDataFields(self, id, current=None):
    logging.debug('getFEMMTForceDataFields(oid=%d)' % id)
    return self._getFEMMTForceDataFields(id, current)

  ## Gets the FEMMTForceData object fields.
  #
  # @param id FEMMTForceData object ID
  # @return FEMMTForceDataFields object
  def _getFEMMTForceDataFields(self, id, current=None):
    fields = SenStore.FEMMTForceDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMTForceData(fields):
          return None
    return fields

  ## Sets the FEMMTForceData object fields.
  #
  # @param fields     FEMMTForceData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMTForceDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMTForceDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMTForceData(fields, fieldNames)

  ## Gets a list of IDs of all FEMMTForceData objects.
  #
  # @return ids list of FEMMTForceData object IDs
  def getFEMMTForceDataIds(self, current=None):
    logging.debug('getFEMMTForceDataList()')
    with self.lock:
      return self.pg.getFEMMTForceDataIds()

  ## Gets a list of FEMMTForceData object proxies.
  #
  # @param ids list of FEMMTForceData object IDs
  # @return list of FEMMTForceData object proxies
  def getFEMMTForceDataList(self, ids, current=None):
    logging.debug('getFEMMTForceDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMTForceData(id) for id in ids]

  ## Gets a list of FEMMTForceData fields objects.
  #
  # @param ids list of FEMMTForceData object IDs
  # @return list of FEMMTForceData fields objects
  def getFEMMTForceDataFieldsList(self, ids, current=None):
    logging.debug('getFEMMTForceDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMTForceDataFields(id) for id in ids]

  ## Gets a list of all FEMMTForceData object IDs.
  #
  # @param fields FEMMTForceData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMTForceData objects
  #
  def findEqualFEMMTForceData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMTForceData()')
    with self.lock:
      ids = self.pg.findEqualFEMMTForceData(fields, fieldNames)
    return ids

  ## Adds a FEMShellPressure object to the store.
  #
  # @param fields  FEMShellPressureFields object
  # @return newly assigned ID
  def addFEMShellPressure(self, fields, current=None):
    logging.debug('addFEMShellPressure()')
    with self.lock:
      self.pg.addFEMShellPressure(fields)
    return fields.id


  ## Adds a set of FEMShellPressure objects to the store.
  #
  # @param fieldsList  list of FEMShellPressureFields objects
  # @return list of newly assigned IDs
  def addFEMShellPressureList(self, fieldsList, current=None):
    logging.debug('addFEMShellPressureList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellPressureList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellPressure object proxy by its ID.
  #
  # @param id FEMShellPressure object ID
  # @return FEMShellPressure object proxy
  def getFEMShellPressure(self, id, current=None):
    logging.debug('getFEMShellPressure(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellPressure.has_key(id):
        logging.debug('Fetched FEMShellPressure[oid=%d] servant from cache', id)
        return self.registryFEMShellPressure[id]
      obj = FEMShellPressureI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellPressurePrx.uncheckedCast(srvt)
      self.registryFEMShellPressure[id] = prx
    logging.debug('Activated FEMShellPressure[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellPressure object fields.
  #
  # @param id FEMShellPressure object ID
  # @return FEMShellPressureFields object
  def getFEMShellPressureFields(self, id, current=None):
    logging.debug('getFEMShellPressureFields(oid=%d)' % id)
    return self._getFEMShellPressureFields(id, current)

  ## Gets the FEMShellPressure object fields.
  #
  # @param id FEMShellPressure object ID
  # @return FEMShellPressureFields object
  def _getFEMShellPressureFields(self, id, current=None):
    fields = SenStore.FEMShellPressureFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellPressure(fields):
          return None
    return fields

  ## Sets the FEMShellPressure object fields.
  #
  # @param fields     FEMShellPressure fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellPressureFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellPressureFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellPressure(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellPressure objects.
  #
  # @return ids list of FEMShellPressure object IDs
  def getFEMShellPressureIds(self, current=None):
    logging.debug('getFEMShellPressureList()')
    with self.lock:
      return self.pg.getFEMShellPressureIds()

  ## Gets a list of FEMShellPressure object proxies.
  #
  # @param ids list of FEMShellPressure object IDs
  # @return list of FEMShellPressure object proxies
  def getFEMShellPressureList(self, ids, current=None):
    logging.debug('getFEMShellPressureList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellPressure(id) for id in ids]

  ## Gets a list of FEMShellPressure fields objects.
  #
  # @param ids list of FEMShellPressure object IDs
  # @return list of FEMShellPressure fields objects
  def getFEMShellPressureFieldsList(self, ids, current=None):
    logging.debug('getFEMShellPressureFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellPressureFields(id) for id in ids]

  ## Gets a list of all FEMShellPressure object IDs.
  #
  # @param fields FEMShellPressure object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellPressure objects
  #
  def findEqualFEMShellPressure(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellPressure()')
    with self.lock:
      ids = self.pg.findEqualFEMShellPressure(fields, fieldNames)
    return ids

  ## Adds a FEMMatrices object to the store.
  #
  # @param fields  FEMMatricesFields object
  # @return newly assigned ID
  def addFEMMatrices(self, fields, current=None):
    logging.debug('addFEMMatrices()')
    with self.lock:
      self.pg.addFEMMatrices(fields)
    return fields.id


  ## Adds a set of FEMMatrices objects to the store.
  #
  # @param fieldsList  list of FEMMatricesFields objects
  # @return list of newly assigned IDs
  def addFEMMatricesList(self, fieldsList, current=None):
    logging.debug('addFEMMatricesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMatricesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMatrices object proxy by its ID.
  #
  # @param id FEMMatrices object ID
  # @return FEMMatrices object proxy
  def getFEMMatrices(self, id, current=None):
    logging.debug('getFEMMatrices(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMatrices.has_key(id):
        logging.debug('Fetched FEMMatrices[oid=%d] servant from cache', id)
        return self.registryFEMMatrices[id]
      obj = FEMMatricesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMatricesPrx.uncheckedCast(srvt)
      self.registryFEMMatrices[id] = prx
    logging.debug('Activated FEMMatrices[oid=%d] servant', id)
    return prx

  ## Gets the FEMMatrices object fields.
  #
  # @param id FEMMatrices object ID
  # @return FEMMatricesFields object
  def getFEMMatricesFields(self, id, current=None):
    logging.debug('getFEMMatricesFields(oid=%d)' % id)
    return self._getFEMMatricesFields(id, current)

  ## Gets the FEMMatrices object fields.
  #
  # @param id FEMMatrices object ID
  # @return FEMMatricesFields object
  def _getFEMMatricesFields(self, id, current=None):
    fields = SenStore.FEMMatricesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMatrices(fields):
          return None
    return fields

  ## Sets the FEMMatrices object fields.
  #
  # @param fields     FEMMatrices fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMatricesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMatricesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMatrices(fields, fieldNames)

  ## Gets a list of IDs of all FEMMatrices objects.
  #
  # @return ids list of FEMMatrices object IDs
  def getFEMMatricesIds(self, current=None):
    logging.debug('getFEMMatricesList()')
    with self.lock:
      return self.pg.getFEMMatricesIds()

  ## Gets a list of FEMMatrices object proxies.
  #
  # @param ids list of FEMMatrices object IDs
  # @return list of FEMMatrices object proxies
  def getFEMMatricesList(self, ids, current=None):
    logging.debug('getFEMMatricesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMatrices(id) for id in ids]

  ## Gets a list of FEMMatrices fields objects.
  #
  # @param ids list of FEMMatrices object IDs
  # @return list of FEMMatrices fields objects
  def getFEMMatricesFieldsList(self, ids, current=None):
    logging.debug('getFEMMatricesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMatricesFields(id) for id in ids]

  ## Gets a list of all FEMMatrices object IDs.
  #
  # @param fields FEMMatrices object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMatrices objects
  #
  def findEqualFEMMatrices(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMatrices()')
    with self.lock:
      ids = self.pg.findEqualFEMMatrices(fields, fieldNames)
    return ids

  ## Adds a FEMDamping object to the store.
  #
  # @param fields  FEMDampingFields object
  # @return newly assigned ID
  def addFEMDamping(self, fields, current=None):
    logging.debug('addFEMDamping()')
    with self.lock:
      self.pg.addFEMDamping(fields)
    return fields.id


  ## Adds a set of FEMDamping objects to the store.
  #
  # @param fieldsList  list of FEMDampingFields objects
  # @return list of newly assigned IDs
  def addFEMDampingList(self, fieldsList, current=None):
    logging.debug('addFEMDampingList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMDampingList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMDamping object proxy by its ID.
  #
  # @param id FEMDamping object ID
  # @return FEMDamping object proxy
  def getFEMDamping(self, id, current=None):
    logging.debug('getFEMDamping(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMDamping.has_key(id):
        logging.debug('Fetched FEMDamping[oid=%d] servant from cache', id)
        return self.registryFEMDamping[id]
      obj = FEMDampingI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMDampingPrx.uncheckedCast(srvt)
      self.registryFEMDamping[id] = prx
    logging.debug('Activated FEMDamping[oid=%d] servant', id)
    return prx

  ## Gets the FEMDamping object fields.
  #
  # @param id FEMDamping object ID
  # @return FEMDampingFields object
  def getFEMDampingFields(self, id, current=None):
    logging.debug('getFEMDampingFields(oid=%d)' % id)
    return self._getFEMDampingFields(id, current)

  ## Gets the FEMDamping object fields.
  #
  # @param id FEMDamping object ID
  # @return FEMDampingFields object
  def _getFEMDampingFields(self, id, current=None):
    fields = SenStore.FEMDampingFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMDamping(fields):
          return None
    return fields

  ## Sets the FEMDamping object fields.
  #
  # @param fields     FEMDamping fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMDampingFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMDampingFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMDamping(fields, fieldNames)

  ## Gets a list of IDs of all FEMDamping objects.
  #
  # @return ids list of FEMDamping object IDs
  def getFEMDampingIds(self, current=None):
    logging.debug('getFEMDampingList()')
    with self.lock:
      return self.pg.getFEMDampingIds()

  ## Gets a list of FEMDamping object proxies.
  #
  # @param ids list of FEMDamping object IDs
  # @return list of FEMDamping object proxies
  def getFEMDampingList(self, ids, current=None):
    logging.debug('getFEMDampingList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMDamping(id) for id in ids]

  ## Gets a list of FEMDamping fields objects.
  #
  # @param ids list of FEMDamping object IDs
  # @return list of FEMDamping fields objects
  def getFEMDampingFieldsList(self, ids, current=None):
    logging.debug('getFEMDampingFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMDampingFields(id) for id in ids]

  ## Gets a list of all FEMDamping object IDs.
  #
  # @param fields FEMDamping object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMDamping objects
  #
  def findEqualFEMDamping(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMDamping()')
    with self.lock:
      ids = self.pg.findEqualFEMDamping(fields, fieldNames)
    return ids

  ## Adds a FEMMaterial object to the store.
  #
  # @param fields  FEMMaterialFields object
  # @return newly assigned ID
  def addFEMMaterial(self, fields, current=None):
    logging.debug('addFEMMaterial()')
    with self.lock:
      self.pg.addFEMMaterial(fields)
    return fields.id


  ## Adds a set of FEMMaterial objects to the store.
  #
  # @param fieldsList  list of FEMMaterialFields objects
  # @return list of newly assigned IDs
  def addFEMMaterialList(self, fieldsList, current=None):
    logging.debug('addFEMMaterialList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMaterialList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMaterial object proxy by its ID.
  #
  # @param id FEMMaterial object ID
  # @return FEMMaterial object proxy
  def getFEMMaterial(self, id, current=None):
    logging.debug('getFEMMaterial(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMaterial.has_key(id):
        logging.debug('Fetched FEMMaterial[oid=%d] servant from cache', id)
        return self.registryFEMMaterial[id]
      obj = FEMMaterialI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMaterialPrx.uncheckedCast(srvt)
      self.registryFEMMaterial[id] = prx
    logging.debug('Activated FEMMaterial[oid=%d] servant', id)
    return prx

  ## Gets the FEMMaterial object fields.
  #
  # @param id FEMMaterial object ID
  # @return FEMMaterialFields object
  def getFEMMaterialFields(self, id, current=None):
    logging.debug('getFEMMaterialFields(oid=%d)' % id)
    return self._getFEMMaterialFields(id, current)

  ## Gets the FEMMaterial object fields.
  #
  # @param id FEMMaterial object ID
  # @return FEMMaterialFields object
  def _getFEMMaterialFields(self, id, current=None):
    fields = SenStore.FEMMaterialFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMaterial(fields):
          return None
    return fields

  ## Sets the FEMMaterial object fields.
  #
  # @param fields     FEMMaterial fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMaterialFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMaterialFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMaterial(fields, fieldNames)

  ## Gets a list of IDs of all FEMMaterial objects.
  #
  # @return ids list of FEMMaterial object IDs
  def getFEMMaterialIds(self, current=None):
    logging.debug('getFEMMaterialList()')
    with self.lock:
      return self.pg.getFEMMaterialIds()

  ## Gets a list of FEMMaterial object proxies.
  #
  # @param ids list of FEMMaterial object IDs
  # @return list of FEMMaterial object proxies
  def getFEMMaterialList(self, ids, current=None):
    logging.debug('getFEMMaterialList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMaterial(id) for id in ids]

  ## Gets a list of FEMMaterial fields objects.
  #
  # @param ids list of FEMMaterial object IDs
  # @return list of FEMMaterial fields objects
  def getFEMMaterialFieldsList(self, ids, current=None):
    logging.debug('getFEMMaterialFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMaterialFields(id) for id in ids]

  ## Gets a list of all FEMMaterial object IDs.
  #
  # @param fields FEMMaterial object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMaterial objects
  #
  def findEqualFEMMaterial(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMaterial()')
    with self.lock:
      ids = self.pg.findEqualFEMMaterial(fields, fieldNames)
    return ids

  ## Adds a FEMMatrixData object to the store.
  #
  # @param fields  FEMMatrixDataFields object
  # @return newly assigned ID
  def addFEMMatrixData(self, fields, current=None):
    logging.debug('addFEMMatrixData()')
    with self.lock:
      self.pg.addFEMMatrixData(fields)
    return fields.id


  ## Adds a set of FEMMatrixData objects to the store.
  #
  # @param fieldsList  list of FEMMatrixDataFields objects
  # @return list of newly assigned IDs
  def addFEMMatrixDataList(self, fieldsList, current=None):
    logging.debug('addFEMMatrixDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMatrixDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMatrixData object proxy by its ID.
  #
  # @param id FEMMatrixData object ID
  # @return FEMMatrixData object proxy
  def getFEMMatrixData(self, id, current=None):
    logging.debug('getFEMMatrixData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMatrixData.has_key(id):
        logging.debug('Fetched FEMMatrixData[oid=%d] servant from cache', id)
        return self.registryFEMMatrixData[id]
      obj = FEMMatrixDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMatrixDataPrx.uncheckedCast(srvt)
      self.registryFEMMatrixData[id] = prx
    logging.debug('Activated FEMMatrixData[oid=%d] servant', id)
    return prx

  ## Gets the FEMMatrixData object fields.
  #
  # @param id FEMMatrixData object ID
  # @return FEMMatrixDataFields object
  def getFEMMatrixDataFields(self, id, current=None):
    logging.debug('getFEMMatrixDataFields(oid=%d)' % id)
    return self._getFEMMatrixDataFields(id, current)

  ## Gets the FEMMatrixData object fields.
  #
  # @param id FEMMatrixData object ID
  # @return FEMMatrixDataFields object
  def _getFEMMatrixDataFields(self, id, current=None):
    fields = SenStore.FEMMatrixDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMatrixData(fields):
          return None
    return fields

  ## Sets the FEMMatrixData object fields.
  #
  # @param fields     FEMMatrixData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMatrixDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMatrixDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMatrixData(fields, fieldNames)

  ## Gets a list of IDs of all FEMMatrixData objects.
  #
  # @return ids list of FEMMatrixData object IDs
  def getFEMMatrixDataIds(self, current=None):
    logging.debug('getFEMMatrixDataList()')
    with self.lock:
      return self.pg.getFEMMatrixDataIds()

  ## Gets a list of FEMMatrixData object proxies.
  #
  # @param ids list of FEMMatrixData object IDs
  # @return list of FEMMatrixData object proxies
  def getFEMMatrixDataList(self, ids, current=None):
    logging.debug('getFEMMatrixDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMatrixData(id) for id in ids]

  ## Gets a list of FEMMatrixData fields objects.
  #
  # @param ids list of FEMMatrixData object IDs
  # @return list of FEMMatrixData fields objects
  def getFEMMatrixDataFieldsList(self, ids, current=None):
    logging.debug('getFEMMatrixDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMatrixDataFields(id) for id in ids]

  ## Gets a list of all FEMMatrixData object IDs.
  #
  # @param fields FEMMatrixData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMatrixData objects
  #
  def findEqualFEMMatrixData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMatrixData()')
    with self.lock:
      ids = self.pg.findEqualFEMMatrixData(fields, fieldNames)
    return ids

  ## Adds a FEMShellAxesOrtho object to the store.
  #
  # @param fields  FEMShellAxesOrthoFields object
  # @return newly assigned ID
  def addFEMShellAxesOrtho(self, fields, current=None):
    logging.debug('addFEMShellAxesOrtho()')
    with self.lock:
      self.pg.addFEMShellAxesOrtho(fields)
    return fields.id


  ## Adds a set of FEMShellAxesOrtho objects to the store.
  #
  # @param fieldsList  list of FEMShellAxesOrthoFields objects
  # @return list of newly assigned IDs
  def addFEMShellAxesOrthoList(self, fieldsList, current=None):
    logging.debug('addFEMShellAxesOrthoList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellAxesOrthoList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellAxesOrtho object proxy by its ID.
  #
  # @param id FEMShellAxesOrtho object ID
  # @return FEMShellAxesOrtho object proxy
  def getFEMShellAxesOrtho(self, id, current=None):
    logging.debug('getFEMShellAxesOrtho(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellAxesOrtho.has_key(id):
        logging.debug('Fetched FEMShellAxesOrtho[oid=%d] servant from cache', id)
        return self.registryFEMShellAxesOrtho[id]
      obj = FEMShellAxesOrthoI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellAxesOrthoPrx.uncheckedCast(srvt)
      self.registryFEMShellAxesOrtho[id] = prx
    logging.debug('Activated FEMShellAxesOrtho[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellAxesOrtho object fields.
  #
  # @param id FEMShellAxesOrtho object ID
  # @return FEMShellAxesOrthoFields object
  def getFEMShellAxesOrthoFields(self, id, current=None):
    logging.debug('getFEMShellAxesOrthoFields(oid=%d)' % id)
    return self._getFEMShellAxesOrthoFields(id, current)

  ## Gets the FEMShellAxesOrtho object fields.
  #
  # @param id FEMShellAxesOrtho object ID
  # @return FEMShellAxesOrthoFields object
  def _getFEMShellAxesOrthoFields(self, id, current=None):
    fields = SenStore.FEMShellAxesOrthoFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellAxesOrtho(fields):
          return None
    return fields

  ## Sets the FEMShellAxesOrtho object fields.
  #
  # @param fields     FEMShellAxesOrtho fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellAxesOrthoFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellAxesOrthoFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellAxesOrtho(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellAxesOrtho objects.
  #
  # @return ids list of FEMShellAxesOrtho object IDs
  def getFEMShellAxesOrthoIds(self, current=None):
    logging.debug('getFEMShellAxesOrthoList()')
    with self.lock:
      return self.pg.getFEMShellAxesOrthoIds()

  ## Gets a list of FEMShellAxesOrtho object proxies.
  #
  # @param ids list of FEMShellAxesOrtho object IDs
  # @return list of FEMShellAxesOrtho object proxies
  def getFEMShellAxesOrthoList(self, ids, current=None):
    logging.debug('getFEMShellAxesOrthoList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellAxesOrtho(id) for id in ids]

  ## Gets a list of FEMShellAxesOrtho fields objects.
  #
  # @param ids list of FEMShellAxesOrtho object IDs
  # @return list of FEMShellAxesOrtho fields objects
  def getFEMShellAxesOrthoFieldsList(self, ids, current=None):
    logging.debug('getFEMShellAxesOrthoFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellAxesOrthoFields(id) for id in ids]

  ## Gets a list of all FEMShellAxesOrtho object IDs.
  #
  # @param fields FEMShellAxesOrtho object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellAxesOrtho objects
  #
  def findEqualFEMShellAxesOrtho(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellAxesOrtho()')
    with self.lock:
      ids = self.pg.findEqualFEMShellAxesOrtho(fields, fieldNames)
    return ids

  ## Adds a FEMEndreleases object to the store.
  #
  # @param fields  FEMEndreleasesFields object
  # @return newly assigned ID
  def addFEMEndreleases(self, fields, current=None):
    logging.debug('addFEMEndreleases()')
    with self.lock:
      self.pg.addFEMEndreleases(fields)
    return fields.id


  ## Adds a set of FEMEndreleases objects to the store.
  #
  # @param fieldsList  list of FEMEndreleasesFields objects
  # @return list of newly assigned IDs
  def addFEMEndreleasesList(self, fieldsList, current=None):
    logging.debug('addFEMEndreleasesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMEndreleasesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMEndreleases object proxy by its ID.
  #
  # @param id FEMEndreleases object ID
  # @return FEMEndreleases object proxy
  def getFEMEndreleases(self, id, current=None):
    logging.debug('getFEMEndreleases(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMEndreleases.has_key(id):
        logging.debug('Fetched FEMEndreleases[oid=%d] servant from cache', id)
        return self.registryFEMEndreleases[id]
      obj = FEMEndreleasesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMEndreleasesPrx.uncheckedCast(srvt)
      self.registryFEMEndreleases[id] = prx
    logging.debug('Activated FEMEndreleases[oid=%d] servant', id)
    return prx

  ## Gets the FEMEndreleases object fields.
  #
  # @param id FEMEndreleases object ID
  # @return FEMEndreleasesFields object
  def getFEMEndreleasesFields(self, id, current=None):
    logging.debug('getFEMEndreleasesFields(oid=%d)' % id)
    return self._getFEMEndreleasesFields(id, current)

  ## Gets the FEMEndreleases object fields.
  #
  # @param id FEMEndreleases object ID
  # @return FEMEndreleasesFields object
  def _getFEMEndreleasesFields(self, id, current=None):
    fields = SenStore.FEMEndreleasesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMEndreleases(fields):
          return None
    return fields

  ## Sets the FEMEndreleases object fields.
  #
  # @param fields     FEMEndreleases fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMEndreleasesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMEndreleasesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMEndreleases(fields, fieldNames)

  ## Gets a list of IDs of all FEMEndreleases objects.
  #
  # @return ids list of FEMEndreleases object IDs
  def getFEMEndreleasesIds(self, current=None):
    logging.debug('getFEMEndreleasesList()')
    with self.lock:
      return self.pg.getFEMEndreleasesIds()

  ## Gets a list of FEMEndreleases object proxies.
  #
  # @param ids list of FEMEndreleases object IDs
  # @return list of FEMEndreleases object proxies
  def getFEMEndreleasesList(self, ids, current=None):
    logging.debug('getFEMEndreleasesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMEndreleases(id) for id in ids]

  ## Gets a list of FEMEndreleases fields objects.
  #
  # @param ids list of FEMEndreleases object IDs
  # @return list of FEMEndreleases fields objects
  def getFEMEndreleasesFieldsList(self, ids, current=None):
    logging.debug('getFEMEndreleasesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMEndreleasesFields(id) for id in ids]

  ## Gets a list of all FEMEndreleases object IDs.
  #
  # @param fields FEMEndreleases object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMEndreleases objects
  #
  def findEqualFEMEndreleases(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMEndreleases()')
    with self.lock:
      ids = self.pg.findEqualFEMEndreleases(fields, fieldNames)
    return ids

  ## Adds a FEMTrussGroup object to the store.
  #
  # @param fields  FEMTrussGroupFields object
  # @return newly assigned ID
  def addFEMTrussGroup(self, fields, current=None):
    logging.debug('addFEMTrussGroup()')
    with self.lock:
      self.pg.addFEMTrussGroup(fields)
    return fields.id


  ## Adds a set of FEMTrussGroup objects to the store.
  #
  # @param fieldsList  list of FEMTrussGroupFields objects
  # @return list of newly assigned IDs
  def addFEMTrussGroupList(self, fieldsList, current=None):
    logging.debug('addFEMTrussGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTrussGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTrussGroup object proxy by its ID.
  #
  # @param id FEMTrussGroup object ID
  # @return FEMTrussGroup object proxy
  def getFEMTrussGroup(self, id, current=None):
    logging.debug('getFEMTrussGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTrussGroup.has_key(id):
        logging.debug('Fetched FEMTrussGroup[oid=%d] servant from cache', id)
        return self.registryFEMTrussGroup[id]
      obj = FEMTrussGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTrussGroupPrx.uncheckedCast(srvt)
      self.registryFEMTrussGroup[id] = prx
    logging.debug('Activated FEMTrussGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMTrussGroup object fields.
  #
  # @param id FEMTrussGroup object ID
  # @return FEMTrussGroupFields object
  def getFEMTrussGroupFields(self, id, current=None):
    logging.debug('getFEMTrussGroupFields(oid=%d)' % id)
    return self._getFEMTrussGroupFields(id, current)

  ## Gets the FEMTrussGroup object fields.
  #
  # @param id FEMTrussGroup object ID
  # @return FEMTrussGroupFields object
  def _getFEMTrussGroupFields(self, id, current=None):
    fields = SenStore.FEMTrussGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTrussGroup(fields):
          return None
    return fields

  ## Sets the FEMTrussGroup object fields.
  #
  # @param fields     FEMTrussGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTrussGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTrussGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTrussGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMTrussGroup objects.
  #
  # @return ids list of FEMTrussGroup object IDs
  def getFEMTrussGroupIds(self, current=None):
    logging.debug('getFEMTrussGroupList()')
    with self.lock:
      return self.pg.getFEMTrussGroupIds()

  ## Gets a list of FEMTrussGroup object proxies.
  #
  # @param ids list of FEMTrussGroup object IDs
  # @return list of FEMTrussGroup object proxies
  def getFEMTrussGroupList(self, ids, current=None):
    logging.debug('getFEMTrussGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTrussGroup(id) for id in ids]

  ## Gets a list of FEMTrussGroup fields objects.
  #
  # @param ids list of FEMTrussGroup object IDs
  # @return list of FEMTrussGroup fields objects
  def getFEMTrussGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMTrussGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTrussGroupFields(id) for id in ids]

  ## Gets a list of all FEMTrussGroup object IDs.
  #
  # @param fields FEMTrussGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTrussGroup objects
  #
  def findEqualFEMTrussGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTrussGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMTrussGroup(fields, fieldNames)
    return ids

  ## Adds a FEMInitialTemperature object to the store.
  #
  # @param fields  FEMInitialTemperatureFields object
  # @return newly assigned ID
  def addFEMInitialTemperature(self, fields, current=None):
    logging.debug('addFEMInitialTemperature()')
    with self.lock:
      self.pg.addFEMInitialTemperature(fields)
    return fields.id


  ## Adds a set of FEMInitialTemperature objects to the store.
  #
  # @param fieldsList  list of FEMInitialTemperatureFields objects
  # @return list of newly assigned IDs
  def addFEMInitialTemperatureList(self, fieldsList, current=None):
    logging.debug('addFEMInitialTemperatureList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMInitialTemperatureList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMInitialTemperature object proxy by its ID.
  #
  # @param id FEMInitialTemperature object ID
  # @return FEMInitialTemperature object proxy
  def getFEMInitialTemperature(self, id, current=None):
    logging.debug('getFEMInitialTemperature(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMInitialTemperature.has_key(id):
        logging.debug('Fetched FEMInitialTemperature[oid=%d] servant from cache', id)
        return self.registryFEMInitialTemperature[id]
      obj = FEMInitialTemperatureI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMInitialTemperaturePrx.uncheckedCast(srvt)
      self.registryFEMInitialTemperature[id] = prx
    logging.debug('Activated FEMInitialTemperature[oid=%d] servant', id)
    return prx

  ## Gets the FEMInitialTemperature object fields.
  #
  # @param id FEMInitialTemperature object ID
  # @return FEMInitialTemperatureFields object
  def getFEMInitialTemperatureFields(self, id, current=None):
    logging.debug('getFEMInitialTemperatureFields(oid=%d)' % id)
    return self._getFEMInitialTemperatureFields(id, current)

  ## Gets the FEMInitialTemperature object fields.
  #
  # @param id FEMInitialTemperature object ID
  # @return FEMInitialTemperatureFields object
  def _getFEMInitialTemperatureFields(self, id, current=None):
    fields = SenStore.FEMInitialTemperatureFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMInitialTemperature(fields):
          return None
    return fields

  ## Sets the FEMInitialTemperature object fields.
  #
  # @param fields     FEMInitialTemperature fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMInitialTemperatureFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMInitialTemperatureFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMInitialTemperature(fields, fieldNames)

  ## Gets a list of IDs of all FEMInitialTemperature objects.
  #
  # @return ids list of FEMInitialTemperature object IDs
  def getFEMInitialTemperatureIds(self, current=None):
    logging.debug('getFEMInitialTemperatureList()')
    with self.lock:
      return self.pg.getFEMInitialTemperatureIds()

  ## Gets a list of FEMInitialTemperature object proxies.
  #
  # @param ids list of FEMInitialTemperature object IDs
  # @return list of FEMInitialTemperature object proxies
  def getFEMInitialTemperatureList(self, ids, current=None):
    logging.debug('getFEMInitialTemperatureList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMInitialTemperature(id) for id in ids]

  ## Gets a list of FEMInitialTemperature fields objects.
  #
  # @param ids list of FEMInitialTemperature object IDs
  # @return list of FEMInitialTemperature fields objects
  def getFEMInitialTemperatureFieldsList(self, ids, current=None):
    logging.debug('getFEMInitialTemperatureFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMInitialTemperatureFields(id) for id in ids]

  ## Gets a list of all FEMInitialTemperature object IDs.
  #
  # @param fields FEMInitialTemperature object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMInitialTemperature objects
  #
  def findEqualFEMInitialTemperature(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMInitialTemperature()')
    with self.lock:
      ids = self.pg.findEqualFEMInitialTemperature(fields, fieldNames)
    return ids

  ## Adds a FEMThermoIsoMaterials object to the store.
  #
  # @param fields  FEMThermoIsoMaterialsFields object
  # @return newly assigned ID
  def addFEMThermoIsoMaterials(self, fields, current=None):
    logging.debug('addFEMThermoIsoMaterials()')
    with self.lock:
      self.pg.addFEMThermoIsoMaterials(fields)
    return fields.id


  ## Adds a set of FEMThermoIsoMaterials objects to the store.
  #
  # @param fieldsList  list of FEMThermoIsoMaterialsFields objects
  # @return list of newly assigned IDs
  def addFEMThermoIsoMaterialsList(self, fieldsList, current=None):
    logging.debug('addFEMThermoIsoMaterialsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThermoIsoMaterialsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThermoIsoMaterials object proxy by its ID.
  #
  # @param id FEMThermoIsoMaterials object ID
  # @return FEMThermoIsoMaterials object proxy
  def getFEMThermoIsoMaterials(self, id, current=None):
    logging.debug('getFEMThermoIsoMaterials(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThermoIsoMaterials.has_key(id):
        logging.debug('Fetched FEMThermoIsoMaterials[oid=%d] servant from cache', id)
        return self.registryFEMThermoIsoMaterials[id]
      obj = FEMThermoIsoMaterialsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThermoIsoMaterialsPrx.uncheckedCast(srvt)
      self.registryFEMThermoIsoMaterials[id] = prx
    logging.debug('Activated FEMThermoIsoMaterials[oid=%d] servant', id)
    return prx

  ## Gets the FEMThermoIsoMaterials object fields.
  #
  # @param id FEMThermoIsoMaterials object ID
  # @return FEMThermoIsoMaterialsFields object
  def getFEMThermoIsoMaterialsFields(self, id, current=None):
    logging.debug('getFEMThermoIsoMaterialsFields(oid=%d)' % id)
    return self._getFEMThermoIsoMaterialsFields(id, current)

  ## Gets the FEMThermoIsoMaterials object fields.
  #
  # @param id FEMThermoIsoMaterials object ID
  # @return FEMThermoIsoMaterialsFields object
  def _getFEMThermoIsoMaterialsFields(self, id, current=None):
    fields = SenStore.FEMThermoIsoMaterialsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThermoIsoMaterials(fields):
          return None
    return fields

  ## Sets the FEMThermoIsoMaterials object fields.
  #
  # @param fields     FEMThermoIsoMaterials fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThermoIsoMaterialsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThermoIsoMaterialsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThermoIsoMaterials(fields, fieldNames)

  ## Gets a list of IDs of all FEMThermoIsoMaterials objects.
  #
  # @return ids list of FEMThermoIsoMaterials object IDs
  def getFEMThermoIsoMaterialsIds(self, current=None):
    logging.debug('getFEMThermoIsoMaterialsList()')
    with self.lock:
      return self.pg.getFEMThermoIsoMaterialsIds()

  ## Gets a list of FEMThermoIsoMaterials object proxies.
  #
  # @param ids list of FEMThermoIsoMaterials object IDs
  # @return list of FEMThermoIsoMaterials object proxies
  def getFEMThermoIsoMaterialsList(self, ids, current=None):
    logging.debug('getFEMThermoIsoMaterialsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThermoIsoMaterials(id) for id in ids]

  ## Gets a list of FEMThermoIsoMaterials fields objects.
  #
  # @param ids list of FEMThermoIsoMaterials object IDs
  # @return list of FEMThermoIsoMaterials fields objects
  def getFEMThermoIsoMaterialsFieldsList(self, ids, current=None):
    logging.debug('getFEMThermoIsoMaterialsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThermoIsoMaterialsFields(id) for id in ids]

  ## Gets a list of all FEMThermoIsoMaterials object IDs.
  #
  # @param fields FEMThermoIsoMaterials object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThermoIsoMaterials objects
  #
  def findEqualFEMThermoIsoMaterials(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThermoIsoMaterials()')
    with self.lock:
      ids = self.pg.findEqualFEMThermoIsoMaterials(fields, fieldNames)
    return ids

  ## Adds a FEMThermoIsoData object to the store.
  #
  # @param fields  FEMThermoIsoDataFields object
  # @return newly assigned ID
  def addFEMThermoIsoData(self, fields, current=None):
    logging.debug('addFEMThermoIsoData()')
    with self.lock:
      self.pg.addFEMThermoIsoData(fields)
    return fields.id


  ## Adds a set of FEMThermoIsoData objects to the store.
  #
  # @param fieldsList  list of FEMThermoIsoDataFields objects
  # @return list of newly assigned IDs
  def addFEMThermoIsoDataList(self, fieldsList, current=None):
    logging.debug('addFEMThermoIsoDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThermoIsoDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThermoIsoData object proxy by its ID.
  #
  # @param id FEMThermoIsoData object ID
  # @return FEMThermoIsoData object proxy
  def getFEMThermoIsoData(self, id, current=None):
    logging.debug('getFEMThermoIsoData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThermoIsoData.has_key(id):
        logging.debug('Fetched FEMThermoIsoData[oid=%d] servant from cache', id)
        return self.registryFEMThermoIsoData[id]
      obj = FEMThermoIsoDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThermoIsoDataPrx.uncheckedCast(srvt)
      self.registryFEMThermoIsoData[id] = prx
    logging.debug('Activated FEMThermoIsoData[oid=%d] servant', id)
    return prx

  ## Gets the FEMThermoIsoData object fields.
  #
  # @param id FEMThermoIsoData object ID
  # @return FEMThermoIsoDataFields object
  def getFEMThermoIsoDataFields(self, id, current=None):
    logging.debug('getFEMThermoIsoDataFields(oid=%d)' % id)
    return self._getFEMThermoIsoDataFields(id, current)

  ## Gets the FEMThermoIsoData object fields.
  #
  # @param id FEMThermoIsoData object ID
  # @return FEMThermoIsoDataFields object
  def _getFEMThermoIsoDataFields(self, id, current=None):
    fields = SenStore.FEMThermoIsoDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThermoIsoData(fields):
          return None
    return fields

  ## Sets the FEMThermoIsoData object fields.
  #
  # @param fields     FEMThermoIsoData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThermoIsoDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThermoIsoDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThermoIsoData(fields, fieldNames)

  ## Gets a list of IDs of all FEMThermoIsoData objects.
  #
  # @return ids list of FEMThermoIsoData object IDs
  def getFEMThermoIsoDataIds(self, current=None):
    logging.debug('getFEMThermoIsoDataList()')
    with self.lock:
      return self.pg.getFEMThermoIsoDataIds()

  ## Gets a list of FEMThermoIsoData object proxies.
  #
  # @param ids list of FEMThermoIsoData object IDs
  # @return list of FEMThermoIsoData object proxies
  def getFEMThermoIsoDataList(self, ids, current=None):
    logging.debug('getFEMThermoIsoDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThermoIsoData(id) for id in ids]

  ## Gets a list of FEMThermoIsoData fields objects.
  #
  # @param ids list of FEMThermoIsoData object IDs
  # @return list of FEMThermoIsoData fields objects
  def getFEMThermoIsoDataFieldsList(self, ids, current=None):
    logging.debug('getFEMThermoIsoDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThermoIsoDataFields(id) for id in ids]

  ## Gets a list of all FEMThermoIsoData object IDs.
  #
  # @param fields FEMThermoIsoData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThermoIsoData objects
  #
  def findEqualFEMThermoIsoData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThermoIsoData()')
    with self.lock:
      ids = self.pg.findEqualFEMThermoIsoData(fields, fieldNames)
    return ids

  ## Adds a FEMContactGroup3 object to the store.
  #
  # @param fields  FEMContactGroup3Fields object
  # @return newly assigned ID
  def addFEMContactGroup3(self, fields, current=None):
    logging.debug('addFEMContactGroup3()')
    with self.lock:
      self.pg.addFEMContactGroup3(fields)
    return fields.id


  ## Adds a set of FEMContactGroup3 objects to the store.
  #
  # @param fieldsList  list of FEMContactGroup3Fields objects
  # @return list of newly assigned IDs
  def addFEMContactGroup3List(self, fieldsList, current=None):
    logging.debug('addFEMContactGroup3List()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMContactGroup3List(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMContactGroup3 object proxy by its ID.
  #
  # @param id FEMContactGroup3 object ID
  # @return FEMContactGroup3 object proxy
  def getFEMContactGroup3(self, id, current=None):
    logging.debug('getFEMContactGroup3(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMContactGroup3.has_key(id):
        logging.debug('Fetched FEMContactGroup3[oid=%d] servant from cache', id)
        return self.registryFEMContactGroup3[id]
      obj = FEMContactGroup3I(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMContactGroup3Prx.uncheckedCast(srvt)
      self.registryFEMContactGroup3[id] = prx
    logging.debug('Activated FEMContactGroup3[oid=%d] servant', id)
    return prx

  ## Gets the FEMContactGroup3 object fields.
  #
  # @param id FEMContactGroup3 object ID
  # @return FEMContactGroup3Fields object
  def getFEMContactGroup3Fields(self, id, current=None):
    logging.debug('getFEMContactGroup3Fields(oid=%d)' % id)
    return self._getFEMContactGroup3Fields(id, current)

  ## Gets the FEMContactGroup3 object fields.
  #
  # @param id FEMContactGroup3 object ID
  # @return FEMContactGroup3Fields object
  def _getFEMContactGroup3Fields(self, id, current=None):
    fields = SenStore.FEMContactGroup3Fields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMContactGroup3(fields):
          return None
    return fields

  ## Sets the FEMContactGroup3 object fields.
  #
  # @param fields     FEMContactGroup3 fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMContactGroup3Fields(self, fields, fieldNames, current=None):
    logging.debug('setFEMContactGroup3Fields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMContactGroup3(fields, fieldNames)

  ## Gets a list of IDs of all FEMContactGroup3 objects.
  #
  # @return ids list of FEMContactGroup3 object IDs
  def getFEMContactGroup3Ids(self, current=None):
    logging.debug('getFEMContactGroup3List()')
    with self.lock:
      return self.pg.getFEMContactGroup3Ids()

  ## Gets a list of FEMContactGroup3 object proxies.
  #
  # @param ids list of FEMContactGroup3 object IDs
  # @return list of FEMContactGroup3 object proxies
  def getFEMContactGroup3List(self, ids, current=None):
    logging.debug('getFEMContactGroup3List()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMContactGroup3(id) for id in ids]

  ## Gets a list of FEMContactGroup3 fields objects.
  #
  # @param ids list of FEMContactGroup3 object IDs
  # @return list of FEMContactGroup3 fields objects
  def getFEMContactGroup3FieldsList(self, ids, current=None):
    logging.debug('getFEMContactGroup3FieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMContactGroup3Fields(id) for id in ids]

  ## Gets a list of all FEMContactGroup3 object IDs.
  #
  # @param fields FEMContactGroup3 object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMContactGroup3 objects
  #
  def findEqualFEMContactGroup3(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMContactGroup3()')
    with self.lock:
      ids = self.pg.findEqualFEMContactGroup3(fields, fieldNames)
    return ids

  ## Adds a FEMNLElasticMaterials object to the store.
  #
  # @param fields  FEMNLElasticMaterialsFields object
  # @return newly assigned ID
  def addFEMNLElasticMaterials(self, fields, current=None):
    logging.debug('addFEMNLElasticMaterials()')
    with self.lock:
      self.pg.addFEMNLElasticMaterials(fields)
    return fields.id


  ## Adds a set of FEMNLElasticMaterials objects to the store.
  #
  # @param fieldsList  list of FEMNLElasticMaterialsFields objects
  # @return list of newly assigned IDs
  def addFEMNLElasticMaterialsList(self, fieldsList, current=None):
    logging.debug('addFEMNLElasticMaterialsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNLElasticMaterialsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNLElasticMaterials object proxy by its ID.
  #
  # @param id FEMNLElasticMaterials object ID
  # @return FEMNLElasticMaterials object proxy
  def getFEMNLElasticMaterials(self, id, current=None):
    logging.debug('getFEMNLElasticMaterials(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNLElasticMaterials.has_key(id):
        logging.debug('Fetched FEMNLElasticMaterials[oid=%d] servant from cache', id)
        return self.registryFEMNLElasticMaterials[id]
      obj = FEMNLElasticMaterialsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNLElasticMaterialsPrx.uncheckedCast(srvt)
      self.registryFEMNLElasticMaterials[id] = prx
    logging.debug('Activated FEMNLElasticMaterials[oid=%d] servant', id)
    return prx

  ## Gets the FEMNLElasticMaterials object fields.
  #
  # @param id FEMNLElasticMaterials object ID
  # @return FEMNLElasticMaterialsFields object
  def getFEMNLElasticMaterialsFields(self, id, current=None):
    logging.debug('getFEMNLElasticMaterialsFields(oid=%d)' % id)
    return self._getFEMNLElasticMaterialsFields(id, current)

  ## Gets the FEMNLElasticMaterials object fields.
  #
  # @param id FEMNLElasticMaterials object ID
  # @return FEMNLElasticMaterialsFields object
  def _getFEMNLElasticMaterialsFields(self, id, current=None):
    fields = SenStore.FEMNLElasticMaterialsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNLElasticMaterials(fields):
          return None
    return fields

  ## Sets the FEMNLElasticMaterials object fields.
  #
  # @param fields     FEMNLElasticMaterials fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNLElasticMaterialsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNLElasticMaterialsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNLElasticMaterials(fields, fieldNames)

  ## Gets a list of IDs of all FEMNLElasticMaterials objects.
  #
  # @return ids list of FEMNLElasticMaterials object IDs
  def getFEMNLElasticMaterialsIds(self, current=None):
    logging.debug('getFEMNLElasticMaterialsList()')
    with self.lock:
      return self.pg.getFEMNLElasticMaterialsIds()

  ## Gets a list of FEMNLElasticMaterials object proxies.
  #
  # @param ids list of FEMNLElasticMaterials object IDs
  # @return list of FEMNLElasticMaterials object proxies
  def getFEMNLElasticMaterialsList(self, ids, current=None):
    logging.debug('getFEMNLElasticMaterialsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNLElasticMaterials(id) for id in ids]

  ## Gets a list of FEMNLElasticMaterials fields objects.
  #
  # @param ids list of FEMNLElasticMaterials object IDs
  # @return list of FEMNLElasticMaterials fields objects
  def getFEMNLElasticMaterialsFieldsList(self, ids, current=None):
    logging.debug('getFEMNLElasticMaterialsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNLElasticMaterialsFields(id) for id in ids]

  ## Gets a list of all FEMNLElasticMaterials object IDs.
  #
  # @param fields FEMNLElasticMaterials object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNLElasticMaterials objects
  #
  def findEqualFEMNLElasticMaterials(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNLElasticMaterials()')
    with self.lock:
      ids = self.pg.findEqualFEMNLElasticMaterials(fields, fieldNames)
    return ids

  ## Adds a FEMPlate object to the store.
  #
  # @param fields  FEMPlateFields object
  # @return newly assigned ID
  def addFEMPlate(self, fields, current=None):
    logging.debug('addFEMPlate()')
    with self.lock:
      self.pg.addFEMPlate(fields)
    return fields.id


  ## Adds a set of FEMPlate objects to the store.
  #
  # @param fieldsList  list of FEMPlateFields objects
  # @return list of newly assigned IDs
  def addFEMPlateList(self, fieldsList, current=None):
    logging.debug('addFEMPlateList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPlateList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPlate object proxy by its ID.
  #
  # @param id FEMPlate object ID
  # @return FEMPlate object proxy
  def getFEMPlate(self, id, current=None):
    logging.debug('getFEMPlate(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPlate.has_key(id):
        logging.debug('Fetched FEMPlate[oid=%d] servant from cache', id)
        return self.registryFEMPlate[id]
      obj = FEMPlateI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPlatePrx.uncheckedCast(srvt)
      self.registryFEMPlate[id] = prx
    logging.debug('Activated FEMPlate[oid=%d] servant', id)
    return prx

  ## Gets the FEMPlate object fields.
  #
  # @param id FEMPlate object ID
  # @return FEMPlateFields object
  def getFEMPlateFields(self, id, current=None):
    logging.debug('getFEMPlateFields(oid=%d)' % id)
    return self._getFEMPlateFields(id, current)

  ## Gets the FEMPlate object fields.
  #
  # @param id FEMPlate object ID
  # @return FEMPlateFields object
  def _getFEMPlateFields(self, id, current=None):
    fields = SenStore.FEMPlateFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPlate(fields):
          return None
    return fields

  ## Sets the FEMPlate object fields.
  #
  # @param fields     FEMPlate fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPlateFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPlateFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPlate(fields, fieldNames)

  ## Gets a list of IDs of all FEMPlate objects.
  #
  # @return ids list of FEMPlate object IDs
  def getFEMPlateIds(self, current=None):
    logging.debug('getFEMPlateList()')
    with self.lock:
      return self.pg.getFEMPlateIds()

  ## Gets a list of FEMPlate object proxies.
  #
  # @param ids list of FEMPlate object IDs
  # @return list of FEMPlate object proxies
  def getFEMPlateList(self, ids, current=None):
    logging.debug('getFEMPlateList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPlate(id) for id in ids]

  ## Gets a list of FEMPlate fields objects.
  #
  # @param ids list of FEMPlate object IDs
  # @return list of FEMPlate fields objects
  def getFEMPlateFieldsList(self, ids, current=None):
    logging.debug('getFEMPlateFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPlateFields(id) for id in ids]

  ## Gets a list of all FEMPlate object IDs.
  #
  # @param fields FEMPlate object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPlate objects
  #
  def findEqualFEMPlate(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPlate()')
    with self.lock:
      ids = self.pg.findEqualFEMPlate(fields, fieldNames)
    return ids

  ## Adds a FEMIsoBeam object to the store.
  #
  # @param fields  FEMIsoBeamFields object
  # @return newly assigned ID
  def addFEMIsoBeam(self, fields, current=None):
    logging.debug('addFEMIsoBeam()')
    with self.lock:
      self.pg.addFEMIsoBeam(fields)
    return fields.id


  ## Adds a set of FEMIsoBeam objects to the store.
  #
  # @param fieldsList  list of FEMIsoBeamFields objects
  # @return list of newly assigned IDs
  def addFEMIsoBeamList(self, fieldsList, current=None):
    logging.debug('addFEMIsoBeamList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMIsoBeamList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMIsoBeam object proxy by its ID.
  #
  # @param id FEMIsoBeam object ID
  # @return FEMIsoBeam object proxy
  def getFEMIsoBeam(self, id, current=None):
    logging.debug('getFEMIsoBeam(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMIsoBeam.has_key(id):
        logging.debug('Fetched FEMIsoBeam[oid=%d] servant from cache', id)
        return self.registryFEMIsoBeam[id]
      obj = FEMIsoBeamI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMIsoBeamPrx.uncheckedCast(srvt)
      self.registryFEMIsoBeam[id] = prx
    logging.debug('Activated FEMIsoBeam[oid=%d] servant', id)
    return prx

  ## Gets the FEMIsoBeam object fields.
  #
  # @param id FEMIsoBeam object ID
  # @return FEMIsoBeamFields object
  def getFEMIsoBeamFields(self, id, current=None):
    logging.debug('getFEMIsoBeamFields(oid=%d)' % id)
    return self._getFEMIsoBeamFields(id, current)

  ## Gets the FEMIsoBeam object fields.
  #
  # @param id FEMIsoBeam object ID
  # @return FEMIsoBeamFields object
  def _getFEMIsoBeamFields(self, id, current=None):
    fields = SenStore.FEMIsoBeamFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMIsoBeam(fields):
          return None
    return fields

  ## Sets the FEMIsoBeam object fields.
  #
  # @param fields     FEMIsoBeam fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMIsoBeamFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMIsoBeamFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMIsoBeam(fields, fieldNames)

  ## Gets a list of IDs of all FEMIsoBeam objects.
  #
  # @return ids list of FEMIsoBeam object IDs
  def getFEMIsoBeamIds(self, current=None):
    logging.debug('getFEMIsoBeamList()')
    with self.lock:
      return self.pg.getFEMIsoBeamIds()

  ## Gets a list of FEMIsoBeam object proxies.
  #
  # @param ids list of FEMIsoBeam object IDs
  # @return list of FEMIsoBeam object proxies
  def getFEMIsoBeamList(self, ids, current=None):
    logging.debug('getFEMIsoBeamList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMIsoBeam(id) for id in ids]

  ## Gets a list of FEMIsoBeam fields objects.
  #
  # @param ids list of FEMIsoBeam object IDs
  # @return list of FEMIsoBeam fields objects
  def getFEMIsoBeamFieldsList(self, ids, current=None):
    logging.debug('getFEMIsoBeamFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMIsoBeamFields(id) for id in ids]

  ## Gets a list of all FEMIsoBeam object IDs.
  #
  # @param fields FEMIsoBeam object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMIsoBeam objects
  #
  def findEqualFEMIsoBeam(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMIsoBeam()')
    with self.lock:
      ids = self.pg.findEqualFEMIsoBeam(fields, fieldNames)
    return ids

  ## Adds a FEMAppliedConcentratedLoad object to the store.
  #
  # @param fields  FEMAppliedConcentratedLoadFields object
  # @return newly assigned ID
  def addFEMAppliedConcentratedLoad(self, fields, current=None):
    logging.debug('addFEMAppliedConcentratedLoad()')
    with self.lock:
      self.pg.addFEMAppliedConcentratedLoad(fields)
    return fields.id


  ## Adds a set of FEMAppliedConcentratedLoad objects to the store.
  #
  # @param fieldsList  list of FEMAppliedConcentratedLoadFields objects
  # @return list of newly assigned IDs
  def addFEMAppliedConcentratedLoadList(self, fieldsList, current=None):
    logging.debug('addFEMAppliedConcentratedLoadList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMAppliedConcentratedLoadList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMAppliedConcentratedLoad object proxy by its ID.
  #
  # @param id FEMAppliedConcentratedLoad object ID
  # @return FEMAppliedConcentratedLoad object proxy
  def getFEMAppliedConcentratedLoad(self, id, current=None):
    logging.debug('getFEMAppliedConcentratedLoad(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMAppliedConcentratedLoad.has_key(id):
        logging.debug('Fetched FEMAppliedConcentratedLoad[oid=%d] servant from cache', id)
        return self.registryFEMAppliedConcentratedLoad[id]
      obj = FEMAppliedConcentratedLoadI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMAppliedConcentratedLoadPrx.uncheckedCast(srvt)
      self.registryFEMAppliedConcentratedLoad[id] = prx
    logging.debug('Activated FEMAppliedConcentratedLoad[oid=%d] servant', id)
    return prx

  ## Gets the FEMAppliedConcentratedLoad object fields.
  #
  # @param id FEMAppliedConcentratedLoad object ID
  # @return FEMAppliedConcentratedLoadFields object
  def getFEMAppliedConcentratedLoadFields(self, id, current=None):
    logging.debug('getFEMAppliedConcentratedLoadFields(oid=%d)' % id)
    return self._getFEMAppliedConcentratedLoadFields(id, current)

  ## Gets the FEMAppliedConcentratedLoad object fields.
  #
  # @param id FEMAppliedConcentratedLoad object ID
  # @return FEMAppliedConcentratedLoadFields object
  def _getFEMAppliedConcentratedLoadFields(self, id, current=None):
    fields = SenStore.FEMAppliedConcentratedLoadFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMAppliedConcentratedLoad(fields):
          return None
    return fields

  ## Sets the FEMAppliedConcentratedLoad object fields.
  #
  # @param fields     FEMAppliedConcentratedLoad fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMAppliedConcentratedLoadFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMAppliedConcentratedLoadFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMAppliedConcentratedLoad(fields, fieldNames)

  ## Gets a list of IDs of all FEMAppliedConcentratedLoad objects.
  #
  # @return ids list of FEMAppliedConcentratedLoad object IDs
  def getFEMAppliedConcentratedLoadIds(self, current=None):
    logging.debug('getFEMAppliedConcentratedLoadList()')
    with self.lock:
      return self.pg.getFEMAppliedConcentratedLoadIds()

  ## Gets a list of FEMAppliedConcentratedLoad object proxies.
  #
  # @param ids list of FEMAppliedConcentratedLoad object IDs
  # @return list of FEMAppliedConcentratedLoad object proxies
  def getFEMAppliedConcentratedLoadList(self, ids, current=None):
    logging.debug('getFEMAppliedConcentratedLoadList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMAppliedConcentratedLoad(id) for id in ids]

  ## Gets a list of FEMAppliedConcentratedLoad fields objects.
  #
  # @param ids list of FEMAppliedConcentratedLoad object IDs
  # @return list of FEMAppliedConcentratedLoad fields objects
  def getFEMAppliedConcentratedLoadFieldsList(self, ids, current=None):
    logging.debug('getFEMAppliedConcentratedLoadFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMAppliedConcentratedLoadFields(id) for id in ids]

  ## Gets a list of all FEMAppliedConcentratedLoad object IDs.
  #
  # @param fields FEMAppliedConcentratedLoad object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMAppliedConcentratedLoad objects
  #
  def findEqualFEMAppliedConcentratedLoad(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMAppliedConcentratedLoad()')
    with self.lock:
      ids = self.pg.findEqualFEMAppliedConcentratedLoad(fields, fieldNames)
    return ids

  ## Adds a FEMTwoDSolidGroup object to the store.
  #
  # @param fields  FEMTwoDSolidGroupFields object
  # @return newly assigned ID
  def addFEMTwoDSolidGroup(self, fields, current=None):
    logging.debug('addFEMTwoDSolidGroup()')
    with self.lock:
      self.pg.addFEMTwoDSolidGroup(fields)
    return fields.id


  ## Adds a set of FEMTwoDSolidGroup objects to the store.
  #
  # @param fieldsList  list of FEMTwoDSolidGroupFields objects
  # @return list of newly assigned IDs
  def addFEMTwoDSolidGroupList(self, fieldsList, current=None):
    logging.debug('addFEMTwoDSolidGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTwoDSolidGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTwoDSolidGroup object proxy by its ID.
  #
  # @param id FEMTwoDSolidGroup object ID
  # @return FEMTwoDSolidGroup object proxy
  def getFEMTwoDSolidGroup(self, id, current=None):
    logging.debug('getFEMTwoDSolidGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTwoDSolidGroup.has_key(id):
        logging.debug('Fetched FEMTwoDSolidGroup[oid=%d] servant from cache', id)
        return self.registryFEMTwoDSolidGroup[id]
      obj = FEMTwoDSolidGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTwoDSolidGroupPrx.uncheckedCast(srvt)
      self.registryFEMTwoDSolidGroup[id] = prx
    logging.debug('Activated FEMTwoDSolidGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMTwoDSolidGroup object fields.
  #
  # @param id FEMTwoDSolidGroup object ID
  # @return FEMTwoDSolidGroupFields object
  def getFEMTwoDSolidGroupFields(self, id, current=None):
    logging.debug('getFEMTwoDSolidGroupFields(oid=%d)' % id)
    return self._getFEMTwoDSolidGroupFields(id, current)

  ## Gets the FEMTwoDSolidGroup object fields.
  #
  # @param id FEMTwoDSolidGroup object ID
  # @return FEMTwoDSolidGroupFields object
  def _getFEMTwoDSolidGroupFields(self, id, current=None):
    fields = SenStore.FEMTwoDSolidGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTwoDSolidGroup(fields):
          return None
    return fields

  ## Sets the FEMTwoDSolidGroup object fields.
  #
  # @param fields     FEMTwoDSolidGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTwoDSolidGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTwoDSolidGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTwoDSolidGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMTwoDSolidGroup objects.
  #
  # @return ids list of FEMTwoDSolidGroup object IDs
  def getFEMTwoDSolidGroupIds(self, current=None):
    logging.debug('getFEMTwoDSolidGroupList()')
    with self.lock:
      return self.pg.getFEMTwoDSolidGroupIds()

  ## Gets a list of FEMTwoDSolidGroup object proxies.
  #
  # @param ids list of FEMTwoDSolidGroup object IDs
  # @return list of FEMTwoDSolidGroup object proxies
  def getFEMTwoDSolidGroupList(self, ids, current=None):
    logging.debug('getFEMTwoDSolidGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTwoDSolidGroup(id) for id in ids]

  ## Gets a list of FEMTwoDSolidGroup fields objects.
  #
  # @param ids list of FEMTwoDSolidGroup object IDs
  # @return list of FEMTwoDSolidGroup fields objects
  def getFEMTwoDSolidGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMTwoDSolidGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTwoDSolidGroupFields(id) for id in ids]

  ## Gets a list of all FEMTwoDSolidGroup object IDs.
  #
  # @param fields FEMTwoDSolidGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTwoDSolidGroup objects
  #
  def findEqualFEMTwoDSolidGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTwoDSolidGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMTwoDSolidGroup(fields, fieldNames)
    return ids

  ## Adds a FEMGroup object to the store.
  #
  # @param fields  FEMGroupFields object
  # @return newly assigned ID
  def addFEMGroup(self, fields, current=None):
    logging.debug('addFEMGroup()')
    with self.lock:
      self.pg.addFEMGroup(fields)
    return fields.id


  ## Adds a set of FEMGroup objects to the store.
  #
  # @param fieldsList  list of FEMGroupFields objects
  # @return list of newly assigned IDs
  def addFEMGroupList(self, fieldsList, current=None):
    logging.debug('addFEMGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMGroup object proxy by its ID.
  #
  # @param id FEMGroup object ID
  # @return FEMGroup object proxy
  def getFEMGroup(self, id, current=None):
    logging.debug('getFEMGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMGroup.has_key(id):
        logging.debug('Fetched FEMGroup[oid=%d] servant from cache', id)
        return self.registryFEMGroup[id]
      obj = FEMGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMGroupPrx.uncheckedCast(srvt)
      self.registryFEMGroup[id] = prx
    logging.debug('Activated FEMGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMGroup object fields.
  #
  # @param id FEMGroup object ID
  # @return FEMGroupFields object
  def getFEMGroupFields(self, id, current=None):
    logging.debug('getFEMGroupFields(oid=%d)' % id)
    return self._getFEMGroupFields(id, current)

  ## Gets the FEMGroup object fields.
  #
  # @param id FEMGroup object ID
  # @return FEMGroupFields object
  def _getFEMGroupFields(self, id, current=None):
    fields = SenStore.FEMGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMGroup(fields):
          return None
    return fields

  ## Sets the FEMGroup object fields.
  #
  # @param fields     FEMGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMGroup objects.
  #
  # @return ids list of FEMGroup object IDs
  def getFEMGroupIds(self, current=None):
    logging.debug('getFEMGroupList()')
    with self.lock:
      return self.pg.getFEMGroupIds()

  ## Gets a list of FEMGroup object proxies.
  #
  # @param ids list of FEMGroup object IDs
  # @return list of FEMGroup object proxies
  def getFEMGroupList(self, ids, current=None):
    logging.debug('getFEMGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMGroup(id) for id in ids]

  ## Gets a list of FEMGroup fields objects.
  #
  # @param ids list of FEMGroup object IDs
  # @return list of FEMGroup fields objects
  def getFEMGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMGroupFields(id) for id in ids]

  ## Gets a list of all FEMGroup object IDs.
  #
  # @param fields FEMGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMGroup objects
  #
  def findEqualFEMGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMGroup(fields, fieldNames)
    return ids

  ## Adds a FEMProperties object to the store.
  #
  # @param fields  FEMPropertiesFields object
  # @return newly assigned ID
  def addFEMProperties(self, fields, current=None):
    logging.debug('addFEMProperties()')
    with self.lock:
      self.pg.addFEMProperties(fields)
    return fields.id


  ## Adds a set of FEMProperties objects to the store.
  #
  # @param fieldsList  list of FEMPropertiesFields objects
  # @return list of newly assigned IDs
  def addFEMPropertiesList(self, fieldsList, current=None):
    logging.debug('addFEMPropertiesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPropertiesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMProperties object proxy by its ID.
  #
  # @param id FEMProperties object ID
  # @return FEMProperties object proxy
  def getFEMProperties(self, id, current=None):
    logging.debug('getFEMProperties(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMProperties.has_key(id):
        logging.debug('Fetched FEMProperties[oid=%d] servant from cache', id)
        return self.registryFEMProperties[id]
      obj = FEMPropertiesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPropertiesPrx.uncheckedCast(srvt)
      self.registryFEMProperties[id] = prx
    logging.debug('Activated FEMProperties[oid=%d] servant', id)
    return prx

  ## Gets the FEMProperties object fields.
  #
  # @param id FEMProperties object ID
  # @return FEMPropertiesFields object
  def getFEMPropertiesFields(self, id, current=None):
    logging.debug('getFEMPropertiesFields(oid=%d)' % id)
    return self._getFEMPropertiesFields(id, current)

  ## Gets the FEMProperties object fields.
  #
  # @param id FEMProperties object ID
  # @return FEMPropertiesFields object
  def _getFEMPropertiesFields(self, id, current=None):
    fields = SenStore.FEMPropertiesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMProperties(fields):
          return None
    return fields

  ## Sets the FEMProperties object fields.
  #
  # @param fields     FEMProperties fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPropertiesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPropertiesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMProperties(fields, fieldNames)

  ## Gets a list of IDs of all FEMProperties objects.
  #
  # @return ids list of FEMProperties object IDs
  def getFEMPropertiesIds(self, current=None):
    logging.debug('getFEMPropertiesList()')
    with self.lock:
      return self.pg.getFEMPropertiesIds()

  ## Gets a list of FEMProperties object proxies.
  #
  # @param ids list of FEMProperties object IDs
  # @return list of FEMProperties object proxies
  def getFEMPropertiesList(self, ids, current=None):
    logging.debug('getFEMPropertiesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMProperties(id) for id in ids]

  ## Gets a list of FEMProperties fields objects.
  #
  # @param ids list of FEMProperties object IDs
  # @return list of FEMProperties fields objects
  def getFEMPropertiesFieldsList(self, ids, current=None):
    logging.debug('getFEMPropertiesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPropertiesFields(id) for id in ids]

  ## Gets a list of all FEMProperties object IDs.
  #
  # @param fields FEMProperties object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMProperties objects
  #
  def findEqualFEMProperties(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMProperties()')
    with self.lock:
      ids = self.pg.findEqualFEMProperties(fields, fieldNames)
    return ids

  ## Adds a FEMThreeDSolidGroup object to the store.
  #
  # @param fields  FEMThreeDSolidGroupFields object
  # @return newly assigned ID
  def addFEMThreeDSolidGroup(self, fields, current=None):
    logging.debug('addFEMThreeDSolidGroup()')
    with self.lock:
      self.pg.addFEMThreeDSolidGroup(fields)
    return fields.id


  ## Adds a set of FEMThreeDSolidGroup objects to the store.
  #
  # @param fieldsList  list of FEMThreeDSolidGroupFields objects
  # @return list of newly assigned IDs
  def addFEMThreeDSolidGroupList(self, fieldsList, current=None):
    logging.debug('addFEMThreeDSolidGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThreeDSolidGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThreeDSolidGroup object proxy by its ID.
  #
  # @param id FEMThreeDSolidGroup object ID
  # @return FEMThreeDSolidGroup object proxy
  def getFEMThreeDSolidGroup(self, id, current=None):
    logging.debug('getFEMThreeDSolidGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThreeDSolidGroup.has_key(id):
        logging.debug('Fetched FEMThreeDSolidGroup[oid=%d] servant from cache', id)
        return self.registryFEMThreeDSolidGroup[id]
      obj = FEMThreeDSolidGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThreeDSolidGroupPrx.uncheckedCast(srvt)
      self.registryFEMThreeDSolidGroup[id] = prx
    logging.debug('Activated FEMThreeDSolidGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMThreeDSolidGroup object fields.
  #
  # @param id FEMThreeDSolidGroup object ID
  # @return FEMThreeDSolidGroupFields object
  def getFEMThreeDSolidGroupFields(self, id, current=None):
    logging.debug('getFEMThreeDSolidGroupFields(oid=%d)' % id)
    return self._getFEMThreeDSolidGroupFields(id, current)

  ## Gets the FEMThreeDSolidGroup object fields.
  #
  # @param id FEMThreeDSolidGroup object ID
  # @return FEMThreeDSolidGroupFields object
  def _getFEMThreeDSolidGroupFields(self, id, current=None):
    fields = SenStore.FEMThreeDSolidGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThreeDSolidGroup(fields):
          return None
    return fields

  ## Sets the FEMThreeDSolidGroup object fields.
  #
  # @param fields     FEMThreeDSolidGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThreeDSolidGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThreeDSolidGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThreeDSolidGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMThreeDSolidGroup objects.
  #
  # @return ids list of FEMThreeDSolidGroup object IDs
  def getFEMThreeDSolidGroupIds(self, current=None):
    logging.debug('getFEMThreeDSolidGroupList()')
    with self.lock:
      return self.pg.getFEMThreeDSolidGroupIds()

  ## Gets a list of FEMThreeDSolidGroup object proxies.
  #
  # @param ids list of FEMThreeDSolidGroup object IDs
  # @return list of FEMThreeDSolidGroup object proxies
  def getFEMThreeDSolidGroupList(self, ids, current=None):
    logging.debug('getFEMThreeDSolidGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThreeDSolidGroup(id) for id in ids]

  ## Gets a list of FEMThreeDSolidGroup fields objects.
  #
  # @param ids list of FEMThreeDSolidGroup object IDs
  # @return list of FEMThreeDSolidGroup fields objects
  def getFEMThreeDSolidGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMThreeDSolidGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThreeDSolidGroupFields(id) for id in ids]

  ## Gets a list of all FEMThreeDSolidGroup object IDs.
  #
  # @param fields FEMThreeDSolidGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThreeDSolidGroup objects
  #
  def findEqualFEMThreeDSolidGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThreeDSolidGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMThreeDSolidGroup(fields, fieldNames)
    return ids

  ## Adds a FEMThreeDSolid object to the store.
  #
  # @param fields  FEMThreeDSolidFields object
  # @return newly assigned ID
  def addFEMThreeDSolid(self, fields, current=None):
    logging.debug('addFEMThreeDSolid()')
    with self.lock:
      self.pg.addFEMThreeDSolid(fields)
    return fields.id


  ## Adds a set of FEMThreeDSolid objects to the store.
  #
  # @param fieldsList  list of FEMThreeDSolidFields objects
  # @return list of newly assigned IDs
  def addFEMThreeDSolidList(self, fieldsList, current=None):
    logging.debug('addFEMThreeDSolidList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThreeDSolidList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThreeDSolid object proxy by its ID.
  #
  # @param id FEMThreeDSolid object ID
  # @return FEMThreeDSolid object proxy
  def getFEMThreeDSolid(self, id, current=None):
    logging.debug('getFEMThreeDSolid(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThreeDSolid.has_key(id):
        logging.debug('Fetched FEMThreeDSolid[oid=%d] servant from cache', id)
        return self.registryFEMThreeDSolid[id]
      obj = FEMThreeDSolidI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThreeDSolidPrx.uncheckedCast(srvt)
      self.registryFEMThreeDSolid[id] = prx
    logging.debug('Activated FEMThreeDSolid[oid=%d] servant', id)
    return prx

  ## Gets the FEMThreeDSolid object fields.
  #
  # @param id FEMThreeDSolid object ID
  # @return FEMThreeDSolidFields object
  def getFEMThreeDSolidFields(self, id, current=None):
    logging.debug('getFEMThreeDSolidFields(oid=%d)' % id)
    return self._getFEMThreeDSolidFields(id, current)

  ## Gets the FEMThreeDSolid object fields.
  #
  # @param id FEMThreeDSolid object ID
  # @return FEMThreeDSolidFields object
  def _getFEMThreeDSolidFields(self, id, current=None):
    fields = SenStore.FEMThreeDSolidFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThreeDSolid(fields):
          return None
    return fields

  ## Sets the FEMThreeDSolid object fields.
  #
  # @param fields     FEMThreeDSolid fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThreeDSolidFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThreeDSolidFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThreeDSolid(fields, fieldNames)

  ## Gets a list of IDs of all FEMThreeDSolid objects.
  #
  # @return ids list of FEMThreeDSolid object IDs
  def getFEMThreeDSolidIds(self, current=None):
    logging.debug('getFEMThreeDSolidList()')
    with self.lock:
      return self.pg.getFEMThreeDSolidIds()

  ## Gets a list of FEMThreeDSolid object proxies.
  #
  # @param ids list of FEMThreeDSolid object IDs
  # @return list of FEMThreeDSolid object proxies
  def getFEMThreeDSolidList(self, ids, current=None):
    logging.debug('getFEMThreeDSolidList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThreeDSolid(id) for id in ids]

  ## Gets a list of FEMThreeDSolid fields objects.
  #
  # @param ids list of FEMThreeDSolid object IDs
  # @return list of FEMThreeDSolid fields objects
  def getFEMThreeDSolidFieldsList(self, ids, current=None):
    logging.debug('getFEMThreeDSolidFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThreeDSolidFields(id) for id in ids]

  ## Gets a list of all FEMThreeDSolid object IDs.
  #
  # @param fields FEMThreeDSolid object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThreeDSolid objects
  #
  def findEqualFEMThreeDSolid(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThreeDSolid()')
    with self.lock:
      ids = self.pg.findEqualFEMThreeDSolid(fields, fieldNames)
    return ids

  ## Adds a FEMSectionProp object to the store.
  #
  # @param fields  FEMSectionPropFields object
  # @return newly assigned ID
  def addFEMSectionProp(self, fields, current=None):
    logging.debug('addFEMSectionProp()')
    with self.lock:
      self.pg.addFEMSectionProp(fields)
    return fields.id


  ## Adds a set of FEMSectionProp objects to the store.
  #
  # @param fieldsList  list of FEMSectionPropFields objects
  # @return list of newly assigned IDs
  def addFEMSectionPropList(self, fieldsList, current=None):
    logging.debug('addFEMSectionPropList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSectionPropList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSectionProp object proxy by its ID.
  #
  # @param id FEMSectionProp object ID
  # @return FEMSectionProp object proxy
  def getFEMSectionProp(self, id, current=None):
    logging.debug('getFEMSectionProp(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSectionProp.has_key(id):
        logging.debug('Fetched FEMSectionProp[oid=%d] servant from cache', id)
        return self.registryFEMSectionProp[id]
      obj = FEMSectionPropI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSectionPropPrx.uncheckedCast(srvt)
      self.registryFEMSectionProp[id] = prx
    logging.debug('Activated FEMSectionProp[oid=%d] servant', id)
    return prx

  ## Gets the FEMSectionProp object fields.
  #
  # @param id FEMSectionProp object ID
  # @return FEMSectionPropFields object
  def getFEMSectionPropFields(self, id, current=None):
    logging.debug('getFEMSectionPropFields(oid=%d)' % id)
    return self._getFEMSectionPropFields(id, current)

  ## Gets the FEMSectionProp object fields.
  #
  # @param id FEMSectionProp object ID
  # @return FEMSectionPropFields object
  def _getFEMSectionPropFields(self, id, current=None):
    fields = SenStore.FEMSectionPropFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSectionProp(fields):
          return None
    return fields

  ## Sets the FEMSectionProp object fields.
  #
  # @param fields     FEMSectionProp fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSectionPropFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSectionPropFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSectionProp(fields, fieldNames)

  ## Gets a list of IDs of all FEMSectionProp objects.
  #
  # @return ids list of FEMSectionProp object IDs
  def getFEMSectionPropIds(self, current=None):
    logging.debug('getFEMSectionPropList()')
    with self.lock:
      return self.pg.getFEMSectionPropIds()

  ## Gets a list of FEMSectionProp object proxies.
  #
  # @param ids list of FEMSectionProp object IDs
  # @return list of FEMSectionProp object proxies
  def getFEMSectionPropList(self, ids, current=None):
    logging.debug('getFEMSectionPropList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSectionProp(id) for id in ids]

  ## Gets a list of FEMSectionProp fields objects.
  #
  # @param ids list of FEMSectionProp object IDs
  # @return list of FEMSectionProp fields objects
  def getFEMSectionPropFieldsList(self, ids, current=None):
    logging.debug('getFEMSectionPropFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSectionPropFields(id) for id in ids]

  ## Gets a list of all FEMSectionProp object IDs.
  #
  # @param fields FEMSectionProp object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSectionProp objects
  #
  def findEqualFEMSectionProp(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSectionProp()')
    with self.lock:
      ids = self.pg.findEqualFEMSectionProp(fields, fieldNames)
    return ids

  ## Adds a FEMElasticMaterial object to the store.
  #
  # @param fields  FEMElasticMaterialFields object
  # @return newly assigned ID
  def addFEMElasticMaterial(self, fields, current=None):
    logging.debug('addFEMElasticMaterial()')
    with self.lock:
      self.pg.addFEMElasticMaterial(fields)
    return fields.id


  ## Adds a set of FEMElasticMaterial objects to the store.
  #
  # @param fieldsList  list of FEMElasticMaterialFields objects
  # @return list of newly assigned IDs
  def addFEMElasticMaterialList(self, fieldsList, current=None):
    logging.debug('addFEMElasticMaterialList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMElasticMaterialList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMElasticMaterial object proxy by its ID.
  #
  # @param id FEMElasticMaterial object ID
  # @return FEMElasticMaterial object proxy
  def getFEMElasticMaterial(self, id, current=None):
    logging.debug('getFEMElasticMaterial(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMElasticMaterial.has_key(id):
        logging.debug('Fetched FEMElasticMaterial[oid=%d] servant from cache', id)
        return self.registryFEMElasticMaterial[id]
      obj = FEMElasticMaterialI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMElasticMaterialPrx.uncheckedCast(srvt)
      self.registryFEMElasticMaterial[id] = prx
    logging.debug('Activated FEMElasticMaterial[oid=%d] servant', id)
    return prx

  ## Gets the FEMElasticMaterial object fields.
  #
  # @param id FEMElasticMaterial object ID
  # @return FEMElasticMaterialFields object
  def getFEMElasticMaterialFields(self, id, current=None):
    logging.debug('getFEMElasticMaterialFields(oid=%d)' % id)
    return self._getFEMElasticMaterialFields(id, current)

  ## Gets the FEMElasticMaterial object fields.
  #
  # @param id FEMElasticMaterial object ID
  # @return FEMElasticMaterialFields object
  def _getFEMElasticMaterialFields(self, id, current=None):
    fields = SenStore.FEMElasticMaterialFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMElasticMaterial(fields):
          return None
    return fields

  ## Sets the FEMElasticMaterial object fields.
  #
  # @param fields     FEMElasticMaterial fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMElasticMaterialFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMElasticMaterialFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMElasticMaterial(fields, fieldNames)

  ## Gets a list of IDs of all FEMElasticMaterial objects.
  #
  # @return ids list of FEMElasticMaterial object IDs
  def getFEMElasticMaterialIds(self, current=None):
    logging.debug('getFEMElasticMaterialList()')
    with self.lock:
      return self.pg.getFEMElasticMaterialIds()

  ## Gets a list of FEMElasticMaterial object proxies.
  #
  # @param ids list of FEMElasticMaterial object IDs
  # @return list of FEMElasticMaterial object proxies
  def getFEMElasticMaterialList(self, ids, current=None):
    logging.debug('getFEMElasticMaterialList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMElasticMaterial(id) for id in ids]

  ## Gets a list of FEMElasticMaterial fields objects.
  #
  # @param ids list of FEMElasticMaterial object IDs
  # @return list of FEMElasticMaterial fields objects
  def getFEMElasticMaterialFieldsList(self, ids, current=None):
    logging.debug('getFEMElasticMaterialFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMElasticMaterialFields(id) for id in ids]

  ## Gets a list of all FEMElasticMaterial object IDs.
  #
  # @param fields FEMElasticMaterial object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMElasticMaterial objects
  #
  def findEqualFEMElasticMaterial(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMElasticMaterial()')
    with self.lock:
      ids = self.pg.findEqualFEMElasticMaterial(fields, fieldNames)
    return ids

  ## Adds a FEMPoints object to the store.
  #
  # @param fields  FEMPointsFields object
  # @return newly assigned ID
  def addFEMPoints(self, fields, current=None):
    logging.debug('addFEMPoints()')
    with self.lock:
      self.pg.addFEMPoints(fields)
    return fields.id


  ## Adds a set of FEMPoints objects to the store.
  #
  # @param fieldsList  list of FEMPointsFields objects
  # @return list of newly assigned IDs
  def addFEMPointsList(self, fieldsList, current=None):
    logging.debug('addFEMPointsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPointsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPoints object proxy by its ID.
  #
  # @param id FEMPoints object ID
  # @return FEMPoints object proxy
  def getFEMPoints(self, id, current=None):
    logging.debug('getFEMPoints(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPoints.has_key(id):
        logging.debug('Fetched FEMPoints[oid=%d] servant from cache', id)
        return self.registryFEMPoints[id]
      obj = FEMPointsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPointsPrx.uncheckedCast(srvt)
      self.registryFEMPoints[id] = prx
    logging.debug('Activated FEMPoints[oid=%d] servant', id)
    return prx

  ## Gets the FEMPoints object fields.
  #
  # @param id FEMPoints object ID
  # @return FEMPointsFields object
  def getFEMPointsFields(self, id, current=None):
    logging.debug('getFEMPointsFields(oid=%d)' % id)
    return self._getFEMPointsFields(id, current)

  ## Gets the FEMPoints object fields.
  #
  # @param id FEMPoints object ID
  # @return FEMPointsFields object
  def _getFEMPointsFields(self, id, current=None):
    fields = SenStore.FEMPointsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPoints(fields):
          return None
    return fields

  ## Sets the FEMPoints object fields.
  #
  # @param fields     FEMPoints fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPointsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPointsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPoints(fields, fieldNames)

  ## Gets a list of IDs of all FEMPoints objects.
  #
  # @return ids list of FEMPoints object IDs
  def getFEMPointsIds(self, current=None):
    logging.debug('getFEMPointsList()')
    with self.lock:
      return self.pg.getFEMPointsIds()

  ## Gets a list of FEMPoints object proxies.
  #
  # @param ids list of FEMPoints object IDs
  # @return list of FEMPoints object proxies
  def getFEMPointsList(self, ids, current=None):
    logging.debug('getFEMPointsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPoints(id) for id in ids]

  ## Gets a list of FEMPoints fields objects.
  #
  # @param ids list of FEMPoints object IDs
  # @return list of FEMPoints fields objects
  def getFEMPointsFieldsList(self, ids, current=None):
    logging.debug('getFEMPointsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPointsFields(id) for id in ids]

  ## Gets a list of all FEMPoints object IDs.
  #
  # @param fields FEMPoints object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPoints objects
  #
  def findEqualFEMPoints(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPoints()')
    with self.lock:
      ids = self.pg.findEqualFEMPoints(fields, fieldNames)
    return ids

  ## Adds a FEMThermoOrthMaterials object to the store.
  #
  # @param fields  FEMThermoOrthMaterialsFields object
  # @return newly assigned ID
  def addFEMThermoOrthMaterials(self, fields, current=None):
    logging.debug('addFEMThermoOrthMaterials()')
    with self.lock:
      self.pg.addFEMThermoOrthMaterials(fields)
    return fields.id


  ## Adds a set of FEMThermoOrthMaterials objects to the store.
  #
  # @param fieldsList  list of FEMThermoOrthMaterialsFields objects
  # @return list of newly assigned IDs
  def addFEMThermoOrthMaterialsList(self, fieldsList, current=None):
    logging.debug('addFEMThermoOrthMaterialsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMThermoOrthMaterialsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMThermoOrthMaterials object proxy by its ID.
  #
  # @param id FEMThermoOrthMaterials object ID
  # @return FEMThermoOrthMaterials object proxy
  def getFEMThermoOrthMaterials(self, id, current=None):
    logging.debug('getFEMThermoOrthMaterials(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMThermoOrthMaterials.has_key(id):
        logging.debug('Fetched FEMThermoOrthMaterials[oid=%d] servant from cache', id)
        return self.registryFEMThermoOrthMaterials[id]
      obj = FEMThermoOrthMaterialsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMThermoOrthMaterialsPrx.uncheckedCast(srvt)
      self.registryFEMThermoOrthMaterials[id] = prx
    logging.debug('Activated FEMThermoOrthMaterials[oid=%d] servant', id)
    return prx

  ## Gets the FEMThermoOrthMaterials object fields.
  #
  # @param id FEMThermoOrthMaterials object ID
  # @return FEMThermoOrthMaterialsFields object
  def getFEMThermoOrthMaterialsFields(self, id, current=None):
    logging.debug('getFEMThermoOrthMaterialsFields(oid=%d)' % id)
    return self._getFEMThermoOrthMaterialsFields(id, current)

  ## Gets the FEMThermoOrthMaterials object fields.
  #
  # @param id FEMThermoOrthMaterials object ID
  # @return FEMThermoOrthMaterialsFields object
  def _getFEMThermoOrthMaterialsFields(self, id, current=None):
    fields = SenStore.FEMThermoOrthMaterialsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMThermoOrthMaterials(fields):
          return None
    return fields

  ## Sets the FEMThermoOrthMaterials object fields.
  #
  # @param fields     FEMThermoOrthMaterials fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMThermoOrthMaterialsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMThermoOrthMaterialsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMThermoOrthMaterials(fields, fieldNames)

  ## Gets a list of IDs of all FEMThermoOrthMaterials objects.
  #
  # @return ids list of FEMThermoOrthMaterials object IDs
  def getFEMThermoOrthMaterialsIds(self, current=None):
    logging.debug('getFEMThermoOrthMaterialsList()')
    with self.lock:
      return self.pg.getFEMThermoOrthMaterialsIds()

  ## Gets a list of FEMThermoOrthMaterials object proxies.
  #
  # @param ids list of FEMThermoOrthMaterials object IDs
  # @return list of FEMThermoOrthMaterials object proxies
  def getFEMThermoOrthMaterialsList(self, ids, current=None):
    logging.debug('getFEMThermoOrthMaterialsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMThermoOrthMaterials(id) for id in ids]

  ## Gets a list of FEMThermoOrthMaterials fields objects.
  #
  # @param ids list of FEMThermoOrthMaterials object IDs
  # @return list of FEMThermoOrthMaterials fields objects
  def getFEMThermoOrthMaterialsFieldsList(self, ids, current=None):
    logging.debug('getFEMThermoOrthMaterialsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMThermoOrthMaterialsFields(id) for id in ids]

  ## Gets a list of all FEMThermoOrthMaterials object IDs.
  #
  # @param fields FEMThermoOrthMaterials object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMThermoOrthMaterials objects
  #
  def findEqualFEMThermoOrthMaterials(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMThermoOrthMaterials()')
    with self.lock:
      ids = self.pg.findEqualFEMThermoOrthMaterials(fields, fieldNames)
    return ids

  ## Adds a FEMConstraints object to the store.
  #
  # @param fields  FEMConstraintsFields object
  # @return newly assigned ID
  def addFEMConstraints(self, fields, current=None):
    logging.debug('addFEMConstraints()')
    with self.lock:
      self.pg.addFEMConstraints(fields)
    return fields.id


  ## Adds a set of FEMConstraints objects to the store.
  #
  # @param fieldsList  list of FEMConstraintsFields objects
  # @return list of newly assigned IDs
  def addFEMConstraintsList(self, fieldsList, current=None):
    logging.debug('addFEMConstraintsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMConstraintsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMConstraints object proxy by its ID.
  #
  # @param id FEMConstraints object ID
  # @return FEMConstraints object proxy
  def getFEMConstraints(self, id, current=None):
    logging.debug('getFEMConstraints(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMConstraints.has_key(id):
        logging.debug('Fetched FEMConstraints[oid=%d] servant from cache', id)
        return self.registryFEMConstraints[id]
      obj = FEMConstraintsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMConstraintsPrx.uncheckedCast(srvt)
      self.registryFEMConstraints[id] = prx
    logging.debug('Activated FEMConstraints[oid=%d] servant', id)
    return prx

  ## Gets the FEMConstraints object fields.
  #
  # @param id FEMConstraints object ID
  # @return FEMConstraintsFields object
  def getFEMConstraintsFields(self, id, current=None):
    logging.debug('getFEMConstraintsFields(oid=%d)' % id)
    return self._getFEMConstraintsFields(id, current)

  ## Gets the FEMConstraints object fields.
  #
  # @param id FEMConstraints object ID
  # @return FEMConstraintsFields object
  def _getFEMConstraintsFields(self, id, current=None):
    fields = SenStore.FEMConstraintsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMConstraints(fields):
          return None
    return fields

  ## Sets the FEMConstraints object fields.
  #
  # @param fields     FEMConstraints fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMConstraintsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMConstraintsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMConstraints(fields, fieldNames)

  ## Gets a list of IDs of all FEMConstraints objects.
  #
  # @return ids list of FEMConstraints object IDs
  def getFEMConstraintsIds(self, current=None):
    logging.debug('getFEMConstraintsList()')
    with self.lock:
      return self.pg.getFEMConstraintsIds()

  ## Gets a list of FEMConstraints object proxies.
  #
  # @param ids list of FEMConstraints object IDs
  # @return list of FEMConstraints object proxies
  def getFEMConstraintsList(self, ids, current=None):
    logging.debug('getFEMConstraintsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMConstraints(id) for id in ids]

  ## Gets a list of FEMConstraints fields objects.
  #
  # @param ids list of FEMConstraints object IDs
  # @return list of FEMConstraints fields objects
  def getFEMConstraintsFieldsList(self, ids, current=None):
    logging.debug('getFEMConstraintsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMConstraintsFields(id) for id in ids]

  ## Gets a list of all FEMConstraints object IDs.
  #
  # @param fields FEMConstraints object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMConstraints objects
  #
  def findEqualFEMConstraints(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMConstraints()')
    with self.lock:
      ids = self.pg.findEqualFEMConstraints(fields, fieldNames)
    return ids

  ## Adds a FEMMCrigidities object to the store.
  #
  # @param fields  FEMMCrigiditiesFields object
  # @return newly assigned ID
  def addFEMMCrigidities(self, fields, current=None):
    logging.debug('addFEMMCrigidities()')
    with self.lock:
      self.pg.addFEMMCrigidities(fields)
    return fields.id


  ## Adds a set of FEMMCrigidities objects to the store.
  #
  # @param fieldsList  list of FEMMCrigiditiesFields objects
  # @return list of newly assigned IDs
  def addFEMMCrigiditiesList(self, fieldsList, current=None):
    logging.debug('addFEMMCrigiditiesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMCrigiditiesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMCrigidities object proxy by its ID.
  #
  # @param id FEMMCrigidities object ID
  # @return FEMMCrigidities object proxy
  def getFEMMCrigidities(self, id, current=None):
    logging.debug('getFEMMCrigidities(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMCrigidities.has_key(id):
        logging.debug('Fetched FEMMCrigidities[oid=%d] servant from cache', id)
        return self.registryFEMMCrigidities[id]
      obj = FEMMCrigiditiesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMCrigiditiesPrx.uncheckedCast(srvt)
      self.registryFEMMCrigidities[id] = prx
    logging.debug('Activated FEMMCrigidities[oid=%d] servant', id)
    return prx

  ## Gets the FEMMCrigidities object fields.
  #
  # @param id FEMMCrigidities object ID
  # @return FEMMCrigiditiesFields object
  def getFEMMCrigiditiesFields(self, id, current=None):
    logging.debug('getFEMMCrigiditiesFields(oid=%d)' % id)
    return self._getFEMMCrigiditiesFields(id, current)

  ## Gets the FEMMCrigidities object fields.
  #
  # @param id FEMMCrigidities object ID
  # @return FEMMCrigiditiesFields object
  def _getFEMMCrigiditiesFields(self, id, current=None):
    fields = SenStore.FEMMCrigiditiesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMCrigidities(fields):
          return None
    return fields

  ## Sets the FEMMCrigidities object fields.
  #
  # @param fields     FEMMCrigidities fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMCrigiditiesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMCrigiditiesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMCrigidities(fields, fieldNames)

  ## Gets a list of IDs of all FEMMCrigidities objects.
  #
  # @return ids list of FEMMCrigidities object IDs
  def getFEMMCrigiditiesIds(self, current=None):
    logging.debug('getFEMMCrigiditiesList()')
    with self.lock:
      return self.pg.getFEMMCrigiditiesIds()

  ## Gets a list of FEMMCrigidities object proxies.
  #
  # @param ids list of FEMMCrigidities object IDs
  # @return list of FEMMCrigidities object proxies
  def getFEMMCrigiditiesList(self, ids, current=None):
    logging.debug('getFEMMCrigiditiesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMCrigidities(id) for id in ids]

  ## Gets a list of FEMMCrigidities fields objects.
  #
  # @param ids list of FEMMCrigidities object IDs
  # @return list of FEMMCrigidities fields objects
  def getFEMMCrigiditiesFieldsList(self, ids, current=None):
    logging.debug('getFEMMCrigiditiesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMCrigiditiesFields(id) for id in ids]

  ## Gets a list of all FEMMCrigidities object IDs.
  #
  # @param fields FEMMCrigidities object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMCrigidities objects
  #
  def findEqualFEMMCrigidities(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMCrigidities()')
    with self.lock:
      ids = self.pg.findEqualFEMMCrigidities(fields, fieldNames)
    return ids

  ## Adds a FEMSkeySysNode object to the store.
  #
  # @param fields  FEMSkeySysNodeFields object
  # @return newly assigned ID
  def addFEMSkeySysNode(self, fields, current=None):
    logging.debug('addFEMSkeySysNode()')
    with self.lock:
      self.pg.addFEMSkeySysNode(fields)
    return fields.id


  ## Adds a set of FEMSkeySysNode objects to the store.
  #
  # @param fieldsList  list of FEMSkeySysNodeFields objects
  # @return list of newly assigned IDs
  def addFEMSkeySysNodeList(self, fieldsList, current=None):
    logging.debug('addFEMSkeySysNodeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSkeySysNodeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSkeySysNode object proxy by its ID.
  #
  # @param id FEMSkeySysNode object ID
  # @return FEMSkeySysNode object proxy
  def getFEMSkeySysNode(self, id, current=None):
    logging.debug('getFEMSkeySysNode(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSkeySysNode.has_key(id):
        logging.debug('Fetched FEMSkeySysNode[oid=%d] servant from cache', id)
        return self.registryFEMSkeySysNode[id]
      obj = FEMSkeySysNodeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSkeySysNodePrx.uncheckedCast(srvt)
      self.registryFEMSkeySysNode[id] = prx
    logging.debug('Activated FEMSkeySysNode[oid=%d] servant', id)
    return prx

  ## Gets the FEMSkeySysNode object fields.
  #
  # @param id FEMSkeySysNode object ID
  # @return FEMSkeySysNodeFields object
  def getFEMSkeySysNodeFields(self, id, current=None):
    logging.debug('getFEMSkeySysNodeFields(oid=%d)' % id)
    return self._getFEMSkeySysNodeFields(id, current)

  ## Gets the FEMSkeySysNode object fields.
  #
  # @param id FEMSkeySysNode object ID
  # @return FEMSkeySysNodeFields object
  def _getFEMSkeySysNodeFields(self, id, current=None):
    fields = SenStore.FEMSkeySysNodeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSkeySysNode(fields):
          return None
    return fields

  ## Sets the FEMSkeySysNode object fields.
  #
  # @param fields     FEMSkeySysNode fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSkeySysNodeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSkeySysNodeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSkeySysNode(fields, fieldNames)

  ## Gets a list of IDs of all FEMSkeySysNode objects.
  #
  # @return ids list of FEMSkeySysNode object IDs
  def getFEMSkeySysNodeIds(self, current=None):
    logging.debug('getFEMSkeySysNodeList()')
    with self.lock:
      return self.pg.getFEMSkeySysNodeIds()

  ## Gets a list of FEMSkeySysNode object proxies.
  #
  # @param ids list of FEMSkeySysNode object IDs
  # @return list of FEMSkeySysNode object proxies
  def getFEMSkeySysNodeList(self, ids, current=None):
    logging.debug('getFEMSkeySysNodeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSkeySysNode(id) for id in ids]

  ## Gets a list of FEMSkeySysNode fields objects.
  #
  # @param ids list of FEMSkeySysNode object IDs
  # @return list of FEMSkeySysNode fields objects
  def getFEMSkeySysNodeFieldsList(self, ids, current=None):
    logging.debug('getFEMSkeySysNodeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSkeySysNodeFields(id) for id in ids]

  ## Gets a list of all FEMSkeySysNode object IDs.
  #
  # @param fields FEMSkeySysNode object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSkeySysNode objects
  #
  def findEqualFEMSkeySysNode(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSkeySysNode()')
    with self.lock:
      ids = self.pg.findEqualFEMSkeySysNode(fields, fieldNames)
    return ids

  ## Adds a FEMIsoBeamGroup object to the store.
  #
  # @param fields  FEMIsoBeamGroupFields object
  # @return newly assigned ID
  def addFEMIsoBeamGroup(self, fields, current=None):
    logging.debug('addFEMIsoBeamGroup()')
    with self.lock:
      self.pg.addFEMIsoBeamGroup(fields)
    return fields.id


  ## Adds a set of FEMIsoBeamGroup objects to the store.
  #
  # @param fieldsList  list of FEMIsoBeamGroupFields objects
  # @return list of newly assigned IDs
  def addFEMIsoBeamGroupList(self, fieldsList, current=None):
    logging.debug('addFEMIsoBeamGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMIsoBeamGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMIsoBeamGroup object proxy by its ID.
  #
  # @param id FEMIsoBeamGroup object ID
  # @return FEMIsoBeamGroup object proxy
  def getFEMIsoBeamGroup(self, id, current=None):
    logging.debug('getFEMIsoBeamGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMIsoBeamGroup.has_key(id):
        logging.debug('Fetched FEMIsoBeamGroup[oid=%d] servant from cache', id)
        return self.registryFEMIsoBeamGroup[id]
      obj = FEMIsoBeamGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMIsoBeamGroupPrx.uncheckedCast(srvt)
      self.registryFEMIsoBeamGroup[id] = prx
    logging.debug('Activated FEMIsoBeamGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMIsoBeamGroup object fields.
  #
  # @param id FEMIsoBeamGroup object ID
  # @return FEMIsoBeamGroupFields object
  def getFEMIsoBeamGroupFields(self, id, current=None):
    logging.debug('getFEMIsoBeamGroupFields(oid=%d)' % id)
    return self._getFEMIsoBeamGroupFields(id, current)

  ## Gets the FEMIsoBeamGroup object fields.
  #
  # @param id FEMIsoBeamGroup object ID
  # @return FEMIsoBeamGroupFields object
  def _getFEMIsoBeamGroupFields(self, id, current=None):
    fields = SenStore.FEMIsoBeamGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMIsoBeamGroup(fields):
          return None
    return fields

  ## Sets the FEMIsoBeamGroup object fields.
  #
  # @param fields     FEMIsoBeamGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMIsoBeamGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMIsoBeamGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMIsoBeamGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMIsoBeamGroup objects.
  #
  # @return ids list of FEMIsoBeamGroup object IDs
  def getFEMIsoBeamGroupIds(self, current=None):
    logging.debug('getFEMIsoBeamGroupList()')
    with self.lock:
      return self.pg.getFEMIsoBeamGroupIds()

  ## Gets a list of FEMIsoBeamGroup object proxies.
  #
  # @param ids list of FEMIsoBeamGroup object IDs
  # @return list of FEMIsoBeamGroup object proxies
  def getFEMIsoBeamGroupList(self, ids, current=None):
    logging.debug('getFEMIsoBeamGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMIsoBeamGroup(id) for id in ids]

  ## Gets a list of FEMIsoBeamGroup fields objects.
  #
  # @param ids list of FEMIsoBeamGroup object IDs
  # @return list of FEMIsoBeamGroup fields objects
  def getFEMIsoBeamGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMIsoBeamGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMIsoBeamGroupFields(id) for id in ids]

  ## Gets a list of all FEMIsoBeamGroup object IDs.
  #
  # @param fields FEMIsoBeamGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMIsoBeamGroup objects
  #
  def findEqualFEMIsoBeamGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMIsoBeamGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMIsoBeamGroup(fields, fieldNames)
    return ids

  ## Adds a FEMShellDOF object to the store.
  #
  # @param fields  FEMShellDOFFields object
  # @return newly assigned ID
  def addFEMShellDOF(self, fields, current=None):
    logging.debug('addFEMShellDOF()')
    with self.lock:
      self.pg.addFEMShellDOF(fields)
    return fields.id


  ## Adds a set of FEMShellDOF objects to the store.
  #
  # @param fieldsList  list of FEMShellDOFFields objects
  # @return list of newly assigned IDs
  def addFEMShellDOFList(self, fieldsList, current=None):
    logging.debug('addFEMShellDOFList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellDOFList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellDOF object proxy by its ID.
  #
  # @param id FEMShellDOF object ID
  # @return FEMShellDOF object proxy
  def getFEMShellDOF(self, id, current=None):
    logging.debug('getFEMShellDOF(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellDOF.has_key(id):
        logging.debug('Fetched FEMShellDOF[oid=%d] servant from cache', id)
        return self.registryFEMShellDOF[id]
      obj = FEMShellDOFI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellDOFPrx.uncheckedCast(srvt)
      self.registryFEMShellDOF[id] = prx
    logging.debug('Activated FEMShellDOF[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellDOF object fields.
  #
  # @param id FEMShellDOF object ID
  # @return FEMShellDOFFields object
  def getFEMShellDOFFields(self, id, current=None):
    logging.debug('getFEMShellDOFFields(oid=%d)' % id)
    return self._getFEMShellDOFFields(id, current)

  ## Gets the FEMShellDOF object fields.
  #
  # @param id FEMShellDOF object ID
  # @return FEMShellDOFFields object
  def _getFEMShellDOFFields(self, id, current=None):
    fields = SenStore.FEMShellDOFFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellDOF(fields):
          return None
    return fields

  ## Sets the FEMShellDOF object fields.
  #
  # @param fields     FEMShellDOF fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellDOFFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellDOFFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellDOF(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellDOF objects.
  #
  # @return ids list of FEMShellDOF object IDs
  def getFEMShellDOFIds(self, current=None):
    logging.debug('getFEMShellDOFList()')
    with self.lock:
      return self.pg.getFEMShellDOFIds()

  ## Gets a list of FEMShellDOF object proxies.
  #
  # @param ids list of FEMShellDOF object IDs
  # @return list of FEMShellDOF object proxies
  def getFEMShellDOFList(self, ids, current=None):
    logging.debug('getFEMShellDOFList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellDOF(id) for id in ids]

  ## Gets a list of FEMShellDOF fields objects.
  #
  # @param ids list of FEMShellDOF object IDs
  # @return list of FEMShellDOF fields objects
  def getFEMShellDOFFieldsList(self, ids, current=None):
    logging.debug('getFEMShellDOFFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellDOFFields(id) for id in ids]

  ## Gets a list of all FEMShellDOF object IDs.
  #
  # @param fields FEMShellDOF object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellDOF objects
  #
  def findEqualFEMShellDOF(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellDOF()')
    with self.lock:
      ids = self.pg.findEqualFEMShellDOF(fields, fieldNames)
    return ids

  ## Adds a FEMCrossSections object to the store.
  #
  # @param fields  FEMCrossSectionsFields object
  # @return newly assigned ID
  def addFEMCrossSections(self, fields, current=None):
    logging.debug('addFEMCrossSections()')
    with self.lock:
      self.pg.addFEMCrossSections(fields)
    return fields.id


  ## Adds a set of FEMCrossSections objects to the store.
  #
  # @param fieldsList  list of FEMCrossSectionsFields objects
  # @return list of newly assigned IDs
  def addFEMCrossSectionsList(self, fieldsList, current=None):
    logging.debug('addFEMCrossSectionsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMCrossSectionsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMCrossSections object proxy by its ID.
  #
  # @param id FEMCrossSections object ID
  # @return FEMCrossSections object proxy
  def getFEMCrossSections(self, id, current=None):
    logging.debug('getFEMCrossSections(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMCrossSections.has_key(id):
        logging.debug('Fetched FEMCrossSections[oid=%d] servant from cache', id)
        return self.registryFEMCrossSections[id]
      obj = FEMCrossSectionsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMCrossSectionsPrx.uncheckedCast(srvt)
      self.registryFEMCrossSections[id] = prx
    logging.debug('Activated FEMCrossSections[oid=%d] servant', id)
    return prx

  ## Gets the FEMCrossSections object fields.
  #
  # @param id FEMCrossSections object ID
  # @return FEMCrossSectionsFields object
  def getFEMCrossSectionsFields(self, id, current=None):
    logging.debug('getFEMCrossSectionsFields(oid=%d)' % id)
    return self._getFEMCrossSectionsFields(id, current)

  ## Gets the FEMCrossSections object fields.
  #
  # @param id FEMCrossSections object ID
  # @return FEMCrossSectionsFields object
  def _getFEMCrossSectionsFields(self, id, current=None):
    fields = SenStore.FEMCrossSectionsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMCrossSections(fields):
          return None
    return fields

  ## Sets the FEMCrossSections object fields.
  #
  # @param fields     FEMCrossSections fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMCrossSectionsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMCrossSectionsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMCrossSections(fields, fieldNames)

  ## Gets a list of IDs of all FEMCrossSections objects.
  #
  # @return ids list of FEMCrossSections object IDs
  def getFEMCrossSectionsIds(self, current=None):
    logging.debug('getFEMCrossSectionsList()')
    with self.lock:
      return self.pg.getFEMCrossSectionsIds()

  ## Gets a list of FEMCrossSections object proxies.
  #
  # @param ids list of FEMCrossSections object IDs
  # @return list of FEMCrossSections object proxies
  def getFEMCrossSectionsList(self, ids, current=None):
    logging.debug('getFEMCrossSectionsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMCrossSections(id) for id in ids]

  ## Gets a list of FEMCrossSections fields objects.
  #
  # @param ids list of FEMCrossSections object IDs
  # @return list of FEMCrossSections fields objects
  def getFEMCrossSectionsFieldsList(self, ids, current=None):
    logging.debug('getFEMCrossSectionsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMCrossSectionsFields(id) for id in ids]

  ## Gets a list of all FEMCrossSections object IDs.
  #
  # @param fields FEMCrossSections object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMCrossSections objects
  #
  def findEqualFEMCrossSections(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMCrossSections()')
    with self.lock:
      ids = self.pg.findEqualFEMCrossSections(fields, fieldNames)
    return ids

  ## Adds a FEMTwistMomentData object to the store.
  #
  # @param fields  FEMTwistMomentDataFields object
  # @return newly assigned ID
  def addFEMTwistMomentData(self, fields, current=None):
    logging.debug('addFEMTwistMomentData()')
    with self.lock:
      self.pg.addFEMTwistMomentData(fields)
    return fields.id


  ## Adds a set of FEMTwistMomentData objects to the store.
  #
  # @param fieldsList  list of FEMTwistMomentDataFields objects
  # @return list of newly assigned IDs
  def addFEMTwistMomentDataList(self, fieldsList, current=None):
    logging.debug('addFEMTwistMomentDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTwistMomentDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTwistMomentData object proxy by its ID.
  #
  # @param id FEMTwistMomentData object ID
  # @return FEMTwistMomentData object proxy
  def getFEMTwistMomentData(self, id, current=None):
    logging.debug('getFEMTwistMomentData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTwistMomentData.has_key(id):
        logging.debug('Fetched FEMTwistMomentData[oid=%d] servant from cache', id)
        return self.registryFEMTwistMomentData[id]
      obj = FEMTwistMomentDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTwistMomentDataPrx.uncheckedCast(srvt)
      self.registryFEMTwistMomentData[id] = prx
    logging.debug('Activated FEMTwistMomentData[oid=%d] servant', id)
    return prx

  ## Gets the FEMTwistMomentData object fields.
  #
  # @param id FEMTwistMomentData object ID
  # @return FEMTwistMomentDataFields object
  def getFEMTwistMomentDataFields(self, id, current=None):
    logging.debug('getFEMTwistMomentDataFields(oid=%d)' % id)
    return self._getFEMTwistMomentDataFields(id, current)

  ## Gets the FEMTwistMomentData object fields.
  #
  # @param id FEMTwistMomentData object ID
  # @return FEMTwistMomentDataFields object
  def _getFEMTwistMomentDataFields(self, id, current=None):
    fields = SenStore.FEMTwistMomentDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTwistMomentData(fields):
          return None
    return fields

  ## Sets the FEMTwistMomentData object fields.
  #
  # @param fields     FEMTwistMomentData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTwistMomentDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTwistMomentDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTwistMomentData(fields, fieldNames)

  ## Gets a list of IDs of all FEMTwistMomentData objects.
  #
  # @return ids list of FEMTwistMomentData object IDs
  def getFEMTwistMomentDataIds(self, current=None):
    logging.debug('getFEMTwistMomentDataList()')
    with self.lock:
      return self.pg.getFEMTwistMomentDataIds()

  ## Gets a list of FEMTwistMomentData object proxies.
  #
  # @param ids list of FEMTwistMomentData object IDs
  # @return list of FEMTwistMomentData object proxies
  def getFEMTwistMomentDataList(self, ids, current=None):
    logging.debug('getFEMTwistMomentDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTwistMomentData(id) for id in ids]

  ## Gets a list of FEMTwistMomentData fields objects.
  #
  # @param ids list of FEMTwistMomentData object IDs
  # @return list of FEMTwistMomentData fields objects
  def getFEMTwistMomentDataFieldsList(self, ids, current=None):
    logging.debug('getFEMTwistMomentDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTwistMomentDataFields(id) for id in ids]

  ## Gets a list of all FEMTwistMomentData object IDs.
  #
  # @param fields FEMTwistMomentData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTwistMomentData objects
  #
  def findEqualFEMTwistMomentData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTwistMomentData()')
    with self.lock:
      ids = self.pg.findEqualFEMTwistMomentData(fields, fieldNames)
    return ids

  ## Adds a FEMShell object to the store.
  #
  # @param fields  FEMShellFields object
  # @return newly assigned ID
  def addFEMShell(self, fields, current=None):
    logging.debug('addFEMShell()')
    with self.lock:
      self.pg.addFEMShell(fields)
    return fields.id


  ## Adds a set of FEMShell objects to the store.
  #
  # @param fieldsList  list of FEMShellFields objects
  # @return list of newly assigned IDs
  def addFEMShellList(self, fieldsList, current=None):
    logging.debug('addFEMShellList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShell object proxy by its ID.
  #
  # @param id FEMShell object ID
  # @return FEMShell object proxy
  def getFEMShell(self, id, current=None):
    logging.debug('getFEMShell(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShell.has_key(id):
        logging.debug('Fetched FEMShell[oid=%d] servant from cache', id)
        return self.registryFEMShell[id]
      obj = FEMShellI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellPrx.uncheckedCast(srvt)
      self.registryFEMShell[id] = prx
    logging.debug('Activated FEMShell[oid=%d] servant', id)
    return prx

  ## Gets the FEMShell object fields.
  #
  # @param id FEMShell object ID
  # @return FEMShellFields object
  def getFEMShellFields(self, id, current=None):
    logging.debug('getFEMShellFields(oid=%d)' % id)
    return self._getFEMShellFields(id, current)

  ## Gets the FEMShell object fields.
  #
  # @param id FEMShell object ID
  # @return FEMShellFields object
  def _getFEMShellFields(self, id, current=None):
    fields = SenStore.FEMShellFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShell(fields):
          return None
    return fields

  ## Sets the FEMShell object fields.
  #
  # @param fields     FEMShell fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShell(fields, fieldNames)

  ## Gets a list of IDs of all FEMShell objects.
  #
  # @return ids list of FEMShell object IDs
  def getFEMShellIds(self, current=None):
    logging.debug('getFEMShellList()')
    with self.lock:
      return self.pg.getFEMShellIds()

  ## Gets a list of FEMShell object proxies.
  #
  # @param ids list of FEMShell object IDs
  # @return list of FEMShell object proxies
  def getFEMShellList(self, ids, current=None):
    logging.debug('getFEMShellList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShell(id) for id in ids]

  ## Gets a list of FEMShell fields objects.
  #
  # @param ids list of FEMShell object IDs
  # @return list of FEMShell fields objects
  def getFEMShellFieldsList(self, ids, current=None):
    logging.debug('getFEMShellFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellFields(id) for id in ids]

  ## Gets a list of all FEMShell object IDs.
  #
  # @param fields FEMShell object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShell objects
  #
  def findEqualFEMShell(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShell()')
    with self.lock:
      ids = self.pg.findEqualFEMShell(fields, fieldNames)
    return ids

  ## Adds a FEMNTNContact object to the store.
  #
  # @param fields  FEMNTNContactFields object
  # @return newly assigned ID
  def addFEMNTNContact(self, fields, current=None):
    logging.debug('addFEMNTNContact()')
    with self.lock:
      self.pg.addFEMNTNContact(fields)
    return fields.id


  ## Adds a set of FEMNTNContact objects to the store.
  #
  # @param fieldsList  list of FEMNTNContactFields objects
  # @return list of newly assigned IDs
  def addFEMNTNContactList(self, fieldsList, current=None):
    logging.debug('addFEMNTNContactList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNTNContactList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNTNContact object proxy by its ID.
  #
  # @param id FEMNTNContact object ID
  # @return FEMNTNContact object proxy
  def getFEMNTNContact(self, id, current=None):
    logging.debug('getFEMNTNContact(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNTNContact.has_key(id):
        logging.debug('Fetched FEMNTNContact[oid=%d] servant from cache', id)
        return self.registryFEMNTNContact[id]
      obj = FEMNTNContactI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNTNContactPrx.uncheckedCast(srvt)
      self.registryFEMNTNContact[id] = prx
    logging.debug('Activated FEMNTNContact[oid=%d] servant', id)
    return prx

  ## Gets the FEMNTNContact object fields.
  #
  # @param id FEMNTNContact object ID
  # @return FEMNTNContactFields object
  def getFEMNTNContactFields(self, id, current=None):
    logging.debug('getFEMNTNContactFields(oid=%d)' % id)
    return self._getFEMNTNContactFields(id, current)

  ## Gets the FEMNTNContact object fields.
  #
  # @param id FEMNTNContact object ID
  # @return FEMNTNContactFields object
  def _getFEMNTNContactFields(self, id, current=None):
    fields = SenStore.FEMNTNContactFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNTNContact(fields):
          return None
    return fields

  ## Sets the FEMNTNContact object fields.
  #
  # @param fields     FEMNTNContact fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNTNContactFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNTNContactFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNTNContact(fields, fieldNames)

  ## Gets a list of IDs of all FEMNTNContact objects.
  #
  # @return ids list of FEMNTNContact object IDs
  def getFEMNTNContactIds(self, current=None):
    logging.debug('getFEMNTNContactList()')
    with self.lock:
      return self.pg.getFEMNTNContactIds()

  ## Gets a list of FEMNTNContact object proxies.
  #
  # @param ids list of FEMNTNContact object IDs
  # @return list of FEMNTNContact object proxies
  def getFEMNTNContactList(self, ids, current=None):
    logging.debug('getFEMNTNContactList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNTNContact(id) for id in ids]

  ## Gets a list of FEMNTNContact fields objects.
  #
  # @param ids list of FEMNTNContact object IDs
  # @return list of FEMNTNContact fields objects
  def getFEMNTNContactFieldsList(self, ids, current=None):
    logging.debug('getFEMNTNContactFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNTNContactFields(id) for id in ids]

  ## Gets a list of all FEMNTNContact object IDs.
  #
  # @param fields FEMNTNContact object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNTNContact objects
  #
  def findEqualFEMNTNContact(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNTNContact()')
    with self.lock:
      ids = self.pg.findEqualFEMNTNContact(fields, fieldNames)
    return ids

  ## Adds a FEMShellLayer object to the store.
  #
  # @param fields  FEMShellLayerFields object
  # @return newly assigned ID
  def addFEMShellLayer(self, fields, current=None):
    logging.debug('addFEMShellLayer()')
    with self.lock:
      self.pg.addFEMShellLayer(fields)
    return fields.id


  ## Adds a set of FEMShellLayer objects to the store.
  #
  # @param fieldsList  list of FEMShellLayerFields objects
  # @return list of newly assigned IDs
  def addFEMShellLayerList(self, fieldsList, current=None):
    logging.debug('addFEMShellLayerList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellLayerList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellLayer object proxy by its ID.
  #
  # @param id FEMShellLayer object ID
  # @return FEMShellLayer object proxy
  def getFEMShellLayer(self, id, current=None):
    logging.debug('getFEMShellLayer(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellLayer.has_key(id):
        logging.debug('Fetched FEMShellLayer[oid=%d] servant from cache', id)
        return self.registryFEMShellLayer[id]
      obj = FEMShellLayerI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellLayerPrx.uncheckedCast(srvt)
      self.registryFEMShellLayer[id] = prx
    logging.debug('Activated FEMShellLayer[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellLayer object fields.
  #
  # @param id FEMShellLayer object ID
  # @return FEMShellLayerFields object
  def getFEMShellLayerFields(self, id, current=None):
    logging.debug('getFEMShellLayerFields(oid=%d)' % id)
    return self._getFEMShellLayerFields(id, current)

  ## Gets the FEMShellLayer object fields.
  #
  # @param id FEMShellLayer object ID
  # @return FEMShellLayerFields object
  def _getFEMShellLayerFields(self, id, current=None):
    fields = SenStore.FEMShellLayerFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellLayer(fields):
          return None
    return fields

  ## Sets the FEMShellLayer object fields.
  #
  # @param fields     FEMShellLayer fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellLayerFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellLayerFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellLayer(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellLayer objects.
  #
  # @return ids list of FEMShellLayer object IDs
  def getFEMShellLayerIds(self, current=None):
    logging.debug('getFEMShellLayerList()')
    with self.lock:
      return self.pg.getFEMShellLayerIds()

  ## Gets a list of FEMShellLayer object proxies.
  #
  # @param ids list of FEMShellLayer object IDs
  # @return list of FEMShellLayer object proxies
  def getFEMShellLayerList(self, ids, current=None):
    logging.debug('getFEMShellLayerList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellLayer(id) for id in ids]

  ## Gets a list of FEMShellLayer fields objects.
  #
  # @param ids list of FEMShellLayer object IDs
  # @return list of FEMShellLayer fields objects
  def getFEMShellLayerFieldsList(self, ids, current=None):
    logging.debug('getFEMShellLayerFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellLayerFields(id) for id in ids]

  ## Gets a list of all FEMShellLayer object IDs.
  #
  # @param fields FEMShellLayer object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellLayer objects
  #
  def findEqualFEMShellLayer(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellLayer()')
    with self.lock:
      ids = self.pg.findEqualFEMShellLayer(fields, fieldNames)
    return ids

  ## Adds a FEMSkewSysAngles object to the store.
  #
  # @param fields  FEMSkewSysAnglesFields object
  # @return newly assigned ID
  def addFEMSkewSysAngles(self, fields, current=None):
    logging.debug('addFEMSkewSysAngles()')
    with self.lock:
      self.pg.addFEMSkewSysAngles(fields)
    return fields.id


  ## Adds a set of FEMSkewSysAngles objects to the store.
  #
  # @param fieldsList  list of FEMSkewSysAnglesFields objects
  # @return list of newly assigned IDs
  def addFEMSkewSysAnglesList(self, fieldsList, current=None):
    logging.debug('addFEMSkewSysAnglesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSkewSysAnglesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSkewSysAngles object proxy by its ID.
  #
  # @param id FEMSkewSysAngles object ID
  # @return FEMSkewSysAngles object proxy
  def getFEMSkewSysAngles(self, id, current=None):
    logging.debug('getFEMSkewSysAngles(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSkewSysAngles.has_key(id):
        logging.debug('Fetched FEMSkewSysAngles[oid=%d] servant from cache', id)
        return self.registryFEMSkewSysAngles[id]
      obj = FEMSkewSysAnglesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSkewSysAnglesPrx.uncheckedCast(srvt)
      self.registryFEMSkewSysAngles[id] = prx
    logging.debug('Activated FEMSkewSysAngles[oid=%d] servant', id)
    return prx

  ## Gets the FEMSkewSysAngles object fields.
  #
  # @param id FEMSkewSysAngles object ID
  # @return FEMSkewSysAnglesFields object
  def getFEMSkewSysAnglesFields(self, id, current=None):
    logging.debug('getFEMSkewSysAnglesFields(oid=%d)' % id)
    return self._getFEMSkewSysAnglesFields(id, current)

  ## Gets the FEMSkewSysAngles object fields.
  #
  # @param id FEMSkewSysAngles object ID
  # @return FEMSkewSysAnglesFields object
  def _getFEMSkewSysAnglesFields(self, id, current=None):
    fields = SenStore.FEMSkewSysAnglesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSkewSysAngles(fields):
          return None
    return fields

  ## Sets the FEMSkewSysAngles object fields.
  #
  # @param fields     FEMSkewSysAngles fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSkewSysAnglesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSkewSysAnglesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSkewSysAngles(fields, fieldNames)

  ## Gets a list of IDs of all FEMSkewSysAngles objects.
  #
  # @return ids list of FEMSkewSysAngles object IDs
  def getFEMSkewSysAnglesIds(self, current=None):
    logging.debug('getFEMSkewSysAnglesList()')
    with self.lock:
      return self.pg.getFEMSkewSysAnglesIds()

  ## Gets a list of FEMSkewSysAngles object proxies.
  #
  # @param ids list of FEMSkewSysAngles object IDs
  # @return list of FEMSkewSysAngles object proxies
  def getFEMSkewSysAnglesList(self, ids, current=None):
    logging.debug('getFEMSkewSysAnglesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSkewSysAngles(id) for id in ids]

  ## Gets a list of FEMSkewSysAngles fields objects.
  #
  # @param ids list of FEMSkewSysAngles object IDs
  # @return list of FEMSkewSysAngles fields objects
  def getFEMSkewSysAnglesFieldsList(self, ids, current=None):
    logging.debug('getFEMSkewSysAnglesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSkewSysAnglesFields(id) for id in ids]

  ## Gets a list of all FEMSkewSysAngles object IDs.
  #
  # @param fields FEMSkewSysAngles object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSkewSysAngles objects
  #
  def findEqualFEMSkewSysAngles(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSkewSysAngles()')
    with self.lock:
      ids = self.pg.findEqualFEMSkewSysAngles(fields, fieldNames)
    return ids

  ## Adds a FEMGroundMotionRecord object to the store.
  #
  # @param fields  FEMGroundMotionRecordFields object
  # @return newly assigned ID
  def addFEMGroundMotionRecord(self, fields, current=None):
    logging.debug('addFEMGroundMotionRecord()')
    with self.lock:
      self.pg.addFEMGroundMotionRecord(fields)
    return fields.id


  ## Adds a set of FEMGroundMotionRecord objects to the store.
  #
  # @param fieldsList  list of FEMGroundMotionRecordFields objects
  # @return list of newly assigned IDs
  def addFEMGroundMotionRecordList(self, fieldsList, current=None):
    logging.debug('addFEMGroundMotionRecordList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMGroundMotionRecordList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMGroundMotionRecord object proxy by its ID.
  #
  # @param id FEMGroundMotionRecord object ID
  # @return FEMGroundMotionRecord object proxy
  def getFEMGroundMotionRecord(self, id, current=None):
    logging.debug('getFEMGroundMotionRecord(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMGroundMotionRecord.has_key(id):
        logging.debug('Fetched FEMGroundMotionRecord[oid=%d] servant from cache', id)
        return self.registryFEMGroundMotionRecord[id]
      obj = FEMGroundMotionRecordI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMGroundMotionRecordPrx.uncheckedCast(srvt)
      self.registryFEMGroundMotionRecord[id] = prx
    logging.debug('Activated FEMGroundMotionRecord[oid=%d] servant', id)
    return prx

  ## Gets the FEMGroundMotionRecord object fields.
  #
  # @param id FEMGroundMotionRecord object ID
  # @return FEMGroundMotionRecordFields object
  def getFEMGroundMotionRecordFields(self, id, current=None):
    logging.debug('getFEMGroundMotionRecordFields(oid=%d)' % id)
    return self._getFEMGroundMotionRecordFields(id, current)

  ## Gets the FEMGroundMotionRecord object fields.
  #
  # @param id FEMGroundMotionRecord object ID
  # @return FEMGroundMotionRecordFields object
  def _getFEMGroundMotionRecordFields(self, id, current=None):
    fields = SenStore.FEMGroundMotionRecordFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMGroundMotionRecord(fields):
          return None
    return fields

  ## Sets the FEMGroundMotionRecord object fields.
  #
  # @param fields     FEMGroundMotionRecord fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMGroundMotionRecordFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMGroundMotionRecordFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMGroundMotionRecord(fields, fieldNames)

  ## Gets a list of IDs of all FEMGroundMotionRecord objects.
  #
  # @return ids list of FEMGroundMotionRecord object IDs
  def getFEMGroundMotionRecordIds(self, current=None):
    logging.debug('getFEMGroundMotionRecordList()')
    with self.lock:
      return self.pg.getFEMGroundMotionRecordIds()

  ## Gets a list of FEMGroundMotionRecord object proxies.
  #
  # @param ids list of FEMGroundMotionRecord object IDs
  # @return list of FEMGroundMotionRecord object proxies
  def getFEMGroundMotionRecordList(self, ids, current=None):
    logging.debug('getFEMGroundMotionRecordList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMGroundMotionRecord(id) for id in ids]

  ## Gets a list of FEMGroundMotionRecord fields objects.
  #
  # @param ids list of FEMGroundMotionRecord object IDs
  # @return list of FEMGroundMotionRecord fields objects
  def getFEMGroundMotionRecordFieldsList(self, ids, current=None):
    logging.debug('getFEMGroundMotionRecordFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMGroundMotionRecordFields(id) for id in ids]

  ## Gets a list of all FEMGroundMotionRecord object IDs.
  #
  # @param fields FEMGroundMotionRecord object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMGroundMotionRecord objects
  #
  def findEqualFEMGroundMotionRecord(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMGroundMotionRecord()')
    with self.lock:
      ids = self.pg.findEqualFEMGroundMotionRecord(fields, fieldNames)
    return ids

  ## Adds a FEMGeneralGroup object to the store.
  #
  # @param fields  FEMGeneralGroupFields object
  # @return newly assigned ID
  def addFEMGeneralGroup(self, fields, current=None):
    logging.debug('addFEMGeneralGroup()')
    with self.lock:
      self.pg.addFEMGeneralGroup(fields)
    return fields.id


  ## Adds a set of FEMGeneralGroup objects to the store.
  #
  # @param fieldsList  list of FEMGeneralGroupFields objects
  # @return list of newly assigned IDs
  def addFEMGeneralGroupList(self, fieldsList, current=None):
    logging.debug('addFEMGeneralGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMGeneralGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMGeneralGroup object proxy by its ID.
  #
  # @param id FEMGeneralGroup object ID
  # @return FEMGeneralGroup object proxy
  def getFEMGeneralGroup(self, id, current=None):
    logging.debug('getFEMGeneralGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMGeneralGroup.has_key(id):
        logging.debug('Fetched FEMGeneralGroup[oid=%d] servant from cache', id)
        return self.registryFEMGeneralGroup[id]
      obj = FEMGeneralGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMGeneralGroupPrx.uncheckedCast(srvt)
      self.registryFEMGeneralGroup[id] = prx
    logging.debug('Activated FEMGeneralGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMGeneralGroup object fields.
  #
  # @param id FEMGeneralGroup object ID
  # @return FEMGeneralGroupFields object
  def getFEMGeneralGroupFields(self, id, current=None):
    logging.debug('getFEMGeneralGroupFields(oid=%d)' % id)
    return self._getFEMGeneralGroupFields(id, current)

  ## Gets the FEMGeneralGroup object fields.
  #
  # @param id FEMGeneralGroup object ID
  # @return FEMGeneralGroupFields object
  def _getFEMGeneralGroupFields(self, id, current=None):
    fields = SenStore.FEMGeneralGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMGeneralGroup(fields):
          return None
    return fields

  ## Sets the FEMGeneralGroup object fields.
  #
  # @param fields     FEMGeneralGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMGeneralGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMGeneralGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMGeneralGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMGeneralGroup objects.
  #
  # @return ids list of FEMGeneralGroup object IDs
  def getFEMGeneralGroupIds(self, current=None):
    logging.debug('getFEMGeneralGroupList()')
    with self.lock:
      return self.pg.getFEMGeneralGroupIds()

  ## Gets a list of FEMGeneralGroup object proxies.
  #
  # @param ids list of FEMGeneralGroup object IDs
  # @return list of FEMGeneralGroup object proxies
  def getFEMGeneralGroupList(self, ids, current=None):
    logging.debug('getFEMGeneralGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMGeneralGroup(id) for id in ids]

  ## Gets a list of FEMGeneralGroup fields objects.
  #
  # @param ids list of FEMGeneralGroup object IDs
  # @return list of FEMGeneralGroup fields objects
  def getFEMGeneralGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMGeneralGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMGeneralGroupFields(id) for id in ids]

  ## Gets a list of all FEMGeneralGroup object IDs.
  #
  # @param fields FEMGeneralGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMGeneralGroup objects
  #
  def findEqualFEMGeneralGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMGeneralGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMGeneralGroup(fields, fieldNames)
    return ids

  ## Adds a FEMTwoDSolid object to the store.
  #
  # @param fields  FEMTwoDSolidFields object
  # @return newly assigned ID
  def addFEMTwoDSolid(self, fields, current=None):
    logging.debug('addFEMTwoDSolid()')
    with self.lock:
      self.pg.addFEMTwoDSolid(fields)
    return fields.id


  ## Adds a set of FEMTwoDSolid objects to the store.
  #
  # @param fieldsList  list of FEMTwoDSolidFields objects
  # @return list of newly assigned IDs
  def addFEMTwoDSolidList(self, fieldsList, current=None):
    logging.debug('addFEMTwoDSolidList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMTwoDSolidList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMTwoDSolid object proxy by its ID.
  #
  # @param id FEMTwoDSolid object ID
  # @return FEMTwoDSolid object proxy
  def getFEMTwoDSolid(self, id, current=None):
    logging.debug('getFEMTwoDSolid(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMTwoDSolid.has_key(id):
        logging.debug('Fetched FEMTwoDSolid[oid=%d] servant from cache', id)
        return self.registryFEMTwoDSolid[id]
      obj = FEMTwoDSolidI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMTwoDSolidPrx.uncheckedCast(srvt)
      self.registryFEMTwoDSolid[id] = prx
    logging.debug('Activated FEMTwoDSolid[oid=%d] servant', id)
    return prx

  ## Gets the FEMTwoDSolid object fields.
  #
  # @param id FEMTwoDSolid object ID
  # @return FEMTwoDSolidFields object
  def getFEMTwoDSolidFields(self, id, current=None):
    logging.debug('getFEMTwoDSolidFields(oid=%d)' % id)
    return self._getFEMTwoDSolidFields(id, current)

  ## Gets the FEMTwoDSolid object fields.
  #
  # @param id FEMTwoDSolid object ID
  # @return FEMTwoDSolidFields object
  def _getFEMTwoDSolidFields(self, id, current=None):
    fields = SenStore.FEMTwoDSolidFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMTwoDSolid(fields):
          return None
    return fields

  ## Sets the FEMTwoDSolid object fields.
  #
  # @param fields     FEMTwoDSolid fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMTwoDSolidFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMTwoDSolidFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMTwoDSolid(fields, fieldNames)

  ## Gets a list of IDs of all FEMTwoDSolid objects.
  #
  # @return ids list of FEMTwoDSolid object IDs
  def getFEMTwoDSolidIds(self, current=None):
    logging.debug('getFEMTwoDSolidList()')
    with self.lock:
      return self.pg.getFEMTwoDSolidIds()

  ## Gets a list of FEMTwoDSolid object proxies.
  #
  # @param ids list of FEMTwoDSolid object IDs
  # @return list of FEMTwoDSolid object proxies
  def getFEMTwoDSolidList(self, ids, current=None):
    logging.debug('getFEMTwoDSolidList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMTwoDSolid(id) for id in ids]

  ## Gets a list of FEMTwoDSolid fields objects.
  #
  # @param ids list of FEMTwoDSolid object IDs
  # @return list of FEMTwoDSolid fields objects
  def getFEMTwoDSolidFieldsList(self, ids, current=None):
    logging.debug('getFEMTwoDSolidFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMTwoDSolidFields(id) for id in ids]

  ## Gets a list of all FEMTwoDSolid object IDs.
  #
  # @param fields FEMTwoDSolid object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMTwoDSolid objects
  #
  def findEqualFEMTwoDSolid(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMTwoDSolid()')
    with self.lock:
      ids = self.pg.findEqualFEMTwoDSolid(fields, fieldNames)
    return ids

  ## Adds a FEMAppliedTemperature object to the store.
  #
  # @param fields  FEMAppliedTemperatureFields object
  # @return newly assigned ID
  def addFEMAppliedTemperature(self, fields, current=None):
    logging.debug('addFEMAppliedTemperature()')
    with self.lock:
      self.pg.addFEMAppliedTemperature(fields)
    return fields.id


  ## Adds a set of FEMAppliedTemperature objects to the store.
  #
  # @param fieldsList  list of FEMAppliedTemperatureFields objects
  # @return list of newly assigned IDs
  def addFEMAppliedTemperatureList(self, fieldsList, current=None):
    logging.debug('addFEMAppliedTemperatureList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMAppliedTemperatureList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMAppliedTemperature object proxy by its ID.
  #
  # @param id FEMAppliedTemperature object ID
  # @return FEMAppliedTemperature object proxy
  def getFEMAppliedTemperature(self, id, current=None):
    logging.debug('getFEMAppliedTemperature(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMAppliedTemperature.has_key(id):
        logging.debug('Fetched FEMAppliedTemperature[oid=%d] servant from cache', id)
        return self.registryFEMAppliedTemperature[id]
      obj = FEMAppliedTemperatureI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMAppliedTemperaturePrx.uncheckedCast(srvt)
      self.registryFEMAppliedTemperature[id] = prx
    logging.debug('Activated FEMAppliedTemperature[oid=%d] servant', id)
    return prx

  ## Gets the FEMAppliedTemperature object fields.
  #
  # @param id FEMAppliedTemperature object ID
  # @return FEMAppliedTemperatureFields object
  def getFEMAppliedTemperatureFields(self, id, current=None):
    logging.debug('getFEMAppliedTemperatureFields(oid=%d)' % id)
    return self._getFEMAppliedTemperatureFields(id, current)

  ## Gets the FEMAppliedTemperature object fields.
  #
  # @param id FEMAppliedTemperature object ID
  # @return FEMAppliedTemperatureFields object
  def _getFEMAppliedTemperatureFields(self, id, current=None):
    fields = SenStore.FEMAppliedTemperatureFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMAppliedTemperature(fields):
          return None
    return fields

  ## Sets the FEMAppliedTemperature object fields.
  #
  # @param fields     FEMAppliedTemperature fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMAppliedTemperatureFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMAppliedTemperatureFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMAppliedTemperature(fields, fieldNames)

  ## Gets a list of IDs of all FEMAppliedTemperature objects.
  #
  # @return ids list of FEMAppliedTemperature object IDs
  def getFEMAppliedTemperatureIds(self, current=None):
    logging.debug('getFEMAppliedTemperatureList()')
    with self.lock:
      return self.pg.getFEMAppliedTemperatureIds()

  ## Gets a list of FEMAppliedTemperature object proxies.
  #
  # @param ids list of FEMAppliedTemperature object IDs
  # @return list of FEMAppliedTemperature object proxies
  def getFEMAppliedTemperatureList(self, ids, current=None):
    logging.debug('getFEMAppliedTemperatureList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMAppliedTemperature(id) for id in ids]

  ## Gets a list of FEMAppliedTemperature fields objects.
  #
  # @param ids list of FEMAppliedTemperature object IDs
  # @return list of FEMAppliedTemperature fields objects
  def getFEMAppliedTemperatureFieldsList(self, ids, current=None):
    logging.debug('getFEMAppliedTemperatureFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMAppliedTemperatureFields(id) for id in ids]

  ## Gets a list of all FEMAppliedTemperature object IDs.
  #
  # @param fields FEMAppliedTemperature object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMAppliedTemperature objects
  #
  def findEqualFEMAppliedTemperature(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMAppliedTemperature()')
    with self.lock:
      ids = self.pg.findEqualFEMAppliedTemperature(fields, fieldNames)
    return ids

  ## Adds a FEMMatrixSets object to the store.
  #
  # @param fields  FEMMatrixSetsFields object
  # @return newly assigned ID
  def addFEMMatrixSets(self, fields, current=None):
    logging.debug('addFEMMatrixSets()')
    with self.lock:
      self.pg.addFEMMatrixSets(fields)
    return fields.id


  ## Adds a set of FEMMatrixSets objects to the store.
  #
  # @param fieldsList  list of FEMMatrixSetsFields objects
  # @return list of newly assigned IDs
  def addFEMMatrixSetsList(self, fieldsList, current=None):
    logging.debug('addFEMMatrixSetsList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMatrixSetsList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMatrixSets object proxy by its ID.
  #
  # @param id FEMMatrixSets object ID
  # @return FEMMatrixSets object proxy
  def getFEMMatrixSets(self, id, current=None):
    logging.debug('getFEMMatrixSets(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMatrixSets.has_key(id):
        logging.debug('Fetched FEMMatrixSets[oid=%d] servant from cache', id)
        return self.registryFEMMatrixSets[id]
      obj = FEMMatrixSetsI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMatrixSetsPrx.uncheckedCast(srvt)
      self.registryFEMMatrixSets[id] = prx
    logging.debug('Activated FEMMatrixSets[oid=%d] servant', id)
    return prx

  ## Gets the FEMMatrixSets object fields.
  #
  # @param id FEMMatrixSets object ID
  # @return FEMMatrixSetsFields object
  def getFEMMatrixSetsFields(self, id, current=None):
    logging.debug('getFEMMatrixSetsFields(oid=%d)' % id)
    return self._getFEMMatrixSetsFields(id, current)

  ## Gets the FEMMatrixSets object fields.
  #
  # @param id FEMMatrixSets object ID
  # @return FEMMatrixSetsFields object
  def _getFEMMatrixSetsFields(self, id, current=None):
    fields = SenStore.FEMMatrixSetsFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMatrixSets(fields):
          return None
    return fields

  ## Sets the FEMMatrixSets object fields.
  #
  # @param fields     FEMMatrixSets fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMatrixSetsFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMatrixSetsFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMatrixSets(fields, fieldNames)

  ## Gets a list of IDs of all FEMMatrixSets objects.
  #
  # @return ids list of FEMMatrixSets object IDs
  def getFEMMatrixSetsIds(self, current=None):
    logging.debug('getFEMMatrixSetsList()')
    with self.lock:
      return self.pg.getFEMMatrixSetsIds()

  ## Gets a list of FEMMatrixSets object proxies.
  #
  # @param ids list of FEMMatrixSets object IDs
  # @return list of FEMMatrixSets object proxies
  def getFEMMatrixSetsList(self, ids, current=None):
    logging.debug('getFEMMatrixSetsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMatrixSets(id) for id in ids]

  ## Gets a list of FEMMatrixSets fields objects.
  #
  # @param ids list of FEMMatrixSets object IDs
  # @return list of FEMMatrixSets fields objects
  def getFEMMatrixSetsFieldsList(self, ids, current=None):
    logging.debug('getFEMMatrixSetsFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMatrixSetsFields(id) for id in ids]

  ## Gets a list of all FEMMatrixSets object IDs.
  #
  # @param fields FEMMatrixSets object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMatrixSets objects
  #
  def findEqualFEMMatrixSets(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMatrixSets()')
    with self.lock:
      ids = self.pg.findEqualFEMMatrixSets(fields, fieldNames)
    return ids

  ## Adds a FEMConstraintCoef object to the store.
  #
  # @param fields  FEMConstraintCoefFields object
  # @return newly assigned ID
  def addFEMConstraintCoef(self, fields, current=None):
    logging.debug('addFEMConstraintCoef()')
    with self.lock:
      self.pg.addFEMConstraintCoef(fields)
    return fields.id


  ## Adds a set of FEMConstraintCoef objects to the store.
  #
  # @param fieldsList  list of FEMConstraintCoefFields objects
  # @return list of newly assigned IDs
  def addFEMConstraintCoefList(self, fieldsList, current=None):
    logging.debug('addFEMConstraintCoefList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMConstraintCoefList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMConstraintCoef object proxy by its ID.
  #
  # @param id FEMConstraintCoef object ID
  # @return FEMConstraintCoef object proxy
  def getFEMConstraintCoef(self, id, current=None):
    logging.debug('getFEMConstraintCoef(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMConstraintCoef.has_key(id):
        logging.debug('Fetched FEMConstraintCoef[oid=%d] servant from cache', id)
        return self.registryFEMConstraintCoef[id]
      obj = FEMConstraintCoefI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMConstraintCoefPrx.uncheckedCast(srvt)
      self.registryFEMConstraintCoef[id] = prx
    logging.debug('Activated FEMConstraintCoef[oid=%d] servant', id)
    return prx

  ## Gets the FEMConstraintCoef object fields.
  #
  # @param id FEMConstraintCoef object ID
  # @return FEMConstraintCoefFields object
  def getFEMConstraintCoefFields(self, id, current=None):
    logging.debug('getFEMConstraintCoefFields(oid=%d)' % id)
    return self._getFEMConstraintCoefFields(id, current)

  ## Gets the FEMConstraintCoef object fields.
  #
  # @param id FEMConstraintCoef object ID
  # @return FEMConstraintCoefFields object
  def _getFEMConstraintCoefFields(self, id, current=None):
    fields = SenStore.FEMConstraintCoefFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMConstraintCoef(fields):
          return None
    return fields

  ## Sets the FEMConstraintCoef object fields.
  #
  # @param fields     FEMConstraintCoef fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMConstraintCoefFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMConstraintCoefFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMConstraintCoef(fields, fieldNames)

  ## Gets a list of IDs of all FEMConstraintCoef objects.
  #
  # @return ids list of FEMConstraintCoef object IDs
  def getFEMConstraintCoefIds(self, current=None):
    logging.debug('getFEMConstraintCoefList()')
    with self.lock:
      return self.pg.getFEMConstraintCoefIds()

  ## Gets a list of FEMConstraintCoef object proxies.
  #
  # @param ids list of FEMConstraintCoef object IDs
  # @return list of FEMConstraintCoef object proxies
  def getFEMConstraintCoefList(self, ids, current=None):
    logging.debug('getFEMConstraintCoefList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMConstraintCoef(id) for id in ids]

  ## Gets a list of FEMConstraintCoef fields objects.
  #
  # @param ids list of FEMConstraintCoef object IDs
  # @return list of FEMConstraintCoef fields objects
  def getFEMConstraintCoefFieldsList(self, ids, current=None):
    logging.debug('getFEMConstraintCoefFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMConstraintCoefFields(id) for id in ids]

  ## Gets a list of all FEMConstraintCoef object IDs.
  #
  # @param fields FEMConstraintCoef object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMConstraintCoef objects
  #
  def findEqualFEMConstraintCoef(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMConstraintCoef()')
    with self.lock:
      ids = self.pg.findEqualFEMConstraintCoef(fields, fieldNames)
    return ids

  ## Adds a FEMSectionBox object to the store.
  #
  # @param fields  FEMSectionBoxFields object
  # @return newly assigned ID
  def addFEMSectionBox(self, fields, current=None):
    logging.debug('addFEMSectionBox()')
    with self.lock:
      self.pg.addFEMSectionBox(fields)
    return fields.id


  ## Adds a set of FEMSectionBox objects to the store.
  #
  # @param fieldsList  list of FEMSectionBoxFields objects
  # @return list of newly assigned IDs
  def addFEMSectionBoxList(self, fieldsList, current=None):
    logging.debug('addFEMSectionBoxList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSectionBoxList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSectionBox object proxy by its ID.
  #
  # @param id FEMSectionBox object ID
  # @return FEMSectionBox object proxy
  def getFEMSectionBox(self, id, current=None):
    logging.debug('getFEMSectionBox(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSectionBox.has_key(id):
        logging.debug('Fetched FEMSectionBox[oid=%d] servant from cache', id)
        return self.registryFEMSectionBox[id]
      obj = FEMSectionBoxI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSectionBoxPrx.uncheckedCast(srvt)
      self.registryFEMSectionBox[id] = prx
    logging.debug('Activated FEMSectionBox[oid=%d] servant', id)
    return prx

  ## Gets the FEMSectionBox object fields.
  #
  # @param id FEMSectionBox object ID
  # @return FEMSectionBoxFields object
  def getFEMSectionBoxFields(self, id, current=None):
    logging.debug('getFEMSectionBoxFields(oid=%d)' % id)
    return self._getFEMSectionBoxFields(id, current)

  ## Gets the FEMSectionBox object fields.
  #
  # @param id FEMSectionBox object ID
  # @return FEMSectionBoxFields object
  def _getFEMSectionBoxFields(self, id, current=None):
    fields = SenStore.FEMSectionBoxFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSectionBox(fields):
          return None
    return fields

  ## Sets the FEMSectionBox object fields.
  #
  # @param fields     FEMSectionBox fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSectionBoxFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSectionBoxFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSectionBox(fields, fieldNames)

  ## Gets a list of IDs of all FEMSectionBox objects.
  #
  # @return ids list of FEMSectionBox object IDs
  def getFEMSectionBoxIds(self, current=None):
    logging.debug('getFEMSectionBoxList()')
    with self.lock:
      return self.pg.getFEMSectionBoxIds()

  ## Gets a list of FEMSectionBox object proxies.
  #
  # @param ids list of FEMSectionBox object IDs
  # @return list of FEMSectionBox object proxies
  def getFEMSectionBoxList(self, ids, current=None):
    logging.debug('getFEMSectionBoxList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSectionBox(id) for id in ids]

  ## Gets a list of FEMSectionBox fields objects.
  #
  # @param ids list of FEMSectionBox object IDs
  # @return list of FEMSectionBox fields objects
  def getFEMSectionBoxFieldsList(self, ids, current=None):
    logging.debug('getFEMSectionBoxFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSectionBoxFields(id) for id in ids]

  ## Gets a list of all FEMSectionBox object IDs.
  #
  # @param fields FEMSectionBox object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSectionBox objects
  #
  def findEqualFEMSectionBox(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSectionBox()')
    with self.lock:
      ids = self.pg.findEqualFEMSectionBox(fields, fieldNames)
    return ids

  ## Adds a FEMNKDisplForce object to the store.
  #
  # @param fields  FEMNKDisplForceFields object
  # @return newly assigned ID
  def addFEMNKDisplForce(self, fields, current=None):
    logging.debug('addFEMNKDisplForce()')
    with self.lock:
      self.pg.addFEMNKDisplForce(fields)
    return fields.id


  ## Adds a set of FEMNKDisplForce objects to the store.
  #
  # @param fieldsList  list of FEMNKDisplForceFields objects
  # @return list of newly assigned IDs
  def addFEMNKDisplForceList(self, fieldsList, current=None):
    logging.debug('addFEMNKDisplForceList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMNKDisplForceList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMNKDisplForce object proxy by its ID.
  #
  # @param id FEMNKDisplForce object ID
  # @return FEMNKDisplForce object proxy
  def getFEMNKDisplForce(self, id, current=None):
    logging.debug('getFEMNKDisplForce(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMNKDisplForce.has_key(id):
        logging.debug('Fetched FEMNKDisplForce[oid=%d] servant from cache', id)
        return self.registryFEMNKDisplForce[id]
      obj = FEMNKDisplForceI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMNKDisplForcePrx.uncheckedCast(srvt)
      self.registryFEMNKDisplForce[id] = prx
    logging.debug('Activated FEMNKDisplForce[oid=%d] servant', id)
    return prx

  ## Gets the FEMNKDisplForce object fields.
  #
  # @param id FEMNKDisplForce object ID
  # @return FEMNKDisplForceFields object
  def getFEMNKDisplForceFields(self, id, current=None):
    logging.debug('getFEMNKDisplForceFields(oid=%d)' % id)
    return self._getFEMNKDisplForceFields(id, current)

  ## Gets the FEMNKDisplForce object fields.
  #
  # @param id FEMNKDisplForce object ID
  # @return FEMNKDisplForceFields object
  def _getFEMNKDisplForceFields(self, id, current=None):
    fields = SenStore.FEMNKDisplForceFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMNKDisplForce(fields):
          return None
    return fields

  ## Sets the FEMNKDisplForce object fields.
  #
  # @param fields     FEMNKDisplForce fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMNKDisplForceFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMNKDisplForceFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMNKDisplForce(fields, fieldNames)

  ## Gets a list of IDs of all FEMNKDisplForce objects.
  #
  # @return ids list of FEMNKDisplForce object IDs
  def getFEMNKDisplForceIds(self, current=None):
    logging.debug('getFEMNKDisplForceList()')
    with self.lock:
      return self.pg.getFEMNKDisplForceIds()

  ## Gets a list of FEMNKDisplForce object proxies.
  #
  # @param ids list of FEMNKDisplForce object IDs
  # @return list of FEMNKDisplForce object proxies
  def getFEMNKDisplForceList(self, ids, current=None):
    logging.debug('getFEMNKDisplForceList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMNKDisplForce(id) for id in ids]

  ## Gets a list of FEMNKDisplForce fields objects.
  #
  # @param ids list of FEMNKDisplForce object IDs
  # @return list of FEMNKDisplForce fields objects
  def getFEMNKDisplForceFieldsList(self, ids, current=None):
    logging.debug('getFEMNKDisplForceFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMNKDisplForceFields(id) for id in ids]

  ## Gets a list of all FEMNKDisplForce object IDs.
  #
  # @param fields FEMNKDisplForce object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMNKDisplForce objects
  #
  def findEqualFEMNKDisplForce(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMNKDisplForce()')
    with self.lock:
      ids = self.pg.findEqualFEMNKDisplForce(fields, fieldNames)
    return ids

  ## Adds a FEMPlasticStrainStress object to the store.
  #
  # @param fields  FEMPlasticStrainStressFields object
  # @return newly assigned ID
  def addFEMPlasticStrainStress(self, fields, current=None):
    logging.debug('addFEMPlasticStrainStress()')
    with self.lock:
      self.pg.addFEMPlasticStrainStress(fields)
    return fields.id


  ## Adds a set of FEMPlasticStrainStress objects to the store.
  #
  # @param fieldsList  list of FEMPlasticStrainStressFields objects
  # @return list of newly assigned IDs
  def addFEMPlasticStrainStressList(self, fieldsList, current=None):
    logging.debug('addFEMPlasticStrainStressList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMPlasticStrainStressList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMPlasticStrainStress object proxy by its ID.
  #
  # @param id FEMPlasticStrainStress object ID
  # @return FEMPlasticStrainStress object proxy
  def getFEMPlasticStrainStress(self, id, current=None):
    logging.debug('getFEMPlasticStrainStress(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMPlasticStrainStress.has_key(id):
        logging.debug('Fetched FEMPlasticStrainStress[oid=%d] servant from cache', id)
        return self.registryFEMPlasticStrainStress[id]
      obj = FEMPlasticStrainStressI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMPlasticStrainStressPrx.uncheckedCast(srvt)
      self.registryFEMPlasticStrainStress[id] = prx
    logging.debug('Activated FEMPlasticStrainStress[oid=%d] servant', id)
    return prx

  ## Gets the FEMPlasticStrainStress object fields.
  #
  # @param id FEMPlasticStrainStress object ID
  # @return FEMPlasticStrainStressFields object
  def getFEMPlasticStrainStressFields(self, id, current=None):
    logging.debug('getFEMPlasticStrainStressFields(oid=%d)' % id)
    return self._getFEMPlasticStrainStressFields(id, current)

  ## Gets the FEMPlasticStrainStress object fields.
  #
  # @param id FEMPlasticStrainStress object ID
  # @return FEMPlasticStrainStressFields object
  def _getFEMPlasticStrainStressFields(self, id, current=None):
    fields = SenStore.FEMPlasticStrainStressFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMPlasticStrainStress(fields):
          return None
    return fields

  ## Sets the FEMPlasticStrainStress object fields.
  #
  # @param fields     FEMPlasticStrainStress fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMPlasticStrainStressFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMPlasticStrainStressFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMPlasticStrainStress(fields, fieldNames)

  ## Gets a list of IDs of all FEMPlasticStrainStress objects.
  #
  # @return ids list of FEMPlasticStrainStress object IDs
  def getFEMPlasticStrainStressIds(self, current=None):
    logging.debug('getFEMPlasticStrainStressList()')
    with self.lock:
      return self.pg.getFEMPlasticStrainStressIds()

  ## Gets a list of FEMPlasticStrainStress object proxies.
  #
  # @param ids list of FEMPlasticStrainStress object IDs
  # @return list of FEMPlasticStrainStress object proxies
  def getFEMPlasticStrainStressList(self, ids, current=None):
    logging.debug('getFEMPlasticStrainStressList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMPlasticStrainStress(id) for id in ids]

  ## Gets a list of FEMPlasticStrainStress fields objects.
  #
  # @param ids list of FEMPlasticStrainStress object IDs
  # @return list of FEMPlasticStrainStress fields objects
  def getFEMPlasticStrainStressFieldsList(self, ids, current=None):
    logging.debug('getFEMPlasticStrainStressFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMPlasticStrainStressFields(id) for id in ids]

  ## Gets a list of all FEMPlasticStrainStress object IDs.
  #
  # @param fields FEMPlasticStrainStress object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMPlasticStrainStress objects
  #
  def findEqualFEMPlasticStrainStress(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMPlasticStrainStress()')
    with self.lock:
      ids = self.pg.findEqualFEMPlasticStrainStress(fields, fieldNames)
    return ids

  ## Adds a FEMShellAxesOrthoData object to the store.
  #
  # @param fields  FEMShellAxesOrthoDataFields object
  # @return newly assigned ID
  def addFEMShellAxesOrthoData(self, fields, current=None):
    logging.debug('addFEMShellAxesOrthoData()')
    with self.lock:
      self.pg.addFEMShellAxesOrthoData(fields)
    return fields.id


  ## Adds a set of FEMShellAxesOrthoData objects to the store.
  #
  # @param fieldsList  list of FEMShellAxesOrthoDataFields objects
  # @return list of newly assigned IDs
  def addFEMShellAxesOrthoDataList(self, fieldsList, current=None):
    logging.debug('addFEMShellAxesOrthoDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellAxesOrthoDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellAxesOrthoData object proxy by its ID.
  #
  # @param id FEMShellAxesOrthoData object ID
  # @return FEMShellAxesOrthoData object proxy
  def getFEMShellAxesOrthoData(self, id, current=None):
    logging.debug('getFEMShellAxesOrthoData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellAxesOrthoData.has_key(id):
        logging.debug('Fetched FEMShellAxesOrthoData[oid=%d] servant from cache', id)
        return self.registryFEMShellAxesOrthoData[id]
      obj = FEMShellAxesOrthoDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellAxesOrthoDataPrx.uncheckedCast(srvt)
      self.registryFEMShellAxesOrthoData[id] = prx
    logging.debug('Activated FEMShellAxesOrthoData[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellAxesOrthoData object fields.
  #
  # @param id FEMShellAxesOrthoData object ID
  # @return FEMShellAxesOrthoDataFields object
  def getFEMShellAxesOrthoDataFields(self, id, current=None):
    logging.debug('getFEMShellAxesOrthoDataFields(oid=%d)' % id)
    return self._getFEMShellAxesOrthoDataFields(id, current)

  ## Gets the FEMShellAxesOrthoData object fields.
  #
  # @param id FEMShellAxesOrthoData object ID
  # @return FEMShellAxesOrthoDataFields object
  def _getFEMShellAxesOrthoDataFields(self, id, current=None):
    fields = SenStore.FEMShellAxesOrthoDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellAxesOrthoData(fields):
          return None
    return fields

  ## Sets the FEMShellAxesOrthoData object fields.
  #
  # @param fields     FEMShellAxesOrthoData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellAxesOrthoDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellAxesOrthoDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellAxesOrthoData(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellAxesOrthoData objects.
  #
  # @return ids list of FEMShellAxesOrthoData object IDs
  def getFEMShellAxesOrthoDataIds(self, current=None):
    logging.debug('getFEMShellAxesOrthoDataList()')
    with self.lock:
      return self.pg.getFEMShellAxesOrthoDataIds()

  ## Gets a list of FEMShellAxesOrthoData object proxies.
  #
  # @param ids list of FEMShellAxesOrthoData object IDs
  # @return list of FEMShellAxesOrthoData object proxies
  def getFEMShellAxesOrthoDataList(self, ids, current=None):
    logging.debug('getFEMShellAxesOrthoDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellAxesOrthoData(id) for id in ids]

  ## Gets a list of FEMShellAxesOrthoData fields objects.
  #
  # @param ids list of FEMShellAxesOrthoData object IDs
  # @return list of FEMShellAxesOrthoData fields objects
  def getFEMShellAxesOrthoDataFieldsList(self, ids, current=None):
    logging.debug('getFEMShellAxesOrthoDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellAxesOrthoDataFields(id) for id in ids]

  ## Gets a list of all FEMShellAxesOrthoData object IDs.
  #
  # @param fields FEMShellAxesOrthoData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellAxesOrthoData objects
  #
  def findEqualFEMShellAxesOrthoData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellAxesOrthoData()')
    with self.lock:
      ids = self.pg.findEqualFEMShellAxesOrthoData(fields, fieldNames)
    return ids

  ## Adds a FEMGeneralNode object to the store.
  #
  # @param fields  FEMGeneralNodeFields object
  # @return newly assigned ID
  def addFEMGeneralNode(self, fields, current=None):
    logging.debug('addFEMGeneralNode()')
    with self.lock:
      self.pg.addFEMGeneralNode(fields)
    return fields.id


  ## Adds a set of FEMGeneralNode objects to the store.
  #
  # @param fieldsList  list of FEMGeneralNodeFields objects
  # @return list of newly assigned IDs
  def addFEMGeneralNodeList(self, fieldsList, current=None):
    logging.debug('addFEMGeneralNodeList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMGeneralNodeList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMGeneralNode object proxy by its ID.
  #
  # @param id FEMGeneralNode object ID
  # @return FEMGeneralNode object proxy
  def getFEMGeneralNode(self, id, current=None):
    logging.debug('getFEMGeneralNode(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMGeneralNode.has_key(id):
        logging.debug('Fetched FEMGeneralNode[oid=%d] servant from cache', id)
        return self.registryFEMGeneralNode[id]
      obj = FEMGeneralNodeI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMGeneralNodePrx.uncheckedCast(srvt)
      self.registryFEMGeneralNode[id] = prx
    logging.debug('Activated FEMGeneralNode[oid=%d] servant', id)
    return prx

  ## Gets the FEMGeneralNode object fields.
  #
  # @param id FEMGeneralNode object ID
  # @return FEMGeneralNodeFields object
  def getFEMGeneralNodeFields(self, id, current=None):
    logging.debug('getFEMGeneralNodeFields(oid=%d)' % id)
    return self._getFEMGeneralNodeFields(id, current)

  ## Gets the FEMGeneralNode object fields.
  #
  # @param id FEMGeneralNode object ID
  # @return FEMGeneralNodeFields object
  def _getFEMGeneralNodeFields(self, id, current=None):
    fields = SenStore.FEMGeneralNodeFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMGeneralNode(fields):
          return None
    return fields

  ## Sets the FEMGeneralNode object fields.
  #
  # @param fields     FEMGeneralNode fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMGeneralNodeFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMGeneralNodeFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMGeneralNode(fields, fieldNames)

  ## Gets a list of IDs of all FEMGeneralNode objects.
  #
  # @return ids list of FEMGeneralNode object IDs
  def getFEMGeneralNodeIds(self, current=None):
    logging.debug('getFEMGeneralNodeList()')
    with self.lock:
      return self.pg.getFEMGeneralNodeIds()

  ## Gets a list of FEMGeneralNode object proxies.
  #
  # @param ids list of FEMGeneralNode object IDs
  # @return list of FEMGeneralNode object proxies
  def getFEMGeneralNodeList(self, ids, current=None):
    logging.debug('getFEMGeneralNodeList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMGeneralNode(id) for id in ids]

  ## Gets a list of FEMGeneralNode fields objects.
  #
  # @param ids list of FEMGeneralNode object IDs
  # @return list of FEMGeneralNode fields objects
  def getFEMGeneralNodeFieldsList(self, ids, current=None):
    logging.debug('getFEMGeneralNodeFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMGeneralNodeFields(id) for id in ids]

  ## Gets a list of all FEMGeneralNode object IDs.
  #
  # @param fields FEMGeneralNode object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMGeneralNode objects
  #
  def findEqualFEMGeneralNode(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMGeneralNode()')
    with self.lock:
      ids = self.pg.findEqualFEMGeneralNode(fields, fieldNames)
    return ids

  ## Adds a FEMStrLines object to the store.
  #
  # @param fields  FEMStrLinesFields object
  # @return newly assigned ID
  def addFEMStrLines(self, fields, current=None):
    logging.debug('addFEMStrLines()')
    with self.lock:
      self.pg.addFEMStrLines(fields)
    return fields.id


  ## Adds a set of FEMStrLines objects to the store.
  #
  # @param fieldsList  list of FEMStrLinesFields objects
  # @return list of newly assigned IDs
  def addFEMStrLinesList(self, fieldsList, current=None):
    logging.debug('addFEMStrLinesList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMStrLinesList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMStrLines object proxy by its ID.
  #
  # @param id FEMStrLines object ID
  # @return FEMStrLines object proxy
  def getFEMStrLines(self, id, current=None):
    logging.debug('getFEMStrLines(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMStrLines.has_key(id):
        logging.debug('Fetched FEMStrLines[oid=%d] servant from cache', id)
        return self.registryFEMStrLines[id]
      obj = FEMStrLinesI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMStrLinesPrx.uncheckedCast(srvt)
      self.registryFEMStrLines[id] = prx
    logging.debug('Activated FEMStrLines[oid=%d] servant', id)
    return prx

  ## Gets the FEMStrLines object fields.
  #
  # @param id FEMStrLines object ID
  # @return FEMStrLinesFields object
  def getFEMStrLinesFields(self, id, current=None):
    logging.debug('getFEMStrLinesFields(oid=%d)' % id)
    return self._getFEMStrLinesFields(id, current)

  ## Gets the FEMStrLines object fields.
  #
  # @param id FEMStrLines object ID
  # @return FEMStrLinesFields object
  def _getFEMStrLinesFields(self, id, current=None):
    fields = SenStore.FEMStrLinesFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMStrLines(fields):
          return None
    return fields

  ## Sets the FEMStrLines object fields.
  #
  # @param fields     FEMStrLines fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMStrLinesFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMStrLinesFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMStrLines(fields, fieldNames)

  ## Gets a list of IDs of all FEMStrLines objects.
  #
  # @return ids list of FEMStrLines object IDs
  def getFEMStrLinesIds(self, current=None):
    logging.debug('getFEMStrLinesList()')
    with self.lock:
      return self.pg.getFEMStrLinesIds()

  ## Gets a list of FEMStrLines object proxies.
  #
  # @param ids list of FEMStrLines object IDs
  # @return list of FEMStrLines object proxies
  def getFEMStrLinesList(self, ids, current=None):
    logging.debug('getFEMStrLinesList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMStrLines(id) for id in ids]

  ## Gets a list of FEMStrLines fields objects.
  #
  # @param ids list of FEMStrLines object IDs
  # @return list of FEMStrLines fields objects
  def getFEMStrLinesFieldsList(self, ids, current=None):
    logging.debug('getFEMStrLinesFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMStrLinesFields(id) for id in ids]

  ## Gets a list of all FEMStrLines object IDs.
  #
  # @param fields FEMStrLines object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMStrLines objects
  #
  def findEqualFEMStrLines(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMStrLines()')
    with self.lock:
      ids = self.pg.findEqualFEMStrLines(fields, fieldNames)
    return ids

  ## Adds a FEMContactSurface object to the store.
  #
  # @param fields  FEMContactSurfaceFields object
  # @return newly assigned ID
  def addFEMContactSurface(self, fields, current=None):
    logging.debug('addFEMContactSurface()')
    with self.lock:
      self.pg.addFEMContactSurface(fields)
    return fields.id


  ## Adds a set of FEMContactSurface objects to the store.
  #
  # @param fieldsList  list of FEMContactSurfaceFields objects
  # @return list of newly assigned IDs
  def addFEMContactSurfaceList(self, fieldsList, current=None):
    logging.debug('addFEMContactSurfaceList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMContactSurfaceList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMContactSurface object proxy by its ID.
  #
  # @param id FEMContactSurface object ID
  # @return FEMContactSurface object proxy
  def getFEMContactSurface(self, id, current=None):
    logging.debug('getFEMContactSurface(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMContactSurface.has_key(id):
        logging.debug('Fetched FEMContactSurface[oid=%d] servant from cache', id)
        return self.registryFEMContactSurface[id]
      obj = FEMContactSurfaceI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMContactSurfacePrx.uncheckedCast(srvt)
      self.registryFEMContactSurface[id] = prx
    logging.debug('Activated FEMContactSurface[oid=%d] servant', id)
    return prx

  ## Gets the FEMContactSurface object fields.
  #
  # @param id FEMContactSurface object ID
  # @return FEMContactSurfaceFields object
  def getFEMContactSurfaceFields(self, id, current=None):
    logging.debug('getFEMContactSurfaceFields(oid=%d)' % id)
    return self._getFEMContactSurfaceFields(id, current)

  ## Gets the FEMContactSurface object fields.
  #
  # @param id FEMContactSurface object ID
  # @return FEMContactSurfaceFields object
  def _getFEMContactSurfaceFields(self, id, current=None):
    fields = SenStore.FEMContactSurfaceFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMContactSurface(fields):
          return None
    return fields

  ## Sets the FEMContactSurface object fields.
  #
  # @param fields     FEMContactSurface fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMContactSurfaceFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMContactSurfaceFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMContactSurface(fields, fieldNames)

  ## Gets a list of IDs of all FEMContactSurface objects.
  #
  # @return ids list of FEMContactSurface object IDs
  def getFEMContactSurfaceIds(self, current=None):
    logging.debug('getFEMContactSurfaceList()')
    with self.lock:
      return self.pg.getFEMContactSurfaceIds()

  ## Gets a list of FEMContactSurface object proxies.
  #
  # @param ids list of FEMContactSurface object IDs
  # @return list of FEMContactSurface object proxies
  def getFEMContactSurfaceList(self, ids, current=None):
    logging.debug('getFEMContactSurfaceList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMContactSurface(id) for id in ids]

  ## Gets a list of FEMContactSurface fields objects.
  #
  # @param ids list of FEMContactSurface object IDs
  # @return list of FEMContactSurface fields objects
  def getFEMContactSurfaceFieldsList(self, ids, current=None):
    logging.debug('getFEMContactSurfaceFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMContactSurfaceFields(id) for id in ids]

  ## Gets a list of all FEMContactSurface object IDs.
  #
  # @param fields FEMContactSurface object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMContactSurface objects
  #
  def findEqualFEMContactSurface(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMContactSurface()')
    with self.lock:
      ids = self.pg.findEqualFEMContactSurface(fields, fieldNames)
    return ids

  ## Adds a FEMMCForceData object to the store.
  #
  # @param fields  FEMMCForceDataFields object
  # @return newly assigned ID
  def addFEMMCForceData(self, fields, current=None):
    logging.debug('addFEMMCForceData()')
    with self.lock:
      self.pg.addFEMMCForceData(fields)
    return fields.id


  ## Adds a set of FEMMCForceData objects to the store.
  #
  # @param fieldsList  list of FEMMCForceDataFields objects
  # @return list of newly assigned IDs
  def addFEMMCForceDataList(self, fieldsList, current=None):
    logging.debug('addFEMMCForceDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMMCForceDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMMCForceData object proxy by its ID.
  #
  # @param id FEMMCForceData object ID
  # @return FEMMCForceData object proxy
  def getFEMMCForceData(self, id, current=None):
    logging.debug('getFEMMCForceData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMMCForceData.has_key(id):
        logging.debug('Fetched FEMMCForceData[oid=%d] servant from cache', id)
        return self.registryFEMMCForceData[id]
      obj = FEMMCForceDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMMCForceDataPrx.uncheckedCast(srvt)
      self.registryFEMMCForceData[id] = prx
    logging.debug('Activated FEMMCForceData[oid=%d] servant', id)
    return prx

  ## Gets the FEMMCForceData object fields.
  #
  # @param id FEMMCForceData object ID
  # @return FEMMCForceDataFields object
  def getFEMMCForceDataFields(self, id, current=None):
    logging.debug('getFEMMCForceDataFields(oid=%d)' % id)
    return self._getFEMMCForceDataFields(id, current)

  ## Gets the FEMMCForceData object fields.
  #
  # @param id FEMMCForceData object ID
  # @return FEMMCForceDataFields object
  def _getFEMMCForceDataFields(self, id, current=None):
    fields = SenStore.FEMMCForceDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMMCForceData(fields):
          return None
    return fields

  ## Sets the FEMMCForceData object fields.
  #
  # @param fields     FEMMCForceData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMMCForceDataFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMMCForceDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMMCForceData(fields, fieldNames)

  ## Gets a list of IDs of all FEMMCForceData objects.
  #
  # @return ids list of FEMMCForceData object IDs
  def getFEMMCForceDataIds(self, current=None):
    logging.debug('getFEMMCForceDataList()')
    with self.lock:
      return self.pg.getFEMMCForceDataIds()

  ## Gets a list of FEMMCForceData object proxies.
  #
  # @param ids list of FEMMCForceData object IDs
  # @return list of FEMMCForceData object proxies
  def getFEMMCForceDataList(self, ids, current=None):
    logging.debug('getFEMMCForceDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMMCForceData(id) for id in ids]

  ## Gets a list of FEMMCForceData fields objects.
  #
  # @param ids list of FEMMCForceData object IDs
  # @return list of FEMMCForceData fields objects
  def getFEMMCForceDataFieldsList(self, ids, current=None):
    logging.debug('getFEMMCForceDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMMCForceDataFields(id) for id in ids]

  ## Gets a list of all FEMMCForceData object IDs.
  #
  # @param fields FEMMCForceData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMMCForceData objects
  #
  def findEqualFEMMCForceData(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMMCForceData()')
    with self.lock:
      ids = self.pg.findEqualFEMMCForceData(fields, fieldNames)
    return ids

  ## Adds a FEMSpring object to the store.
  #
  # @param fields  FEMSpringFields object
  # @return newly assigned ID
  def addFEMSpring(self, fields, current=None):
    logging.debug('addFEMSpring()')
    with self.lock:
      self.pg.addFEMSpring(fields)
    return fields.id


  ## Adds a set of FEMSpring objects to the store.
  #
  # @param fieldsList  list of FEMSpringFields objects
  # @return list of newly assigned IDs
  def addFEMSpringList(self, fieldsList, current=None):
    logging.debug('addFEMSpringList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSpringList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSpring object proxy by its ID.
  #
  # @param id FEMSpring object ID
  # @return FEMSpring object proxy
  def getFEMSpring(self, id, current=None):
    logging.debug('getFEMSpring(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSpring.has_key(id):
        logging.debug('Fetched FEMSpring[oid=%d] servant from cache', id)
        return self.registryFEMSpring[id]
      obj = FEMSpringI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSpringPrx.uncheckedCast(srvt)
      self.registryFEMSpring[id] = prx
    logging.debug('Activated FEMSpring[oid=%d] servant', id)
    return prx

  ## Gets the FEMSpring object fields.
  #
  # @param id FEMSpring object ID
  # @return FEMSpringFields object
  def getFEMSpringFields(self, id, current=None):
    logging.debug('getFEMSpringFields(oid=%d)' % id)
    return self._getFEMSpringFields(id, current)

  ## Gets the FEMSpring object fields.
  #
  # @param id FEMSpring object ID
  # @return FEMSpringFields object
  def _getFEMSpringFields(self, id, current=None):
    fields = SenStore.FEMSpringFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSpring(fields):
          return None
    return fields

  ## Sets the FEMSpring object fields.
  #
  # @param fields     FEMSpring fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSpringFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSpringFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSpring(fields, fieldNames)

  ## Gets a list of IDs of all FEMSpring objects.
  #
  # @return ids list of FEMSpring object IDs
  def getFEMSpringIds(self, current=None):
    logging.debug('getFEMSpringList()')
    with self.lock:
      return self.pg.getFEMSpringIds()

  ## Gets a list of FEMSpring object proxies.
  #
  # @param ids list of FEMSpring object IDs
  # @return list of FEMSpring object proxies
  def getFEMSpringList(self, ids, current=None):
    logging.debug('getFEMSpringList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSpring(id) for id in ids]

  ## Gets a list of FEMSpring fields objects.
  #
  # @param ids list of FEMSpring object IDs
  # @return list of FEMSpring fields objects
  def getFEMSpringFieldsList(self, ids, current=None):
    logging.debug('getFEMSpringFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSpringFields(id) for id in ids]

  ## Gets a list of all FEMSpring object IDs.
  #
  # @param fields FEMSpring object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSpring objects
  #
  def findEqualFEMSpring(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSpring()')
    with self.lock:
      ids = self.pg.findEqualFEMSpring(fields, fieldNames)
    return ids

  ## Adds a FEMSpringGroup object to the store.
  #
  # @param fields  FEMSpringGroupFields object
  # @return newly assigned ID
  def addFEMSpringGroup(self, fields, current=None):
    logging.debug('addFEMSpringGroup()')
    with self.lock:
      self.pg.addFEMSpringGroup(fields)
    return fields.id


  ## Adds a set of FEMSpringGroup objects to the store.
  #
  # @param fieldsList  list of FEMSpringGroupFields objects
  # @return list of newly assigned IDs
  def addFEMSpringGroupList(self, fieldsList, current=None):
    logging.debug('addFEMSpringGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMSpringGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMSpringGroup object proxy by its ID.
  #
  # @param id FEMSpringGroup object ID
  # @return FEMSpringGroup object proxy
  def getFEMSpringGroup(self, id, current=None):
    logging.debug('getFEMSpringGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMSpringGroup.has_key(id):
        logging.debug('Fetched FEMSpringGroup[oid=%d] servant from cache', id)
        return self.registryFEMSpringGroup[id]
      obj = FEMSpringGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMSpringGroupPrx.uncheckedCast(srvt)
      self.registryFEMSpringGroup[id] = prx
    logging.debug('Activated FEMSpringGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMSpringGroup object fields.
  #
  # @param id FEMSpringGroup object ID
  # @return FEMSpringGroupFields object
  def getFEMSpringGroupFields(self, id, current=None):
    logging.debug('getFEMSpringGroupFields(oid=%d)' % id)
    return self._getFEMSpringGroupFields(id, current)

  ## Gets the FEMSpringGroup object fields.
  #
  # @param id FEMSpringGroup object ID
  # @return FEMSpringGroupFields object
  def _getFEMSpringGroupFields(self, id, current=None):
    fields = SenStore.FEMSpringGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMSpringGroup(fields):
          return None
    return fields

  ## Sets the FEMSpringGroup object fields.
  #
  # @param fields     FEMSpringGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMSpringGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMSpringGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMSpringGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMSpringGroup objects.
  #
  # @return ids list of FEMSpringGroup object IDs
  def getFEMSpringGroupIds(self, current=None):
    logging.debug('getFEMSpringGroupList()')
    with self.lock:
      return self.pg.getFEMSpringGroupIds()

  ## Gets a list of FEMSpringGroup object proxies.
  #
  # @param ids list of FEMSpringGroup object IDs
  # @return list of FEMSpringGroup object proxies
  def getFEMSpringGroupList(self, ids, current=None):
    logging.debug('getFEMSpringGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMSpringGroup(id) for id in ids]

  ## Gets a list of FEMSpringGroup fields objects.
  #
  # @param ids list of FEMSpringGroup object IDs
  # @return list of FEMSpringGroup fields objects
  def getFEMSpringGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMSpringGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMSpringGroupFields(id) for id in ids]

  ## Gets a list of all FEMSpringGroup object IDs.
  #
  # @param fields FEMSpringGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMSpringGroup objects
  #
  def findEqualFEMSpringGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMSpringGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMSpringGroup(fields, fieldNames)
    return ids

  ## Adds a FEMShellGroup object to the store.
  #
  # @param fields  FEMShellGroupFields object
  # @return newly assigned ID
  def addFEMShellGroup(self, fields, current=None):
    logging.debug('addFEMShellGroup()')
    with self.lock:
      self.pg.addFEMShellGroup(fields)
    return fields.id


  ## Adds a set of FEMShellGroup objects to the store.
  #
  # @param fieldsList  list of FEMShellGroupFields objects
  # @return list of newly assigned IDs
  def addFEMShellGroupList(self, fieldsList, current=None):
    logging.debug('addFEMShellGroupList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addFEMShellGroupList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a FEMShellGroup object proxy by its ID.
  #
  # @param id FEMShellGroup object ID
  # @return FEMShellGroup object proxy
  def getFEMShellGroup(self, id, current=None):
    logging.debug('getFEMShellGroup(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryFEMShellGroup.has_key(id):
        logging.debug('Fetched FEMShellGroup[oid=%d] servant from cache', id)
        return self.registryFEMShellGroup[id]
      obj = FEMShellGroupI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.FEMShellGroupPrx.uncheckedCast(srvt)
      self.registryFEMShellGroup[id] = prx
    logging.debug('Activated FEMShellGroup[oid=%d] servant', id)
    return prx

  ## Gets the FEMShellGroup object fields.
  #
  # @param id FEMShellGroup object ID
  # @return FEMShellGroupFields object
  def getFEMShellGroupFields(self, id, current=None):
    logging.debug('getFEMShellGroupFields(oid=%d)' % id)
    return self._getFEMShellGroupFields(id, current)

  ## Gets the FEMShellGroup object fields.
  #
  # @param id FEMShellGroup object ID
  # @return FEMShellGroupFields object
  def _getFEMShellGroupFields(self, id, current=None):
    fields = SenStore.FEMShellGroupFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getFEMShellGroup(fields):
          return None
    return fields

  ## Sets the FEMShellGroup object fields.
  #
  # @param fields     FEMShellGroup fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setFEMShellGroupFields(self, fields, fieldNames, current=None):
    logging.debug('setFEMShellGroupFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setFEMShellGroup(fields, fieldNames)

  ## Gets a list of IDs of all FEMShellGroup objects.
  #
  # @return ids list of FEMShellGroup object IDs
  def getFEMShellGroupIds(self, current=None):
    logging.debug('getFEMShellGroupList()')
    with self.lock:
      return self.pg.getFEMShellGroupIds()

  ## Gets a list of FEMShellGroup object proxies.
  #
  # @param ids list of FEMShellGroup object IDs
  # @return list of FEMShellGroup object proxies
  def getFEMShellGroupList(self, ids, current=None):
    logging.debug('getFEMShellGroupList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getFEMShellGroup(id) for id in ids]

  ## Gets a list of FEMShellGroup fields objects.
  #
  # @param ids list of FEMShellGroup object IDs
  # @return list of FEMShellGroup fields objects
  def getFEMShellGroupFieldsList(self, ids, current=None):
    logging.debug('getFEMShellGroupFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getFEMShellGroupFields(id) for id in ids]

  ## Gets a list of all FEMShellGroup object IDs.
  #
  # @param fields FEMShellGroup object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching FEMShellGroup objects
  #
  def findEqualFEMShellGroup(self, fields, fieldNames, current=None):
    logging.debug('findEqualFEMShellGroup()')
    with self.lock:
      ids = self.pg.findEqualFEMShellGroup(fields, fieldNames)
    return ids

  ## Adds a DaqUnit object to the store.
  #
  # @param fields  DaqUnitFields object
  # @return newly assigned ID
  def addDaqUnit(self, fields, current=None):
    logging.debug('addDaqUnit()')
    with self.lock:
      self.pg.addDaqUnit(fields)
    return fields.id


  ## Adds a set of DaqUnit objects to the store.
  #
  # @param fieldsList  list of DaqUnitFields objects
  # @return list of newly assigned IDs
  def addDaqUnitList(self, fieldsList, current=None):
    logging.debug('addDaqUnitList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addDaqUnitList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a DaqUnit object proxy by its ID.
  #
  # @param id DaqUnit object ID
  # @return DaqUnit object proxy
  def getDaqUnit(self, id, current=None):
    logging.debug('getDaqUnit(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryDaqUnit.has_key(id):
        logging.debug('Fetched DaqUnit[oid=%d] servant from cache', id)
        return self.registryDaqUnit[id]
      obj = DaqUnitI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.DaqUnitPrx.uncheckedCast(srvt)
      self.registryDaqUnit[id] = prx
    logging.debug('Activated DaqUnit[oid=%d] servant', id)
    return prx

  ## Gets the DaqUnit object fields.
  #
  # @param id DaqUnit object ID
  # @return DaqUnitFields object
  def getDaqUnitFields(self, id, current=None):
    logging.debug('getDaqUnitFields(oid=%d)' % id)
    return self._getDaqUnitFields(id, current)

  ## Gets the DaqUnit object fields.
  #
  # @param id DaqUnit object ID
  # @return DaqUnitFields object
  def _getDaqUnitFields(self, id, current=None):
    fields = SenStore.DaqUnitFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getDaqUnit(fields):
          return None
    return fields

  ## Sets the DaqUnit object fields.
  #
  # @param fields     DaqUnit fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setDaqUnitFields(self, fields, fieldNames, current=None):
    logging.debug('setDaqUnitFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setDaqUnit(fields, fieldNames)

  ## Gets a list of IDs of all DaqUnit objects.
  #
  # @return ids list of DaqUnit object IDs
  def getDaqUnitIds(self, current=None):
    logging.debug('getDaqUnitList()')
    with self.lock:
      return self.pg.getDaqUnitIds()

  ## Gets a list of DaqUnit object proxies.
  #
  # @param ids list of DaqUnit object IDs
  # @return list of DaqUnit object proxies
  def getDaqUnitList(self, ids, current=None):
    logging.debug('getDaqUnitList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getDaqUnit(id) for id in ids]

  ## Gets a list of DaqUnit fields objects.
  #
  # @param ids list of DaqUnit object IDs
  # @return list of DaqUnit fields objects
  def getDaqUnitFieldsList(self, ids, current=None):
    logging.debug('getDaqUnitFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getDaqUnitFields(id) for id in ids]

  ## Gets a list of all DaqUnit object IDs.
  #
  # @param fields DaqUnit object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching DaqUnit objects
  #
  def findEqualDaqUnit(self, fields, fieldNames, current=None):
    logging.debug('findEqualDaqUnit()')
    with self.lock:
      ids = self.pg.findEqualDaqUnit(fields, fieldNames)
    return ids

  ## Adds a DaqUnitChannel object to the store.
  #
  # @param fields  DaqUnitChannelFields object
  # @return newly assigned ID
  def addDaqUnitChannel(self, fields, current=None):
    logging.debug('addDaqUnitChannel()')
    with self.lock:
      self.pg.addDaqUnitChannel(fields)
    return fields.id


  ## Adds a set of DaqUnitChannel objects to the store.
  #
  # @param fieldsList  list of DaqUnitChannelFields objects
  # @return list of newly assigned IDs
  def addDaqUnitChannelList(self, fieldsList, current=None):
    logging.debug('addDaqUnitChannelList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addDaqUnitChannelList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a DaqUnitChannel object proxy by its ID.
  #
  # @param id DaqUnitChannel object ID
  # @return DaqUnitChannel object proxy
  def getDaqUnitChannel(self, id, current=None):
    logging.debug('getDaqUnitChannel(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryDaqUnitChannel.has_key(id):
        logging.debug('Fetched DaqUnitChannel[oid=%d] servant from cache', id)
        return self.registryDaqUnitChannel[id]
      obj = DaqUnitChannelI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.DaqUnitChannelPrx.uncheckedCast(srvt)
      self.registryDaqUnitChannel[id] = prx
    logging.debug('Activated DaqUnitChannel[oid=%d] servant', id)
    return prx

  ## Gets the DaqUnitChannel object fields.
  #
  # @param id DaqUnitChannel object ID
  # @return DaqUnitChannelFields object
  def getDaqUnitChannelFields(self, id, current=None):
    logging.debug('getDaqUnitChannelFields(oid=%d)' % id)
    return self._getDaqUnitChannelFields(id, current)

  ## Gets the DaqUnitChannel object fields.
  #
  # @param id DaqUnitChannel object ID
  # @return DaqUnitChannelFields object
  def _getDaqUnitChannelFields(self, id, current=None):
    fields = SenStore.DaqUnitChannelFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getDaqUnitChannel(fields):
          return None
    return fields

  ## Sets the DaqUnitChannel object fields.
  #
  # @param fields     DaqUnitChannel fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setDaqUnitChannelFields(self, fields, fieldNames, current=None):
    logging.debug('setDaqUnitChannelFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setDaqUnitChannel(fields, fieldNames)

  ## Gets a list of IDs of all DaqUnitChannel objects.
  #
  # @return ids list of DaqUnitChannel object IDs
  def getDaqUnitChannelIds(self, current=None):
    logging.debug('getDaqUnitChannelList()')
    with self.lock:
      return self.pg.getDaqUnitChannelIds()

  ## Gets a list of DaqUnitChannel object proxies.
  #
  # @param ids list of DaqUnitChannel object IDs
  # @return list of DaqUnitChannel object proxies
  def getDaqUnitChannelList(self, ids, current=None):
    logging.debug('getDaqUnitChannelList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getDaqUnitChannel(id) for id in ids]

  ## Gets a list of DaqUnitChannel fields objects.
  #
  # @param ids list of DaqUnitChannel object IDs
  # @return list of DaqUnitChannel fields objects
  def getDaqUnitChannelFieldsList(self, ids, current=None):
    logging.debug('getDaqUnitChannelFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getDaqUnitChannelFields(id) for id in ids]

  ## Gets a list of all DaqUnitChannel object IDs.
  #
  # @param fields DaqUnitChannel object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching DaqUnitChannel objects
  #
  def findEqualDaqUnitChannel(self, fields, fieldNames, current=None):
    logging.debug('findEqualDaqUnitChannel()')
    with self.lock:
      ids = self.pg.findEqualDaqUnitChannel(fields, fieldNames)
    return ids

  ## Adds a Sensor object to the store.
  #
  # @param fields  SensorFields object
  # @return newly assigned ID
  def addSensor(self, fields, current=None):
    logging.debug('addSensor()')
    with self.lock:
      self.pg.addSensor(fields)
    return fields.id


  ## Adds a set of Sensor objects to the store.
  #
  # @param fieldsList  list of SensorFields objects
  # @return list of newly assigned IDs
  def addSensorList(self, fieldsList, current=None):
    logging.debug('addSensorList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addSensorList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a Sensor object proxy by its ID.
  #
  # @param id Sensor object ID
  # @return Sensor object proxy
  def getSensor(self, id, current=None):
    logging.debug('getSensor(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registrySensor.has_key(id):
        logging.debug('Fetched Sensor[oid=%d] servant from cache', id)
        return self.registrySensor[id]
      obj = SensorI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.SensorPrx.uncheckedCast(srvt)
      self.registrySensor[id] = prx
    logging.debug('Activated Sensor[oid=%d] servant', id)
    return prx

  ## Gets the Sensor object fields.
  #
  # @param id Sensor object ID
  # @return SensorFields object
  def getSensorFields(self, id, current=None):
    logging.debug('getSensorFields(oid=%d)' % id)
    return self._getSensorFields(id, current)

  ## Gets the Sensor object fields.
  #
  # @param id Sensor object ID
  # @return SensorFields object
  def _getSensorFields(self, id, current=None):
    fields = SenStore.SensorFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getSensor(fields):
          return None
    return fields

  ## Sets the Sensor object fields.
  #
  # @param fields     Sensor fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setSensorFields(self, fields, fieldNames, current=None):
    logging.debug('setSensorFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setSensor(fields, fieldNames)

  ## Gets a list of IDs of all Sensor objects.
  #
  # @return ids list of Sensor object IDs
  def getSensorIds(self, current=None):
    logging.debug('getSensorList()')
    with self.lock:
      return self.pg.getSensorIds()

  ## Gets a list of Sensor object proxies.
  #
  # @param ids list of Sensor object IDs
  # @return list of Sensor object proxies
  def getSensorList(self, ids, current=None):
    logging.debug('getSensorList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getSensor(id) for id in ids]

  ## Gets a list of Sensor fields objects.
  #
  # @param ids list of Sensor object IDs
  # @return list of Sensor fields objects
  def getSensorFieldsList(self, ids, current=None):
    logging.debug('getSensorFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getSensorFields(id) for id in ids]

  ## Gets a list of all Sensor object IDs.
  #
  # @param fields Sensor object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching Sensor objects
  #
  def findEqualSensor(self, fields, fieldNames, current=None):
    logging.debug('findEqualSensor()')
    with self.lock:
      ids = self.pg.findEqualSensor(fields, fieldNames)
    return ids

  ## Adds a Transducer object to the store.
  #
  # @param fields  TransducerFields object
  # @return newly assigned ID
  def addTransducer(self, fields, current=None):
    logging.debug('addTransducer()')
    with self.lock:
      self.pg.addTransducer(fields)
    return fields.id


  ## Adds a set of Transducer objects to the store.
  #
  # @param fieldsList  list of TransducerFields objects
  # @return list of newly assigned IDs
  def addTransducerList(self, fieldsList, current=None):
    logging.debug('addTransducerList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addTransducerList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a Transducer object proxy by its ID.
  #
  # @param id Transducer object ID
  # @return Transducer object proxy
  def getTransducer(self, id, current=None):
    logging.debug('getTransducer(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryTransducer.has_key(id):
        logging.debug('Fetched Transducer[oid=%d] servant from cache', id)
        return self.registryTransducer[id]
      obj = TransducerI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.TransducerPrx.uncheckedCast(srvt)
      self.registryTransducer[id] = prx
    logging.debug('Activated Transducer[oid=%d] servant', id)
    return prx

  ## Gets the Transducer object fields.
  #
  # @param id Transducer object ID
  # @return TransducerFields object
  def getTransducerFields(self, id, current=None):
    logging.debug('getTransducerFields(oid=%d)' % id)
    return self._getTransducerFields(id, current)

  ## Gets the Transducer object fields.
  #
  # @param id Transducer object ID
  # @return TransducerFields object
  def _getTransducerFields(self, id, current=None):
    fields = SenStore.TransducerFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getTransducer(fields):
          return None
    return fields

  ## Sets the Transducer object fields.
  #
  # @param fields     Transducer fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setTransducerFields(self, fields, fieldNames, current=None):
    logging.debug('setTransducerFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setTransducer(fields, fieldNames)

  ## Gets a list of IDs of all Transducer objects.
  #
  # @return ids list of Transducer object IDs
  def getTransducerIds(self, current=None):
    logging.debug('getTransducerList()')
    with self.lock:
      return self.pg.getTransducerIds()

  ## Gets a list of Transducer object proxies.
  #
  # @param ids list of Transducer object IDs
  # @return list of Transducer object proxies
  def getTransducerList(self, ids, current=None):
    logging.debug('getTransducerList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getTransducer(id) for id in ids]

  ## Gets a list of Transducer fields objects.
  #
  # @param ids list of Transducer object IDs
  # @return list of Transducer fields objects
  def getTransducerFieldsList(self, ids, current=None):
    logging.debug('getTransducerFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getTransducerFields(id) for id in ids]

  ## Gets a list of all Transducer object IDs.
  #
  # @param fields Transducer object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching Transducer objects
  #
  def findEqualTransducer(self, fields, fieldNames, current=None):
    logging.debug('findEqualTransducer()')
    with self.lock:
      ids = self.pg.findEqualTransducer(fields, fieldNames)
    return ids

  ## Adds a Experiment object to the store.
  #
  # @param fields  ExperimentFields object
  # @return newly assigned ID
  def addExperiment(self, fields, current=None):
    logging.debug('addExperiment()')
    with self.lock:
      self.pg.addExperiment(fields)
    return fields.id


  ## Adds a set of Experiment objects to the store.
  #
  # @param fieldsList  list of ExperimentFields objects
  # @return list of newly assigned IDs
  def addExperimentList(self, fieldsList, current=None):
    logging.debug('addExperimentList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addExperimentList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a Experiment object proxy by its ID.
  #
  # @param id Experiment object ID
  # @return Experiment object proxy
  def getExperiment(self, id, current=None):
    logging.debug('getExperiment(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryExperiment.has_key(id):
        logging.debug('Fetched Experiment[oid=%d] servant from cache', id)
        return self.registryExperiment[id]
      obj = ExperimentI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.ExperimentPrx.uncheckedCast(srvt)
      self.registryExperiment[id] = prx
    logging.debug('Activated Experiment[oid=%d] servant', id)
    return prx

  ## Gets the Experiment object fields.
  #
  # @param id Experiment object ID
  # @return ExperimentFields object
  def getExperimentFields(self, id, current=None):
    logging.debug('getExperimentFields(oid=%d)' % id)
    return self._getExperimentFields(id, current)

  ## Gets the Experiment object fields.
  #
  # @param id Experiment object ID
  # @return ExperimentFields object
  def _getExperimentFields(self, id, current=None):
    fields = SenStore.ExperimentFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getExperiment(fields):
          return None
    return fields

  ## Sets the Experiment object fields.
  #
  # @param fields     Experiment fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setExperimentFields(self, fields, fieldNames, current=None):
    logging.debug('setExperimentFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setExperiment(fields, fieldNames)

  ## Gets a list of IDs of all Experiment objects.
  #
  # @return ids list of Experiment object IDs
  def getExperimentIds(self, current=None):
    logging.debug('getExperimentList()')
    with self.lock:
      return self.pg.getExperimentIds()

  ## Gets a list of Experiment object proxies.
  #
  # @param ids list of Experiment object IDs
  # @return list of Experiment object proxies
  def getExperimentList(self, ids, current=None):
    logging.debug('getExperimentList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getExperiment(id) for id in ids]

  ## Gets a list of Experiment fields objects.
  #
  # @param ids list of Experiment object IDs
  # @return list of Experiment fields objects
  def getExperimentFieldsList(self, ids, current=None):
    logging.debug('getExperimentFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getExperimentFields(id) for id in ids]

  ## Gets a list of all Experiment object IDs.
  #
  # @param fields Experiment object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching Experiment objects
  #
  def findEqualExperiment(self, fields, fieldNames, current=None):
    logging.debug('findEqualExperiment()')
    with self.lock:
      ids = self.pg.findEqualExperiment(fields, fieldNames)
    return ids

  ## Adds a Cycle object to the store.
  #
  # @param fields  CycleFields object
  # @return newly assigned ID
  def addCycle(self, fields, current=None):
    logging.debug('addCycle()')
    with self.lock:
      self.pg.addCycle(fields)
    return fields.id


  ## Adds a set of Cycle objects to the store.
  #
  # @param fieldsList  list of CycleFields objects
  # @return list of newly assigned IDs
  def addCycleList(self, fieldsList, current=None):
    logging.debug('addCycleList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addCycleList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a Cycle object proxy by its ID.
  #
  # @param id Cycle object ID
  # @return Cycle object proxy
  def getCycle(self, id, current=None):
    logging.debug('getCycle(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryCycle.has_key(id):
        logging.debug('Fetched Cycle[oid=%d] servant from cache', id)
        return self.registryCycle[id]
      obj = CycleI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.CyclePrx.uncheckedCast(srvt)
      self.registryCycle[id] = prx
    logging.debug('Activated Cycle[oid=%d] servant', id)
    return prx

  ## Gets the Cycle object fields.
  #
  # @param id Cycle object ID
  # @return CycleFields object
  def getCycleFields(self, id, current=None):
    logging.debug('getCycleFields(oid=%d)' % id)
    return self._getCycleFields(id, current)

  ## Gets the Cycle object fields.
  #
  # @param id Cycle object ID
  # @return CycleFields object
  def _getCycleFields(self, id, current=None):
    fields = SenStore.CycleFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getCycle(fields):
          return None
    return fields

  ## Sets the Cycle object fields.
  #
  # @param fields     Cycle fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setCycleFields(self, fields, fieldNames, current=None):
    logging.debug('setCycleFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setCycle(fields, fieldNames)

  ## Gets a list of IDs of all Cycle objects.
  #
  # @return ids list of Cycle object IDs
  def getCycleIds(self, current=None):
    logging.debug('getCycleList()')
    with self.lock:
      return self.pg.getCycleIds()

  ## Gets a list of Cycle object proxies.
  #
  # @param ids list of Cycle object IDs
  # @return list of Cycle object proxies
  def getCycleList(self, ids, current=None):
    logging.debug('getCycleList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getCycle(id) for id in ids]

  ## Gets a list of Cycle fields objects.
  #
  # @param ids list of Cycle object IDs
  # @return list of Cycle fields objects
  def getCycleFieldsList(self, ids, current=None):
    logging.debug('getCycleFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getCycleFields(id) for id in ids]

  ## Gets a list of all Cycle object IDs.
  #
  # @param fields Cycle object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching Cycle objects
  #
  def findEqualCycle(self, fields, fieldNames, current=None):
    logging.debug('findEqualCycle()')
    with self.lock:
      ids = self.pg.findEqualCycle(fields, fieldNames)
    return ids

  ## Adds a SensorTimeData object to the store.
  #
  # @param fields  SensorTimeDataFields object
  # @return newly assigned ID
  def addSensorTimeData(self, fields, current=None):
    logging.debug('addSensorTimeData()')
    with self.lock:
      self.pg.addSensorTimeData(fields)
    return fields.id


  ## Adds a set of SensorTimeData objects to the store.
  #
  # @param fieldsList  list of SensorTimeDataFields objects
  # @return list of newly assigned IDs
  def addSensorTimeDataList(self, fieldsList, current=None):
    logging.debug('addSensorTimeDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addSensorTimeDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a SensorTimeData object proxy by its ID.
  #
  # @param id SensorTimeData object ID
  # @return SensorTimeData object proxy
  def getSensorTimeData(self, id, current=None):
    logging.debug('getSensorTimeData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registrySensorTimeData.has_key(id):
        logging.debug('Fetched SensorTimeData[oid=%d] servant from cache', id)
        return self.registrySensorTimeData[id]
      obj = SensorTimeDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.SensorTimeDataPrx.uncheckedCast(srvt)
      self.registrySensorTimeData[id] = prx
    logging.debug('Activated SensorTimeData[oid=%d] servant', id)
    return prx

  ## Gets the SensorTimeData object fields.
  #
  # @param id SensorTimeData object ID
  # @return SensorTimeDataFields object
  def getSensorTimeDataFields(self, id, current=None):
    logging.debug('getSensorTimeDataFields(oid=%d)' % id)
    return self._getSensorTimeDataFields(id, current)

  ## Gets the SensorTimeData object fields.
  #
  # @param id SensorTimeData object ID
  # @return SensorTimeDataFields object
  def _getSensorTimeDataFields(self, id, current=None):
    fields = SenStore.SensorTimeDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getSensorTimeData(fields):
          return None
    return fields

  ## Sets the SensorTimeData object fields.
  #
  # @param fields     SensorTimeData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setSensorTimeDataFields(self, fields, fieldNames, current=None):
    logging.debug('setSensorTimeDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setSensorTimeData(fields, fieldNames)

  ## Gets a list of IDs of all SensorTimeData objects.
  #
  # @return ids list of SensorTimeData object IDs
  def getSensorTimeDataIds(self, current=None):
    logging.debug('getSensorTimeDataList()')
    with self.lock:
      return self.pg.getSensorTimeDataIds()

  ## Gets a list of SensorTimeData object proxies.
  #
  # @param ids list of SensorTimeData object IDs
  # @return list of SensorTimeData object proxies
  def getSensorTimeDataList(self, ids, current=None):
    logging.debug('getSensorTimeDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getSensorTimeData(id) for id in ids]

  ## Gets a list of SensorTimeData fields objects.
  #
  # @param ids list of SensorTimeData object IDs
  # @return list of SensorTimeData fields objects
  def getSensorTimeDataFieldsList(self, ids, current=None):
    logging.debug('getSensorTimeDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getSensorTimeDataFields(id) for id in ids]

  ## Gets a list of all SensorTimeData object IDs.
  #
  # @param fields SensorTimeData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching SensorTimeData objects
  #
  def findEqualSensorTimeData(self, fields, fieldNames, current=None):
    logging.debug('findEqualSensorTimeData()')
    with self.lock:
      ids = self.pg.findEqualSensorTimeData(fields, fieldNames)
    return ids

  ## Adds a TransducerTimeData object to the store.
  #
  # @param fields  TransducerTimeDataFields object
  # @return newly assigned ID
  def addTransducerTimeData(self, fields, current=None):
    logging.debug('addTransducerTimeData()')
    with self.lock:
      self.pg.addTransducerTimeData(fields)
    return fields.id


  ## Adds a set of TransducerTimeData objects to the store.
  #
  # @param fieldsList  list of TransducerTimeDataFields objects
  # @return list of newly assigned IDs
  def addTransducerTimeDataList(self, fieldsList, current=None):
    logging.debug('addTransducerTimeDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addTransducerTimeDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a TransducerTimeData object proxy by its ID.
  #
  # @param id TransducerTimeData object ID
  # @return TransducerTimeData object proxy
  def getTransducerTimeData(self, id, current=None):
    logging.debug('getTransducerTimeData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryTransducerTimeData.has_key(id):
        logging.debug('Fetched TransducerTimeData[oid=%d] servant from cache', id)
        return self.registryTransducerTimeData[id]
      obj = TransducerTimeDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.TransducerTimeDataPrx.uncheckedCast(srvt)
      self.registryTransducerTimeData[id] = prx
    logging.debug('Activated TransducerTimeData[oid=%d] servant', id)
    return prx

  ## Gets the TransducerTimeData object fields.
  #
  # @param id TransducerTimeData object ID
  # @return TransducerTimeDataFields object
  def getTransducerTimeDataFields(self, id, current=None):
    logging.debug('getTransducerTimeDataFields(oid=%d)' % id)
    return self._getTransducerTimeDataFields(id, current)

  ## Gets the TransducerTimeData object fields.
  #
  # @param id TransducerTimeData object ID
  # @return TransducerTimeDataFields object
  def _getTransducerTimeDataFields(self, id, current=None):
    fields = SenStore.TransducerTimeDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getTransducerTimeData(fields):
          return None
    return fields

  ## Sets the TransducerTimeData object fields.
  #
  # @param fields     TransducerTimeData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setTransducerTimeDataFields(self, fields, fieldNames, current=None):
    logging.debug('setTransducerTimeDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setTransducerTimeData(fields, fieldNames)

  ## Gets a list of IDs of all TransducerTimeData objects.
  #
  # @return ids list of TransducerTimeData object IDs
  def getTransducerTimeDataIds(self, current=None):
    logging.debug('getTransducerTimeDataList()')
    with self.lock:
      return self.pg.getTransducerTimeDataIds()

  ## Gets a list of TransducerTimeData object proxies.
  #
  # @param ids list of TransducerTimeData object IDs
  # @return list of TransducerTimeData object proxies
  def getTransducerTimeDataList(self, ids, current=None):
    logging.debug('getTransducerTimeDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getTransducerTimeData(id) for id in ids]

  ## Gets a list of TransducerTimeData fields objects.
  #
  # @param ids list of TransducerTimeData object IDs
  # @return list of TransducerTimeData fields objects
  def getTransducerTimeDataFieldsList(self, ids, current=None):
    logging.debug('getTransducerTimeDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getTransducerTimeDataFields(id) for id in ids]

  ## Gets a list of all TransducerTimeData object IDs.
  #
  # @param fields TransducerTimeData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching TransducerTimeData objects
  #
  def findEqualTransducerTimeData(self, fields, fieldNames, current=None):
    logging.debug('findEqualTransducerTimeData()')
    with self.lock:
      ids = self.pg.findEqualTransducerTimeData(fields, fieldNames)
    return ids

  ## Adds a ExperimentStructureData object to the store.
  #
  # @param fields  ExperimentStructureDataFields object
  # @return newly assigned ID
  def addExperimentStructureData(self, fields, current=None):
    logging.debug('addExperimentStructureData()')
    with self.lock:
      self.pg.addExperimentStructureData(fields)
    return fields.id


  ## Adds a set of ExperimentStructureData objects to the store.
  #
  # @param fieldsList  list of ExperimentStructureDataFields objects
  # @return list of newly assigned IDs
  def addExperimentStructureDataList(self, fieldsList, current=None):
    logging.debug('addExperimentStructureDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addExperimentStructureDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a ExperimentStructureData object proxy by its ID.
  #
  # @param id ExperimentStructureData object ID
  # @return ExperimentStructureData object proxy
  def getExperimentStructureData(self, id, current=None):
    logging.debug('getExperimentStructureData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryExperimentStructureData.has_key(id):
        logging.debug('Fetched ExperimentStructureData[oid=%d] servant from cache', id)
        return self.registryExperimentStructureData[id]
      obj = ExperimentStructureDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.ExperimentStructureDataPrx.uncheckedCast(srvt)
      self.registryExperimentStructureData[id] = prx
    logging.debug('Activated ExperimentStructureData[oid=%d] servant', id)
    return prx

  ## Gets the ExperimentStructureData object fields.
  #
  # @param id ExperimentStructureData object ID
  # @return ExperimentStructureDataFields object
  def getExperimentStructureDataFields(self, id, current=None):
    logging.debug('getExperimentStructureDataFields(oid=%d)' % id)
    return self._getExperimentStructureDataFields(id, current)

  ## Gets the ExperimentStructureData object fields.
  #
  # @param id ExperimentStructureData object ID
  # @return ExperimentStructureDataFields object
  def _getExperimentStructureDataFields(self, id, current=None):
    fields = SenStore.ExperimentStructureDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getExperimentStructureData(fields):
          return None
    return fields

  ## Sets the ExperimentStructureData object fields.
  #
  # @param fields     ExperimentStructureData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setExperimentStructureDataFields(self, fields, fieldNames, current=None):
    logging.debug('setExperimentStructureDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setExperimentStructureData(fields, fieldNames)

  ## Gets a list of IDs of all ExperimentStructureData objects.
  #
  # @return ids list of ExperimentStructureData object IDs
  def getExperimentStructureDataIds(self, current=None):
    logging.debug('getExperimentStructureDataList()')
    with self.lock:
      return self.pg.getExperimentStructureDataIds()

  ## Gets a list of ExperimentStructureData object proxies.
  #
  # @param ids list of ExperimentStructureData object IDs
  # @return list of ExperimentStructureData object proxies
  def getExperimentStructureDataList(self, ids, current=None):
    logging.debug('getExperimentStructureDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getExperimentStructureData(id) for id in ids]

  ## Gets a list of ExperimentStructureData fields objects.
  #
  # @param ids list of ExperimentStructureData object IDs
  # @return list of ExperimentStructureData fields objects
  def getExperimentStructureDataFieldsList(self, ids, current=None):
    logging.debug('getExperimentStructureDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getExperimentStructureDataFields(id) for id in ids]

  ## Gets a list of all ExperimentStructureData object IDs.
  #
  # @param fields ExperimentStructureData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching ExperimentStructureData objects
  #
  def findEqualExperimentStructureData(self, fields, fieldNames, current=None):
    logging.debug('findEqualExperimentStructureData()')
    with self.lock:
      ids = self.pg.findEqualExperimentStructureData(fields, fieldNames)
    return ids

  ## Adds a TransducerCycleData object to the store.
  #
  # @param fields  TransducerCycleDataFields object
  # @return newly assigned ID
  def addTransducerCycleData(self, fields, current=None):
    logging.debug('addTransducerCycleData()')
    with self.lock:
      self.pg.addTransducerCycleData(fields)
    return fields.id


  ## Adds a set of TransducerCycleData objects to the store.
  #
  # @param fieldsList  list of TransducerCycleDataFields objects
  # @return list of newly assigned IDs
  def addTransducerCycleDataList(self, fieldsList, current=None):
    logging.debug('addTransducerCycleDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addTransducerCycleDataList(fieldsList)
      for fields in fieldsList:
        ids.append(fields.id)
    return ids


  ## Gets a TransducerCycleData object proxy by its ID.
  #
  # @param id TransducerCycleData object ID
  # @return TransducerCycleData object proxy
  def getTransducerCycleData(self, id, current=None):
    logging.debug('getTransducerCycleData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryTransducerCycleData.has_key(id):
        logging.debug('Fetched TransducerCycleData[oid=%d] servant from cache', id)
        return self.registryTransducerCycleData[id]
      obj = TransducerCycleDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.TransducerCycleDataPrx.uncheckedCast(srvt)
      self.registryTransducerCycleData[id] = prx
    logging.debug('Activated TransducerCycleData[oid=%d] servant', id)
    return prx

  ## Gets the TransducerCycleData object fields.
  #
  # @param id TransducerCycleData object ID
  # @return TransducerCycleDataFields object
  def getTransducerCycleDataFields(self, id, current=None):
    logging.debug('getTransducerCycleDataFields(oid=%d)' % id)
    return self._getTransducerCycleDataFields(id, current)

  ## Gets the TransducerCycleData object fields.
  #
  # @param id TransducerCycleData object ID
  # @return TransducerCycleDataFields object
  def _getTransducerCycleDataFields(self, id, current=None):
    fields = SenStore.TransducerCycleDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getTransducerCycleData(fields):
          return None
    return fields

  ## Sets the TransducerCycleData object fields.
  #
  # @param fields     TransducerCycleData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setTransducerCycleDataFields(self, fields, fieldNames, current=None):
    logging.debug('setTransducerCycleDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setTransducerCycleData(fields, fieldNames)

  ## Gets a list of IDs of all TransducerCycleData objects.
  #
  # @return ids list of TransducerCycleData object IDs
  def getTransducerCycleDataIds(self, current=None):
    logging.debug('getTransducerCycleDataList()')
    with self.lock:
      return self.pg.getTransducerCycleDataIds()

  ## Gets a list of TransducerCycleData object proxies.
  #
  # @param ids list of TransducerCycleData object IDs
  # @return list of TransducerCycleData object proxies
  def getTransducerCycleDataList(self, ids, current=None):
    logging.debug('getTransducerCycleDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getTransducerCycleData(id) for id in ids]

  ## Gets a list of TransducerCycleData fields objects.
  #
  # @param ids list of TransducerCycleData object IDs
  # @return list of TransducerCycleData fields objects
  def getTransducerCycleDataFieldsList(self, ids, current=None):
    logging.debug('getTransducerCycleDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getTransducerCycleDataFields(id) for id in ids]

  ## Gets a list of all TransducerCycleData object IDs.
  #
  # @param fields TransducerCycleData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching TransducerCycleData objects
  #
  def findEqualTransducerCycleData(self, fields, fieldNames, current=None):
    logging.debug('findEqualTransducerCycleData()')
    with self.lock:
      ids = self.pg.findEqualTransducerCycleData(fields, fieldNames)
    return ids

  ## Adds a MappingMatrix object to the store.
  #
  # @param fields  MappingMatrixFields object
  # @return newly assigned ID
  def addMappingMatrix(self, fields, current=None):
    logging.debug('addMappingMatrix()')
    with self.lock:
      self.pg.addMappingMatrix(fields)
      # Store fields in HDF5 file
      self.h5.addMappingMatrix(fields)
    return fields.id


  ## Adds a set of MappingMatrix objects to the store.
  #
  # @param fieldsList  list of MappingMatrixFields objects
  # @return list of newly assigned IDs
  def addMappingMatrixList(self, fieldsList, current=None):
    logging.debug('addMappingMatrixList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addMappingMatrixList(fieldsList)
      for fields in fieldsList:
        # Store fields in HDF5 file
        self.h5.addMappingMatrix(fields)
        ids.append(fields.id)
    return ids


  ## Gets a MappingMatrix object proxy by its ID.
  #
  # @param id MappingMatrix object ID
  # @return MappingMatrix object proxy
  def getMappingMatrix(self, id, current=None):
    logging.debug('getMappingMatrix(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryMappingMatrix.has_key(id):
        logging.debug('Fetched MappingMatrix[oid=%d] servant from cache', id)
        return self.registryMappingMatrix[id]
      obj = MappingMatrixI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.MappingMatrixPrx.uncheckedCast(srvt)
      self.registryMappingMatrix[id] = prx
    logging.debug('Activated MappingMatrix[oid=%d] servant', id)
    return prx

  ## Gets the MappingMatrix object fields.
  #
  # @param id MappingMatrix object ID
  # @return MappingMatrixFields object
  def getMappingMatrixFields(self, id, current=None):
    logging.debug('getMappingMatrixFields(oid=%d)' % id)
    return self._getMappingMatrixFields(id, current)

  ## Gets the MappingMatrix object fields.
  #
  # @param id MappingMatrix object ID
  # @return MappingMatrixFields object
  def _getMappingMatrixFields(self, id, current=None):
    fields = SenStore.MappingMatrixFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getMappingMatrix(fields):
          return None
    return fields

  ## Sets the MappingMatrix object fields.
  #
  # @param fields     MappingMatrix fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setMappingMatrixFields(self, fields, fieldNames, current=None):
    logging.debug('setMappingMatrixFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setMappingMatrix(fields, fieldNames)

  ## Gets a list of IDs of all MappingMatrix objects.
  #
  # @return ids list of MappingMatrix object IDs
  def getMappingMatrixIds(self, current=None):
    logging.debug('getMappingMatrixList()')
    with self.lock:
      return self.pg.getMappingMatrixIds()

  ## Gets a list of MappingMatrix object proxies.
  #
  # @param ids list of MappingMatrix object IDs
  # @return list of MappingMatrix object proxies
  def getMappingMatrixList(self, ids, current=None):
    logging.debug('getMappingMatrixList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getMappingMatrix(id) for id in ids]

  ## Gets a list of MappingMatrix fields objects.
  #
  # @param ids list of MappingMatrix object IDs
  # @return list of MappingMatrix fields objects
  def getMappingMatrixFieldsList(self, ids, current=None):
    logging.debug('getMappingMatrixFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getMappingMatrixFields(id) for id in ids]

  ## Gets the MappingMatrix OutputNode axis.
  #
  # @param id  MappingMatrix object ID
  # @return MappingMatrix OutputNode axis data
  def getMappingMatrixOutputNodeAxis(self, id, current=None):
    with self.lock:
      data = self.h5.getMappingMatrixOutputNodeAxis(id)
    return list(data)

  ##
  # Sets the MappingMatrix OutputNode axis.
  #
  # @param id  MappingMatrix object ID
  # @param data MappingMatrix OutputNode axis data
  def setMappingMatrixOutputNodeAxis(self, id, data, current=None):
    with self.lock:
      self.h5.setMappingMatrixOutputNodeAxis(id, data)

  ## Gets the MappingMatrix InputNode axis.
  #
  # @param id  MappingMatrix object ID
  # @return MappingMatrix InputNode axis data
  def getMappingMatrixInputNodeAxis(self, id, current=None):
    with self.lock:
      data = self.h5.getMappingMatrixInputNodeAxis(id)
    return list(data)

  ##
  # Sets the MappingMatrix InputNode axis.
  #
  # @param id  MappingMatrix object ID
  # @param data MappingMatrix InputNode axis data
  def setMappingMatrixInputNodeAxis(self, id, data, current=None):
    with self.lock:
      self.h5.setMappingMatrixInputNodeAxis(id, data)
  ## Gets the MappingMatrix array dimensions.
  #
  # @param id  MappingMatrix object ID
  # @return array dimensions
  def getMappingMatrixArraySize(self, id, current=None):
    with self.lock:
      return list(self.h5.getMappingMatrixArraySize(id))

  ## Creates the MappingMatrix array.
  #
  # @param id  MappingMatrix object ID
  # @param dims array dimensions
  def createMappingMatrixArray(self, id, dims, current=None):
    logging.debug('createMappingMatrixSignal(oid=%d)' % id)
    with self.lock:
      self.h5.createMappingMatrixArray(id, dims)

  ## Gets the MappingMatrix array data of the i'th dimension, at the
  ## given indices.
  #
  # The index at the requested dimension will be ignored.  For
  # example, getDim(1,[10,0,4]) will get the vector of data along
  # the second dimension, with the first index set to 10, and the
  # third to 4.
  # 
  # @param id  MappingMatrix object ID
  # @param i dimension number (0 ...)
  # @param idxs dimension indices (0 ...)
  # @return vector data
  def getMappingMatrixArrayData(self, id, i, idxs, current=None):
    with self.lock:
      return list(self.h5.getMappingMatrixArrayData(id, i, idxs))

  ## Sets the MappingMatrix array data of the i'th dimension, at the
  ## given indices.
  #
  # @param id  MappingMatrix object ID
  # @param i dimension number (0 ...)
  # @param dims dimension indices (0 ...)
  # @param data vector data
  def setMappingMatrixArrayData(self, id, i, idxs, data, current=None):
    self.h5.setMappingMatrixArrayData(id, i, idxs, data)

  ## Gets a list of all MappingMatrix object IDs.
  #
  # @param fields MappingMatrix object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching MappingMatrix objects
  #
  def findEqualMappingMatrix(self, fields, fieldNames, current=None):
    logging.debug('findEqualMappingMatrix()')
    with self.lock:
      ids = self.pg.findEqualMappingMatrix(fields, fieldNames)
    return ids

  ## Adds a DaqUnitChannelData object to the store.
  #
  # @param fields  DaqUnitChannelDataFields object
  # @return newly assigned ID
  def addDaqUnitChannelData(self, fields, current=None):
    logging.debug('addDaqUnitChannelData()')
    with self.lock:
      self.pg.addDaqUnitChannelData(fields)
      # Store fields in HDF5 file
      self.h5.addDaqUnitChannelData(fields)
    return fields.id


  ## Adds a set of DaqUnitChannelData objects to the store.
  #
  # @param fieldsList  list of DaqUnitChannelDataFields objects
  # @return list of newly assigned IDs
  def addDaqUnitChannelDataList(self, fieldsList, current=None):
    logging.debug('addDaqUnitChannelDataList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addDaqUnitChannelDataList(fieldsList)
      for fields in fieldsList:
        # Store fields in HDF5 file
        self.h5.addDaqUnitChannelData(fields)
        ids.append(fields.id)
    return ids


  ## Gets a DaqUnitChannelData object proxy by its ID.
  #
  # @param id DaqUnitChannelData object ID
  # @return DaqUnitChannelData object proxy
  def getDaqUnitChannelData(self, id, current=None):
    logging.debug('getDaqUnitChannelData(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryDaqUnitChannelData.has_key(id):
        logging.debug('Fetched DaqUnitChannelData[oid=%d] servant from cache', id)
        return self.registryDaqUnitChannelData[id]
      obj = DaqUnitChannelDataI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.DaqUnitChannelDataPrx.uncheckedCast(srvt)
      self.registryDaqUnitChannelData[id] = prx
    logging.debug('Activated DaqUnitChannelData[oid=%d] servant', id)
    return prx

  ## Gets the DaqUnitChannelData object fields.
  #
  # @param id DaqUnitChannelData object ID
  # @return DaqUnitChannelDataFields object
  def getDaqUnitChannelDataFields(self, id, current=None):
    logging.debug('getDaqUnitChannelDataFields(oid=%d)' % id)
    return self._getDaqUnitChannelDataFields(id, current)

  ## Gets the DaqUnitChannelData object fields.
  #
  # @param id DaqUnitChannelData object ID
  # @return DaqUnitChannelDataFields object
  def _getDaqUnitChannelDataFields(self, id, current=None):
    fields = SenStore.DaqUnitChannelDataFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getDaqUnitChannelData(fields):
          return None
    return fields

  ## Sets the DaqUnitChannelData object fields.
  #
  # @param fields     DaqUnitChannelData fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setDaqUnitChannelDataFields(self, fields, fieldNames, current=None):
    logging.debug('setDaqUnitChannelDataFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setDaqUnitChannelData(fields, fieldNames)

  ## Gets a list of IDs of all DaqUnitChannelData objects.
  #
  # @return ids list of DaqUnitChannelData object IDs
  def getDaqUnitChannelDataIds(self, current=None):
    logging.debug('getDaqUnitChannelDataList()')
    with self.lock:
      return self.pg.getDaqUnitChannelDataIds()

  ## Gets a list of DaqUnitChannelData object proxies.
  #
  # @param ids list of DaqUnitChannelData object IDs
  # @return list of DaqUnitChannelData object proxies
  def getDaqUnitChannelDataList(self, ids, current=None):
    logging.debug('getDaqUnitChannelDataList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getDaqUnitChannelData(id) for id in ids]

  ## Gets a list of DaqUnitChannelData fields objects.
  #
  # @param ids list of DaqUnitChannelData object IDs
  # @return list of DaqUnitChannelData fields objects
  def getDaqUnitChannelDataFieldsList(self, ids, current=None):
    logging.debug('getDaqUnitChannelDataFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getDaqUnitChannelDataFields(id) for id in ids]

  ## Gets the DaqUnitChannelData SubChannels axis.
  #
  # @param id  DaqUnitChannelData object ID
  # @return DaqUnitChannelData SubChannels axis data
  def getDaqUnitChannelDataSubChannelsAxis(self, id, current=None):
    with self.lock:
      data = self.h5.getDaqUnitChannelDataSubChannelsAxis(id)
    # Map enum IDs to enum objects
    return [self.pg.QuantityIdToEnum[x] for x in data]

  ##
  # Sets the DaqUnitChannelData SubChannels axis.
  #
  # @param id  DaqUnitChannelData object ID
  # @param data DaqUnitChannelData SubChannels axis data
  def setDaqUnitChannelDataSubChannelsAxis(self, id, data, current=None):
    # Map enum objects to IDs
    data = [self.pg.QuantityLabelToId[str(x)] for x in data]
    with self.lock:
      self.h5.setDaqUnitChannelDataSubChannelsAxis(id, data)

  ## Creates the DaqUnitChannelData signal.
  #
  # Note that the array size reflects the size of each axis, not
  # including the time axis.  The signal will grow along the time
  # axis as arrays are added.
  #
  # This method must be called before signal arrays can be added.
  #
  # @param id  DaqUnitChannelData object ID
  # @param dims signal array dimensions
  def createDaqUnitChannelDataSignal(self, id, dims, current=None):
    logging.debug('createDaqUnitChannelDataSignal(oid=%d)' % id)
    with self.lock:
      self.h5.createDaqUnitChannelDataSignal(id, dims)

  ## Gets the DaqUnitChannelData signal dimensions.
  #
  # @param id  DaqUnitChannelData object ID
  # @return signal dimensions
  def getDaqUnitChannelDataSignalSize(self, id, current=None):
    with self.lock:
        return list(self.h5.getDaqUnitChannelDataArraySize(id))

  ## Gets the DaqUnitChannelData signal time axis information.
  #
  # @param t  time vector [s]
  # @return signal time axis information
  def getDaqUnitChannelDataTimeAxisInfo(self, id, t, current=None):
    with self.lock:
      tActual, idx = self.h5.getDaqUnitChannelDataTimeAxisInfo(id, t)
    # Wrap in return object
    result = SenStore.TimeAxisInfo()
    result.t = tActual
    result.idx  = idx
    return result

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param id  DaqUnitChannelData object ID
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getDaqUnitChannelDataSignalData(self, id, tStart, tStep, tEnd, slices,
          current=None):
    with self.lock:
      shape, data, t = self.h5.getDaqUnitChannelDataSignalData(id, tStart, tStep,
            tEnd, slices)
    # Wrap in return object
    result = SenStore.Int32Signal()
    result.shape = shape
    result.data = data
    result.t = t
    return result

  ## Gets the signal data by sample index range.
  #
  # The returned signal data will contain time stamps at
  # [idxStart,  idxStart+idxStep, idxStart+2*idxStep, ...],
  # where idx < idxEnd.
  #
  # @param id  DaqUnitChannelData object ID
  # @param idxStart  start index (included in data)
  # @param idxStep   index step size
  # @param idxEnd    end index (not included in data)
  # @param slices    list of slices for each dimension
  # @return (shape, data, t) 
  def getDaqUnitChannelDataSignalDataByIndexRange(self, id, idxStart, idxStep, idxEnd, slices, current=None):
    with self.lock:
      shape, data, t = self.h5.getDaqUnitChannelDataSignalDataByIndexRange(id, idxStart, idxStep, idxEnd, slices)
    # Wrap in return object
    result = SenStore.Int32Signal()
    result.shape = shape
    result.data = data
    result.t = t
    return result

  ## Appends data points to the DaqUnitChannelData signal.
  #
  # @param id    DaqUnitChannelData object ID
  # @param t     ordered list of timestamps
  # @param data  data points organized as vector data
  def appendToDaqUnitChannelDataSignal(self, id, t, data, current=None):
    with self.lock:
      self.h5.appendToDaqUnitChannelDataSignal(id, t, data)

  ## Gets a list of all DaqUnitChannelData object IDs.
  #
  # @param fields DaqUnitChannelData object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching DaqUnitChannelData objects
  #
  def findEqualDaqUnitChannelData(self, fields, fieldNames, current=None):
    logging.debug('findEqualDaqUnitChannelData()')
    with self.lock:
      ids = self.pg.findEqualDaqUnitChannelData(fields, fieldNames)
    return ids

  ## Adds a AccelMeas object to the store.
  #
  # @param fields  AccelMeasFields object
  # @return newly assigned ID
  def addAccelMeas(self, fields, current=None):
    logging.debug('addAccelMeas()')
    with self.lock:
      self.pg.addAccelMeas(fields)
      # Store fields in HDF5 file
      self.h5.addAccelMeas(fields)
    return fields.id


  ## Adds a set of AccelMeas objects to the store.
  #
  # @param fieldsList  list of AccelMeasFields objects
  # @return list of newly assigned IDs
  def addAccelMeasList(self, fieldsList, current=None):
    logging.debug('addAccelMeasList()')
    # TODO: use batch insert for databases
    ids = []
    with self.lock:
      self.pg.addAccelMeasList(fieldsList)
      for fields in fieldsList:
        # Store fields in HDF5 file
        self.h5.addAccelMeas(fields)
        ids.append(fields.id)
    return ids


  ## Gets a AccelMeas object proxy by its ID.
  #
  # @param id AccelMeas object ID
  # @return AccelMeas object proxy
  def getAccelMeas(self, id, current=None):
    logging.debug('getAccelMeas(oid=%d)' % id)
    with self.lock:
      # Get already created proxy, or create a new one
      if self.registryAccelMeas.has_key(id):
        logging.debug('Fetched AccelMeas[oid=%d] servant from cache', id)
        return self.registryAccelMeas[id]
      obj = AccelMeasI(self, id)
      srvt = obj.activate(self._adapter)
      prx = SenStore.AccelMeasPrx.uncheckedCast(srvt)
      self.registryAccelMeas[id] = prx
    logging.debug('Activated AccelMeas[oid=%d] servant', id)
    return prx

  ## Gets the AccelMeas object fields.
  #
  # @param id AccelMeas object ID
  # @return AccelMeasFields object
  def getAccelMeasFields(self, id, current=None):
    logging.debug('getAccelMeasFields(oid=%d)' % id)
    return self._getAccelMeasFields(id, current)

  ## Gets the AccelMeas object fields.
  #
  # @param id AccelMeas object ID
  # @return AccelMeasFields object
  def _getAccelMeasFields(self, id, current=None):
    fields = SenStore.AccelMeasFields()
    fields.id = id
    with self.lock:
      # Get fields from PostgreSQL database
      if not self.pg.getAccelMeas(fields):
          return None
    return fields

  ## Sets the AccelMeas object fields.
  #
  # @param fields     AccelMeas fields object
  # @param fieldNames list of names of fields to update (all if empty)
  def setAccelMeasFields(self, fields, fieldNames, current=None):
    logging.debug('setAccelMeasFields(oid=%d)' % fields.id)
    with self.lock:
      # Update fields in PostgreSQL database
      self.pg.setAccelMeas(fields, fieldNames)

  ## Gets a list of IDs of all AccelMeas objects.
  #
  # @return ids list of AccelMeas object IDs
  def getAccelMeasIds(self, current=None):
    logging.debug('getAccelMeasList()')
    with self.lock:
      return self.pg.getAccelMeasIds()

  ## Gets a list of AccelMeas object proxies.
  #
  # @param ids list of AccelMeas object IDs
  # @return list of AccelMeas object proxies
  def getAccelMeasList(self, ids, current=None):
    logging.debug('getAccelMeasList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self.getAccelMeas(id) for id in ids]

  ## Gets a list of AccelMeas fields objects.
  #
  # @param ids list of AccelMeas object IDs
  # @return list of AccelMeas fields objects
  def getAccelMeasFieldsList(self, ids, current=None):
    logging.debug('getAccelMeasFieldsList()')
    with self.lock:
      # TODO: more efficient implementation
      return [self._getAccelMeasFields(id) for id in ids]

  ## Gets the AccelMeas Direction axis.
  #
  # @param id  AccelMeas object ID
  # @return AccelMeas Direction axis data
  def getAccelMeasDirectionAxis(self, id, current=None):
    with self.lock:
      data = self.h5.getAccelMeasDirectionAxis(id)
    # Map enum IDs to enum objects
    return [self.pg.QuantityIdToEnum[x] for x in data]

  ##
  # Sets the AccelMeas Direction axis.
  #
  # @param id  AccelMeas object ID
  # @param data AccelMeas Direction axis data
  def setAccelMeasDirectionAxis(self, id, data, current=None):
    # Map enum objects to IDs
    data = [self.pg.QuantityLabelToId[str(x)] for x in data]
    with self.lock:
      self.h5.setAccelMeasDirectionAxis(id, data)

  ## Creates the AccelMeas signal.
  #
  # Note that the array size reflects the size of each axis, not
  # including the time axis.  The signal will grow along the time
  # axis as arrays are added.
  #
  # This method must be called before signal arrays can be added.
  #
  # @param id  AccelMeas object ID
  # @param dims signal array dimensions
  def createAccelMeasSignal(self, id, dims, current=None):
    logging.debug('createAccelMeasSignal(oid=%d)' % id)
    with self.lock:
      self.h5.createAccelMeasSignal(id, dims)

  ## Gets the AccelMeas signal dimensions.
  #
  # @param id  AccelMeas object ID
  # @return signal dimensions
  def getAccelMeasSignalSize(self, id, current=None):
    with self.lock:
        return list(self.h5.getAccelMeasArraySize(id))

  ## Gets the AccelMeas signal time axis information.
  #
  # @param t  time vector [s]
  # @return signal time axis information
  def getAccelMeasTimeAxisInfo(self, id, t, current=None):
    with self.lock:
      tActual, idx = self.h5.getAccelMeasTimeAxisInfo(id, t)
    # Wrap in return object
    result = SenStore.TimeAxisInfo()
    result.t = tActual
    result.idx  = idx
    return result

  ## Gets the signal data.
  #
  # The returned signal data will have time stamps tStart <= t <=
  # tEnd, with no two time stamps closer than tDelta.
  #
  # @param id  AccelMeas object ID
  # @param tStart  start time 
  # @param tDelta  minimum time interval
  # @param tEnd    end time 
  # @param slices  list of slices for each dimension
  # @return (shape, data, t) 
  def getAccelMeasSignalData(self, id, tStart, tStep, tEnd, slices,
          current=None):
    with self.lock:
      shape, data, t = self.h5.getAccelMeasSignalData(id, tStart, tStep,
            tEnd, slices)
    # Wrap in return object
    result = SenStore.Float32Signal()
    result.shape = shape
    result.data = data
    result.t = t
    return result

  ## Gets the signal data by sample index range.
  #
  # The returned signal data will contain time stamps at
  # [idxStart,  idxStart+idxStep, idxStart+2*idxStep, ...],
  # where idx < idxEnd.
  #
  # @param id  AccelMeas object ID
  # @param idxStart  start index (included in data)
  # @param idxStep   index step size
  # @param idxEnd    end index (not included in data)
  # @param slices    list of slices for each dimension
  # @return (shape, data, t) 
  def getAccelMeasSignalDataByIndexRange(self, id, idxStart, idxStep, idxEnd, slices, current=None):
    with self.lock:
      shape, data, t = self.h5.getAccelMeasSignalDataByIndexRange(id, idxStart, idxStep, idxEnd, slices)
    # Wrap in return object
    result = SenStore.Float32Signal()
    result.shape = shape
    result.data = data
    result.t = t
    return result

  ## Appends data points to the AccelMeas signal.
  #
  # @param id    AccelMeas object ID
  # @param t     ordered list of timestamps
  # @param data  data points organized as vector data
  def appendToAccelMeasSignal(self, id, t, data, current=None):
    with self.lock:
      self.h5.appendToAccelMeasSignal(id, t, data)

  ## Gets a list of all AccelMeas object IDs.
  #
  # @param fields AccelMeas object fields to compare to
  # @param fieldNames names of fields to compare (empty is all)
  # @return list of IDs of matching AccelMeas objects
  #
  def findEqualAccelMeas(self, fields, fieldNames, current=None):
    logging.debug('findEqualAccelMeas()')
    with self.lock:
      ids = self.pg.findEqualAccelMeas(fields, fieldNames)
    return ids

class Server(Ice.Application):
  def run(self, args):
    # Terminate cleanly on receipt of a signal
    self.shutdownOnInterrupt()

    # Create an Ice object adapter
    ic = self.communicator()
    adapter = ic.createObjectAdapter("SenStoreAdapter")

    # Create inspector
    obj = InspectorI(ic)
    obj.activate(adapter)

    # Create manager, the main server entry
    obj = SenStoreMngrI(ic)
    obj.activate(adapter)
    
    # Activate adapter
    adapter.activate()
    logging.info('SenStore Ice server started')
    logging.info('SenStore database server implementation is Copyright (C)'+
                 ' SC Solutions, Inc.')
    logging.info('SenStore database schema is Copyright (C)'+
                 ' SC Solutions, Inc., University of Michigan')

    # Wait until we are done
    ic.waitForShutdown()
    if self.interrupted():
      print self.appName() + ": terminating"
    return 0

def createInitData(config):
    initData = Ice.InitializationData()
    port = int(self.cfg.get('Server', 'port'))
