--Script to create the entire database
  
--Geometery
  CREATE TABLE Systems (
    SystemID INT4,
    Type TEXT,
    Mode INT2,
    Xorigin FLOAT4,
    Yorigin FLOAT4,
    Zorigin FLOAT4,
    AX FLOAT4,
    AY FLOAT4,
    AZ FLOAT4,
    BX FLOAT4,
    BY FLOAT4,
    BZ FLOAT4,
    P1 INT4,
    P2 INT4,
    P3 INT4,
    Description TEXT,
    PRIMARY KEY (SystemID)
  );

  CREATE TABLE Points (
    PointID INT4,
    X FLOAT4,
    Y FLOAT4,
    Z FLOAT4,
    SystemID INT4,
    Description TEXT,
    PRIMARY KEY (PointID),
    FOREIGN KEY (SystemID) REFERENCES Systems (SystemID)
  );

  CREATE TABLE StrLines (
    LineID INT4,
    P1 INT4,
    P2 INT4,
    PRIMARY KEY (LineID),
    FOREIGN KEY (P1) REFERENCES Points (PointID),
    FOREIGN KEY (P2) REFERENCES Points (PointID)
  );
  
--Properties
  CREATE TABLE Properties (
    PropertyID INT4,
    --PropertyGraph??
    PropertyType TEXT,
    Rupture TEXT,
    XC FLOAT4,
    XN FLOAT4,
    Description TEXT,
    PRIMARY KEY (PropertyID)
  );
  
  CREATE TABLE Propertysets (
    PropertysetID INT4,
    K FLOAT4,
    M FLOAT4,
    C FLOAT4,
    S FLOAT4,
    Nonlinear TEXT,
    NK INT4,
    NM INT4,
    NC INT4,
    Description TEXT,
    PRIMARY KEY (PropertysetID),
    FOREIGN KEY (NK) REFERENCES Properties (PropertyID),
    FOREIGN KEY (NM) REFERENCES Properties (PropertyID),
    FOREIGN KEY (NC) REFERENCES Properties (PropertyID)
  );

--Nodes
  CREATE TABLE Nodes (
    NodeID INT4,
    X FLOAT4,
    Y FLOAT4,
    Z FLOAT4,
    SystemID INT4,
    Description TEXT,
    PRIMARY KEY (NodeID)
    --FOREIGN KEY (SystemID) REFERENCES Systems (SystemID)
  );

  CREATE TABLE InitialTemperatures (
    NodeID INT4,
    Temperature FLOAT4,
    PRIMARY KEY (NodeID)
  );

  CREATE TABLE Links (
    RLID INT4,
    SlaveNodeID INT4,
    MasterNodeID INT4,
    Displacement TEXT,
    Description TEXT,
    PRIMARY KEY (RLID),
    FOREIGN KEY (SlaveNodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MasterNodeID) REFERENCES Nodes (NodeID)
  );

--Materials
  CREATE TABLE MaterialTypes (
    MaterialType TEXT,
    Description TEXT,
    PRIMARY KEY (MaterialType)
  );

  CREATE TABLE Materials (
    MaterialID INT4,
    MaterialType TEXT,
    Description TEXT,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialType) REFERENCES MaterialTypes (MaterialType)
  );
  
  CREATE TABLE ElasticMaterials (
    MaterialID INT4,
    E FLOAT4,
    NU FLOAT4,
    Density FLOAT4,
    ALPHA FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE NLElasticMaterials (
    MaterialID INT4,
    Density FLOAT4,
    Dcurve FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

  CREATE TABLE OrthotropicMaterials (
    MaterialID INT4,
    EA FLOAT4,
    EB FLOAT4,
    EC FLOAT4,
    NUAB FLOAT4,
    NUAC FLOAT4,
    NUBC FLOAT4,
    GAB FLOAT4,
    GAC FLOAT4,
    GBC FLOAT4,
    Density FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE PlasticBIMaterials (
    MaterialID INT4,
    Hardening TEXT,
    E FLOAT4,
    NU FLOAT4,
    Density FLOAT4,
    ALPHA FLOAT4,
    TREF FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE PlasticMIMaterials (
    MaterialID INT4,
    Hardening TEXT,
    E FLOAT4,
    NU FLOAT4,
    Density FLOAT4,
    ALPHA FLOAT4,
    TREF FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE ThermoIsoMaterials (
    MaterialID INT4,
    TREF FLOAT4,
    Density FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE ThermoOrthoMaterials (
    MaterialID INT4,
    TREF FLOAT4,
    Density FLOAT4,
    PRIMARY KEY (MaterialID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

--create the sensor network tables
  CREATE TABLE Transducers (
    TransducerID INT4,
    Model TEXT,
    Type INT4,
    PRIMARY KEY (TransducerID)
  );

  CREATE TABLE Sensors (
    SensorID INT4,
    Model TEXT,
    PRIMARY KEY (SensorID)
  );

  CREATE TABLE Experiments (
    ExperimentID INT4,
    Frequency INT2,
    Duration INT4,
    BufferData INT4,
    PRIMARY KEY (ExperimentID)
  );

  CREATE TABLE Cycles (
    CycleID INT4,
    Time TIMESTAMP,
    ExperimentID INT4,
    PRIMARY KEY (CycleID),
    FOREIGN KEY (ExperimentID) REFERENCES Experiments (ExperimentID) ON DELETE RESTRICT
  );

  CREATE TABLE Structures (
    StructureID INT4,
    Name TEXT,
    Type TEXT,
    PRIMARY KEY (StructureID)
  );

  CREATE TABLE SensorTimeData (
    StructureID INT4,
    SensorID INT4,
    Channel INT2,
    StartTime TIMESTAMP,
    Status TEXT,
    NodeID INT4,
    PRIMARY KEY (SensorID, StructureID, StartTime),
    FOREIGN KEY (SensorID) REFERENCES Sensors (SensorID) ON DELETE RESTRICT,
    FOREIGN KEY (StructureID) REFERENCES Structures (StructureID) ON DELETE RESTRICT,
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE TransducerTimeData (
    TransducerID INT4,
    SensorID INT4,
    NodeID INT4,
    Orientation INT2,
    Amplification INT4,
    Channel INT2,
    Filter TEXT,
    StartTime TIMESTAMP,
    Status TEXT,
    PRIMARY KEY (TransducerID, SensorID, StartTime),
    FOREIGN KEY (TransducerID) REFERENCES Transducers (TransducerID) ON DELETE RESTRICT,
    FOREIGN KEY (SensorID) REFERENCES Sensors (SensorID) ON DELETE RESTRICT,
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE ExperimentStructureData (
    ExperimentID INT4,
    StructureID INT4,
    StartTime TIMESTAMP,
    Status TEXT,
    PRIMARY KEY (ExperimentID, StructureID, StartTime),
    FOREIGN KEY (ExperimentID) REFERENCES Experiments (ExperimentID) ON DELETE RESTRICT,
    FOREIGN KEY (StructureID) REFERENCES Structures (StructureID) ON DELETE RESTRICT
  );

  CREATE TABLE TransducerCycleData (
    TransducerID INT4,
    CycleID INT4,
    SoftwareScaling FLOAT4,
    PRIMARY KEY (TransducerID, CycleID),
    FOREIGN KEY (TransducerID) REFERENCES Transducers (TransducerID) ON DELETE RESTRICT,
    FOREIGN KEY (CycleID) REFERENCES Cycles (CycleID) ON DELETE RESTRICT
  );

--Sections
  CREATE TABLE SectionTypes (
    SectionType TEXT,
    Description TEXT,
    PRIMARY KEY (SectionType)
  );

  CREATE TABLE CrossSections (
    SectionID INT4,
    SectionType TEXT,
    Description TEXT,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionType) REFERENCES SectionTypes (SectionType)
  );
  
  CREATE TABLE SectionBox (
    SectionID INT4,
    Width FLOAT4,
    Height FLOAT4,
    Thick1 FLOAT4,
    Thick2 FLOAT4,
    SC FLOAT4,
    TC FLOAT4,
    Torfac FLOAT4,
    SSarea FLOAT4,
    TSarea FLOAT4,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );
  
  CREATE TABLE SectionI (
    SectionID INT4,
    Width1 FLOAT4,
    Height FLOAT4,
    Width2 FLOAT4,
    Thick1 FLOAT4,
    Thick2 FLOAT4,
    Thick3 FLOAT4,
    SC FLOAT4,
    TC FLOAT4,
    Torfac FLOAT4,
    SSarea FLOAT4,
    TSarea FLOAT4,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );
  
  CREATE TABLE SectionPipe (
    SectionID INT4,
    Diameter FLOAT4,
    Thickness FLOAT4,
    SC FLOAT4,
    TC FLOAT4,
    Torfac FLOAT4,
    SSarea FLOAT4,
    TSarea FLOAT4,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );
  
  CREATE TABLE SectionProp (
    SectionID INT4,
    Rinertia FLOAT4,
    Sinertia FLOAT4,
    Tinertia FLOAT4,
    Area FLOAT4,
    Sarea FLOAT4,
    Tarea FLOAT4,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );
   
  CREATE TABLE SectionRect (
    SectionID INT4,
    Width FLOAT4,
    Height FLOAT4,
    SC FLOAT4,
    TC FLOAT4,
    Torfac FLOAT4,
    SSarea FLOAT4,
    TSarea FLOAT4,
    IShear TEXT,
    PRIMARY KEY (SectionID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );

--Skew
  CREATE TABLE SkewSysAngles (
    SkewSystemID INT4,
    PHI FLOAT4,
    THETA FLOAT4,
    XSI FLOAT4,
    Description TEXT,
    PRIMARY KEY (SkewSystemID)
  );
   
  CREATE TABLE SkewDOFs (
    NodeID INT4,
    SkewSystemID INT4,
    Description TEXT,
    PRIMARY KEY (NodeID),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (SkewSystemID) REFERENCES SkewSysAngles (SkewSystemID)
  );
   
  CREATE TABLE SkewSysNodes (
    SkewSystemID INT4,
    Node1 INT4,
    Node2 INT4,
    Node3 INT4,
    Description TEXT,
    PRIMARY KEY (SkewSystemID),
    FOREIGN KEY (Node1) REFERENCES Nodes (NodeID),
    FOREIGN KEY (Node2) REFERENCES Nodes (NodeID),
    FOREIGN KEY (Node3) REFERENCES Nodes (NodeID)
  );

--Matrices
  CREATE TABLE Dampings (
    GroupLocalID INT4,
    ALPHA FLOAT4,
    BETA FLOAT4,
    PRIMARY KEY (GroupLocalID)
  );

  CREATE TABLE Matrices (
    MatrixID INT4,
    MatrixType TEXT,
    NS INT4, 
    ND INT4,
    Lump BOOLEAN,
    Description TEXT,
    PRIMARY KEY (MatrixID)
  );
  
  CREATE TABLE MatrixData (
    MatrixID INT4,
    RowIndex INT4,
    ColumnIndex INT4,
    Coeff FLOAT8,
    PRIMARY KEY (MatrixID, RowIndex, ColumnIndex)
  );
  
  CREATE TABLE MatrixSets (
    MatrixSetID INT4,
    Stiffness INT4,
    Mass INT4,
    Damping INT4,
    Stress INT4,
    Description TEXT,
    PRIMARY KEY (MatrixSetID),
    FOREIGN KEY (Stiffness) REFERENCES Matrices (MatrixID),
    FOREIGN KEY (Mass) REFERENCES Matrices (MatrixID),
    FOREIGN KEY (Damping) REFERENCES Matrices (MatrixID),
    FOREIGN KEY (Stress) REFERENCES Matrices (MatrixID)
  );

--Data
  CREATE TABLE CurvMomentData (
    RecordNmb SERIAL,
    CurvMomentID INT4,
    Curvature FLOAT4,
    Moment FLOAT4,
    PRIMARY KEY (RecordNmb)
  );
  
  CREATE TABLE ForceStrainData (
    RecordNmb SERIAL,
    ForceAxID INT4,
    Strain FLOAT4,
    Force FLOAT4,
    PRIMARY KEY (RecordNmb)
  );
  
  CREATE TABLE MCForceData (
    RecordNmb SERIAL,
    MomentSTID INT4,
    Force INT4,
    CurvMomentID INT4,
    PRIMARY KEY (RecordNmb)
  );

  CREATE TABLE TwistMomentData (
    RecordNmb SERIAL,
    TwistMomentID INT4,
    Twist FLOAT4,
    Moment FLOAT4,
    PRIMARY KEY (RecordNmb)
  );

  CREATE TABLE MTForceData (
    RecordNmb INT4,
    MomentRID INT4,
    Force INT4,
    TwistMomentID INT4,
    PRIMARY KEY (MomentRID)
  );
  
  CREATE TABLE MCrigidities (
    RigidityID INT4,
    Hardening TEXT,
    Beta FLOAT4,
    ForceAxID INT4,
    MomentRID INT4,
    MomentSID INT4,
    MomentTID INT4,
    AxialCF FLOAT4,
    BendingCF FLOAT4,
    TorsionCF FLOAT4,
    Density FLOAT4,
    MassArea FLOAT4,
    MassR FLOAT4,
    MassS FLOAT4,
    MassT FLOAT4,
    AcurveType TEXT,
    TcurveType TEXT,
    BcurveType TEXT,
    Alpha FLOAT4,
    PRIMARY KEY (RigidityID)
  );
  
  CREATE TABLE LoadMassProportional (
    LoadID INT4,
    Magnitude FLOAT4,
    AX FLOAT4,
    AY FLOAT4,
    AZ FLOAT4,
    PRIMARY KEY (LoadID)
  );

  CREATE TABLE NKDisplForce (
    RecordNmb SERIAL,
    PropertyID INT4,
    Displacement FLOAT4,
    Force FLOAT4,
    PRIMARY KEY (RecordNmb),
    FOREIGN KEY (PropertyID) REFERENCES Properties (PropertyID)
  );

  CREATE TABLE NLElasticStrainStress (
    RecordNmb SERIAL,
    MaterialID INT4,
    Strain FLOAT4,
    Stress FLOAT4,
    PRIMARY KEY (RecordNmb),
    FOREIGN KEY (MaterialID) REFERENCES ElasticMaterials (MaterialID)
  );

  CREATE TABLE NMTimeMass (
    RecordNmb SERIAL,
    PropertyID INT4,
    TimeValue TIMESTAMP,
    Mass FLOAT4,
    PRIMARY KEY (RecordNmb),
    FOREIGN KEY (PropertyID) REFERENCES Properties (PropertyID)
  );

  CREATE TABLE NodalMasses (
    NodeID INT4,
    Mass1 FLOAT4,
    Mass2 FLOAT4,
    Mass3 FLOAT4,
    Mass4 FLOAT4,
    Mass5 FLOAT4,
    Mass6 FLOAT4,
    Description TEXT,
    PRIMARY KEY (NodeID),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE PlasticStrainStress (
    RecordNmb SERIAL,
    MaterialID INT4,
    Strain FLOAT4,
    Stress FLOAT4,
    PRIMARY KEY (RecordNmb),
    FOREIGN KEY (MaterialID) REFERENCES PlasticBIMaterials (MaterialID)
  );
  
  CREATE TABLE ThermoIsoData (
    RecordNmb SERIAL,
    MaterialID INT4,
    Theta FLOAT4,
    E FLOAT4,
    NU FLOAT4,
    ALPHA FLOAT4,
    PRIMARY KEY (RecordNmb),
    FOREIGN KEY (MaterialID) REFERENCES ThermoIsoMaterials (MaterialID)
  );
  
  CREATE TABLE ThermoOrthoData (
    RecordNum SERIAL,
    MaterialID INT4,
    Theta FLOAT4,
    EA FLOAT4,
    EB FLOAT4,
    EC FLOAT4,
    NUAB FLOAT4,
    NUAC FLOAT4,
    NUBC FLOAT4,
    GAB FLOAT4,
    GAC FLOAT4,
    GBC FLOAT4,
    ALPHAA FLOAT4,
    ALPHAB FLOAT4,
    ALPHAC FLOAT4,
    PRIMARY KEY (RecordNum),
    FOREIGN KEY (MaterialID) REFERENCES ThermoOrthoMaterials (MaterialID)
  );

--Groups
  CREATE TABLE GroupTypes (
    GroupType TEXT,
    Description TEXT,
    PRIMARY KEY (GroupType)
  );

  CREATE TABLE Groups (
    GroupLocalID INT4,
    StructureID INT4,
    GroupType TEXT,
    --GeometeryFigure??
    Description TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (StructureID) REFERENCES Structures (StructureID),
    FOREIGN KEY (GroupType) REFERENCES GroupTypes (GroupType)
  );
  
  CREATE TABLE BeamGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    SectionID INT4,
    RINT INT4,
    SINT INT4,
    TINT INT4,
    Result TEXT,
    IniStrain TEXT,
    REtype TEXT,
    MC TEXT,
    MCrigidity INT4,
    REmultiplyer FLOAT4,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
    --FOREIGN KEY (MCrigidity) REFERENCES MCrigidities (RigidityID)
  );

  CREATE TABLE GeneralGroups (
    GroupLocalID INT4,
    MatrixSet INT4,
    Result TEXT,
    SkewSystem TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MatrixSet) REFERENCES matrices (MatrixID)
  );
  
  CREATE TABLE IsobeamGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    SectionID INT4,
    Result TEXT,
    IniStrain TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );
  
  CREATE TABLE PlateGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    Result TEXT,
    IniStrain TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE ShellGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    Thickness INT4,
    Result TEXT,
    StressReference TEXT,
    NLayers INT4,
    SectionResult INT4,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE SpringGroups (
    GroupLocalID INT4,
    PropertySet INT4,
    Result TEXT,
    Nonlinear TEXT,
    SkewSystem TEXT,
    Bolt TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (PropertySet) REFERENCES Propertysets (PropertysetID)
  );

  CREATE TABLE ThreedsolidGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    Result TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE TrussGroups (
    GroupLocalID INT4,
    Displacement TEXT,
    MaterialID INT4,
    SectionArea FLOAT4,
    GAPS TEXT,
    IniStrain TEXT,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );
  
  CREATE TABLE TwodsolidGroups (
    GroupLocalID INT4,
    Subtype TEXT,
    Displacement TEXT,
    MaterialID INT4,
    Result TEXT,
    AuxNode INT4,
    PRIMARY KEY (GroupLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID),
    FOREIGN KEY (AuxNode) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE AxesNodes (
    AxNodeID INT4,
    GroupLocalID INT4,
    Node1 INT4,
    Node2 INT4,
    Node3 INT4,
    PRIMARY KEY (GroupLocalID, AxNodeID),
    FOREIGN KEY (AxNodeID) REFERENCES Systems (SystemID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
    FOREIGN KEY (Node1) REFERENCES Nodes (NodeID),
    FOREIGN KEY (Node2) REFERENCES Nodes (NodeID),
    FOREIGN KEY (Node3) REFERENCES Nodes (NodeID)
  );

--TimeFunction
  CREATE TABLE TimeFunctions (
    TimeFunctionID INT4,
    --TimeFunctionGraph OLE Object??
    Description TEXT,
    PRIMARY KEY (TimeFunctionID)
  );

  CREATE TABLE GroundMotionRecord (
    GMRecordID INT4,
    GMRecordName TEXT,
    Description TEXT,
    PRIMARY KEY (GMRecordID)
  );
  
  CREATE TABLE TimeFunctionData (
    GMRecordID INT4,
    TimeFunctionID INT4,
    DataTime TIMESTAMP,
    TimeValue FLOAT4,
    PRIMARY KEY (TimeFunctionID, DataTime),
    FOREIGN KEY (GMRecordID) REFERENCES GroundMotionRecord (GMRecordID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
  );

--Constraints
  CREATE TABLE Constraints (
    ConstraintID INT4,
    SlaveNode INT4,
    SlaveDOF TEXT,
    Description TEXT,
    PRIMARY KEY (ConstraintID),
    FOREIGN KEY (SlaveNode) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE ConstraintCoef (
    ConstraintID INT4,
    MasterNode INT4,
    MasterDOF TEXT,
    Coefficient FLOAT4,
    Description TEXT,
    PRIMARY KEY (ConstraintID, MasterNode),
    FOREIGN KEY (ConstraintID) REFERENCES Constraints (ConstraintID),
    FOREIGN KEY (MasterNode) REFERENCES Nodes (NodeID)
  );

--Threedsolids
  CREATE TABLE Threedsolids (
    GroupLocalID INT4,
    ElementLocalID INT4,
    NodeAmount INT2,
      N1 INT4,
      N2 INT4,
      N3 INT4,
      N4 INT4,
      N5 INT4,
      N6 INT4,
      N7 INT4,
      N8 INT4,
      N9 INT4,
      N10 INT4,
      N11 INT4,
      N12 INT4,
      N13 INT4,
      N14 INT4,
      N15 INT4,
      N16 INT4,
      N17 INT4,
      N18 INT4,
      N19 INT4,
      N20 INT4,
      N21 INT4,
      N22 INT4,
      N23 INT4,
      N24 INT4,
      N25 INT4,
      N26 INT4,
      N27 INT4,
    MaterialID INT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Maxes INT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N4) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N5) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N6) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N7) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N8) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N9) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N10) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N11) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N12) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N13) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N14) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N15) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N16) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N17) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N18) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N19) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N20) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N21) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N22) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N23) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N24) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N25) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N26) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N27) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID),
    FOREIGN KEY (Maxes) REFERENCES Systems (SystemID)
  );

--Twodsolids
  CREATE TABLE Twodsolids (
    GroupLocalID INT4,
    ElementLocalID INT4,
    NodeAmount INT2,
      N1 INT4,
      N2 INT4,
      N3 INT4,
      N4 INT4,
      N5 INT4,
      N6 INT4,
      N7 INT4,
      N8 INT4,
      N9 INT4,
    MaterialID INT4,
    Thick FLOAT4,
    Bet FLOAT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES TwodsolidGroups (GroupLocalID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N4) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N5) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N6) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N7) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N8) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N9) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

--Generals
  CREATE TABLE Generals (
    GroupLocalID INT4,
    ElementLocalID INT4,
    NodeAmount INT4,
    MatrixSet INT4,
    Save TEXT,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES GeneralGroups (GroupLocalID),
    FOREIGN KEY (MatrixSet) REFERENCES MatrixSets (MatrixSetID)
  );

  CREATE TABLE GeneralNodes (
    NodeID INT4,
    GroupLocalID INT4,
    ElementLocalID INT4,
    LocalNmb INT4,
    PRIMARY KEY (NodeID, LocalNmb),
    FOREIGN KEY (LocalNmb) REFERENCES Nodes (NodeID),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID)
  );
  
--Beams
  CREATE TABLE Endreleases (
    EndRelease INT4,
    Moment1 INT4,
    Moment2 INT4,
    Moment3 INT4,
    Moment4 INT4,
    Moment5 INT4,
    Moment6 INT4,
    Description TEXT,
    PRIMARY KEY (EndRelease)
  );

  CREATE TABLE Beams (
    GroupLocalID INT4,
    ElementLocalID INT4,
    AUX INT4,
    N1 INT4,
    N2 INT4,
    MaterialID INT4,
    SectionID INT4,
    EndRelease INT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Epsin FLOAT4,
    IRigidEnd FLOAT4,
    JRigidEnd FLOAT4,
    Subdivision INT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES BeamGroups (GroupLocalID),
    FOREIGN KEY (AUX) REFERENCES Nodes (NodeID),
    FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
    FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
    --FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID),
    --FOREIGN KEY (Endrelease) REFERENCES Endreleases (Endrelease)
  );

  CREATE TABLE BeamLoads (
    GroupLocalID INT4,
    ElementLocalID INT4,
    Face INT4,
    P1 FLOAT4,
    P2 FLOAT4,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    DirectFilter INT2,
    DeformDepend BOOLEAN,
    PRIMARY KEY (GroupLocalID, ElementLocalID, ArrivalTime),
    FOREIGN KEY (GroupLocalID) REFERENCES BeamGroups (GroupLocalID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
  );

  CREATE TABLE Boundaries (
    NodeID INT4,
    Ux TEXT,
    Uy TEXT,
    Uz TEXT,
    Rx TEXT,
    Ry TEXT,
    Rz TEXT,
    Phi TEXT,
    Ovalization TEXT,
    Warping TEXT,
    PRIMARY KEY (NodeID),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID)
  );

--Isobeams
  CREATE TABLE Isobeams (
    GroupLocalID INT4,
    ElementLocalID INT4,
    AUX INT4,
    NodeAmount INT2,
      N1 INT4,
      N2 INT4,
      N3 INT4,
      N4 INT4,
    MaterialID INT4,
    SectionID INT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Epaxl FLOAT4,
    Ephoop FLOAT4,
    Deocription TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (AUX) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N4) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID),
    FOREIGN KEY (SectionID) REFERENCES CrossSections (SectionID)
  );

--Plates
  CREATE TABLE Plates (
    GroupLocalID INT4,
    ElementLocalID INT4,
      N1 INT4,
      N2 INT4,
      N3 INT4,
    MaterialID INT4,
    Thick FLOAT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Meps11 FLOAT4,
    Meps22 FLOAT4,
    Meps12 FLOAT4,
    Flex11 FLOAT4,
    Flex22 FLOAT4,
    Flex12 FLOAT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES PlateGroups (GroupLocalID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

--Shells
  CREATE TABLE ShellAxesOrtho (
    AxOrthoID INT4,
    LineID INT4,
    ALFA INT4,
    GroupLocalID INT4,
    PRIMARY KEY (AxOrthoID),
    FOREIGN KEY (LineID) REFERENCES StrLines (LineID),
    FOREIGN KEY (GroupLocalID) REFERENCES Groups (GroupLocalID)
  );
  
  CREATE TABLE ShellAxesOrthoData (
    AxOrthoID INT4,
    ElementLocalID INT4,
    PRIMARY KEY (AxOrthoID, ElementLocalID)
  );
  
  CREATE TABLE ShellDOFs (
    NodeID INT4,
    DOFnumber TEXT,
    VectorID INT4,
    PRIMARY KEY (NodeID),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID)
  );
  
  CREATE TABLE ShellLayers (
    GroupLocalID INT4,
    LayerNumber INT4,
    MaterialID INT4,
    PThick FLOAT4,
    PRIMARY KEY (GroupLocalID, LayerNumber),
    FOREIGN KEY (GroupLocalID) REFERENCES ShellGroups (GroupLocalID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

  CREATE TABLE ShellPressure (
    GroupLocalID INT4,
    ElementLocalID INT4,
    Face INT2,
    P1 FLOAT4,
    P2 FLOAT4,
    P3 FLOAT4,
    P4 FLOAT4,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    DirectFilter INT2,
    DeformDepend BOOLEAN,
    Nodaux INT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES ShellGroups (GroupLocalID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID),
    FOREIGN KEY (Nodaux) REFERENCES Nodes (NodeID)
  );

  CREATE TABLE Shells (
    GroupLocalID INT4,
    ElementLocalID INT4,
    NodeAmount INT2,
      N1 INT4,
      N2 INT4,
      N3 INT4,
      N4 INT4,
      N5 INT4,
      N6 INT4,
      N7 INT4,
      N8 INT4,
      N9 INT4,
    MaterialID INT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
      T1 INT4,
      T2 INT4,
      T3 INT4,
      T4 INT4,
      T5 INT4,
      T6 INT4,
      T7 INT4,
      T8 INT4,
      T9 INT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES ShellGroups (GroupLocalID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N4) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N5) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N6) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N7) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N8) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N9) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

--Springs
  CREATE TABLE Springs (
    GroupLocalID INT4,
    ElementLocalID INT4,
    N1 INT4,
    ID1 INT4,
    N2 INT4,
    ID2 INT4,
    PropertySet INT4,
    Save TEXT,
    AX FLOAT4,
    AY FLOAT4,
    AZ FLOAT4,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
    FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
    FOREIGN KEY (PropertySet) REFERENCES Propertysets (PropertysetID)
  );

--Trusses
  CREATE TABLE Trusses (
    GroupLocalID INT4,
    ElementLocalID INT4,
      N1 INT4,
      N2 INT4,
    MaterialID INT4,
    SectionArea FLOAT4,
    Save TEXT,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Epsin FLOAT4,
    Gapwidth FLOAT4,
    Description TEXT,
    PRIMARY KEY (GroupLocalID, ElementLocalID),
    FOREIGN KEY (GroupLocalID) REFERENCES TrussGroups (GroupLocalID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
    FOREIGN KEY (MaterialID) REFERENCES Materials (MaterialID)
  );

--Contact
  CREATE TABLE ContactGroup3 (
    ContGroupID INT4,
    Forces TEXT,
    Tractions TEXT,
    NodeToNode TEXT,
    Friction FLOAT4,
    IniPenetration TEXT,
    PenetrAlgorithm TEXT,
    Depth FLOAT4,
    Off_set FLOAT4,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    Tied TEXT,
    TiedOffset FLOAT4,
    Tolerance FLOAT4,
    Description TEXT,
    PRIMARY KEY (ContGroupID),
    FOREIGN KEY (ContGroupID) REFERENCES Groups (GroupLocalID)
  );
  
  CREATE TABLE ContactSurfaces (
    ContGroupID INT4,
    ContSurface INT4,
    ContSegment INT4,
      N1 INT4,
      N2 INT4,
      N3 INT4,
      N4 INT4,
    PRIMARY KEY (ContGroupID, ContSurface),
    FOREIGN KEY (ContGroupID) REFERENCES ContactGroup3 (ContGroupID),
      FOREIGN KEY (N1) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N2) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N3) REFERENCES Nodes (NodeID),
      FOREIGN KEY (N4) REFERENCES Nodes (NodeID),
    UNIQUE (ContSurface)
  );

  CREATE TABLE ContactPairs (
    ContGroupID INT4,
    ContPair INT4,
    TargetSurf INT4,
    ContactorSurf INT4,
    Friction FLOAT4,
    TBirth TIMESTAMP,
    TDeath TIMESTAMP,
    HeatTransf FLOAT4,
    FContactor FLOAT4,
    FTarget FLOAT4,
    PRIMARY KEY (ContGroupID, ContPair),
    FOREIGN KEY (ContGroupID) REFERENCES ContactGroup3 (ContGroupID),
    FOREIGN KEY (TargetSurf) REFERENCES ContactSurfaces (ContSurface),
    FOREIGN KEY (ContactorSurf) REFERENCES ContactSurfaces (ContSurface),
    UNIQUE (ContPair)
  );
  
  CREATE TABLE NTNContact (
    ContGroupID INT4,
    ContPair INT4,
    TargetNode INT4,
    ContactorNode INT4,
    PrintRes TEXT,
    SaveRes TEXT,
    TargetNx FLOAT4,
    TargetNy FLOAT4,
    TargetNz FLOAT4,
    PRIMARY KEY (ContGroupID, ContPair),
    FOREIGN KEY (ContGroupID) REFERENCES ContactGroup3 (ContGroupID),
    FOREIGN KEY (ContPair) REFERENCES ContactPairs (ContPair),
    FOREIGN KEY (ContactorNode) REFERENCES Nodes (NodeID),
    FOREIGN KEY (TargetNode) REFERENCES Nodes (NodeID)
  );

--Applieds
  CREATE TABLE AppliedConcentratedLoads (
    NodeID INT4,
    Direction INT2,
    Factor FLOAT4,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    Nodaux INT4,
    Description TEXT,
    PRIMARY KEY (NodeID, ArrivalTime),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
    --FOREIGN KEY (Nodaux) REFERENCES Nodes (NodeID)
  );
    
  CREATE TABLE AppliedDisplacements (
    NodeID INT4,
    Direction INT2,
    Factor FLOAT4,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    Description TEXT,
    PRIMARY KEY (NodeID, ArrivalTime),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
  );

  CREATE TABLE AppliedLoads (
    AppliedLoadNmb INT4,
    LoadType TEXT,
    LoadID INT4,
    SiteType TEXT,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    PRIMARY KEY (AppliedLoadNmb),
    FOREIGN KEY (LoadID) REFERENCES LoadMassProportional (LoadID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
  );

  CREATE TABLE AppliedTemperatures (
    NodeID INT4,
    Factor FLOAT4,
    TimeFunctionID INT4,
    ArrivalTime TIMESTAMP,
    PRIMARY KEY (NodeID, ArrivalTime),
    FOREIGN KEY (NodeID) REFERENCES Nodes (NodeID),
    FOREIGN KEY (TimeFunctionID) REFERENCES TimeFunctions (TimeFunctionID)
  );

