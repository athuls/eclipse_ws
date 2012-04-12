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

public interface _SenStoreMngrOperationsNC
{
    long addStructure(StructureFields fields);

    long[] addStructureList(StructureFields[] fieldsList);

    StructurePrx getStructure(long id);

    long[] getStructureIds();

    StructurePrx[] getStructureList(long[] ids);

    StructureFields getStructureFields(long id);

    StructureFields[] getStructureFieldsList(long[] ids);

    long[] findEqualStructure(StructureFields fields, String[] fieldNames);

    void setStructureFields(StructureFields fields, String[] fieldNames);

    long addFEMDof(FEMDofFields fields);

    long[] addFEMDofList(FEMDofFields[] fieldsList);

    FEMDofPrx getFEMDof(long id);

    long[] getFEMDofIds();

    FEMDofPrx[] getFEMDofList(long[] ids);

    FEMDofFields getFEMDofFields(long id);

    FEMDofFields[] getFEMDofFieldsList(long[] ids);

    long[] findEqualFEMDof(FEMDofFields fields, String[] fieldNames);

    void setFEMDofFields(FEMDofFields fields, String[] fieldNames);

    long addFEMNodalMass(FEMNodalMassFields fields);

    long[] addFEMNodalMassList(FEMNodalMassFields[] fieldsList);

    FEMNodalMassPrx getFEMNodalMass(long id);

    long[] getFEMNodalMassIds();

    FEMNodalMassPrx[] getFEMNodalMassList(long[] ids);

    FEMNodalMassFields getFEMNodalMassFields(long id);

    FEMNodalMassFields[] getFEMNodalMassFieldsList(long[] ids);

    long[] findEqualFEMNodalMass(FEMNodalMassFields fields, String[] fieldNames);

    void setFEMNodalMassFields(FEMNodalMassFields fields, String[] fieldNames);

    long addFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields);

    long[] addFEMNLElasticStrainStressList(FEMNLElasticStrainStressFields[] fieldsList);

    FEMNLElasticStrainStressPrx getFEMNLElasticStrainStress(long id);

    long[] getFEMNLElasticStrainStressIds();

    FEMNLElasticStrainStressPrx[] getFEMNLElasticStrainStressList(long[] ids);

    FEMNLElasticStrainStressFields getFEMNLElasticStrainStressFields(long id);

    FEMNLElasticStrainStressFields[] getFEMNLElasticStrainStressFieldsList(long[] ids);

    long[] findEqualFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields, String[] fieldNames);

    void setFEMNLElasticStrainStressFields(FEMNLElasticStrainStressFields fields, String[] fieldNames);

    long addFEMBoundary(FEMBoundaryFields fields);

    long[] addFEMBoundaryList(FEMBoundaryFields[] fieldsList);

    FEMBoundaryPrx getFEMBoundary(long id);

    long[] getFEMBoundaryIds();

    FEMBoundaryPrx[] getFEMBoundaryList(long[] ids);

    FEMBoundaryFields getFEMBoundaryFields(long id);

    FEMBoundaryFields[] getFEMBoundaryFieldsList(long[] ids);

    long[] findEqualFEMBoundary(FEMBoundaryFields fields, String[] fieldNames);

    void setFEMBoundaryFields(FEMBoundaryFields fields, String[] fieldNames);

    long addFEMSectionPipe(FEMSectionPipeFields fields);

    long[] addFEMSectionPipeList(FEMSectionPipeFields[] fieldsList);

    FEMSectionPipePrx getFEMSectionPipe(long id);

    long[] getFEMSectionPipeIds();

    FEMSectionPipePrx[] getFEMSectionPipeList(long[] ids);

    FEMSectionPipeFields getFEMSectionPipeFields(long id);

    FEMSectionPipeFields[] getFEMSectionPipeFieldsList(long[] ids);

    long[] findEqualFEMSectionPipe(FEMSectionPipeFields fields, String[] fieldNames);

    void setFEMSectionPipeFields(FEMSectionPipeFields fields, String[] fieldNames);

    long addFEMCoordSystem(FEMCoordSystemFields fields);

    long[] addFEMCoordSystemList(FEMCoordSystemFields[] fieldsList);

    FEMCoordSystemPrx getFEMCoordSystem(long id);

    long[] getFEMCoordSystemIds();

    FEMCoordSystemPrx[] getFEMCoordSystemList(long[] ids);

    FEMCoordSystemFields getFEMCoordSystemFields(long id);

    FEMCoordSystemFields[] getFEMCoordSystemFieldsList(long[] ids);

    long[] findEqualFEMCoordSystem(FEMCoordSystemFields fields, String[] fieldNames);

    void setFEMCoordSystemFields(FEMCoordSystemFields fields, String[] fieldNames);

    long addFEMNode(FEMNodeFields fields);

    long[] addFEMNodeList(FEMNodeFields[] fieldsList);

    FEMNodePrx getFEMNode(long id);

    long[] getFEMNodeIds();

    FEMNodePrx[] getFEMNodeList(long[] ids);

    FEMNodeFields getFEMNodeFields(long id);

    FEMNodeFields[] getFEMNodeFieldsList(long[] ids);

    long[] findEqualFEMNode(FEMNodeFields fields, String[] fieldNames);

    void setFEMNodeFields(FEMNodeFields fields, String[] fieldNames);

    long addFEMTruss(FEMTrussFields fields);

    long[] addFEMTrussList(FEMTrussFields[] fieldsList);

    FEMTrussPrx getFEMTruss(long id);

    long[] getFEMTrussIds();

    FEMTrussPrx[] getFEMTrussList(long[] ids);

    FEMTrussFields getFEMTrussFields(long id);

    FEMTrussFields[] getFEMTrussFieldsList(long[] ids);

    long[] findEqualFEMTruss(FEMTrussFields fields, String[] fieldNames);

    void setFEMTrussFields(FEMTrussFields fields, String[] fieldNames);

    long addFEMTimeFunctionData(FEMTimeFunctionDataFields fields);

    long[] addFEMTimeFunctionDataList(FEMTimeFunctionDataFields[] fieldsList);

    FEMTimeFunctionDataPrx getFEMTimeFunctionData(long id);

    long[] getFEMTimeFunctionDataIds();

    FEMTimeFunctionDataPrx[] getFEMTimeFunctionDataList(long[] ids);

    FEMTimeFunctionDataFields getFEMTimeFunctionDataFields(long id);

    FEMTimeFunctionDataFields[] getFEMTimeFunctionDataFieldsList(long[] ids);

    long[] findEqualFEMTimeFunctionData(FEMTimeFunctionDataFields fields, String[] fieldNames);

    void setFEMTimeFunctionDataFields(FEMTimeFunctionDataFields fields, String[] fieldNames);

    long addFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields);

    long[] addFEMPlasticMlMaterialsList(FEMPlasticMlMaterialsFields[] fieldsList);

    FEMPlasticMlMaterialsPrx getFEMPlasticMlMaterials(long id);

    long[] getFEMPlasticMlMaterialsIds();

    FEMPlasticMlMaterialsPrx[] getFEMPlasticMlMaterialsList(long[] ids);

    FEMPlasticMlMaterialsFields getFEMPlasticMlMaterialsFields(long id);

    FEMPlasticMlMaterialsFields[] getFEMPlasticMlMaterialsFieldsList(long[] ids);

    long[] findEqualFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields, String[] fieldNames);

    void setFEMPlasticMlMaterialsFields(FEMPlasticMlMaterialsFields fields, String[] fieldNames);

    long addFEMPlateGroup(FEMPlateGroupFields fields);

    long[] addFEMPlateGroupList(FEMPlateGroupFields[] fieldsList);

    FEMPlateGroupPrx getFEMPlateGroup(long id);

    long[] getFEMPlateGroupIds();

    FEMPlateGroupPrx[] getFEMPlateGroupList(long[] ids);

    FEMPlateGroupFields getFEMPlateGroupFields(long id);

    FEMPlateGroupFields[] getFEMPlateGroupFieldsList(long[] ids);

    long[] findEqualFEMPlateGroup(FEMPlateGroupFields fields, String[] fieldNames);

    void setFEMPlateGroupFields(FEMPlateGroupFields fields, String[] fieldNames);

    long addFEMBeam(FEMBeamFields fields);

    long[] addFEMBeamList(FEMBeamFields[] fieldsList);

    FEMBeamPrx getFEMBeam(long id);

    long[] getFEMBeamIds();

    FEMBeamPrx[] getFEMBeamList(long[] ids);

    FEMBeamFields getFEMBeamFields(long id);

    FEMBeamFields[] getFEMBeamFieldsList(long[] ids);

    long[] findEqualFEMBeam(FEMBeamFields fields, String[] fieldNames);

    void setFEMBeamFields(FEMBeamFields fields, String[] fieldNames);

    long addFEMCurvMomentData(FEMCurvMomentDataFields fields);

    long[] addFEMCurvMomentDataList(FEMCurvMomentDataFields[] fieldsList);

    FEMCurvMomentDataPrx getFEMCurvMomentData(long id);

    long[] getFEMCurvMomentDataIds();

    FEMCurvMomentDataPrx[] getFEMCurvMomentDataList(long[] ids);

    FEMCurvMomentDataFields getFEMCurvMomentDataFields(long id);

    FEMCurvMomentDataFields[] getFEMCurvMomentDataFieldsList(long[] ids);

    long[] findEqualFEMCurvMomentData(FEMCurvMomentDataFields fields, String[] fieldNames);

    void setFEMCurvMomentDataFields(FEMCurvMomentDataFields fields, String[] fieldNames);

    long addFEMPropertysets(FEMPropertysetsFields fields);

    long[] addFEMPropertysetsList(FEMPropertysetsFields[] fieldsList);

    FEMPropertysetsPrx getFEMPropertysets(long id);

    long[] getFEMPropertysetsIds();

    FEMPropertysetsPrx[] getFEMPropertysetsList(long[] ids);

    FEMPropertysetsFields getFEMPropertysetsFields(long id);

    FEMPropertysetsFields[] getFEMPropertysetsFieldsList(long[] ids);

    long[] findEqualFEMPropertysets(FEMPropertysetsFields fields, String[] fieldNames);

    void setFEMPropertysetsFields(FEMPropertysetsFields fields, String[] fieldNames);

    long addFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields);

    long[] addFEMOrthotropicMaterialList(FEMOrthotropicMaterialFields[] fieldsList);

    FEMOrthotropicMaterialPrx getFEMOrthotropicMaterial(long id);

    long[] getFEMOrthotropicMaterialIds();

    FEMOrthotropicMaterialPrx[] getFEMOrthotropicMaterialList(long[] ids);

    FEMOrthotropicMaterialFields getFEMOrthotropicMaterialFields(long id);

    FEMOrthotropicMaterialFields[] getFEMOrthotropicMaterialFieldsList(long[] ids);

    long[] findEqualFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields, String[] fieldNames);

    void setFEMOrthotropicMaterialFields(FEMOrthotropicMaterialFields fields, String[] fieldNames);

    long addFEMAppliedLoads(FEMAppliedLoadsFields fields);

    long[] addFEMAppliedLoadsList(FEMAppliedLoadsFields[] fieldsList);

    FEMAppliedLoadsPrx getFEMAppliedLoads(long id);

    long[] getFEMAppliedLoadsIds();

    FEMAppliedLoadsPrx[] getFEMAppliedLoadsList(long[] ids);

    FEMAppliedLoadsFields getFEMAppliedLoadsFields(long id);

    FEMAppliedLoadsFields[] getFEMAppliedLoadsFieldsList(long[] ids);

    long[] findEqualFEMAppliedLoads(FEMAppliedLoadsFields fields, String[] fieldNames);

    void setFEMAppliedLoadsFields(FEMAppliedLoadsFields fields, String[] fieldNames);

    long addFEMThermoOrthData(FEMThermoOrthDataFields fields);

    long[] addFEMThermoOrthDataList(FEMThermoOrthDataFields[] fieldsList);

    FEMThermoOrthDataPrx getFEMThermoOrthData(long id);

    long[] getFEMThermoOrthDataIds();

    FEMThermoOrthDataPrx[] getFEMThermoOrthDataList(long[] ids);

    FEMThermoOrthDataFields getFEMThermoOrthDataFields(long id);

    FEMThermoOrthDataFields[] getFEMThermoOrthDataFieldsList(long[] ids);

    long[] findEqualFEMThermoOrthData(FEMThermoOrthDataFields fields, String[] fieldNames);

    void setFEMThermoOrthDataFields(FEMThermoOrthDataFields fields, String[] fieldNames);

    long addFEMContactPairs(FEMContactPairsFields fields);

    long[] addFEMContactPairsList(FEMContactPairsFields[] fieldsList);

    FEMContactPairsPrx getFEMContactPairs(long id);

    long[] getFEMContactPairsIds();

    FEMContactPairsPrx[] getFEMContactPairsList(long[] ids);

    FEMContactPairsFields getFEMContactPairsFields(long id);

    FEMContactPairsFields[] getFEMContactPairsFieldsList(long[] ids);

    long[] findEqualFEMContactPairs(FEMContactPairsFields fields, String[] fieldNames);

    void setFEMContactPairsFields(FEMContactPairsFields fields, String[] fieldNames);

    long addFEMGeneral(FEMGeneralFields fields);

    long[] addFEMGeneralList(FEMGeneralFields[] fieldsList);

    FEMGeneralPrx getFEMGeneral(long id);

    long[] getFEMGeneralIds();

    FEMGeneralPrx[] getFEMGeneralList(long[] ids);

    FEMGeneralFields getFEMGeneralFields(long id);

    FEMGeneralFields[] getFEMGeneralFieldsList(long[] ids);

    long[] findEqualFEMGeneral(FEMGeneralFields fields, String[] fieldNames);

    void setFEMGeneralFields(FEMGeneralFields fields, String[] fieldNames);

    long addFEMBeamNode(FEMBeamNodeFields fields);

    long[] addFEMBeamNodeList(FEMBeamNodeFields[] fieldsList);

    FEMBeamNodePrx getFEMBeamNode(long id);

    long[] getFEMBeamNodeIds();

    FEMBeamNodePrx[] getFEMBeamNodeList(long[] ids);

    FEMBeamNodeFields getFEMBeamNodeFields(long id);

    FEMBeamNodeFields[] getFEMBeamNodeFieldsList(long[] ids);

    long[] findEqualFEMBeamNode(FEMBeamNodeFields fields, String[] fieldNames);

    void setFEMBeamNodeFields(FEMBeamNodeFields fields, String[] fieldNames);

    long addFEMSectionRect(FEMSectionRectFields fields);

    long[] addFEMSectionRectList(FEMSectionRectFields[] fieldsList);

    FEMSectionRectPrx getFEMSectionRect(long id);

    long[] getFEMSectionRectIds();

    FEMSectionRectPrx[] getFEMSectionRectList(long[] ids);

    FEMSectionRectFields getFEMSectionRectFields(long id);

    FEMSectionRectFields[] getFEMSectionRectFieldsList(long[] ids);

    long[] findEqualFEMSectionRect(FEMSectionRectFields fields, String[] fieldNames);

    void setFEMSectionRectFields(FEMSectionRectFields fields, String[] fieldNames);

    long addFEMBeamLoad(FEMBeamLoadFields fields);

    long[] addFEMBeamLoadList(FEMBeamLoadFields[] fieldsList);

    FEMBeamLoadPrx getFEMBeamLoad(long id);

    long[] getFEMBeamLoadIds();

    FEMBeamLoadPrx[] getFEMBeamLoadList(long[] ids);

    FEMBeamLoadFields getFEMBeamLoadFields(long id);

    FEMBeamLoadFields[] getFEMBeamLoadFieldsList(long[] ids);

    long[] findEqualFEMBeamLoad(FEMBeamLoadFields fields, String[] fieldNames);

    void setFEMBeamLoadFields(FEMBeamLoadFields fields, String[] fieldNames);

    long addFEMLoadMassProportional(FEMLoadMassProportionalFields fields);

    long[] addFEMLoadMassProportionalList(FEMLoadMassProportionalFields[] fieldsList);

    FEMLoadMassProportionalPrx getFEMLoadMassProportional(long id);

    long[] getFEMLoadMassProportionalIds();

    FEMLoadMassProportionalPrx[] getFEMLoadMassProportionalList(long[] ids);

    FEMLoadMassProportionalFields getFEMLoadMassProportionalFields(long id);

    FEMLoadMassProportionalFields[] getFEMLoadMassProportionalFieldsList(long[] ids);

    long[] findEqualFEMLoadMassProportional(FEMLoadMassProportionalFields fields, String[] fieldNames);

    void setFEMLoadMassProportionalFields(FEMLoadMassProportionalFields fields, String[] fieldNames);

    long addFEMLink(FEMLinkFields fields);

    long[] addFEMLinkList(FEMLinkFields[] fieldsList);

    FEMLinkPrx getFEMLink(long id);

    long[] getFEMLinkIds();

    FEMLinkPrx[] getFEMLinkList(long[] ids);

    FEMLinkFields getFEMLinkFields(long id);

    FEMLinkFields[] getFEMLinkFieldsList(long[] ids);

    long[] findEqualFEMLink(FEMLinkFields fields, String[] fieldNames);

    void setFEMLinkFields(FEMLinkFields fields, String[] fieldNames);

    long addFEMAxesNode(FEMAxesNodeFields fields);

    long[] addFEMAxesNodeList(FEMAxesNodeFields[] fieldsList);

    FEMAxesNodePrx getFEMAxesNode(long id);

    long[] getFEMAxesNodeIds();

    FEMAxesNodePrx[] getFEMAxesNodeList(long[] ids);

    FEMAxesNodeFields getFEMAxesNodeFields(long id);

    FEMAxesNodeFields[] getFEMAxesNodeFieldsList(long[] ids);

    long[] findEqualFEMAxesNode(FEMAxesNodeFields fields, String[] fieldNames);

    void setFEMAxesNodeFields(FEMAxesNodeFields fields, String[] fieldNames);

    long addFEMNMTimeMass(FEMNMTimeMassFields fields);

    long[] addFEMNMTimeMassList(FEMNMTimeMassFields[] fieldsList);

    FEMNMTimeMassPrx getFEMNMTimeMass(long id);

    long[] getFEMNMTimeMassIds();

    FEMNMTimeMassPrx[] getFEMNMTimeMassList(long[] ids);

    FEMNMTimeMassFields getFEMNMTimeMassFields(long id);

    FEMNMTimeMassFields[] getFEMNMTimeMassFieldsList(long[] ids);

    long[] findEqualFEMNMTimeMass(FEMNMTimeMassFields fields, String[] fieldNames);

    void setFEMNMTimeMassFields(FEMNMTimeMassFields fields, String[] fieldNames);

    long addFEMAppliedDisplacement(FEMAppliedDisplacementFields fields);

    long[] addFEMAppliedDisplacementList(FEMAppliedDisplacementFields[] fieldsList);

    FEMAppliedDisplacementPrx getFEMAppliedDisplacement(long id);

    long[] getFEMAppliedDisplacementIds();

    FEMAppliedDisplacementPrx[] getFEMAppliedDisplacementList(long[] ids);

    FEMAppliedDisplacementFields getFEMAppliedDisplacementFields(long id);

    FEMAppliedDisplacementFields[] getFEMAppliedDisplacementFieldsList(long[] ids);

    long[] findEqualFEMAppliedDisplacement(FEMAppliedDisplacementFields fields, String[] fieldNames);

    void setFEMAppliedDisplacementFields(FEMAppliedDisplacementFields fields, String[] fieldNames);

    long addFEMTimeFunctions(FEMTimeFunctionsFields fields);

    long[] addFEMTimeFunctionsList(FEMTimeFunctionsFields[] fieldsList);

    FEMTimeFunctionsPrx getFEMTimeFunctions(long id);

    long[] getFEMTimeFunctionsIds();

    FEMTimeFunctionsPrx[] getFEMTimeFunctionsList(long[] ids);

    FEMTimeFunctionsFields getFEMTimeFunctionsFields(long id);

    FEMTimeFunctionsFields[] getFEMTimeFunctionsFieldsList(long[] ids);

    long[] findEqualFEMTimeFunctions(FEMTimeFunctionsFields fields, String[] fieldNames);

    void setFEMTimeFunctionsFields(FEMTimeFunctionsFields fields, String[] fieldNames);

    long addFEMForceStrainData(FEMForceStrainDataFields fields);

    long[] addFEMForceStrainDataList(FEMForceStrainDataFields[] fieldsList);

    FEMForceStrainDataPrx getFEMForceStrainData(long id);

    long[] getFEMForceStrainDataIds();

    FEMForceStrainDataPrx[] getFEMForceStrainDataList(long[] ids);

    FEMForceStrainDataFields getFEMForceStrainDataFields(long id);

    FEMForceStrainDataFields[] getFEMForceStrainDataFieldsList(long[] ids);

    long[] findEqualFEMForceStrainData(FEMForceStrainDataFields fields, String[] fieldNames);

    void setFEMForceStrainDataFields(FEMForceStrainDataFields fields, String[] fieldNames);

    long addFEMSkewDOF(FEMSkewDOFFields fields);

    long[] addFEMSkewDOFList(FEMSkewDOFFields[] fieldsList);

    FEMSkewDOFPrx getFEMSkewDOF(long id);

    long[] getFEMSkewDOFIds();

    FEMSkewDOFPrx[] getFEMSkewDOFList(long[] ids);

    FEMSkewDOFFields getFEMSkewDOFFields(long id);

    FEMSkewDOFFields[] getFEMSkewDOFFieldsList(long[] ids);

    long[] findEqualFEMSkewDOF(FEMSkewDOFFields fields, String[] fieldNames);

    void setFEMSkewDOFFields(FEMSkewDOFFields fields, String[] fieldNames);

    long addFEMSectionI(FEMSectionIFields fields);

    long[] addFEMSectionIList(FEMSectionIFields[] fieldsList);

    FEMSectionIPrx getFEMSectionI(long id);

    long[] getFEMSectionIIds();

    FEMSectionIPrx[] getFEMSectionIList(long[] ids);

    FEMSectionIFields getFEMSectionIFields(long id);

    FEMSectionIFields[] getFEMSectionIFieldsList(long[] ids);

    long[] findEqualFEMSectionI(FEMSectionIFields fields, String[] fieldNames);

    void setFEMSectionIFields(FEMSectionIFields fields, String[] fieldNames);

    long addFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields);

    long[] addFEMPlasticBilinearMaterialList(FEMPlasticBilinearMaterialFields[] fieldsList);

    FEMPlasticBilinearMaterialPrx getFEMPlasticBilinearMaterial(long id);

    long[] getFEMPlasticBilinearMaterialIds();

    FEMPlasticBilinearMaterialPrx[] getFEMPlasticBilinearMaterialList(long[] ids);

    FEMPlasticBilinearMaterialFields getFEMPlasticBilinearMaterialFields(long id);

    FEMPlasticBilinearMaterialFields[] getFEMPlasticBilinearMaterialFieldsList(long[] ids);

    long[] findEqualFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields, String[] fieldNames);

    void setFEMPlasticBilinearMaterialFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames);

    long addFEMMTForceData(FEMMTForceDataFields fields);

    long[] addFEMMTForceDataList(FEMMTForceDataFields[] fieldsList);

    FEMMTForceDataPrx getFEMMTForceData(long id);

    long[] getFEMMTForceDataIds();

    FEMMTForceDataPrx[] getFEMMTForceDataList(long[] ids);

    FEMMTForceDataFields getFEMMTForceDataFields(long id);

    FEMMTForceDataFields[] getFEMMTForceDataFieldsList(long[] ids);

    long[] findEqualFEMMTForceData(FEMMTForceDataFields fields, String[] fieldNames);

    void setFEMMTForceDataFields(FEMMTForceDataFields fields, String[] fieldNames);

    long addFEMShellPressure(FEMShellPressureFields fields);

    long[] addFEMShellPressureList(FEMShellPressureFields[] fieldsList);

    FEMShellPressurePrx getFEMShellPressure(long id);

    long[] getFEMShellPressureIds();

    FEMShellPressurePrx[] getFEMShellPressureList(long[] ids);

    FEMShellPressureFields getFEMShellPressureFields(long id);

    FEMShellPressureFields[] getFEMShellPressureFieldsList(long[] ids);

    long[] findEqualFEMShellPressure(FEMShellPressureFields fields, String[] fieldNames);

    void setFEMShellPressureFields(FEMShellPressureFields fields, String[] fieldNames);

    long addFEMMatrices(FEMMatricesFields fields);

    long[] addFEMMatricesList(FEMMatricesFields[] fieldsList);

    FEMMatricesPrx getFEMMatrices(long id);

    long[] getFEMMatricesIds();

    FEMMatricesPrx[] getFEMMatricesList(long[] ids);

    FEMMatricesFields getFEMMatricesFields(long id);

    FEMMatricesFields[] getFEMMatricesFieldsList(long[] ids);

    long[] findEqualFEMMatrices(FEMMatricesFields fields, String[] fieldNames);

    void setFEMMatricesFields(FEMMatricesFields fields, String[] fieldNames);

    long addFEMDamping(FEMDampingFields fields);

    long[] addFEMDampingList(FEMDampingFields[] fieldsList);

    FEMDampingPrx getFEMDamping(long id);

    long[] getFEMDampingIds();

    FEMDampingPrx[] getFEMDampingList(long[] ids);

    FEMDampingFields getFEMDampingFields(long id);

    FEMDampingFields[] getFEMDampingFieldsList(long[] ids);

    long[] findEqualFEMDamping(FEMDampingFields fields, String[] fieldNames);

    void setFEMDampingFields(FEMDampingFields fields, String[] fieldNames);

    long addFEMMaterial(FEMMaterialFields fields);

    long[] addFEMMaterialList(FEMMaterialFields[] fieldsList);

    FEMMaterialPrx getFEMMaterial(long id);

    long[] getFEMMaterialIds();

    FEMMaterialPrx[] getFEMMaterialList(long[] ids);

    FEMMaterialFields getFEMMaterialFields(long id);

    FEMMaterialFields[] getFEMMaterialFieldsList(long[] ids);

    long[] findEqualFEMMaterial(FEMMaterialFields fields, String[] fieldNames);

    void setFEMMaterialFields(FEMMaterialFields fields, String[] fieldNames);

    long addFEMMatrixData(FEMMatrixDataFields fields);

    long[] addFEMMatrixDataList(FEMMatrixDataFields[] fieldsList);

    FEMMatrixDataPrx getFEMMatrixData(long id);

    long[] getFEMMatrixDataIds();

    FEMMatrixDataPrx[] getFEMMatrixDataList(long[] ids);

    FEMMatrixDataFields getFEMMatrixDataFields(long id);

    FEMMatrixDataFields[] getFEMMatrixDataFieldsList(long[] ids);

    long[] findEqualFEMMatrixData(FEMMatrixDataFields fields, String[] fieldNames);

    void setFEMMatrixDataFields(FEMMatrixDataFields fields, String[] fieldNames);

    long addFEMShellAxesOrtho(FEMShellAxesOrthoFields fields);

    long[] addFEMShellAxesOrthoList(FEMShellAxesOrthoFields[] fieldsList);

    FEMShellAxesOrthoPrx getFEMShellAxesOrtho(long id);

    long[] getFEMShellAxesOrthoIds();

    FEMShellAxesOrthoPrx[] getFEMShellAxesOrthoList(long[] ids);

    FEMShellAxesOrthoFields getFEMShellAxesOrthoFields(long id);

    FEMShellAxesOrthoFields[] getFEMShellAxesOrthoFieldsList(long[] ids);

    long[] findEqualFEMShellAxesOrtho(FEMShellAxesOrthoFields fields, String[] fieldNames);

    void setFEMShellAxesOrthoFields(FEMShellAxesOrthoFields fields, String[] fieldNames);

    long addFEMEndreleases(FEMEndreleasesFields fields);

    long[] addFEMEndreleasesList(FEMEndreleasesFields[] fieldsList);

    FEMEndreleasesPrx getFEMEndreleases(long id);

    long[] getFEMEndreleasesIds();

    FEMEndreleasesPrx[] getFEMEndreleasesList(long[] ids);

    FEMEndreleasesFields getFEMEndreleasesFields(long id);

    FEMEndreleasesFields[] getFEMEndreleasesFieldsList(long[] ids);

    long[] findEqualFEMEndreleases(FEMEndreleasesFields fields, String[] fieldNames);

    void setFEMEndreleasesFields(FEMEndreleasesFields fields, String[] fieldNames);

    long addFEMTrussGroup(FEMTrussGroupFields fields);

    long[] addFEMTrussGroupList(FEMTrussGroupFields[] fieldsList);

    FEMTrussGroupPrx getFEMTrussGroup(long id);

    long[] getFEMTrussGroupIds();

    FEMTrussGroupPrx[] getFEMTrussGroupList(long[] ids);

    FEMTrussGroupFields getFEMTrussGroupFields(long id);

    FEMTrussGroupFields[] getFEMTrussGroupFieldsList(long[] ids);

    long[] findEqualFEMTrussGroup(FEMTrussGroupFields fields, String[] fieldNames);

    void setFEMTrussGroupFields(FEMTrussGroupFields fields, String[] fieldNames);

    long addFEMInitialTemperature(FEMInitialTemperatureFields fields);

    long[] addFEMInitialTemperatureList(FEMInitialTemperatureFields[] fieldsList);

    FEMInitialTemperaturePrx getFEMInitialTemperature(long id);

    long[] getFEMInitialTemperatureIds();

    FEMInitialTemperaturePrx[] getFEMInitialTemperatureList(long[] ids);

    FEMInitialTemperatureFields getFEMInitialTemperatureFields(long id);

    FEMInitialTemperatureFields[] getFEMInitialTemperatureFieldsList(long[] ids);

    long[] findEqualFEMInitialTemperature(FEMInitialTemperatureFields fields, String[] fieldNames);

    void setFEMInitialTemperatureFields(FEMInitialTemperatureFields fields, String[] fieldNames);

    long addFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields);

    long[] addFEMThermoIsoMaterialsList(FEMThermoIsoMaterialsFields[] fieldsList);

    FEMThermoIsoMaterialsPrx getFEMThermoIsoMaterials(long id);

    long[] getFEMThermoIsoMaterialsIds();

    FEMThermoIsoMaterialsPrx[] getFEMThermoIsoMaterialsList(long[] ids);

    FEMThermoIsoMaterialsFields getFEMThermoIsoMaterialsFields(long id);

    FEMThermoIsoMaterialsFields[] getFEMThermoIsoMaterialsFieldsList(long[] ids);

    long[] findEqualFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields, String[] fieldNames);

    void setFEMThermoIsoMaterialsFields(FEMThermoIsoMaterialsFields fields, String[] fieldNames);

    long addFEMThermoIsoData(FEMThermoIsoDataFields fields);

    long[] addFEMThermoIsoDataList(FEMThermoIsoDataFields[] fieldsList);

    FEMThermoIsoDataPrx getFEMThermoIsoData(long id);

    long[] getFEMThermoIsoDataIds();

    FEMThermoIsoDataPrx[] getFEMThermoIsoDataList(long[] ids);

    FEMThermoIsoDataFields getFEMThermoIsoDataFields(long id);

    FEMThermoIsoDataFields[] getFEMThermoIsoDataFieldsList(long[] ids);

    long[] findEqualFEMThermoIsoData(FEMThermoIsoDataFields fields, String[] fieldNames);

    void setFEMThermoIsoDataFields(FEMThermoIsoDataFields fields, String[] fieldNames);

    long addFEMContactGroup3(FEMContactGroup3Fields fields);

    long[] addFEMContactGroup3List(FEMContactGroup3Fields[] fieldsList);

    FEMContactGroup3Prx getFEMContactGroup3(long id);

    long[] getFEMContactGroup3Ids();

    FEMContactGroup3Prx[] getFEMContactGroup3List(long[] ids);

    FEMContactGroup3Fields getFEMContactGroup3Fields(long id);

    FEMContactGroup3Fields[] getFEMContactGroup3FieldsList(long[] ids);

    long[] findEqualFEMContactGroup3(FEMContactGroup3Fields fields, String[] fieldNames);

    void setFEMContactGroup3Fields(FEMContactGroup3Fields fields, String[] fieldNames);

    long addFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields);

    long[] addFEMNLElasticMaterialsList(FEMNLElasticMaterialsFields[] fieldsList);

    FEMNLElasticMaterialsPrx getFEMNLElasticMaterials(long id);

    long[] getFEMNLElasticMaterialsIds();

    FEMNLElasticMaterialsPrx[] getFEMNLElasticMaterialsList(long[] ids);

    FEMNLElasticMaterialsFields getFEMNLElasticMaterialsFields(long id);

    FEMNLElasticMaterialsFields[] getFEMNLElasticMaterialsFieldsList(long[] ids);

    long[] findEqualFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields, String[] fieldNames);

    void setFEMNLElasticMaterialsFields(FEMNLElasticMaterialsFields fields, String[] fieldNames);

    long addFEMPlate(FEMPlateFields fields);

    long[] addFEMPlateList(FEMPlateFields[] fieldsList);

    FEMPlatePrx getFEMPlate(long id);

    long[] getFEMPlateIds();

    FEMPlatePrx[] getFEMPlateList(long[] ids);

    FEMPlateFields getFEMPlateFields(long id);

    FEMPlateFields[] getFEMPlateFieldsList(long[] ids);

    long[] findEqualFEMPlate(FEMPlateFields fields, String[] fieldNames);

    void setFEMPlateFields(FEMPlateFields fields, String[] fieldNames);

    long addFEMIsoBeam(FEMIsoBeamFields fields);

    long[] addFEMIsoBeamList(FEMIsoBeamFields[] fieldsList);

    FEMIsoBeamPrx getFEMIsoBeam(long id);

    long[] getFEMIsoBeamIds();

    FEMIsoBeamPrx[] getFEMIsoBeamList(long[] ids);

    FEMIsoBeamFields getFEMIsoBeamFields(long id);

    FEMIsoBeamFields[] getFEMIsoBeamFieldsList(long[] ids);

    long[] findEqualFEMIsoBeam(FEMIsoBeamFields fields, String[] fieldNames);

    void setFEMIsoBeamFields(FEMIsoBeamFields fields, String[] fieldNames);

    long addFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields);

    long[] addFEMAppliedConcentratedLoadList(FEMAppliedConcentratedLoadFields[] fieldsList);

    FEMAppliedConcentratedLoadPrx getFEMAppliedConcentratedLoad(long id);

    long[] getFEMAppliedConcentratedLoadIds();

    FEMAppliedConcentratedLoadPrx[] getFEMAppliedConcentratedLoadList(long[] ids);

    FEMAppliedConcentratedLoadFields getFEMAppliedConcentratedLoadFields(long id);

    FEMAppliedConcentratedLoadFields[] getFEMAppliedConcentratedLoadFieldsList(long[] ids);

    long[] findEqualFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields, String[] fieldNames);

    void setFEMAppliedConcentratedLoadFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames);

    long addFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields);

    long[] addFEMTwoDSolidGroupList(FEMTwoDSolidGroupFields[] fieldsList);

    FEMTwoDSolidGroupPrx getFEMTwoDSolidGroup(long id);

    long[] getFEMTwoDSolidGroupIds();

    FEMTwoDSolidGroupPrx[] getFEMTwoDSolidGroupList(long[] ids);

    FEMTwoDSolidGroupFields getFEMTwoDSolidGroupFields(long id);

    FEMTwoDSolidGroupFields[] getFEMTwoDSolidGroupFieldsList(long[] ids);

    long[] findEqualFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields, String[] fieldNames);

    void setFEMTwoDSolidGroupFields(FEMTwoDSolidGroupFields fields, String[] fieldNames);

    long addFEMGroup(FEMGroupFields fields);

    long[] addFEMGroupList(FEMGroupFields[] fieldsList);

    FEMGroupPrx getFEMGroup(long id);

    long[] getFEMGroupIds();

    FEMGroupPrx[] getFEMGroupList(long[] ids);

    FEMGroupFields getFEMGroupFields(long id);

    FEMGroupFields[] getFEMGroupFieldsList(long[] ids);

    long[] findEqualFEMGroup(FEMGroupFields fields, String[] fieldNames);

    void setFEMGroupFields(FEMGroupFields fields, String[] fieldNames);

    long addFEMProperties(FEMPropertiesFields fields);

    long[] addFEMPropertiesList(FEMPropertiesFields[] fieldsList);

    FEMPropertiesPrx getFEMProperties(long id);

    long[] getFEMPropertiesIds();

    FEMPropertiesPrx[] getFEMPropertiesList(long[] ids);

    FEMPropertiesFields getFEMPropertiesFields(long id);

    FEMPropertiesFields[] getFEMPropertiesFieldsList(long[] ids);

    long[] findEqualFEMProperties(FEMPropertiesFields fields, String[] fieldNames);

    void setFEMPropertiesFields(FEMPropertiesFields fields, String[] fieldNames);

    long addFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields);

    long[] addFEMThreeDSolidGroupList(FEMThreeDSolidGroupFields[] fieldsList);

    FEMThreeDSolidGroupPrx getFEMThreeDSolidGroup(long id);

    long[] getFEMThreeDSolidGroupIds();

    FEMThreeDSolidGroupPrx[] getFEMThreeDSolidGroupList(long[] ids);

    FEMThreeDSolidGroupFields getFEMThreeDSolidGroupFields(long id);

    FEMThreeDSolidGroupFields[] getFEMThreeDSolidGroupFieldsList(long[] ids);

    long[] findEqualFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields, String[] fieldNames);

    void setFEMThreeDSolidGroupFields(FEMThreeDSolidGroupFields fields, String[] fieldNames);

    long addFEMThreeDSolid(FEMThreeDSolidFields fields);

    long[] addFEMThreeDSolidList(FEMThreeDSolidFields[] fieldsList);

    FEMThreeDSolidPrx getFEMThreeDSolid(long id);

    long[] getFEMThreeDSolidIds();

    FEMThreeDSolidPrx[] getFEMThreeDSolidList(long[] ids);

    FEMThreeDSolidFields getFEMThreeDSolidFields(long id);

    FEMThreeDSolidFields[] getFEMThreeDSolidFieldsList(long[] ids);

    long[] findEqualFEMThreeDSolid(FEMThreeDSolidFields fields, String[] fieldNames);

    void setFEMThreeDSolidFields(FEMThreeDSolidFields fields, String[] fieldNames);

    long addFEMSectionProp(FEMSectionPropFields fields);

    long[] addFEMSectionPropList(FEMSectionPropFields[] fieldsList);

    FEMSectionPropPrx getFEMSectionProp(long id);

    long[] getFEMSectionPropIds();

    FEMSectionPropPrx[] getFEMSectionPropList(long[] ids);

    FEMSectionPropFields getFEMSectionPropFields(long id);

    FEMSectionPropFields[] getFEMSectionPropFieldsList(long[] ids);

    long[] findEqualFEMSectionProp(FEMSectionPropFields fields, String[] fieldNames);

    void setFEMSectionPropFields(FEMSectionPropFields fields, String[] fieldNames);

    long addFEMElasticMaterial(FEMElasticMaterialFields fields);

    long[] addFEMElasticMaterialList(FEMElasticMaterialFields[] fieldsList);

    FEMElasticMaterialPrx getFEMElasticMaterial(long id);

    long[] getFEMElasticMaterialIds();

    FEMElasticMaterialPrx[] getFEMElasticMaterialList(long[] ids);

    FEMElasticMaterialFields getFEMElasticMaterialFields(long id);

    FEMElasticMaterialFields[] getFEMElasticMaterialFieldsList(long[] ids);

    long[] findEqualFEMElasticMaterial(FEMElasticMaterialFields fields, String[] fieldNames);

    void setFEMElasticMaterialFields(FEMElasticMaterialFields fields, String[] fieldNames);

    long addFEMPoints(FEMPointsFields fields);

    long[] addFEMPointsList(FEMPointsFields[] fieldsList);

    FEMPointsPrx getFEMPoints(long id);

    long[] getFEMPointsIds();

    FEMPointsPrx[] getFEMPointsList(long[] ids);

    FEMPointsFields getFEMPointsFields(long id);

    FEMPointsFields[] getFEMPointsFieldsList(long[] ids);

    long[] findEqualFEMPoints(FEMPointsFields fields, String[] fieldNames);

    void setFEMPointsFields(FEMPointsFields fields, String[] fieldNames);

    long addFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields);

    long[] addFEMThermoOrthMaterialsList(FEMThermoOrthMaterialsFields[] fieldsList);

    FEMThermoOrthMaterialsPrx getFEMThermoOrthMaterials(long id);

    long[] getFEMThermoOrthMaterialsIds();

    FEMThermoOrthMaterialsPrx[] getFEMThermoOrthMaterialsList(long[] ids);

    FEMThermoOrthMaterialsFields getFEMThermoOrthMaterialsFields(long id);

    FEMThermoOrthMaterialsFields[] getFEMThermoOrthMaterialsFieldsList(long[] ids);

    long[] findEqualFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields, String[] fieldNames);

    void setFEMThermoOrthMaterialsFields(FEMThermoOrthMaterialsFields fields, String[] fieldNames);

    long addFEMConstraints(FEMConstraintsFields fields);

    long[] addFEMConstraintsList(FEMConstraintsFields[] fieldsList);

    FEMConstraintsPrx getFEMConstraints(long id);

    long[] getFEMConstraintsIds();

    FEMConstraintsPrx[] getFEMConstraintsList(long[] ids);

    FEMConstraintsFields getFEMConstraintsFields(long id);

    FEMConstraintsFields[] getFEMConstraintsFieldsList(long[] ids);

    long[] findEqualFEMConstraints(FEMConstraintsFields fields, String[] fieldNames);

    void setFEMConstraintsFields(FEMConstraintsFields fields, String[] fieldNames);

    long addFEMMCrigidities(FEMMCrigiditiesFields fields);

    long[] addFEMMCrigiditiesList(FEMMCrigiditiesFields[] fieldsList);

    FEMMCrigiditiesPrx getFEMMCrigidities(long id);

    long[] getFEMMCrigiditiesIds();

    FEMMCrigiditiesPrx[] getFEMMCrigiditiesList(long[] ids);

    FEMMCrigiditiesFields getFEMMCrigiditiesFields(long id);

    FEMMCrigiditiesFields[] getFEMMCrigiditiesFieldsList(long[] ids);

    long[] findEqualFEMMCrigidities(FEMMCrigiditiesFields fields, String[] fieldNames);

    void setFEMMCrigiditiesFields(FEMMCrigiditiesFields fields, String[] fieldNames);

    long addFEMSkeySysNode(FEMSkeySysNodeFields fields);

    long[] addFEMSkeySysNodeList(FEMSkeySysNodeFields[] fieldsList);

    FEMSkeySysNodePrx getFEMSkeySysNode(long id);

    long[] getFEMSkeySysNodeIds();

    FEMSkeySysNodePrx[] getFEMSkeySysNodeList(long[] ids);

    FEMSkeySysNodeFields getFEMSkeySysNodeFields(long id);

    FEMSkeySysNodeFields[] getFEMSkeySysNodeFieldsList(long[] ids);

    long[] findEqualFEMSkeySysNode(FEMSkeySysNodeFields fields, String[] fieldNames);

    void setFEMSkeySysNodeFields(FEMSkeySysNodeFields fields, String[] fieldNames);

    long addFEMIsoBeamGroup(FEMIsoBeamGroupFields fields);

    long[] addFEMIsoBeamGroupList(FEMIsoBeamGroupFields[] fieldsList);

    FEMIsoBeamGroupPrx getFEMIsoBeamGroup(long id);

    long[] getFEMIsoBeamGroupIds();

    FEMIsoBeamGroupPrx[] getFEMIsoBeamGroupList(long[] ids);

    FEMIsoBeamGroupFields getFEMIsoBeamGroupFields(long id);

    FEMIsoBeamGroupFields[] getFEMIsoBeamGroupFieldsList(long[] ids);

    long[] findEqualFEMIsoBeamGroup(FEMIsoBeamGroupFields fields, String[] fieldNames);

    void setFEMIsoBeamGroupFields(FEMIsoBeamGroupFields fields, String[] fieldNames);

    long addFEMShellDOF(FEMShellDOFFields fields);

    long[] addFEMShellDOFList(FEMShellDOFFields[] fieldsList);

    FEMShellDOFPrx getFEMShellDOF(long id);

    long[] getFEMShellDOFIds();

    FEMShellDOFPrx[] getFEMShellDOFList(long[] ids);

    FEMShellDOFFields getFEMShellDOFFields(long id);

    FEMShellDOFFields[] getFEMShellDOFFieldsList(long[] ids);

    long[] findEqualFEMShellDOF(FEMShellDOFFields fields, String[] fieldNames);

    void setFEMShellDOFFields(FEMShellDOFFields fields, String[] fieldNames);

    long addFEMCrossSections(FEMCrossSectionsFields fields);

    long[] addFEMCrossSectionsList(FEMCrossSectionsFields[] fieldsList);

    FEMCrossSectionsPrx getFEMCrossSections(long id);

    long[] getFEMCrossSectionsIds();

    FEMCrossSectionsPrx[] getFEMCrossSectionsList(long[] ids);

    FEMCrossSectionsFields getFEMCrossSectionsFields(long id);

    FEMCrossSectionsFields[] getFEMCrossSectionsFieldsList(long[] ids);

    long[] findEqualFEMCrossSections(FEMCrossSectionsFields fields, String[] fieldNames);

    void setFEMCrossSectionsFields(FEMCrossSectionsFields fields, String[] fieldNames);

    long addFEMTwistMomentData(FEMTwistMomentDataFields fields);

    long[] addFEMTwistMomentDataList(FEMTwistMomentDataFields[] fieldsList);

    FEMTwistMomentDataPrx getFEMTwistMomentData(long id);

    long[] getFEMTwistMomentDataIds();

    FEMTwistMomentDataPrx[] getFEMTwistMomentDataList(long[] ids);

    FEMTwistMomentDataFields getFEMTwistMomentDataFields(long id);

    FEMTwistMomentDataFields[] getFEMTwistMomentDataFieldsList(long[] ids);

    long[] findEqualFEMTwistMomentData(FEMTwistMomentDataFields fields, String[] fieldNames);

    void setFEMTwistMomentDataFields(FEMTwistMomentDataFields fields, String[] fieldNames);

    long addFEMShell(FEMShellFields fields);

    long[] addFEMShellList(FEMShellFields[] fieldsList);

    FEMShellPrx getFEMShell(long id);

    long[] getFEMShellIds();

    FEMShellPrx[] getFEMShellList(long[] ids);

    FEMShellFields getFEMShellFields(long id);

    FEMShellFields[] getFEMShellFieldsList(long[] ids);

    long[] findEqualFEMShell(FEMShellFields fields, String[] fieldNames);

    void setFEMShellFields(FEMShellFields fields, String[] fieldNames);

    long addFEMNTNContact(FEMNTNContactFields fields);

    long[] addFEMNTNContactList(FEMNTNContactFields[] fieldsList);

    FEMNTNContactPrx getFEMNTNContact(long id);

    long[] getFEMNTNContactIds();

    FEMNTNContactPrx[] getFEMNTNContactList(long[] ids);

    FEMNTNContactFields getFEMNTNContactFields(long id);

    FEMNTNContactFields[] getFEMNTNContactFieldsList(long[] ids);

    long[] findEqualFEMNTNContact(FEMNTNContactFields fields, String[] fieldNames);

    void setFEMNTNContactFields(FEMNTNContactFields fields, String[] fieldNames);

    long addFEMShellLayer(FEMShellLayerFields fields);

    long[] addFEMShellLayerList(FEMShellLayerFields[] fieldsList);

    FEMShellLayerPrx getFEMShellLayer(long id);

    long[] getFEMShellLayerIds();

    FEMShellLayerPrx[] getFEMShellLayerList(long[] ids);

    FEMShellLayerFields getFEMShellLayerFields(long id);

    FEMShellLayerFields[] getFEMShellLayerFieldsList(long[] ids);

    long[] findEqualFEMShellLayer(FEMShellLayerFields fields, String[] fieldNames);

    void setFEMShellLayerFields(FEMShellLayerFields fields, String[] fieldNames);

    long addFEMSkewSysAngles(FEMSkewSysAnglesFields fields);

    long[] addFEMSkewSysAnglesList(FEMSkewSysAnglesFields[] fieldsList);

    FEMSkewSysAnglesPrx getFEMSkewSysAngles(long id);

    long[] getFEMSkewSysAnglesIds();

    FEMSkewSysAnglesPrx[] getFEMSkewSysAnglesList(long[] ids);

    FEMSkewSysAnglesFields getFEMSkewSysAnglesFields(long id);

    FEMSkewSysAnglesFields[] getFEMSkewSysAnglesFieldsList(long[] ids);

    long[] findEqualFEMSkewSysAngles(FEMSkewSysAnglesFields fields, String[] fieldNames);

    void setFEMSkewSysAnglesFields(FEMSkewSysAnglesFields fields, String[] fieldNames);

    long addFEMGroundMotionRecord(FEMGroundMotionRecordFields fields);

    long[] addFEMGroundMotionRecordList(FEMGroundMotionRecordFields[] fieldsList);

    FEMGroundMotionRecordPrx getFEMGroundMotionRecord(long id);

    long[] getFEMGroundMotionRecordIds();

    FEMGroundMotionRecordPrx[] getFEMGroundMotionRecordList(long[] ids);

    FEMGroundMotionRecordFields getFEMGroundMotionRecordFields(long id);

    FEMGroundMotionRecordFields[] getFEMGroundMotionRecordFieldsList(long[] ids);

    long[] findEqualFEMGroundMotionRecord(FEMGroundMotionRecordFields fields, String[] fieldNames);

    void setFEMGroundMotionRecordFields(FEMGroundMotionRecordFields fields, String[] fieldNames);

    long addFEMGeneralGroup(FEMGeneralGroupFields fields);

    long[] addFEMGeneralGroupList(FEMGeneralGroupFields[] fieldsList);

    FEMGeneralGroupPrx getFEMGeneralGroup(long id);

    long[] getFEMGeneralGroupIds();

    FEMGeneralGroupPrx[] getFEMGeneralGroupList(long[] ids);

    FEMGeneralGroupFields getFEMGeneralGroupFields(long id);

    FEMGeneralGroupFields[] getFEMGeneralGroupFieldsList(long[] ids);

    long[] findEqualFEMGeneralGroup(FEMGeneralGroupFields fields, String[] fieldNames);

    void setFEMGeneralGroupFields(FEMGeneralGroupFields fields, String[] fieldNames);

    long addFEMTwoDSolid(FEMTwoDSolidFields fields);

    long[] addFEMTwoDSolidList(FEMTwoDSolidFields[] fieldsList);

    FEMTwoDSolidPrx getFEMTwoDSolid(long id);

    long[] getFEMTwoDSolidIds();

    FEMTwoDSolidPrx[] getFEMTwoDSolidList(long[] ids);

    FEMTwoDSolidFields getFEMTwoDSolidFields(long id);

    FEMTwoDSolidFields[] getFEMTwoDSolidFieldsList(long[] ids);

    long[] findEqualFEMTwoDSolid(FEMTwoDSolidFields fields, String[] fieldNames);

    void setFEMTwoDSolidFields(FEMTwoDSolidFields fields, String[] fieldNames);

    long addFEMAppliedTemperature(FEMAppliedTemperatureFields fields);

    long[] addFEMAppliedTemperatureList(FEMAppliedTemperatureFields[] fieldsList);

    FEMAppliedTemperaturePrx getFEMAppliedTemperature(long id);

    long[] getFEMAppliedTemperatureIds();

    FEMAppliedTemperaturePrx[] getFEMAppliedTemperatureList(long[] ids);

    FEMAppliedTemperatureFields getFEMAppliedTemperatureFields(long id);

    FEMAppliedTemperatureFields[] getFEMAppliedTemperatureFieldsList(long[] ids);

    long[] findEqualFEMAppliedTemperature(FEMAppliedTemperatureFields fields, String[] fieldNames);

    void setFEMAppliedTemperatureFields(FEMAppliedTemperatureFields fields, String[] fieldNames);

    long addFEMMatrixSets(FEMMatrixSetsFields fields);

    long[] addFEMMatrixSetsList(FEMMatrixSetsFields[] fieldsList);

    FEMMatrixSetsPrx getFEMMatrixSets(long id);

    long[] getFEMMatrixSetsIds();

    FEMMatrixSetsPrx[] getFEMMatrixSetsList(long[] ids);

    FEMMatrixSetsFields getFEMMatrixSetsFields(long id);

    FEMMatrixSetsFields[] getFEMMatrixSetsFieldsList(long[] ids);

    long[] findEqualFEMMatrixSets(FEMMatrixSetsFields fields, String[] fieldNames);

    void setFEMMatrixSetsFields(FEMMatrixSetsFields fields, String[] fieldNames);

    long addFEMConstraintCoef(FEMConstraintCoefFields fields);

    long[] addFEMConstraintCoefList(FEMConstraintCoefFields[] fieldsList);

    FEMConstraintCoefPrx getFEMConstraintCoef(long id);

    long[] getFEMConstraintCoefIds();

    FEMConstraintCoefPrx[] getFEMConstraintCoefList(long[] ids);

    FEMConstraintCoefFields getFEMConstraintCoefFields(long id);

    FEMConstraintCoefFields[] getFEMConstraintCoefFieldsList(long[] ids);

    long[] findEqualFEMConstraintCoef(FEMConstraintCoefFields fields, String[] fieldNames);

    void setFEMConstraintCoefFields(FEMConstraintCoefFields fields, String[] fieldNames);

    long addFEMSectionBox(FEMSectionBoxFields fields);

    long[] addFEMSectionBoxList(FEMSectionBoxFields[] fieldsList);

    FEMSectionBoxPrx getFEMSectionBox(long id);

    long[] getFEMSectionBoxIds();

    FEMSectionBoxPrx[] getFEMSectionBoxList(long[] ids);

    FEMSectionBoxFields getFEMSectionBoxFields(long id);

    FEMSectionBoxFields[] getFEMSectionBoxFieldsList(long[] ids);

    long[] findEqualFEMSectionBox(FEMSectionBoxFields fields, String[] fieldNames);

    void setFEMSectionBoxFields(FEMSectionBoxFields fields, String[] fieldNames);

    long addFEMNKDisplForce(FEMNKDisplForceFields fields);

    long[] addFEMNKDisplForceList(FEMNKDisplForceFields[] fieldsList);

    FEMNKDisplForcePrx getFEMNKDisplForce(long id);

    long[] getFEMNKDisplForceIds();

    FEMNKDisplForcePrx[] getFEMNKDisplForceList(long[] ids);

    FEMNKDisplForceFields getFEMNKDisplForceFields(long id);

    FEMNKDisplForceFields[] getFEMNKDisplForceFieldsList(long[] ids);

    long[] findEqualFEMNKDisplForce(FEMNKDisplForceFields fields, String[] fieldNames);

    void setFEMNKDisplForceFields(FEMNKDisplForceFields fields, String[] fieldNames);

    long addFEMPlasticStrainStress(FEMPlasticStrainStressFields fields);

    long[] addFEMPlasticStrainStressList(FEMPlasticStrainStressFields[] fieldsList);

    FEMPlasticStrainStressPrx getFEMPlasticStrainStress(long id);

    long[] getFEMPlasticStrainStressIds();

    FEMPlasticStrainStressPrx[] getFEMPlasticStrainStressList(long[] ids);

    FEMPlasticStrainStressFields getFEMPlasticStrainStressFields(long id);

    FEMPlasticStrainStressFields[] getFEMPlasticStrainStressFieldsList(long[] ids);

    long[] findEqualFEMPlasticStrainStress(FEMPlasticStrainStressFields fields, String[] fieldNames);

    void setFEMPlasticStrainStressFields(FEMPlasticStrainStressFields fields, String[] fieldNames);

    long addFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields);

    long[] addFEMShellAxesOrthoDataList(FEMShellAxesOrthoDataFields[] fieldsList);

    FEMShellAxesOrthoDataPrx getFEMShellAxesOrthoData(long id);

    long[] getFEMShellAxesOrthoDataIds();

    FEMShellAxesOrthoDataPrx[] getFEMShellAxesOrthoDataList(long[] ids);

    FEMShellAxesOrthoDataFields getFEMShellAxesOrthoDataFields(long id);

    FEMShellAxesOrthoDataFields[] getFEMShellAxesOrthoDataFieldsList(long[] ids);

    long[] findEqualFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields, String[] fieldNames);

    void setFEMShellAxesOrthoDataFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames);

    long addFEMGeneralNode(FEMGeneralNodeFields fields);

    long[] addFEMGeneralNodeList(FEMGeneralNodeFields[] fieldsList);

    FEMGeneralNodePrx getFEMGeneralNode(long id);

    long[] getFEMGeneralNodeIds();

    FEMGeneralNodePrx[] getFEMGeneralNodeList(long[] ids);

    FEMGeneralNodeFields getFEMGeneralNodeFields(long id);

    FEMGeneralNodeFields[] getFEMGeneralNodeFieldsList(long[] ids);

    long[] findEqualFEMGeneralNode(FEMGeneralNodeFields fields, String[] fieldNames);

    void setFEMGeneralNodeFields(FEMGeneralNodeFields fields, String[] fieldNames);

    long addFEMStrLines(FEMStrLinesFields fields);

    long[] addFEMStrLinesList(FEMStrLinesFields[] fieldsList);

    FEMStrLinesPrx getFEMStrLines(long id);

    long[] getFEMStrLinesIds();

    FEMStrLinesPrx[] getFEMStrLinesList(long[] ids);

    FEMStrLinesFields getFEMStrLinesFields(long id);

    FEMStrLinesFields[] getFEMStrLinesFieldsList(long[] ids);

    long[] findEqualFEMStrLines(FEMStrLinesFields fields, String[] fieldNames);

    void setFEMStrLinesFields(FEMStrLinesFields fields, String[] fieldNames);

    long addFEMContactSurface(FEMContactSurfaceFields fields);

    long[] addFEMContactSurfaceList(FEMContactSurfaceFields[] fieldsList);

    FEMContactSurfacePrx getFEMContactSurface(long id);

    long[] getFEMContactSurfaceIds();

    FEMContactSurfacePrx[] getFEMContactSurfaceList(long[] ids);

    FEMContactSurfaceFields getFEMContactSurfaceFields(long id);

    FEMContactSurfaceFields[] getFEMContactSurfaceFieldsList(long[] ids);

    long[] findEqualFEMContactSurface(FEMContactSurfaceFields fields, String[] fieldNames);

    void setFEMContactSurfaceFields(FEMContactSurfaceFields fields, String[] fieldNames);

    long addFEMMCForceData(FEMMCForceDataFields fields);

    long[] addFEMMCForceDataList(FEMMCForceDataFields[] fieldsList);

    FEMMCForceDataPrx getFEMMCForceData(long id);

    long[] getFEMMCForceDataIds();

    FEMMCForceDataPrx[] getFEMMCForceDataList(long[] ids);

    FEMMCForceDataFields getFEMMCForceDataFields(long id);

    FEMMCForceDataFields[] getFEMMCForceDataFieldsList(long[] ids);

    long[] findEqualFEMMCForceData(FEMMCForceDataFields fields, String[] fieldNames);

    void setFEMMCForceDataFields(FEMMCForceDataFields fields, String[] fieldNames);

    long addFEMSpring(FEMSpringFields fields);

    long[] addFEMSpringList(FEMSpringFields[] fieldsList);

    FEMSpringPrx getFEMSpring(long id);

    long[] getFEMSpringIds();

    FEMSpringPrx[] getFEMSpringList(long[] ids);

    FEMSpringFields getFEMSpringFields(long id);

    FEMSpringFields[] getFEMSpringFieldsList(long[] ids);

    long[] findEqualFEMSpring(FEMSpringFields fields, String[] fieldNames);

    void setFEMSpringFields(FEMSpringFields fields, String[] fieldNames);

    long addFEMSpringGroup(FEMSpringGroupFields fields);

    long[] addFEMSpringGroupList(FEMSpringGroupFields[] fieldsList);

    FEMSpringGroupPrx getFEMSpringGroup(long id);

    long[] getFEMSpringGroupIds();

    FEMSpringGroupPrx[] getFEMSpringGroupList(long[] ids);

    FEMSpringGroupFields getFEMSpringGroupFields(long id);

    FEMSpringGroupFields[] getFEMSpringGroupFieldsList(long[] ids);

    long[] findEqualFEMSpringGroup(FEMSpringGroupFields fields, String[] fieldNames);

    void setFEMSpringGroupFields(FEMSpringGroupFields fields, String[] fieldNames);

    long addFEMShellGroup(FEMShellGroupFields fields);

    long[] addFEMShellGroupList(FEMShellGroupFields[] fieldsList);

    FEMShellGroupPrx getFEMShellGroup(long id);

    long[] getFEMShellGroupIds();

    FEMShellGroupPrx[] getFEMShellGroupList(long[] ids);

    FEMShellGroupFields getFEMShellGroupFields(long id);

    FEMShellGroupFields[] getFEMShellGroupFieldsList(long[] ids);

    long[] findEqualFEMShellGroup(FEMShellGroupFields fields, String[] fieldNames);

    void setFEMShellGroupFields(FEMShellGroupFields fields, String[] fieldNames);

    long addDaqUnit(DaqUnitFields fields);

    long[] addDaqUnitList(DaqUnitFields[] fieldsList);

    DaqUnitPrx getDaqUnit(long id);

    long[] getDaqUnitIds();

    DaqUnitPrx[] getDaqUnitList(long[] ids);

    DaqUnitFields getDaqUnitFields(long id);

    DaqUnitFields[] getDaqUnitFieldsList(long[] ids);

    long[] findEqualDaqUnit(DaqUnitFields fields, String[] fieldNames);

    void setDaqUnitFields(DaqUnitFields fields, String[] fieldNames);

    long addDaqUnitChannel(DaqUnitChannelFields fields);

    long[] addDaqUnitChannelList(DaqUnitChannelFields[] fieldsList);

    DaqUnitChannelPrx getDaqUnitChannel(long id);

    long[] getDaqUnitChannelIds();

    DaqUnitChannelPrx[] getDaqUnitChannelList(long[] ids);

    DaqUnitChannelFields getDaqUnitChannelFields(long id);

    DaqUnitChannelFields[] getDaqUnitChannelFieldsList(long[] ids);

    long[] findEqualDaqUnitChannel(DaqUnitChannelFields fields, String[] fieldNames);

    void setDaqUnitChannelFields(DaqUnitChannelFields fields, String[] fieldNames);

    long addSensor(SensorFields fields);

    long[] addSensorList(SensorFields[] fieldsList);

    SensorPrx getSensor(long id);

    long[] getSensorIds();

    SensorPrx[] getSensorList(long[] ids);

    SensorFields getSensorFields(long id);

    SensorFields[] getSensorFieldsList(long[] ids);

    long[] findEqualSensor(SensorFields fields, String[] fieldNames);

    void setSensorFields(SensorFields fields, String[] fieldNames);

    long addTransducer(TransducerFields fields);

    long[] addTransducerList(TransducerFields[] fieldsList);

    TransducerPrx getTransducer(long id);

    long[] getTransducerIds();

    TransducerPrx[] getTransducerList(long[] ids);

    TransducerFields getTransducerFields(long id);

    TransducerFields[] getTransducerFieldsList(long[] ids);

    long[] findEqualTransducer(TransducerFields fields, String[] fieldNames);

    void setTransducerFields(TransducerFields fields, String[] fieldNames);

    long addExperiment(ExperimentFields fields);

    long[] addExperimentList(ExperimentFields[] fieldsList);

    ExperimentPrx getExperiment(long id);

    long[] getExperimentIds();

    ExperimentPrx[] getExperimentList(long[] ids);

    ExperimentFields getExperimentFields(long id);

    ExperimentFields[] getExperimentFieldsList(long[] ids);

    long[] findEqualExperiment(ExperimentFields fields, String[] fieldNames);

    void setExperimentFields(ExperimentFields fields, String[] fieldNames);

    long addCycle(CycleFields fields);

    long[] addCycleList(CycleFields[] fieldsList);

    CyclePrx getCycle(long id);

    long[] getCycleIds();

    CyclePrx[] getCycleList(long[] ids);

    CycleFields getCycleFields(long id);

    CycleFields[] getCycleFieldsList(long[] ids);

    long[] findEqualCycle(CycleFields fields, String[] fieldNames);

    void setCycleFields(CycleFields fields, String[] fieldNames);

    long addSensorTimeData(SensorTimeDataFields fields);

    long[] addSensorTimeDataList(SensorTimeDataFields[] fieldsList);

    SensorTimeDataPrx getSensorTimeData(long id);

    long[] getSensorTimeDataIds();

    SensorTimeDataPrx[] getSensorTimeDataList(long[] ids);

    SensorTimeDataFields getSensorTimeDataFields(long id);

    SensorTimeDataFields[] getSensorTimeDataFieldsList(long[] ids);

    long[] findEqualSensorTimeData(SensorTimeDataFields fields, String[] fieldNames);

    void setSensorTimeDataFields(SensorTimeDataFields fields, String[] fieldNames);

    long addTransducerTimeData(TransducerTimeDataFields fields);

    long[] addTransducerTimeDataList(TransducerTimeDataFields[] fieldsList);

    TransducerTimeDataPrx getTransducerTimeData(long id);

    long[] getTransducerTimeDataIds();

    TransducerTimeDataPrx[] getTransducerTimeDataList(long[] ids);

    TransducerTimeDataFields getTransducerTimeDataFields(long id);

    TransducerTimeDataFields[] getTransducerTimeDataFieldsList(long[] ids);

    long[] findEqualTransducerTimeData(TransducerTimeDataFields fields, String[] fieldNames);

    void setTransducerTimeDataFields(TransducerTimeDataFields fields, String[] fieldNames);

    long addExperimentStructureData(ExperimentStructureDataFields fields);

    long[] addExperimentStructureDataList(ExperimentStructureDataFields[] fieldsList);

    ExperimentStructureDataPrx getExperimentStructureData(long id);

    long[] getExperimentStructureDataIds();

    ExperimentStructureDataPrx[] getExperimentStructureDataList(long[] ids);

    ExperimentStructureDataFields getExperimentStructureDataFields(long id);

    ExperimentStructureDataFields[] getExperimentStructureDataFieldsList(long[] ids);

    long[] findEqualExperimentStructureData(ExperimentStructureDataFields fields, String[] fieldNames);

    void setExperimentStructureDataFields(ExperimentStructureDataFields fields, String[] fieldNames);

    long addTransducerCycleData(TransducerCycleDataFields fields);

    long[] addTransducerCycleDataList(TransducerCycleDataFields[] fieldsList);

    TransducerCycleDataPrx getTransducerCycleData(long id);

    long[] getTransducerCycleDataIds();

    TransducerCycleDataPrx[] getTransducerCycleDataList(long[] ids);

    TransducerCycleDataFields getTransducerCycleDataFields(long id);

    TransducerCycleDataFields[] getTransducerCycleDataFieldsList(long[] ids);

    long[] findEqualTransducerCycleData(TransducerCycleDataFields fields, String[] fieldNames);

    void setTransducerCycleDataFields(TransducerCycleDataFields fields, String[] fieldNames);

    long addMappingMatrix(MappingMatrixFields fields);

    long[] addMappingMatrixList(MappingMatrixFields[] fieldsList);

    MappingMatrixPrx getMappingMatrix(long id);

    long[] getMappingMatrixIds();

    MappingMatrixPrx[] getMappingMatrixList(long[] ids);

    MappingMatrixFields getMappingMatrixFields(long id);

    MappingMatrixFields[] getMappingMatrixFieldsList(long[] ids);

    long[] findEqualMappingMatrix(MappingMatrixFields fields, String[] fieldNames);

    void setMappingMatrixFields(MappingMatrixFields fields, String[] fieldNames);

    long addDaqUnitChannelData(DaqUnitChannelDataFields fields);

    long[] addDaqUnitChannelDataList(DaqUnitChannelDataFields[] fieldsList);

    DaqUnitChannelDataPrx getDaqUnitChannelData(long id);

    long[] getDaqUnitChannelDataIds();

    DaqUnitChannelDataPrx[] getDaqUnitChannelDataList(long[] ids);

    DaqUnitChannelDataFields getDaqUnitChannelDataFields(long id);

    DaqUnitChannelDataFields[] getDaqUnitChannelDataFieldsList(long[] ids);

    long[] findEqualDaqUnitChannelData(DaqUnitChannelDataFields fields, String[] fieldNames);

    void setDaqUnitChannelDataFields(DaqUnitChannelDataFields fields, String[] fieldNames);

    long addAccelMeas(AccelMeasFields fields);

    long[] addAccelMeasList(AccelMeasFields[] fieldsList);

    AccelMeasPrx getAccelMeas(long id);

    long[] getAccelMeasIds();

    AccelMeasPrx[] getAccelMeasList(long[] ids);

    AccelMeasFields getAccelMeasFields(long id);

    AccelMeasFields[] getAccelMeasFieldsList(long[] ids);

    long[] findEqualAccelMeas(AccelMeasFields fields, String[] fieldNames);

    void setAccelMeasFields(AccelMeasFields fields, String[] fieldNames);
}
