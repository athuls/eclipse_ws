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

public abstract class _SenStoreMngrDisp extends Ice.ObjectImpl implements SenStoreMngr
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::SenStore::SenStoreMngr"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[1];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    public final long
    addAccelMeas(AccelMeasFields fields)
    {
        return addAccelMeas(fields, null);
    }

    public final long[]
    addAccelMeasList(AccelMeasFields[] fieldsList)
    {
        return addAccelMeasList(fieldsList, null);
    }

    public final long
    addCycle(CycleFields fields)
    {
        return addCycle(fields, null);
    }

    public final long[]
    addCycleList(CycleFields[] fieldsList)
    {
        return addCycleList(fieldsList, null);
    }

    public final long
    addDaqUnit(DaqUnitFields fields)
    {
        return addDaqUnit(fields, null);
    }

    public final long
    addDaqUnitChannel(DaqUnitChannelFields fields)
    {
        return addDaqUnitChannel(fields, null);
    }

    public final long
    addDaqUnitChannelData(DaqUnitChannelDataFields fields)
    {
        return addDaqUnitChannelData(fields, null);
    }

    public final long[]
    addDaqUnitChannelDataList(DaqUnitChannelDataFields[] fieldsList)
    {
        return addDaqUnitChannelDataList(fieldsList, null);
    }

    public final long[]
    addDaqUnitChannelList(DaqUnitChannelFields[] fieldsList)
    {
        return addDaqUnitChannelList(fieldsList, null);
    }

    public final long[]
    addDaqUnitList(DaqUnitFields[] fieldsList)
    {
        return addDaqUnitList(fieldsList, null);
    }

    public final long
    addExperiment(ExperimentFields fields)
    {
        return addExperiment(fields, null);
    }

    public final long[]
    addExperimentList(ExperimentFields[] fieldsList)
    {
        return addExperimentList(fieldsList, null);
    }

    public final long
    addExperimentStructureData(ExperimentStructureDataFields fields)
    {
        return addExperimentStructureData(fields, null);
    }

    public final long[]
    addExperimentStructureDataList(ExperimentStructureDataFields[] fieldsList)
    {
        return addExperimentStructureDataList(fieldsList, null);
    }

    public final long
    addFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields)
    {
        return addFEMAppliedConcentratedLoad(fields, null);
    }

    public final long[]
    addFEMAppliedConcentratedLoadList(FEMAppliedConcentratedLoadFields[] fieldsList)
    {
        return addFEMAppliedConcentratedLoadList(fieldsList, null);
    }

    public final long
    addFEMAppliedDisplacement(FEMAppliedDisplacementFields fields)
    {
        return addFEMAppliedDisplacement(fields, null);
    }

    public final long[]
    addFEMAppliedDisplacementList(FEMAppliedDisplacementFields[] fieldsList)
    {
        return addFEMAppliedDisplacementList(fieldsList, null);
    }

    public final long
    addFEMAppliedLoads(FEMAppliedLoadsFields fields)
    {
        return addFEMAppliedLoads(fields, null);
    }

    public final long[]
    addFEMAppliedLoadsList(FEMAppliedLoadsFields[] fieldsList)
    {
        return addFEMAppliedLoadsList(fieldsList, null);
    }

    public final long
    addFEMAppliedTemperature(FEMAppliedTemperatureFields fields)
    {
        return addFEMAppliedTemperature(fields, null);
    }

    public final long[]
    addFEMAppliedTemperatureList(FEMAppliedTemperatureFields[] fieldsList)
    {
        return addFEMAppliedTemperatureList(fieldsList, null);
    }

    public final long
    addFEMAxesNode(FEMAxesNodeFields fields)
    {
        return addFEMAxesNode(fields, null);
    }

    public final long[]
    addFEMAxesNodeList(FEMAxesNodeFields[] fieldsList)
    {
        return addFEMAxesNodeList(fieldsList, null);
    }

    public final long
    addFEMBeam(FEMBeamFields fields)
    {
        return addFEMBeam(fields, null);
    }

    public final long[]
    addFEMBeamList(FEMBeamFields[] fieldsList)
    {
        return addFEMBeamList(fieldsList, null);
    }

    public final long
    addFEMBeamLoad(FEMBeamLoadFields fields)
    {
        return addFEMBeamLoad(fields, null);
    }

    public final long[]
    addFEMBeamLoadList(FEMBeamLoadFields[] fieldsList)
    {
        return addFEMBeamLoadList(fieldsList, null);
    }

    public final long
    addFEMBeamNode(FEMBeamNodeFields fields)
    {
        return addFEMBeamNode(fields, null);
    }

    public final long[]
    addFEMBeamNodeList(FEMBeamNodeFields[] fieldsList)
    {
        return addFEMBeamNodeList(fieldsList, null);
    }

    public final long
    addFEMBoundary(FEMBoundaryFields fields)
    {
        return addFEMBoundary(fields, null);
    }

    public final long[]
    addFEMBoundaryList(FEMBoundaryFields[] fieldsList)
    {
        return addFEMBoundaryList(fieldsList, null);
    }

    public final long
    addFEMConstraintCoef(FEMConstraintCoefFields fields)
    {
        return addFEMConstraintCoef(fields, null);
    }

    public final long[]
    addFEMConstraintCoefList(FEMConstraintCoefFields[] fieldsList)
    {
        return addFEMConstraintCoefList(fieldsList, null);
    }

    public final long
    addFEMConstraints(FEMConstraintsFields fields)
    {
        return addFEMConstraints(fields, null);
    }

    public final long[]
    addFEMConstraintsList(FEMConstraintsFields[] fieldsList)
    {
        return addFEMConstraintsList(fieldsList, null);
    }

    public final long
    addFEMContactGroup3(FEMContactGroup3Fields fields)
    {
        return addFEMContactGroup3(fields, null);
    }

    public final long[]
    addFEMContactGroup3List(FEMContactGroup3Fields[] fieldsList)
    {
        return addFEMContactGroup3List(fieldsList, null);
    }

    public final long
    addFEMContactPairs(FEMContactPairsFields fields)
    {
        return addFEMContactPairs(fields, null);
    }

    public final long[]
    addFEMContactPairsList(FEMContactPairsFields[] fieldsList)
    {
        return addFEMContactPairsList(fieldsList, null);
    }

    public final long
    addFEMContactSurface(FEMContactSurfaceFields fields)
    {
        return addFEMContactSurface(fields, null);
    }

    public final long[]
    addFEMContactSurfaceList(FEMContactSurfaceFields[] fieldsList)
    {
        return addFEMContactSurfaceList(fieldsList, null);
    }

    public final long
    addFEMCoordSystem(FEMCoordSystemFields fields)
    {
        return addFEMCoordSystem(fields, null);
    }

    public final long[]
    addFEMCoordSystemList(FEMCoordSystemFields[] fieldsList)
    {
        return addFEMCoordSystemList(fieldsList, null);
    }

    public final long
    addFEMCrossSections(FEMCrossSectionsFields fields)
    {
        return addFEMCrossSections(fields, null);
    }

    public final long[]
    addFEMCrossSectionsList(FEMCrossSectionsFields[] fieldsList)
    {
        return addFEMCrossSectionsList(fieldsList, null);
    }

    public final long
    addFEMCurvMomentData(FEMCurvMomentDataFields fields)
    {
        return addFEMCurvMomentData(fields, null);
    }

    public final long[]
    addFEMCurvMomentDataList(FEMCurvMomentDataFields[] fieldsList)
    {
        return addFEMCurvMomentDataList(fieldsList, null);
    }

    public final long
    addFEMDamping(FEMDampingFields fields)
    {
        return addFEMDamping(fields, null);
    }

    public final long[]
    addFEMDampingList(FEMDampingFields[] fieldsList)
    {
        return addFEMDampingList(fieldsList, null);
    }

    public final long
    addFEMDof(FEMDofFields fields)
    {
        return addFEMDof(fields, null);
    }

    public final long[]
    addFEMDofList(FEMDofFields[] fieldsList)
    {
        return addFEMDofList(fieldsList, null);
    }

    public final long
    addFEMElasticMaterial(FEMElasticMaterialFields fields)
    {
        return addFEMElasticMaterial(fields, null);
    }

    public final long[]
    addFEMElasticMaterialList(FEMElasticMaterialFields[] fieldsList)
    {
        return addFEMElasticMaterialList(fieldsList, null);
    }

    public final long
    addFEMEndreleases(FEMEndreleasesFields fields)
    {
        return addFEMEndreleases(fields, null);
    }

    public final long[]
    addFEMEndreleasesList(FEMEndreleasesFields[] fieldsList)
    {
        return addFEMEndreleasesList(fieldsList, null);
    }

    public final long
    addFEMForceStrainData(FEMForceStrainDataFields fields)
    {
        return addFEMForceStrainData(fields, null);
    }

    public final long[]
    addFEMForceStrainDataList(FEMForceStrainDataFields[] fieldsList)
    {
        return addFEMForceStrainDataList(fieldsList, null);
    }

    public final long
    addFEMGeneral(FEMGeneralFields fields)
    {
        return addFEMGeneral(fields, null);
    }

    public final long
    addFEMGeneralGroup(FEMGeneralGroupFields fields)
    {
        return addFEMGeneralGroup(fields, null);
    }

    public final long[]
    addFEMGeneralGroupList(FEMGeneralGroupFields[] fieldsList)
    {
        return addFEMGeneralGroupList(fieldsList, null);
    }

    public final long[]
    addFEMGeneralList(FEMGeneralFields[] fieldsList)
    {
        return addFEMGeneralList(fieldsList, null);
    }

    public final long
    addFEMGeneralNode(FEMGeneralNodeFields fields)
    {
        return addFEMGeneralNode(fields, null);
    }

    public final long[]
    addFEMGeneralNodeList(FEMGeneralNodeFields[] fieldsList)
    {
        return addFEMGeneralNodeList(fieldsList, null);
    }

    public final long
    addFEMGroundMotionRecord(FEMGroundMotionRecordFields fields)
    {
        return addFEMGroundMotionRecord(fields, null);
    }

    public final long[]
    addFEMGroundMotionRecordList(FEMGroundMotionRecordFields[] fieldsList)
    {
        return addFEMGroundMotionRecordList(fieldsList, null);
    }

    public final long
    addFEMGroup(FEMGroupFields fields)
    {
        return addFEMGroup(fields, null);
    }

    public final long[]
    addFEMGroupList(FEMGroupFields[] fieldsList)
    {
        return addFEMGroupList(fieldsList, null);
    }

    public final long
    addFEMInitialTemperature(FEMInitialTemperatureFields fields)
    {
        return addFEMInitialTemperature(fields, null);
    }

    public final long[]
    addFEMInitialTemperatureList(FEMInitialTemperatureFields[] fieldsList)
    {
        return addFEMInitialTemperatureList(fieldsList, null);
    }

    public final long
    addFEMIsoBeam(FEMIsoBeamFields fields)
    {
        return addFEMIsoBeam(fields, null);
    }

    public final long
    addFEMIsoBeamGroup(FEMIsoBeamGroupFields fields)
    {
        return addFEMIsoBeamGroup(fields, null);
    }

    public final long[]
    addFEMIsoBeamGroupList(FEMIsoBeamGroupFields[] fieldsList)
    {
        return addFEMIsoBeamGroupList(fieldsList, null);
    }

    public final long[]
    addFEMIsoBeamList(FEMIsoBeamFields[] fieldsList)
    {
        return addFEMIsoBeamList(fieldsList, null);
    }

    public final long
    addFEMLink(FEMLinkFields fields)
    {
        return addFEMLink(fields, null);
    }

    public final long[]
    addFEMLinkList(FEMLinkFields[] fieldsList)
    {
        return addFEMLinkList(fieldsList, null);
    }

    public final long
    addFEMLoadMassProportional(FEMLoadMassProportionalFields fields)
    {
        return addFEMLoadMassProportional(fields, null);
    }

    public final long[]
    addFEMLoadMassProportionalList(FEMLoadMassProportionalFields[] fieldsList)
    {
        return addFEMLoadMassProportionalList(fieldsList, null);
    }

    public final long
    addFEMMCForceData(FEMMCForceDataFields fields)
    {
        return addFEMMCForceData(fields, null);
    }

    public final long[]
    addFEMMCForceDataList(FEMMCForceDataFields[] fieldsList)
    {
        return addFEMMCForceDataList(fieldsList, null);
    }

    public final long
    addFEMMCrigidities(FEMMCrigiditiesFields fields)
    {
        return addFEMMCrigidities(fields, null);
    }

    public final long[]
    addFEMMCrigiditiesList(FEMMCrigiditiesFields[] fieldsList)
    {
        return addFEMMCrigiditiesList(fieldsList, null);
    }

    public final long
    addFEMMTForceData(FEMMTForceDataFields fields)
    {
        return addFEMMTForceData(fields, null);
    }

    public final long[]
    addFEMMTForceDataList(FEMMTForceDataFields[] fieldsList)
    {
        return addFEMMTForceDataList(fieldsList, null);
    }

    public final long
    addFEMMaterial(FEMMaterialFields fields)
    {
        return addFEMMaterial(fields, null);
    }

    public final long[]
    addFEMMaterialList(FEMMaterialFields[] fieldsList)
    {
        return addFEMMaterialList(fieldsList, null);
    }

    public final long
    addFEMMatrices(FEMMatricesFields fields)
    {
        return addFEMMatrices(fields, null);
    }

    public final long[]
    addFEMMatricesList(FEMMatricesFields[] fieldsList)
    {
        return addFEMMatricesList(fieldsList, null);
    }

    public final long
    addFEMMatrixData(FEMMatrixDataFields fields)
    {
        return addFEMMatrixData(fields, null);
    }

    public final long[]
    addFEMMatrixDataList(FEMMatrixDataFields[] fieldsList)
    {
        return addFEMMatrixDataList(fieldsList, null);
    }

    public final long
    addFEMMatrixSets(FEMMatrixSetsFields fields)
    {
        return addFEMMatrixSets(fields, null);
    }

    public final long[]
    addFEMMatrixSetsList(FEMMatrixSetsFields[] fieldsList)
    {
        return addFEMMatrixSetsList(fieldsList, null);
    }

    public final long
    addFEMNKDisplForce(FEMNKDisplForceFields fields)
    {
        return addFEMNKDisplForce(fields, null);
    }

    public final long[]
    addFEMNKDisplForceList(FEMNKDisplForceFields[] fieldsList)
    {
        return addFEMNKDisplForceList(fieldsList, null);
    }

    public final long
    addFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields)
    {
        return addFEMNLElasticMaterials(fields, null);
    }

    public final long[]
    addFEMNLElasticMaterialsList(FEMNLElasticMaterialsFields[] fieldsList)
    {
        return addFEMNLElasticMaterialsList(fieldsList, null);
    }

    public final long
    addFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields)
    {
        return addFEMNLElasticStrainStress(fields, null);
    }

    public final long[]
    addFEMNLElasticStrainStressList(FEMNLElasticStrainStressFields[] fieldsList)
    {
        return addFEMNLElasticStrainStressList(fieldsList, null);
    }

    public final long
    addFEMNMTimeMass(FEMNMTimeMassFields fields)
    {
        return addFEMNMTimeMass(fields, null);
    }

    public final long[]
    addFEMNMTimeMassList(FEMNMTimeMassFields[] fieldsList)
    {
        return addFEMNMTimeMassList(fieldsList, null);
    }

    public final long
    addFEMNTNContact(FEMNTNContactFields fields)
    {
        return addFEMNTNContact(fields, null);
    }

    public final long[]
    addFEMNTNContactList(FEMNTNContactFields[] fieldsList)
    {
        return addFEMNTNContactList(fieldsList, null);
    }

    public final long
    addFEMNodalMass(FEMNodalMassFields fields)
    {
        return addFEMNodalMass(fields, null);
    }

    public final long[]
    addFEMNodalMassList(FEMNodalMassFields[] fieldsList)
    {
        return addFEMNodalMassList(fieldsList, null);
    }

    public final long
    addFEMNode(FEMNodeFields fields)
    {
        return addFEMNode(fields, null);
    }

    public final long[]
    addFEMNodeList(FEMNodeFields[] fieldsList)
    {
        return addFEMNodeList(fieldsList, null);
    }

    public final long
    addFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields)
    {
        return addFEMOrthotropicMaterial(fields, null);
    }

    public final long[]
    addFEMOrthotropicMaterialList(FEMOrthotropicMaterialFields[] fieldsList)
    {
        return addFEMOrthotropicMaterialList(fieldsList, null);
    }

    public final long
    addFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields)
    {
        return addFEMPlasticBilinearMaterial(fields, null);
    }

    public final long[]
    addFEMPlasticBilinearMaterialList(FEMPlasticBilinearMaterialFields[] fieldsList)
    {
        return addFEMPlasticBilinearMaterialList(fieldsList, null);
    }

    public final long
    addFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields)
    {
        return addFEMPlasticMlMaterials(fields, null);
    }

    public final long[]
    addFEMPlasticMlMaterialsList(FEMPlasticMlMaterialsFields[] fieldsList)
    {
        return addFEMPlasticMlMaterialsList(fieldsList, null);
    }

    public final long
    addFEMPlasticStrainStress(FEMPlasticStrainStressFields fields)
    {
        return addFEMPlasticStrainStress(fields, null);
    }

    public final long[]
    addFEMPlasticStrainStressList(FEMPlasticStrainStressFields[] fieldsList)
    {
        return addFEMPlasticStrainStressList(fieldsList, null);
    }

    public final long
    addFEMPlate(FEMPlateFields fields)
    {
        return addFEMPlate(fields, null);
    }

    public final long
    addFEMPlateGroup(FEMPlateGroupFields fields)
    {
        return addFEMPlateGroup(fields, null);
    }

    public final long[]
    addFEMPlateGroupList(FEMPlateGroupFields[] fieldsList)
    {
        return addFEMPlateGroupList(fieldsList, null);
    }

    public final long[]
    addFEMPlateList(FEMPlateFields[] fieldsList)
    {
        return addFEMPlateList(fieldsList, null);
    }

    public final long
    addFEMPoints(FEMPointsFields fields)
    {
        return addFEMPoints(fields, null);
    }

    public final long[]
    addFEMPointsList(FEMPointsFields[] fieldsList)
    {
        return addFEMPointsList(fieldsList, null);
    }

    public final long
    addFEMProperties(FEMPropertiesFields fields)
    {
        return addFEMProperties(fields, null);
    }

    public final long[]
    addFEMPropertiesList(FEMPropertiesFields[] fieldsList)
    {
        return addFEMPropertiesList(fieldsList, null);
    }

    public final long
    addFEMPropertysets(FEMPropertysetsFields fields)
    {
        return addFEMPropertysets(fields, null);
    }

    public final long[]
    addFEMPropertysetsList(FEMPropertysetsFields[] fieldsList)
    {
        return addFEMPropertysetsList(fieldsList, null);
    }

    public final long
    addFEMSectionBox(FEMSectionBoxFields fields)
    {
        return addFEMSectionBox(fields, null);
    }

    public final long[]
    addFEMSectionBoxList(FEMSectionBoxFields[] fieldsList)
    {
        return addFEMSectionBoxList(fieldsList, null);
    }

    public final long
    addFEMSectionI(FEMSectionIFields fields)
    {
        return addFEMSectionI(fields, null);
    }

    public final long[]
    addFEMSectionIList(FEMSectionIFields[] fieldsList)
    {
        return addFEMSectionIList(fieldsList, null);
    }

    public final long
    addFEMSectionPipe(FEMSectionPipeFields fields)
    {
        return addFEMSectionPipe(fields, null);
    }

    public final long[]
    addFEMSectionPipeList(FEMSectionPipeFields[] fieldsList)
    {
        return addFEMSectionPipeList(fieldsList, null);
    }

    public final long
    addFEMSectionProp(FEMSectionPropFields fields)
    {
        return addFEMSectionProp(fields, null);
    }

    public final long[]
    addFEMSectionPropList(FEMSectionPropFields[] fieldsList)
    {
        return addFEMSectionPropList(fieldsList, null);
    }

    public final long
    addFEMSectionRect(FEMSectionRectFields fields)
    {
        return addFEMSectionRect(fields, null);
    }

    public final long[]
    addFEMSectionRectList(FEMSectionRectFields[] fieldsList)
    {
        return addFEMSectionRectList(fieldsList, null);
    }

    public final long
    addFEMShell(FEMShellFields fields)
    {
        return addFEMShell(fields, null);
    }

    public final long
    addFEMShellAxesOrtho(FEMShellAxesOrthoFields fields)
    {
        return addFEMShellAxesOrtho(fields, null);
    }

    public final long
    addFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields)
    {
        return addFEMShellAxesOrthoData(fields, null);
    }

    public final long[]
    addFEMShellAxesOrthoDataList(FEMShellAxesOrthoDataFields[] fieldsList)
    {
        return addFEMShellAxesOrthoDataList(fieldsList, null);
    }

    public final long[]
    addFEMShellAxesOrthoList(FEMShellAxesOrthoFields[] fieldsList)
    {
        return addFEMShellAxesOrthoList(fieldsList, null);
    }

    public final long
    addFEMShellDOF(FEMShellDOFFields fields)
    {
        return addFEMShellDOF(fields, null);
    }

    public final long[]
    addFEMShellDOFList(FEMShellDOFFields[] fieldsList)
    {
        return addFEMShellDOFList(fieldsList, null);
    }

    public final long
    addFEMShellGroup(FEMShellGroupFields fields)
    {
        return addFEMShellGroup(fields, null);
    }

    public final long[]
    addFEMShellGroupList(FEMShellGroupFields[] fieldsList)
    {
        return addFEMShellGroupList(fieldsList, null);
    }

    public final long
    addFEMShellLayer(FEMShellLayerFields fields)
    {
        return addFEMShellLayer(fields, null);
    }

    public final long[]
    addFEMShellLayerList(FEMShellLayerFields[] fieldsList)
    {
        return addFEMShellLayerList(fieldsList, null);
    }

    public final long[]
    addFEMShellList(FEMShellFields[] fieldsList)
    {
        return addFEMShellList(fieldsList, null);
    }

    public final long
    addFEMShellPressure(FEMShellPressureFields fields)
    {
        return addFEMShellPressure(fields, null);
    }

    public final long[]
    addFEMShellPressureList(FEMShellPressureFields[] fieldsList)
    {
        return addFEMShellPressureList(fieldsList, null);
    }

    public final long
    addFEMSkewDOF(FEMSkewDOFFields fields)
    {
        return addFEMSkewDOF(fields, null);
    }

    public final long[]
    addFEMSkewDOFList(FEMSkewDOFFields[] fieldsList)
    {
        return addFEMSkewDOFList(fieldsList, null);
    }

    public final long
    addFEMSkewSysAngles(FEMSkewSysAnglesFields fields)
    {
        return addFEMSkewSysAngles(fields, null);
    }

    public final long[]
    addFEMSkewSysAnglesList(FEMSkewSysAnglesFields[] fieldsList)
    {
        return addFEMSkewSysAnglesList(fieldsList, null);
    }

    public final long
    addFEMSkeySysNode(FEMSkeySysNodeFields fields)
    {
        return addFEMSkeySysNode(fields, null);
    }

    public final long[]
    addFEMSkeySysNodeList(FEMSkeySysNodeFields[] fieldsList)
    {
        return addFEMSkeySysNodeList(fieldsList, null);
    }

    public final long
    addFEMSpring(FEMSpringFields fields)
    {
        return addFEMSpring(fields, null);
    }

    public final long
    addFEMSpringGroup(FEMSpringGroupFields fields)
    {
        return addFEMSpringGroup(fields, null);
    }

    public final long[]
    addFEMSpringGroupList(FEMSpringGroupFields[] fieldsList)
    {
        return addFEMSpringGroupList(fieldsList, null);
    }

    public final long[]
    addFEMSpringList(FEMSpringFields[] fieldsList)
    {
        return addFEMSpringList(fieldsList, null);
    }

    public final long
    addFEMStrLines(FEMStrLinesFields fields)
    {
        return addFEMStrLines(fields, null);
    }

    public final long[]
    addFEMStrLinesList(FEMStrLinesFields[] fieldsList)
    {
        return addFEMStrLinesList(fieldsList, null);
    }

    public final long
    addFEMThermoIsoData(FEMThermoIsoDataFields fields)
    {
        return addFEMThermoIsoData(fields, null);
    }

    public final long[]
    addFEMThermoIsoDataList(FEMThermoIsoDataFields[] fieldsList)
    {
        return addFEMThermoIsoDataList(fieldsList, null);
    }

    public final long
    addFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields)
    {
        return addFEMThermoIsoMaterials(fields, null);
    }

    public final long[]
    addFEMThermoIsoMaterialsList(FEMThermoIsoMaterialsFields[] fieldsList)
    {
        return addFEMThermoIsoMaterialsList(fieldsList, null);
    }

    public final long
    addFEMThermoOrthData(FEMThermoOrthDataFields fields)
    {
        return addFEMThermoOrthData(fields, null);
    }

    public final long[]
    addFEMThermoOrthDataList(FEMThermoOrthDataFields[] fieldsList)
    {
        return addFEMThermoOrthDataList(fieldsList, null);
    }

    public final long
    addFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields)
    {
        return addFEMThermoOrthMaterials(fields, null);
    }

    public final long[]
    addFEMThermoOrthMaterialsList(FEMThermoOrthMaterialsFields[] fieldsList)
    {
        return addFEMThermoOrthMaterialsList(fieldsList, null);
    }

    public final long
    addFEMThreeDSolid(FEMThreeDSolidFields fields)
    {
        return addFEMThreeDSolid(fields, null);
    }

    public final long
    addFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields)
    {
        return addFEMThreeDSolidGroup(fields, null);
    }

    public final long[]
    addFEMThreeDSolidGroupList(FEMThreeDSolidGroupFields[] fieldsList)
    {
        return addFEMThreeDSolidGroupList(fieldsList, null);
    }

    public final long[]
    addFEMThreeDSolidList(FEMThreeDSolidFields[] fieldsList)
    {
        return addFEMThreeDSolidList(fieldsList, null);
    }

    public final long
    addFEMTimeFunctionData(FEMTimeFunctionDataFields fields)
    {
        return addFEMTimeFunctionData(fields, null);
    }

    public final long[]
    addFEMTimeFunctionDataList(FEMTimeFunctionDataFields[] fieldsList)
    {
        return addFEMTimeFunctionDataList(fieldsList, null);
    }

    public final long
    addFEMTimeFunctions(FEMTimeFunctionsFields fields)
    {
        return addFEMTimeFunctions(fields, null);
    }

    public final long[]
    addFEMTimeFunctionsList(FEMTimeFunctionsFields[] fieldsList)
    {
        return addFEMTimeFunctionsList(fieldsList, null);
    }

    public final long
    addFEMTruss(FEMTrussFields fields)
    {
        return addFEMTruss(fields, null);
    }

    public final long
    addFEMTrussGroup(FEMTrussGroupFields fields)
    {
        return addFEMTrussGroup(fields, null);
    }

    public final long[]
    addFEMTrussGroupList(FEMTrussGroupFields[] fieldsList)
    {
        return addFEMTrussGroupList(fieldsList, null);
    }

    public final long[]
    addFEMTrussList(FEMTrussFields[] fieldsList)
    {
        return addFEMTrussList(fieldsList, null);
    }

    public final long
    addFEMTwistMomentData(FEMTwistMomentDataFields fields)
    {
        return addFEMTwistMomentData(fields, null);
    }

    public final long[]
    addFEMTwistMomentDataList(FEMTwistMomentDataFields[] fieldsList)
    {
        return addFEMTwistMomentDataList(fieldsList, null);
    }

    public final long
    addFEMTwoDSolid(FEMTwoDSolidFields fields)
    {
        return addFEMTwoDSolid(fields, null);
    }

    public final long
    addFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields)
    {
        return addFEMTwoDSolidGroup(fields, null);
    }

    public final long[]
    addFEMTwoDSolidGroupList(FEMTwoDSolidGroupFields[] fieldsList)
    {
        return addFEMTwoDSolidGroupList(fieldsList, null);
    }

    public final long[]
    addFEMTwoDSolidList(FEMTwoDSolidFields[] fieldsList)
    {
        return addFEMTwoDSolidList(fieldsList, null);
    }

    public final long
    addMappingMatrix(MappingMatrixFields fields)
    {
        return addMappingMatrix(fields, null);
    }

    public final long[]
    addMappingMatrixList(MappingMatrixFields[] fieldsList)
    {
        return addMappingMatrixList(fieldsList, null);
    }

    public final long
    addSensor(SensorFields fields)
    {
        return addSensor(fields, null);
    }

    public final long[]
    addSensorList(SensorFields[] fieldsList)
    {
        return addSensorList(fieldsList, null);
    }

    public final long
    addSensorTimeData(SensorTimeDataFields fields)
    {
        return addSensorTimeData(fields, null);
    }

    public final long[]
    addSensorTimeDataList(SensorTimeDataFields[] fieldsList)
    {
        return addSensorTimeDataList(fieldsList, null);
    }

    public final long
    addStructure(StructureFields fields)
    {
        return addStructure(fields, null);
    }

    public final long[]
    addStructureList(StructureFields[] fieldsList)
    {
        return addStructureList(fieldsList, null);
    }

    public final long
    addTransducer(TransducerFields fields)
    {
        return addTransducer(fields, null);
    }

    public final long
    addTransducerCycleData(TransducerCycleDataFields fields)
    {
        return addTransducerCycleData(fields, null);
    }

    public final long[]
    addTransducerCycleDataList(TransducerCycleDataFields[] fieldsList)
    {
        return addTransducerCycleDataList(fieldsList, null);
    }

    public final long[]
    addTransducerList(TransducerFields[] fieldsList)
    {
        return addTransducerList(fieldsList, null);
    }

    public final long
    addTransducerTimeData(TransducerTimeDataFields fields)
    {
        return addTransducerTimeData(fields, null);
    }

    public final long[]
    addTransducerTimeDataList(TransducerTimeDataFields[] fieldsList)
    {
        return addTransducerTimeDataList(fieldsList, null);
    }

    public final long[]
    findEqualAccelMeas(AccelMeasFields fields, String[] fieldNames)
    {
        return findEqualAccelMeas(fields, fieldNames, null);
    }

    public final long[]
    findEqualCycle(CycleFields fields, String[] fieldNames)
    {
        return findEqualCycle(fields, fieldNames, null);
    }

    public final long[]
    findEqualDaqUnit(DaqUnitFields fields, String[] fieldNames)
    {
        return findEqualDaqUnit(fields, fieldNames, null);
    }

    public final long[]
    findEqualDaqUnitChannel(DaqUnitChannelFields fields, String[] fieldNames)
    {
        return findEqualDaqUnitChannel(fields, fieldNames, null);
    }

    public final long[]
    findEqualDaqUnitChannelData(DaqUnitChannelDataFields fields, String[] fieldNames)
    {
        return findEqualDaqUnitChannelData(fields, fieldNames, null);
    }

    public final long[]
    findEqualExperiment(ExperimentFields fields, String[] fieldNames)
    {
        return findEqualExperiment(fields, fieldNames, null);
    }

    public final long[]
    findEqualExperimentStructureData(ExperimentStructureDataFields fields, String[] fieldNames)
    {
        return findEqualExperimentStructureData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMAppliedConcentratedLoad(FEMAppliedConcentratedLoadFields fields, String[] fieldNames)
    {
        return findEqualFEMAppliedConcentratedLoad(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMAppliedDisplacement(FEMAppliedDisplacementFields fields, String[] fieldNames)
    {
        return findEqualFEMAppliedDisplacement(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMAppliedLoads(FEMAppliedLoadsFields fields, String[] fieldNames)
    {
        return findEqualFEMAppliedLoads(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMAppliedTemperature(FEMAppliedTemperatureFields fields, String[] fieldNames)
    {
        return findEqualFEMAppliedTemperature(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMAxesNode(FEMAxesNodeFields fields, String[] fieldNames)
    {
        return findEqualFEMAxesNode(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMBeam(FEMBeamFields fields, String[] fieldNames)
    {
        return findEqualFEMBeam(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMBeamLoad(FEMBeamLoadFields fields, String[] fieldNames)
    {
        return findEqualFEMBeamLoad(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMBeamNode(FEMBeamNodeFields fields, String[] fieldNames)
    {
        return findEqualFEMBeamNode(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMBoundary(FEMBoundaryFields fields, String[] fieldNames)
    {
        return findEqualFEMBoundary(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMConstraintCoef(FEMConstraintCoefFields fields, String[] fieldNames)
    {
        return findEqualFEMConstraintCoef(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMConstraints(FEMConstraintsFields fields, String[] fieldNames)
    {
        return findEqualFEMConstraints(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMContactGroup3(FEMContactGroup3Fields fields, String[] fieldNames)
    {
        return findEqualFEMContactGroup3(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMContactPairs(FEMContactPairsFields fields, String[] fieldNames)
    {
        return findEqualFEMContactPairs(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMContactSurface(FEMContactSurfaceFields fields, String[] fieldNames)
    {
        return findEqualFEMContactSurface(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMCoordSystem(FEMCoordSystemFields fields, String[] fieldNames)
    {
        return findEqualFEMCoordSystem(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMCrossSections(FEMCrossSectionsFields fields, String[] fieldNames)
    {
        return findEqualFEMCrossSections(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMCurvMomentData(FEMCurvMomentDataFields fields, String[] fieldNames)
    {
        return findEqualFEMCurvMomentData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMDamping(FEMDampingFields fields, String[] fieldNames)
    {
        return findEqualFEMDamping(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMDof(FEMDofFields fields, String[] fieldNames)
    {
        return findEqualFEMDof(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMElasticMaterial(FEMElasticMaterialFields fields, String[] fieldNames)
    {
        return findEqualFEMElasticMaterial(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMEndreleases(FEMEndreleasesFields fields, String[] fieldNames)
    {
        return findEqualFEMEndreleases(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMForceStrainData(FEMForceStrainDataFields fields, String[] fieldNames)
    {
        return findEqualFEMForceStrainData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMGeneral(FEMGeneralFields fields, String[] fieldNames)
    {
        return findEqualFEMGeneral(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMGeneralGroup(FEMGeneralGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMGeneralGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMGeneralNode(FEMGeneralNodeFields fields, String[] fieldNames)
    {
        return findEqualFEMGeneralNode(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMGroundMotionRecord(FEMGroundMotionRecordFields fields, String[] fieldNames)
    {
        return findEqualFEMGroundMotionRecord(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMGroup(FEMGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMInitialTemperature(FEMInitialTemperatureFields fields, String[] fieldNames)
    {
        return findEqualFEMInitialTemperature(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMIsoBeam(FEMIsoBeamFields fields, String[] fieldNames)
    {
        return findEqualFEMIsoBeam(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMIsoBeamGroup(FEMIsoBeamGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMIsoBeamGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMLink(FEMLinkFields fields, String[] fieldNames)
    {
        return findEqualFEMLink(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMLoadMassProportional(FEMLoadMassProportionalFields fields, String[] fieldNames)
    {
        return findEqualFEMLoadMassProportional(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMCForceData(FEMMCForceDataFields fields, String[] fieldNames)
    {
        return findEqualFEMMCForceData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMCrigidities(FEMMCrigiditiesFields fields, String[] fieldNames)
    {
        return findEqualFEMMCrigidities(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMTForceData(FEMMTForceDataFields fields, String[] fieldNames)
    {
        return findEqualFEMMTForceData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMaterial(FEMMaterialFields fields, String[] fieldNames)
    {
        return findEqualFEMMaterial(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMatrices(FEMMatricesFields fields, String[] fieldNames)
    {
        return findEqualFEMMatrices(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMatrixData(FEMMatrixDataFields fields, String[] fieldNames)
    {
        return findEqualFEMMatrixData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMMatrixSets(FEMMatrixSetsFields fields, String[] fieldNames)
    {
        return findEqualFEMMatrixSets(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNKDisplForce(FEMNKDisplForceFields fields, String[] fieldNames)
    {
        return findEqualFEMNKDisplForce(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNLElasticMaterials(FEMNLElasticMaterialsFields fields, String[] fieldNames)
    {
        return findEqualFEMNLElasticMaterials(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNLElasticStrainStress(FEMNLElasticStrainStressFields fields, String[] fieldNames)
    {
        return findEqualFEMNLElasticStrainStress(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNMTimeMass(FEMNMTimeMassFields fields, String[] fieldNames)
    {
        return findEqualFEMNMTimeMass(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNTNContact(FEMNTNContactFields fields, String[] fieldNames)
    {
        return findEqualFEMNTNContact(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNodalMass(FEMNodalMassFields fields, String[] fieldNames)
    {
        return findEqualFEMNodalMass(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMNode(FEMNodeFields fields, String[] fieldNames)
    {
        return findEqualFEMNode(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMOrthotropicMaterial(FEMOrthotropicMaterialFields fields, String[] fieldNames)
    {
        return findEqualFEMOrthotropicMaterial(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPlasticBilinearMaterial(FEMPlasticBilinearMaterialFields fields, String[] fieldNames)
    {
        return findEqualFEMPlasticBilinearMaterial(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPlasticMlMaterials(FEMPlasticMlMaterialsFields fields, String[] fieldNames)
    {
        return findEqualFEMPlasticMlMaterials(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPlasticStrainStress(FEMPlasticStrainStressFields fields, String[] fieldNames)
    {
        return findEqualFEMPlasticStrainStress(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPlate(FEMPlateFields fields, String[] fieldNames)
    {
        return findEqualFEMPlate(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPlateGroup(FEMPlateGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMPlateGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPoints(FEMPointsFields fields, String[] fieldNames)
    {
        return findEqualFEMPoints(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMProperties(FEMPropertiesFields fields, String[] fieldNames)
    {
        return findEqualFEMProperties(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMPropertysets(FEMPropertysetsFields fields, String[] fieldNames)
    {
        return findEqualFEMPropertysets(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSectionBox(FEMSectionBoxFields fields, String[] fieldNames)
    {
        return findEqualFEMSectionBox(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSectionI(FEMSectionIFields fields, String[] fieldNames)
    {
        return findEqualFEMSectionI(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSectionPipe(FEMSectionPipeFields fields, String[] fieldNames)
    {
        return findEqualFEMSectionPipe(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSectionProp(FEMSectionPropFields fields, String[] fieldNames)
    {
        return findEqualFEMSectionProp(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSectionRect(FEMSectionRectFields fields, String[] fieldNames)
    {
        return findEqualFEMSectionRect(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShell(FEMShellFields fields, String[] fieldNames)
    {
        return findEqualFEMShell(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellAxesOrtho(FEMShellAxesOrthoFields fields, String[] fieldNames)
    {
        return findEqualFEMShellAxesOrtho(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellAxesOrthoData(FEMShellAxesOrthoDataFields fields, String[] fieldNames)
    {
        return findEqualFEMShellAxesOrthoData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellDOF(FEMShellDOFFields fields, String[] fieldNames)
    {
        return findEqualFEMShellDOF(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellGroup(FEMShellGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMShellGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellLayer(FEMShellLayerFields fields, String[] fieldNames)
    {
        return findEqualFEMShellLayer(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMShellPressure(FEMShellPressureFields fields, String[] fieldNames)
    {
        return findEqualFEMShellPressure(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSkewDOF(FEMSkewDOFFields fields, String[] fieldNames)
    {
        return findEqualFEMSkewDOF(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSkewSysAngles(FEMSkewSysAnglesFields fields, String[] fieldNames)
    {
        return findEqualFEMSkewSysAngles(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSkeySysNode(FEMSkeySysNodeFields fields, String[] fieldNames)
    {
        return findEqualFEMSkeySysNode(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSpring(FEMSpringFields fields, String[] fieldNames)
    {
        return findEqualFEMSpring(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMSpringGroup(FEMSpringGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMSpringGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMStrLines(FEMStrLinesFields fields, String[] fieldNames)
    {
        return findEqualFEMStrLines(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThermoIsoData(FEMThermoIsoDataFields fields, String[] fieldNames)
    {
        return findEqualFEMThermoIsoData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThermoIsoMaterials(FEMThermoIsoMaterialsFields fields, String[] fieldNames)
    {
        return findEqualFEMThermoIsoMaterials(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThermoOrthData(FEMThermoOrthDataFields fields, String[] fieldNames)
    {
        return findEqualFEMThermoOrthData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThermoOrthMaterials(FEMThermoOrthMaterialsFields fields, String[] fieldNames)
    {
        return findEqualFEMThermoOrthMaterials(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThreeDSolid(FEMThreeDSolidFields fields, String[] fieldNames)
    {
        return findEqualFEMThreeDSolid(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMThreeDSolidGroup(FEMThreeDSolidGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMThreeDSolidGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTimeFunctionData(FEMTimeFunctionDataFields fields, String[] fieldNames)
    {
        return findEqualFEMTimeFunctionData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTimeFunctions(FEMTimeFunctionsFields fields, String[] fieldNames)
    {
        return findEqualFEMTimeFunctions(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTruss(FEMTrussFields fields, String[] fieldNames)
    {
        return findEqualFEMTruss(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTrussGroup(FEMTrussGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMTrussGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTwistMomentData(FEMTwistMomentDataFields fields, String[] fieldNames)
    {
        return findEqualFEMTwistMomentData(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTwoDSolid(FEMTwoDSolidFields fields, String[] fieldNames)
    {
        return findEqualFEMTwoDSolid(fields, fieldNames, null);
    }

    public final long[]
    findEqualFEMTwoDSolidGroup(FEMTwoDSolidGroupFields fields, String[] fieldNames)
    {
        return findEqualFEMTwoDSolidGroup(fields, fieldNames, null);
    }

    public final long[]
    findEqualMappingMatrix(MappingMatrixFields fields, String[] fieldNames)
    {
        return findEqualMappingMatrix(fields, fieldNames, null);
    }

    public final long[]
    findEqualSensor(SensorFields fields, String[] fieldNames)
    {
        return findEqualSensor(fields, fieldNames, null);
    }

    public final long[]
    findEqualSensorTimeData(SensorTimeDataFields fields, String[] fieldNames)
    {
        return findEqualSensorTimeData(fields, fieldNames, null);
    }

    public final long[]
    findEqualStructure(StructureFields fields, String[] fieldNames)
    {
        return findEqualStructure(fields, fieldNames, null);
    }

    public final long[]
    findEqualTransducer(TransducerFields fields, String[] fieldNames)
    {
        return findEqualTransducer(fields, fieldNames, null);
    }

    public final long[]
    findEqualTransducerCycleData(TransducerCycleDataFields fields, String[] fieldNames)
    {
        return findEqualTransducerCycleData(fields, fieldNames, null);
    }

    public final long[]
    findEqualTransducerTimeData(TransducerTimeDataFields fields, String[] fieldNames)
    {
        return findEqualTransducerTimeData(fields, fieldNames, null);
    }

    public final AccelMeasPrx
    getAccelMeas(long id)
    {
        return getAccelMeas(id, null);
    }

    public final AccelMeasFields
    getAccelMeasFields(long id)
    {
        return getAccelMeasFields(id, null);
    }

    public final AccelMeasFields[]
    getAccelMeasFieldsList(long[] ids)
    {
        return getAccelMeasFieldsList(ids, null);
    }

    public final long[]
    getAccelMeasIds()
    {
        return getAccelMeasIds(null);
    }

    public final AccelMeasPrx[]
    getAccelMeasList(long[] ids)
    {
        return getAccelMeasList(ids, null);
    }

    public final CyclePrx
    getCycle(long id)
    {
        return getCycle(id, null);
    }

    public final CycleFields
    getCycleFields(long id)
    {
        return getCycleFields(id, null);
    }

    public final CycleFields[]
    getCycleFieldsList(long[] ids)
    {
        return getCycleFieldsList(ids, null);
    }

    public final long[]
    getCycleIds()
    {
        return getCycleIds(null);
    }

    public final CyclePrx[]
    getCycleList(long[] ids)
    {
        return getCycleList(ids, null);
    }

    public final DaqUnitPrx
    getDaqUnit(long id)
    {
        return getDaqUnit(id, null);
    }

    public final DaqUnitChannelPrx
    getDaqUnitChannel(long id)
    {
        return getDaqUnitChannel(id, null);
    }

    public final DaqUnitChannelDataPrx
    getDaqUnitChannelData(long id)
    {
        return getDaqUnitChannelData(id, null);
    }

    public final DaqUnitChannelDataFields
    getDaqUnitChannelDataFields(long id)
    {
        return getDaqUnitChannelDataFields(id, null);
    }

    public final DaqUnitChannelDataFields[]
    getDaqUnitChannelDataFieldsList(long[] ids)
    {
        return getDaqUnitChannelDataFieldsList(ids, null);
    }

    public final long[]
    getDaqUnitChannelDataIds()
    {
        return getDaqUnitChannelDataIds(null);
    }

    public final DaqUnitChannelDataPrx[]
    getDaqUnitChannelDataList(long[] ids)
    {
        return getDaqUnitChannelDataList(ids, null);
    }

    public final DaqUnitChannelFields
    getDaqUnitChannelFields(long id)
    {
        return getDaqUnitChannelFields(id, null);
    }

    public final DaqUnitChannelFields[]
    getDaqUnitChannelFieldsList(long[] ids)
    {
        return getDaqUnitChannelFieldsList(ids, null);
    }

    public final long[]
    getDaqUnitChannelIds()
    {
        return getDaqUnitChannelIds(null);
    }

    public final DaqUnitChannelPrx[]
    getDaqUnitChannelList(long[] ids)
    {
        return getDaqUnitChannelList(ids, null);
    }

    public final DaqUnitFields
    getDaqUnitFields(long id)
    {
        return getDaqUnitFields(id, null);
    }

    public final DaqUnitFields[]
    getDaqUnitFieldsList(long[] ids)
    {
        return getDaqUnitFieldsList(ids, null);
    }

    public final long[]
    getDaqUnitIds()
    {
        return getDaqUnitIds(null);
    }

    public final DaqUnitPrx[]
    getDaqUnitList(long[] ids)
    {
        return getDaqUnitList(ids, null);
    }

    public final ExperimentPrx
    getExperiment(long id)
    {
        return getExperiment(id, null);
    }

    public final ExperimentFields
    getExperimentFields(long id)
    {
        return getExperimentFields(id, null);
    }

    public final ExperimentFields[]
    getExperimentFieldsList(long[] ids)
    {
        return getExperimentFieldsList(ids, null);
    }

    public final long[]
    getExperimentIds()
    {
        return getExperimentIds(null);
    }

    public final ExperimentPrx[]
    getExperimentList(long[] ids)
    {
        return getExperimentList(ids, null);
    }

    public final ExperimentStructureDataPrx
    getExperimentStructureData(long id)
    {
        return getExperimentStructureData(id, null);
    }

    public final ExperimentStructureDataFields
    getExperimentStructureDataFields(long id)
    {
        return getExperimentStructureDataFields(id, null);
    }

    public final ExperimentStructureDataFields[]
    getExperimentStructureDataFieldsList(long[] ids)
    {
        return getExperimentStructureDataFieldsList(ids, null);
    }

    public final long[]
    getExperimentStructureDataIds()
    {
        return getExperimentStructureDataIds(null);
    }

    public final ExperimentStructureDataPrx[]
    getExperimentStructureDataList(long[] ids)
    {
        return getExperimentStructureDataList(ids, null);
    }

    public final FEMAppliedConcentratedLoadPrx
    getFEMAppliedConcentratedLoad(long id)
    {
        return getFEMAppliedConcentratedLoad(id, null);
    }

    public final FEMAppliedConcentratedLoadFields
    getFEMAppliedConcentratedLoadFields(long id)
    {
        return getFEMAppliedConcentratedLoadFields(id, null);
    }

    public final FEMAppliedConcentratedLoadFields[]
    getFEMAppliedConcentratedLoadFieldsList(long[] ids)
    {
        return getFEMAppliedConcentratedLoadFieldsList(ids, null);
    }

    public final long[]
    getFEMAppliedConcentratedLoadIds()
    {
        return getFEMAppliedConcentratedLoadIds(null);
    }

    public final FEMAppliedConcentratedLoadPrx[]
    getFEMAppliedConcentratedLoadList(long[] ids)
    {
        return getFEMAppliedConcentratedLoadList(ids, null);
    }

    public final FEMAppliedDisplacementPrx
    getFEMAppliedDisplacement(long id)
    {
        return getFEMAppliedDisplacement(id, null);
    }

    public final FEMAppliedDisplacementFields
    getFEMAppliedDisplacementFields(long id)
    {
        return getFEMAppliedDisplacementFields(id, null);
    }

    public final FEMAppliedDisplacementFields[]
    getFEMAppliedDisplacementFieldsList(long[] ids)
    {
        return getFEMAppliedDisplacementFieldsList(ids, null);
    }

    public final long[]
    getFEMAppliedDisplacementIds()
    {
        return getFEMAppliedDisplacementIds(null);
    }

    public final FEMAppliedDisplacementPrx[]
    getFEMAppliedDisplacementList(long[] ids)
    {
        return getFEMAppliedDisplacementList(ids, null);
    }

    public final FEMAppliedLoadsPrx
    getFEMAppliedLoads(long id)
    {
        return getFEMAppliedLoads(id, null);
    }

    public final FEMAppliedLoadsFields
    getFEMAppliedLoadsFields(long id)
    {
        return getFEMAppliedLoadsFields(id, null);
    }

    public final FEMAppliedLoadsFields[]
    getFEMAppliedLoadsFieldsList(long[] ids)
    {
        return getFEMAppliedLoadsFieldsList(ids, null);
    }

    public final long[]
    getFEMAppliedLoadsIds()
    {
        return getFEMAppliedLoadsIds(null);
    }

    public final FEMAppliedLoadsPrx[]
    getFEMAppliedLoadsList(long[] ids)
    {
        return getFEMAppliedLoadsList(ids, null);
    }

    public final FEMAppliedTemperaturePrx
    getFEMAppliedTemperature(long id)
    {
        return getFEMAppliedTemperature(id, null);
    }

    public final FEMAppliedTemperatureFields
    getFEMAppliedTemperatureFields(long id)
    {
        return getFEMAppliedTemperatureFields(id, null);
    }

    public final FEMAppliedTemperatureFields[]
    getFEMAppliedTemperatureFieldsList(long[] ids)
    {
        return getFEMAppliedTemperatureFieldsList(ids, null);
    }

    public final long[]
    getFEMAppliedTemperatureIds()
    {
        return getFEMAppliedTemperatureIds(null);
    }

    public final FEMAppliedTemperaturePrx[]
    getFEMAppliedTemperatureList(long[] ids)
    {
        return getFEMAppliedTemperatureList(ids, null);
    }

    public final FEMAxesNodePrx
    getFEMAxesNode(long id)
    {
        return getFEMAxesNode(id, null);
    }

    public final FEMAxesNodeFields
    getFEMAxesNodeFields(long id)
    {
        return getFEMAxesNodeFields(id, null);
    }

    public final FEMAxesNodeFields[]
    getFEMAxesNodeFieldsList(long[] ids)
    {
        return getFEMAxesNodeFieldsList(ids, null);
    }

    public final long[]
    getFEMAxesNodeIds()
    {
        return getFEMAxesNodeIds(null);
    }

    public final FEMAxesNodePrx[]
    getFEMAxesNodeList(long[] ids)
    {
        return getFEMAxesNodeList(ids, null);
    }

    public final FEMBeamPrx
    getFEMBeam(long id)
    {
        return getFEMBeam(id, null);
    }

    public final FEMBeamFields
    getFEMBeamFields(long id)
    {
        return getFEMBeamFields(id, null);
    }

    public final FEMBeamFields[]
    getFEMBeamFieldsList(long[] ids)
    {
        return getFEMBeamFieldsList(ids, null);
    }

    public final long[]
    getFEMBeamIds()
    {
        return getFEMBeamIds(null);
    }

    public final FEMBeamPrx[]
    getFEMBeamList(long[] ids)
    {
        return getFEMBeamList(ids, null);
    }

    public final FEMBeamLoadPrx
    getFEMBeamLoad(long id)
    {
        return getFEMBeamLoad(id, null);
    }

    public final FEMBeamLoadFields
    getFEMBeamLoadFields(long id)
    {
        return getFEMBeamLoadFields(id, null);
    }

    public final FEMBeamLoadFields[]
    getFEMBeamLoadFieldsList(long[] ids)
    {
        return getFEMBeamLoadFieldsList(ids, null);
    }

    public final long[]
    getFEMBeamLoadIds()
    {
        return getFEMBeamLoadIds(null);
    }

    public final FEMBeamLoadPrx[]
    getFEMBeamLoadList(long[] ids)
    {
        return getFEMBeamLoadList(ids, null);
    }

    public final FEMBeamNodePrx
    getFEMBeamNode(long id)
    {
        return getFEMBeamNode(id, null);
    }

    public final FEMBeamNodeFields
    getFEMBeamNodeFields(long id)
    {
        return getFEMBeamNodeFields(id, null);
    }

    public final FEMBeamNodeFields[]
    getFEMBeamNodeFieldsList(long[] ids)
    {
        return getFEMBeamNodeFieldsList(ids, null);
    }

    public final long[]
    getFEMBeamNodeIds()
    {
        return getFEMBeamNodeIds(null);
    }

    public final FEMBeamNodePrx[]
    getFEMBeamNodeList(long[] ids)
    {
        return getFEMBeamNodeList(ids, null);
    }

    public final FEMBoundaryPrx
    getFEMBoundary(long id)
    {
        return getFEMBoundary(id, null);
    }

    public final FEMBoundaryFields
    getFEMBoundaryFields(long id)
    {
        return getFEMBoundaryFields(id, null);
    }

    public final FEMBoundaryFields[]
    getFEMBoundaryFieldsList(long[] ids)
    {
        return getFEMBoundaryFieldsList(ids, null);
    }

    public final long[]
    getFEMBoundaryIds()
    {
        return getFEMBoundaryIds(null);
    }

    public final FEMBoundaryPrx[]
    getFEMBoundaryList(long[] ids)
    {
        return getFEMBoundaryList(ids, null);
    }

    public final FEMConstraintCoefPrx
    getFEMConstraintCoef(long id)
    {
        return getFEMConstraintCoef(id, null);
    }

    public final FEMConstraintCoefFields
    getFEMConstraintCoefFields(long id)
    {
        return getFEMConstraintCoefFields(id, null);
    }

    public final FEMConstraintCoefFields[]
    getFEMConstraintCoefFieldsList(long[] ids)
    {
        return getFEMConstraintCoefFieldsList(ids, null);
    }

    public final long[]
    getFEMConstraintCoefIds()
    {
        return getFEMConstraintCoefIds(null);
    }

    public final FEMConstraintCoefPrx[]
    getFEMConstraintCoefList(long[] ids)
    {
        return getFEMConstraintCoefList(ids, null);
    }

    public final FEMConstraintsPrx
    getFEMConstraints(long id)
    {
        return getFEMConstraints(id, null);
    }

    public final FEMConstraintsFields
    getFEMConstraintsFields(long id)
    {
        return getFEMConstraintsFields(id, null);
    }

    public final FEMConstraintsFields[]
    getFEMConstraintsFieldsList(long[] ids)
    {
        return getFEMConstraintsFieldsList(ids, null);
    }

    public final long[]
    getFEMConstraintsIds()
    {
        return getFEMConstraintsIds(null);
    }

    public final FEMConstraintsPrx[]
    getFEMConstraintsList(long[] ids)
    {
        return getFEMConstraintsList(ids, null);
    }

    public final FEMContactGroup3Prx
    getFEMContactGroup3(long id)
    {
        return getFEMContactGroup3(id, null);
    }

    public final FEMContactGroup3Fields
    getFEMContactGroup3Fields(long id)
    {
        return getFEMContactGroup3Fields(id, null);
    }

    public final FEMContactGroup3Fields[]
    getFEMContactGroup3FieldsList(long[] ids)
    {
        return getFEMContactGroup3FieldsList(ids, null);
    }

    public final long[]
    getFEMContactGroup3Ids()
    {
        return getFEMContactGroup3Ids(null);
    }

    public final FEMContactGroup3Prx[]
    getFEMContactGroup3List(long[] ids)
    {
        return getFEMContactGroup3List(ids, null);
    }

    public final FEMContactPairsPrx
    getFEMContactPairs(long id)
    {
        return getFEMContactPairs(id, null);
    }

    public final FEMContactPairsFields
    getFEMContactPairsFields(long id)
    {
        return getFEMContactPairsFields(id, null);
    }

    public final FEMContactPairsFields[]
    getFEMContactPairsFieldsList(long[] ids)
    {
        return getFEMContactPairsFieldsList(ids, null);
    }

    public final long[]
    getFEMContactPairsIds()
    {
        return getFEMContactPairsIds(null);
    }

    public final FEMContactPairsPrx[]
    getFEMContactPairsList(long[] ids)
    {
        return getFEMContactPairsList(ids, null);
    }

    public final FEMContactSurfacePrx
    getFEMContactSurface(long id)
    {
        return getFEMContactSurface(id, null);
    }

    public final FEMContactSurfaceFields
    getFEMContactSurfaceFields(long id)
    {
        return getFEMContactSurfaceFields(id, null);
    }

    public final FEMContactSurfaceFields[]
    getFEMContactSurfaceFieldsList(long[] ids)
    {
        return getFEMContactSurfaceFieldsList(ids, null);
    }

    public final long[]
    getFEMContactSurfaceIds()
    {
        return getFEMContactSurfaceIds(null);
    }

    public final FEMContactSurfacePrx[]
    getFEMContactSurfaceList(long[] ids)
    {
        return getFEMContactSurfaceList(ids, null);
    }

    public final FEMCoordSystemPrx
    getFEMCoordSystem(long id)
    {
        return getFEMCoordSystem(id, null);
    }

    public final FEMCoordSystemFields
    getFEMCoordSystemFields(long id)
    {
        return getFEMCoordSystemFields(id, null);
    }

    public final FEMCoordSystemFields[]
    getFEMCoordSystemFieldsList(long[] ids)
    {
        return getFEMCoordSystemFieldsList(ids, null);
    }

    public final long[]
    getFEMCoordSystemIds()
    {
        return getFEMCoordSystemIds(null);
    }

    public final FEMCoordSystemPrx[]
    getFEMCoordSystemList(long[] ids)
    {
        return getFEMCoordSystemList(ids, null);
    }

    public final FEMCrossSectionsPrx
    getFEMCrossSections(long id)
    {
        return getFEMCrossSections(id, null);
    }

    public final FEMCrossSectionsFields
    getFEMCrossSectionsFields(long id)
    {
        return getFEMCrossSectionsFields(id, null);
    }

    public final FEMCrossSectionsFields[]
    getFEMCrossSectionsFieldsList(long[] ids)
    {
        return getFEMCrossSectionsFieldsList(ids, null);
    }

    public final long[]
    getFEMCrossSectionsIds()
    {
        return getFEMCrossSectionsIds(null);
    }

    public final FEMCrossSectionsPrx[]
    getFEMCrossSectionsList(long[] ids)
    {
        return getFEMCrossSectionsList(ids, null);
    }

    public final FEMCurvMomentDataPrx
    getFEMCurvMomentData(long id)
    {
        return getFEMCurvMomentData(id, null);
    }

    public final FEMCurvMomentDataFields
    getFEMCurvMomentDataFields(long id)
    {
        return getFEMCurvMomentDataFields(id, null);
    }

    public final FEMCurvMomentDataFields[]
    getFEMCurvMomentDataFieldsList(long[] ids)
    {
        return getFEMCurvMomentDataFieldsList(ids, null);
    }

    public final long[]
    getFEMCurvMomentDataIds()
    {
        return getFEMCurvMomentDataIds(null);
    }

    public final FEMCurvMomentDataPrx[]
    getFEMCurvMomentDataList(long[] ids)
    {
        return getFEMCurvMomentDataList(ids, null);
    }

    public final FEMDampingPrx
    getFEMDamping(long id)
    {
        return getFEMDamping(id, null);
    }

    public final FEMDampingFields
    getFEMDampingFields(long id)
    {
        return getFEMDampingFields(id, null);
    }

    public final FEMDampingFields[]
    getFEMDampingFieldsList(long[] ids)
    {
        return getFEMDampingFieldsList(ids, null);
    }

    public final long[]
    getFEMDampingIds()
    {
        return getFEMDampingIds(null);
    }

    public final FEMDampingPrx[]
    getFEMDampingList(long[] ids)
    {
        return getFEMDampingList(ids, null);
    }

    public final FEMDofPrx
    getFEMDof(long id)
    {
        return getFEMDof(id, null);
    }

    public final FEMDofFields
    getFEMDofFields(long id)
    {
        return getFEMDofFields(id, null);
    }

    public final FEMDofFields[]
    getFEMDofFieldsList(long[] ids)
    {
        return getFEMDofFieldsList(ids, null);
    }

    public final long[]
    getFEMDofIds()
    {
        return getFEMDofIds(null);
    }

    public final FEMDofPrx[]
    getFEMDofList(long[] ids)
    {
        return getFEMDofList(ids, null);
    }

    public final FEMElasticMaterialPrx
    getFEMElasticMaterial(long id)
    {
        return getFEMElasticMaterial(id, null);
    }

    public final FEMElasticMaterialFields
    getFEMElasticMaterialFields(long id)
    {
        return getFEMElasticMaterialFields(id, null);
    }

    public final FEMElasticMaterialFields[]
    getFEMElasticMaterialFieldsList(long[] ids)
    {
        return getFEMElasticMaterialFieldsList(ids, null);
    }

    public final long[]
    getFEMElasticMaterialIds()
    {
        return getFEMElasticMaterialIds(null);
    }

    public final FEMElasticMaterialPrx[]
    getFEMElasticMaterialList(long[] ids)
    {
        return getFEMElasticMaterialList(ids, null);
    }

    public final FEMEndreleasesPrx
    getFEMEndreleases(long id)
    {
        return getFEMEndreleases(id, null);
    }

    public final FEMEndreleasesFields
    getFEMEndreleasesFields(long id)
    {
        return getFEMEndreleasesFields(id, null);
    }

    public final FEMEndreleasesFields[]
    getFEMEndreleasesFieldsList(long[] ids)
    {
        return getFEMEndreleasesFieldsList(ids, null);
    }

    public final long[]
    getFEMEndreleasesIds()
    {
        return getFEMEndreleasesIds(null);
    }

    public final FEMEndreleasesPrx[]
    getFEMEndreleasesList(long[] ids)
    {
        return getFEMEndreleasesList(ids, null);
    }

    public final FEMForceStrainDataPrx
    getFEMForceStrainData(long id)
    {
        return getFEMForceStrainData(id, null);
    }

    public final FEMForceStrainDataFields
    getFEMForceStrainDataFields(long id)
    {
        return getFEMForceStrainDataFields(id, null);
    }

    public final FEMForceStrainDataFields[]
    getFEMForceStrainDataFieldsList(long[] ids)
    {
        return getFEMForceStrainDataFieldsList(ids, null);
    }

    public final long[]
    getFEMForceStrainDataIds()
    {
        return getFEMForceStrainDataIds(null);
    }

    public final FEMForceStrainDataPrx[]
    getFEMForceStrainDataList(long[] ids)
    {
        return getFEMForceStrainDataList(ids, null);
    }

    public final FEMGeneralPrx
    getFEMGeneral(long id)
    {
        return getFEMGeneral(id, null);
    }

    public final FEMGeneralFields
    getFEMGeneralFields(long id)
    {
        return getFEMGeneralFields(id, null);
    }

    public final FEMGeneralFields[]
    getFEMGeneralFieldsList(long[] ids)
    {
        return getFEMGeneralFieldsList(ids, null);
    }

    public final FEMGeneralGroupPrx
    getFEMGeneralGroup(long id)
    {
        return getFEMGeneralGroup(id, null);
    }

    public final FEMGeneralGroupFields
    getFEMGeneralGroupFields(long id)
    {
        return getFEMGeneralGroupFields(id, null);
    }

    public final FEMGeneralGroupFields[]
    getFEMGeneralGroupFieldsList(long[] ids)
    {
        return getFEMGeneralGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMGeneralGroupIds()
    {
        return getFEMGeneralGroupIds(null);
    }

    public final FEMGeneralGroupPrx[]
    getFEMGeneralGroupList(long[] ids)
    {
        return getFEMGeneralGroupList(ids, null);
    }

    public final long[]
    getFEMGeneralIds()
    {
        return getFEMGeneralIds(null);
    }

    public final FEMGeneralPrx[]
    getFEMGeneralList(long[] ids)
    {
        return getFEMGeneralList(ids, null);
    }

    public final FEMGeneralNodePrx
    getFEMGeneralNode(long id)
    {
        return getFEMGeneralNode(id, null);
    }

    public final FEMGeneralNodeFields
    getFEMGeneralNodeFields(long id)
    {
        return getFEMGeneralNodeFields(id, null);
    }

    public final FEMGeneralNodeFields[]
    getFEMGeneralNodeFieldsList(long[] ids)
    {
        return getFEMGeneralNodeFieldsList(ids, null);
    }

    public final long[]
    getFEMGeneralNodeIds()
    {
        return getFEMGeneralNodeIds(null);
    }

    public final FEMGeneralNodePrx[]
    getFEMGeneralNodeList(long[] ids)
    {
        return getFEMGeneralNodeList(ids, null);
    }

    public final FEMGroundMotionRecordPrx
    getFEMGroundMotionRecord(long id)
    {
        return getFEMGroundMotionRecord(id, null);
    }

    public final FEMGroundMotionRecordFields
    getFEMGroundMotionRecordFields(long id)
    {
        return getFEMGroundMotionRecordFields(id, null);
    }

    public final FEMGroundMotionRecordFields[]
    getFEMGroundMotionRecordFieldsList(long[] ids)
    {
        return getFEMGroundMotionRecordFieldsList(ids, null);
    }

    public final long[]
    getFEMGroundMotionRecordIds()
    {
        return getFEMGroundMotionRecordIds(null);
    }

    public final FEMGroundMotionRecordPrx[]
    getFEMGroundMotionRecordList(long[] ids)
    {
        return getFEMGroundMotionRecordList(ids, null);
    }

    public final FEMGroupPrx
    getFEMGroup(long id)
    {
        return getFEMGroup(id, null);
    }

    public final FEMGroupFields
    getFEMGroupFields(long id)
    {
        return getFEMGroupFields(id, null);
    }

    public final FEMGroupFields[]
    getFEMGroupFieldsList(long[] ids)
    {
        return getFEMGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMGroupIds()
    {
        return getFEMGroupIds(null);
    }

    public final FEMGroupPrx[]
    getFEMGroupList(long[] ids)
    {
        return getFEMGroupList(ids, null);
    }

    public final FEMInitialTemperaturePrx
    getFEMInitialTemperature(long id)
    {
        return getFEMInitialTemperature(id, null);
    }

    public final FEMInitialTemperatureFields
    getFEMInitialTemperatureFields(long id)
    {
        return getFEMInitialTemperatureFields(id, null);
    }

    public final FEMInitialTemperatureFields[]
    getFEMInitialTemperatureFieldsList(long[] ids)
    {
        return getFEMInitialTemperatureFieldsList(ids, null);
    }

    public final long[]
    getFEMInitialTemperatureIds()
    {
        return getFEMInitialTemperatureIds(null);
    }

    public final FEMInitialTemperaturePrx[]
    getFEMInitialTemperatureList(long[] ids)
    {
        return getFEMInitialTemperatureList(ids, null);
    }

    public final FEMIsoBeamPrx
    getFEMIsoBeam(long id)
    {
        return getFEMIsoBeam(id, null);
    }

    public final FEMIsoBeamFields
    getFEMIsoBeamFields(long id)
    {
        return getFEMIsoBeamFields(id, null);
    }

    public final FEMIsoBeamFields[]
    getFEMIsoBeamFieldsList(long[] ids)
    {
        return getFEMIsoBeamFieldsList(ids, null);
    }

    public final FEMIsoBeamGroupPrx
    getFEMIsoBeamGroup(long id)
    {
        return getFEMIsoBeamGroup(id, null);
    }

    public final FEMIsoBeamGroupFields
    getFEMIsoBeamGroupFields(long id)
    {
        return getFEMIsoBeamGroupFields(id, null);
    }

    public final FEMIsoBeamGroupFields[]
    getFEMIsoBeamGroupFieldsList(long[] ids)
    {
        return getFEMIsoBeamGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMIsoBeamGroupIds()
    {
        return getFEMIsoBeamGroupIds(null);
    }

    public final FEMIsoBeamGroupPrx[]
    getFEMIsoBeamGroupList(long[] ids)
    {
        return getFEMIsoBeamGroupList(ids, null);
    }

    public final long[]
    getFEMIsoBeamIds()
    {
        return getFEMIsoBeamIds(null);
    }

    public final FEMIsoBeamPrx[]
    getFEMIsoBeamList(long[] ids)
    {
        return getFEMIsoBeamList(ids, null);
    }

    public final FEMLinkPrx
    getFEMLink(long id)
    {
        return getFEMLink(id, null);
    }

    public final FEMLinkFields
    getFEMLinkFields(long id)
    {
        return getFEMLinkFields(id, null);
    }

    public final FEMLinkFields[]
    getFEMLinkFieldsList(long[] ids)
    {
        return getFEMLinkFieldsList(ids, null);
    }

    public final long[]
    getFEMLinkIds()
    {
        return getFEMLinkIds(null);
    }

    public final FEMLinkPrx[]
    getFEMLinkList(long[] ids)
    {
        return getFEMLinkList(ids, null);
    }

    public final FEMLoadMassProportionalPrx
    getFEMLoadMassProportional(long id)
    {
        return getFEMLoadMassProportional(id, null);
    }

    public final FEMLoadMassProportionalFields
    getFEMLoadMassProportionalFields(long id)
    {
        return getFEMLoadMassProportionalFields(id, null);
    }

    public final FEMLoadMassProportionalFields[]
    getFEMLoadMassProportionalFieldsList(long[] ids)
    {
        return getFEMLoadMassProportionalFieldsList(ids, null);
    }

    public final long[]
    getFEMLoadMassProportionalIds()
    {
        return getFEMLoadMassProportionalIds(null);
    }

    public final FEMLoadMassProportionalPrx[]
    getFEMLoadMassProportionalList(long[] ids)
    {
        return getFEMLoadMassProportionalList(ids, null);
    }

    public final FEMMCForceDataPrx
    getFEMMCForceData(long id)
    {
        return getFEMMCForceData(id, null);
    }

    public final FEMMCForceDataFields
    getFEMMCForceDataFields(long id)
    {
        return getFEMMCForceDataFields(id, null);
    }

    public final FEMMCForceDataFields[]
    getFEMMCForceDataFieldsList(long[] ids)
    {
        return getFEMMCForceDataFieldsList(ids, null);
    }

    public final long[]
    getFEMMCForceDataIds()
    {
        return getFEMMCForceDataIds(null);
    }

    public final FEMMCForceDataPrx[]
    getFEMMCForceDataList(long[] ids)
    {
        return getFEMMCForceDataList(ids, null);
    }

    public final FEMMCrigiditiesPrx
    getFEMMCrigidities(long id)
    {
        return getFEMMCrigidities(id, null);
    }

    public final FEMMCrigiditiesFields
    getFEMMCrigiditiesFields(long id)
    {
        return getFEMMCrigiditiesFields(id, null);
    }

    public final FEMMCrigiditiesFields[]
    getFEMMCrigiditiesFieldsList(long[] ids)
    {
        return getFEMMCrigiditiesFieldsList(ids, null);
    }

    public final long[]
    getFEMMCrigiditiesIds()
    {
        return getFEMMCrigiditiesIds(null);
    }

    public final FEMMCrigiditiesPrx[]
    getFEMMCrigiditiesList(long[] ids)
    {
        return getFEMMCrigiditiesList(ids, null);
    }

    public final FEMMTForceDataPrx
    getFEMMTForceData(long id)
    {
        return getFEMMTForceData(id, null);
    }

    public final FEMMTForceDataFields
    getFEMMTForceDataFields(long id)
    {
        return getFEMMTForceDataFields(id, null);
    }

    public final FEMMTForceDataFields[]
    getFEMMTForceDataFieldsList(long[] ids)
    {
        return getFEMMTForceDataFieldsList(ids, null);
    }

    public final long[]
    getFEMMTForceDataIds()
    {
        return getFEMMTForceDataIds(null);
    }

    public final FEMMTForceDataPrx[]
    getFEMMTForceDataList(long[] ids)
    {
        return getFEMMTForceDataList(ids, null);
    }

    public final FEMMaterialPrx
    getFEMMaterial(long id)
    {
        return getFEMMaterial(id, null);
    }

    public final FEMMaterialFields
    getFEMMaterialFields(long id)
    {
        return getFEMMaterialFields(id, null);
    }

    public final FEMMaterialFields[]
    getFEMMaterialFieldsList(long[] ids)
    {
        return getFEMMaterialFieldsList(ids, null);
    }

    public final long[]
    getFEMMaterialIds()
    {
        return getFEMMaterialIds(null);
    }

    public final FEMMaterialPrx[]
    getFEMMaterialList(long[] ids)
    {
        return getFEMMaterialList(ids, null);
    }

    public final FEMMatricesPrx
    getFEMMatrices(long id)
    {
        return getFEMMatrices(id, null);
    }

    public final FEMMatricesFields
    getFEMMatricesFields(long id)
    {
        return getFEMMatricesFields(id, null);
    }

    public final FEMMatricesFields[]
    getFEMMatricesFieldsList(long[] ids)
    {
        return getFEMMatricesFieldsList(ids, null);
    }

    public final long[]
    getFEMMatricesIds()
    {
        return getFEMMatricesIds(null);
    }

    public final FEMMatricesPrx[]
    getFEMMatricesList(long[] ids)
    {
        return getFEMMatricesList(ids, null);
    }

    public final FEMMatrixDataPrx
    getFEMMatrixData(long id)
    {
        return getFEMMatrixData(id, null);
    }

    public final FEMMatrixDataFields
    getFEMMatrixDataFields(long id)
    {
        return getFEMMatrixDataFields(id, null);
    }

    public final FEMMatrixDataFields[]
    getFEMMatrixDataFieldsList(long[] ids)
    {
        return getFEMMatrixDataFieldsList(ids, null);
    }

    public final long[]
    getFEMMatrixDataIds()
    {
        return getFEMMatrixDataIds(null);
    }

    public final FEMMatrixDataPrx[]
    getFEMMatrixDataList(long[] ids)
    {
        return getFEMMatrixDataList(ids, null);
    }

    public final FEMMatrixSetsPrx
    getFEMMatrixSets(long id)
    {
        return getFEMMatrixSets(id, null);
    }

    public final FEMMatrixSetsFields
    getFEMMatrixSetsFields(long id)
    {
        return getFEMMatrixSetsFields(id, null);
    }

    public final FEMMatrixSetsFields[]
    getFEMMatrixSetsFieldsList(long[] ids)
    {
        return getFEMMatrixSetsFieldsList(ids, null);
    }

    public final long[]
    getFEMMatrixSetsIds()
    {
        return getFEMMatrixSetsIds(null);
    }

    public final FEMMatrixSetsPrx[]
    getFEMMatrixSetsList(long[] ids)
    {
        return getFEMMatrixSetsList(ids, null);
    }

    public final FEMNKDisplForcePrx
    getFEMNKDisplForce(long id)
    {
        return getFEMNKDisplForce(id, null);
    }

    public final FEMNKDisplForceFields
    getFEMNKDisplForceFields(long id)
    {
        return getFEMNKDisplForceFields(id, null);
    }

    public final FEMNKDisplForceFields[]
    getFEMNKDisplForceFieldsList(long[] ids)
    {
        return getFEMNKDisplForceFieldsList(ids, null);
    }

    public final long[]
    getFEMNKDisplForceIds()
    {
        return getFEMNKDisplForceIds(null);
    }

    public final FEMNKDisplForcePrx[]
    getFEMNKDisplForceList(long[] ids)
    {
        return getFEMNKDisplForceList(ids, null);
    }

    public final FEMNLElasticMaterialsPrx
    getFEMNLElasticMaterials(long id)
    {
        return getFEMNLElasticMaterials(id, null);
    }

    public final FEMNLElasticMaterialsFields
    getFEMNLElasticMaterialsFields(long id)
    {
        return getFEMNLElasticMaterialsFields(id, null);
    }

    public final FEMNLElasticMaterialsFields[]
    getFEMNLElasticMaterialsFieldsList(long[] ids)
    {
        return getFEMNLElasticMaterialsFieldsList(ids, null);
    }

    public final long[]
    getFEMNLElasticMaterialsIds()
    {
        return getFEMNLElasticMaterialsIds(null);
    }

    public final FEMNLElasticMaterialsPrx[]
    getFEMNLElasticMaterialsList(long[] ids)
    {
        return getFEMNLElasticMaterialsList(ids, null);
    }

    public final FEMNLElasticStrainStressPrx
    getFEMNLElasticStrainStress(long id)
    {
        return getFEMNLElasticStrainStress(id, null);
    }

    public final FEMNLElasticStrainStressFields
    getFEMNLElasticStrainStressFields(long id)
    {
        return getFEMNLElasticStrainStressFields(id, null);
    }

    public final FEMNLElasticStrainStressFields[]
    getFEMNLElasticStrainStressFieldsList(long[] ids)
    {
        return getFEMNLElasticStrainStressFieldsList(ids, null);
    }

    public final long[]
    getFEMNLElasticStrainStressIds()
    {
        return getFEMNLElasticStrainStressIds(null);
    }

    public final FEMNLElasticStrainStressPrx[]
    getFEMNLElasticStrainStressList(long[] ids)
    {
        return getFEMNLElasticStrainStressList(ids, null);
    }

    public final FEMNMTimeMassPrx
    getFEMNMTimeMass(long id)
    {
        return getFEMNMTimeMass(id, null);
    }

    public final FEMNMTimeMassFields
    getFEMNMTimeMassFields(long id)
    {
        return getFEMNMTimeMassFields(id, null);
    }

    public final FEMNMTimeMassFields[]
    getFEMNMTimeMassFieldsList(long[] ids)
    {
        return getFEMNMTimeMassFieldsList(ids, null);
    }

    public final long[]
    getFEMNMTimeMassIds()
    {
        return getFEMNMTimeMassIds(null);
    }

    public final FEMNMTimeMassPrx[]
    getFEMNMTimeMassList(long[] ids)
    {
        return getFEMNMTimeMassList(ids, null);
    }

    public final FEMNTNContactPrx
    getFEMNTNContact(long id)
    {
        return getFEMNTNContact(id, null);
    }

    public final FEMNTNContactFields
    getFEMNTNContactFields(long id)
    {
        return getFEMNTNContactFields(id, null);
    }

    public final FEMNTNContactFields[]
    getFEMNTNContactFieldsList(long[] ids)
    {
        return getFEMNTNContactFieldsList(ids, null);
    }

    public final long[]
    getFEMNTNContactIds()
    {
        return getFEMNTNContactIds(null);
    }

    public final FEMNTNContactPrx[]
    getFEMNTNContactList(long[] ids)
    {
        return getFEMNTNContactList(ids, null);
    }

    public final FEMNodalMassPrx
    getFEMNodalMass(long id)
    {
        return getFEMNodalMass(id, null);
    }

    public final FEMNodalMassFields
    getFEMNodalMassFields(long id)
    {
        return getFEMNodalMassFields(id, null);
    }

    public final FEMNodalMassFields[]
    getFEMNodalMassFieldsList(long[] ids)
    {
        return getFEMNodalMassFieldsList(ids, null);
    }

    public final long[]
    getFEMNodalMassIds()
    {
        return getFEMNodalMassIds(null);
    }

    public final FEMNodalMassPrx[]
    getFEMNodalMassList(long[] ids)
    {
        return getFEMNodalMassList(ids, null);
    }

    public final FEMNodePrx
    getFEMNode(long id)
    {
        return getFEMNode(id, null);
    }

    public final FEMNodeFields
    getFEMNodeFields(long id)
    {
        return getFEMNodeFields(id, null);
    }

    public final FEMNodeFields[]
    getFEMNodeFieldsList(long[] ids)
    {
        return getFEMNodeFieldsList(ids, null);
    }

    public final long[]
    getFEMNodeIds()
    {
        return getFEMNodeIds(null);
    }

    public final FEMNodePrx[]
    getFEMNodeList(long[] ids)
    {
        return getFEMNodeList(ids, null);
    }

    public final FEMOrthotropicMaterialPrx
    getFEMOrthotropicMaterial(long id)
    {
        return getFEMOrthotropicMaterial(id, null);
    }

    public final FEMOrthotropicMaterialFields
    getFEMOrthotropicMaterialFields(long id)
    {
        return getFEMOrthotropicMaterialFields(id, null);
    }

    public final FEMOrthotropicMaterialFields[]
    getFEMOrthotropicMaterialFieldsList(long[] ids)
    {
        return getFEMOrthotropicMaterialFieldsList(ids, null);
    }

    public final long[]
    getFEMOrthotropicMaterialIds()
    {
        return getFEMOrthotropicMaterialIds(null);
    }

    public final FEMOrthotropicMaterialPrx[]
    getFEMOrthotropicMaterialList(long[] ids)
    {
        return getFEMOrthotropicMaterialList(ids, null);
    }

    public final FEMPlasticBilinearMaterialPrx
    getFEMPlasticBilinearMaterial(long id)
    {
        return getFEMPlasticBilinearMaterial(id, null);
    }

    public final FEMPlasticBilinearMaterialFields
    getFEMPlasticBilinearMaterialFields(long id)
    {
        return getFEMPlasticBilinearMaterialFields(id, null);
    }

    public final FEMPlasticBilinearMaterialFields[]
    getFEMPlasticBilinearMaterialFieldsList(long[] ids)
    {
        return getFEMPlasticBilinearMaterialFieldsList(ids, null);
    }

    public final long[]
    getFEMPlasticBilinearMaterialIds()
    {
        return getFEMPlasticBilinearMaterialIds(null);
    }

    public final FEMPlasticBilinearMaterialPrx[]
    getFEMPlasticBilinearMaterialList(long[] ids)
    {
        return getFEMPlasticBilinearMaterialList(ids, null);
    }

    public final FEMPlasticMlMaterialsPrx
    getFEMPlasticMlMaterials(long id)
    {
        return getFEMPlasticMlMaterials(id, null);
    }

    public final FEMPlasticMlMaterialsFields
    getFEMPlasticMlMaterialsFields(long id)
    {
        return getFEMPlasticMlMaterialsFields(id, null);
    }

    public final FEMPlasticMlMaterialsFields[]
    getFEMPlasticMlMaterialsFieldsList(long[] ids)
    {
        return getFEMPlasticMlMaterialsFieldsList(ids, null);
    }

    public final long[]
    getFEMPlasticMlMaterialsIds()
    {
        return getFEMPlasticMlMaterialsIds(null);
    }

    public final FEMPlasticMlMaterialsPrx[]
    getFEMPlasticMlMaterialsList(long[] ids)
    {
        return getFEMPlasticMlMaterialsList(ids, null);
    }

    public final FEMPlasticStrainStressPrx
    getFEMPlasticStrainStress(long id)
    {
        return getFEMPlasticStrainStress(id, null);
    }

    public final FEMPlasticStrainStressFields
    getFEMPlasticStrainStressFields(long id)
    {
        return getFEMPlasticStrainStressFields(id, null);
    }

    public final FEMPlasticStrainStressFields[]
    getFEMPlasticStrainStressFieldsList(long[] ids)
    {
        return getFEMPlasticStrainStressFieldsList(ids, null);
    }

    public final long[]
    getFEMPlasticStrainStressIds()
    {
        return getFEMPlasticStrainStressIds(null);
    }

    public final FEMPlasticStrainStressPrx[]
    getFEMPlasticStrainStressList(long[] ids)
    {
        return getFEMPlasticStrainStressList(ids, null);
    }

    public final FEMPlatePrx
    getFEMPlate(long id)
    {
        return getFEMPlate(id, null);
    }

    public final FEMPlateFields
    getFEMPlateFields(long id)
    {
        return getFEMPlateFields(id, null);
    }

    public final FEMPlateFields[]
    getFEMPlateFieldsList(long[] ids)
    {
        return getFEMPlateFieldsList(ids, null);
    }

    public final FEMPlateGroupPrx
    getFEMPlateGroup(long id)
    {
        return getFEMPlateGroup(id, null);
    }

    public final FEMPlateGroupFields
    getFEMPlateGroupFields(long id)
    {
        return getFEMPlateGroupFields(id, null);
    }

    public final FEMPlateGroupFields[]
    getFEMPlateGroupFieldsList(long[] ids)
    {
        return getFEMPlateGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMPlateGroupIds()
    {
        return getFEMPlateGroupIds(null);
    }

    public final FEMPlateGroupPrx[]
    getFEMPlateGroupList(long[] ids)
    {
        return getFEMPlateGroupList(ids, null);
    }

    public final long[]
    getFEMPlateIds()
    {
        return getFEMPlateIds(null);
    }

    public final FEMPlatePrx[]
    getFEMPlateList(long[] ids)
    {
        return getFEMPlateList(ids, null);
    }

    public final FEMPointsPrx
    getFEMPoints(long id)
    {
        return getFEMPoints(id, null);
    }

    public final FEMPointsFields
    getFEMPointsFields(long id)
    {
        return getFEMPointsFields(id, null);
    }

    public final FEMPointsFields[]
    getFEMPointsFieldsList(long[] ids)
    {
        return getFEMPointsFieldsList(ids, null);
    }

    public final long[]
    getFEMPointsIds()
    {
        return getFEMPointsIds(null);
    }

    public final FEMPointsPrx[]
    getFEMPointsList(long[] ids)
    {
        return getFEMPointsList(ids, null);
    }

    public final FEMPropertiesPrx
    getFEMProperties(long id)
    {
        return getFEMProperties(id, null);
    }

    public final FEMPropertiesFields
    getFEMPropertiesFields(long id)
    {
        return getFEMPropertiesFields(id, null);
    }

    public final FEMPropertiesFields[]
    getFEMPropertiesFieldsList(long[] ids)
    {
        return getFEMPropertiesFieldsList(ids, null);
    }

    public final long[]
    getFEMPropertiesIds()
    {
        return getFEMPropertiesIds(null);
    }

    public final FEMPropertiesPrx[]
    getFEMPropertiesList(long[] ids)
    {
        return getFEMPropertiesList(ids, null);
    }

    public final FEMPropertysetsPrx
    getFEMPropertysets(long id)
    {
        return getFEMPropertysets(id, null);
    }

    public final FEMPropertysetsFields
    getFEMPropertysetsFields(long id)
    {
        return getFEMPropertysetsFields(id, null);
    }

    public final FEMPropertysetsFields[]
    getFEMPropertysetsFieldsList(long[] ids)
    {
        return getFEMPropertysetsFieldsList(ids, null);
    }

    public final long[]
    getFEMPropertysetsIds()
    {
        return getFEMPropertysetsIds(null);
    }

    public final FEMPropertysetsPrx[]
    getFEMPropertysetsList(long[] ids)
    {
        return getFEMPropertysetsList(ids, null);
    }

    public final FEMSectionBoxPrx
    getFEMSectionBox(long id)
    {
        return getFEMSectionBox(id, null);
    }

    public final FEMSectionBoxFields
    getFEMSectionBoxFields(long id)
    {
        return getFEMSectionBoxFields(id, null);
    }

    public final FEMSectionBoxFields[]
    getFEMSectionBoxFieldsList(long[] ids)
    {
        return getFEMSectionBoxFieldsList(ids, null);
    }

    public final long[]
    getFEMSectionBoxIds()
    {
        return getFEMSectionBoxIds(null);
    }

    public final FEMSectionBoxPrx[]
    getFEMSectionBoxList(long[] ids)
    {
        return getFEMSectionBoxList(ids, null);
    }

    public final FEMSectionIPrx
    getFEMSectionI(long id)
    {
        return getFEMSectionI(id, null);
    }

    public final FEMSectionIFields
    getFEMSectionIFields(long id)
    {
        return getFEMSectionIFields(id, null);
    }

    public final FEMSectionIFields[]
    getFEMSectionIFieldsList(long[] ids)
    {
        return getFEMSectionIFieldsList(ids, null);
    }

    public final long[]
    getFEMSectionIIds()
    {
        return getFEMSectionIIds(null);
    }

    public final FEMSectionIPrx[]
    getFEMSectionIList(long[] ids)
    {
        return getFEMSectionIList(ids, null);
    }

    public final FEMSectionPipePrx
    getFEMSectionPipe(long id)
    {
        return getFEMSectionPipe(id, null);
    }

    public final FEMSectionPipeFields
    getFEMSectionPipeFields(long id)
    {
        return getFEMSectionPipeFields(id, null);
    }

    public final FEMSectionPipeFields[]
    getFEMSectionPipeFieldsList(long[] ids)
    {
        return getFEMSectionPipeFieldsList(ids, null);
    }

    public final long[]
    getFEMSectionPipeIds()
    {
        return getFEMSectionPipeIds(null);
    }

    public final FEMSectionPipePrx[]
    getFEMSectionPipeList(long[] ids)
    {
        return getFEMSectionPipeList(ids, null);
    }

    public final FEMSectionPropPrx
    getFEMSectionProp(long id)
    {
        return getFEMSectionProp(id, null);
    }

    public final FEMSectionPropFields
    getFEMSectionPropFields(long id)
    {
        return getFEMSectionPropFields(id, null);
    }

    public final FEMSectionPropFields[]
    getFEMSectionPropFieldsList(long[] ids)
    {
        return getFEMSectionPropFieldsList(ids, null);
    }

    public final long[]
    getFEMSectionPropIds()
    {
        return getFEMSectionPropIds(null);
    }

    public final FEMSectionPropPrx[]
    getFEMSectionPropList(long[] ids)
    {
        return getFEMSectionPropList(ids, null);
    }

    public final FEMSectionRectPrx
    getFEMSectionRect(long id)
    {
        return getFEMSectionRect(id, null);
    }

    public final FEMSectionRectFields
    getFEMSectionRectFields(long id)
    {
        return getFEMSectionRectFields(id, null);
    }

    public final FEMSectionRectFields[]
    getFEMSectionRectFieldsList(long[] ids)
    {
        return getFEMSectionRectFieldsList(ids, null);
    }

    public final long[]
    getFEMSectionRectIds()
    {
        return getFEMSectionRectIds(null);
    }

    public final FEMSectionRectPrx[]
    getFEMSectionRectList(long[] ids)
    {
        return getFEMSectionRectList(ids, null);
    }

    public final FEMShellPrx
    getFEMShell(long id)
    {
        return getFEMShell(id, null);
    }

    public final FEMShellAxesOrthoPrx
    getFEMShellAxesOrtho(long id)
    {
        return getFEMShellAxesOrtho(id, null);
    }

    public final FEMShellAxesOrthoDataPrx
    getFEMShellAxesOrthoData(long id)
    {
        return getFEMShellAxesOrthoData(id, null);
    }

    public final FEMShellAxesOrthoDataFields
    getFEMShellAxesOrthoDataFields(long id)
    {
        return getFEMShellAxesOrthoDataFields(id, null);
    }

    public final FEMShellAxesOrthoDataFields[]
    getFEMShellAxesOrthoDataFieldsList(long[] ids)
    {
        return getFEMShellAxesOrthoDataFieldsList(ids, null);
    }

    public final long[]
    getFEMShellAxesOrthoDataIds()
    {
        return getFEMShellAxesOrthoDataIds(null);
    }

    public final FEMShellAxesOrthoDataPrx[]
    getFEMShellAxesOrthoDataList(long[] ids)
    {
        return getFEMShellAxesOrthoDataList(ids, null);
    }

    public final FEMShellAxesOrthoFields
    getFEMShellAxesOrthoFields(long id)
    {
        return getFEMShellAxesOrthoFields(id, null);
    }

    public final FEMShellAxesOrthoFields[]
    getFEMShellAxesOrthoFieldsList(long[] ids)
    {
        return getFEMShellAxesOrthoFieldsList(ids, null);
    }

    public final long[]
    getFEMShellAxesOrthoIds()
    {
        return getFEMShellAxesOrthoIds(null);
    }

    public final FEMShellAxesOrthoPrx[]
    getFEMShellAxesOrthoList(long[] ids)
    {
        return getFEMShellAxesOrthoList(ids, null);
    }

    public final FEMShellDOFPrx
    getFEMShellDOF(long id)
    {
        return getFEMShellDOF(id, null);
    }

    public final FEMShellDOFFields
    getFEMShellDOFFields(long id)
    {
        return getFEMShellDOFFields(id, null);
    }

    public final FEMShellDOFFields[]
    getFEMShellDOFFieldsList(long[] ids)
    {
        return getFEMShellDOFFieldsList(ids, null);
    }

    public final long[]
    getFEMShellDOFIds()
    {
        return getFEMShellDOFIds(null);
    }

    public final FEMShellDOFPrx[]
    getFEMShellDOFList(long[] ids)
    {
        return getFEMShellDOFList(ids, null);
    }

    public final FEMShellFields
    getFEMShellFields(long id)
    {
        return getFEMShellFields(id, null);
    }

    public final FEMShellFields[]
    getFEMShellFieldsList(long[] ids)
    {
        return getFEMShellFieldsList(ids, null);
    }

    public final FEMShellGroupPrx
    getFEMShellGroup(long id)
    {
        return getFEMShellGroup(id, null);
    }

    public final FEMShellGroupFields
    getFEMShellGroupFields(long id)
    {
        return getFEMShellGroupFields(id, null);
    }

    public final FEMShellGroupFields[]
    getFEMShellGroupFieldsList(long[] ids)
    {
        return getFEMShellGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMShellGroupIds()
    {
        return getFEMShellGroupIds(null);
    }

    public final FEMShellGroupPrx[]
    getFEMShellGroupList(long[] ids)
    {
        return getFEMShellGroupList(ids, null);
    }

    public final long[]
    getFEMShellIds()
    {
        return getFEMShellIds(null);
    }

    public final FEMShellLayerPrx
    getFEMShellLayer(long id)
    {
        return getFEMShellLayer(id, null);
    }

    public final FEMShellLayerFields
    getFEMShellLayerFields(long id)
    {
        return getFEMShellLayerFields(id, null);
    }

    public final FEMShellLayerFields[]
    getFEMShellLayerFieldsList(long[] ids)
    {
        return getFEMShellLayerFieldsList(ids, null);
    }

    public final long[]
    getFEMShellLayerIds()
    {
        return getFEMShellLayerIds(null);
    }

    public final FEMShellLayerPrx[]
    getFEMShellLayerList(long[] ids)
    {
        return getFEMShellLayerList(ids, null);
    }

    public final FEMShellPrx[]
    getFEMShellList(long[] ids)
    {
        return getFEMShellList(ids, null);
    }

    public final FEMShellPressurePrx
    getFEMShellPressure(long id)
    {
        return getFEMShellPressure(id, null);
    }

    public final FEMShellPressureFields
    getFEMShellPressureFields(long id)
    {
        return getFEMShellPressureFields(id, null);
    }

    public final FEMShellPressureFields[]
    getFEMShellPressureFieldsList(long[] ids)
    {
        return getFEMShellPressureFieldsList(ids, null);
    }

    public final long[]
    getFEMShellPressureIds()
    {
        return getFEMShellPressureIds(null);
    }

    public final FEMShellPressurePrx[]
    getFEMShellPressureList(long[] ids)
    {
        return getFEMShellPressureList(ids, null);
    }

    public final FEMSkewDOFPrx
    getFEMSkewDOF(long id)
    {
        return getFEMSkewDOF(id, null);
    }

    public final FEMSkewDOFFields
    getFEMSkewDOFFields(long id)
    {
        return getFEMSkewDOFFields(id, null);
    }

    public final FEMSkewDOFFields[]
    getFEMSkewDOFFieldsList(long[] ids)
    {
        return getFEMSkewDOFFieldsList(ids, null);
    }

    public final long[]
    getFEMSkewDOFIds()
    {
        return getFEMSkewDOFIds(null);
    }

    public final FEMSkewDOFPrx[]
    getFEMSkewDOFList(long[] ids)
    {
        return getFEMSkewDOFList(ids, null);
    }

    public final FEMSkewSysAnglesPrx
    getFEMSkewSysAngles(long id)
    {
        return getFEMSkewSysAngles(id, null);
    }

    public final FEMSkewSysAnglesFields
    getFEMSkewSysAnglesFields(long id)
    {
        return getFEMSkewSysAnglesFields(id, null);
    }

    public final FEMSkewSysAnglesFields[]
    getFEMSkewSysAnglesFieldsList(long[] ids)
    {
        return getFEMSkewSysAnglesFieldsList(ids, null);
    }

    public final long[]
    getFEMSkewSysAnglesIds()
    {
        return getFEMSkewSysAnglesIds(null);
    }

    public final FEMSkewSysAnglesPrx[]
    getFEMSkewSysAnglesList(long[] ids)
    {
        return getFEMSkewSysAnglesList(ids, null);
    }

    public final FEMSkeySysNodePrx
    getFEMSkeySysNode(long id)
    {
        return getFEMSkeySysNode(id, null);
    }

    public final FEMSkeySysNodeFields
    getFEMSkeySysNodeFields(long id)
    {
        return getFEMSkeySysNodeFields(id, null);
    }

    public final FEMSkeySysNodeFields[]
    getFEMSkeySysNodeFieldsList(long[] ids)
    {
        return getFEMSkeySysNodeFieldsList(ids, null);
    }

    public final long[]
    getFEMSkeySysNodeIds()
    {
        return getFEMSkeySysNodeIds(null);
    }

    public final FEMSkeySysNodePrx[]
    getFEMSkeySysNodeList(long[] ids)
    {
        return getFEMSkeySysNodeList(ids, null);
    }

    public final FEMSpringPrx
    getFEMSpring(long id)
    {
        return getFEMSpring(id, null);
    }

    public final FEMSpringFields
    getFEMSpringFields(long id)
    {
        return getFEMSpringFields(id, null);
    }

    public final FEMSpringFields[]
    getFEMSpringFieldsList(long[] ids)
    {
        return getFEMSpringFieldsList(ids, null);
    }

    public final FEMSpringGroupPrx
    getFEMSpringGroup(long id)
    {
        return getFEMSpringGroup(id, null);
    }

    public final FEMSpringGroupFields
    getFEMSpringGroupFields(long id)
    {
        return getFEMSpringGroupFields(id, null);
    }

    public final FEMSpringGroupFields[]
    getFEMSpringGroupFieldsList(long[] ids)
    {
        return getFEMSpringGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMSpringGroupIds()
    {
        return getFEMSpringGroupIds(null);
    }

    public final FEMSpringGroupPrx[]
    getFEMSpringGroupList(long[] ids)
    {
        return getFEMSpringGroupList(ids, null);
    }

    public final long[]
    getFEMSpringIds()
    {
        return getFEMSpringIds(null);
    }

    public final FEMSpringPrx[]
    getFEMSpringList(long[] ids)
    {
        return getFEMSpringList(ids, null);
    }

    public final FEMStrLinesPrx
    getFEMStrLines(long id)
    {
        return getFEMStrLines(id, null);
    }

    public final FEMStrLinesFields
    getFEMStrLinesFields(long id)
    {
        return getFEMStrLinesFields(id, null);
    }

    public final FEMStrLinesFields[]
    getFEMStrLinesFieldsList(long[] ids)
    {
        return getFEMStrLinesFieldsList(ids, null);
    }

    public final long[]
    getFEMStrLinesIds()
    {
        return getFEMStrLinesIds(null);
    }

    public final FEMStrLinesPrx[]
    getFEMStrLinesList(long[] ids)
    {
        return getFEMStrLinesList(ids, null);
    }

    public final FEMThermoIsoDataPrx
    getFEMThermoIsoData(long id)
    {
        return getFEMThermoIsoData(id, null);
    }

    public final FEMThermoIsoDataFields
    getFEMThermoIsoDataFields(long id)
    {
        return getFEMThermoIsoDataFields(id, null);
    }

    public final FEMThermoIsoDataFields[]
    getFEMThermoIsoDataFieldsList(long[] ids)
    {
        return getFEMThermoIsoDataFieldsList(ids, null);
    }

    public final long[]
    getFEMThermoIsoDataIds()
    {
        return getFEMThermoIsoDataIds(null);
    }

    public final FEMThermoIsoDataPrx[]
    getFEMThermoIsoDataList(long[] ids)
    {
        return getFEMThermoIsoDataList(ids, null);
    }

    public final FEMThermoIsoMaterialsPrx
    getFEMThermoIsoMaterials(long id)
    {
        return getFEMThermoIsoMaterials(id, null);
    }

    public final FEMThermoIsoMaterialsFields
    getFEMThermoIsoMaterialsFields(long id)
    {
        return getFEMThermoIsoMaterialsFields(id, null);
    }

    public final FEMThermoIsoMaterialsFields[]
    getFEMThermoIsoMaterialsFieldsList(long[] ids)
    {
        return getFEMThermoIsoMaterialsFieldsList(ids, null);
    }

    public final long[]
    getFEMThermoIsoMaterialsIds()
    {
        return getFEMThermoIsoMaterialsIds(null);
    }

    public final FEMThermoIsoMaterialsPrx[]
    getFEMThermoIsoMaterialsList(long[] ids)
    {
        return getFEMThermoIsoMaterialsList(ids, null);
    }

    public final FEMThermoOrthDataPrx
    getFEMThermoOrthData(long id)
    {
        return getFEMThermoOrthData(id, null);
    }

    public final FEMThermoOrthDataFields
    getFEMThermoOrthDataFields(long id)
    {
        return getFEMThermoOrthDataFields(id, null);
    }

    public final FEMThermoOrthDataFields[]
    getFEMThermoOrthDataFieldsList(long[] ids)
    {
        return getFEMThermoOrthDataFieldsList(ids, null);
    }

    public final long[]
    getFEMThermoOrthDataIds()
    {
        return getFEMThermoOrthDataIds(null);
    }

    public final FEMThermoOrthDataPrx[]
    getFEMThermoOrthDataList(long[] ids)
    {
        return getFEMThermoOrthDataList(ids, null);
    }

    public final FEMThermoOrthMaterialsPrx
    getFEMThermoOrthMaterials(long id)
    {
        return getFEMThermoOrthMaterials(id, null);
    }

    public final FEMThermoOrthMaterialsFields
    getFEMThermoOrthMaterialsFields(long id)
    {
        return getFEMThermoOrthMaterialsFields(id, null);
    }

    public final FEMThermoOrthMaterialsFields[]
    getFEMThermoOrthMaterialsFieldsList(long[] ids)
    {
        return getFEMThermoOrthMaterialsFieldsList(ids, null);
    }

    public final long[]
    getFEMThermoOrthMaterialsIds()
    {
        return getFEMThermoOrthMaterialsIds(null);
    }

    public final FEMThermoOrthMaterialsPrx[]
    getFEMThermoOrthMaterialsList(long[] ids)
    {
        return getFEMThermoOrthMaterialsList(ids, null);
    }

    public final FEMThreeDSolidPrx
    getFEMThreeDSolid(long id)
    {
        return getFEMThreeDSolid(id, null);
    }

    public final FEMThreeDSolidFields
    getFEMThreeDSolidFields(long id)
    {
        return getFEMThreeDSolidFields(id, null);
    }

    public final FEMThreeDSolidFields[]
    getFEMThreeDSolidFieldsList(long[] ids)
    {
        return getFEMThreeDSolidFieldsList(ids, null);
    }

    public final FEMThreeDSolidGroupPrx
    getFEMThreeDSolidGroup(long id)
    {
        return getFEMThreeDSolidGroup(id, null);
    }

    public final FEMThreeDSolidGroupFields
    getFEMThreeDSolidGroupFields(long id)
    {
        return getFEMThreeDSolidGroupFields(id, null);
    }

    public final FEMThreeDSolidGroupFields[]
    getFEMThreeDSolidGroupFieldsList(long[] ids)
    {
        return getFEMThreeDSolidGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMThreeDSolidGroupIds()
    {
        return getFEMThreeDSolidGroupIds(null);
    }

    public final FEMThreeDSolidGroupPrx[]
    getFEMThreeDSolidGroupList(long[] ids)
    {
        return getFEMThreeDSolidGroupList(ids, null);
    }

    public final long[]
    getFEMThreeDSolidIds()
    {
        return getFEMThreeDSolidIds(null);
    }

    public final FEMThreeDSolidPrx[]
    getFEMThreeDSolidList(long[] ids)
    {
        return getFEMThreeDSolidList(ids, null);
    }

    public final FEMTimeFunctionDataPrx
    getFEMTimeFunctionData(long id)
    {
        return getFEMTimeFunctionData(id, null);
    }

    public final FEMTimeFunctionDataFields
    getFEMTimeFunctionDataFields(long id)
    {
        return getFEMTimeFunctionDataFields(id, null);
    }

    public final FEMTimeFunctionDataFields[]
    getFEMTimeFunctionDataFieldsList(long[] ids)
    {
        return getFEMTimeFunctionDataFieldsList(ids, null);
    }

    public final long[]
    getFEMTimeFunctionDataIds()
    {
        return getFEMTimeFunctionDataIds(null);
    }

    public final FEMTimeFunctionDataPrx[]
    getFEMTimeFunctionDataList(long[] ids)
    {
        return getFEMTimeFunctionDataList(ids, null);
    }

    public final FEMTimeFunctionsPrx
    getFEMTimeFunctions(long id)
    {
        return getFEMTimeFunctions(id, null);
    }

    public final FEMTimeFunctionsFields
    getFEMTimeFunctionsFields(long id)
    {
        return getFEMTimeFunctionsFields(id, null);
    }

    public final FEMTimeFunctionsFields[]
    getFEMTimeFunctionsFieldsList(long[] ids)
    {
        return getFEMTimeFunctionsFieldsList(ids, null);
    }

    public final long[]
    getFEMTimeFunctionsIds()
    {
        return getFEMTimeFunctionsIds(null);
    }

    public final FEMTimeFunctionsPrx[]
    getFEMTimeFunctionsList(long[] ids)
    {
        return getFEMTimeFunctionsList(ids, null);
    }

    public final FEMTrussPrx
    getFEMTruss(long id)
    {
        return getFEMTruss(id, null);
    }

    public final FEMTrussFields
    getFEMTrussFields(long id)
    {
        return getFEMTrussFields(id, null);
    }

    public final FEMTrussFields[]
    getFEMTrussFieldsList(long[] ids)
    {
        return getFEMTrussFieldsList(ids, null);
    }

    public final FEMTrussGroupPrx
    getFEMTrussGroup(long id)
    {
        return getFEMTrussGroup(id, null);
    }

    public final FEMTrussGroupFields
    getFEMTrussGroupFields(long id)
    {
        return getFEMTrussGroupFields(id, null);
    }

    public final FEMTrussGroupFields[]
    getFEMTrussGroupFieldsList(long[] ids)
    {
        return getFEMTrussGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMTrussGroupIds()
    {
        return getFEMTrussGroupIds(null);
    }

    public final FEMTrussGroupPrx[]
    getFEMTrussGroupList(long[] ids)
    {
        return getFEMTrussGroupList(ids, null);
    }

    public final long[]
    getFEMTrussIds()
    {
        return getFEMTrussIds(null);
    }

    public final FEMTrussPrx[]
    getFEMTrussList(long[] ids)
    {
        return getFEMTrussList(ids, null);
    }

    public final FEMTwistMomentDataPrx
    getFEMTwistMomentData(long id)
    {
        return getFEMTwistMomentData(id, null);
    }

    public final FEMTwistMomentDataFields
    getFEMTwistMomentDataFields(long id)
    {
        return getFEMTwistMomentDataFields(id, null);
    }

    public final FEMTwistMomentDataFields[]
    getFEMTwistMomentDataFieldsList(long[] ids)
    {
        return getFEMTwistMomentDataFieldsList(ids, null);
    }

    public final long[]
    getFEMTwistMomentDataIds()
    {
        return getFEMTwistMomentDataIds(null);
    }

    public final FEMTwistMomentDataPrx[]
    getFEMTwistMomentDataList(long[] ids)
    {
        return getFEMTwistMomentDataList(ids, null);
    }

    public final FEMTwoDSolidPrx
    getFEMTwoDSolid(long id)
    {
        return getFEMTwoDSolid(id, null);
    }

    public final FEMTwoDSolidFields
    getFEMTwoDSolidFields(long id)
    {
        return getFEMTwoDSolidFields(id, null);
    }

    public final FEMTwoDSolidFields[]
    getFEMTwoDSolidFieldsList(long[] ids)
    {
        return getFEMTwoDSolidFieldsList(ids, null);
    }

    public final FEMTwoDSolidGroupPrx
    getFEMTwoDSolidGroup(long id)
    {
        return getFEMTwoDSolidGroup(id, null);
    }

    public final FEMTwoDSolidGroupFields
    getFEMTwoDSolidGroupFields(long id)
    {
        return getFEMTwoDSolidGroupFields(id, null);
    }

    public final FEMTwoDSolidGroupFields[]
    getFEMTwoDSolidGroupFieldsList(long[] ids)
    {
        return getFEMTwoDSolidGroupFieldsList(ids, null);
    }

    public final long[]
    getFEMTwoDSolidGroupIds()
    {
        return getFEMTwoDSolidGroupIds(null);
    }

    public final FEMTwoDSolidGroupPrx[]
    getFEMTwoDSolidGroupList(long[] ids)
    {
        return getFEMTwoDSolidGroupList(ids, null);
    }

    public final long[]
    getFEMTwoDSolidIds()
    {
        return getFEMTwoDSolidIds(null);
    }

    public final FEMTwoDSolidPrx[]
    getFEMTwoDSolidList(long[] ids)
    {
        return getFEMTwoDSolidList(ids, null);
    }

    public final MappingMatrixPrx
    getMappingMatrix(long id)
    {
        return getMappingMatrix(id, null);
    }

    public final MappingMatrixFields
    getMappingMatrixFields(long id)
    {
        return getMappingMatrixFields(id, null);
    }

    public final MappingMatrixFields[]
    getMappingMatrixFieldsList(long[] ids)
    {
        return getMappingMatrixFieldsList(ids, null);
    }

    public final long[]
    getMappingMatrixIds()
    {
        return getMappingMatrixIds(null);
    }

    public final MappingMatrixPrx[]
    getMappingMatrixList(long[] ids)
    {
        return getMappingMatrixList(ids, null);
    }

    public final SensorPrx
    getSensor(long id)
    {
        return getSensor(id, null);
    }

    public final SensorFields
    getSensorFields(long id)
    {
        return getSensorFields(id, null);
    }

    public final SensorFields[]
    getSensorFieldsList(long[] ids)
    {
        return getSensorFieldsList(ids, null);
    }

    public final long[]
    getSensorIds()
    {
        return getSensorIds(null);
    }

    public final SensorPrx[]
    getSensorList(long[] ids)
    {
        return getSensorList(ids, null);
    }

    public final SensorTimeDataPrx
    getSensorTimeData(long id)
    {
        return getSensorTimeData(id, null);
    }

    public final SensorTimeDataFields
    getSensorTimeDataFields(long id)
    {
        return getSensorTimeDataFields(id, null);
    }

    public final SensorTimeDataFields[]
    getSensorTimeDataFieldsList(long[] ids)
    {
        return getSensorTimeDataFieldsList(ids, null);
    }

    public final long[]
    getSensorTimeDataIds()
    {
        return getSensorTimeDataIds(null);
    }

    public final SensorTimeDataPrx[]
    getSensorTimeDataList(long[] ids)
    {
        return getSensorTimeDataList(ids, null);
    }

    public final StructurePrx
    getStructure(long id)
    {
        return getStructure(id, null);
    }

    public final StructureFields
    getStructureFields(long id)
    {
        return getStructureFields(id, null);
    }

    public final StructureFields[]
    getStructureFieldsList(long[] ids)
    {
        return getStructureFieldsList(ids, null);
    }

    public final long[]
    getStructureIds()
    {
        return getStructureIds(null);
    }

    public final StructurePrx[]
    getStructureList(long[] ids)
    {
        return getStructureList(ids, null);
    }

    public final TransducerPrx
    getTransducer(long id)
    {
        return getTransducer(id, null);
    }

    public final TransducerCycleDataPrx
    getTransducerCycleData(long id)
    {
        return getTransducerCycleData(id, null);
    }

    public final TransducerCycleDataFields
    getTransducerCycleDataFields(long id)
    {
        return getTransducerCycleDataFields(id, null);
    }

    public final TransducerCycleDataFields[]
    getTransducerCycleDataFieldsList(long[] ids)
    {
        return getTransducerCycleDataFieldsList(ids, null);
    }

    public final long[]
    getTransducerCycleDataIds()
    {
        return getTransducerCycleDataIds(null);
    }

    public final TransducerCycleDataPrx[]
    getTransducerCycleDataList(long[] ids)
    {
        return getTransducerCycleDataList(ids, null);
    }

    public final TransducerFields
    getTransducerFields(long id)
    {
        return getTransducerFields(id, null);
    }

    public final TransducerFields[]
    getTransducerFieldsList(long[] ids)
    {
        return getTransducerFieldsList(ids, null);
    }

    public final long[]
    getTransducerIds()
    {
        return getTransducerIds(null);
    }

    public final TransducerPrx[]
    getTransducerList(long[] ids)
    {
        return getTransducerList(ids, null);
    }

    public final TransducerTimeDataPrx
    getTransducerTimeData(long id)
    {
        return getTransducerTimeData(id, null);
    }

    public final TransducerTimeDataFields
    getTransducerTimeDataFields(long id)
    {
        return getTransducerTimeDataFields(id, null);
    }

    public final TransducerTimeDataFields[]
    getTransducerTimeDataFieldsList(long[] ids)
    {
        return getTransducerTimeDataFieldsList(ids, null);
    }

    public final long[]
    getTransducerTimeDataIds()
    {
        return getTransducerTimeDataIds(null);
    }

    public final TransducerTimeDataPrx[]
    getTransducerTimeDataList(long[] ids)
    {
        return getTransducerTimeDataList(ids, null);
    }

    public final void
    setAccelMeasFields(AccelMeasFields fields, String[] fieldNames)
    {
        setAccelMeasFields(fields, fieldNames, null);
    }

    public final void
    setCycleFields(CycleFields fields, String[] fieldNames)
    {
        setCycleFields(fields, fieldNames, null);
    }

    public final void
    setDaqUnitChannelDataFields(DaqUnitChannelDataFields fields, String[] fieldNames)
    {
        setDaqUnitChannelDataFields(fields, fieldNames, null);
    }

    public final void
    setDaqUnitChannelFields(DaqUnitChannelFields fields, String[] fieldNames)
    {
        setDaqUnitChannelFields(fields, fieldNames, null);
    }

    public final void
    setDaqUnitFields(DaqUnitFields fields, String[] fieldNames)
    {
        setDaqUnitFields(fields, fieldNames, null);
    }

    public final void
    setExperimentFields(ExperimentFields fields, String[] fieldNames)
    {
        setExperimentFields(fields, fieldNames, null);
    }

    public final void
    setExperimentStructureDataFields(ExperimentStructureDataFields fields, String[] fieldNames)
    {
        setExperimentStructureDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMAppliedConcentratedLoadFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames)
    {
        setFEMAppliedConcentratedLoadFields(fields, fieldNames, null);
    }

    public final void
    setFEMAppliedDisplacementFields(FEMAppliedDisplacementFields fields, String[] fieldNames)
    {
        setFEMAppliedDisplacementFields(fields, fieldNames, null);
    }

    public final void
    setFEMAppliedLoadsFields(FEMAppliedLoadsFields fields, String[] fieldNames)
    {
        setFEMAppliedLoadsFields(fields, fieldNames, null);
    }

    public final void
    setFEMAppliedTemperatureFields(FEMAppliedTemperatureFields fields, String[] fieldNames)
    {
        setFEMAppliedTemperatureFields(fields, fieldNames, null);
    }

    public final void
    setFEMAxesNodeFields(FEMAxesNodeFields fields, String[] fieldNames)
    {
        setFEMAxesNodeFields(fields, fieldNames, null);
    }

    public final void
    setFEMBeamFields(FEMBeamFields fields, String[] fieldNames)
    {
        setFEMBeamFields(fields, fieldNames, null);
    }

    public final void
    setFEMBeamLoadFields(FEMBeamLoadFields fields, String[] fieldNames)
    {
        setFEMBeamLoadFields(fields, fieldNames, null);
    }

    public final void
    setFEMBeamNodeFields(FEMBeamNodeFields fields, String[] fieldNames)
    {
        setFEMBeamNodeFields(fields, fieldNames, null);
    }

    public final void
    setFEMBoundaryFields(FEMBoundaryFields fields, String[] fieldNames)
    {
        setFEMBoundaryFields(fields, fieldNames, null);
    }

    public final void
    setFEMConstraintCoefFields(FEMConstraintCoefFields fields, String[] fieldNames)
    {
        setFEMConstraintCoefFields(fields, fieldNames, null);
    }

    public final void
    setFEMConstraintsFields(FEMConstraintsFields fields, String[] fieldNames)
    {
        setFEMConstraintsFields(fields, fieldNames, null);
    }

    public final void
    setFEMContactGroup3Fields(FEMContactGroup3Fields fields, String[] fieldNames)
    {
        setFEMContactGroup3Fields(fields, fieldNames, null);
    }

    public final void
    setFEMContactPairsFields(FEMContactPairsFields fields, String[] fieldNames)
    {
        setFEMContactPairsFields(fields, fieldNames, null);
    }

    public final void
    setFEMContactSurfaceFields(FEMContactSurfaceFields fields, String[] fieldNames)
    {
        setFEMContactSurfaceFields(fields, fieldNames, null);
    }

    public final void
    setFEMCoordSystemFields(FEMCoordSystemFields fields, String[] fieldNames)
    {
        setFEMCoordSystemFields(fields, fieldNames, null);
    }

    public final void
    setFEMCrossSectionsFields(FEMCrossSectionsFields fields, String[] fieldNames)
    {
        setFEMCrossSectionsFields(fields, fieldNames, null);
    }

    public final void
    setFEMCurvMomentDataFields(FEMCurvMomentDataFields fields, String[] fieldNames)
    {
        setFEMCurvMomentDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMDampingFields(FEMDampingFields fields, String[] fieldNames)
    {
        setFEMDampingFields(fields, fieldNames, null);
    }

    public final void
    setFEMDofFields(FEMDofFields fields, String[] fieldNames)
    {
        setFEMDofFields(fields, fieldNames, null);
    }

    public final void
    setFEMElasticMaterialFields(FEMElasticMaterialFields fields, String[] fieldNames)
    {
        setFEMElasticMaterialFields(fields, fieldNames, null);
    }

    public final void
    setFEMEndreleasesFields(FEMEndreleasesFields fields, String[] fieldNames)
    {
        setFEMEndreleasesFields(fields, fieldNames, null);
    }

    public final void
    setFEMForceStrainDataFields(FEMForceStrainDataFields fields, String[] fieldNames)
    {
        setFEMForceStrainDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMGeneralFields(FEMGeneralFields fields, String[] fieldNames)
    {
        setFEMGeneralFields(fields, fieldNames, null);
    }

    public final void
    setFEMGeneralGroupFields(FEMGeneralGroupFields fields, String[] fieldNames)
    {
        setFEMGeneralGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMGeneralNodeFields(FEMGeneralNodeFields fields, String[] fieldNames)
    {
        setFEMGeneralNodeFields(fields, fieldNames, null);
    }

    public final void
    setFEMGroundMotionRecordFields(FEMGroundMotionRecordFields fields, String[] fieldNames)
    {
        setFEMGroundMotionRecordFields(fields, fieldNames, null);
    }

    public final void
    setFEMGroupFields(FEMGroupFields fields, String[] fieldNames)
    {
        setFEMGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMInitialTemperatureFields(FEMInitialTemperatureFields fields, String[] fieldNames)
    {
        setFEMInitialTemperatureFields(fields, fieldNames, null);
    }

    public final void
    setFEMIsoBeamFields(FEMIsoBeamFields fields, String[] fieldNames)
    {
        setFEMIsoBeamFields(fields, fieldNames, null);
    }

    public final void
    setFEMIsoBeamGroupFields(FEMIsoBeamGroupFields fields, String[] fieldNames)
    {
        setFEMIsoBeamGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMLinkFields(FEMLinkFields fields, String[] fieldNames)
    {
        setFEMLinkFields(fields, fieldNames, null);
    }

    public final void
    setFEMLoadMassProportionalFields(FEMLoadMassProportionalFields fields, String[] fieldNames)
    {
        setFEMLoadMassProportionalFields(fields, fieldNames, null);
    }

    public final void
    setFEMMCForceDataFields(FEMMCForceDataFields fields, String[] fieldNames)
    {
        setFEMMCForceDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMMCrigiditiesFields(FEMMCrigiditiesFields fields, String[] fieldNames)
    {
        setFEMMCrigiditiesFields(fields, fieldNames, null);
    }

    public final void
    setFEMMTForceDataFields(FEMMTForceDataFields fields, String[] fieldNames)
    {
        setFEMMTForceDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMMaterialFields(FEMMaterialFields fields, String[] fieldNames)
    {
        setFEMMaterialFields(fields, fieldNames, null);
    }

    public final void
    setFEMMatricesFields(FEMMatricesFields fields, String[] fieldNames)
    {
        setFEMMatricesFields(fields, fieldNames, null);
    }

    public final void
    setFEMMatrixDataFields(FEMMatrixDataFields fields, String[] fieldNames)
    {
        setFEMMatrixDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMMatrixSetsFields(FEMMatrixSetsFields fields, String[] fieldNames)
    {
        setFEMMatrixSetsFields(fields, fieldNames, null);
    }

    public final void
    setFEMNKDisplForceFields(FEMNKDisplForceFields fields, String[] fieldNames)
    {
        setFEMNKDisplForceFields(fields, fieldNames, null);
    }

    public final void
    setFEMNLElasticMaterialsFields(FEMNLElasticMaterialsFields fields, String[] fieldNames)
    {
        setFEMNLElasticMaterialsFields(fields, fieldNames, null);
    }

    public final void
    setFEMNLElasticStrainStressFields(FEMNLElasticStrainStressFields fields, String[] fieldNames)
    {
        setFEMNLElasticStrainStressFields(fields, fieldNames, null);
    }

    public final void
    setFEMNMTimeMassFields(FEMNMTimeMassFields fields, String[] fieldNames)
    {
        setFEMNMTimeMassFields(fields, fieldNames, null);
    }

    public final void
    setFEMNTNContactFields(FEMNTNContactFields fields, String[] fieldNames)
    {
        setFEMNTNContactFields(fields, fieldNames, null);
    }

    public final void
    setFEMNodalMassFields(FEMNodalMassFields fields, String[] fieldNames)
    {
        setFEMNodalMassFields(fields, fieldNames, null);
    }

    public final void
    setFEMNodeFields(FEMNodeFields fields, String[] fieldNames)
    {
        setFEMNodeFields(fields, fieldNames, null);
    }

    public final void
    setFEMOrthotropicMaterialFields(FEMOrthotropicMaterialFields fields, String[] fieldNames)
    {
        setFEMOrthotropicMaterialFields(fields, fieldNames, null);
    }

    public final void
    setFEMPlasticBilinearMaterialFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames)
    {
        setFEMPlasticBilinearMaterialFields(fields, fieldNames, null);
    }

    public final void
    setFEMPlasticMlMaterialsFields(FEMPlasticMlMaterialsFields fields, String[] fieldNames)
    {
        setFEMPlasticMlMaterialsFields(fields, fieldNames, null);
    }

    public final void
    setFEMPlasticStrainStressFields(FEMPlasticStrainStressFields fields, String[] fieldNames)
    {
        setFEMPlasticStrainStressFields(fields, fieldNames, null);
    }

    public final void
    setFEMPlateFields(FEMPlateFields fields, String[] fieldNames)
    {
        setFEMPlateFields(fields, fieldNames, null);
    }

    public final void
    setFEMPlateGroupFields(FEMPlateGroupFields fields, String[] fieldNames)
    {
        setFEMPlateGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMPointsFields(FEMPointsFields fields, String[] fieldNames)
    {
        setFEMPointsFields(fields, fieldNames, null);
    }

    public final void
    setFEMPropertiesFields(FEMPropertiesFields fields, String[] fieldNames)
    {
        setFEMPropertiesFields(fields, fieldNames, null);
    }

    public final void
    setFEMPropertysetsFields(FEMPropertysetsFields fields, String[] fieldNames)
    {
        setFEMPropertysetsFields(fields, fieldNames, null);
    }

    public final void
    setFEMSectionBoxFields(FEMSectionBoxFields fields, String[] fieldNames)
    {
        setFEMSectionBoxFields(fields, fieldNames, null);
    }

    public final void
    setFEMSectionIFields(FEMSectionIFields fields, String[] fieldNames)
    {
        setFEMSectionIFields(fields, fieldNames, null);
    }

    public final void
    setFEMSectionPipeFields(FEMSectionPipeFields fields, String[] fieldNames)
    {
        setFEMSectionPipeFields(fields, fieldNames, null);
    }

    public final void
    setFEMSectionPropFields(FEMSectionPropFields fields, String[] fieldNames)
    {
        setFEMSectionPropFields(fields, fieldNames, null);
    }

    public final void
    setFEMSectionRectFields(FEMSectionRectFields fields, String[] fieldNames)
    {
        setFEMSectionRectFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellAxesOrthoDataFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames)
    {
        setFEMShellAxesOrthoDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellAxesOrthoFields(FEMShellAxesOrthoFields fields, String[] fieldNames)
    {
        setFEMShellAxesOrthoFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellDOFFields(FEMShellDOFFields fields, String[] fieldNames)
    {
        setFEMShellDOFFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellFields(FEMShellFields fields, String[] fieldNames)
    {
        setFEMShellFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellGroupFields(FEMShellGroupFields fields, String[] fieldNames)
    {
        setFEMShellGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellLayerFields(FEMShellLayerFields fields, String[] fieldNames)
    {
        setFEMShellLayerFields(fields, fieldNames, null);
    }

    public final void
    setFEMShellPressureFields(FEMShellPressureFields fields, String[] fieldNames)
    {
        setFEMShellPressureFields(fields, fieldNames, null);
    }

    public final void
    setFEMSkewDOFFields(FEMSkewDOFFields fields, String[] fieldNames)
    {
        setFEMSkewDOFFields(fields, fieldNames, null);
    }

    public final void
    setFEMSkewSysAnglesFields(FEMSkewSysAnglesFields fields, String[] fieldNames)
    {
        setFEMSkewSysAnglesFields(fields, fieldNames, null);
    }

    public final void
    setFEMSkeySysNodeFields(FEMSkeySysNodeFields fields, String[] fieldNames)
    {
        setFEMSkeySysNodeFields(fields, fieldNames, null);
    }

    public final void
    setFEMSpringFields(FEMSpringFields fields, String[] fieldNames)
    {
        setFEMSpringFields(fields, fieldNames, null);
    }

    public final void
    setFEMSpringGroupFields(FEMSpringGroupFields fields, String[] fieldNames)
    {
        setFEMSpringGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMStrLinesFields(FEMStrLinesFields fields, String[] fieldNames)
    {
        setFEMStrLinesFields(fields, fieldNames, null);
    }

    public final void
    setFEMThermoIsoDataFields(FEMThermoIsoDataFields fields, String[] fieldNames)
    {
        setFEMThermoIsoDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMThermoIsoMaterialsFields(FEMThermoIsoMaterialsFields fields, String[] fieldNames)
    {
        setFEMThermoIsoMaterialsFields(fields, fieldNames, null);
    }

    public final void
    setFEMThermoOrthDataFields(FEMThermoOrthDataFields fields, String[] fieldNames)
    {
        setFEMThermoOrthDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMThermoOrthMaterialsFields(FEMThermoOrthMaterialsFields fields, String[] fieldNames)
    {
        setFEMThermoOrthMaterialsFields(fields, fieldNames, null);
    }

    public final void
    setFEMThreeDSolidFields(FEMThreeDSolidFields fields, String[] fieldNames)
    {
        setFEMThreeDSolidFields(fields, fieldNames, null);
    }

    public final void
    setFEMThreeDSolidGroupFields(FEMThreeDSolidGroupFields fields, String[] fieldNames)
    {
        setFEMThreeDSolidGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMTimeFunctionDataFields(FEMTimeFunctionDataFields fields, String[] fieldNames)
    {
        setFEMTimeFunctionDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMTimeFunctionsFields(FEMTimeFunctionsFields fields, String[] fieldNames)
    {
        setFEMTimeFunctionsFields(fields, fieldNames, null);
    }

    public final void
    setFEMTrussFields(FEMTrussFields fields, String[] fieldNames)
    {
        setFEMTrussFields(fields, fieldNames, null);
    }

    public final void
    setFEMTrussGroupFields(FEMTrussGroupFields fields, String[] fieldNames)
    {
        setFEMTrussGroupFields(fields, fieldNames, null);
    }

    public final void
    setFEMTwistMomentDataFields(FEMTwistMomentDataFields fields, String[] fieldNames)
    {
        setFEMTwistMomentDataFields(fields, fieldNames, null);
    }

    public final void
    setFEMTwoDSolidFields(FEMTwoDSolidFields fields, String[] fieldNames)
    {
        setFEMTwoDSolidFields(fields, fieldNames, null);
    }

    public final void
    setFEMTwoDSolidGroupFields(FEMTwoDSolidGroupFields fields, String[] fieldNames)
    {
        setFEMTwoDSolidGroupFields(fields, fieldNames, null);
    }

    public final void
    setMappingMatrixFields(MappingMatrixFields fields, String[] fieldNames)
    {
        setMappingMatrixFields(fields, fieldNames, null);
    }

    public final void
    setSensorFields(SensorFields fields, String[] fieldNames)
    {
        setSensorFields(fields, fieldNames, null);
    }

    public final void
    setSensorTimeDataFields(SensorTimeDataFields fields, String[] fieldNames)
    {
        setSensorTimeDataFields(fields, fieldNames, null);
    }

    public final void
    setStructureFields(StructureFields fields, String[] fieldNames)
    {
        setStructureFields(fields, fieldNames, null);
    }

    public final void
    setTransducerCycleDataFields(TransducerCycleDataFields fields, String[] fieldNames)
    {
        setTransducerCycleDataFields(fields, fieldNames, null);
    }

    public final void
    setTransducerFields(TransducerFields fields, String[] fieldNames)
    {
        setTransducerFields(fields, fieldNames, null);
    }

    public final void
    setTransducerTimeDataFields(TransducerTimeDataFields fields, String[] fieldNames)
    {
        setTransducerTimeDataFields(fields, fieldNames, null);
    }

    public static Ice.DispatchStatus
    ___addStructure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StructureFields fields;
        fields = new StructureFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addStructure(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addStructureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StructureFields[] fieldsList;
        fieldsList = StructureFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addStructureList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        StructurePrx __ret = __obj.getStructure(id, __current);
        StructurePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructureIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getStructureIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        StructurePrx[] __ret = __obj.getStructureList(ids, __current);
        StructureListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        StructureFields __ret = __obj.getStructureFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructureFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        StructureFields[] __ret = __obj.getStructureFieldsList(ids, __current);
        StructureFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualStructure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StructureFields fields;
        fields = new StructureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualStructure(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setStructureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StructureFields fields;
        fields = new StructureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setStructureFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMDof(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDofFields fields;
        fields = new FEMDofFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMDof(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMDofList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDofFields[] fieldsList;
        fieldsList = FEMDofFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMDofList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDof(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDofPrx __ret = __obj.getFEMDof(id, __current);
        FEMDofPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDofIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMDofIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDofList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDofPrx[] __ret = __obj.getFEMDofList(ids, __current);
        FEMDofListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDofFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDofFields __ret = __obj.getFEMDofFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDofFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDofFields[] __ret = __obj.getFEMDofFieldsList(ids, __current);
        FEMDofFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMDof(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDofFields fields;
        fields = new FEMDofFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMDof(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMDofFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDofFields fields;
        fields = new FEMDofFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMDofFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNodalMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodalMassFields fields;
        fields = new FEMNodalMassFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNodalMass(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNodalMassList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodalMassFields[] fieldsList;
        fieldsList = FEMNodalMassFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNodalMassList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodalMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodalMassPrx __ret = __obj.getFEMNodalMass(id, __current);
        FEMNodalMassPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodalMassIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNodalMassIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodalMassList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodalMassPrx[] __ret = __obj.getFEMNodalMassList(ids, __current);
        FEMNodalMassListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodalMassFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodalMassFields __ret = __obj.getFEMNodalMassFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodalMassFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodalMassFields[] __ret = __obj.getFEMNodalMassFieldsList(ids, __current);
        FEMNodalMassFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNodalMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodalMassFields fields;
        fields = new FEMNodalMassFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNodalMass(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNodalMassFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodalMassFields fields;
        fields = new FEMNodalMassFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNodalMassFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNLElasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticStrainStressFields fields;
        fields = new FEMNLElasticStrainStressFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNLElasticStrainStress(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNLElasticStrainStressList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticStrainStressFields[] fieldsList;
        fieldsList = FEMNLElasticStrainStressFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNLElasticStrainStressList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticStrainStressPrx __ret = __obj.getFEMNLElasticStrainStress(id, __current);
        FEMNLElasticStrainStressPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticStrainStressIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNLElasticStrainStressIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticStrainStressList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticStrainStressPrx[] __ret = __obj.getFEMNLElasticStrainStressList(ids, __current);
        FEMNLElasticStrainStressListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticStrainStressFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticStrainStressFields __ret = __obj.getFEMNLElasticStrainStressFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticStrainStressFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticStrainStressFields[] __ret = __obj.getFEMNLElasticStrainStressFieldsList(ids, __current);
        FEMNLElasticStrainStressFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNLElasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticStrainStressFields fields;
        fields = new FEMNLElasticStrainStressFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNLElasticStrainStress(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNLElasticStrainStressFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticStrainStressFields fields;
        fields = new FEMNLElasticStrainStressFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNLElasticStrainStressFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBoundary(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBoundaryFields fields;
        fields = new FEMBoundaryFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMBoundary(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBoundaryList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBoundaryFields[] fieldsList;
        fieldsList = FEMBoundaryFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMBoundaryList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBoundary(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBoundaryPrx __ret = __obj.getFEMBoundary(id, __current);
        FEMBoundaryPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBoundaryIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMBoundaryIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBoundaryList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBoundaryPrx[] __ret = __obj.getFEMBoundaryList(ids, __current);
        FEMBoundaryListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBoundaryFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBoundaryFields __ret = __obj.getFEMBoundaryFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBoundaryFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBoundaryFields[] __ret = __obj.getFEMBoundaryFieldsList(ids, __current);
        FEMBoundaryFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMBoundary(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBoundaryFields fields;
        fields = new FEMBoundaryFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMBoundary(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMBoundaryFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBoundaryFields fields;
        fields = new FEMBoundaryFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMBoundaryFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionPipe(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPipeFields fields;
        fields = new FEMSectionPipeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSectionPipe(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionPipeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPipeFields[] fieldsList;
        fieldsList = FEMSectionPipeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSectionPipeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPipe(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPipePrx __ret = __obj.getFEMSectionPipe(id, __current);
        FEMSectionPipePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPipeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSectionPipeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPipeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPipePrx[] __ret = __obj.getFEMSectionPipeList(ids, __current);
        FEMSectionPipeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPipeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPipeFields __ret = __obj.getFEMSectionPipeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPipeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPipeFields[] __ret = __obj.getFEMSectionPipeFieldsList(ids, __current);
        FEMSectionPipeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSectionPipe(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPipeFields fields;
        fields = new FEMSectionPipeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSectionPipe(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSectionPipeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPipeFields fields;
        fields = new FEMSectionPipeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSectionPipeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCoordSystem(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCoordSystemFields fields;
        fields = new FEMCoordSystemFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMCoordSystem(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCoordSystemList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCoordSystemFields[] fieldsList;
        fieldsList = FEMCoordSystemFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMCoordSystemList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCoordSystem(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCoordSystemPrx __ret = __obj.getFEMCoordSystem(id, __current);
        FEMCoordSystemPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCoordSystemIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMCoordSystemIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCoordSystemList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCoordSystemPrx[] __ret = __obj.getFEMCoordSystemList(ids, __current);
        FEMCoordSystemListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCoordSystemFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCoordSystemFields __ret = __obj.getFEMCoordSystemFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCoordSystemFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCoordSystemFields[] __ret = __obj.getFEMCoordSystemFieldsList(ids, __current);
        FEMCoordSystemFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMCoordSystem(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCoordSystemFields fields;
        fields = new FEMCoordSystemFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMCoordSystem(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMCoordSystemFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCoordSystemFields fields;
        fields = new FEMCoordSystemFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMCoordSystemFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodeFields fields;
        fields = new FEMNodeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNode(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodeFields[] fieldsList;
        fieldsList = FEMNodeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNodeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodePrx __ret = __obj.getFEMNode(id, __current);
        FEMNodePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNodeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodePrx[] __ret = __obj.getFEMNodeList(ids, __current);
        FEMNodeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodeFields __ret = __obj.getFEMNodeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNodeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNodeFields[] __ret = __obj.getFEMNodeFieldsList(ids, __current);
        FEMNodeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodeFields fields;
        fields = new FEMNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNode(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNodeFields fields;
        fields = new FEMNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNodeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTruss(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussFields fields;
        fields = new FEMTrussFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTruss(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTrussList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussFields[] fieldsList;
        fieldsList = FEMTrussFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTrussList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTruss(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussPrx __ret = __obj.getFEMTruss(id, __current);
        FEMTrussPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTrussIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussPrx[] __ret = __obj.getFEMTrussList(ids, __current);
        FEMTrussListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussFields __ret = __obj.getFEMTrussFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussFields[] __ret = __obj.getFEMTrussFieldsList(ids, __current);
        FEMTrussFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTruss(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussFields fields;
        fields = new FEMTrussFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTruss(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTrussFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussFields fields;
        fields = new FEMTrussFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTrussFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTimeFunctionData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionDataFields fields;
        fields = new FEMTimeFunctionDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTimeFunctionData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTimeFunctionDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionDataFields[] fieldsList;
        fieldsList = FEMTimeFunctionDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTimeFunctionDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionDataPrx __ret = __obj.getFEMTimeFunctionData(id, __current);
        FEMTimeFunctionDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTimeFunctionDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionDataPrx[] __ret = __obj.getFEMTimeFunctionDataList(ids, __current);
        FEMTimeFunctionDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionDataFields __ret = __obj.getFEMTimeFunctionDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionDataFields[] __ret = __obj.getFEMTimeFunctionDataFieldsList(ids, __current);
        FEMTimeFunctionDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTimeFunctionData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionDataFields fields;
        fields = new FEMTimeFunctionDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTimeFunctionData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTimeFunctionDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionDataFields fields;
        fields = new FEMTimeFunctionDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTimeFunctionDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticMlMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticMlMaterialsFields fields;
        fields = new FEMPlasticMlMaterialsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPlasticMlMaterials(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticMlMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticMlMaterialsFields[] fieldsList;
        fieldsList = FEMPlasticMlMaterialsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPlasticMlMaterialsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticMlMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticMlMaterialsPrx __ret = __obj.getFEMPlasticMlMaterials(id, __current);
        FEMPlasticMlMaterialsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticMlMaterialsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPlasticMlMaterialsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticMlMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticMlMaterialsPrx[] __ret = __obj.getFEMPlasticMlMaterialsList(ids, __current);
        FEMPlasticMlMaterialsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticMlMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticMlMaterialsFields __ret = __obj.getFEMPlasticMlMaterialsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticMlMaterialsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticMlMaterialsFields[] __ret = __obj.getFEMPlasticMlMaterialsFieldsList(ids, __current);
        FEMPlasticMlMaterialsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPlasticMlMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticMlMaterialsFields fields;
        fields = new FEMPlasticMlMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPlasticMlMaterials(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPlasticMlMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticMlMaterialsFields fields;
        fields = new FEMPlasticMlMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPlasticMlMaterialsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlateGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateGroupFields fields;
        fields = new FEMPlateGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPlateGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlateGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateGroupFields[] fieldsList;
        fieldsList = FEMPlateGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPlateGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateGroupPrx __ret = __obj.getFEMPlateGroup(id, __current);
        FEMPlateGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPlateGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateGroupPrx[] __ret = __obj.getFEMPlateGroupList(ids, __current);
        FEMPlateGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateGroupFields __ret = __obj.getFEMPlateGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateGroupFields[] __ret = __obj.getFEMPlateGroupFieldsList(ids, __current);
        FEMPlateGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPlateGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateGroupFields fields;
        fields = new FEMPlateGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPlateGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPlateGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateGroupFields fields;
        fields = new FEMPlateGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPlateGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamFields fields;
        fields = new FEMBeamFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMBeam(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeamList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamFields[] fieldsList;
        fieldsList = FEMBeamFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMBeamList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamPrx __ret = __obj.getFEMBeam(id, __current);
        FEMBeamPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMBeamIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamPrx[] __ret = __obj.getFEMBeamList(ids, __current);
        FEMBeamListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamFields __ret = __obj.getFEMBeamFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamFields[] __ret = __obj.getFEMBeamFieldsList(ids, __current);
        FEMBeamFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamFields fields;
        fields = new FEMBeamFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMBeam(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMBeamFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamFields fields;
        fields = new FEMBeamFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMBeamFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCurvMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCurvMomentDataFields fields;
        fields = new FEMCurvMomentDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMCurvMomentData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCurvMomentDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCurvMomentDataFields[] fieldsList;
        fieldsList = FEMCurvMomentDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMCurvMomentDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCurvMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCurvMomentDataPrx __ret = __obj.getFEMCurvMomentData(id, __current);
        FEMCurvMomentDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCurvMomentDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMCurvMomentDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCurvMomentDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCurvMomentDataPrx[] __ret = __obj.getFEMCurvMomentDataList(ids, __current);
        FEMCurvMomentDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCurvMomentDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCurvMomentDataFields __ret = __obj.getFEMCurvMomentDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCurvMomentDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCurvMomentDataFields[] __ret = __obj.getFEMCurvMomentDataFieldsList(ids, __current);
        FEMCurvMomentDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMCurvMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCurvMomentDataFields fields;
        fields = new FEMCurvMomentDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMCurvMomentData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMCurvMomentDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCurvMomentDataFields fields;
        fields = new FEMCurvMomentDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMCurvMomentDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPropertysets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertysetsFields fields;
        fields = new FEMPropertysetsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPropertysets(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPropertysetsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertysetsFields[] fieldsList;
        fieldsList = FEMPropertysetsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPropertysetsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertysets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertysetsPrx __ret = __obj.getFEMPropertysets(id, __current);
        FEMPropertysetsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertysetsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPropertysetsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertysetsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertysetsPrx[] __ret = __obj.getFEMPropertysetsList(ids, __current);
        FEMPropertysetsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertysetsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertysetsFields __ret = __obj.getFEMPropertysetsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertysetsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertysetsFields[] __ret = __obj.getFEMPropertysetsFieldsList(ids, __current);
        FEMPropertysetsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPropertysets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertysetsFields fields;
        fields = new FEMPropertysetsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPropertysets(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPropertysetsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertysetsFields fields;
        fields = new FEMPropertysetsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPropertysetsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMOrthotropicMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMOrthotropicMaterialFields fields;
        fields = new FEMOrthotropicMaterialFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMOrthotropicMaterial(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMOrthotropicMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMOrthotropicMaterialFields[] fieldsList;
        fieldsList = FEMOrthotropicMaterialFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMOrthotropicMaterialList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMOrthotropicMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMOrthotropicMaterialPrx __ret = __obj.getFEMOrthotropicMaterial(id, __current);
        FEMOrthotropicMaterialPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMOrthotropicMaterialIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMOrthotropicMaterialIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMOrthotropicMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMOrthotropicMaterialPrx[] __ret = __obj.getFEMOrthotropicMaterialList(ids, __current);
        FEMOrthotropicMaterialListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMOrthotropicMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMOrthotropicMaterialFields __ret = __obj.getFEMOrthotropicMaterialFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMOrthotropicMaterialFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMOrthotropicMaterialFields[] __ret = __obj.getFEMOrthotropicMaterialFieldsList(ids, __current);
        FEMOrthotropicMaterialFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMOrthotropicMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMOrthotropicMaterialFields fields;
        fields = new FEMOrthotropicMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMOrthotropicMaterial(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMOrthotropicMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMOrthotropicMaterialFields fields;
        fields = new FEMOrthotropicMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMOrthotropicMaterialFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedLoads(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedLoadsFields fields;
        fields = new FEMAppliedLoadsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMAppliedLoads(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedLoadsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedLoadsFields[] fieldsList;
        fieldsList = FEMAppliedLoadsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMAppliedLoadsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedLoads(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedLoadsPrx __ret = __obj.getFEMAppliedLoads(id, __current);
        FEMAppliedLoadsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedLoadsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMAppliedLoadsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedLoadsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedLoadsPrx[] __ret = __obj.getFEMAppliedLoadsList(ids, __current);
        FEMAppliedLoadsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedLoadsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedLoadsFields __ret = __obj.getFEMAppliedLoadsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedLoadsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedLoadsFields[] __ret = __obj.getFEMAppliedLoadsFieldsList(ids, __current);
        FEMAppliedLoadsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMAppliedLoads(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedLoadsFields fields;
        fields = new FEMAppliedLoadsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMAppliedLoads(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMAppliedLoadsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedLoadsFields fields;
        fields = new FEMAppliedLoadsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMAppliedLoadsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoOrthData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthDataFields fields;
        fields = new FEMThermoOrthDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThermoOrthData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoOrthDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthDataFields[] fieldsList;
        fieldsList = FEMThermoOrthDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThermoOrthDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthDataPrx __ret = __obj.getFEMThermoOrthData(id, __current);
        FEMThermoOrthDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThermoOrthDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthDataPrx[] __ret = __obj.getFEMThermoOrthDataList(ids, __current);
        FEMThermoOrthDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthDataFields __ret = __obj.getFEMThermoOrthDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthDataFields[] __ret = __obj.getFEMThermoOrthDataFieldsList(ids, __current);
        FEMThermoOrthDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThermoOrthData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthDataFields fields;
        fields = new FEMThermoOrthDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThermoOrthData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThermoOrthDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthDataFields fields;
        fields = new FEMThermoOrthDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThermoOrthDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactPairs(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactPairsFields fields;
        fields = new FEMContactPairsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMContactPairs(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactPairsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactPairsFields[] fieldsList;
        fieldsList = FEMContactPairsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMContactPairsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactPairs(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactPairsPrx __ret = __obj.getFEMContactPairs(id, __current);
        FEMContactPairsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactPairsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMContactPairsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactPairsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactPairsPrx[] __ret = __obj.getFEMContactPairsList(ids, __current);
        FEMContactPairsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactPairsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactPairsFields __ret = __obj.getFEMContactPairsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactPairsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactPairsFields[] __ret = __obj.getFEMContactPairsFieldsList(ids, __current);
        FEMContactPairsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMContactPairs(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactPairsFields fields;
        fields = new FEMContactPairsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMContactPairs(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMContactPairsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactPairsFields fields;
        fields = new FEMContactPairsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMContactPairsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneral(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralFields fields;
        fields = new FEMGeneralFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMGeneral(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneralList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralFields[] fieldsList;
        fieldsList = FEMGeneralFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMGeneralList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneral(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralPrx __ret = __obj.getFEMGeneral(id, __current);
        FEMGeneralPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMGeneralIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralPrx[] __ret = __obj.getFEMGeneralList(ids, __current);
        FEMGeneralListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralFields __ret = __obj.getFEMGeneralFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralFields[] __ret = __obj.getFEMGeneralFieldsList(ids, __current);
        FEMGeneralFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMGeneral(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralFields fields;
        fields = new FEMGeneralFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMGeneral(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMGeneralFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralFields fields;
        fields = new FEMGeneralFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMGeneralFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeamNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamNodeFields fields;
        fields = new FEMBeamNodeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMBeamNode(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeamNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamNodeFields[] fieldsList;
        fieldsList = FEMBeamNodeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMBeamNodeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamNodePrx __ret = __obj.getFEMBeamNode(id, __current);
        FEMBeamNodePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamNodeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMBeamNodeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamNodePrx[] __ret = __obj.getFEMBeamNodeList(ids, __current);
        FEMBeamNodeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamNodeFields __ret = __obj.getFEMBeamNodeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamNodeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamNodeFields[] __ret = __obj.getFEMBeamNodeFieldsList(ids, __current);
        FEMBeamNodeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMBeamNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamNodeFields fields;
        fields = new FEMBeamNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMBeamNode(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMBeamNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamNodeFields fields;
        fields = new FEMBeamNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMBeamNodeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionRect(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionRectFields fields;
        fields = new FEMSectionRectFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSectionRect(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionRectList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionRectFields[] fieldsList;
        fieldsList = FEMSectionRectFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSectionRectList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionRect(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionRectPrx __ret = __obj.getFEMSectionRect(id, __current);
        FEMSectionRectPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionRectIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSectionRectIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionRectList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionRectPrx[] __ret = __obj.getFEMSectionRectList(ids, __current);
        FEMSectionRectListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionRectFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionRectFields __ret = __obj.getFEMSectionRectFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionRectFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionRectFields[] __ret = __obj.getFEMSectionRectFieldsList(ids, __current);
        FEMSectionRectFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSectionRect(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionRectFields fields;
        fields = new FEMSectionRectFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSectionRect(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSectionRectFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionRectFields fields;
        fields = new FEMSectionRectFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSectionRectFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeamLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamLoadFields fields;
        fields = new FEMBeamLoadFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMBeamLoad(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMBeamLoadList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamLoadFields[] fieldsList;
        fieldsList = FEMBeamLoadFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMBeamLoadList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamLoadPrx __ret = __obj.getFEMBeamLoad(id, __current);
        FEMBeamLoadPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamLoadIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMBeamLoadIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamLoadList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamLoadPrx[] __ret = __obj.getFEMBeamLoadList(ids, __current);
        FEMBeamLoadListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamLoadFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamLoadFields __ret = __obj.getFEMBeamLoadFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMBeamLoadFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMBeamLoadFields[] __ret = __obj.getFEMBeamLoadFieldsList(ids, __current);
        FEMBeamLoadFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMBeamLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamLoadFields fields;
        fields = new FEMBeamLoadFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMBeamLoad(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMBeamLoadFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMBeamLoadFields fields;
        fields = new FEMBeamLoadFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMBeamLoadFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMLoadMassProportional(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLoadMassProportionalFields fields;
        fields = new FEMLoadMassProportionalFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMLoadMassProportional(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMLoadMassProportionalList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLoadMassProportionalFields[] fieldsList;
        fieldsList = FEMLoadMassProportionalFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMLoadMassProportionalList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLoadMassProportional(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLoadMassProportionalPrx __ret = __obj.getFEMLoadMassProportional(id, __current);
        FEMLoadMassProportionalPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLoadMassProportionalIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMLoadMassProportionalIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLoadMassProportionalList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLoadMassProportionalPrx[] __ret = __obj.getFEMLoadMassProportionalList(ids, __current);
        FEMLoadMassProportionalListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLoadMassProportionalFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLoadMassProportionalFields __ret = __obj.getFEMLoadMassProportionalFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLoadMassProportionalFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLoadMassProportionalFields[] __ret = __obj.getFEMLoadMassProportionalFieldsList(ids, __current);
        FEMLoadMassProportionalFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMLoadMassProportional(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLoadMassProportionalFields fields;
        fields = new FEMLoadMassProportionalFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMLoadMassProportional(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMLoadMassProportionalFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLoadMassProportionalFields fields;
        fields = new FEMLoadMassProportionalFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMLoadMassProportionalFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMLink(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLinkFields fields;
        fields = new FEMLinkFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMLink(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMLinkList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLinkFields[] fieldsList;
        fieldsList = FEMLinkFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMLinkList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLink(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLinkPrx __ret = __obj.getFEMLink(id, __current);
        FEMLinkPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLinkIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMLinkIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLinkList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLinkPrx[] __ret = __obj.getFEMLinkList(ids, __current);
        FEMLinkListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLinkFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLinkFields __ret = __obj.getFEMLinkFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMLinkFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMLinkFields[] __ret = __obj.getFEMLinkFieldsList(ids, __current);
        FEMLinkFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMLink(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLinkFields fields;
        fields = new FEMLinkFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMLink(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMLinkFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMLinkFields fields;
        fields = new FEMLinkFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMLinkFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAxesNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAxesNodeFields fields;
        fields = new FEMAxesNodeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMAxesNode(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAxesNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAxesNodeFields[] fieldsList;
        fieldsList = FEMAxesNodeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMAxesNodeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAxesNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAxesNodePrx __ret = __obj.getFEMAxesNode(id, __current);
        FEMAxesNodePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAxesNodeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMAxesNodeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAxesNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAxesNodePrx[] __ret = __obj.getFEMAxesNodeList(ids, __current);
        FEMAxesNodeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAxesNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAxesNodeFields __ret = __obj.getFEMAxesNodeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAxesNodeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAxesNodeFields[] __ret = __obj.getFEMAxesNodeFieldsList(ids, __current);
        FEMAxesNodeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMAxesNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAxesNodeFields fields;
        fields = new FEMAxesNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMAxesNode(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMAxesNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAxesNodeFields fields;
        fields = new FEMAxesNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMAxesNodeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNMTimeMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNMTimeMassFields fields;
        fields = new FEMNMTimeMassFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNMTimeMass(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNMTimeMassList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNMTimeMassFields[] fieldsList;
        fieldsList = FEMNMTimeMassFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNMTimeMassList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNMTimeMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNMTimeMassPrx __ret = __obj.getFEMNMTimeMass(id, __current);
        FEMNMTimeMassPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNMTimeMassIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNMTimeMassIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNMTimeMassList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNMTimeMassPrx[] __ret = __obj.getFEMNMTimeMassList(ids, __current);
        FEMNMTimeMassListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNMTimeMassFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNMTimeMassFields __ret = __obj.getFEMNMTimeMassFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNMTimeMassFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNMTimeMassFields[] __ret = __obj.getFEMNMTimeMassFieldsList(ids, __current);
        FEMNMTimeMassFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNMTimeMass(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNMTimeMassFields fields;
        fields = new FEMNMTimeMassFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNMTimeMass(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNMTimeMassFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNMTimeMassFields fields;
        fields = new FEMNMTimeMassFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNMTimeMassFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedDisplacement(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedDisplacementFields fields;
        fields = new FEMAppliedDisplacementFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMAppliedDisplacement(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedDisplacementList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedDisplacementFields[] fieldsList;
        fieldsList = FEMAppliedDisplacementFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMAppliedDisplacementList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedDisplacement(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedDisplacementPrx __ret = __obj.getFEMAppliedDisplacement(id, __current);
        FEMAppliedDisplacementPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedDisplacementIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMAppliedDisplacementIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedDisplacementList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedDisplacementPrx[] __ret = __obj.getFEMAppliedDisplacementList(ids, __current);
        FEMAppliedDisplacementListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedDisplacementFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedDisplacementFields __ret = __obj.getFEMAppliedDisplacementFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedDisplacementFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedDisplacementFields[] __ret = __obj.getFEMAppliedDisplacementFieldsList(ids, __current);
        FEMAppliedDisplacementFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMAppliedDisplacement(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedDisplacementFields fields;
        fields = new FEMAppliedDisplacementFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMAppliedDisplacement(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMAppliedDisplacementFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedDisplacementFields fields;
        fields = new FEMAppliedDisplacementFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMAppliedDisplacementFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTimeFunctions(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionsFields fields;
        fields = new FEMTimeFunctionsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTimeFunctions(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTimeFunctionsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionsFields[] fieldsList;
        fieldsList = FEMTimeFunctionsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTimeFunctionsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctions(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionsPrx __ret = __obj.getFEMTimeFunctions(id, __current);
        FEMTimeFunctionsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTimeFunctionsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionsPrx[] __ret = __obj.getFEMTimeFunctionsList(ids, __current);
        FEMTimeFunctionsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionsFields __ret = __obj.getFEMTimeFunctionsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTimeFunctionsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTimeFunctionsFields[] __ret = __obj.getFEMTimeFunctionsFieldsList(ids, __current);
        FEMTimeFunctionsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTimeFunctions(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionsFields fields;
        fields = new FEMTimeFunctionsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTimeFunctions(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTimeFunctionsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTimeFunctionsFields fields;
        fields = new FEMTimeFunctionsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTimeFunctionsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMForceStrainData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMForceStrainDataFields fields;
        fields = new FEMForceStrainDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMForceStrainData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMForceStrainDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMForceStrainDataFields[] fieldsList;
        fieldsList = FEMForceStrainDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMForceStrainDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMForceStrainData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMForceStrainDataPrx __ret = __obj.getFEMForceStrainData(id, __current);
        FEMForceStrainDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMForceStrainDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMForceStrainDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMForceStrainDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMForceStrainDataPrx[] __ret = __obj.getFEMForceStrainDataList(ids, __current);
        FEMForceStrainDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMForceStrainDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMForceStrainDataFields __ret = __obj.getFEMForceStrainDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMForceStrainDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMForceStrainDataFields[] __ret = __obj.getFEMForceStrainDataFieldsList(ids, __current);
        FEMForceStrainDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMForceStrainData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMForceStrainDataFields fields;
        fields = new FEMForceStrainDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMForceStrainData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMForceStrainDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMForceStrainDataFields fields;
        fields = new FEMForceStrainDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMForceStrainDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkewDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewDOFFields fields;
        fields = new FEMSkewDOFFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSkewDOF(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkewDOFList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewDOFFields[] fieldsList;
        fieldsList = FEMSkewDOFFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSkewDOFList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewDOFPrx __ret = __obj.getFEMSkewDOF(id, __current);
        FEMSkewDOFPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewDOFIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSkewDOFIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewDOFList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewDOFPrx[] __ret = __obj.getFEMSkewDOFList(ids, __current);
        FEMSkewDOFListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewDOFFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewDOFFields __ret = __obj.getFEMSkewDOFFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewDOFFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewDOFFields[] __ret = __obj.getFEMSkewDOFFieldsList(ids, __current);
        FEMSkewDOFFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSkewDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewDOFFields fields;
        fields = new FEMSkewDOFFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSkewDOF(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSkewDOFFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewDOFFields fields;
        fields = new FEMSkewDOFFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSkewDOFFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionI(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionIFields fields;
        fields = new FEMSectionIFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSectionI(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionIList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionIFields[] fieldsList;
        fieldsList = FEMSectionIFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSectionIList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionI(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionIPrx __ret = __obj.getFEMSectionI(id, __current);
        FEMSectionIPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionIIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSectionIIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionIList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionIPrx[] __ret = __obj.getFEMSectionIList(ids, __current);
        FEMSectionIListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionIFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionIFields __ret = __obj.getFEMSectionIFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionIFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionIFields[] __ret = __obj.getFEMSectionIFieldsList(ids, __current);
        FEMSectionIFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSectionI(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionIFields fields;
        fields = new FEMSectionIFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSectionI(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSectionIFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionIFields fields;
        fields = new FEMSectionIFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSectionIFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticBilinearMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticBilinearMaterialFields fields;
        fields = new FEMPlasticBilinearMaterialFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPlasticBilinearMaterial(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticBilinearMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticBilinearMaterialFields[] fieldsList;
        fieldsList = FEMPlasticBilinearMaterialFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPlasticBilinearMaterialList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticBilinearMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticBilinearMaterialPrx __ret = __obj.getFEMPlasticBilinearMaterial(id, __current);
        FEMPlasticBilinearMaterialPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticBilinearMaterialIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPlasticBilinearMaterialIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticBilinearMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticBilinearMaterialPrx[] __ret = __obj.getFEMPlasticBilinearMaterialList(ids, __current);
        FEMPlasticBilinearMaterialListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticBilinearMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticBilinearMaterialFields __ret = __obj.getFEMPlasticBilinearMaterialFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticBilinearMaterialFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticBilinearMaterialFields[] __ret = __obj.getFEMPlasticBilinearMaterialFieldsList(ids, __current);
        FEMPlasticBilinearMaterialFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPlasticBilinearMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticBilinearMaterialFields fields;
        fields = new FEMPlasticBilinearMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPlasticBilinearMaterial(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPlasticBilinearMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticBilinearMaterialFields fields;
        fields = new FEMPlasticBilinearMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPlasticBilinearMaterialFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMTForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMTForceDataFields fields;
        fields = new FEMMTForceDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMTForceData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMTForceDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMTForceDataFields[] fieldsList;
        fieldsList = FEMMTForceDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMTForceDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMTForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMTForceDataPrx __ret = __obj.getFEMMTForceData(id, __current);
        FEMMTForceDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMTForceDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMTForceDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMTForceDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMTForceDataPrx[] __ret = __obj.getFEMMTForceDataList(ids, __current);
        FEMMTForceDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMTForceDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMTForceDataFields __ret = __obj.getFEMMTForceDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMTForceDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMTForceDataFields[] __ret = __obj.getFEMMTForceDataFieldsList(ids, __current);
        FEMMTForceDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMTForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMTForceDataFields fields;
        fields = new FEMMTForceDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMTForceData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMTForceDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMTForceDataFields fields;
        fields = new FEMMTForceDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMTForceDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellPressure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellPressureFields fields;
        fields = new FEMShellPressureFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellPressure(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellPressureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellPressureFields[] fieldsList;
        fieldsList = FEMShellPressureFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellPressureList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellPressure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPressurePrx __ret = __obj.getFEMShellPressure(id, __current);
        FEMShellPressurePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellPressureIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellPressureIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellPressureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPressurePrx[] __ret = __obj.getFEMShellPressureList(ids, __current);
        FEMShellPressureListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellPressureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPressureFields __ret = __obj.getFEMShellPressureFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellPressureFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPressureFields[] __ret = __obj.getFEMShellPressureFieldsList(ids, __current);
        FEMShellPressureFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellPressure(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellPressureFields fields;
        fields = new FEMShellPressureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellPressure(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellPressureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellPressureFields fields;
        fields = new FEMShellPressureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellPressureFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatrices(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatricesFields fields;
        fields = new FEMMatricesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMatrices(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatricesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatricesFields[] fieldsList;
        fieldsList = FEMMatricesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMatricesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrices(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatricesPrx __ret = __obj.getFEMMatrices(id, __current);
        FEMMatricesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatricesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMatricesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatricesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatricesPrx[] __ret = __obj.getFEMMatricesList(ids, __current);
        FEMMatricesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatricesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatricesFields __ret = __obj.getFEMMatricesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatricesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatricesFields[] __ret = __obj.getFEMMatricesFieldsList(ids, __current);
        FEMMatricesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMatrices(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatricesFields fields;
        fields = new FEMMatricesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMatrices(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMatricesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatricesFields fields;
        fields = new FEMMatricesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMatricesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMDamping(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDampingFields fields;
        fields = new FEMDampingFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMDamping(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMDampingList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDampingFields[] fieldsList;
        fieldsList = FEMDampingFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMDampingList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDamping(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDampingPrx __ret = __obj.getFEMDamping(id, __current);
        FEMDampingPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDampingIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMDampingIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDampingList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDampingPrx[] __ret = __obj.getFEMDampingList(ids, __current);
        FEMDampingListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDampingFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDampingFields __ret = __obj.getFEMDampingFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMDampingFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMDampingFields[] __ret = __obj.getFEMDampingFieldsList(ids, __current);
        FEMDampingFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMDamping(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDampingFields fields;
        fields = new FEMDampingFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMDamping(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMDampingFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMDampingFields fields;
        fields = new FEMDampingFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMDampingFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMaterialFields fields;
        fields = new FEMMaterialFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMaterial(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMaterialFields[] fieldsList;
        fieldsList = FEMMaterialFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMaterialList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMaterialPrx __ret = __obj.getFEMMaterial(id, __current);
        FEMMaterialPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMaterialIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMaterialIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMaterialPrx[] __ret = __obj.getFEMMaterialList(ids, __current);
        FEMMaterialListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMaterialFields __ret = __obj.getFEMMaterialFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMaterialFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMaterialFields[] __ret = __obj.getFEMMaterialFieldsList(ids, __current);
        FEMMaterialFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMaterialFields fields;
        fields = new FEMMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMaterial(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMaterialFields fields;
        fields = new FEMMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMaterialFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatrixData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixDataFields fields;
        fields = new FEMMatrixDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMatrixData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatrixDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixDataFields[] fieldsList;
        fieldsList = FEMMatrixDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMatrixDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixDataPrx __ret = __obj.getFEMMatrixData(id, __current);
        FEMMatrixDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMatrixDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixDataPrx[] __ret = __obj.getFEMMatrixDataList(ids, __current);
        FEMMatrixDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixDataFields __ret = __obj.getFEMMatrixDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixDataFields[] __ret = __obj.getFEMMatrixDataFieldsList(ids, __current);
        FEMMatrixDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMatrixData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixDataFields fields;
        fields = new FEMMatrixDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMatrixData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMatrixDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixDataFields fields;
        fields = new FEMMatrixDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMatrixDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellAxesOrtho(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoFields fields;
        fields = new FEMShellAxesOrthoFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellAxesOrtho(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellAxesOrthoList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoFields[] fieldsList;
        fieldsList = FEMShellAxesOrthoFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellAxesOrthoList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrtho(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoPrx __ret = __obj.getFEMShellAxesOrtho(id, __current);
        FEMShellAxesOrthoPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellAxesOrthoIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoPrx[] __ret = __obj.getFEMShellAxesOrthoList(ids, __current);
        FEMShellAxesOrthoListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoFields __ret = __obj.getFEMShellAxesOrthoFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoFields[] __ret = __obj.getFEMShellAxesOrthoFieldsList(ids, __current);
        FEMShellAxesOrthoFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellAxesOrtho(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoFields fields;
        fields = new FEMShellAxesOrthoFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellAxesOrtho(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellAxesOrthoFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoFields fields;
        fields = new FEMShellAxesOrthoFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellAxesOrthoFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMEndreleases(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMEndreleasesFields fields;
        fields = new FEMEndreleasesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMEndreleases(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMEndreleasesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMEndreleasesFields[] fieldsList;
        fieldsList = FEMEndreleasesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMEndreleasesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMEndreleases(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMEndreleasesPrx __ret = __obj.getFEMEndreleases(id, __current);
        FEMEndreleasesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMEndreleasesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMEndreleasesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMEndreleasesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMEndreleasesPrx[] __ret = __obj.getFEMEndreleasesList(ids, __current);
        FEMEndreleasesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMEndreleasesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMEndreleasesFields __ret = __obj.getFEMEndreleasesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMEndreleasesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMEndreleasesFields[] __ret = __obj.getFEMEndreleasesFieldsList(ids, __current);
        FEMEndreleasesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMEndreleases(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMEndreleasesFields fields;
        fields = new FEMEndreleasesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMEndreleases(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMEndreleasesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMEndreleasesFields fields;
        fields = new FEMEndreleasesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMEndreleasesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTrussGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussGroupFields fields;
        fields = new FEMTrussGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTrussGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTrussGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussGroupFields[] fieldsList;
        fieldsList = FEMTrussGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTrussGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussGroupPrx __ret = __obj.getFEMTrussGroup(id, __current);
        FEMTrussGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTrussGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussGroupPrx[] __ret = __obj.getFEMTrussGroupList(ids, __current);
        FEMTrussGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussGroupFields __ret = __obj.getFEMTrussGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTrussGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTrussGroupFields[] __ret = __obj.getFEMTrussGroupFieldsList(ids, __current);
        FEMTrussGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTrussGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussGroupFields fields;
        fields = new FEMTrussGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTrussGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTrussGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTrussGroupFields fields;
        fields = new FEMTrussGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTrussGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMInitialTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMInitialTemperatureFields fields;
        fields = new FEMInitialTemperatureFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMInitialTemperature(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMInitialTemperatureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMInitialTemperatureFields[] fieldsList;
        fieldsList = FEMInitialTemperatureFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMInitialTemperatureList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMInitialTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMInitialTemperaturePrx __ret = __obj.getFEMInitialTemperature(id, __current);
        FEMInitialTemperaturePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMInitialTemperatureIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMInitialTemperatureIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMInitialTemperatureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMInitialTemperaturePrx[] __ret = __obj.getFEMInitialTemperatureList(ids, __current);
        FEMInitialTemperatureListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMInitialTemperatureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMInitialTemperatureFields __ret = __obj.getFEMInitialTemperatureFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMInitialTemperatureFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMInitialTemperatureFields[] __ret = __obj.getFEMInitialTemperatureFieldsList(ids, __current);
        FEMInitialTemperatureFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMInitialTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMInitialTemperatureFields fields;
        fields = new FEMInitialTemperatureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMInitialTemperature(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMInitialTemperatureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMInitialTemperatureFields fields;
        fields = new FEMInitialTemperatureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMInitialTemperatureFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoIsoMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoMaterialsFields fields;
        fields = new FEMThermoIsoMaterialsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThermoIsoMaterials(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoIsoMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoMaterialsFields[] fieldsList;
        fieldsList = FEMThermoIsoMaterialsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThermoIsoMaterialsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoMaterialsPrx __ret = __obj.getFEMThermoIsoMaterials(id, __current);
        FEMThermoIsoMaterialsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoMaterialsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThermoIsoMaterialsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoMaterialsPrx[] __ret = __obj.getFEMThermoIsoMaterialsList(ids, __current);
        FEMThermoIsoMaterialsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoMaterialsFields __ret = __obj.getFEMThermoIsoMaterialsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoMaterialsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoMaterialsFields[] __ret = __obj.getFEMThermoIsoMaterialsFieldsList(ids, __current);
        FEMThermoIsoMaterialsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThermoIsoMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoMaterialsFields fields;
        fields = new FEMThermoIsoMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThermoIsoMaterials(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThermoIsoMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoMaterialsFields fields;
        fields = new FEMThermoIsoMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThermoIsoMaterialsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoIsoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoDataFields fields;
        fields = new FEMThermoIsoDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThermoIsoData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoIsoDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoDataFields[] fieldsList;
        fieldsList = FEMThermoIsoDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThermoIsoDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoDataPrx __ret = __obj.getFEMThermoIsoData(id, __current);
        FEMThermoIsoDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThermoIsoDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoDataPrx[] __ret = __obj.getFEMThermoIsoDataList(ids, __current);
        FEMThermoIsoDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoDataFields __ret = __obj.getFEMThermoIsoDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoIsoDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoIsoDataFields[] __ret = __obj.getFEMThermoIsoDataFieldsList(ids, __current);
        FEMThermoIsoDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThermoIsoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoDataFields fields;
        fields = new FEMThermoIsoDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThermoIsoData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThermoIsoDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoIsoDataFields fields;
        fields = new FEMThermoIsoDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThermoIsoDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactGroup3(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactGroup3Fields fields;
        fields = new FEMContactGroup3Fields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMContactGroup3(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactGroup3List(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactGroup3Fields[] fieldsList;
        fieldsList = FEMContactGroup3FieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMContactGroup3List(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactGroup3(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactGroup3Prx __ret = __obj.getFEMContactGroup3(id, __current);
        FEMContactGroup3PrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactGroup3Ids(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMContactGroup3Ids(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactGroup3List(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactGroup3Prx[] __ret = __obj.getFEMContactGroup3List(ids, __current);
        FEMContactGroup3ListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactGroup3Fields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactGroup3Fields __ret = __obj.getFEMContactGroup3Fields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactGroup3FieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactGroup3Fields[] __ret = __obj.getFEMContactGroup3FieldsList(ids, __current);
        FEMContactGroup3FieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMContactGroup3(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactGroup3Fields fields;
        fields = new FEMContactGroup3Fields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMContactGroup3(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMContactGroup3Fields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactGroup3Fields fields;
        fields = new FEMContactGroup3Fields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMContactGroup3Fields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNLElasticMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticMaterialsFields fields;
        fields = new FEMNLElasticMaterialsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNLElasticMaterials(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNLElasticMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticMaterialsFields[] fieldsList;
        fieldsList = FEMNLElasticMaterialsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNLElasticMaterialsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticMaterialsPrx __ret = __obj.getFEMNLElasticMaterials(id, __current);
        FEMNLElasticMaterialsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticMaterialsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNLElasticMaterialsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticMaterialsPrx[] __ret = __obj.getFEMNLElasticMaterialsList(ids, __current);
        FEMNLElasticMaterialsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticMaterialsFields __ret = __obj.getFEMNLElasticMaterialsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNLElasticMaterialsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNLElasticMaterialsFields[] __ret = __obj.getFEMNLElasticMaterialsFieldsList(ids, __current);
        FEMNLElasticMaterialsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNLElasticMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticMaterialsFields fields;
        fields = new FEMNLElasticMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNLElasticMaterials(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNLElasticMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNLElasticMaterialsFields fields;
        fields = new FEMNLElasticMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNLElasticMaterialsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlate(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateFields fields;
        fields = new FEMPlateFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPlate(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlateList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateFields[] fieldsList;
        fieldsList = FEMPlateFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPlateList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlate(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlatePrx __ret = __obj.getFEMPlate(id, __current);
        FEMPlatePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPlateIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlatePrx[] __ret = __obj.getFEMPlateList(ids, __current);
        FEMPlateListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateFields __ret = __obj.getFEMPlateFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlateFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlateFields[] __ret = __obj.getFEMPlateFieldsList(ids, __current);
        FEMPlateFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPlate(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateFields fields;
        fields = new FEMPlateFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPlate(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPlateFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlateFields fields;
        fields = new FEMPlateFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPlateFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMIsoBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamFields fields;
        fields = new FEMIsoBeamFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMIsoBeam(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMIsoBeamList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamFields[] fieldsList;
        fieldsList = FEMIsoBeamFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMIsoBeamList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamPrx __ret = __obj.getFEMIsoBeam(id, __current);
        FEMIsoBeamPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMIsoBeamIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamPrx[] __ret = __obj.getFEMIsoBeamList(ids, __current);
        FEMIsoBeamListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamFields __ret = __obj.getFEMIsoBeamFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamFields[] __ret = __obj.getFEMIsoBeamFieldsList(ids, __current);
        FEMIsoBeamFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMIsoBeam(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamFields fields;
        fields = new FEMIsoBeamFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMIsoBeam(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMIsoBeamFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamFields fields;
        fields = new FEMIsoBeamFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMIsoBeamFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedConcentratedLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedConcentratedLoadFields fields;
        fields = new FEMAppliedConcentratedLoadFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMAppliedConcentratedLoad(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedConcentratedLoadList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedConcentratedLoadFields[] fieldsList;
        fieldsList = FEMAppliedConcentratedLoadFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMAppliedConcentratedLoadList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedConcentratedLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedConcentratedLoadPrx __ret = __obj.getFEMAppliedConcentratedLoad(id, __current);
        FEMAppliedConcentratedLoadPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedConcentratedLoadIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMAppliedConcentratedLoadIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedConcentratedLoadList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedConcentratedLoadPrx[] __ret = __obj.getFEMAppliedConcentratedLoadList(ids, __current);
        FEMAppliedConcentratedLoadListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedConcentratedLoadFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedConcentratedLoadFields __ret = __obj.getFEMAppliedConcentratedLoadFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedConcentratedLoadFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedConcentratedLoadFields[] __ret = __obj.getFEMAppliedConcentratedLoadFieldsList(ids, __current);
        FEMAppliedConcentratedLoadFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMAppliedConcentratedLoad(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedConcentratedLoadFields fields;
        fields = new FEMAppliedConcentratedLoadFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMAppliedConcentratedLoad(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMAppliedConcentratedLoadFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedConcentratedLoadFields fields;
        fields = new FEMAppliedConcentratedLoadFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMAppliedConcentratedLoadFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwoDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidGroupFields fields;
        fields = new FEMTwoDSolidGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTwoDSolidGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwoDSolidGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidGroupFields[] fieldsList;
        fieldsList = FEMTwoDSolidGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTwoDSolidGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidGroupPrx __ret = __obj.getFEMTwoDSolidGroup(id, __current);
        FEMTwoDSolidGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTwoDSolidGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidGroupPrx[] __ret = __obj.getFEMTwoDSolidGroupList(ids, __current);
        FEMTwoDSolidGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidGroupFields __ret = __obj.getFEMTwoDSolidGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidGroupFields[] __ret = __obj.getFEMTwoDSolidGroupFieldsList(ids, __current);
        FEMTwoDSolidGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTwoDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidGroupFields fields;
        fields = new FEMTwoDSolidGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTwoDSolidGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTwoDSolidGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidGroupFields fields;
        fields = new FEMTwoDSolidGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTwoDSolidGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroupFields fields;
        fields = new FEMGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroupFields[] fieldsList;
        fieldsList = FEMGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroupPrx __ret = __obj.getFEMGroup(id, __current);
        FEMGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroupPrx[] __ret = __obj.getFEMGroupList(ids, __current);
        FEMGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroupFields __ret = __obj.getFEMGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroupFields[] __ret = __obj.getFEMGroupFieldsList(ids, __current);
        FEMGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroupFields fields;
        fields = new FEMGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroupFields fields;
        fields = new FEMGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMProperties(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertiesFields fields;
        fields = new FEMPropertiesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMProperties(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPropertiesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertiesFields[] fieldsList;
        fieldsList = FEMPropertiesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPropertiesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMProperties(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertiesPrx __ret = __obj.getFEMProperties(id, __current);
        FEMPropertiesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertiesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPropertiesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertiesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertiesPrx[] __ret = __obj.getFEMPropertiesList(ids, __current);
        FEMPropertiesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertiesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertiesFields __ret = __obj.getFEMPropertiesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPropertiesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPropertiesFields[] __ret = __obj.getFEMPropertiesFieldsList(ids, __current);
        FEMPropertiesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMProperties(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertiesFields fields;
        fields = new FEMPropertiesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMProperties(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPropertiesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPropertiesFields fields;
        fields = new FEMPropertiesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPropertiesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThreeDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidGroupFields fields;
        fields = new FEMThreeDSolidGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThreeDSolidGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThreeDSolidGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidGroupFields[] fieldsList;
        fieldsList = FEMThreeDSolidGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThreeDSolidGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidGroupPrx __ret = __obj.getFEMThreeDSolidGroup(id, __current);
        FEMThreeDSolidGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThreeDSolidGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidGroupPrx[] __ret = __obj.getFEMThreeDSolidGroupList(ids, __current);
        FEMThreeDSolidGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidGroupFields __ret = __obj.getFEMThreeDSolidGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidGroupFields[] __ret = __obj.getFEMThreeDSolidGroupFieldsList(ids, __current);
        FEMThreeDSolidGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThreeDSolidGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidGroupFields fields;
        fields = new FEMThreeDSolidGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThreeDSolidGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThreeDSolidGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidGroupFields fields;
        fields = new FEMThreeDSolidGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThreeDSolidGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThreeDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidFields fields;
        fields = new FEMThreeDSolidFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThreeDSolid(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThreeDSolidList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidFields[] fieldsList;
        fieldsList = FEMThreeDSolidFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThreeDSolidList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidPrx __ret = __obj.getFEMThreeDSolid(id, __current);
        FEMThreeDSolidPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThreeDSolidIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidPrx[] __ret = __obj.getFEMThreeDSolidList(ids, __current);
        FEMThreeDSolidListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidFields __ret = __obj.getFEMThreeDSolidFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThreeDSolidFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThreeDSolidFields[] __ret = __obj.getFEMThreeDSolidFieldsList(ids, __current);
        FEMThreeDSolidFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThreeDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidFields fields;
        fields = new FEMThreeDSolidFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThreeDSolid(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThreeDSolidFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThreeDSolidFields fields;
        fields = new FEMThreeDSolidFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThreeDSolidFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionProp(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPropFields fields;
        fields = new FEMSectionPropFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSectionProp(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionPropList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPropFields[] fieldsList;
        fieldsList = FEMSectionPropFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSectionPropList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionProp(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPropPrx __ret = __obj.getFEMSectionProp(id, __current);
        FEMSectionPropPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPropIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSectionPropIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPropList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPropPrx[] __ret = __obj.getFEMSectionPropList(ids, __current);
        FEMSectionPropListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPropFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPropFields __ret = __obj.getFEMSectionPropFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionPropFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionPropFields[] __ret = __obj.getFEMSectionPropFieldsList(ids, __current);
        FEMSectionPropFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSectionProp(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPropFields fields;
        fields = new FEMSectionPropFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSectionProp(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSectionPropFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionPropFields fields;
        fields = new FEMSectionPropFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSectionPropFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMElasticMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMElasticMaterialFields fields;
        fields = new FEMElasticMaterialFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMElasticMaterial(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMElasticMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMElasticMaterialFields[] fieldsList;
        fieldsList = FEMElasticMaterialFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMElasticMaterialList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMElasticMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMElasticMaterialPrx __ret = __obj.getFEMElasticMaterial(id, __current);
        FEMElasticMaterialPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMElasticMaterialIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMElasticMaterialIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMElasticMaterialList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMElasticMaterialPrx[] __ret = __obj.getFEMElasticMaterialList(ids, __current);
        FEMElasticMaterialListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMElasticMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMElasticMaterialFields __ret = __obj.getFEMElasticMaterialFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMElasticMaterialFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMElasticMaterialFields[] __ret = __obj.getFEMElasticMaterialFieldsList(ids, __current);
        FEMElasticMaterialFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMElasticMaterial(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMElasticMaterialFields fields;
        fields = new FEMElasticMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMElasticMaterial(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMElasticMaterialFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMElasticMaterialFields fields;
        fields = new FEMElasticMaterialFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMElasticMaterialFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPoints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPointsFields fields;
        fields = new FEMPointsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPoints(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPointsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPointsFields[] fieldsList;
        fieldsList = FEMPointsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPointsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPoints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPointsPrx __ret = __obj.getFEMPoints(id, __current);
        FEMPointsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPointsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPointsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPointsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPointsPrx[] __ret = __obj.getFEMPointsList(ids, __current);
        FEMPointsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPointsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPointsFields __ret = __obj.getFEMPointsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPointsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPointsFields[] __ret = __obj.getFEMPointsFieldsList(ids, __current);
        FEMPointsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPoints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPointsFields fields;
        fields = new FEMPointsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPoints(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPointsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPointsFields fields;
        fields = new FEMPointsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPointsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoOrthMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthMaterialsFields fields;
        fields = new FEMThermoOrthMaterialsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMThermoOrthMaterials(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMThermoOrthMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthMaterialsFields[] fieldsList;
        fieldsList = FEMThermoOrthMaterialsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMThermoOrthMaterialsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthMaterialsPrx __ret = __obj.getFEMThermoOrthMaterials(id, __current);
        FEMThermoOrthMaterialsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthMaterialsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMThermoOrthMaterialsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthMaterialsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthMaterialsPrx[] __ret = __obj.getFEMThermoOrthMaterialsList(ids, __current);
        FEMThermoOrthMaterialsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthMaterialsFields __ret = __obj.getFEMThermoOrthMaterialsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMThermoOrthMaterialsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMThermoOrthMaterialsFields[] __ret = __obj.getFEMThermoOrthMaterialsFieldsList(ids, __current);
        FEMThermoOrthMaterialsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMThermoOrthMaterials(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthMaterialsFields fields;
        fields = new FEMThermoOrthMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMThermoOrthMaterials(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMThermoOrthMaterialsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMThermoOrthMaterialsFields fields;
        fields = new FEMThermoOrthMaterialsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMThermoOrthMaterialsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMConstraints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintsFields fields;
        fields = new FEMConstraintsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMConstraints(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMConstraintsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintsFields[] fieldsList;
        fieldsList = FEMConstraintsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMConstraintsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintsPrx __ret = __obj.getFEMConstraints(id, __current);
        FEMConstraintsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMConstraintsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintsPrx[] __ret = __obj.getFEMConstraintsList(ids, __current);
        FEMConstraintsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintsFields __ret = __obj.getFEMConstraintsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintsFields[] __ret = __obj.getFEMConstraintsFieldsList(ids, __current);
        FEMConstraintsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMConstraints(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintsFields fields;
        fields = new FEMConstraintsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMConstraints(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMConstraintsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintsFields fields;
        fields = new FEMConstraintsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMConstraintsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMCrigidities(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCrigiditiesFields fields;
        fields = new FEMMCrigiditiesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMCrigidities(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMCrigiditiesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCrigiditiesFields[] fieldsList;
        fieldsList = FEMMCrigiditiesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMCrigiditiesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCrigidities(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCrigiditiesPrx __ret = __obj.getFEMMCrigidities(id, __current);
        FEMMCrigiditiesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCrigiditiesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMCrigiditiesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCrigiditiesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCrigiditiesPrx[] __ret = __obj.getFEMMCrigiditiesList(ids, __current);
        FEMMCrigiditiesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCrigiditiesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCrigiditiesFields __ret = __obj.getFEMMCrigiditiesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCrigiditiesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCrigiditiesFields[] __ret = __obj.getFEMMCrigiditiesFieldsList(ids, __current);
        FEMMCrigiditiesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMCrigidities(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCrigiditiesFields fields;
        fields = new FEMMCrigiditiesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMCrigidities(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMCrigiditiesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCrigiditiesFields fields;
        fields = new FEMMCrigiditiesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMCrigiditiesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkeySysNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkeySysNodeFields fields;
        fields = new FEMSkeySysNodeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSkeySysNode(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkeySysNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkeySysNodeFields[] fieldsList;
        fieldsList = FEMSkeySysNodeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSkeySysNodeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkeySysNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkeySysNodePrx __ret = __obj.getFEMSkeySysNode(id, __current);
        FEMSkeySysNodePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkeySysNodeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSkeySysNodeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkeySysNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkeySysNodePrx[] __ret = __obj.getFEMSkeySysNodeList(ids, __current);
        FEMSkeySysNodeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkeySysNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkeySysNodeFields __ret = __obj.getFEMSkeySysNodeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkeySysNodeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkeySysNodeFields[] __ret = __obj.getFEMSkeySysNodeFieldsList(ids, __current);
        FEMSkeySysNodeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSkeySysNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkeySysNodeFields fields;
        fields = new FEMSkeySysNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSkeySysNode(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSkeySysNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkeySysNodeFields fields;
        fields = new FEMSkeySysNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSkeySysNodeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMIsoBeamGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamGroupFields fields;
        fields = new FEMIsoBeamGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMIsoBeamGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMIsoBeamGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamGroupFields[] fieldsList;
        fieldsList = FEMIsoBeamGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMIsoBeamGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamGroupPrx __ret = __obj.getFEMIsoBeamGroup(id, __current);
        FEMIsoBeamGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMIsoBeamGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamGroupPrx[] __ret = __obj.getFEMIsoBeamGroupList(ids, __current);
        FEMIsoBeamGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamGroupFields __ret = __obj.getFEMIsoBeamGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMIsoBeamGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMIsoBeamGroupFields[] __ret = __obj.getFEMIsoBeamGroupFieldsList(ids, __current);
        FEMIsoBeamGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMIsoBeamGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamGroupFields fields;
        fields = new FEMIsoBeamGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMIsoBeamGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMIsoBeamGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMIsoBeamGroupFields fields;
        fields = new FEMIsoBeamGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMIsoBeamGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellDOFFields fields;
        fields = new FEMShellDOFFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellDOF(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellDOFList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellDOFFields[] fieldsList;
        fieldsList = FEMShellDOFFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellDOFList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellDOFPrx __ret = __obj.getFEMShellDOF(id, __current);
        FEMShellDOFPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellDOFIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellDOFIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellDOFList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellDOFPrx[] __ret = __obj.getFEMShellDOFList(ids, __current);
        FEMShellDOFListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellDOFFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellDOFFields __ret = __obj.getFEMShellDOFFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellDOFFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellDOFFields[] __ret = __obj.getFEMShellDOFFieldsList(ids, __current);
        FEMShellDOFFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellDOF(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellDOFFields fields;
        fields = new FEMShellDOFFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellDOF(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellDOFFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellDOFFields fields;
        fields = new FEMShellDOFFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellDOFFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCrossSections(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCrossSectionsFields fields;
        fields = new FEMCrossSectionsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMCrossSections(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMCrossSectionsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCrossSectionsFields[] fieldsList;
        fieldsList = FEMCrossSectionsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMCrossSectionsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCrossSections(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCrossSectionsPrx __ret = __obj.getFEMCrossSections(id, __current);
        FEMCrossSectionsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCrossSectionsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMCrossSectionsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCrossSectionsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCrossSectionsPrx[] __ret = __obj.getFEMCrossSectionsList(ids, __current);
        FEMCrossSectionsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCrossSectionsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCrossSectionsFields __ret = __obj.getFEMCrossSectionsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMCrossSectionsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMCrossSectionsFields[] __ret = __obj.getFEMCrossSectionsFieldsList(ids, __current);
        FEMCrossSectionsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMCrossSections(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCrossSectionsFields fields;
        fields = new FEMCrossSectionsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMCrossSections(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMCrossSectionsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMCrossSectionsFields fields;
        fields = new FEMCrossSectionsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMCrossSectionsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwistMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwistMomentDataFields fields;
        fields = new FEMTwistMomentDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTwistMomentData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwistMomentDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwistMomentDataFields[] fieldsList;
        fieldsList = FEMTwistMomentDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTwistMomentDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwistMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwistMomentDataPrx __ret = __obj.getFEMTwistMomentData(id, __current);
        FEMTwistMomentDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwistMomentDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTwistMomentDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwistMomentDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwistMomentDataPrx[] __ret = __obj.getFEMTwistMomentDataList(ids, __current);
        FEMTwistMomentDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwistMomentDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwistMomentDataFields __ret = __obj.getFEMTwistMomentDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwistMomentDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwistMomentDataFields[] __ret = __obj.getFEMTwistMomentDataFieldsList(ids, __current);
        FEMTwistMomentDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTwistMomentData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwistMomentDataFields fields;
        fields = new FEMTwistMomentDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTwistMomentData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTwistMomentDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwistMomentDataFields fields;
        fields = new FEMTwistMomentDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTwistMomentDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShell(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellFields fields;
        fields = new FEMShellFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShell(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellFields[] fieldsList;
        fieldsList = FEMShellFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShell(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPrx __ret = __obj.getFEMShell(id, __current);
        FEMShellPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellPrx[] __ret = __obj.getFEMShellList(ids, __current);
        FEMShellListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellFields __ret = __obj.getFEMShellFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellFields[] __ret = __obj.getFEMShellFieldsList(ids, __current);
        FEMShellFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShell(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellFields fields;
        fields = new FEMShellFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShell(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellFields fields;
        fields = new FEMShellFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNTNContact(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNTNContactFields fields;
        fields = new FEMNTNContactFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNTNContact(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNTNContactList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNTNContactFields[] fieldsList;
        fieldsList = FEMNTNContactFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNTNContactList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNTNContact(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNTNContactPrx __ret = __obj.getFEMNTNContact(id, __current);
        FEMNTNContactPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNTNContactIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNTNContactIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNTNContactList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNTNContactPrx[] __ret = __obj.getFEMNTNContactList(ids, __current);
        FEMNTNContactListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNTNContactFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNTNContactFields __ret = __obj.getFEMNTNContactFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNTNContactFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNTNContactFields[] __ret = __obj.getFEMNTNContactFieldsList(ids, __current);
        FEMNTNContactFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNTNContact(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNTNContactFields fields;
        fields = new FEMNTNContactFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNTNContact(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNTNContactFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNTNContactFields fields;
        fields = new FEMNTNContactFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNTNContactFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellLayer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellLayerFields fields;
        fields = new FEMShellLayerFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellLayer(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellLayerList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellLayerFields[] fieldsList;
        fieldsList = FEMShellLayerFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellLayerList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellLayer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellLayerPrx __ret = __obj.getFEMShellLayer(id, __current);
        FEMShellLayerPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellLayerIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellLayerIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellLayerList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellLayerPrx[] __ret = __obj.getFEMShellLayerList(ids, __current);
        FEMShellLayerListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellLayerFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellLayerFields __ret = __obj.getFEMShellLayerFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellLayerFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellLayerFields[] __ret = __obj.getFEMShellLayerFieldsList(ids, __current);
        FEMShellLayerFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellLayer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellLayerFields fields;
        fields = new FEMShellLayerFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellLayer(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellLayerFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellLayerFields fields;
        fields = new FEMShellLayerFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellLayerFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkewSysAngles(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewSysAnglesFields fields;
        fields = new FEMSkewSysAnglesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSkewSysAngles(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSkewSysAnglesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewSysAnglesFields[] fieldsList;
        fieldsList = FEMSkewSysAnglesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSkewSysAnglesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewSysAngles(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewSysAnglesPrx __ret = __obj.getFEMSkewSysAngles(id, __current);
        FEMSkewSysAnglesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewSysAnglesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSkewSysAnglesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewSysAnglesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewSysAnglesPrx[] __ret = __obj.getFEMSkewSysAnglesList(ids, __current);
        FEMSkewSysAnglesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewSysAnglesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewSysAnglesFields __ret = __obj.getFEMSkewSysAnglesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSkewSysAnglesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSkewSysAnglesFields[] __ret = __obj.getFEMSkewSysAnglesFieldsList(ids, __current);
        FEMSkewSysAnglesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSkewSysAngles(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewSysAnglesFields fields;
        fields = new FEMSkewSysAnglesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSkewSysAngles(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSkewSysAnglesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSkewSysAnglesFields fields;
        fields = new FEMSkewSysAnglesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSkewSysAnglesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGroundMotionRecord(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroundMotionRecordFields fields;
        fields = new FEMGroundMotionRecordFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMGroundMotionRecord(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGroundMotionRecordList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroundMotionRecordFields[] fieldsList;
        fieldsList = FEMGroundMotionRecordFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMGroundMotionRecordList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroundMotionRecord(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroundMotionRecordPrx __ret = __obj.getFEMGroundMotionRecord(id, __current);
        FEMGroundMotionRecordPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroundMotionRecordIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMGroundMotionRecordIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroundMotionRecordList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroundMotionRecordPrx[] __ret = __obj.getFEMGroundMotionRecordList(ids, __current);
        FEMGroundMotionRecordListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroundMotionRecordFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroundMotionRecordFields __ret = __obj.getFEMGroundMotionRecordFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGroundMotionRecordFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGroundMotionRecordFields[] __ret = __obj.getFEMGroundMotionRecordFieldsList(ids, __current);
        FEMGroundMotionRecordFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMGroundMotionRecord(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroundMotionRecordFields fields;
        fields = new FEMGroundMotionRecordFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMGroundMotionRecord(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMGroundMotionRecordFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGroundMotionRecordFields fields;
        fields = new FEMGroundMotionRecordFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMGroundMotionRecordFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneralGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralGroupFields fields;
        fields = new FEMGeneralGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMGeneralGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneralGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralGroupFields[] fieldsList;
        fieldsList = FEMGeneralGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMGeneralGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralGroupPrx __ret = __obj.getFEMGeneralGroup(id, __current);
        FEMGeneralGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMGeneralGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralGroupPrx[] __ret = __obj.getFEMGeneralGroupList(ids, __current);
        FEMGeneralGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralGroupFields __ret = __obj.getFEMGeneralGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralGroupFields[] __ret = __obj.getFEMGeneralGroupFieldsList(ids, __current);
        FEMGeneralGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMGeneralGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralGroupFields fields;
        fields = new FEMGeneralGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMGeneralGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMGeneralGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralGroupFields fields;
        fields = new FEMGeneralGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMGeneralGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwoDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidFields fields;
        fields = new FEMTwoDSolidFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMTwoDSolid(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMTwoDSolidList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidFields[] fieldsList;
        fieldsList = FEMTwoDSolidFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMTwoDSolidList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidPrx __ret = __obj.getFEMTwoDSolid(id, __current);
        FEMTwoDSolidPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMTwoDSolidIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidPrx[] __ret = __obj.getFEMTwoDSolidList(ids, __current);
        FEMTwoDSolidListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidFields __ret = __obj.getFEMTwoDSolidFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMTwoDSolidFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMTwoDSolidFields[] __ret = __obj.getFEMTwoDSolidFieldsList(ids, __current);
        FEMTwoDSolidFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMTwoDSolid(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidFields fields;
        fields = new FEMTwoDSolidFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMTwoDSolid(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMTwoDSolidFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMTwoDSolidFields fields;
        fields = new FEMTwoDSolidFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMTwoDSolidFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedTemperatureFields fields;
        fields = new FEMAppliedTemperatureFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMAppliedTemperature(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMAppliedTemperatureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedTemperatureFields[] fieldsList;
        fieldsList = FEMAppliedTemperatureFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMAppliedTemperatureList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedTemperaturePrx __ret = __obj.getFEMAppliedTemperature(id, __current);
        FEMAppliedTemperaturePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedTemperatureIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMAppliedTemperatureIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedTemperatureList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedTemperaturePrx[] __ret = __obj.getFEMAppliedTemperatureList(ids, __current);
        FEMAppliedTemperatureListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedTemperatureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedTemperatureFields __ret = __obj.getFEMAppliedTemperatureFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMAppliedTemperatureFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMAppliedTemperatureFields[] __ret = __obj.getFEMAppliedTemperatureFieldsList(ids, __current);
        FEMAppliedTemperatureFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMAppliedTemperature(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedTemperatureFields fields;
        fields = new FEMAppliedTemperatureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMAppliedTemperature(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMAppliedTemperatureFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMAppliedTemperatureFields fields;
        fields = new FEMAppliedTemperatureFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMAppliedTemperatureFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatrixSets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixSetsFields fields;
        fields = new FEMMatrixSetsFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMatrixSets(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMatrixSetsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixSetsFields[] fieldsList;
        fieldsList = FEMMatrixSetsFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMatrixSetsList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixSets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixSetsPrx __ret = __obj.getFEMMatrixSets(id, __current);
        FEMMatrixSetsPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixSetsIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMatrixSetsIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixSetsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixSetsPrx[] __ret = __obj.getFEMMatrixSetsList(ids, __current);
        FEMMatrixSetsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixSetsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixSetsFields __ret = __obj.getFEMMatrixSetsFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMatrixSetsFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMatrixSetsFields[] __ret = __obj.getFEMMatrixSetsFieldsList(ids, __current);
        FEMMatrixSetsFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMatrixSets(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixSetsFields fields;
        fields = new FEMMatrixSetsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMatrixSets(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMatrixSetsFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMatrixSetsFields fields;
        fields = new FEMMatrixSetsFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMatrixSetsFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMConstraintCoef(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintCoefFields fields;
        fields = new FEMConstraintCoefFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMConstraintCoef(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMConstraintCoefList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintCoefFields[] fieldsList;
        fieldsList = FEMConstraintCoefFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMConstraintCoefList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintCoef(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintCoefPrx __ret = __obj.getFEMConstraintCoef(id, __current);
        FEMConstraintCoefPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintCoefIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMConstraintCoefIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintCoefList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintCoefPrx[] __ret = __obj.getFEMConstraintCoefList(ids, __current);
        FEMConstraintCoefListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintCoefFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintCoefFields __ret = __obj.getFEMConstraintCoefFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMConstraintCoefFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMConstraintCoefFields[] __ret = __obj.getFEMConstraintCoefFieldsList(ids, __current);
        FEMConstraintCoefFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMConstraintCoef(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintCoefFields fields;
        fields = new FEMConstraintCoefFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMConstraintCoef(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMConstraintCoefFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMConstraintCoefFields fields;
        fields = new FEMConstraintCoefFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMConstraintCoefFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionBox(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionBoxFields fields;
        fields = new FEMSectionBoxFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSectionBox(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSectionBoxList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionBoxFields[] fieldsList;
        fieldsList = FEMSectionBoxFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSectionBoxList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionBox(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionBoxPrx __ret = __obj.getFEMSectionBox(id, __current);
        FEMSectionBoxPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionBoxIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSectionBoxIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionBoxList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionBoxPrx[] __ret = __obj.getFEMSectionBoxList(ids, __current);
        FEMSectionBoxListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionBoxFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionBoxFields __ret = __obj.getFEMSectionBoxFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSectionBoxFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSectionBoxFields[] __ret = __obj.getFEMSectionBoxFieldsList(ids, __current);
        FEMSectionBoxFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSectionBox(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionBoxFields fields;
        fields = new FEMSectionBoxFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSectionBox(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSectionBoxFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSectionBoxFields fields;
        fields = new FEMSectionBoxFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSectionBoxFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNKDisplForce(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNKDisplForceFields fields;
        fields = new FEMNKDisplForceFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMNKDisplForce(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMNKDisplForceList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNKDisplForceFields[] fieldsList;
        fieldsList = FEMNKDisplForceFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMNKDisplForceList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNKDisplForce(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNKDisplForcePrx __ret = __obj.getFEMNKDisplForce(id, __current);
        FEMNKDisplForcePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNKDisplForceIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMNKDisplForceIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNKDisplForceList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNKDisplForcePrx[] __ret = __obj.getFEMNKDisplForceList(ids, __current);
        FEMNKDisplForceListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNKDisplForceFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNKDisplForceFields __ret = __obj.getFEMNKDisplForceFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMNKDisplForceFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMNKDisplForceFields[] __ret = __obj.getFEMNKDisplForceFieldsList(ids, __current);
        FEMNKDisplForceFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMNKDisplForce(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNKDisplForceFields fields;
        fields = new FEMNKDisplForceFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMNKDisplForce(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMNKDisplForceFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMNKDisplForceFields fields;
        fields = new FEMNKDisplForceFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMNKDisplForceFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticStrainStressFields fields;
        fields = new FEMPlasticStrainStressFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMPlasticStrainStress(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMPlasticStrainStressList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticStrainStressFields[] fieldsList;
        fieldsList = FEMPlasticStrainStressFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMPlasticStrainStressList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticStrainStressPrx __ret = __obj.getFEMPlasticStrainStress(id, __current);
        FEMPlasticStrainStressPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticStrainStressIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMPlasticStrainStressIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticStrainStressList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticStrainStressPrx[] __ret = __obj.getFEMPlasticStrainStressList(ids, __current);
        FEMPlasticStrainStressListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticStrainStressFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticStrainStressFields __ret = __obj.getFEMPlasticStrainStressFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMPlasticStrainStressFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMPlasticStrainStressFields[] __ret = __obj.getFEMPlasticStrainStressFieldsList(ids, __current);
        FEMPlasticStrainStressFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMPlasticStrainStress(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticStrainStressFields fields;
        fields = new FEMPlasticStrainStressFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMPlasticStrainStress(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMPlasticStrainStressFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMPlasticStrainStressFields fields;
        fields = new FEMPlasticStrainStressFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMPlasticStrainStressFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellAxesOrthoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoDataFields fields;
        fields = new FEMShellAxesOrthoDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellAxesOrthoData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellAxesOrthoDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoDataFields[] fieldsList;
        fieldsList = FEMShellAxesOrthoDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellAxesOrthoDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoDataPrx __ret = __obj.getFEMShellAxesOrthoData(id, __current);
        FEMShellAxesOrthoDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellAxesOrthoDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoDataPrx[] __ret = __obj.getFEMShellAxesOrthoDataList(ids, __current);
        FEMShellAxesOrthoDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoDataFields __ret = __obj.getFEMShellAxesOrthoDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellAxesOrthoDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellAxesOrthoDataFields[] __ret = __obj.getFEMShellAxesOrthoDataFieldsList(ids, __current);
        FEMShellAxesOrthoDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellAxesOrthoData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoDataFields fields;
        fields = new FEMShellAxesOrthoDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellAxesOrthoData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellAxesOrthoDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellAxesOrthoDataFields fields;
        fields = new FEMShellAxesOrthoDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellAxesOrthoDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneralNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralNodeFields fields;
        fields = new FEMGeneralNodeFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMGeneralNode(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMGeneralNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralNodeFields[] fieldsList;
        fieldsList = FEMGeneralNodeFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMGeneralNodeList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralNodePrx __ret = __obj.getFEMGeneralNode(id, __current);
        FEMGeneralNodePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralNodeIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMGeneralNodeIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralNodeList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralNodePrx[] __ret = __obj.getFEMGeneralNodeList(ids, __current);
        FEMGeneralNodeListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralNodeFields __ret = __obj.getFEMGeneralNodeFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMGeneralNodeFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMGeneralNodeFields[] __ret = __obj.getFEMGeneralNodeFieldsList(ids, __current);
        FEMGeneralNodeFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMGeneralNode(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralNodeFields fields;
        fields = new FEMGeneralNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMGeneralNode(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMGeneralNodeFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMGeneralNodeFields fields;
        fields = new FEMGeneralNodeFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMGeneralNodeFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMStrLines(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMStrLinesFields fields;
        fields = new FEMStrLinesFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMStrLines(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMStrLinesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMStrLinesFields[] fieldsList;
        fieldsList = FEMStrLinesFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMStrLinesList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMStrLines(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMStrLinesPrx __ret = __obj.getFEMStrLines(id, __current);
        FEMStrLinesPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMStrLinesIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMStrLinesIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMStrLinesList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMStrLinesPrx[] __ret = __obj.getFEMStrLinesList(ids, __current);
        FEMStrLinesListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMStrLinesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMStrLinesFields __ret = __obj.getFEMStrLinesFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMStrLinesFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMStrLinesFields[] __ret = __obj.getFEMStrLinesFieldsList(ids, __current);
        FEMStrLinesFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMStrLines(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMStrLinesFields fields;
        fields = new FEMStrLinesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMStrLines(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMStrLinesFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMStrLinesFields fields;
        fields = new FEMStrLinesFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMStrLinesFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactSurface(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactSurfaceFields fields;
        fields = new FEMContactSurfaceFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMContactSurface(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMContactSurfaceList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactSurfaceFields[] fieldsList;
        fieldsList = FEMContactSurfaceFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMContactSurfaceList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactSurface(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactSurfacePrx __ret = __obj.getFEMContactSurface(id, __current);
        FEMContactSurfacePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactSurfaceIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMContactSurfaceIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactSurfaceList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactSurfacePrx[] __ret = __obj.getFEMContactSurfaceList(ids, __current);
        FEMContactSurfaceListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactSurfaceFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactSurfaceFields __ret = __obj.getFEMContactSurfaceFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMContactSurfaceFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMContactSurfaceFields[] __ret = __obj.getFEMContactSurfaceFieldsList(ids, __current);
        FEMContactSurfaceFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMContactSurface(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactSurfaceFields fields;
        fields = new FEMContactSurfaceFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMContactSurface(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMContactSurfaceFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMContactSurfaceFields fields;
        fields = new FEMContactSurfaceFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMContactSurfaceFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMCForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCForceDataFields fields;
        fields = new FEMMCForceDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMMCForceData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMMCForceDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCForceDataFields[] fieldsList;
        fieldsList = FEMMCForceDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMMCForceDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCForceDataPrx __ret = __obj.getFEMMCForceData(id, __current);
        FEMMCForceDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCForceDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMMCForceDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCForceDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCForceDataPrx[] __ret = __obj.getFEMMCForceDataList(ids, __current);
        FEMMCForceDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCForceDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCForceDataFields __ret = __obj.getFEMMCForceDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMMCForceDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMMCForceDataFields[] __ret = __obj.getFEMMCForceDataFieldsList(ids, __current);
        FEMMCForceDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMMCForceData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCForceDataFields fields;
        fields = new FEMMCForceDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMMCForceData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMMCForceDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMMCForceDataFields fields;
        fields = new FEMMCForceDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMMCForceDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSpring(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringFields fields;
        fields = new FEMSpringFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSpring(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSpringList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringFields[] fieldsList;
        fieldsList = FEMSpringFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSpringList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpring(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringPrx __ret = __obj.getFEMSpring(id, __current);
        FEMSpringPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSpringIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringPrx[] __ret = __obj.getFEMSpringList(ids, __current);
        FEMSpringListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringFields __ret = __obj.getFEMSpringFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringFields[] __ret = __obj.getFEMSpringFieldsList(ids, __current);
        FEMSpringFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSpring(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringFields fields;
        fields = new FEMSpringFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSpring(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSpringFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringFields fields;
        fields = new FEMSpringFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSpringFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSpringGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringGroupFields fields;
        fields = new FEMSpringGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMSpringGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMSpringGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringGroupFields[] fieldsList;
        fieldsList = FEMSpringGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMSpringGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringGroupPrx __ret = __obj.getFEMSpringGroup(id, __current);
        FEMSpringGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMSpringGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringGroupPrx[] __ret = __obj.getFEMSpringGroupList(ids, __current);
        FEMSpringGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringGroupFields __ret = __obj.getFEMSpringGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMSpringGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMSpringGroupFields[] __ret = __obj.getFEMSpringGroupFieldsList(ids, __current);
        FEMSpringGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMSpringGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringGroupFields fields;
        fields = new FEMSpringGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMSpringGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMSpringGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMSpringGroupFields fields;
        fields = new FEMSpringGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMSpringGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellGroupFields fields;
        fields = new FEMShellGroupFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addFEMShellGroup(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addFEMShellGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellGroupFields[] fieldsList;
        fieldsList = FEMShellGroupFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addFEMShellGroupList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellGroupPrx __ret = __obj.getFEMShellGroup(id, __current);
        FEMShellGroupPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellGroupIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getFEMShellGroupIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellGroupList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellGroupPrx[] __ret = __obj.getFEMShellGroupList(ids, __current);
        FEMShellGroupListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellGroupFields __ret = __obj.getFEMShellGroupFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getFEMShellGroupFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        FEMShellGroupFields[] __ret = __obj.getFEMShellGroupFieldsList(ids, __current);
        FEMShellGroupFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualFEMShellGroup(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellGroupFields fields;
        fields = new FEMShellGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualFEMShellGroup(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFEMShellGroupFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        FEMShellGroupFields fields;
        fields = new FEMShellGroupFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFEMShellGroupFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnit(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitFields fields;
        fields = new DaqUnitFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addDaqUnit(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnitList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitFields[] fieldsList;
        fieldsList = DaqUnitFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addDaqUnitList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnit(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitPrx __ret = __obj.getDaqUnit(id, __current);
        DaqUnitPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getDaqUnitIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitPrx[] __ret = __obj.getDaqUnitList(ids, __current);
        DaqUnitListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitFields __ret = __obj.getDaqUnitFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitFields[] __ret = __obj.getDaqUnitFieldsList(ids, __current);
        DaqUnitFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualDaqUnit(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitFields fields;
        fields = new DaqUnitFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualDaqUnit(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setDaqUnitFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitFields fields;
        fields = new DaqUnitFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setDaqUnitFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnitChannel(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelFields fields;
        fields = new DaqUnitChannelFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addDaqUnitChannel(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnitChannelList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelFields[] fieldsList;
        fieldsList = DaqUnitChannelFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addDaqUnitChannelList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannel(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelPrx __ret = __obj.getDaqUnitChannel(id, __current);
        DaqUnitChannelPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getDaqUnitChannelIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelPrx[] __ret = __obj.getDaqUnitChannelList(ids, __current);
        DaqUnitChannelListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelFields __ret = __obj.getDaqUnitChannelFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelFields[] __ret = __obj.getDaqUnitChannelFieldsList(ids, __current);
        DaqUnitChannelFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualDaqUnitChannel(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelFields fields;
        fields = new DaqUnitChannelFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualDaqUnitChannel(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setDaqUnitChannelFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelFields fields;
        fields = new DaqUnitChannelFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setDaqUnitChannelFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addSensor(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorFields fields;
        fields = new SensorFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addSensor(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addSensorList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorFields[] fieldsList;
        fieldsList = SensorFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addSensorList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensor(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorPrx __ret = __obj.getSensor(id, __current);
        SensorPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getSensorIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorPrx[] __ret = __obj.getSensorList(ids, __current);
        SensorListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorFields __ret = __obj.getSensorFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorFields[] __ret = __obj.getSensorFieldsList(ids, __current);
        SensorFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualSensor(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorFields fields;
        fields = new SensorFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualSensor(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setSensorFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorFields fields;
        fields = new SensorFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setSensorFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerFields fields;
        fields = new TransducerFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addTransducer(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducerList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerFields[] fieldsList;
        fieldsList = TransducerFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addTransducerList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerPrx __ret = __obj.getTransducer(id, __current);
        TransducerPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getTransducerIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerPrx[] __ret = __obj.getTransducerList(ids, __current);
        TransducerListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerFields __ret = __obj.getTransducerFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerFields[] __ret = __obj.getTransducerFieldsList(ids, __current);
        TransducerFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualTransducer(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerFields fields;
        fields = new TransducerFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualTransducer(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setTransducerFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerFields fields;
        fields = new TransducerFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setTransducerFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addExperiment(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentFields fields;
        fields = new ExperimentFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addExperiment(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addExperimentList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentFields[] fieldsList;
        fieldsList = ExperimentFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addExperimentList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperiment(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentPrx __ret = __obj.getExperiment(id, __current);
        ExperimentPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getExperimentIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentPrx[] __ret = __obj.getExperimentList(ids, __current);
        ExperimentListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentFields __ret = __obj.getExperimentFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentFields[] __ret = __obj.getExperimentFieldsList(ids, __current);
        ExperimentFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualExperiment(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentFields fields;
        fields = new ExperimentFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualExperiment(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setExperimentFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentFields fields;
        fields = new ExperimentFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setExperimentFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addCycle(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CycleFields fields;
        fields = new CycleFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addCycle(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addCycleList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CycleFields[] fieldsList;
        fieldsList = CycleFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addCycleList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getCycle(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        CyclePrx __ret = __obj.getCycle(id, __current);
        CyclePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getCycleIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getCycleIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getCycleList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        CyclePrx[] __ret = __obj.getCycleList(ids, __current);
        CycleListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getCycleFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        CycleFields __ret = __obj.getCycleFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getCycleFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        CycleFields[] __ret = __obj.getCycleFieldsList(ids, __current);
        CycleFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualCycle(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CycleFields fields;
        fields = new CycleFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualCycle(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setCycleFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CycleFields fields;
        fields = new CycleFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setCycleFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addSensorTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorTimeDataFields fields;
        fields = new SensorTimeDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addSensorTimeData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addSensorTimeDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorTimeDataFields[] fieldsList;
        fieldsList = SensorTimeDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addSensorTimeDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorTimeDataPrx __ret = __obj.getSensorTimeData(id, __current);
        SensorTimeDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorTimeDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getSensorTimeDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorTimeDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorTimeDataPrx[] __ret = __obj.getSensorTimeDataList(ids, __current);
        SensorTimeDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorTimeDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorTimeDataFields __ret = __obj.getSensorTimeDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensorTimeDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorTimeDataFields[] __ret = __obj.getSensorTimeDataFieldsList(ids, __current);
        SensorTimeDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualSensorTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorTimeDataFields fields;
        fields = new SensorTimeDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualSensorTimeData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setSensorTimeDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        SensorTimeDataFields fields;
        fields = new SensorTimeDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setSensorTimeDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducerTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerTimeDataFields fields;
        fields = new TransducerTimeDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addTransducerTimeData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducerTimeDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerTimeDataFields[] fieldsList;
        fieldsList = TransducerTimeDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addTransducerTimeDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerTimeDataPrx __ret = __obj.getTransducerTimeData(id, __current);
        TransducerTimeDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerTimeDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getTransducerTimeDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerTimeDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerTimeDataPrx[] __ret = __obj.getTransducerTimeDataList(ids, __current);
        TransducerTimeDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerTimeDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerTimeDataFields __ret = __obj.getTransducerTimeDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerTimeDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerTimeDataFields[] __ret = __obj.getTransducerTimeDataFieldsList(ids, __current);
        TransducerTimeDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualTransducerTimeData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerTimeDataFields fields;
        fields = new TransducerTimeDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualTransducerTimeData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setTransducerTimeDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerTimeDataFields fields;
        fields = new TransducerTimeDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setTransducerTimeDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addExperimentStructureData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentStructureDataFields fields;
        fields = new ExperimentStructureDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addExperimentStructureData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addExperimentStructureDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentStructureDataFields[] fieldsList;
        fieldsList = ExperimentStructureDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addExperimentStructureDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentStructureData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentStructureDataPrx __ret = __obj.getExperimentStructureData(id, __current);
        ExperimentStructureDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentStructureDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getExperimentStructureDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentStructureDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentStructureDataPrx[] __ret = __obj.getExperimentStructureDataList(ids, __current);
        ExperimentStructureDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentStructureDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentStructureDataFields __ret = __obj.getExperimentStructureDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getExperimentStructureDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        ExperimentStructureDataFields[] __ret = __obj.getExperimentStructureDataFieldsList(ids, __current);
        ExperimentStructureDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualExperimentStructureData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentStructureDataFields fields;
        fields = new ExperimentStructureDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualExperimentStructureData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setExperimentStructureDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ExperimentStructureDataFields fields;
        fields = new ExperimentStructureDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setExperimentStructureDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducerCycleData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerCycleDataFields fields;
        fields = new TransducerCycleDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addTransducerCycleData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addTransducerCycleDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerCycleDataFields[] fieldsList;
        fieldsList = TransducerCycleDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addTransducerCycleDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerCycleData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerCycleDataPrx __ret = __obj.getTransducerCycleData(id, __current);
        TransducerCycleDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerCycleDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getTransducerCycleDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerCycleDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerCycleDataPrx[] __ret = __obj.getTransducerCycleDataList(ids, __current);
        TransducerCycleDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerCycleDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerCycleDataFields __ret = __obj.getTransducerCycleDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTransducerCycleDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TransducerCycleDataFields[] __ret = __obj.getTransducerCycleDataFieldsList(ids, __current);
        TransducerCycleDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualTransducerCycleData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerCycleDataFields fields;
        fields = new TransducerCycleDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualTransducerCycleData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setTransducerCycleDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TransducerCycleDataFields fields;
        fields = new TransducerCycleDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setTransducerCycleDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addMappingMatrix(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        MappingMatrixFields fields;
        fields = new MappingMatrixFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addMappingMatrix(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addMappingMatrixList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        MappingMatrixFields[] fieldsList;
        fieldsList = MappingMatrixFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addMappingMatrixList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getMappingMatrix(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        MappingMatrixPrx __ret = __obj.getMappingMatrix(id, __current);
        MappingMatrixPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getMappingMatrixIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getMappingMatrixIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getMappingMatrixList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        MappingMatrixPrx[] __ret = __obj.getMappingMatrixList(ids, __current);
        MappingMatrixListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getMappingMatrixFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        MappingMatrixFields __ret = __obj.getMappingMatrixFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getMappingMatrixFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        MappingMatrixFields[] __ret = __obj.getMappingMatrixFieldsList(ids, __current);
        MappingMatrixFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualMappingMatrix(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        MappingMatrixFields fields;
        fields = new MappingMatrixFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualMappingMatrix(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setMappingMatrixFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        MappingMatrixFields fields;
        fields = new MappingMatrixFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setMappingMatrixFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnitChannelData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelDataFields fields;
        fields = new DaqUnitChannelDataFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addDaqUnitChannelData(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addDaqUnitChannelDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelDataFields[] fieldsList;
        fieldsList = DaqUnitChannelDataFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addDaqUnitChannelDataList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelDataPrx __ret = __obj.getDaqUnitChannelData(id, __current);
        DaqUnitChannelDataPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelDataIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getDaqUnitChannelDataIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelDataList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelDataPrx[] __ret = __obj.getDaqUnitChannelDataList(ids, __current);
        DaqUnitChannelDataListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelDataFields __ret = __obj.getDaqUnitChannelDataFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDaqUnitChannelDataFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelDataFields[] __ret = __obj.getDaqUnitChannelDataFieldsList(ids, __current);
        DaqUnitChannelDataFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualDaqUnitChannelData(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelDataFields fields;
        fields = new DaqUnitChannelDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualDaqUnitChannelData(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setDaqUnitChannelDataFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelDataFields fields;
        fields = new DaqUnitChannelDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setDaqUnitChannelDataFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addAccelMeas(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AccelMeasFields fields;
        fields = new AccelMeasFields();
        fields.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.addAccelMeas(fields, __current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addAccelMeasList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AccelMeasFields[] fieldsList;
        fieldsList = AccelMeasFieldsListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.addAccelMeasList(fieldsList, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAccelMeas(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        AccelMeasPrx __ret = __obj.getAccelMeas(id, __current);
        AccelMeasPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAccelMeasIds(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getAccelMeasIds(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAccelMeasList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        AccelMeasPrx[] __ret = __obj.getAccelMeasList(ids, __current);
        AccelMeasListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAccelMeasFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long id;
        id = __is.readLong();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        AccelMeasFields __ret = __obj.getAccelMeasFields(id, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAccelMeasFieldsList(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] ids;
        ids = IdListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        AccelMeasFields[] __ret = __obj.getAccelMeasFieldsList(ids, __current);
        AccelMeasFieldsListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___findEqualAccelMeas(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AccelMeasFields fields;
        fields = new AccelMeasFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.findEqualAccelMeas(fields, fieldNames, __current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setAccelMeasFields(SenStoreMngr __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AccelMeasFields fields;
        fields = new AccelMeasFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setAccelMeasFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "addAccelMeas",
        "addAccelMeasList",
        "addCycle",
        "addCycleList",
        "addDaqUnit",
        "addDaqUnitChannel",
        "addDaqUnitChannelData",
        "addDaqUnitChannelDataList",
        "addDaqUnitChannelList",
        "addDaqUnitList",
        "addExperiment",
        "addExperimentList",
        "addExperimentStructureData",
        "addExperimentStructureDataList",
        "addFEMAppliedConcentratedLoad",
        "addFEMAppliedConcentratedLoadList",
        "addFEMAppliedDisplacement",
        "addFEMAppliedDisplacementList",
        "addFEMAppliedLoads",
        "addFEMAppliedLoadsList",
        "addFEMAppliedTemperature",
        "addFEMAppliedTemperatureList",
        "addFEMAxesNode",
        "addFEMAxesNodeList",
        "addFEMBeam",
        "addFEMBeamList",
        "addFEMBeamLoad",
        "addFEMBeamLoadList",
        "addFEMBeamNode",
        "addFEMBeamNodeList",
        "addFEMBoundary",
        "addFEMBoundaryList",
        "addFEMConstraintCoef",
        "addFEMConstraintCoefList",
        "addFEMConstraints",
        "addFEMConstraintsList",
        "addFEMContactGroup3",
        "addFEMContactGroup3List",
        "addFEMContactPairs",
        "addFEMContactPairsList",
        "addFEMContactSurface",
        "addFEMContactSurfaceList",
        "addFEMCoordSystem",
        "addFEMCoordSystemList",
        "addFEMCrossSections",
        "addFEMCrossSectionsList",
        "addFEMCurvMomentData",
        "addFEMCurvMomentDataList",
        "addFEMDamping",
        "addFEMDampingList",
        "addFEMDof",
        "addFEMDofList",
        "addFEMElasticMaterial",
        "addFEMElasticMaterialList",
        "addFEMEndreleases",
        "addFEMEndreleasesList",
        "addFEMForceStrainData",
        "addFEMForceStrainDataList",
        "addFEMGeneral",
        "addFEMGeneralGroup",
        "addFEMGeneralGroupList",
        "addFEMGeneralList",
        "addFEMGeneralNode",
        "addFEMGeneralNodeList",
        "addFEMGroundMotionRecord",
        "addFEMGroundMotionRecordList",
        "addFEMGroup",
        "addFEMGroupList",
        "addFEMInitialTemperature",
        "addFEMInitialTemperatureList",
        "addFEMIsoBeam",
        "addFEMIsoBeamGroup",
        "addFEMIsoBeamGroupList",
        "addFEMIsoBeamList",
        "addFEMLink",
        "addFEMLinkList",
        "addFEMLoadMassProportional",
        "addFEMLoadMassProportionalList",
        "addFEMMCForceData",
        "addFEMMCForceDataList",
        "addFEMMCrigidities",
        "addFEMMCrigiditiesList",
        "addFEMMTForceData",
        "addFEMMTForceDataList",
        "addFEMMaterial",
        "addFEMMaterialList",
        "addFEMMatrices",
        "addFEMMatricesList",
        "addFEMMatrixData",
        "addFEMMatrixDataList",
        "addFEMMatrixSets",
        "addFEMMatrixSetsList",
        "addFEMNKDisplForce",
        "addFEMNKDisplForceList",
        "addFEMNLElasticMaterials",
        "addFEMNLElasticMaterialsList",
        "addFEMNLElasticStrainStress",
        "addFEMNLElasticStrainStressList",
        "addFEMNMTimeMass",
        "addFEMNMTimeMassList",
        "addFEMNTNContact",
        "addFEMNTNContactList",
        "addFEMNodalMass",
        "addFEMNodalMassList",
        "addFEMNode",
        "addFEMNodeList",
        "addFEMOrthotropicMaterial",
        "addFEMOrthotropicMaterialList",
        "addFEMPlasticBilinearMaterial",
        "addFEMPlasticBilinearMaterialList",
        "addFEMPlasticMlMaterials",
        "addFEMPlasticMlMaterialsList",
        "addFEMPlasticStrainStress",
        "addFEMPlasticStrainStressList",
        "addFEMPlate",
        "addFEMPlateGroup",
        "addFEMPlateGroupList",
        "addFEMPlateList",
        "addFEMPoints",
        "addFEMPointsList",
        "addFEMProperties",
        "addFEMPropertiesList",
        "addFEMPropertysets",
        "addFEMPropertysetsList",
        "addFEMSectionBox",
        "addFEMSectionBoxList",
        "addFEMSectionI",
        "addFEMSectionIList",
        "addFEMSectionPipe",
        "addFEMSectionPipeList",
        "addFEMSectionProp",
        "addFEMSectionPropList",
        "addFEMSectionRect",
        "addFEMSectionRectList",
        "addFEMShell",
        "addFEMShellAxesOrtho",
        "addFEMShellAxesOrthoData",
        "addFEMShellAxesOrthoDataList",
        "addFEMShellAxesOrthoList",
        "addFEMShellDOF",
        "addFEMShellDOFList",
        "addFEMShellGroup",
        "addFEMShellGroupList",
        "addFEMShellLayer",
        "addFEMShellLayerList",
        "addFEMShellList",
        "addFEMShellPressure",
        "addFEMShellPressureList",
        "addFEMSkewDOF",
        "addFEMSkewDOFList",
        "addFEMSkewSysAngles",
        "addFEMSkewSysAnglesList",
        "addFEMSkeySysNode",
        "addFEMSkeySysNodeList",
        "addFEMSpring",
        "addFEMSpringGroup",
        "addFEMSpringGroupList",
        "addFEMSpringList",
        "addFEMStrLines",
        "addFEMStrLinesList",
        "addFEMThermoIsoData",
        "addFEMThermoIsoDataList",
        "addFEMThermoIsoMaterials",
        "addFEMThermoIsoMaterialsList",
        "addFEMThermoOrthData",
        "addFEMThermoOrthDataList",
        "addFEMThermoOrthMaterials",
        "addFEMThermoOrthMaterialsList",
        "addFEMThreeDSolid",
        "addFEMThreeDSolidGroup",
        "addFEMThreeDSolidGroupList",
        "addFEMThreeDSolidList",
        "addFEMTimeFunctionData",
        "addFEMTimeFunctionDataList",
        "addFEMTimeFunctions",
        "addFEMTimeFunctionsList",
        "addFEMTruss",
        "addFEMTrussGroup",
        "addFEMTrussGroupList",
        "addFEMTrussList",
        "addFEMTwistMomentData",
        "addFEMTwistMomentDataList",
        "addFEMTwoDSolid",
        "addFEMTwoDSolidGroup",
        "addFEMTwoDSolidGroupList",
        "addFEMTwoDSolidList",
        "addMappingMatrix",
        "addMappingMatrixList",
        "addSensor",
        "addSensorList",
        "addSensorTimeData",
        "addSensorTimeDataList",
        "addStructure",
        "addStructureList",
        "addTransducer",
        "addTransducerCycleData",
        "addTransducerCycleDataList",
        "addTransducerList",
        "addTransducerTimeData",
        "addTransducerTimeDataList",
        "findEqualAccelMeas",
        "findEqualCycle",
        "findEqualDaqUnit",
        "findEqualDaqUnitChannel",
        "findEqualDaqUnitChannelData",
        "findEqualExperiment",
        "findEqualExperimentStructureData",
        "findEqualFEMAppliedConcentratedLoad",
        "findEqualFEMAppliedDisplacement",
        "findEqualFEMAppliedLoads",
        "findEqualFEMAppliedTemperature",
        "findEqualFEMAxesNode",
        "findEqualFEMBeam",
        "findEqualFEMBeamLoad",
        "findEqualFEMBeamNode",
        "findEqualFEMBoundary",
        "findEqualFEMConstraintCoef",
        "findEqualFEMConstraints",
        "findEqualFEMContactGroup3",
        "findEqualFEMContactPairs",
        "findEqualFEMContactSurface",
        "findEqualFEMCoordSystem",
        "findEqualFEMCrossSections",
        "findEqualFEMCurvMomentData",
        "findEqualFEMDamping",
        "findEqualFEMDof",
        "findEqualFEMElasticMaterial",
        "findEqualFEMEndreleases",
        "findEqualFEMForceStrainData",
        "findEqualFEMGeneral",
        "findEqualFEMGeneralGroup",
        "findEqualFEMGeneralNode",
        "findEqualFEMGroundMotionRecord",
        "findEqualFEMGroup",
        "findEqualFEMInitialTemperature",
        "findEqualFEMIsoBeam",
        "findEqualFEMIsoBeamGroup",
        "findEqualFEMLink",
        "findEqualFEMLoadMassProportional",
        "findEqualFEMMCForceData",
        "findEqualFEMMCrigidities",
        "findEqualFEMMTForceData",
        "findEqualFEMMaterial",
        "findEqualFEMMatrices",
        "findEqualFEMMatrixData",
        "findEqualFEMMatrixSets",
        "findEqualFEMNKDisplForce",
        "findEqualFEMNLElasticMaterials",
        "findEqualFEMNLElasticStrainStress",
        "findEqualFEMNMTimeMass",
        "findEqualFEMNTNContact",
        "findEqualFEMNodalMass",
        "findEqualFEMNode",
        "findEqualFEMOrthotropicMaterial",
        "findEqualFEMPlasticBilinearMaterial",
        "findEqualFEMPlasticMlMaterials",
        "findEqualFEMPlasticStrainStress",
        "findEqualFEMPlate",
        "findEqualFEMPlateGroup",
        "findEqualFEMPoints",
        "findEqualFEMProperties",
        "findEqualFEMPropertysets",
        "findEqualFEMSectionBox",
        "findEqualFEMSectionI",
        "findEqualFEMSectionPipe",
        "findEqualFEMSectionProp",
        "findEqualFEMSectionRect",
        "findEqualFEMShell",
        "findEqualFEMShellAxesOrtho",
        "findEqualFEMShellAxesOrthoData",
        "findEqualFEMShellDOF",
        "findEqualFEMShellGroup",
        "findEqualFEMShellLayer",
        "findEqualFEMShellPressure",
        "findEqualFEMSkewDOF",
        "findEqualFEMSkewSysAngles",
        "findEqualFEMSkeySysNode",
        "findEqualFEMSpring",
        "findEqualFEMSpringGroup",
        "findEqualFEMStrLines",
        "findEqualFEMThermoIsoData",
        "findEqualFEMThermoIsoMaterials",
        "findEqualFEMThermoOrthData",
        "findEqualFEMThermoOrthMaterials",
        "findEqualFEMThreeDSolid",
        "findEqualFEMThreeDSolidGroup",
        "findEqualFEMTimeFunctionData",
        "findEqualFEMTimeFunctions",
        "findEqualFEMTruss",
        "findEqualFEMTrussGroup",
        "findEqualFEMTwistMomentData",
        "findEqualFEMTwoDSolid",
        "findEqualFEMTwoDSolidGroup",
        "findEqualMappingMatrix",
        "findEqualSensor",
        "findEqualSensorTimeData",
        "findEqualStructure",
        "findEqualTransducer",
        "findEqualTransducerCycleData",
        "findEqualTransducerTimeData",
        "getAccelMeas",
        "getAccelMeasFields",
        "getAccelMeasFieldsList",
        "getAccelMeasIds",
        "getAccelMeasList",
        "getCycle",
        "getCycleFields",
        "getCycleFieldsList",
        "getCycleIds",
        "getCycleList",
        "getDaqUnit",
        "getDaqUnitChannel",
        "getDaqUnitChannelData",
        "getDaqUnitChannelDataFields",
        "getDaqUnitChannelDataFieldsList",
        "getDaqUnitChannelDataIds",
        "getDaqUnitChannelDataList",
        "getDaqUnitChannelFields",
        "getDaqUnitChannelFieldsList",
        "getDaqUnitChannelIds",
        "getDaqUnitChannelList",
        "getDaqUnitFields",
        "getDaqUnitFieldsList",
        "getDaqUnitIds",
        "getDaqUnitList",
        "getExperiment",
        "getExperimentFields",
        "getExperimentFieldsList",
        "getExperimentIds",
        "getExperimentList",
        "getExperimentStructureData",
        "getExperimentStructureDataFields",
        "getExperimentStructureDataFieldsList",
        "getExperimentStructureDataIds",
        "getExperimentStructureDataList",
        "getFEMAppliedConcentratedLoad",
        "getFEMAppliedConcentratedLoadFields",
        "getFEMAppliedConcentratedLoadFieldsList",
        "getFEMAppliedConcentratedLoadIds",
        "getFEMAppliedConcentratedLoadList",
        "getFEMAppliedDisplacement",
        "getFEMAppliedDisplacementFields",
        "getFEMAppliedDisplacementFieldsList",
        "getFEMAppliedDisplacementIds",
        "getFEMAppliedDisplacementList",
        "getFEMAppliedLoads",
        "getFEMAppliedLoadsFields",
        "getFEMAppliedLoadsFieldsList",
        "getFEMAppliedLoadsIds",
        "getFEMAppliedLoadsList",
        "getFEMAppliedTemperature",
        "getFEMAppliedTemperatureFields",
        "getFEMAppliedTemperatureFieldsList",
        "getFEMAppliedTemperatureIds",
        "getFEMAppliedTemperatureList",
        "getFEMAxesNode",
        "getFEMAxesNodeFields",
        "getFEMAxesNodeFieldsList",
        "getFEMAxesNodeIds",
        "getFEMAxesNodeList",
        "getFEMBeam",
        "getFEMBeamFields",
        "getFEMBeamFieldsList",
        "getFEMBeamIds",
        "getFEMBeamList",
        "getFEMBeamLoad",
        "getFEMBeamLoadFields",
        "getFEMBeamLoadFieldsList",
        "getFEMBeamLoadIds",
        "getFEMBeamLoadList",
        "getFEMBeamNode",
        "getFEMBeamNodeFields",
        "getFEMBeamNodeFieldsList",
        "getFEMBeamNodeIds",
        "getFEMBeamNodeList",
        "getFEMBoundary",
        "getFEMBoundaryFields",
        "getFEMBoundaryFieldsList",
        "getFEMBoundaryIds",
        "getFEMBoundaryList",
        "getFEMConstraintCoef",
        "getFEMConstraintCoefFields",
        "getFEMConstraintCoefFieldsList",
        "getFEMConstraintCoefIds",
        "getFEMConstraintCoefList",
        "getFEMConstraints",
        "getFEMConstraintsFields",
        "getFEMConstraintsFieldsList",
        "getFEMConstraintsIds",
        "getFEMConstraintsList",
        "getFEMContactGroup3",
        "getFEMContactGroup3Fields",
        "getFEMContactGroup3FieldsList",
        "getFEMContactGroup3Ids",
        "getFEMContactGroup3List",
        "getFEMContactPairs",
        "getFEMContactPairsFields",
        "getFEMContactPairsFieldsList",
        "getFEMContactPairsIds",
        "getFEMContactPairsList",
        "getFEMContactSurface",
        "getFEMContactSurfaceFields",
        "getFEMContactSurfaceFieldsList",
        "getFEMContactSurfaceIds",
        "getFEMContactSurfaceList",
        "getFEMCoordSystem",
        "getFEMCoordSystemFields",
        "getFEMCoordSystemFieldsList",
        "getFEMCoordSystemIds",
        "getFEMCoordSystemList",
        "getFEMCrossSections",
        "getFEMCrossSectionsFields",
        "getFEMCrossSectionsFieldsList",
        "getFEMCrossSectionsIds",
        "getFEMCrossSectionsList",
        "getFEMCurvMomentData",
        "getFEMCurvMomentDataFields",
        "getFEMCurvMomentDataFieldsList",
        "getFEMCurvMomentDataIds",
        "getFEMCurvMomentDataList",
        "getFEMDamping",
        "getFEMDampingFields",
        "getFEMDampingFieldsList",
        "getFEMDampingIds",
        "getFEMDampingList",
        "getFEMDof",
        "getFEMDofFields",
        "getFEMDofFieldsList",
        "getFEMDofIds",
        "getFEMDofList",
        "getFEMElasticMaterial",
        "getFEMElasticMaterialFields",
        "getFEMElasticMaterialFieldsList",
        "getFEMElasticMaterialIds",
        "getFEMElasticMaterialList",
        "getFEMEndreleases",
        "getFEMEndreleasesFields",
        "getFEMEndreleasesFieldsList",
        "getFEMEndreleasesIds",
        "getFEMEndreleasesList",
        "getFEMForceStrainData",
        "getFEMForceStrainDataFields",
        "getFEMForceStrainDataFieldsList",
        "getFEMForceStrainDataIds",
        "getFEMForceStrainDataList",
        "getFEMGeneral",
        "getFEMGeneralFields",
        "getFEMGeneralFieldsList",
        "getFEMGeneralGroup",
        "getFEMGeneralGroupFields",
        "getFEMGeneralGroupFieldsList",
        "getFEMGeneralGroupIds",
        "getFEMGeneralGroupList",
        "getFEMGeneralIds",
        "getFEMGeneralList",
        "getFEMGeneralNode",
        "getFEMGeneralNodeFields",
        "getFEMGeneralNodeFieldsList",
        "getFEMGeneralNodeIds",
        "getFEMGeneralNodeList",
        "getFEMGroundMotionRecord",
        "getFEMGroundMotionRecordFields",
        "getFEMGroundMotionRecordFieldsList",
        "getFEMGroundMotionRecordIds",
        "getFEMGroundMotionRecordList",
        "getFEMGroup",
        "getFEMGroupFields",
        "getFEMGroupFieldsList",
        "getFEMGroupIds",
        "getFEMGroupList",
        "getFEMInitialTemperature",
        "getFEMInitialTemperatureFields",
        "getFEMInitialTemperatureFieldsList",
        "getFEMInitialTemperatureIds",
        "getFEMInitialTemperatureList",
        "getFEMIsoBeam",
        "getFEMIsoBeamFields",
        "getFEMIsoBeamFieldsList",
        "getFEMIsoBeamGroup",
        "getFEMIsoBeamGroupFields",
        "getFEMIsoBeamGroupFieldsList",
        "getFEMIsoBeamGroupIds",
        "getFEMIsoBeamGroupList",
        "getFEMIsoBeamIds",
        "getFEMIsoBeamList",
        "getFEMLink",
        "getFEMLinkFields",
        "getFEMLinkFieldsList",
        "getFEMLinkIds",
        "getFEMLinkList",
        "getFEMLoadMassProportional",
        "getFEMLoadMassProportionalFields",
        "getFEMLoadMassProportionalFieldsList",
        "getFEMLoadMassProportionalIds",
        "getFEMLoadMassProportionalList",
        "getFEMMCForceData",
        "getFEMMCForceDataFields",
        "getFEMMCForceDataFieldsList",
        "getFEMMCForceDataIds",
        "getFEMMCForceDataList",
        "getFEMMCrigidities",
        "getFEMMCrigiditiesFields",
        "getFEMMCrigiditiesFieldsList",
        "getFEMMCrigiditiesIds",
        "getFEMMCrigiditiesList",
        "getFEMMTForceData",
        "getFEMMTForceDataFields",
        "getFEMMTForceDataFieldsList",
        "getFEMMTForceDataIds",
        "getFEMMTForceDataList",
        "getFEMMaterial",
        "getFEMMaterialFields",
        "getFEMMaterialFieldsList",
        "getFEMMaterialIds",
        "getFEMMaterialList",
        "getFEMMatrices",
        "getFEMMatricesFields",
        "getFEMMatricesFieldsList",
        "getFEMMatricesIds",
        "getFEMMatricesList",
        "getFEMMatrixData",
        "getFEMMatrixDataFields",
        "getFEMMatrixDataFieldsList",
        "getFEMMatrixDataIds",
        "getFEMMatrixDataList",
        "getFEMMatrixSets",
        "getFEMMatrixSetsFields",
        "getFEMMatrixSetsFieldsList",
        "getFEMMatrixSetsIds",
        "getFEMMatrixSetsList",
        "getFEMNKDisplForce",
        "getFEMNKDisplForceFields",
        "getFEMNKDisplForceFieldsList",
        "getFEMNKDisplForceIds",
        "getFEMNKDisplForceList",
        "getFEMNLElasticMaterials",
        "getFEMNLElasticMaterialsFields",
        "getFEMNLElasticMaterialsFieldsList",
        "getFEMNLElasticMaterialsIds",
        "getFEMNLElasticMaterialsList",
        "getFEMNLElasticStrainStress",
        "getFEMNLElasticStrainStressFields",
        "getFEMNLElasticStrainStressFieldsList",
        "getFEMNLElasticStrainStressIds",
        "getFEMNLElasticStrainStressList",
        "getFEMNMTimeMass",
        "getFEMNMTimeMassFields",
        "getFEMNMTimeMassFieldsList",
        "getFEMNMTimeMassIds",
        "getFEMNMTimeMassList",
        "getFEMNTNContact",
        "getFEMNTNContactFields",
        "getFEMNTNContactFieldsList",
        "getFEMNTNContactIds",
        "getFEMNTNContactList",
        "getFEMNodalMass",
        "getFEMNodalMassFields",
        "getFEMNodalMassFieldsList",
        "getFEMNodalMassIds",
        "getFEMNodalMassList",
        "getFEMNode",
        "getFEMNodeFields",
        "getFEMNodeFieldsList",
        "getFEMNodeIds",
        "getFEMNodeList",
        "getFEMOrthotropicMaterial",
        "getFEMOrthotropicMaterialFields",
        "getFEMOrthotropicMaterialFieldsList",
        "getFEMOrthotropicMaterialIds",
        "getFEMOrthotropicMaterialList",
        "getFEMPlasticBilinearMaterial",
        "getFEMPlasticBilinearMaterialFields",
        "getFEMPlasticBilinearMaterialFieldsList",
        "getFEMPlasticBilinearMaterialIds",
        "getFEMPlasticBilinearMaterialList",
        "getFEMPlasticMlMaterials",
        "getFEMPlasticMlMaterialsFields",
        "getFEMPlasticMlMaterialsFieldsList",
        "getFEMPlasticMlMaterialsIds",
        "getFEMPlasticMlMaterialsList",
        "getFEMPlasticStrainStress",
        "getFEMPlasticStrainStressFields",
        "getFEMPlasticStrainStressFieldsList",
        "getFEMPlasticStrainStressIds",
        "getFEMPlasticStrainStressList",
        "getFEMPlate",
        "getFEMPlateFields",
        "getFEMPlateFieldsList",
        "getFEMPlateGroup",
        "getFEMPlateGroupFields",
        "getFEMPlateGroupFieldsList",
        "getFEMPlateGroupIds",
        "getFEMPlateGroupList",
        "getFEMPlateIds",
        "getFEMPlateList",
        "getFEMPoints",
        "getFEMPointsFields",
        "getFEMPointsFieldsList",
        "getFEMPointsIds",
        "getFEMPointsList",
        "getFEMProperties",
        "getFEMPropertiesFields",
        "getFEMPropertiesFieldsList",
        "getFEMPropertiesIds",
        "getFEMPropertiesList",
        "getFEMPropertysets",
        "getFEMPropertysetsFields",
        "getFEMPropertysetsFieldsList",
        "getFEMPropertysetsIds",
        "getFEMPropertysetsList",
        "getFEMSectionBox",
        "getFEMSectionBoxFields",
        "getFEMSectionBoxFieldsList",
        "getFEMSectionBoxIds",
        "getFEMSectionBoxList",
        "getFEMSectionI",
        "getFEMSectionIFields",
        "getFEMSectionIFieldsList",
        "getFEMSectionIIds",
        "getFEMSectionIList",
        "getFEMSectionPipe",
        "getFEMSectionPipeFields",
        "getFEMSectionPipeFieldsList",
        "getFEMSectionPipeIds",
        "getFEMSectionPipeList",
        "getFEMSectionProp",
        "getFEMSectionPropFields",
        "getFEMSectionPropFieldsList",
        "getFEMSectionPropIds",
        "getFEMSectionPropList",
        "getFEMSectionRect",
        "getFEMSectionRectFields",
        "getFEMSectionRectFieldsList",
        "getFEMSectionRectIds",
        "getFEMSectionRectList",
        "getFEMShell",
        "getFEMShellAxesOrtho",
        "getFEMShellAxesOrthoData",
        "getFEMShellAxesOrthoDataFields",
        "getFEMShellAxesOrthoDataFieldsList",
        "getFEMShellAxesOrthoDataIds",
        "getFEMShellAxesOrthoDataList",
        "getFEMShellAxesOrthoFields",
        "getFEMShellAxesOrthoFieldsList",
        "getFEMShellAxesOrthoIds",
        "getFEMShellAxesOrthoList",
        "getFEMShellDOF",
        "getFEMShellDOFFields",
        "getFEMShellDOFFieldsList",
        "getFEMShellDOFIds",
        "getFEMShellDOFList",
        "getFEMShellFields",
        "getFEMShellFieldsList",
        "getFEMShellGroup",
        "getFEMShellGroupFields",
        "getFEMShellGroupFieldsList",
        "getFEMShellGroupIds",
        "getFEMShellGroupList",
        "getFEMShellIds",
        "getFEMShellLayer",
        "getFEMShellLayerFields",
        "getFEMShellLayerFieldsList",
        "getFEMShellLayerIds",
        "getFEMShellLayerList",
        "getFEMShellList",
        "getFEMShellPressure",
        "getFEMShellPressureFields",
        "getFEMShellPressureFieldsList",
        "getFEMShellPressureIds",
        "getFEMShellPressureList",
        "getFEMSkewDOF",
        "getFEMSkewDOFFields",
        "getFEMSkewDOFFieldsList",
        "getFEMSkewDOFIds",
        "getFEMSkewDOFList",
        "getFEMSkewSysAngles",
        "getFEMSkewSysAnglesFields",
        "getFEMSkewSysAnglesFieldsList",
        "getFEMSkewSysAnglesIds",
        "getFEMSkewSysAnglesList",
        "getFEMSkeySysNode",
        "getFEMSkeySysNodeFields",
        "getFEMSkeySysNodeFieldsList",
        "getFEMSkeySysNodeIds",
        "getFEMSkeySysNodeList",
        "getFEMSpring",
        "getFEMSpringFields",
        "getFEMSpringFieldsList",
        "getFEMSpringGroup",
        "getFEMSpringGroupFields",
        "getFEMSpringGroupFieldsList",
        "getFEMSpringGroupIds",
        "getFEMSpringGroupList",
        "getFEMSpringIds",
        "getFEMSpringList",
        "getFEMStrLines",
        "getFEMStrLinesFields",
        "getFEMStrLinesFieldsList",
        "getFEMStrLinesIds",
        "getFEMStrLinesList",
        "getFEMThermoIsoData",
        "getFEMThermoIsoDataFields",
        "getFEMThermoIsoDataFieldsList",
        "getFEMThermoIsoDataIds",
        "getFEMThermoIsoDataList",
        "getFEMThermoIsoMaterials",
        "getFEMThermoIsoMaterialsFields",
        "getFEMThermoIsoMaterialsFieldsList",
        "getFEMThermoIsoMaterialsIds",
        "getFEMThermoIsoMaterialsList",
        "getFEMThermoOrthData",
        "getFEMThermoOrthDataFields",
        "getFEMThermoOrthDataFieldsList",
        "getFEMThermoOrthDataIds",
        "getFEMThermoOrthDataList",
        "getFEMThermoOrthMaterials",
        "getFEMThermoOrthMaterialsFields",
        "getFEMThermoOrthMaterialsFieldsList",
        "getFEMThermoOrthMaterialsIds",
        "getFEMThermoOrthMaterialsList",
        "getFEMThreeDSolid",
        "getFEMThreeDSolidFields",
        "getFEMThreeDSolidFieldsList",
        "getFEMThreeDSolidGroup",
        "getFEMThreeDSolidGroupFields",
        "getFEMThreeDSolidGroupFieldsList",
        "getFEMThreeDSolidGroupIds",
        "getFEMThreeDSolidGroupList",
        "getFEMThreeDSolidIds",
        "getFEMThreeDSolidList",
        "getFEMTimeFunctionData",
        "getFEMTimeFunctionDataFields",
        "getFEMTimeFunctionDataFieldsList",
        "getFEMTimeFunctionDataIds",
        "getFEMTimeFunctionDataList",
        "getFEMTimeFunctions",
        "getFEMTimeFunctionsFields",
        "getFEMTimeFunctionsFieldsList",
        "getFEMTimeFunctionsIds",
        "getFEMTimeFunctionsList",
        "getFEMTruss",
        "getFEMTrussFields",
        "getFEMTrussFieldsList",
        "getFEMTrussGroup",
        "getFEMTrussGroupFields",
        "getFEMTrussGroupFieldsList",
        "getFEMTrussGroupIds",
        "getFEMTrussGroupList",
        "getFEMTrussIds",
        "getFEMTrussList",
        "getFEMTwistMomentData",
        "getFEMTwistMomentDataFields",
        "getFEMTwistMomentDataFieldsList",
        "getFEMTwistMomentDataIds",
        "getFEMTwistMomentDataList",
        "getFEMTwoDSolid",
        "getFEMTwoDSolidFields",
        "getFEMTwoDSolidFieldsList",
        "getFEMTwoDSolidGroup",
        "getFEMTwoDSolidGroupFields",
        "getFEMTwoDSolidGroupFieldsList",
        "getFEMTwoDSolidGroupIds",
        "getFEMTwoDSolidGroupList",
        "getFEMTwoDSolidIds",
        "getFEMTwoDSolidList",
        "getMappingMatrix",
        "getMappingMatrixFields",
        "getMappingMatrixFieldsList",
        "getMappingMatrixIds",
        "getMappingMatrixList",
        "getSensor",
        "getSensorFields",
        "getSensorFieldsList",
        "getSensorIds",
        "getSensorList",
        "getSensorTimeData",
        "getSensorTimeDataFields",
        "getSensorTimeDataFieldsList",
        "getSensorTimeDataIds",
        "getSensorTimeDataList",
        "getStructure",
        "getStructureFields",
        "getStructureFieldsList",
        "getStructureIds",
        "getStructureList",
        "getTransducer",
        "getTransducerCycleData",
        "getTransducerCycleDataFields",
        "getTransducerCycleDataFieldsList",
        "getTransducerCycleDataIds",
        "getTransducerCycleDataList",
        "getTransducerFields",
        "getTransducerFieldsList",
        "getTransducerIds",
        "getTransducerList",
        "getTransducerTimeData",
        "getTransducerTimeDataFields",
        "getTransducerTimeDataFieldsList",
        "getTransducerTimeDataIds",
        "getTransducerTimeDataList",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setAccelMeasFields",
        "setCycleFields",
        "setDaqUnitChannelDataFields",
        "setDaqUnitChannelFields",
        "setDaqUnitFields",
        "setExperimentFields",
        "setExperimentStructureDataFields",
        "setFEMAppliedConcentratedLoadFields",
        "setFEMAppliedDisplacementFields",
        "setFEMAppliedLoadsFields",
        "setFEMAppliedTemperatureFields",
        "setFEMAxesNodeFields",
        "setFEMBeamFields",
        "setFEMBeamLoadFields",
        "setFEMBeamNodeFields",
        "setFEMBoundaryFields",
        "setFEMConstraintCoefFields",
        "setFEMConstraintsFields",
        "setFEMContactGroup3Fields",
        "setFEMContactPairsFields",
        "setFEMContactSurfaceFields",
        "setFEMCoordSystemFields",
        "setFEMCrossSectionsFields",
        "setFEMCurvMomentDataFields",
        "setFEMDampingFields",
        "setFEMDofFields",
        "setFEMElasticMaterialFields",
        "setFEMEndreleasesFields",
        "setFEMForceStrainDataFields",
        "setFEMGeneralFields",
        "setFEMGeneralGroupFields",
        "setFEMGeneralNodeFields",
        "setFEMGroundMotionRecordFields",
        "setFEMGroupFields",
        "setFEMInitialTemperatureFields",
        "setFEMIsoBeamFields",
        "setFEMIsoBeamGroupFields",
        "setFEMLinkFields",
        "setFEMLoadMassProportionalFields",
        "setFEMMCForceDataFields",
        "setFEMMCrigiditiesFields",
        "setFEMMTForceDataFields",
        "setFEMMaterialFields",
        "setFEMMatricesFields",
        "setFEMMatrixDataFields",
        "setFEMMatrixSetsFields",
        "setFEMNKDisplForceFields",
        "setFEMNLElasticMaterialsFields",
        "setFEMNLElasticStrainStressFields",
        "setFEMNMTimeMassFields",
        "setFEMNTNContactFields",
        "setFEMNodalMassFields",
        "setFEMNodeFields",
        "setFEMOrthotropicMaterialFields",
        "setFEMPlasticBilinearMaterialFields",
        "setFEMPlasticMlMaterialsFields",
        "setFEMPlasticStrainStressFields",
        "setFEMPlateFields",
        "setFEMPlateGroupFields",
        "setFEMPointsFields",
        "setFEMPropertiesFields",
        "setFEMPropertysetsFields",
        "setFEMSectionBoxFields",
        "setFEMSectionIFields",
        "setFEMSectionPipeFields",
        "setFEMSectionPropFields",
        "setFEMSectionRectFields",
        "setFEMShellAxesOrthoDataFields",
        "setFEMShellAxesOrthoFields",
        "setFEMShellDOFFields",
        "setFEMShellFields",
        "setFEMShellGroupFields",
        "setFEMShellLayerFields",
        "setFEMShellPressureFields",
        "setFEMSkewDOFFields",
        "setFEMSkewSysAnglesFields",
        "setFEMSkeySysNodeFields",
        "setFEMSpringFields",
        "setFEMSpringGroupFields",
        "setFEMStrLinesFields",
        "setFEMThermoIsoDataFields",
        "setFEMThermoIsoMaterialsFields",
        "setFEMThermoOrthDataFields",
        "setFEMThermoOrthMaterialsFields",
        "setFEMThreeDSolidFields",
        "setFEMThreeDSolidGroupFields",
        "setFEMTimeFunctionDataFields",
        "setFEMTimeFunctionsFields",
        "setFEMTrussFields",
        "setFEMTrussGroupFields",
        "setFEMTwistMomentDataFields",
        "setFEMTwoDSolidFields",
        "setFEMTwoDSolidGroupFields",
        "setMappingMatrixFields",
        "setSensorFields",
        "setSensorTimeDataFields",
        "setStructureFields",
        "setTransducerCycleDataFields",
        "setTransducerFields",
        "setTransducerTimeDataFields"
    };

    public Ice.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___addAccelMeas(this, in, __current);
            }
            case 1:
            {
                return ___addAccelMeasList(this, in, __current);
            }
            case 2:
            {
                return ___addCycle(this, in, __current);
            }
            case 3:
            {
                return ___addCycleList(this, in, __current);
            }
            case 4:
            {
                return ___addDaqUnit(this, in, __current);
            }
            case 5:
            {
                return ___addDaqUnitChannel(this, in, __current);
            }
            case 6:
            {
                return ___addDaqUnitChannelData(this, in, __current);
            }
            case 7:
            {
                return ___addDaqUnitChannelDataList(this, in, __current);
            }
            case 8:
            {
                return ___addDaqUnitChannelList(this, in, __current);
            }
            case 9:
            {
                return ___addDaqUnitList(this, in, __current);
            }
            case 10:
            {
                return ___addExperiment(this, in, __current);
            }
            case 11:
            {
                return ___addExperimentList(this, in, __current);
            }
            case 12:
            {
                return ___addExperimentStructureData(this, in, __current);
            }
            case 13:
            {
                return ___addExperimentStructureDataList(this, in, __current);
            }
            case 14:
            {
                return ___addFEMAppliedConcentratedLoad(this, in, __current);
            }
            case 15:
            {
                return ___addFEMAppliedConcentratedLoadList(this, in, __current);
            }
            case 16:
            {
                return ___addFEMAppliedDisplacement(this, in, __current);
            }
            case 17:
            {
                return ___addFEMAppliedDisplacementList(this, in, __current);
            }
            case 18:
            {
                return ___addFEMAppliedLoads(this, in, __current);
            }
            case 19:
            {
                return ___addFEMAppliedLoadsList(this, in, __current);
            }
            case 20:
            {
                return ___addFEMAppliedTemperature(this, in, __current);
            }
            case 21:
            {
                return ___addFEMAppliedTemperatureList(this, in, __current);
            }
            case 22:
            {
                return ___addFEMAxesNode(this, in, __current);
            }
            case 23:
            {
                return ___addFEMAxesNodeList(this, in, __current);
            }
            case 24:
            {
                return ___addFEMBeam(this, in, __current);
            }
            case 25:
            {
                return ___addFEMBeamList(this, in, __current);
            }
            case 26:
            {
                return ___addFEMBeamLoad(this, in, __current);
            }
            case 27:
            {
                return ___addFEMBeamLoadList(this, in, __current);
            }
            case 28:
            {
                return ___addFEMBeamNode(this, in, __current);
            }
            case 29:
            {
                return ___addFEMBeamNodeList(this, in, __current);
            }
            case 30:
            {
                return ___addFEMBoundary(this, in, __current);
            }
            case 31:
            {
                return ___addFEMBoundaryList(this, in, __current);
            }
            case 32:
            {
                return ___addFEMConstraintCoef(this, in, __current);
            }
            case 33:
            {
                return ___addFEMConstraintCoefList(this, in, __current);
            }
            case 34:
            {
                return ___addFEMConstraints(this, in, __current);
            }
            case 35:
            {
                return ___addFEMConstraintsList(this, in, __current);
            }
            case 36:
            {
                return ___addFEMContactGroup3(this, in, __current);
            }
            case 37:
            {
                return ___addFEMContactGroup3List(this, in, __current);
            }
            case 38:
            {
                return ___addFEMContactPairs(this, in, __current);
            }
            case 39:
            {
                return ___addFEMContactPairsList(this, in, __current);
            }
            case 40:
            {
                return ___addFEMContactSurface(this, in, __current);
            }
            case 41:
            {
                return ___addFEMContactSurfaceList(this, in, __current);
            }
            case 42:
            {
                return ___addFEMCoordSystem(this, in, __current);
            }
            case 43:
            {
                return ___addFEMCoordSystemList(this, in, __current);
            }
            case 44:
            {
                return ___addFEMCrossSections(this, in, __current);
            }
            case 45:
            {
                return ___addFEMCrossSectionsList(this, in, __current);
            }
            case 46:
            {
                return ___addFEMCurvMomentData(this, in, __current);
            }
            case 47:
            {
                return ___addFEMCurvMomentDataList(this, in, __current);
            }
            case 48:
            {
                return ___addFEMDamping(this, in, __current);
            }
            case 49:
            {
                return ___addFEMDampingList(this, in, __current);
            }
            case 50:
            {
                return ___addFEMDof(this, in, __current);
            }
            case 51:
            {
                return ___addFEMDofList(this, in, __current);
            }
            case 52:
            {
                return ___addFEMElasticMaterial(this, in, __current);
            }
            case 53:
            {
                return ___addFEMElasticMaterialList(this, in, __current);
            }
            case 54:
            {
                return ___addFEMEndreleases(this, in, __current);
            }
            case 55:
            {
                return ___addFEMEndreleasesList(this, in, __current);
            }
            case 56:
            {
                return ___addFEMForceStrainData(this, in, __current);
            }
            case 57:
            {
                return ___addFEMForceStrainDataList(this, in, __current);
            }
            case 58:
            {
                return ___addFEMGeneral(this, in, __current);
            }
            case 59:
            {
                return ___addFEMGeneralGroup(this, in, __current);
            }
            case 60:
            {
                return ___addFEMGeneralGroupList(this, in, __current);
            }
            case 61:
            {
                return ___addFEMGeneralList(this, in, __current);
            }
            case 62:
            {
                return ___addFEMGeneralNode(this, in, __current);
            }
            case 63:
            {
                return ___addFEMGeneralNodeList(this, in, __current);
            }
            case 64:
            {
                return ___addFEMGroundMotionRecord(this, in, __current);
            }
            case 65:
            {
                return ___addFEMGroundMotionRecordList(this, in, __current);
            }
            case 66:
            {
                return ___addFEMGroup(this, in, __current);
            }
            case 67:
            {
                return ___addFEMGroupList(this, in, __current);
            }
            case 68:
            {
                return ___addFEMInitialTemperature(this, in, __current);
            }
            case 69:
            {
                return ___addFEMInitialTemperatureList(this, in, __current);
            }
            case 70:
            {
                return ___addFEMIsoBeam(this, in, __current);
            }
            case 71:
            {
                return ___addFEMIsoBeamGroup(this, in, __current);
            }
            case 72:
            {
                return ___addFEMIsoBeamGroupList(this, in, __current);
            }
            case 73:
            {
                return ___addFEMIsoBeamList(this, in, __current);
            }
            case 74:
            {
                return ___addFEMLink(this, in, __current);
            }
            case 75:
            {
                return ___addFEMLinkList(this, in, __current);
            }
            case 76:
            {
                return ___addFEMLoadMassProportional(this, in, __current);
            }
            case 77:
            {
                return ___addFEMLoadMassProportionalList(this, in, __current);
            }
            case 78:
            {
                return ___addFEMMCForceData(this, in, __current);
            }
            case 79:
            {
                return ___addFEMMCForceDataList(this, in, __current);
            }
            case 80:
            {
                return ___addFEMMCrigidities(this, in, __current);
            }
            case 81:
            {
                return ___addFEMMCrigiditiesList(this, in, __current);
            }
            case 82:
            {
                return ___addFEMMTForceData(this, in, __current);
            }
            case 83:
            {
                return ___addFEMMTForceDataList(this, in, __current);
            }
            case 84:
            {
                return ___addFEMMaterial(this, in, __current);
            }
            case 85:
            {
                return ___addFEMMaterialList(this, in, __current);
            }
            case 86:
            {
                return ___addFEMMatrices(this, in, __current);
            }
            case 87:
            {
                return ___addFEMMatricesList(this, in, __current);
            }
            case 88:
            {
                return ___addFEMMatrixData(this, in, __current);
            }
            case 89:
            {
                return ___addFEMMatrixDataList(this, in, __current);
            }
            case 90:
            {
                return ___addFEMMatrixSets(this, in, __current);
            }
            case 91:
            {
                return ___addFEMMatrixSetsList(this, in, __current);
            }
            case 92:
            {
                return ___addFEMNKDisplForce(this, in, __current);
            }
            case 93:
            {
                return ___addFEMNKDisplForceList(this, in, __current);
            }
            case 94:
            {
                return ___addFEMNLElasticMaterials(this, in, __current);
            }
            case 95:
            {
                return ___addFEMNLElasticMaterialsList(this, in, __current);
            }
            case 96:
            {
                return ___addFEMNLElasticStrainStress(this, in, __current);
            }
            case 97:
            {
                return ___addFEMNLElasticStrainStressList(this, in, __current);
            }
            case 98:
            {
                return ___addFEMNMTimeMass(this, in, __current);
            }
            case 99:
            {
                return ___addFEMNMTimeMassList(this, in, __current);
            }
            case 100:
            {
                return ___addFEMNTNContact(this, in, __current);
            }
            case 101:
            {
                return ___addFEMNTNContactList(this, in, __current);
            }
            case 102:
            {
                return ___addFEMNodalMass(this, in, __current);
            }
            case 103:
            {
                return ___addFEMNodalMassList(this, in, __current);
            }
            case 104:
            {
                return ___addFEMNode(this, in, __current);
            }
            case 105:
            {
                return ___addFEMNodeList(this, in, __current);
            }
            case 106:
            {
                return ___addFEMOrthotropicMaterial(this, in, __current);
            }
            case 107:
            {
                return ___addFEMOrthotropicMaterialList(this, in, __current);
            }
            case 108:
            {
                return ___addFEMPlasticBilinearMaterial(this, in, __current);
            }
            case 109:
            {
                return ___addFEMPlasticBilinearMaterialList(this, in, __current);
            }
            case 110:
            {
                return ___addFEMPlasticMlMaterials(this, in, __current);
            }
            case 111:
            {
                return ___addFEMPlasticMlMaterialsList(this, in, __current);
            }
            case 112:
            {
                return ___addFEMPlasticStrainStress(this, in, __current);
            }
            case 113:
            {
                return ___addFEMPlasticStrainStressList(this, in, __current);
            }
            case 114:
            {
                return ___addFEMPlate(this, in, __current);
            }
            case 115:
            {
                return ___addFEMPlateGroup(this, in, __current);
            }
            case 116:
            {
                return ___addFEMPlateGroupList(this, in, __current);
            }
            case 117:
            {
                return ___addFEMPlateList(this, in, __current);
            }
            case 118:
            {
                return ___addFEMPoints(this, in, __current);
            }
            case 119:
            {
                return ___addFEMPointsList(this, in, __current);
            }
            case 120:
            {
                return ___addFEMProperties(this, in, __current);
            }
            case 121:
            {
                return ___addFEMPropertiesList(this, in, __current);
            }
            case 122:
            {
                return ___addFEMPropertysets(this, in, __current);
            }
            case 123:
            {
                return ___addFEMPropertysetsList(this, in, __current);
            }
            case 124:
            {
                return ___addFEMSectionBox(this, in, __current);
            }
            case 125:
            {
                return ___addFEMSectionBoxList(this, in, __current);
            }
            case 126:
            {
                return ___addFEMSectionI(this, in, __current);
            }
            case 127:
            {
                return ___addFEMSectionIList(this, in, __current);
            }
            case 128:
            {
                return ___addFEMSectionPipe(this, in, __current);
            }
            case 129:
            {
                return ___addFEMSectionPipeList(this, in, __current);
            }
            case 130:
            {
                return ___addFEMSectionProp(this, in, __current);
            }
            case 131:
            {
                return ___addFEMSectionPropList(this, in, __current);
            }
            case 132:
            {
                return ___addFEMSectionRect(this, in, __current);
            }
            case 133:
            {
                return ___addFEMSectionRectList(this, in, __current);
            }
            case 134:
            {
                return ___addFEMShell(this, in, __current);
            }
            case 135:
            {
                return ___addFEMShellAxesOrtho(this, in, __current);
            }
            case 136:
            {
                return ___addFEMShellAxesOrthoData(this, in, __current);
            }
            case 137:
            {
                return ___addFEMShellAxesOrthoDataList(this, in, __current);
            }
            case 138:
            {
                return ___addFEMShellAxesOrthoList(this, in, __current);
            }
            case 139:
            {
                return ___addFEMShellDOF(this, in, __current);
            }
            case 140:
            {
                return ___addFEMShellDOFList(this, in, __current);
            }
            case 141:
            {
                return ___addFEMShellGroup(this, in, __current);
            }
            case 142:
            {
                return ___addFEMShellGroupList(this, in, __current);
            }
            case 143:
            {
                return ___addFEMShellLayer(this, in, __current);
            }
            case 144:
            {
                return ___addFEMShellLayerList(this, in, __current);
            }
            case 145:
            {
                return ___addFEMShellList(this, in, __current);
            }
            case 146:
            {
                return ___addFEMShellPressure(this, in, __current);
            }
            case 147:
            {
                return ___addFEMShellPressureList(this, in, __current);
            }
            case 148:
            {
                return ___addFEMSkewDOF(this, in, __current);
            }
            case 149:
            {
                return ___addFEMSkewDOFList(this, in, __current);
            }
            case 150:
            {
                return ___addFEMSkewSysAngles(this, in, __current);
            }
            case 151:
            {
                return ___addFEMSkewSysAnglesList(this, in, __current);
            }
            case 152:
            {
                return ___addFEMSkeySysNode(this, in, __current);
            }
            case 153:
            {
                return ___addFEMSkeySysNodeList(this, in, __current);
            }
            case 154:
            {
                return ___addFEMSpring(this, in, __current);
            }
            case 155:
            {
                return ___addFEMSpringGroup(this, in, __current);
            }
            case 156:
            {
                return ___addFEMSpringGroupList(this, in, __current);
            }
            case 157:
            {
                return ___addFEMSpringList(this, in, __current);
            }
            case 158:
            {
                return ___addFEMStrLines(this, in, __current);
            }
            case 159:
            {
                return ___addFEMStrLinesList(this, in, __current);
            }
            case 160:
            {
                return ___addFEMThermoIsoData(this, in, __current);
            }
            case 161:
            {
                return ___addFEMThermoIsoDataList(this, in, __current);
            }
            case 162:
            {
                return ___addFEMThermoIsoMaterials(this, in, __current);
            }
            case 163:
            {
                return ___addFEMThermoIsoMaterialsList(this, in, __current);
            }
            case 164:
            {
                return ___addFEMThermoOrthData(this, in, __current);
            }
            case 165:
            {
                return ___addFEMThermoOrthDataList(this, in, __current);
            }
            case 166:
            {
                return ___addFEMThermoOrthMaterials(this, in, __current);
            }
            case 167:
            {
                return ___addFEMThermoOrthMaterialsList(this, in, __current);
            }
            case 168:
            {
                return ___addFEMThreeDSolid(this, in, __current);
            }
            case 169:
            {
                return ___addFEMThreeDSolidGroup(this, in, __current);
            }
            case 170:
            {
                return ___addFEMThreeDSolidGroupList(this, in, __current);
            }
            case 171:
            {
                return ___addFEMThreeDSolidList(this, in, __current);
            }
            case 172:
            {
                return ___addFEMTimeFunctionData(this, in, __current);
            }
            case 173:
            {
                return ___addFEMTimeFunctionDataList(this, in, __current);
            }
            case 174:
            {
                return ___addFEMTimeFunctions(this, in, __current);
            }
            case 175:
            {
                return ___addFEMTimeFunctionsList(this, in, __current);
            }
            case 176:
            {
                return ___addFEMTruss(this, in, __current);
            }
            case 177:
            {
                return ___addFEMTrussGroup(this, in, __current);
            }
            case 178:
            {
                return ___addFEMTrussGroupList(this, in, __current);
            }
            case 179:
            {
                return ___addFEMTrussList(this, in, __current);
            }
            case 180:
            {
                return ___addFEMTwistMomentData(this, in, __current);
            }
            case 181:
            {
                return ___addFEMTwistMomentDataList(this, in, __current);
            }
            case 182:
            {
                return ___addFEMTwoDSolid(this, in, __current);
            }
            case 183:
            {
                return ___addFEMTwoDSolidGroup(this, in, __current);
            }
            case 184:
            {
                return ___addFEMTwoDSolidGroupList(this, in, __current);
            }
            case 185:
            {
                return ___addFEMTwoDSolidList(this, in, __current);
            }
            case 186:
            {
                return ___addMappingMatrix(this, in, __current);
            }
            case 187:
            {
                return ___addMappingMatrixList(this, in, __current);
            }
            case 188:
            {
                return ___addSensor(this, in, __current);
            }
            case 189:
            {
                return ___addSensorList(this, in, __current);
            }
            case 190:
            {
                return ___addSensorTimeData(this, in, __current);
            }
            case 191:
            {
                return ___addSensorTimeDataList(this, in, __current);
            }
            case 192:
            {
                return ___addStructure(this, in, __current);
            }
            case 193:
            {
                return ___addStructureList(this, in, __current);
            }
            case 194:
            {
                return ___addTransducer(this, in, __current);
            }
            case 195:
            {
                return ___addTransducerCycleData(this, in, __current);
            }
            case 196:
            {
                return ___addTransducerCycleDataList(this, in, __current);
            }
            case 197:
            {
                return ___addTransducerList(this, in, __current);
            }
            case 198:
            {
                return ___addTransducerTimeData(this, in, __current);
            }
            case 199:
            {
                return ___addTransducerTimeDataList(this, in, __current);
            }
            case 200:
            {
                return ___findEqualAccelMeas(this, in, __current);
            }
            case 201:
            {
                return ___findEqualCycle(this, in, __current);
            }
            case 202:
            {
                return ___findEqualDaqUnit(this, in, __current);
            }
            case 203:
            {
                return ___findEqualDaqUnitChannel(this, in, __current);
            }
            case 204:
            {
                return ___findEqualDaqUnitChannelData(this, in, __current);
            }
            case 205:
            {
                return ___findEqualExperiment(this, in, __current);
            }
            case 206:
            {
                return ___findEqualExperimentStructureData(this, in, __current);
            }
            case 207:
            {
                return ___findEqualFEMAppliedConcentratedLoad(this, in, __current);
            }
            case 208:
            {
                return ___findEqualFEMAppliedDisplacement(this, in, __current);
            }
            case 209:
            {
                return ___findEqualFEMAppliedLoads(this, in, __current);
            }
            case 210:
            {
                return ___findEqualFEMAppliedTemperature(this, in, __current);
            }
            case 211:
            {
                return ___findEqualFEMAxesNode(this, in, __current);
            }
            case 212:
            {
                return ___findEqualFEMBeam(this, in, __current);
            }
            case 213:
            {
                return ___findEqualFEMBeamLoad(this, in, __current);
            }
            case 214:
            {
                return ___findEqualFEMBeamNode(this, in, __current);
            }
            case 215:
            {
                return ___findEqualFEMBoundary(this, in, __current);
            }
            case 216:
            {
                return ___findEqualFEMConstraintCoef(this, in, __current);
            }
            case 217:
            {
                return ___findEqualFEMConstraints(this, in, __current);
            }
            case 218:
            {
                return ___findEqualFEMContactGroup3(this, in, __current);
            }
            case 219:
            {
                return ___findEqualFEMContactPairs(this, in, __current);
            }
            case 220:
            {
                return ___findEqualFEMContactSurface(this, in, __current);
            }
            case 221:
            {
                return ___findEqualFEMCoordSystem(this, in, __current);
            }
            case 222:
            {
                return ___findEqualFEMCrossSections(this, in, __current);
            }
            case 223:
            {
                return ___findEqualFEMCurvMomentData(this, in, __current);
            }
            case 224:
            {
                return ___findEqualFEMDamping(this, in, __current);
            }
            case 225:
            {
                return ___findEqualFEMDof(this, in, __current);
            }
            case 226:
            {
                return ___findEqualFEMElasticMaterial(this, in, __current);
            }
            case 227:
            {
                return ___findEqualFEMEndreleases(this, in, __current);
            }
            case 228:
            {
                return ___findEqualFEMForceStrainData(this, in, __current);
            }
            case 229:
            {
                return ___findEqualFEMGeneral(this, in, __current);
            }
            case 230:
            {
                return ___findEqualFEMGeneralGroup(this, in, __current);
            }
            case 231:
            {
                return ___findEqualFEMGeneralNode(this, in, __current);
            }
            case 232:
            {
                return ___findEqualFEMGroundMotionRecord(this, in, __current);
            }
            case 233:
            {
                return ___findEqualFEMGroup(this, in, __current);
            }
            case 234:
            {
                return ___findEqualFEMInitialTemperature(this, in, __current);
            }
            case 235:
            {
                return ___findEqualFEMIsoBeam(this, in, __current);
            }
            case 236:
            {
                return ___findEqualFEMIsoBeamGroup(this, in, __current);
            }
            case 237:
            {
                return ___findEqualFEMLink(this, in, __current);
            }
            case 238:
            {
                return ___findEqualFEMLoadMassProportional(this, in, __current);
            }
            case 239:
            {
                return ___findEqualFEMMCForceData(this, in, __current);
            }
            case 240:
            {
                return ___findEqualFEMMCrigidities(this, in, __current);
            }
            case 241:
            {
                return ___findEqualFEMMTForceData(this, in, __current);
            }
            case 242:
            {
                return ___findEqualFEMMaterial(this, in, __current);
            }
            case 243:
            {
                return ___findEqualFEMMatrices(this, in, __current);
            }
            case 244:
            {
                return ___findEqualFEMMatrixData(this, in, __current);
            }
            case 245:
            {
                return ___findEqualFEMMatrixSets(this, in, __current);
            }
            case 246:
            {
                return ___findEqualFEMNKDisplForce(this, in, __current);
            }
            case 247:
            {
                return ___findEqualFEMNLElasticMaterials(this, in, __current);
            }
            case 248:
            {
                return ___findEqualFEMNLElasticStrainStress(this, in, __current);
            }
            case 249:
            {
                return ___findEqualFEMNMTimeMass(this, in, __current);
            }
            case 250:
            {
                return ___findEqualFEMNTNContact(this, in, __current);
            }
            case 251:
            {
                return ___findEqualFEMNodalMass(this, in, __current);
            }
            case 252:
            {
                return ___findEqualFEMNode(this, in, __current);
            }
            case 253:
            {
                return ___findEqualFEMOrthotropicMaterial(this, in, __current);
            }
            case 254:
            {
                return ___findEqualFEMPlasticBilinearMaterial(this, in, __current);
            }
            case 255:
            {
                return ___findEqualFEMPlasticMlMaterials(this, in, __current);
            }
            case 256:
            {
                return ___findEqualFEMPlasticStrainStress(this, in, __current);
            }
            case 257:
            {
                return ___findEqualFEMPlate(this, in, __current);
            }
            case 258:
            {
                return ___findEqualFEMPlateGroup(this, in, __current);
            }
            case 259:
            {
                return ___findEqualFEMPoints(this, in, __current);
            }
            case 260:
            {
                return ___findEqualFEMProperties(this, in, __current);
            }
            case 261:
            {
                return ___findEqualFEMPropertysets(this, in, __current);
            }
            case 262:
            {
                return ___findEqualFEMSectionBox(this, in, __current);
            }
            case 263:
            {
                return ___findEqualFEMSectionI(this, in, __current);
            }
            case 264:
            {
                return ___findEqualFEMSectionPipe(this, in, __current);
            }
            case 265:
            {
                return ___findEqualFEMSectionProp(this, in, __current);
            }
            case 266:
            {
                return ___findEqualFEMSectionRect(this, in, __current);
            }
            case 267:
            {
                return ___findEqualFEMShell(this, in, __current);
            }
            case 268:
            {
                return ___findEqualFEMShellAxesOrtho(this, in, __current);
            }
            case 269:
            {
                return ___findEqualFEMShellAxesOrthoData(this, in, __current);
            }
            case 270:
            {
                return ___findEqualFEMShellDOF(this, in, __current);
            }
            case 271:
            {
                return ___findEqualFEMShellGroup(this, in, __current);
            }
            case 272:
            {
                return ___findEqualFEMShellLayer(this, in, __current);
            }
            case 273:
            {
                return ___findEqualFEMShellPressure(this, in, __current);
            }
            case 274:
            {
                return ___findEqualFEMSkewDOF(this, in, __current);
            }
            case 275:
            {
                return ___findEqualFEMSkewSysAngles(this, in, __current);
            }
            case 276:
            {
                return ___findEqualFEMSkeySysNode(this, in, __current);
            }
            case 277:
            {
                return ___findEqualFEMSpring(this, in, __current);
            }
            case 278:
            {
                return ___findEqualFEMSpringGroup(this, in, __current);
            }
            case 279:
            {
                return ___findEqualFEMStrLines(this, in, __current);
            }
            case 280:
            {
                return ___findEqualFEMThermoIsoData(this, in, __current);
            }
            case 281:
            {
                return ___findEqualFEMThermoIsoMaterials(this, in, __current);
            }
            case 282:
            {
                return ___findEqualFEMThermoOrthData(this, in, __current);
            }
            case 283:
            {
                return ___findEqualFEMThermoOrthMaterials(this, in, __current);
            }
            case 284:
            {
                return ___findEqualFEMThreeDSolid(this, in, __current);
            }
            case 285:
            {
                return ___findEqualFEMThreeDSolidGroup(this, in, __current);
            }
            case 286:
            {
                return ___findEqualFEMTimeFunctionData(this, in, __current);
            }
            case 287:
            {
                return ___findEqualFEMTimeFunctions(this, in, __current);
            }
            case 288:
            {
                return ___findEqualFEMTruss(this, in, __current);
            }
            case 289:
            {
                return ___findEqualFEMTrussGroup(this, in, __current);
            }
            case 290:
            {
                return ___findEqualFEMTwistMomentData(this, in, __current);
            }
            case 291:
            {
                return ___findEqualFEMTwoDSolid(this, in, __current);
            }
            case 292:
            {
                return ___findEqualFEMTwoDSolidGroup(this, in, __current);
            }
            case 293:
            {
                return ___findEqualMappingMatrix(this, in, __current);
            }
            case 294:
            {
                return ___findEqualSensor(this, in, __current);
            }
            case 295:
            {
                return ___findEqualSensorTimeData(this, in, __current);
            }
            case 296:
            {
                return ___findEqualStructure(this, in, __current);
            }
            case 297:
            {
                return ___findEqualTransducer(this, in, __current);
            }
            case 298:
            {
                return ___findEqualTransducerCycleData(this, in, __current);
            }
            case 299:
            {
                return ___findEqualTransducerTimeData(this, in, __current);
            }
            case 300:
            {
                return ___getAccelMeas(this, in, __current);
            }
            case 301:
            {
                return ___getAccelMeasFields(this, in, __current);
            }
            case 302:
            {
                return ___getAccelMeasFieldsList(this, in, __current);
            }
            case 303:
            {
                return ___getAccelMeasIds(this, in, __current);
            }
            case 304:
            {
                return ___getAccelMeasList(this, in, __current);
            }
            case 305:
            {
                return ___getCycle(this, in, __current);
            }
            case 306:
            {
                return ___getCycleFields(this, in, __current);
            }
            case 307:
            {
                return ___getCycleFieldsList(this, in, __current);
            }
            case 308:
            {
                return ___getCycleIds(this, in, __current);
            }
            case 309:
            {
                return ___getCycleList(this, in, __current);
            }
            case 310:
            {
                return ___getDaqUnit(this, in, __current);
            }
            case 311:
            {
                return ___getDaqUnitChannel(this, in, __current);
            }
            case 312:
            {
                return ___getDaqUnitChannelData(this, in, __current);
            }
            case 313:
            {
                return ___getDaqUnitChannelDataFields(this, in, __current);
            }
            case 314:
            {
                return ___getDaqUnitChannelDataFieldsList(this, in, __current);
            }
            case 315:
            {
                return ___getDaqUnitChannelDataIds(this, in, __current);
            }
            case 316:
            {
                return ___getDaqUnitChannelDataList(this, in, __current);
            }
            case 317:
            {
                return ___getDaqUnitChannelFields(this, in, __current);
            }
            case 318:
            {
                return ___getDaqUnitChannelFieldsList(this, in, __current);
            }
            case 319:
            {
                return ___getDaqUnitChannelIds(this, in, __current);
            }
            case 320:
            {
                return ___getDaqUnitChannelList(this, in, __current);
            }
            case 321:
            {
                return ___getDaqUnitFields(this, in, __current);
            }
            case 322:
            {
                return ___getDaqUnitFieldsList(this, in, __current);
            }
            case 323:
            {
                return ___getDaqUnitIds(this, in, __current);
            }
            case 324:
            {
                return ___getDaqUnitList(this, in, __current);
            }
            case 325:
            {
                return ___getExperiment(this, in, __current);
            }
            case 326:
            {
                return ___getExperimentFields(this, in, __current);
            }
            case 327:
            {
                return ___getExperimentFieldsList(this, in, __current);
            }
            case 328:
            {
                return ___getExperimentIds(this, in, __current);
            }
            case 329:
            {
                return ___getExperimentList(this, in, __current);
            }
            case 330:
            {
                return ___getExperimentStructureData(this, in, __current);
            }
            case 331:
            {
                return ___getExperimentStructureDataFields(this, in, __current);
            }
            case 332:
            {
                return ___getExperimentStructureDataFieldsList(this, in, __current);
            }
            case 333:
            {
                return ___getExperimentStructureDataIds(this, in, __current);
            }
            case 334:
            {
                return ___getExperimentStructureDataList(this, in, __current);
            }
            case 335:
            {
                return ___getFEMAppliedConcentratedLoad(this, in, __current);
            }
            case 336:
            {
                return ___getFEMAppliedConcentratedLoadFields(this, in, __current);
            }
            case 337:
            {
                return ___getFEMAppliedConcentratedLoadFieldsList(this, in, __current);
            }
            case 338:
            {
                return ___getFEMAppliedConcentratedLoadIds(this, in, __current);
            }
            case 339:
            {
                return ___getFEMAppliedConcentratedLoadList(this, in, __current);
            }
            case 340:
            {
                return ___getFEMAppliedDisplacement(this, in, __current);
            }
            case 341:
            {
                return ___getFEMAppliedDisplacementFields(this, in, __current);
            }
            case 342:
            {
                return ___getFEMAppliedDisplacementFieldsList(this, in, __current);
            }
            case 343:
            {
                return ___getFEMAppliedDisplacementIds(this, in, __current);
            }
            case 344:
            {
                return ___getFEMAppliedDisplacementList(this, in, __current);
            }
            case 345:
            {
                return ___getFEMAppliedLoads(this, in, __current);
            }
            case 346:
            {
                return ___getFEMAppliedLoadsFields(this, in, __current);
            }
            case 347:
            {
                return ___getFEMAppliedLoadsFieldsList(this, in, __current);
            }
            case 348:
            {
                return ___getFEMAppliedLoadsIds(this, in, __current);
            }
            case 349:
            {
                return ___getFEMAppliedLoadsList(this, in, __current);
            }
            case 350:
            {
                return ___getFEMAppliedTemperature(this, in, __current);
            }
            case 351:
            {
                return ___getFEMAppliedTemperatureFields(this, in, __current);
            }
            case 352:
            {
                return ___getFEMAppliedTemperatureFieldsList(this, in, __current);
            }
            case 353:
            {
                return ___getFEMAppliedTemperatureIds(this, in, __current);
            }
            case 354:
            {
                return ___getFEMAppliedTemperatureList(this, in, __current);
            }
            case 355:
            {
                return ___getFEMAxesNode(this, in, __current);
            }
            case 356:
            {
                return ___getFEMAxesNodeFields(this, in, __current);
            }
            case 357:
            {
                return ___getFEMAxesNodeFieldsList(this, in, __current);
            }
            case 358:
            {
                return ___getFEMAxesNodeIds(this, in, __current);
            }
            case 359:
            {
                return ___getFEMAxesNodeList(this, in, __current);
            }
            case 360:
            {
                return ___getFEMBeam(this, in, __current);
            }
            case 361:
            {
                return ___getFEMBeamFields(this, in, __current);
            }
            case 362:
            {
                return ___getFEMBeamFieldsList(this, in, __current);
            }
            case 363:
            {
                return ___getFEMBeamIds(this, in, __current);
            }
            case 364:
            {
                return ___getFEMBeamList(this, in, __current);
            }
            case 365:
            {
                return ___getFEMBeamLoad(this, in, __current);
            }
            case 366:
            {
                return ___getFEMBeamLoadFields(this, in, __current);
            }
            case 367:
            {
                return ___getFEMBeamLoadFieldsList(this, in, __current);
            }
            case 368:
            {
                return ___getFEMBeamLoadIds(this, in, __current);
            }
            case 369:
            {
                return ___getFEMBeamLoadList(this, in, __current);
            }
            case 370:
            {
                return ___getFEMBeamNode(this, in, __current);
            }
            case 371:
            {
                return ___getFEMBeamNodeFields(this, in, __current);
            }
            case 372:
            {
                return ___getFEMBeamNodeFieldsList(this, in, __current);
            }
            case 373:
            {
                return ___getFEMBeamNodeIds(this, in, __current);
            }
            case 374:
            {
                return ___getFEMBeamNodeList(this, in, __current);
            }
            case 375:
            {
                return ___getFEMBoundary(this, in, __current);
            }
            case 376:
            {
                return ___getFEMBoundaryFields(this, in, __current);
            }
            case 377:
            {
                return ___getFEMBoundaryFieldsList(this, in, __current);
            }
            case 378:
            {
                return ___getFEMBoundaryIds(this, in, __current);
            }
            case 379:
            {
                return ___getFEMBoundaryList(this, in, __current);
            }
            case 380:
            {
                return ___getFEMConstraintCoef(this, in, __current);
            }
            case 381:
            {
                return ___getFEMConstraintCoefFields(this, in, __current);
            }
            case 382:
            {
                return ___getFEMConstraintCoefFieldsList(this, in, __current);
            }
            case 383:
            {
                return ___getFEMConstraintCoefIds(this, in, __current);
            }
            case 384:
            {
                return ___getFEMConstraintCoefList(this, in, __current);
            }
            case 385:
            {
                return ___getFEMConstraints(this, in, __current);
            }
            case 386:
            {
                return ___getFEMConstraintsFields(this, in, __current);
            }
            case 387:
            {
                return ___getFEMConstraintsFieldsList(this, in, __current);
            }
            case 388:
            {
                return ___getFEMConstraintsIds(this, in, __current);
            }
            case 389:
            {
                return ___getFEMConstraintsList(this, in, __current);
            }
            case 390:
            {
                return ___getFEMContactGroup3(this, in, __current);
            }
            case 391:
            {
                return ___getFEMContactGroup3Fields(this, in, __current);
            }
            case 392:
            {
                return ___getFEMContactGroup3FieldsList(this, in, __current);
            }
            case 393:
            {
                return ___getFEMContactGroup3Ids(this, in, __current);
            }
            case 394:
            {
                return ___getFEMContactGroup3List(this, in, __current);
            }
            case 395:
            {
                return ___getFEMContactPairs(this, in, __current);
            }
            case 396:
            {
                return ___getFEMContactPairsFields(this, in, __current);
            }
            case 397:
            {
                return ___getFEMContactPairsFieldsList(this, in, __current);
            }
            case 398:
            {
                return ___getFEMContactPairsIds(this, in, __current);
            }
            case 399:
            {
                return ___getFEMContactPairsList(this, in, __current);
            }
            case 400:
            {
                return ___getFEMContactSurface(this, in, __current);
            }
            case 401:
            {
                return ___getFEMContactSurfaceFields(this, in, __current);
            }
            case 402:
            {
                return ___getFEMContactSurfaceFieldsList(this, in, __current);
            }
            case 403:
            {
                return ___getFEMContactSurfaceIds(this, in, __current);
            }
            case 404:
            {
                return ___getFEMContactSurfaceList(this, in, __current);
            }
            case 405:
            {
                return ___getFEMCoordSystem(this, in, __current);
            }
            case 406:
            {
                return ___getFEMCoordSystemFields(this, in, __current);
            }
            case 407:
            {
                return ___getFEMCoordSystemFieldsList(this, in, __current);
            }
            case 408:
            {
                return ___getFEMCoordSystemIds(this, in, __current);
            }
            case 409:
            {
                return ___getFEMCoordSystemList(this, in, __current);
            }
            case 410:
            {
                return ___getFEMCrossSections(this, in, __current);
            }
            case 411:
            {
                return ___getFEMCrossSectionsFields(this, in, __current);
            }
            case 412:
            {
                return ___getFEMCrossSectionsFieldsList(this, in, __current);
            }
            case 413:
            {
                return ___getFEMCrossSectionsIds(this, in, __current);
            }
            case 414:
            {
                return ___getFEMCrossSectionsList(this, in, __current);
            }
            case 415:
            {
                return ___getFEMCurvMomentData(this, in, __current);
            }
            case 416:
            {
                return ___getFEMCurvMomentDataFields(this, in, __current);
            }
            case 417:
            {
                return ___getFEMCurvMomentDataFieldsList(this, in, __current);
            }
            case 418:
            {
                return ___getFEMCurvMomentDataIds(this, in, __current);
            }
            case 419:
            {
                return ___getFEMCurvMomentDataList(this, in, __current);
            }
            case 420:
            {
                return ___getFEMDamping(this, in, __current);
            }
            case 421:
            {
                return ___getFEMDampingFields(this, in, __current);
            }
            case 422:
            {
                return ___getFEMDampingFieldsList(this, in, __current);
            }
            case 423:
            {
                return ___getFEMDampingIds(this, in, __current);
            }
            case 424:
            {
                return ___getFEMDampingList(this, in, __current);
            }
            case 425:
            {
                return ___getFEMDof(this, in, __current);
            }
            case 426:
            {
                return ___getFEMDofFields(this, in, __current);
            }
            case 427:
            {
                return ___getFEMDofFieldsList(this, in, __current);
            }
            case 428:
            {
                return ___getFEMDofIds(this, in, __current);
            }
            case 429:
            {
                return ___getFEMDofList(this, in, __current);
            }
            case 430:
            {
                return ___getFEMElasticMaterial(this, in, __current);
            }
            case 431:
            {
                return ___getFEMElasticMaterialFields(this, in, __current);
            }
            case 432:
            {
                return ___getFEMElasticMaterialFieldsList(this, in, __current);
            }
            case 433:
            {
                return ___getFEMElasticMaterialIds(this, in, __current);
            }
            case 434:
            {
                return ___getFEMElasticMaterialList(this, in, __current);
            }
            case 435:
            {
                return ___getFEMEndreleases(this, in, __current);
            }
            case 436:
            {
                return ___getFEMEndreleasesFields(this, in, __current);
            }
            case 437:
            {
                return ___getFEMEndreleasesFieldsList(this, in, __current);
            }
            case 438:
            {
                return ___getFEMEndreleasesIds(this, in, __current);
            }
            case 439:
            {
                return ___getFEMEndreleasesList(this, in, __current);
            }
            case 440:
            {
                return ___getFEMForceStrainData(this, in, __current);
            }
            case 441:
            {
                return ___getFEMForceStrainDataFields(this, in, __current);
            }
            case 442:
            {
                return ___getFEMForceStrainDataFieldsList(this, in, __current);
            }
            case 443:
            {
                return ___getFEMForceStrainDataIds(this, in, __current);
            }
            case 444:
            {
                return ___getFEMForceStrainDataList(this, in, __current);
            }
            case 445:
            {
                return ___getFEMGeneral(this, in, __current);
            }
            case 446:
            {
                return ___getFEMGeneralFields(this, in, __current);
            }
            case 447:
            {
                return ___getFEMGeneralFieldsList(this, in, __current);
            }
            case 448:
            {
                return ___getFEMGeneralGroup(this, in, __current);
            }
            case 449:
            {
                return ___getFEMGeneralGroupFields(this, in, __current);
            }
            case 450:
            {
                return ___getFEMGeneralGroupFieldsList(this, in, __current);
            }
            case 451:
            {
                return ___getFEMGeneralGroupIds(this, in, __current);
            }
            case 452:
            {
                return ___getFEMGeneralGroupList(this, in, __current);
            }
            case 453:
            {
                return ___getFEMGeneralIds(this, in, __current);
            }
            case 454:
            {
                return ___getFEMGeneralList(this, in, __current);
            }
            case 455:
            {
                return ___getFEMGeneralNode(this, in, __current);
            }
            case 456:
            {
                return ___getFEMGeneralNodeFields(this, in, __current);
            }
            case 457:
            {
                return ___getFEMGeneralNodeFieldsList(this, in, __current);
            }
            case 458:
            {
                return ___getFEMGeneralNodeIds(this, in, __current);
            }
            case 459:
            {
                return ___getFEMGeneralNodeList(this, in, __current);
            }
            case 460:
            {
                return ___getFEMGroundMotionRecord(this, in, __current);
            }
            case 461:
            {
                return ___getFEMGroundMotionRecordFields(this, in, __current);
            }
            case 462:
            {
                return ___getFEMGroundMotionRecordFieldsList(this, in, __current);
            }
            case 463:
            {
                return ___getFEMGroundMotionRecordIds(this, in, __current);
            }
            case 464:
            {
                return ___getFEMGroundMotionRecordList(this, in, __current);
            }
            case 465:
            {
                return ___getFEMGroup(this, in, __current);
            }
            case 466:
            {
                return ___getFEMGroupFields(this, in, __current);
            }
            case 467:
            {
                return ___getFEMGroupFieldsList(this, in, __current);
            }
            case 468:
            {
                return ___getFEMGroupIds(this, in, __current);
            }
            case 469:
            {
                return ___getFEMGroupList(this, in, __current);
            }
            case 470:
            {
                return ___getFEMInitialTemperature(this, in, __current);
            }
            case 471:
            {
                return ___getFEMInitialTemperatureFields(this, in, __current);
            }
            case 472:
            {
                return ___getFEMInitialTemperatureFieldsList(this, in, __current);
            }
            case 473:
            {
                return ___getFEMInitialTemperatureIds(this, in, __current);
            }
            case 474:
            {
                return ___getFEMInitialTemperatureList(this, in, __current);
            }
            case 475:
            {
                return ___getFEMIsoBeam(this, in, __current);
            }
            case 476:
            {
                return ___getFEMIsoBeamFields(this, in, __current);
            }
            case 477:
            {
                return ___getFEMIsoBeamFieldsList(this, in, __current);
            }
            case 478:
            {
                return ___getFEMIsoBeamGroup(this, in, __current);
            }
            case 479:
            {
                return ___getFEMIsoBeamGroupFields(this, in, __current);
            }
            case 480:
            {
                return ___getFEMIsoBeamGroupFieldsList(this, in, __current);
            }
            case 481:
            {
                return ___getFEMIsoBeamGroupIds(this, in, __current);
            }
            case 482:
            {
                return ___getFEMIsoBeamGroupList(this, in, __current);
            }
            case 483:
            {
                return ___getFEMIsoBeamIds(this, in, __current);
            }
            case 484:
            {
                return ___getFEMIsoBeamList(this, in, __current);
            }
            case 485:
            {
                return ___getFEMLink(this, in, __current);
            }
            case 486:
            {
                return ___getFEMLinkFields(this, in, __current);
            }
            case 487:
            {
                return ___getFEMLinkFieldsList(this, in, __current);
            }
            case 488:
            {
                return ___getFEMLinkIds(this, in, __current);
            }
            case 489:
            {
                return ___getFEMLinkList(this, in, __current);
            }
            case 490:
            {
                return ___getFEMLoadMassProportional(this, in, __current);
            }
            case 491:
            {
                return ___getFEMLoadMassProportionalFields(this, in, __current);
            }
            case 492:
            {
                return ___getFEMLoadMassProportionalFieldsList(this, in, __current);
            }
            case 493:
            {
                return ___getFEMLoadMassProportionalIds(this, in, __current);
            }
            case 494:
            {
                return ___getFEMLoadMassProportionalList(this, in, __current);
            }
            case 495:
            {
                return ___getFEMMCForceData(this, in, __current);
            }
            case 496:
            {
                return ___getFEMMCForceDataFields(this, in, __current);
            }
            case 497:
            {
                return ___getFEMMCForceDataFieldsList(this, in, __current);
            }
            case 498:
            {
                return ___getFEMMCForceDataIds(this, in, __current);
            }
            case 499:
            {
                return ___getFEMMCForceDataList(this, in, __current);
            }
            case 500:
            {
                return ___getFEMMCrigidities(this, in, __current);
            }
            case 501:
            {
                return ___getFEMMCrigiditiesFields(this, in, __current);
            }
            case 502:
            {
                return ___getFEMMCrigiditiesFieldsList(this, in, __current);
            }
            case 503:
            {
                return ___getFEMMCrigiditiesIds(this, in, __current);
            }
            case 504:
            {
                return ___getFEMMCrigiditiesList(this, in, __current);
            }
            case 505:
            {
                return ___getFEMMTForceData(this, in, __current);
            }
            case 506:
            {
                return ___getFEMMTForceDataFields(this, in, __current);
            }
            case 507:
            {
                return ___getFEMMTForceDataFieldsList(this, in, __current);
            }
            case 508:
            {
                return ___getFEMMTForceDataIds(this, in, __current);
            }
            case 509:
            {
                return ___getFEMMTForceDataList(this, in, __current);
            }
            case 510:
            {
                return ___getFEMMaterial(this, in, __current);
            }
            case 511:
            {
                return ___getFEMMaterialFields(this, in, __current);
            }
            case 512:
            {
                return ___getFEMMaterialFieldsList(this, in, __current);
            }
            case 513:
            {
                return ___getFEMMaterialIds(this, in, __current);
            }
            case 514:
            {
                return ___getFEMMaterialList(this, in, __current);
            }
            case 515:
            {
                return ___getFEMMatrices(this, in, __current);
            }
            case 516:
            {
                return ___getFEMMatricesFields(this, in, __current);
            }
            case 517:
            {
                return ___getFEMMatricesFieldsList(this, in, __current);
            }
            case 518:
            {
                return ___getFEMMatricesIds(this, in, __current);
            }
            case 519:
            {
                return ___getFEMMatricesList(this, in, __current);
            }
            case 520:
            {
                return ___getFEMMatrixData(this, in, __current);
            }
            case 521:
            {
                return ___getFEMMatrixDataFields(this, in, __current);
            }
            case 522:
            {
                return ___getFEMMatrixDataFieldsList(this, in, __current);
            }
            case 523:
            {
                return ___getFEMMatrixDataIds(this, in, __current);
            }
            case 524:
            {
                return ___getFEMMatrixDataList(this, in, __current);
            }
            case 525:
            {
                return ___getFEMMatrixSets(this, in, __current);
            }
            case 526:
            {
                return ___getFEMMatrixSetsFields(this, in, __current);
            }
            case 527:
            {
                return ___getFEMMatrixSetsFieldsList(this, in, __current);
            }
            case 528:
            {
                return ___getFEMMatrixSetsIds(this, in, __current);
            }
            case 529:
            {
                return ___getFEMMatrixSetsList(this, in, __current);
            }
            case 530:
            {
                return ___getFEMNKDisplForce(this, in, __current);
            }
            case 531:
            {
                return ___getFEMNKDisplForceFields(this, in, __current);
            }
            case 532:
            {
                return ___getFEMNKDisplForceFieldsList(this, in, __current);
            }
            case 533:
            {
                return ___getFEMNKDisplForceIds(this, in, __current);
            }
            case 534:
            {
                return ___getFEMNKDisplForceList(this, in, __current);
            }
            case 535:
            {
                return ___getFEMNLElasticMaterials(this, in, __current);
            }
            case 536:
            {
                return ___getFEMNLElasticMaterialsFields(this, in, __current);
            }
            case 537:
            {
                return ___getFEMNLElasticMaterialsFieldsList(this, in, __current);
            }
            case 538:
            {
                return ___getFEMNLElasticMaterialsIds(this, in, __current);
            }
            case 539:
            {
                return ___getFEMNLElasticMaterialsList(this, in, __current);
            }
            case 540:
            {
                return ___getFEMNLElasticStrainStress(this, in, __current);
            }
            case 541:
            {
                return ___getFEMNLElasticStrainStressFields(this, in, __current);
            }
            case 542:
            {
                return ___getFEMNLElasticStrainStressFieldsList(this, in, __current);
            }
            case 543:
            {
                return ___getFEMNLElasticStrainStressIds(this, in, __current);
            }
            case 544:
            {
                return ___getFEMNLElasticStrainStressList(this, in, __current);
            }
            case 545:
            {
                return ___getFEMNMTimeMass(this, in, __current);
            }
            case 546:
            {
                return ___getFEMNMTimeMassFields(this, in, __current);
            }
            case 547:
            {
                return ___getFEMNMTimeMassFieldsList(this, in, __current);
            }
            case 548:
            {
                return ___getFEMNMTimeMassIds(this, in, __current);
            }
            case 549:
            {
                return ___getFEMNMTimeMassList(this, in, __current);
            }
            case 550:
            {
                return ___getFEMNTNContact(this, in, __current);
            }
            case 551:
            {
                return ___getFEMNTNContactFields(this, in, __current);
            }
            case 552:
            {
                return ___getFEMNTNContactFieldsList(this, in, __current);
            }
            case 553:
            {
                return ___getFEMNTNContactIds(this, in, __current);
            }
            case 554:
            {
                return ___getFEMNTNContactList(this, in, __current);
            }
            case 555:
            {
                return ___getFEMNodalMass(this, in, __current);
            }
            case 556:
            {
                return ___getFEMNodalMassFields(this, in, __current);
            }
            case 557:
            {
                return ___getFEMNodalMassFieldsList(this, in, __current);
            }
            case 558:
            {
                return ___getFEMNodalMassIds(this, in, __current);
            }
            case 559:
            {
                return ___getFEMNodalMassList(this, in, __current);
            }
            case 560:
            {
                return ___getFEMNode(this, in, __current);
            }
            case 561:
            {
                return ___getFEMNodeFields(this, in, __current);
            }
            case 562:
            {
                return ___getFEMNodeFieldsList(this, in, __current);
            }
            case 563:
            {
                return ___getFEMNodeIds(this, in, __current);
            }
            case 564:
            {
                return ___getFEMNodeList(this, in, __current);
            }
            case 565:
            {
                return ___getFEMOrthotropicMaterial(this, in, __current);
            }
            case 566:
            {
                return ___getFEMOrthotropicMaterialFields(this, in, __current);
            }
            case 567:
            {
                return ___getFEMOrthotropicMaterialFieldsList(this, in, __current);
            }
            case 568:
            {
                return ___getFEMOrthotropicMaterialIds(this, in, __current);
            }
            case 569:
            {
                return ___getFEMOrthotropicMaterialList(this, in, __current);
            }
            case 570:
            {
                return ___getFEMPlasticBilinearMaterial(this, in, __current);
            }
            case 571:
            {
                return ___getFEMPlasticBilinearMaterialFields(this, in, __current);
            }
            case 572:
            {
                return ___getFEMPlasticBilinearMaterialFieldsList(this, in, __current);
            }
            case 573:
            {
                return ___getFEMPlasticBilinearMaterialIds(this, in, __current);
            }
            case 574:
            {
                return ___getFEMPlasticBilinearMaterialList(this, in, __current);
            }
            case 575:
            {
                return ___getFEMPlasticMlMaterials(this, in, __current);
            }
            case 576:
            {
                return ___getFEMPlasticMlMaterialsFields(this, in, __current);
            }
            case 577:
            {
                return ___getFEMPlasticMlMaterialsFieldsList(this, in, __current);
            }
            case 578:
            {
                return ___getFEMPlasticMlMaterialsIds(this, in, __current);
            }
            case 579:
            {
                return ___getFEMPlasticMlMaterialsList(this, in, __current);
            }
            case 580:
            {
                return ___getFEMPlasticStrainStress(this, in, __current);
            }
            case 581:
            {
                return ___getFEMPlasticStrainStressFields(this, in, __current);
            }
            case 582:
            {
                return ___getFEMPlasticStrainStressFieldsList(this, in, __current);
            }
            case 583:
            {
                return ___getFEMPlasticStrainStressIds(this, in, __current);
            }
            case 584:
            {
                return ___getFEMPlasticStrainStressList(this, in, __current);
            }
            case 585:
            {
                return ___getFEMPlate(this, in, __current);
            }
            case 586:
            {
                return ___getFEMPlateFields(this, in, __current);
            }
            case 587:
            {
                return ___getFEMPlateFieldsList(this, in, __current);
            }
            case 588:
            {
                return ___getFEMPlateGroup(this, in, __current);
            }
            case 589:
            {
                return ___getFEMPlateGroupFields(this, in, __current);
            }
            case 590:
            {
                return ___getFEMPlateGroupFieldsList(this, in, __current);
            }
            case 591:
            {
                return ___getFEMPlateGroupIds(this, in, __current);
            }
            case 592:
            {
                return ___getFEMPlateGroupList(this, in, __current);
            }
            case 593:
            {
                return ___getFEMPlateIds(this, in, __current);
            }
            case 594:
            {
                return ___getFEMPlateList(this, in, __current);
            }
            case 595:
            {
                return ___getFEMPoints(this, in, __current);
            }
            case 596:
            {
                return ___getFEMPointsFields(this, in, __current);
            }
            case 597:
            {
                return ___getFEMPointsFieldsList(this, in, __current);
            }
            case 598:
            {
                return ___getFEMPointsIds(this, in, __current);
            }
            case 599:
            {
                return ___getFEMPointsList(this, in, __current);
            }
            case 600:
            {
                return ___getFEMProperties(this, in, __current);
            }
            case 601:
            {
                return ___getFEMPropertiesFields(this, in, __current);
            }
            case 602:
            {
                return ___getFEMPropertiesFieldsList(this, in, __current);
            }
            case 603:
            {
                return ___getFEMPropertiesIds(this, in, __current);
            }
            case 604:
            {
                return ___getFEMPropertiesList(this, in, __current);
            }
            case 605:
            {
                return ___getFEMPropertysets(this, in, __current);
            }
            case 606:
            {
                return ___getFEMPropertysetsFields(this, in, __current);
            }
            case 607:
            {
                return ___getFEMPropertysetsFieldsList(this, in, __current);
            }
            case 608:
            {
                return ___getFEMPropertysetsIds(this, in, __current);
            }
            case 609:
            {
                return ___getFEMPropertysetsList(this, in, __current);
            }
            case 610:
            {
                return ___getFEMSectionBox(this, in, __current);
            }
            case 611:
            {
                return ___getFEMSectionBoxFields(this, in, __current);
            }
            case 612:
            {
                return ___getFEMSectionBoxFieldsList(this, in, __current);
            }
            case 613:
            {
                return ___getFEMSectionBoxIds(this, in, __current);
            }
            case 614:
            {
                return ___getFEMSectionBoxList(this, in, __current);
            }
            case 615:
            {
                return ___getFEMSectionI(this, in, __current);
            }
            case 616:
            {
                return ___getFEMSectionIFields(this, in, __current);
            }
            case 617:
            {
                return ___getFEMSectionIFieldsList(this, in, __current);
            }
            case 618:
            {
                return ___getFEMSectionIIds(this, in, __current);
            }
            case 619:
            {
                return ___getFEMSectionIList(this, in, __current);
            }
            case 620:
            {
                return ___getFEMSectionPipe(this, in, __current);
            }
            case 621:
            {
                return ___getFEMSectionPipeFields(this, in, __current);
            }
            case 622:
            {
                return ___getFEMSectionPipeFieldsList(this, in, __current);
            }
            case 623:
            {
                return ___getFEMSectionPipeIds(this, in, __current);
            }
            case 624:
            {
                return ___getFEMSectionPipeList(this, in, __current);
            }
            case 625:
            {
                return ___getFEMSectionProp(this, in, __current);
            }
            case 626:
            {
                return ___getFEMSectionPropFields(this, in, __current);
            }
            case 627:
            {
                return ___getFEMSectionPropFieldsList(this, in, __current);
            }
            case 628:
            {
                return ___getFEMSectionPropIds(this, in, __current);
            }
            case 629:
            {
                return ___getFEMSectionPropList(this, in, __current);
            }
            case 630:
            {
                return ___getFEMSectionRect(this, in, __current);
            }
            case 631:
            {
                return ___getFEMSectionRectFields(this, in, __current);
            }
            case 632:
            {
                return ___getFEMSectionRectFieldsList(this, in, __current);
            }
            case 633:
            {
                return ___getFEMSectionRectIds(this, in, __current);
            }
            case 634:
            {
                return ___getFEMSectionRectList(this, in, __current);
            }
            case 635:
            {
                return ___getFEMShell(this, in, __current);
            }
            case 636:
            {
                return ___getFEMShellAxesOrtho(this, in, __current);
            }
            case 637:
            {
                return ___getFEMShellAxesOrthoData(this, in, __current);
            }
            case 638:
            {
                return ___getFEMShellAxesOrthoDataFields(this, in, __current);
            }
            case 639:
            {
                return ___getFEMShellAxesOrthoDataFieldsList(this, in, __current);
            }
            case 640:
            {
                return ___getFEMShellAxesOrthoDataIds(this, in, __current);
            }
            case 641:
            {
                return ___getFEMShellAxesOrthoDataList(this, in, __current);
            }
            case 642:
            {
                return ___getFEMShellAxesOrthoFields(this, in, __current);
            }
            case 643:
            {
                return ___getFEMShellAxesOrthoFieldsList(this, in, __current);
            }
            case 644:
            {
                return ___getFEMShellAxesOrthoIds(this, in, __current);
            }
            case 645:
            {
                return ___getFEMShellAxesOrthoList(this, in, __current);
            }
            case 646:
            {
                return ___getFEMShellDOF(this, in, __current);
            }
            case 647:
            {
                return ___getFEMShellDOFFields(this, in, __current);
            }
            case 648:
            {
                return ___getFEMShellDOFFieldsList(this, in, __current);
            }
            case 649:
            {
                return ___getFEMShellDOFIds(this, in, __current);
            }
            case 650:
            {
                return ___getFEMShellDOFList(this, in, __current);
            }
            case 651:
            {
                return ___getFEMShellFields(this, in, __current);
            }
            case 652:
            {
                return ___getFEMShellFieldsList(this, in, __current);
            }
            case 653:
            {
                return ___getFEMShellGroup(this, in, __current);
            }
            case 654:
            {
                return ___getFEMShellGroupFields(this, in, __current);
            }
            case 655:
            {
                return ___getFEMShellGroupFieldsList(this, in, __current);
            }
            case 656:
            {
                return ___getFEMShellGroupIds(this, in, __current);
            }
            case 657:
            {
                return ___getFEMShellGroupList(this, in, __current);
            }
            case 658:
            {
                return ___getFEMShellIds(this, in, __current);
            }
            case 659:
            {
                return ___getFEMShellLayer(this, in, __current);
            }
            case 660:
            {
                return ___getFEMShellLayerFields(this, in, __current);
            }
            case 661:
            {
                return ___getFEMShellLayerFieldsList(this, in, __current);
            }
            case 662:
            {
                return ___getFEMShellLayerIds(this, in, __current);
            }
            case 663:
            {
                return ___getFEMShellLayerList(this, in, __current);
            }
            case 664:
            {
                return ___getFEMShellList(this, in, __current);
            }
            case 665:
            {
                return ___getFEMShellPressure(this, in, __current);
            }
            case 666:
            {
                return ___getFEMShellPressureFields(this, in, __current);
            }
            case 667:
            {
                return ___getFEMShellPressureFieldsList(this, in, __current);
            }
            case 668:
            {
                return ___getFEMShellPressureIds(this, in, __current);
            }
            case 669:
            {
                return ___getFEMShellPressureList(this, in, __current);
            }
            case 670:
            {
                return ___getFEMSkewDOF(this, in, __current);
            }
            case 671:
            {
                return ___getFEMSkewDOFFields(this, in, __current);
            }
            case 672:
            {
                return ___getFEMSkewDOFFieldsList(this, in, __current);
            }
            case 673:
            {
                return ___getFEMSkewDOFIds(this, in, __current);
            }
            case 674:
            {
                return ___getFEMSkewDOFList(this, in, __current);
            }
            case 675:
            {
                return ___getFEMSkewSysAngles(this, in, __current);
            }
            case 676:
            {
                return ___getFEMSkewSysAnglesFields(this, in, __current);
            }
            case 677:
            {
                return ___getFEMSkewSysAnglesFieldsList(this, in, __current);
            }
            case 678:
            {
                return ___getFEMSkewSysAnglesIds(this, in, __current);
            }
            case 679:
            {
                return ___getFEMSkewSysAnglesList(this, in, __current);
            }
            case 680:
            {
                return ___getFEMSkeySysNode(this, in, __current);
            }
            case 681:
            {
                return ___getFEMSkeySysNodeFields(this, in, __current);
            }
            case 682:
            {
                return ___getFEMSkeySysNodeFieldsList(this, in, __current);
            }
            case 683:
            {
                return ___getFEMSkeySysNodeIds(this, in, __current);
            }
            case 684:
            {
                return ___getFEMSkeySysNodeList(this, in, __current);
            }
            case 685:
            {
                return ___getFEMSpring(this, in, __current);
            }
            case 686:
            {
                return ___getFEMSpringFields(this, in, __current);
            }
            case 687:
            {
                return ___getFEMSpringFieldsList(this, in, __current);
            }
            case 688:
            {
                return ___getFEMSpringGroup(this, in, __current);
            }
            case 689:
            {
                return ___getFEMSpringGroupFields(this, in, __current);
            }
            case 690:
            {
                return ___getFEMSpringGroupFieldsList(this, in, __current);
            }
            case 691:
            {
                return ___getFEMSpringGroupIds(this, in, __current);
            }
            case 692:
            {
                return ___getFEMSpringGroupList(this, in, __current);
            }
            case 693:
            {
                return ___getFEMSpringIds(this, in, __current);
            }
            case 694:
            {
                return ___getFEMSpringList(this, in, __current);
            }
            case 695:
            {
                return ___getFEMStrLines(this, in, __current);
            }
            case 696:
            {
                return ___getFEMStrLinesFields(this, in, __current);
            }
            case 697:
            {
                return ___getFEMStrLinesFieldsList(this, in, __current);
            }
            case 698:
            {
                return ___getFEMStrLinesIds(this, in, __current);
            }
            case 699:
            {
                return ___getFEMStrLinesList(this, in, __current);
            }
            case 700:
            {
                return ___getFEMThermoIsoData(this, in, __current);
            }
            case 701:
            {
                return ___getFEMThermoIsoDataFields(this, in, __current);
            }
            case 702:
            {
                return ___getFEMThermoIsoDataFieldsList(this, in, __current);
            }
            case 703:
            {
                return ___getFEMThermoIsoDataIds(this, in, __current);
            }
            case 704:
            {
                return ___getFEMThermoIsoDataList(this, in, __current);
            }
            case 705:
            {
                return ___getFEMThermoIsoMaterials(this, in, __current);
            }
            case 706:
            {
                return ___getFEMThermoIsoMaterialsFields(this, in, __current);
            }
            case 707:
            {
                return ___getFEMThermoIsoMaterialsFieldsList(this, in, __current);
            }
            case 708:
            {
                return ___getFEMThermoIsoMaterialsIds(this, in, __current);
            }
            case 709:
            {
                return ___getFEMThermoIsoMaterialsList(this, in, __current);
            }
            case 710:
            {
                return ___getFEMThermoOrthData(this, in, __current);
            }
            case 711:
            {
                return ___getFEMThermoOrthDataFields(this, in, __current);
            }
            case 712:
            {
                return ___getFEMThermoOrthDataFieldsList(this, in, __current);
            }
            case 713:
            {
                return ___getFEMThermoOrthDataIds(this, in, __current);
            }
            case 714:
            {
                return ___getFEMThermoOrthDataList(this, in, __current);
            }
            case 715:
            {
                return ___getFEMThermoOrthMaterials(this, in, __current);
            }
            case 716:
            {
                return ___getFEMThermoOrthMaterialsFields(this, in, __current);
            }
            case 717:
            {
                return ___getFEMThermoOrthMaterialsFieldsList(this, in, __current);
            }
            case 718:
            {
                return ___getFEMThermoOrthMaterialsIds(this, in, __current);
            }
            case 719:
            {
                return ___getFEMThermoOrthMaterialsList(this, in, __current);
            }
            case 720:
            {
                return ___getFEMThreeDSolid(this, in, __current);
            }
            case 721:
            {
                return ___getFEMThreeDSolidFields(this, in, __current);
            }
            case 722:
            {
                return ___getFEMThreeDSolidFieldsList(this, in, __current);
            }
            case 723:
            {
                return ___getFEMThreeDSolidGroup(this, in, __current);
            }
            case 724:
            {
                return ___getFEMThreeDSolidGroupFields(this, in, __current);
            }
            case 725:
            {
                return ___getFEMThreeDSolidGroupFieldsList(this, in, __current);
            }
            case 726:
            {
                return ___getFEMThreeDSolidGroupIds(this, in, __current);
            }
            case 727:
            {
                return ___getFEMThreeDSolidGroupList(this, in, __current);
            }
            case 728:
            {
                return ___getFEMThreeDSolidIds(this, in, __current);
            }
            case 729:
            {
                return ___getFEMThreeDSolidList(this, in, __current);
            }
            case 730:
            {
                return ___getFEMTimeFunctionData(this, in, __current);
            }
            case 731:
            {
                return ___getFEMTimeFunctionDataFields(this, in, __current);
            }
            case 732:
            {
                return ___getFEMTimeFunctionDataFieldsList(this, in, __current);
            }
            case 733:
            {
                return ___getFEMTimeFunctionDataIds(this, in, __current);
            }
            case 734:
            {
                return ___getFEMTimeFunctionDataList(this, in, __current);
            }
            case 735:
            {
                return ___getFEMTimeFunctions(this, in, __current);
            }
            case 736:
            {
                return ___getFEMTimeFunctionsFields(this, in, __current);
            }
            case 737:
            {
                return ___getFEMTimeFunctionsFieldsList(this, in, __current);
            }
            case 738:
            {
                return ___getFEMTimeFunctionsIds(this, in, __current);
            }
            case 739:
            {
                return ___getFEMTimeFunctionsList(this, in, __current);
            }
            case 740:
            {
                return ___getFEMTruss(this, in, __current);
            }
            case 741:
            {
                return ___getFEMTrussFields(this, in, __current);
            }
            case 742:
            {
                return ___getFEMTrussFieldsList(this, in, __current);
            }
            case 743:
            {
                return ___getFEMTrussGroup(this, in, __current);
            }
            case 744:
            {
                return ___getFEMTrussGroupFields(this, in, __current);
            }
            case 745:
            {
                return ___getFEMTrussGroupFieldsList(this, in, __current);
            }
            case 746:
            {
                return ___getFEMTrussGroupIds(this, in, __current);
            }
            case 747:
            {
                return ___getFEMTrussGroupList(this, in, __current);
            }
            case 748:
            {
                return ___getFEMTrussIds(this, in, __current);
            }
            case 749:
            {
                return ___getFEMTrussList(this, in, __current);
            }
            case 750:
            {
                return ___getFEMTwistMomentData(this, in, __current);
            }
            case 751:
            {
                return ___getFEMTwistMomentDataFields(this, in, __current);
            }
            case 752:
            {
                return ___getFEMTwistMomentDataFieldsList(this, in, __current);
            }
            case 753:
            {
                return ___getFEMTwistMomentDataIds(this, in, __current);
            }
            case 754:
            {
                return ___getFEMTwistMomentDataList(this, in, __current);
            }
            case 755:
            {
                return ___getFEMTwoDSolid(this, in, __current);
            }
            case 756:
            {
                return ___getFEMTwoDSolidFields(this, in, __current);
            }
            case 757:
            {
                return ___getFEMTwoDSolidFieldsList(this, in, __current);
            }
            case 758:
            {
                return ___getFEMTwoDSolidGroup(this, in, __current);
            }
            case 759:
            {
                return ___getFEMTwoDSolidGroupFields(this, in, __current);
            }
            case 760:
            {
                return ___getFEMTwoDSolidGroupFieldsList(this, in, __current);
            }
            case 761:
            {
                return ___getFEMTwoDSolidGroupIds(this, in, __current);
            }
            case 762:
            {
                return ___getFEMTwoDSolidGroupList(this, in, __current);
            }
            case 763:
            {
                return ___getFEMTwoDSolidIds(this, in, __current);
            }
            case 764:
            {
                return ___getFEMTwoDSolidList(this, in, __current);
            }
            case 765:
            {
                return ___getMappingMatrix(this, in, __current);
            }
            case 766:
            {
                return ___getMappingMatrixFields(this, in, __current);
            }
            case 767:
            {
                return ___getMappingMatrixFieldsList(this, in, __current);
            }
            case 768:
            {
                return ___getMappingMatrixIds(this, in, __current);
            }
            case 769:
            {
                return ___getMappingMatrixList(this, in, __current);
            }
            case 770:
            {
                return ___getSensor(this, in, __current);
            }
            case 771:
            {
                return ___getSensorFields(this, in, __current);
            }
            case 772:
            {
                return ___getSensorFieldsList(this, in, __current);
            }
            case 773:
            {
                return ___getSensorIds(this, in, __current);
            }
            case 774:
            {
                return ___getSensorList(this, in, __current);
            }
            case 775:
            {
                return ___getSensorTimeData(this, in, __current);
            }
            case 776:
            {
                return ___getSensorTimeDataFields(this, in, __current);
            }
            case 777:
            {
                return ___getSensorTimeDataFieldsList(this, in, __current);
            }
            case 778:
            {
                return ___getSensorTimeDataIds(this, in, __current);
            }
            case 779:
            {
                return ___getSensorTimeDataList(this, in, __current);
            }
            case 780:
            {
                return ___getStructure(this, in, __current);
            }
            case 781:
            {
                return ___getStructureFields(this, in, __current);
            }
            case 782:
            {
                return ___getStructureFieldsList(this, in, __current);
            }
            case 783:
            {
                return ___getStructureIds(this, in, __current);
            }
            case 784:
            {
                return ___getStructureList(this, in, __current);
            }
            case 785:
            {
                return ___getTransducer(this, in, __current);
            }
            case 786:
            {
                return ___getTransducerCycleData(this, in, __current);
            }
            case 787:
            {
                return ___getTransducerCycleDataFields(this, in, __current);
            }
            case 788:
            {
                return ___getTransducerCycleDataFieldsList(this, in, __current);
            }
            case 789:
            {
                return ___getTransducerCycleDataIds(this, in, __current);
            }
            case 790:
            {
                return ___getTransducerCycleDataList(this, in, __current);
            }
            case 791:
            {
                return ___getTransducerFields(this, in, __current);
            }
            case 792:
            {
                return ___getTransducerFieldsList(this, in, __current);
            }
            case 793:
            {
                return ___getTransducerIds(this, in, __current);
            }
            case 794:
            {
                return ___getTransducerList(this, in, __current);
            }
            case 795:
            {
                return ___getTransducerTimeData(this, in, __current);
            }
            case 796:
            {
                return ___getTransducerTimeDataFields(this, in, __current);
            }
            case 797:
            {
                return ___getTransducerTimeDataFieldsList(this, in, __current);
            }
            case 798:
            {
                return ___getTransducerTimeDataIds(this, in, __current);
            }
            case 799:
            {
                return ___getTransducerTimeDataList(this, in, __current);
            }
            case 800:
            {
                return ___ice_id(this, in, __current);
            }
            case 801:
            {
                return ___ice_ids(this, in, __current);
            }
            case 802:
            {
                return ___ice_isA(this, in, __current);
            }
            case 803:
            {
                return ___ice_ping(this, in, __current);
            }
            case 804:
            {
                return ___setAccelMeasFields(this, in, __current);
            }
            case 805:
            {
                return ___setCycleFields(this, in, __current);
            }
            case 806:
            {
                return ___setDaqUnitChannelDataFields(this, in, __current);
            }
            case 807:
            {
                return ___setDaqUnitChannelFields(this, in, __current);
            }
            case 808:
            {
                return ___setDaqUnitFields(this, in, __current);
            }
            case 809:
            {
                return ___setExperimentFields(this, in, __current);
            }
            case 810:
            {
                return ___setExperimentStructureDataFields(this, in, __current);
            }
            case 811:
            {
                return ___setFEMAppliedConcentratedLoadFields(this, in, __current);
            }
            case 812:
            {
                return ___setFEMAppliedDisplacementFields(this, in, __current);
            }
            case 813:
            {
                return ___setFEMAppliedLoadsFields(this, in, __current);
            }
            case 814:
            {
                return ___setFEMAppliedTemperatureFields(this, in, __current);
            }
            case 815:
            {
                return ___setFEMAxesNodeFields(this, in, __current);
            }
            case 816:
            {
                return ___setFEMBeamFields(this, in, __current);
            }
            case 817:
            {
                return ___setFEMBeamLoadFields(this, in, __current);
            }
            case 818:
            {
                return ___setFEMBeamNodeFields(this, in, __current);
            }
            case 819:
            {
                return ___setFEMBoundaryFields(this, in, __current);
            }
            case 820:
            {
                return ___setFEMConstraintCoefFields(this, in, __current);
            }
            case 821:
            {
                return ___setFEMConstraintsFields(this, in, __current);
            }
            case 822:
            {
                return ___setFEMContactGroup3Fields(this, in, __current);
            }
            case 823:
            {
                return ___setFEMContactPairsFields(this, in, __current);
            }
            case 824:
            {
                return ___setFEMContactSurfaceFields(this, in, __current);
            }
            case 825:
            {
                return ___setFEMCoordSystemFields(this, in, __current);
            }
            case 826:
            {
                return ___setFEMCrossSectionsFields(this, in, __current);
            }
            case 827:
            {
                return ___setFEMCurvMomentDataFields(this, in, __current);
            }
            case 828:
            {
                return ___setFEMDampingFields(this, in, __current);
            }
            case 829:
            {
                return ___setFEMDofFields(this, in, __current);
            }
            case 830:
            {
                return ___setFEMElasticMaterialFields(this, in, __current);
            }
            case 831:
            {
                return ___setFEMEndreleasesFields(this, in, __current);
            }
            case 832:
            {
                return ___setFEMForceStrainDataFields(this, in, __current);
            }
            case 833:
            {
                return ___setFEMGeneralFields(this, in, __current);
            }
            case 834:
            {
                return ___setFEMGeneralGroupFields(this, in, __current);
            }
            case 835:
            {
                return ___setFEMGeneralNodeFields(this, in, __current);
            }
            case 836:
            {
                return ___setFEMGroundMotionRecordFields(this, in, __current);
            }
            case 837:
            {
                return ___setFEMGroupFields(this, in, __current);
            }
            case 838:
            {
                return ___setFEMInitialTemperatureFields(this, in, __current);
            }
            case 839:
            {
                return ___setFEMIsoBeamFields(this, in, __current);
            }
            case 840:
            {
                return ___setFEMIsoBeamGroupFields(this, in, __current);
            }
            case 841:
            {
                return ___setFEMLinkFields(this, in, __current);
            }
            case 842:
            {
                return ___setFEMLoadMassProportionalFields(this, in, __current);
            }
            case 843:
            {
                return ___setFEMMCForceDataFields(this, in, __current);
            }
            case 844:
            {
                return ___setFEMMCrigiditiesFields(this, in, __current);
            }
            case 845:
            {
                return ___setFEMMTForceDataFields(this, in, __current);
            }
            case 846:
            {
                return ___setFEMMaterialFields(this, in, __current);
            }
            case 847:
            {
                return ___setFEMMatricesFields(this, in, __current);
            }
            case 848:
            {
                return ___setFEMMatrixDataFields(this, in, __current);
            }
            case 849:
            {
                return ___setFEMMatrixSetsFields(this, in, __current);
            }
            case 850:
            {
                return ___setFEMNKDisplForceFields(this, in, __current);
            }
            case 851:
            {
                return ___setFEMNLElasticMaterialsFields(this, in, __current);
            }
            case 852:
            {
                return ___setFEMNLElasticStrainStressFields(this, in, __current);
            }
            case 853:
            {
                return ___setFEMNMTimeMassFields(this, in, __current);
            }
            case 854:
            {
                return ___setFEMNTNContactFields(this, in, __current);
            }
            case 855:
            {
                return ___setFEMNodalMassFields(this, in, __current);
            }
            case 856:
            {
                return ___setFEMNodeFields(this, in, __current);
            }
            case 857:
            {
                return ___setFEMOrthotropicMaterialFields(this, in, __current);
            }
            case 858:
            {
                return ___setFEMPlasticBilinearMaterialFields(this, in, __current);
            }
            case 859:
            {
                return ___setFEMPlasticMlMaterialsFields(this, in, __current);
            }
            case 860:
            {
                return ___setFEMPlasticStrainStressFields(this, in, __current);
            }
            case 861:
            {
                return ___setFEMPlateFields(this, in, __current);
            }
            case 862:
            {
                return ___setFEMPlateGroupFields(this, in, __current);
            }
            case 863:
            {
                return ___setFEMPointsFields(this, in, __current);
            }
            case 864:
            {
                return ___setFEMPropertiesFields(this, in, __current);
            }
            case 865:
            {
                return ___setFEMPropertysetsFields(this, in, __current);
            }
            case 866:
            {
                return ___setFEMSectionBoxFields(this, in, __current);
            }
            case 867:
            {
                return ___setFEMSectionIFields(this, in, __current);
            }
            case 868:
            {
                return ___setFEMSectionPipeFields(this, in, __current);
            }
            case 869:
            {
                return ___setFEMSectionPropFields(this, in, __current);
            }
            case 870:
            {
                return ___setFEMSectionRectFields(this, in, __current);
            }
            case 871:
            {
                return ___setFEMShellAxesOrthoDataFields(this, in, __current);
            }
            case 872:
            {
                return ___setFEMShellAxesOrthoFields(this, in, __current);
            }
            case 873:
            {
                return ___setFEMShellDOFFields(this, in, __current);
            }
            case 874:
            {
                return ___setFEMShellFields(this, in, __current);
            }
            case 875:
            {
                return ___setFEMShellGroupFields(this, in, __current);
            }
            case 876:
            {
                return ___setFEMShellLayerFields(this, in, __current);
            }
            case 877:
            {
                return ___setFEMShellPressureFields(this, in, __current);
            }
            case 878:
            {
                return ___setFEMSkewDOFFields(this, in, __current);
            }
            case 879:
            {
                return ___setFEMSkewSysAnglesFields(this, in, __current);
            }
            case 880:
            {
                return ___setFEMSkeySysNodeFields(this, in, __current);
            }
            case 881:
            {
                return ___setFEMSpringFields(this, in, __current);
            }
            case 882:
            {
                return ___setFEMSpringGroupFields(this, in, __current);
            }
            case 883:
            {
                return ___setFEMStrLinesFields(this, in, __current);
            }
            case 884:
            {
                return ___setFEMThermoIsoDataFields(this, in, __current);
            }
            case 885:
            {
                return ___setFEMThermoIsoMaterialsFields(this, in, __current);
            }
            case 886:
            {
                return ___setFEMThermoOrthDataFields(this, in, __current);
            }
            case 887:
            {
                return ___setFEMThermoOrthMaterialsFields(this, in, __current);
            }
            case 888:
            {
                return ___setFEMThreeDSolidFields(this, in, __current);
            }
            case 889:
            {
                return ___setFEMThreeDSolidGroupFields(this, in, __current);
            }
            case 890:
            {
                return ___setFEMTimeFunctionDataFields(this, in, __current);
            }
            case 891:
            {
                return ___setFEMTimeFunctionsFields(this, in, __current);
            }
            case 892:
            {
                return ___setFEMTrussFields(this, in, __current);
            }
            case 893:
            {
                return ___setFEMTrussGroupFields(this, in, __current);
            }
            case 894:
            {
                return ___setFEMTwistMomentDataFields(this, in, __current);
            }
            case 895:
            {
                return ___setFEMTwoDSolidFields(this, in, __current);
            }
            case 896:
            {
                return ___setFEMTwoDSolidGroupFields(this, in, __current);
            }
            case 897:
            {
                return ___setMappingMatrixFields(this, in, __current);
            }
            case 898:
            {
                return ___setSensorFields(this, in, __current);
            }
            case 899:
            {
                return ___setSensorTimeDataFields(this, in, __current);
            }
            case 900:
            {
                return ___setStructureFields(this, in, __current);
            }
            case 901:
            {
                return ___setTransducerCycleDataFields(this, in, __current);
            }
            case 902:
            {
                return ___setTransducerFields(this, in, __current);
            }
            case 903:
            {
                return ___setTransducerTimeDataFields(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::SenStoreMngr was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::SenStoreMngr was not generated with stream support";
        throw ex;
    }
}
