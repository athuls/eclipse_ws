// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package edu.umich.senstore;

public interface _SenStoreMngrDel extends Ice._ObjectDel
{
    long addStructure(StructureFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addStructureList(StructureFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    StructurePrx getStructure(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getStructureIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    StructurePrx[] getStructureList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    StructureFields getStructureFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    StructureFields[] getStructureFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualStructure(StructureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setStructureFields(StructureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMDof(FEMDofFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMDofList(FEMDofFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDofPrx getFEMDof(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMDofIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDofPrx[] getFEMDofList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDofFields getFEMDofFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDofFields[] getFEMDofFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMDof(FEMDofFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMDofFields(FEMDofFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNodalMass(FEMNodalMassFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNodalMassList(FEMNodalMassFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodalMassPrx getFEMNodalMass(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNodalMassIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodalMassPrx[] getFEMNodalMassList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodalMassFields getFEMNodalMassFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodalMassFields[] getFEMNodalMassFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNodalMass(FEMNodalMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNodalMassFields(FEMNodalMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNLElasticStrainStressList(FEMNLElasticStrainStressFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticStrainStressPrx getFEMNLElasticStrainStress(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNLElasticStrainStressIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticStrainStressPrx[] getFEMNLElasticStrainStressList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticStrainStressFields getFEMNLElasticStrainStressFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticStrainStressFields[] getFEMNLElasticStrainStressFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNLElasticStrainStressFields(FEMNLElasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMBoundary(FEMBoundaryFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMBoundaryList(FEMBoundaryFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBoundaryPrx getFEMBoundary(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMBoundaryIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBoundaryPrx[] getFEMBoundaryList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBoundaryFields getFEMBoundaryFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBoundaryFields[] getFEMBoundaryFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMBoundary(FEMBoundaryFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMBoundaryFields(FEMBoundaryFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSectionPipe(FEMSectionPipeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSectionPipeList(FEMSectionPipeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPipePrx getFEMSectionPipe(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSectionPipeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPipePrx[] getFEMSectionPipeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPipeFields getFEMSectionPipeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPipeFields[] getFEMSectionPipeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSectionPipe(FEMSectionPipeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSectionPipeFields(FEMSectionPipeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMCoordSystem(FEMCoordSystemFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMCoordSystemList(FEMCoordSystemFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCoordSystemPrx getFEMCoordSystem(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMCoordSystemIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCoordSystemPrx[] getFEMCoordSystemList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCoordSystemFields getFEMCoordSystemFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCoordSystemFields[] getFEMCoordSystemFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMCoordSystem(FEMCoordSystemFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMCoordSystemFields(FEMCoordSystemFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNode(FEMNodeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNodeList(FEMNodeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodePrx getFEMNode(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNodeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodePrx[] getFEMNodeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodeFields getFEMNodeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodeFields[] getFEMNodeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNode(FEMNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNodeFields(FEMNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTruss(FEMTrussFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTrussList(FEMTrussFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussPrx getFEMTruss(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTrussIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussPrx[] getFEMTrussList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussFields getFEMTrussFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussFields[] getFEMTrussFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTruss(FEMTrussFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTrussFields(FEMTrussFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTimeFunctionData(FEMTimeFunctionDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTimeFunctionDataList(FEMTimeFunctionDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionDataPrx getFEMTimeFunctionData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTimeFunctionDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionDataPrx[] getFEMTimeFunctionDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionDataFields getFEMTimeFunctionDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionDataFields[] getFEMTimeFunctionDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTimeFunctionData(FEMTimeFunctionDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTimeFunctionDataFields(FEMTimeFunctionDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPlasticMlMaterialsList(FEMPlasticMlMaterialsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticMlMaterialsPrx getFEMPlasticMlMaterials(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPlasticMlMaterialsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticMlMaterialsPrx[] getFEMPlasticMlMaterialsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticMlMaterialsFields getFEMPlasticMlMaterialsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticMlMaterialsFields[] getFEMPlasticMlMaterialsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPlasticMlMaterialsFields(FEMPlasticMlMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPlateGroup(FEMPlateGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPlateGroupList(FEMPlateGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateGroupPrx getFEMPlateGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPlateGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateGroupPrx[] getFEMPlateGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateGroupFields getFEMPlateGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateGroupFields[] getFEMPlateGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPlateGroup(FEMPlateGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPlateGroupFields(FEMPlateGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMBeam(FEMBeamFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMBeamList(FEMBeamFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamPrx getFEMBeam(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMBeamIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamPrx[] getFEMBeamList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamFields getFEMBeamFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamFields[] getFEMBeamFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMBeam(FEMBeamFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMBeamFields(FEMBeamFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMCurvMomentData(FEMCurvMomentDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMCurvMomentDataList(FEMCurvMomentDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCurvMomentDataPrx getFEMCurvMomentData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMCurvMomentDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCurvMomentDataPrx[] getFEMCurvMomentDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCurvMomentDataFields getFEMCurvMomentDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCurvMomentDataFields[] getFEMCurvMomentDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMCurvMomentData(FEMCurvMomentDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMCurvMomentDataFields(FEMCurvMomentDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPropertysets(FEMPropertysetsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPropertysetsList(FEMPropertysetsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertysetsPrx getFEMPropertysets(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPropertysetsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertysetsPrx[] getFEMPropertysetsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertysetsFields getFEMPropertysetsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertysetsFields[] getFEMPropertysetsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPropertysets(FEMPropertysetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPropertysetsFields(FEMPropertysetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMOrthotropicMaterialList(FEMOrthotropicMaterialFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMOrthotropicMaterialPrx getFEMOrthotropicMaterial(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMOrthotropicMaterialIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMOrthotropicMaterialPrx[] getFEMOrthotropicMaterialList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMOrthotropicMaterialFields getFEMOrthotropicMaterialFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMOrthotropicMaterialFields[] getFEMOrthotropicMaterialFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMOrthotropicMaterialFields(FEMOrthotropicMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMAppliedLoads(FEMAppliedLoadsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMAppliedLoadsList(FEMAppliedLoadsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedLoadsPrx getFEMAppliedLoads(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMAppliedLoadsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedLoadsPrx[] getFEMAppliedLoadsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedLoadsFields getFEMAppliedLoadsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedLoadsFields[] getFEMAppliedLoadsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMAppliedLoads(FEMAppliedLoadsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMAppliedLoadsFields(FEMAppliedLoadsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThermoOrthData(FEMThermoOrthDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThermoOrthDataList(FEMThermoOrthDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthDataPrx getFEMThermoOrthData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThermoOrthDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthDataPrx[] getFEMThermoOrthDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthDataFields getFEMThermoOrthDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthDataFields[] getFEMThermoOrthDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThermoOrthData(FEMThermoOrthDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThermoOrthDataFields(FEMThermoOrthDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMContactPairs(FEMContactPairsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMContactPairsList(FEMContactPairsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactPairsPrx getFEMContactPairs(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMContactPairsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactPairsPrx[] getFEMContactPairsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactPairsFields getFEMContactPairsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactPairsFields[] getFEMContactPairsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMContactPairs(FEMContactPairsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMContactPairsFields(FEMContactPairsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMGeneral(FEMGeneralFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMGeneralList(FEMGeneralFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralPrx getFEMGeneral(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMGeneralIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralPrx[] getFEMGeneralList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralFields getFEMGeneralFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralFields[] getFEMGeneralFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMGeneral(FEMGeneralFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMGeneralFields(FEMGeneralFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMBeamNode(FEMBeamNodeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMBeamNodeList(FEMBeamNodeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamNodePrx getFEMBeamNode(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMBeamNodeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamNodePrx[] getFEMBeamNodeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamNodeFields getFEMBeamNodeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamNodeFields[] getFEMBeamNodeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMBeamNode(FEMBeamNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMBeamNodeFields(FEMBeamNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSectionRect(FEMSectionRectFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSectionRectList(FEMSectionRectFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionRectPrx getFEMSectionRect(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSectionRectIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionRectPrx[] getFEMSectionRectList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionRectFields getFEMSectionRectFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionRectFields[] getFEMSectionRectFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSectionRect(FEMSectionRectFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSectionRectFields(FEMSectionRectFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMBeamLoad(FEMBeamLoadFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMBeamLoadList(FEMBeamLoadFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamLoadPrx getFEMBeamLoad(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMBeamLoadIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamLoadPrx[] getFEMBeamLoadList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamLoadFields getFEMBeamLoadFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMBeamLoadFields[] getFEMBeamLoadFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMBeamLoad(FEMBeamLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMBeamLoadFields(FEMBeamLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMLoadMassProportional(FEMLoadMassProportionalFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMLoadMassProportionalList(FEMLoadMassProportionalFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLoadMassProportionalPrx getFEMLoadMassProportional(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMLoadMassProportionalIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLoadMassProportionalPrx[] getFEMLoadMassProportionalList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLoadMassProportionalFields getFEMLoadMassProportionalFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLoadMassProportionalFields[] getFEMLoadMassProportionalFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMLoadMassProportional(FEMLoadMassProportionalFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMLoadMassProportionalFields(FEMLoadMassProportionalFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMLink(FEMLinkFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMLinkList(FEMLinkFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLinkPrx getFEMLink(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMLinkIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLinkPrx[] getFEMLinkList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLinkFields getFEMLinkFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMLinkFields[] getFEMLinkFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMLink(FEMLinkFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMLinkFields(FEMLinkFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMAxesNode(FEMAxesNodeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMAxesNodeList(FEMAxesNodeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAxesNodePrx getFEMAxesNode(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMAxesNodeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAxesNodePrx[] getFEMAxesNodeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAxesNodeFields getFEMAxesNodeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAxesNodeFields[] getFEMAxesNodeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMAxesNode(FEMAxesNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMAxesNodeFields(FEMAxesNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNMTimeMass(FEMNMTimeMassFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNMTimeMassList(FEMNMTimeMassFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNMTimeMassPrx getFEMNMTimeMass(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNMTimeMassIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNMTimeMassPrx[] getFEMNMTimeMassList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNMTimeMassFields getFEMNMTimeMassFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNMTimeMassFields[] getFEMNMTimeMassFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNMTimeMass(FEMNMTimeMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNMTimeMassFields(FEMNMTimeMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMAppliedDisplacement(FEMAppliedDisplacementFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMAppliedDisplacementList(FEMAppliedDisplacementFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedDisplacementPrx getFEMAppliedDisplacement(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMAppliedDisplacementIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedDisplacementPrx[] getFEMAppliedDisplacementList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedDisplacementFields getFEMAppliedDisplacementFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedDisplacementFields[] getFEMAppliedDisplacementFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMAppliedDisplacement(FEMAppliedDisplacementFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMAppliedDisplacementFields(FEMAppliedDisplacementFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTimeFunctions(FEMTimeFunctionsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTimeFunctionsList(FEMTimeFunctionsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionsPrx getFEMTimeFunctions(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTimeFunctionsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionsPrx[] getFEMTimeFunctionsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionsFields getFEMTimeFunctionsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTimeFunctionsFields[] getFEMTimeFunctionsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTimeFunctions(FEMTimeFunctionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTimeFunctionsFields(FEMTimeFunctionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMForceStrainData(FEMForceStrainDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMForceStrainDataList(FEMForceStrainDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMForceStrainDataPrx getFEMForceStrainData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMForceStrainDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMForceStrainDataPrx[] getFEMForceStrainDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMForceStrainDataFields getFEMForceStrainDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMForceStrainDataFields[] getFEMForceStrainDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMForceStrainData(FEMForceStrainDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMForceStrainDataFields(FEMForceStrainDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSkewDOF(FEMSkewDOFFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSkewDOFList(FEMSkewDOFFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewDOFPrx getFEMSkewDOF(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSkewDOFIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewDOFPrx[] getFEMSkewDOFList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewDOFFields getFEMSkewDOFFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewDOFFields[] getFEMSkewDOFFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSkewDOF(FEMSkewDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSkewDOFFields(FEMSkewDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSectionI(FEMSectionIFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSectionIList(FEMSectionIFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionIPrx getFEMSectionI(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSectionIIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionIPrx[] getFEMSectionIList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionIFields getFEMSectionIFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionIFields[] getFEMSectionIFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSectionI(FEMSectionIFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSectionIFields(FEMSectionIFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPlasticBilinearMaterialList(FEMPlasticBilinearMaterialFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticBilinearMaterialPrx getFEMPlasticBilinearMaterial(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPlasticBilinearMaterialIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticBilinearMaterialPrx[] getFEMPlasticBilinearMaterialList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticBilinearMaterialFields getFEMPlasticBilinearMaterialFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticBilinearMaterialFields[] getFEMPlasticBilinearMaterialFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPlasticBilinearMaterialFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMTForceData(FEMMTForceDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMTForceDataList(FEMMTForceDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMTForceDataPrx getFEMMTForceData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMTForceDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMTForceDataPrx[] getFEMMTForceDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMTForceDataFields getFEMMTForceDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMTForceDataFields[] getFEMMTForceDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMTForceData(FEMMTForceDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMTForceDataFields(FEMMTForceDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellPressure(FEMShellPressureFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellPressureList(FEMShellPressureFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPressurePrx getFEMShellPressure(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellPressureIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPressurePrx[] getFEMShellPressureList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPressureFields getFEMShellPressureFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPressureFields[] getFEMShellPressureFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellPressure(FEMShellPressureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellPressureFields(FEMShellPressureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMatrices(FEMMatricesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMatricesList(FEMMatricesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatricesPrx getFEMMatrices(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMatricesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatricesPrx[] getFEMMatricesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatricesFields getFEMMatricesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatricesFields[] getFEMMatricesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMatrices(FEMMatricesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMatricesFields(FEMMatricesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMDamping(FEMDampingFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMDampingList(FEMDampingFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDampingPrx getFEMDamping(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMDampingIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDampingPrx[] getFEMDampingList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDampingFields getFEMDampingFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMDampingFields[] getFEMDampingFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMDamping(FEMDampingFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMDampingFields(FEMDampingFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMaterial(FEMMaterialFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMaterialList(FEMMaterialFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMaterialPrx getFEMMaterial(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMaterialIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMaterialPrx[] getFEMMaterialList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMaterialFields getFEMMaterialFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMaterialFields[] getFEMMaterialFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMaterial(FEMMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMaterialFields(FEMMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMatrixData(FEMMatrixDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMatrixDataList(FEMMatrixDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixDataPrx getFEMMatrixData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMatrixDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixDataPrx[] getFEMMatrixDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixDataFields getFEMMatrixDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixDataFields[] getFEMMatrixDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMatrixData(FEMMatrixDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMatrixDataFields(FEMMatrixDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellAxesOrtho(FEMShellAxesOrthoFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellAxesOrthoList(FEMShellAxesOrthoFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoPrx getFEMShellAxesOrtho(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellAxesOrthoIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoPrx[] getFEMShellAxesOrthoList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoFields getFEMShellAxesOrthoFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoFields[] getFEMShellAxesOrthoFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellAxesOrtho(FEMShellAxesOrthoFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellAxesOrthoFields(FEMShellAxesOrthoFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMEndreleases(FEMEndreleasesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMEndreleasesList(FEMEndreleasesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMEndreleasesPrx getFEMEndreleases(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMEndreleasesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMEndreleasesPrx[] getFEMEndreleasesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMEndreleasesFields getFEMEndreleasesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMEndreleasesFields[] getFEMEndreleasesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMEndreleases(FEMEndreleasesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMEndreleasesFields(FEMEndreleasesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTrussGroup(FEMTrussGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTrussGroupList(FEMTrussGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussGroupPrx getFEMTrussGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTrussGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussGroupPrx[] getFEMTrussGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussGroupFields getFEMTrussGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTrussGroupFields[] getFEMTrussGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTrussGroup(FEMTrussGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTrussGroupFields(FEMTrussGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMInitialTemperature(FEMInitialTemperatureFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMInitialTemperatureList(FEMInitialTemperatureFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMInitialTemperaturePrx getFEMInitialTemperature(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMInitialTemperatureIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMInitialTemperaturePrx[] getFEMInitialTemperatureList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMInitialTemperatureFields getFEMInitialTemperatureFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMInitialTemperatureFields[] getFEMInitialTemperatureFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMInitialTemperature(FEMInitialTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMInitialTemperatureFields(FEMInitialTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThermoIsoMaterialsList(FEMThermoIsoMaterialsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoMaterialsPrx getFEMThermoIsoMaterials(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThermoIsoMaterialsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoMaterialsPrx[] getFEMThermoIsoMaterialsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoMaterialsFields getFEMThermoIsoMaterialsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoMaterialsFields[] getFEMThermoIsoMaterialsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThermoIsoMaterialsFields(FEMThermoIsoMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThermoIsoData(FEMThermoIsoDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThermoIsoDataList(FEMThermoIsoDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoDataPrx getFEMThermoIsoData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThermoIsoDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoDataPrx[] getFEMThermoIsoDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoDataFields getFEMThermoIsoDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoIsoDataFields[] getFEMThermoIsoDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThermoIsoData(FEMThermoIsoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThermoIsoDataFields(FEMThermoIsoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMContactGroup3(FEMContactGroup3Fields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMContactGroup3List(FEMContactGroup3Fields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactGroup3Prx getFEMContactGroup3(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMContactGroup3Ids(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactGroup3Prx[] getFEMContactGroup3List(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactGroup3Fields getFEMContactGroup3Fields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactGroup3Fields[] getFEMContactGroup3FieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMContactGroup3(FEMContactGroup3Fields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMContactGroup3Fields(FEMContactGroup3Fields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNLElasticMaterialsList(FEMNLElasticMaterialsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticMaterialsPrx getFEMNLElasticMaterials(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNLElasticMaterialsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticMaterialsPrx[] getFEMNLElasticMaterialsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticMaterialsFields getFEMNLElasticMaterialsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNLElasticMaterialsFields[] getFEMNLElasticMaterialsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNLElasticMaterialsFields(FEMNLElasticMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPlate(FEMPlateFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPlateList(FEMPlateFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlatePrx getFEMPlate(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPlateIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlatePrx[] getFEMPlateList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateFields getFEMPlateFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlateFields[] getFEMPlateFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPlate(FEMPlateFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPlateFields(FEMPlateFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMIsoBeam(FEMIsoBeamFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMIsoBeamList(FEMIsoBeamFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamPrx getFEMIsoBeam(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMIsoBeamIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamPrx[] getFEMIsoBeamList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamFields getFEMIsoBeamFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamFields[] getFEMIsoBeamFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMIsoBeam(FEMIsoBeamFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMIsoBeamFields(FEMIsoBeamFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMAppliedConcentratedLoadList(FEMAppliedConcentratedLoadFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedConcentratedLoadPrx getFEMAppliedConcentratedLoad(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMAppliedConcentratedLoadIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedConcentratedLoadPrx[] getFEMAppliedConcentratedLoadList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedConcentratedLoadFields getFEMAppliedConcentratedLoadFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedConcentratedLoadFields[] getFEMAppliedConcentratedLoadFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMAppliedConcentratedLoadFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTwoDSolidGroupList(FEMTwoDSolidGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidGroupPrx getFEMTwoDSolidGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTwoDSolidGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidGroupPrx[] getFEMTwoDSolidGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidGroupFields getFEMTwoDSolidGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidGroupFields[] getFEMTwoDSolidGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTwoDSolidGroupFields(FEMTwoDSolidGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMGroup(FEMGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMGroupList(FEMGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroupPrx getFEMGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroupPrx[] getFEMGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroupFields getFEMGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroupFields[] getFEMGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMGroup(FEMGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMGroupFields(FEMGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMProperties(FEMPropertiesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPropertiesList(FEMPropertiesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertiesPrx getFEMProperties(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPropertiesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertiesPrx[] getFEMPropertiesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertiesFields getFEMPropertiesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPropertiesFields[] getFEMPropertiesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMProperties(FEMPropertiesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPropertiesFields(FEMPropertiesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThreeDSolidGroupList(FEMThreeDSolidGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidGroupPrx getFEMThreeDSolidGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThreeDSolidGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidGroupPrx[] getFEMThreeDSolidGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidGroupFields getFEMThreeDSolidGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidGroupFields[] getFEMThreeDSolidGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThreeDSolidGroupFields(FEMThreeDSolidGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThreeDSolid(FEMThreeDSolidFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThreeDSolidList(FEMThreeDSolidFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidPrx getFEMThreeDSolid(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThreeDSolidIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidPrx[] getFEMThreeDSolidList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidFields getFEMThreeDSolidFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThreeDSolidFields[] getFEMThreeDSolidFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThreeDSolid(FEMThreeDSolidFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThreeDSolidFields(FEMThreeDSolidFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSectionProp(FEMSectionPropFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSectionPropList(FEMSectionPropFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPropPrx getFEMSectionProp(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSectionPropIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPropPrx[] getFEMSectionPropList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPropFields getFEMSectionPropFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionPropFields[] getFEMSectionPropFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSectionProp(FEMSectionPropFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSectionPropFields(FEMSectionPropFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMElasticMaterial(FEMElasticMaterialFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMElasticMaterialList(FEMElasticMaterialFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMElasticMaterialPrx getFEMElasticMaterial(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMElasticMaterialIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMElasticMaterialPrx[] getFEMElasticMaterialList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMElasticMaterialFields getFEMElasticMaterialFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMElasticMaterialFields[] getFEMElasticMaterialFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMElasticMaterial(FEMElasticMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMElasticMaterialFields(FEMElasticMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPoints(FEMPointsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPointsList(FEMPointsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPointsPrx getFEMPoints(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPointsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPointsPrx[] getFEMPointsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPointsFields getFEMPointsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPointsFields[] getFEMPointsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPoints(FEMPointsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPointsFields(FEMPointsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMThermoOrthMaterialsList(FEMThermoOrthMaterialsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthMaterialsPrx getFEMThermoOrthMaterials(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMThermoOrthMaterialsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthMaterialsPrx[] getFEMThermoOrthMaterialsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthMaterialsFields getFEMThermoOrthMaterialsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMThermoOrthMaterialsFields[] getFEMThermoOrthMaterialsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMThermoOrthMaterialsFields(FEMThermoOrthMaterialsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMConstraints(FEMConstraintsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMConstraintsList(FEMConstraintsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintsPrx getFEMConstraints(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMConstraintsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintsPrx[] getFEMConstraintsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintsFields getFEMConstraintsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintsFields[] getFEMConstraintsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMConstraints(FEMConstraintsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMConstraintsFields(FEMConstraintsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMCrigidities(FEMMCrigiditiesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMCrigiditiesList(FEMMCrigiditiesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCrigiditiesPrx getFEMMCrigidities(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMCrigiditiesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCrigiditiesPrx[] getFEMMCrigiditiesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCrigiditiesFields getFEMMCrigiditiesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCrigiditiesFields[] getFEMMCrigiditiesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMCrigidities(FEMMCrigiditiesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMCrigiditiesFields(FEMMCrigiditiesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSkeySysNode(FEMSkeySysNodeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSkeySysNodeList(FEMSkeySysNodeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkeySysNodePrx getFEMSkeySysNode(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSkeySysNodeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkeySysNodePrx[] getFEMSkeySysNodeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkeySysNodeFields getFEMSkeySysNodeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkeySysNodeFields[] getFEMSkeySysNodeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSkeySysNode(FEMSkeySysNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSkeySysNodeFields(FEMSkeySysNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMIsoBeamGroup(FEMIsoBeamGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMIsoBeamGroupList(FEMIsoBeamGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamGroupPrx getFEMIsoBeamGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMIsoBeamGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamGroupPrx[] getFEMIsoBeamGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamGroupFields getFEMIsoBeamGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMIsoBeamGroupFields[] getFEMIsoBeamGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMIsoBeamGroup(FEMIsoBeamGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMIsoBeamGroupFields(FEMIsoBeamGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellDOF(FEMShellDOFFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellDOFList(FEMShellDOFFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellDOFPrx getFEMShellDOF(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellDOFIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellDOFPrx[] getFEMShellDOFList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellDOFFields getFEMShellDOFFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellDOFFields[] getFEMShellDOFFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellDOF(FEMShellDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellDOFFields(FEMShellDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMCrossSections(FEMCrossSectionsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMCrossSectionsList(FEMCrossSectionsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCrossSectionsPrx getFEMCrossSections(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMCrossSectionsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCrossSectionsPrx[] getFEMCrossSectionsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCrossSectionsFields getFEMCrossSectionsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMCrossSectionsFields[] getFEMCrossSectionsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMCrossSections(FEMCrossSectionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMCrossSectionsFields(FEMCrossSectionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTwistMomentData(FEMTwistMomentDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTwistMomentDataList(FEMTwistMomentDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwistMomentDataPrx getFEMTwistMomentData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTwistMomentDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwistMomentDataPrx[] getFEMTwistMomentDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwistMomentDataFields getFEMTwistMomentDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwistMomentDataFields[] getFEMTwistMomentDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTwistMomentData(FEMTwistMomentDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTwistMomentDataFields(FEMTwistMomentDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShell(FEMShellFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellList(FEMShellFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPrx getFEMShell(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellPrx[] getFEMShellList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellFields getFEMShellFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellFields[] getFEMShellFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShell(FEMShellFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellFields(FEMShellFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNTNContact(FEMNTNContactFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNTNContactList(FEMNTNContactFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNTNContactPrx getFEMNTNContact(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNTNContactIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNTNContactPrx[] getFEMNTNContactList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNTNContactFields getFEMNTNContactFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNTNContactFields[] getFEMNTNContactFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNTNContact(FEMNTNContactFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNTNContactFields(FEMNTNContactFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellLayer(FEMShellLayerFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellLayerList(FEMShellLayerFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellLayerPrx getFEMShellLayer(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellLayerIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellLayerPrx[] getFEMShellLayerList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellLayerFields getFEMShellLayerFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellLayerFields[] getFEMShellLayerFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellLayer(FEMShellLayerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellLayerFields(FEMShellLayerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSkewSysAngles(FEMSkewSysAnglesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSkewSysAnglesList(FEMSkewSysAnglesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewSysAnglesPrx getFEMSkewSysAngles(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSkewSysAnglesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewSysAnglesPrx[] getFEMSkewSysAnglesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewSysAnglesFields getFEMSkewSysAnglesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSkewSysAnglesFields[] getFEMSkewSysAnglesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSkewSysAngles(FEMSkewSysAnglesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSkewSysAnglesFields(FEMSkewSysAnglesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMGroundMotionRecord(FEMGroundMotionRecordFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMGroundMotionRecordList(FEMGroundMotionRecordFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroundMotionRecordPrx getFEMGroundMotionRecord(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMGroundMotionRecordIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroundMotionRecordPrx[] getFEMGroundMotionRecordList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroundMotionRecordFields getFEMGroundMotionRecordFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroundMotionRecordFields[] getFEMGroundMotionRecordFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMGroundMotionRecord(FEMGroundMotionRecordFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMGroundMotionRecordFields(FEMGroundMotionRecordFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMGeneralGroup(FEMGeneralGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMGeneralGroupList(FEMGeneralGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralGroupPrx getFEMGeneralGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMGeneralGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralGroupPrx[] getFEMGeneralGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralGroupFields getFEMGeneralGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralGroupFields[] getFEMGeneralGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMGeneralGroup(FEMGeneralGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMGeneralGroupFields(FEMGeneralGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMTwoDSolid(FEMTwoDSolidFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMTwoDSolidList(FEMTwoDSolidFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidPrx getFEMTwoDSolid(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMTwoDSolidIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidPrx[] getFEMTwoDSolidList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidFields getFEMTwoDSolidFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMTwoDSolidFields[] getFEMTwoDSolidFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMTwoDSolid(FEMTwoDSolidFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMTwoDSolidFields(FEMTwoDSolidFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMAppliedTemperature(FEMAppliedTemperatureFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMAppliedTemperatureList(FEMAppliedTemperatureFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedTemperaturePrx getFEMAppliedTemperature(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMAppliedTemperatureIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedTemperaturePrx[] getFEMAppliedTemperatureList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedTemperatureFields getFEMAppliedTemperatureFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMAppliedTemperatureFields[] getFEMAppliedTemperatureFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMAppliedTemperature(FEMAppliedTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMAppliedTemperatureFields(FEMAppliedTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMatrixSets(FEMMatrixSetsFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMatrixSetsList(FEMMatrixSetsFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixSetsPrx getFEMMatrixSets(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMatrixSetsIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixSetsPrx[] getFEMMatrixSetsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixSetsFields getFEMMatrixSetsFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMatrixSetsFields[] getFEMMatrixSetsFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMatrixSets(FEMMatrixSetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMatrixSetsFields(FEMMatrixSetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMConstraintCoef(FEMConstraintCoefFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMConstraintCoefList(FEMConstraintCoefFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintCoefPrx getFEMConstraintCoef(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMConstraintCoefIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintCoefPrx[] getFEMConstraintCoefList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintCoefFields getFEMConstraintCoefFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMConstraintCoefFields[] getFEMConstraintCoefFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMConstraintCoef(FEMConstraintCoefFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMConstraintCoefFields(FEMConstraintCoefFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSectionBox(FEMSectionBoxFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSectionBoxList(FEMSectionBoxFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionBoxPrx getFEMSectionBox(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSectionBoxIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionBoxPrx[] getFEMSectionBoxList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionBoxFields getFEMSectionBoxFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSectionBoxFields[] getFEMSectionBoxFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSectionBox(FEMSectionBoxFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSectionBoxFields(FEMSectionBoxFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMNKDisplForce(FEMNKDisplForceFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMNKDisplForceList(FEMNKDisplForceFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNKDisplForcePrx getFEMNKDisplForce(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMNKDisplForceIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNKDisplForcePrx[] getFEMNKDisplForceList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNKDisplForceFields getFEMNKDisplForceFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNKDisplForceFields[] getFEMNKDisplForceFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMNKDisplForce(FEMNKDisplForceFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMNKDisplForceFields(FEMNKDisplForceFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMPlasticStrainStress(FEMPlasticStrainStressFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMPlasticStrainStressList(FEMPlasticStrainStressFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticStrainStressPrx getFEMPlasticStrainStress(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMPlasticStrainStressIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticStrainStressPrx[] getFEMPlasticStrainStressList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticStrainStressFields getFEMPlasticStrainStressFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMPlasticStrainStressFields[] getFEMPlasticStrainStressFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMPlasticStrainStress(FEMPlasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMPlasticStrainStressFields(FEMPlasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellAxesOrthoDataList(FEMShellAxesOrthoDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoDataPrx getFEMShellAxesOrthoData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellAxesOrthoDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoDataPrx[] getFEMShellAxesOrthoDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoDataFields getFEMShellAxesOrthoDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellAxesOrthoDataFields[] getFEMShellAxesOrthoDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellAxesOrthoDataFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMGeneralNode(FEMGeneralNodeFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMGeneralNodeList(FEMGeneralNodeFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralNodePrx getFEMGeneralNode(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMGeneralNodeIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralNodePrx[] getFEMGeneralNodeList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralNodeFields getFEMGeneralNodeFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGeneralNodeFields[] getFEMGeneralNodeFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMGeneralNode(FEMGeneralNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMGeneralNodeFields(FEMGeneralNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMStrLines(FEMStrLinesFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMStrLinesList(FEMStrLinesFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMStrLinesPrx getFEMStrLines(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMStrLinesIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMStrLinesPrx[] getFEMStrLinesList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMStrLinesFields getFEMStrLinesFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMStrLinesFields[] getFEMStrLinesFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMStrLines(FEMStrLinesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMStrLinesFields(FEMStrLinesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMContactSurface(FEMContactSurfaceFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMContactSurfaceList(FEMContactSurfaceFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactSurfacePrx getFEMContactSurface(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMContactSurfaceIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactSurfacePrx[] getFEMContactSurfaceList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactSurfaceFields getFEMContactSurfaceFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMContactSurfaceFields[] getFEMContactSurfaceFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMContactSurface(FEMContactSurfaceFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMContactSurfaceFields(FEMContactSurfaceFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMMCForceData(FEMMCForceDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMMCForceDataList(FEMMCForceDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCForceDataPrx getFEMMCForceData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMMCForceDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCForceDataPrx[] getFEMMCForceDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCForceDataFields getFEMMCForceDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMMCForceDataFields[] getFEMMCForceDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMMCForceData(FEMMCForceDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMMCForceDataFields(FEMMCForceDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSpring(FEMSpringFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSpringList(FEMSpringFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringPrx getFEMSpring(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSpringIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringPrx[] getFEMSpringList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringFields getFEMSpringFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringFields[] getFEMSpringFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSpring(FEMSpringFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSpringFields(FEMSpringFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMSpringGroup(FEMSpringGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMSpringGroupList(FEMSpringGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringGroupPrx getFEMSpringGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMSpringGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringGroupPrx[] getFEMSpringGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringGroupFields getFEMSpringGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMSpringGroupFields[] getFEMSpringGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMSpringGroup(FEMSpringGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMSpringGroupFields(FEMSpringGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addFEMShellGroup(FEMShellGroupFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addFEMShellGroupList(FEMShellGroupFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellGroupPrx getFEMShellGroup(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getFEMShellGroupIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellGroupPrx[] getFEMShellGroupList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellGroupFields getFEMShellGroupFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMShellGroupFields[] getFEMShellGroupFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualFEMShellGroup(FEMShellGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFEMShellGroupFields(FEMShellGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addDaqUnit(DaqUnitFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addDaqUnitList(DaqUnitFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitPrx getDaqUnit(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getDaqUnitIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitPrx[] getDaqUnitList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitFields getDaqUnitFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitFields[] getDaqUnitFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualDaqUnit(DaqUnitFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setDaqUnitFields(DaqUnitFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addDaqUnitChannel(DaqUnitChannelFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addDaqUnitChannelList(DaqUnitChannelFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelPrx getDaqUnitChannel(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getDaqUnitChannelIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelPrx[] getDaqUnitChannelList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelFields getDaqUnitChannelFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelFields[] getDaqUnitChannelFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualDaqUnitChannel(DaqUnitChannelFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setDaqUnitChannelFields(DaqUnitChannelFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addSensor(SensorFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addSensorList(SensorFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorPrx getSensor(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getSensorIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorPrx[] getSensorList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorFields getSensorFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorFields[] getSensorFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualSensor(SensorFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setSensorFields(SensorFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addTransducer(TransducerFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addTransducerList(TransducerFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerPrx getTransducer(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getTransducerIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerPrx[] getTransducerList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerFields getTransducerFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerFields[] getTransducerFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualTransducer(TransducerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setTransducerFields(TransducerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addExperiment(ExperimentFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addExperimentList(ExperimentFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentPrx getExperiment(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getExperimentIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentPrx[] getExperimentList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentFields getExperimentFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentFields[] getExperimentFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualExperiment(ExperimentFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setExperimentFields(ExperimentFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addCycle(CycleFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addCycleList(CycleFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    CyclePrx getCycle(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getCycleIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    CyclePrx[] getCycleList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    CycleFields getCycleFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    CycleFields[] getCycleFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualCycle(CycleFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setCycleFields(CycleFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addSensorTimeData(SensorTimeDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addSensorTimeDataList(SensorTimeDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorTimeDataPrx getSensorTimeData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getSensorTimeDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorTimeDataPrx[] getSensorTimeDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorTimeDataFields getSensorTimeDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorTimeDataFields[] getSensorTimeDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualSensorTimeData(SensorTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setSensorTimeDataFields(SensorTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addTransducerTimeData(TransducerTimeDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addTransducerTimeDataList(TransducerTimeDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerTimeDataPrx getTransducerTimeData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getTransducerTimeDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerTimeDataPrx[] getTransducerTimeDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerTimeDataFields getTransducerTimeDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerTimeDataFields[] getTransducerTimeDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualTransducerTimeData(TransducerTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setTransducerTimeDataFields(TransducerTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addExperimentStructureData(ExperimentStructureDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addExperimentStructureDataList(ExperimentStructureDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentStructureDataPrx getExperimentStructureData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getExperimentStructureDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentStructureDataPrx[] getExperimentStructureDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentStructureDataFields getExperimentStructureDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ExperimentStructureDataFields[] getExperimentStructureDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualExperimentStructureData(ExperimentStructureDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setExperimentStructureDataFields(ExperimentStructureDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addTransducerCycleData(TransducerCycleDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addTransducerCycleDataList(TransducerCycleDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerCycleDataPrx getTransducerCycleData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getTransducerCycleDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerCycleDataPrx[] getTransducerCycleDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerCycleDataFields getTransducerCycleDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerCycleDataFields[] getTransducerCycleDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualTransducerCycleData(TransducerCycleDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setTransducerCycleDataFields(TransducerCycleDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addMappingMatrix(MappingMatrixFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addMappingMatrixList(MappingMatrixFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    MappingMatrixPrx getMappingMatrix(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getMappingMatrixIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    MappingMatrixPrx[] getMappingMatrixList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    MappingMatrixFields getMappingMatrixFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    MappingMatrixFields[] getMappingMatrixFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualMappingMatrix(MappingMatrixFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setMappingMatrixFields(MappingMatrixFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addDaqUnitChannelData(DaqUnitChannelDataFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addDaqUnitChannelDataList(DaqUnitChannelDataFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelDataPrx getDaqUnitChannelData(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getDaqUnitChannelDataIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelDataPrx[] getDaqUnitChannelDataList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelDataFields getDaqUnitChannelDataFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelDataFields[] getDaqUnitChannelDataFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualDaqUnitChannelData(DaqUnitChannelDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setDaqUnitChannelDataFields(DaqUnitChannelDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long addAccelMeas(AccelMeasFields fields, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] addAccelMeasList(AccelMeasFields[] fieldsList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    AccelMeasPrx getAccelMeas(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getAccelMeasIds(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    AccelMeasPrx[] getAccelMeasList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    AccelMeasFields getAccelMeasFields(long id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    AccelMeasFields[] getAccelMeasFieldsList(long[] ids, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] findEqualAccelMeas(AccelMeasFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setAccelMeasFields(AccelMeasFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
