/**
 */
package ciat.impl;

import ciat.AbstractTask;
import ciat.Acting;
import ciat.Actor;
import ciat.Aggregation;
import ciat.ApplicationTask;
import ciat.Association;
import ciat.Attribute;
import ciat.CIATDiagram;
import ciat.CTTAbstractTask;
import ciat.CTTCollaborativeTask;
import ciat.CTTDiagram;
import ciat.CTTTask;
import ciat.CiatFactory;
import ciat.CiatPackage;
import ciat.CollaborativeArea;
import ciat.CollaborativeTask;
import ciat.CollaborativeVisualization;
import ciat.ConcurrencyWithInformationPassing;
import ciat.Condition;
import ciat.CooperativeTask;
import ciat.Dependency;
import ciat.DependencyElement;
import ciat.DeterministicChoice;
import ciat.Disabling;
import ciat.DisablingWithInformationPassing;
import ciat.DomainDiagram;
import ciat.Enabling;
import ciat.EnablingWithInformationPassing;
import ciat.End;
import ciat.ExclusiveEdition;
import ciat.ExclusiveEditionArea;
import ciat.Group;
import ciat.IndependentConcurrency;
import ciat.IndividualArea;
import ciat.IndividualTask;
import ciat.IndividualVisualization;
import ciat.Inheritance;
import ciat.Init;
import ciat.InteractiveTask;
import ciat.Link;
import ciat.Notification;
import ciat.Operation;
import ciat.OrderIndependence;
import ciat.ProcessDiagram;
import ciat.ProcessNode;
import ciat.Rol;
import ciat.ShAggregationLink;
import ciat.ShAssociationLink;
import ciat.ShGeneralizationLink;
import ciat.SharedLink;
import ciat.SharedObject;
import ciat.SimpleTask;
import ciat.Sociogram;
import ciat.SociogramLink;
import ciat.SociogramNode;
import ciat.SoftwareAgent;
import ciat.SuspendResume;
import ciat.Team;
import ciat.TemporalCondition;
import ciat.Tool;
import ciat.UndeterministicChoice;
import ciat.UserTask;
import ciat.VisualizationArea;
import ciat.Visualizations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CiatPackageImpl extends EPackageImpl implements CiatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciatDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooperativeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEditionAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shAssociationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shGeneralizationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shAggregationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttAbstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactiveTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttCollaborativeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disablingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disablingWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass independentConcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderIndependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendResumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undeterministicChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualizationsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ciat.CiatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CiatPackageImpl() {
		super(eNS_URI, CiatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CiatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CiatPackage init() {
		if (isInited) return (CiatPackage)EPackage.Registry.INSTANCE.getEPackage(CiatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCiatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CiatPackageImpl theCiatPackage = registeredCiatPackage instanceof CiatPackageImpl ? (CiatPackageImpl)registeredCiatPackage : new CiatPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCiatPackage.createPackageContents();

		// Initialize created meta-data
		theCiatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCiatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CiatPackage.eNS_URI, theCiatPackage);
		return theCiatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIATDiagram() {
		return ciatDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIATDiagram_ItsSociograms() {
		return (EReference)ciatDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIATDiagram_ItsProcessDiagrams() {
		return (EReference)ciatDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIATDiagram_ItsDomainDiagrams() {
		return (EReference)ciatDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIATDiagram_ItsCttDiagrams() {
		return (EReference)ciatDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIATDiagram_ItsLinks() {
		return (EReference)ciatDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSociogram() {
		return sociogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSociogram_Name() {
		return (EAttribute)sociogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSociogram_ItsSociogramNodes() {
		return (EReference)sociogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSociogramNode() {
		return sociogramNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSociogramNode_Name() {
		return (EAttribute)sociogramNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_ItsTeam() {
		return (EReference)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_ItsActor() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_Supertype() {
		return (EReference)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_Subtype() {
		return (EReference)rolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_ItsGroup() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Acts() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareAgent() {
		return softwareAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_Contains() {
		return (EReference)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Contains() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSociogramLink() {
		return sociogramLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSociogramLink_Source() {
		return (EReference)sociogramLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSociogramLink_Target() {
		return (EReference)sociogramLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInheritance_Condition() {
		return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActing() {
		return actingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActing_Name() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActing_N() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActing_M() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_Name() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_N() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_M() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessDiagram() {
		return processDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDiagram_Name() {
		return (EAttribute)processDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDiagram_ProcessNodes() {
		return (EReference)processDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessNode() {
		return processNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInit() {
		return initEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInit_Name() {
		return (EAttribute)initEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnd_Name() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleTask() {
		return simpleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleTask_Name() {
		return (EAttribute)simpleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleTask_Tools() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualTask() {
		return individualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualTask_TaskRoles() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualTask_TaskObjects() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCooperativeTask() {
		return cooperativeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCooperativeTask_TaskRoles() {
		return (EReference)cooperativeTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCooperativeTask_TaskObjects() {
		return (EReference)cooperativeTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeTask() {
		return collaborativeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeTask_TaskRoles() {
		return (EReference)collaborativeTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeTask_TaskObjects() {
		return (EReference)collaborativeTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTask() {
		return abstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTask_ProcessNodes() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Name() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObject_Name() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_Object() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObject_Modifier() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_ModifiedBy() {
		return (EReference)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalCondition() {
		return temporalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalCondition_Name() {
		return (EAttribute)temporalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Name() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainDiagram() {
		return domainDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDiagram_Name() {
		return (EAttribute)domainDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainDiagram_SharedContext() {
		return (EReference)domainDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSharedObject() {
		return sharedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSharedObject_Name() {
		return (EAttribute)sharedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSharedObject_ItsVisualization() {
		return (EAttribute)sharedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedObject_Incomings() {
		return (EReference)sharedObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedObject_Outgoings() {
		return (EReference)sharedObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedObject_Attributes() {
		return (EReference)sharedObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedObject_Operations() {
		return (EReference)sharedObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedObject_VAreas() {
		return (EReference)sharedObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualizationArea() {
		return visualizationAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVisualizationArea_Name() {
		return (EAttribute)visualizationAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusiveEditionArea() {
		return exclusiveEditionAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeArea() {
		return collaborativeAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualArea() {
		return individualAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSharedLink() {
		return sharedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedLink_Source() {
		return (EReference)sharedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSharedLink_Target() {
		return (EReference)sharedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShAssociationLink() {
		return shAssociationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShGeneralizationLink() {
		return shGeneralizationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShAggregationLink() {
		return shAggregationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCTTDiagram() {
		return cttDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCTTDiagram_Name() {
		return (EAttribute)cttDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCTTDiagram_CttTasks() {
		return (EReference)cttDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCTTTask() {
		return cttTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCTTTask_Name() {
		return (EAttribute)cttTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCTTTask_Dependencies() {
		return (EReference)cttTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusiveEdition() {
		return exclusiveEditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeVisualization() {
		return collaborativeVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualVisualization() {
		return individualVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCTTAbstractTask() {
		return cttAbstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractiveTask() {
		return interactiveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCTTCollaborativeTask() {
		return cttCollaborativeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationTask() {
		return applicationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyElement() {
		return dependencyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Source() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Target() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnabling() {
		return enablingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnabling_ELabel() {
		return (EAttribute)enablingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisabling() {
		return disablingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisabling_DLabel() {
		return (EAttribute)disablingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnablingWithInformationPassing() {
		return enablingWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnablingWithInformationPassing_EwLabel() {
		return (EAttribute)enablingWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisablingWithInformationPassing() {
		return disablingWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisablingWithInformationPassing_DwLabel() {
		return (EAttribute)disablingWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndependentConcurrency() {
		return independentConcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndependentConcurrency_IcLabel() {
		return (EAttribute)independentConcurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderIndependence() {
		return orderIndependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderIndependence_OiLabel() {
		return (EAttribute)orderIndependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuspendResume() {
		return suspendResumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuspendResume_SrLabel() {
		return (EAttribute)suspendResumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyWithInformationPassing() {
		return concurrencyWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyWithInformationPassing_CLabel() {
		return (EAttribute)concurrencyWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeterministicChoice() {
		return deterministicChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeterministicChoice_DtLabel() {
		return (EAttribute)deterministicChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndeterministicChoice() {
		return undeterministicChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUndeterministicChoice_UcLabel() {
		return (EAttribute)undeterministicChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVisualizations() {
		return visualizationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiatFactory getCiatFactory() {
		return (CiatFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ciatDiagramEClass = createEClass(CIAT_DIAGRAM);
		createEReference(ciatDiagramEClass, CIAT_DIAGRAM__ITS_SOCIOGRAMS);
		createEReference(ciatDiagramEClass, CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS);
		createEReference(ciatDiagramEClass, CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS);
		createEReference(ciatDiagramEClass, CIAT_DIAGRAM__ITS_CTT_DIAGRAMS);
		createEReference(ciatDiagramEClass, CIAT_DIAGRAM__ITS_LINKS);

		linkEClass = createEClass(LINK);

		sociogramEClass = createEClass(SOCIOGRAM);
		createEAttribute(sociogramEClass, SOCIOGRAM__NAME);
		createEReference(sociogramEClass, SOCIOGRAM__ITS_SOCIOGRAM_NODES);

		sociogramNodeEClass = createEClass(SOCIOGRAM_NODE);
		createEAttribute(sociogramNodeEClass, SOCIOGRAM_NODE__NAME);

		rolEClass = createEClass(ROL);
		createEReference(rolEClass, ROL__ITS_TEAM);
		createEReference(rolEClass, ROL__ITS_ACTOR);
		createEReference(rolEClass, ROL__SUPERTYPE);
		createEReference(rolEClass, ROL__SUBTYPE);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ITS_GROUP);
		createEReference(actorEClass, ACTOR__ACTS);

		softwareAgentEClass = createEClass(SOFTWARE_AGENT);

		teamEClass = createEClass(TEAM);
		createEReference(teamEClass, TEAM__CONTAINS);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__CONTAINS);

		sociogramLinkEClass = createEClass(SOCIOGRAM_LINK);
		createEReference(sociogramLinkEClass, SOCIOGRAM_LINK__SOURCE);
		createEReference(sociogramLinkEClass, SOCIOGRAM_LINK__TARGET);

		inheritanceEClass = createEClass(INHERITANCE);
		createEAttribute(inheritanceEClass, INHERITANCE__CONDITION);

		actingEClass = createEClass(ACTING);
		createEAttribute(actingEClass, ACTING__NAME);
		createEAttribute(actingEClass, ACTING__N);
		createEAttribute(actingEClass, ACTING__M);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__NAME);
		createEAttribute(associationEClass, ASSOCIATION__N);
		createEAttribute(associationEClass, ASSOCIATION__M);

		processDiagramEClass = createEClass(PROCESS_DIAGRAM);
		createEAttribute(processDiagramEClass, PROCESS_DIAGRAM__NAME);
		createEReference(processDiagramEClass, PROCESS_DIAGRAM__PROCESS_NODES);

		processNodeEClass = createEClass(PROCESS_NODE);

		initEClass = createEClass(INIT);
		createEAttribute(initEClass, INIT__NAME);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__NAME);

		simpleTaskEClass = createEClass(SIMPLE_TASK);
		createEAttribute(simpleTaskEClass, SIMPLE_TASK__NAME);
		createEReference(simpleTaskEClass, SIMPLE_TASK__TOOLS);

		individualTaskEClass = createEClass(INDIVIDUAL_TASK);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__TASK_ROLES);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__TASK_OBJECTS);

		cooperativeTaskEClass = createEClass(COOPERATIVE_TASK);
		createEReference(cooperativeTaskEClass, COOPERATIVE_TASK__TASK_ROLES);
		createEReference(cooperativeTaskEClass, COOPERATIVE_TASK__TASK_OBJECTS);

		collaborativeTaskEClass = createEClass(COLLABORATIVE_TASK);
		createEReference(collaborativeTaskEClass, COLLABORATIVE_TASK__TASK_ROLES);
		createEReference(collaborativeTaskEClass, COLLABORATIVE_TASK__TASK_OBJECTS);

		abstractTaskEClass = createEClass(ABSTRACT_TASK);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__PROCESS_NODES);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__NAME);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__NAME);
		createEReference(objectEClass, OBJECT__OBJECT);
		createEAttribute(objectEClass, OBJECT__MODIFIER);
		createEReference(objectEClass, OBJECT__MODIFIED_BY);

		temporalConditionEClass = createEClass(TEMPORAL_CONDITION);
		createEAttribute(temporalConditionEClass, TEMPORAL_CONDITION__NAME);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__NAME);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);

		domainDiagramEClass = createEClass(DOMAIN_DIAGRAM);
		createEAttribute(domainDiagramEClass, DOMAIN_DIAGRAM__NAME);
		createEReference(domainDiagramEClass, DOMAIN_DIAGRAM__SHARED_CONTEXT);

		sharedObjectEClass = createEClass(SHARED_OBJECT);
		createEAttribute(sharedObjectEClass, SHARED_OBJECT__NAME);
		createEAttribute(sharedObjectEClass, SHARED_OBJECT__ITS_VISUALIZATION);
		createEReference(sharedObjectEClass, SHARED_OBJECT__INCOMINGS);
		createEReference(sharedObjectEClass, SHARED_OBJECT__OUTGOINGS);
		createEReference(sharedObjectEClass, SHARED_OBJECT__ATTRIBUTES);
		createEReference(sharedObjectEClass, SHARED_OBJECT__OPERATIONS);
		createEReference(sharedObjectEClass, SHARED_OBJECT__VAREAS);

		visualizationAreaEClass = createEClass(VISUALIZATION_AREA);
		createEAttribute(visualizationAreaEClass, VISUALIZATION_AREA__NAME);

		exclusiveEditionAreaEClass = createEClass(EXCLUSIVE_EDITION_AREA);

		collaborativeAreaEClass = createEClass(COLLABORATIVE_AREA);

		individualAreaEClass = createEClass(INDIVIDUAL_AREA);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);

		sharedLinkEClass = createEClass(SHARED_LINK);
		createEReference(sharedLinkEClass, SHARED_LINK__SOURCE);
		createEReference(sharedLinkEClass, SHARED_LINK__TARGET);

		shAssociationLinkEClass = createEClass(SH_ASSOCIATION_LINK);

		shGeneralizationLinkEClass = createEClass(SH_GENERALIZATION_LINK);

		shAggregationLinkEClass = createEClass(SH_AGGREGATION_LINK);

		cttDiagramEClass = createEClass(CTT_DIAGRAM);
		createEAttribute(cttDiagramEClass, CTT_DIAGRAM__NAME);
		createEReference(cttDiagramEClass, CTT_DIAGRAM__CTT_TASKS);

		cttTaskEClass = createEClass(CTT_TASK);
		createEAttribute(cttTaskEClass, CTT_TASK__NAME);
		createEReference(cttTaskEClass, CTT_TASK__DEPENDENCIES);

		exclusiveEditionEClass = createEClass(EXCLUSIVE_EDITION);

		collaborativeVisualizationEClass = createEClass(COLLABORATIVE_VISUALIZATION);

		individualVisualizationEClass = createEClass(INDIVIDUAL_VISUALIZATION);

		userTaskEClass = createEClass(USER_TASK);

		cttAbstractTaskEClass = createEClass(CTT_ABSTRACT_TASK);

		interactiveTaskEClass = createEClass(INTERACTIVE_TASK);

		cttCollaborativeTaskEClass = createEClass(CTT_COLLABORATIVE_TASK);

		applicationTaskEClass = createEClass(APPLICATION_TASK);

		dependencyElementEClass = createEClass(DEPENDENCY_ELEMENT);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SOURCE);
		createEReference(dependencyEClass, DEPENDENCY__TARGET);

		aggregationEClass = createEClass(AGGREGATION);

		enablingEClass = createEClass(ENABLING);
		createEAttribute(enablingEClass, ENABLING__ELABEL);

		disablingEClass = createEClass(DISABLING);
		createEAttribute(disablingEClass, DISABLING__DLABEL);

		enablingWithInformationPassingEClass = createEClass(ENABLING_WITH_INFORMATION_PASSING);
		createEAttribute(enablingWithInformationPassingEClass, ENABLING_WITH_INFORMATION_PASSING__EW_LABEL);

		disablingWithInformationPassingEClass = createEClass(DISABLING_WITH_INFORMATION_PASSING);
		createEAttribute(disablingWithInformationPassingEClass, DISABLING_WITH_INFORMATION_PASSING__DW_LABEL);

		independentConcurrencyEClass = createEClass(INDEPENDENT_CONCURRENCY);
		createEAttribute(independentConcurrencyEClass, INDEPENDENT_CONCURRENCY__IC_LABEL);

		orderIndependenceEClass = createEClass(ORDER_INDEPENDENCE);
		createEAttribute(orderIndependenceEClass, ORDER_INDEPENDENCE__OI_LABEL);

		suspendResumeEClass = createEClass(SUSPEND_RESUME);
		createEAttribute(suspendResumeEClass, SUSPEND_RESUME__SR_LABEL);

		concurrencyWithInformationPassingEClass = createEClass(CONCURRENCY_WITH_INFORMATION_PASSING);
		createEAttribute(concurrencyWithInformationPassingEClass, CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL);

		deterministicChoiceEClass = createEClass(DETERMINISTIC_CHOICE);
		createEAttribute(deterministicChoiceEClass, DETERMINISTIC_CHOICE__DT_LABEL);

		undeterministicChoiceEClass = createEClass(UNDETERMINISTIC_CHOICE);
		createEAttribute(undeterministicChoiceEClass, UNDETERMINISTIC_CHOICE__UC_LABEL);

		// Create enums
		visualizationsEEnum = createEEnum(VISUALIZATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rolEClass.getESuperTypes().add(this.getSociogramNode());
		actorEClass.getESuperTypes().add(this.getSociogramNode());
		softwareAgentEClass.getESuperTypes().add(this.getSociogramNode());
		teamEClass.getESuperTypes().add(this.getSociogramNode());
		groupEClass.getESuperTypes().add(this.getSociogramNode());
		sociogramLinkEClass.getESuperTypes().add(this.getLink());
		inheritanceEClass.getESuperTypes().add(this.getSociogramLink());
		actingEClass.getESuperTypes().add(this.getSociogramLink());
		associationEClass.getESuperTypes().add(this.getSociogramLink());
		processNodeEClass.getESuperTypes().add(this.getDependencyElement());
		initEClass.getESuperTypes().add(this.getProcessNode());
		endEClass.getESuperTypes().add(this.getProcessNode());
		simpleTaskEClass.getESuperTypes().add(this.getProcessNode());
		individualTaskEClass.getESuperTypes().add(this.getSimpleTask());
		cooperativeTaskEClass.getESuperTypes().add(this.getSimpleTask());
		collaborativeTaskEClass.getESuperTypes().add(this.getSimpleTask());
		abstractTaskEClass.getESuperTypes().add(this.getSimpleTask());
		temporalConditionEClass.getESuperTypes().add(this.getProcessNode());
		notificationEClass.getESuperTypes().add(this.getProcessNode());
		conditionEClass.getESuperTypes().add(this.getProcessNode());
		exclusiveEditionAreaEClass.getESuperTypes().add(this.getVisualizationArea());
		collaborativeAreaEClass.getESuperTypes().add(this.getVisualizationArea());
		individualAreaEClass.getESuperTypes().add(this.getVisualizationArea());
		sharedLinkEClass.getESuperTypes().add(this.getLink());
		shAssociationLinkEClass.getESuperTypes().add(this.getSharedLink());
		shGeneralizationLinkEClass.getESuperTypes().add(this.getSharedLink());
		shAggregationLinkEClass.getESuperTypes().add(this.getSharedLink());
		cttTaskEClass.getESuperTypes().add(this.getDependencyElement());
		exclusiveEditionEClass.getESuperTypes().add(this.getCTTTask());
		collaborativeVisualizationEClass.getESuperTypes().add(this.getCTTTask());
		individualVisualizationEClass.getESuperTypes().add(this.getCTTTask());
		userTaskEClass.getESuperTypes().add(this.getCTTTask());
		cttAbstractTaskEClass.getESuperTypes().add(this.getCTTTask());
		interactiveTaskEClass.getESuperTypes().add(this.getCTTTask());
		cttCollaborativeTaskEClass.getESuperTypes().add(this.getCTTTask());
		applicationTaskEClass.getESuperTypes().add(this.getCTTTask());
		dependencyEClass.getESuperTypes().add(this.getLink());
		aggregationEClass.getESuperTypes().add(this.getDependency());
		enablingEClass.getESuperTypes().add(this.getDependency());
		disablingEClass.getESuperTypes().add(this.getDependency());
		enablingWithInformationPassingEClass.getESuperTypes().add(this.getDependency());
		disablingWithInformationPassingEClass.getESuperTypes().add(this.getDependency());
		independentConcurrencyEClass.getESuperTypes().add(this.getDependency());
		orderIndependenceEClass.getESuperTypes().add(this.getDependency());
		suspendResumeEClass.getESuperTypes().add(this.getDependency());
		concurrencyWithInformationPassingEClass.getESuperTypes().add(this.getDependency());
		deterministicChoiceEClass.getESuperTypes().add(this.getDependency());
		undeterministicChoiceEClass.getESuperTypes().add(this.getDependency());

		// Initialize classes and features; add operations and parameters
		initEClass(ciatDiagramEClass, CIATDiagram.class, "CIATDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCIATDiagram_ItsSociograms(), this.getSociogram(), null, "itsSociograms", null, 0, -1, CIATDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCIATDiagram_ItsProcessDiagrams(), this.getProcessDiagram(), null, "itsProcessDiagrams", null, 0, -1, CIATDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCIATDiagram_ItsDomainDiagrams(), this.getDomainDiagram(), null, "itsDomainDiagrams", null, 0, -1, CIATDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCIATDiagram_ItsCttDiagrams(), this.getCTTDiagram(), null, "itsCttDiagrams", null, 0, -1, CIATDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCIATDiagram_ItsLinks(), this.getLink(), null, "itsLinks", null, 0, -1, CIATDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sociogramEClass, Sociogram.class, "Sociogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSociogram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sociogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociogram_ItsSociogramNodes(), this.getSociogramNode(), null, "itsSociogramNodes", null, 0, -1, Sociogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sociogramNodeEClass, SociogramNode.class, "SociogramNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSociogramNode_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, SociogramNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRol_ItsTeam(), this.getTeam(), null, "itsTeam", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_ItsActor(), this.getActor(), null, "itsActor", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Supertype(), this.getRol(), null, "supertype", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Subtype(), this.getRol(), null, "subtype", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_ItsGroup(), this.getGroup(), null, "itsGroup", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Acts(), this.getRol(), null, "acts", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareAgentEClass, SoftwareAgent.class, "SoftwareAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeam_Contains(), this.getRol(), null, "contains", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Contains(), this.getActor(), null, "contains", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sociogramLinkEClass, SociogramLink.class, "SociogramLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSociogramLink_Source(), this.getSociogramNode(), null, "source", null, 1, 1, SociogramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociogramLink_Target(), this.getSociogramNode(), null, "target", null, 1, 1, SociogramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritance_Condition(), ecorePackage.getEString(), "condition", " ", 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actingEClass, Acting.class, "Acting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActing_Name(), ecorePackage.getEString(), "name", "(n..m)", 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActing_N(), ecorePackage.getEInt(), "n", null, 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActing_M(), ecorePackage.getEInt(), "m", null, 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Name(), ecorePackage.getEString(), "name", "(n..m)", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_N(), ecorePackage.getEInt(), "n", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_M(), ecorePackage.getEInt(), "m", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processDiagramEClass, ProcessDiagram.class, "ProcessDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDiagram_ProcessNodes(), this.getProcessNode(), null, "processNodes", null, 0, -1, ProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processNodeEClass, ProcessNode.class, "ProcessNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initEClass, Init.class, "Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInit_Name(), ecorePackage.getEString(), "name", " ", 0, 1, Init.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_Name(), ecorePackage.getEString(), "name", " ", 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTaskEClass, SimpleTask.class, "SimpleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleTask_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTask_Tools(), this.getTool(), null, "tools", null, 0, -1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualTaskEClass, IndividualTask.class, "IndividualTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualTask_TaskRoles(), this.getSociogramNode(), null, "taskRoles", null, 1, 1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooperativeTaskEClass, CooperativeTask.class, "CooperativeTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCooperativeTask_TaskRoles(), this.getSociogramNode(), null, "taskRoles", null, 0, -1, CooperativeTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCooperativeTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, CooperativeTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeTaskEClass, CollaborativeTask.class, "CollaborativeTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeTask_TaskRoles(), this.getSociogramNode(), null, "taskRoles", null, 0, -1, CollaborativeTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, CollaborativeTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTaskEClass, AbstractTask.class, "AbstractTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTask_ProcessNodes(), this.getProcessNode(), null, "processNodes", null, 0, -1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Name(), ecorePackage.getEString(), "name", "Tool", 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, ciat.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Name(), ecorePackage.getEString(), "name", "C/R/W: Object", 0, 1, ciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_Object(), this.getObject(), null, "object", null, 0, 1, ciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, ciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_ModifiedBy(), this.getSociogramNode(), null, "modifiedBy", null, 1, 1, ciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalConditionEClass, TemporalCondition.class, "TemporalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalCondition_Name(), ecorePackage.getEString(), "name", "...", 0, 1, TemporalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Name(), ecorePackage.getEString(), "name", "...", 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", "? ...", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainDiagramEClass, DomainDiagram.class, "DomainDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDiagram_SharedContext(), this.getSharedObject(), null, "sharedContext", null, 0, -1, DomainDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedObjectEClass, SharedObject.class, "SharedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedObject_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedObject_ItsVisualization(), this.getVisualizations(), "itsVisualization", null, 1, 1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedObject_Incomings(), this.getSharedObject(), null, "incomings", null, 0, -1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedObject_Outgoings(), this.getSharedObject(), null, "outgoings", null, 0, -1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedObject_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedObject_Operations(), this.getOperation(), null, "operations", null, 0, -1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedObject_VAreas(), this.getVisualizationArea(), null, "vAreas", null, 1, 1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationAreaEClass, VisualizationArea.class, "VisualizationArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizationArea_Name(), ecorePackage.getEString(), "name", " ", 0, 1, VisualizationArea.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveEditionAreaEClass, ExclusiveEditionArea.class, "ExclusiveEditionArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborativeAreaEClass, CollaborativeArea.class, "CollaborativeArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualAreaEClass, IndividualArea.class, "IndividualArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", "-/+ Attribute", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", "-/+ Operation()", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedLinkEClass, SharedLink.class, "SharedLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedLink_Source(), this.getSharedObject(), null, "source", null, 1, 1, SharedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedLink_Target(), this.getSharedObject(), null, "target", null, 1, 1, SharedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shAssociationLinkEClass, ShAssociationLink.class, "ShAssociationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shGeneralizationLinkEClass, ShGeneralizationLink.class, "ShGeneralizationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shAggregationLinkEClass, ShAggregationLink.class, "ShAggregationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttDiagramEClass, CTTDiagram.class, "CTTDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTTDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTDiagram_CttTasks(), this.getCTTTask(), null, "cttTasks", null, 0, -1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cttTaskEClass, CTTTask.class, "CTTTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTTTask_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, CTTTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTTask_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, CTTTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveEditionEClass, ExclusiveEdition.class, "ExclusiveEdition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborativeVisualizationEClass, CollaborativeVisualization.class, "CollaborativeVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualVisualizationEClass, IndividualVisualization.class, "IndividualVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttAbstractTaskEClass, CTTAbstractTask.class, "CTTAbstractTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactiveTaskEClass, InteractiveTask.class, "InteractiveTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttCollaborativeTaskEClass, CTTCollaborativeTask.class, "CTTCollaborativeTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationTaskEClass, ApplicationTask.class, "ApplicationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyElementEClass, DependencyElement.class, "DependencyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Source(), this.getDependencyElement(), null, "source", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Target(), this.getDependencyElement(), null, "target", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enablingEClass, Enabling.class, "Enabling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnabling_ELabel(), ecorePackage.getEString(), "eLabel", ">>", 0, 1, Enabling.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disablingEClass, Disabling.class, "Disabling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisabling_DLabel(), ecorePackage.getEString(), "dLabel", "[>", 0, 1, Disabling.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enablingWithInformationPassingEClass, EnablingWithInformationPassing.class, "EnablingWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnablingWithInformationPassing_EwLabel(), ecorePackage.getEString(), "ewLabel", "[]>>", 0, 1, EnablingWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disablingWithInformationPassingEClass, DisablingWithInformationPassing.class, "DisablingWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisablingWithInformationPassing_DwLabel(), ecorePackage.getEString(), "dwLabel", "[]|>", 0, 1, DisablingWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(independentConcurrencyEClass, IndependentConcurrency.class, "IndependentConcurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndependentConcurrency_IcLabel(), ecorePackage.getEString(), "icLabel", "|||", 0, 1, IndependentConcurrency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderIndependenceEClass, OrderIndependence.class, "OrderIndependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderIndependence_OiLabel(), ecorePackage.getEString(), "oiLabel", "|=|", 0, 1, OrderIndependence.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suspendResumeEClass, SuspendResume.class, "SuspendResume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuspendResume_SrLabel(), ecorePackage.getEString(), "srLabel", "|>", 0, 1, SuspendResume.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyWithInformationPassingEClass, ConcurrencyWithInformationPassing.class, "ConcurrencyWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrencyWithInformationPassing_CLabel(), ecorePackage.getEString(), "cLabel", "|[]|", 0, 1, ConcurrencyWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deterministicChoiceEClass, DeterministicChoice.class, "DeterministicChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeterministicChoice_DtLabel(), ecorePackage.getEString(), "dtLabel", "[]", 0, 1, DeterministicChoice.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undeterministicChoiceEClass, UndeterministicChoice.class, "UndeterministicChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUndeterministicChoice_UcLabel(), ecorePackage.getEString(), "ucLabel", "\u00c7", 0, 1, UndeterministicChoice.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visualizationsEEnum, Visualizations.class, "Visualizations");
		addEEnumLiteral(visualizationsEEnum, Visualizations.NONE);
		addEEnumLiteral(visualizationsEEnum, Visualizations.EXCLUSIVE);
		addEEnumLiteral(visualizationsEEnum, Visualizations.INDIVIDUAL);
		addEEnumLiteral(visualizationsEEnum, Visualizations.COLLABORATIVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
		// gmf.affixed
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (ciatDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (sociogramEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Sociogram.gif"
		   });
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Rol",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Rol.gif"
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Actor",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Actor.gif"
		   });
		addAnnotation
		  (softwareAgentEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Software Agent",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/SoftwareAgent.gif"
		   });
		addAnnotation
		  (teamEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Team",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Team.gif"
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Group",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Group.gif"
		   });
		addAnnotation
		  (processDiagramEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Process Diagram",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/ProcessDiagram.gif"
		   });
		addAnnotation
		  (initEClass,
		   source,
		   new String[] {
			   "figure", "figures.InitialFigure",
			   "tool.name", "Initial",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Initial.gif",
			   "label", "name",
			   "size", "16,16"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "figure", "figures.FinalFigure",
			   "tool.name", "Final",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Final.gif",
			   "label", "name",
			   "size", "16,16"
		   });
		addAnnotation
		  (individualTaskEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Individual",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/IndividualInteractionTask.gif"
		   });
		addAnnotation
		  (cooperativeTaskEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Cooperative",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CooperativeInteractionTask.gif"
		   });
		addAnnotation
		  (collaborativeTaskEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Collaborative",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CollaborativeInteractionTask.gif"
		   });
		addAnnotation
		  (abstractTaskEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Abstract",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Abstract.gif"
		   });
		addAnnotation
		  (toolEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Tool",
			   "figure", "polygon",
			   "resizable", "false",
			   "label.icon", "false",
			   "polygon.x", "0 20 49 69 49 20",
			   "polygon.y", "20 0 0 20 40 40",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Tool.gif"
		   });
		addAnnotation
		  (objectEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Object",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "color", "154,236,255",
			   "size", "120,28",
			   "border.color", "0,179,255",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Object.gif"
		   });
		addAnnotation
		  (temporalConditionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Temporal Condition",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/TemporalCondition.gif"
		   });
		addAnnotation
		  (notificationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Notification",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Notification.gif"
		   });
		addAnnotation
		  (conditionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Condition",
			   "label.icon", "false",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Condition.gif"
		   });
		addAnnotation
		  (domainDiagramEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Domain Diagram",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/DomainDiagram.gif"
		   });
		addAnnotation
		  (sharedObjectEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Class",
			   "figure", "rectangle",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Object.gif"
		   });
		addAnnotation
		  (exclusiveEditionAreaEClass,
		   source,
		   new String[] {
			   "figure", "figures.ExclusiveEditionFigure",
			   "tool.name", "Exclusive Area",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/ExclusiveEdition.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (collaborativeAreaEClass,
		   source,
		   new String[] {
			   "figure", "figures.CollaborativeVisualizationFigure",
			   "tool.name", "Collaborative Area",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CollaborativeVisualization.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (individualAreaEClass,
		   source,
		   new String[] {
			   "figure", "figures.IndividualVisualizationFigure",
			   "tool.name", "Individual Area",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/IndividualVisualization.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Attribute",
			   "resizable", "true",
			   "border.style", "dash",
			   "border.width", "1",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Attribute.gif"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Operation",
			   "resizable", "true",
			   "border.style", "dash",
			   "border.width", "1",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Operations.gif"
		   });
		addAnnotation
		  (cttDiagramEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CTTDiagram.gif"
		   });
		addAnnotation
		  (exclusiveEditionEClass,
		   source,
		   new String[] {
			   "figure", "figures.ExclusiveEditionFigure",
			   "tool.name", "Exclusive Edition",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/ExclusiveEdition.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (collaborativeVisualizationEClass,
		   source,
		   new String[] {
			   "figure", "figures.CollaborativeVisualizationFigure",
			   "tool.name", "Collaborative Visualization",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CollaborativeVisualization.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (individualVisualizationEClass,
		   source,
		   new String[] {
			   "figure", "figures.IndividualVisualizationFigure",
			   "tool.name", "Individual Visualization",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/IndividualVisualization.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (userTaskEClass,
		   source,
		   new String[] {
			   "figure", "figures.UserTaskFigure",
			   "tool.name", "User Task",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/UserTask.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (cttAbstractTaskEClass,
		   source,
		   new String[] {
			   "figure", "figures.AbstractTaskFigure",
			   "tool.name", "Abstract Task",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/AbstractTask.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (interactiveTaskEClass,
		   source,
		   new String[] {
			   "figure", "figures.InteractiveTaskFigure",
			   "tool.name", "Interactive Task",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/InteractionTask.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (cttCollaborativeTaskEClass,
		   source,
		   new String[] {
			   "figure", "figures.CollaborativeTaskFigure",
			   "tool.name", "Collaborative Task",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/CollaborativeTask.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (applicationTaskEClass,
		   source,
		   new String[] {
			   "figure", "figures.ApplicationTaskFigure",
			   "tool.name", "Application Task",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/ApplicationTask.gif",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getSociogram_ItsSociogramNodes(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getProcessDiagram_ProcessNodes(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getIndividualTask_TaskRoles(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getIndividualTask_TaskObjects(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCooperativeTask_TaskRoles(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCooperativeTask_TaskObjects(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCollaborativeTask_TaskRoles(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCollaborativeTask_TaskObjects(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getAbstractTask_ProcessNodes(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getDomainDiagram_SharedContext(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getSharedObject_Attributes(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getSharedObject_Operations(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCTTDiagram_CttTasks(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (inheritanceEClass,
		   source,
		   new String[] {
			   "label", "condition",
			   "source", "source",
			   "target", "target",
			   "target.decoration", "closedarrow",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Inheritance.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (actingEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "source", "source",
			   "target", "target",
			   "target.decoration", "closedarrow",
			   "style", "dash",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Acting.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (associationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Association.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (shAssociationLinkEClass,
		   source,
		   new String[] {
			   "tool.name", "Asociation",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Association.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (shGeneralizationLinkEClass,
		   source,
		   new String[] {
			   "tool.name", "Generalization",
			   "source", "source",
			   "target", "target",
			   "target.decoration", "closedarrow",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Generalization.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (shAggregationLinkEClass,
		   source,
		   new String[] {
			   "tool.name", "Aggregation",
			   "source", "source",
			   "target", "target",
			   "target.decoration", "rhomb",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/Aggregation.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (aggregationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/AggregationTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (enablingEClass,
		   source,
		   new String[] {
			   "label", "eLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/EnablingTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (disablingEClass,
		   source,
		   new String[] {
			   "label", "dLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/DisablingTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (enablingWithInformationPassingEClass,
		   source,
		   new String[] {
			   "label", "ewLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Enabling With Information Passing",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/EnablingWithInformationPassingTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (disablingWithInformationPassingEClass,
		   source,
		   new String[] {
			   "label", "dwLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Disabling With Information Passing",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/DisablingWithInformationPassingTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (independentConcurrencyEClass,
		   source,
		   new String[] {
			   "label", "icLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Independent Concurrency",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/IndependentConcurrencyTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (orderIndependenceEClass,
		   source,
		   new String[] {
			   "label", "oiLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Order Independence",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/OrderIndependenceTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (suspendResumeEClass,
		   source,
		   new String[] {
			   "label", "srLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Suspend Resume",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/SuspendResumeTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (concurrencyWithInformationPassingEClass,
		   source,
		   new String[] {
			   "label", "cLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Concurrency With Information Passing",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/ConcurrencyWithInformationPassingTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (deterministicChoiceEClass,
		   source,
		   new String[] {
			   "label", "dtLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Deterministic Choice",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/DeterministicChoiceTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (undeterministicChoiceEClass,
		   source,
		   new String[] {
			   "label", "ucLabel",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.name", "Undeterministic Choice",
			   "tool.small.bundle", "org.chico.ciat.figures",
			   "tool.small.path", "images/UndeterministicChoiceTransition.gif",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.affixed";
		addAnnotation
		  (getSimpleTask_Tools(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSharedObject_VAreas(),
		   source,
		   new String[] {
		   });
	}

} //CiatPackageImpl
