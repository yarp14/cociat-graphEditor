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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CiatFactoryImpl extends EFactoryImpl implements CiatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CiatFactory init() {
		try {
			CiatFactory theCiatFactory = (CiatFactory)EPackage.Registry.INSTANCE.getEFactory(CiatPackage.eNS_URI);
			if (theCiatFactory != null) {
				return theCiatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CiatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CiatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CiatPackage.CIAT_DIAGRAM: return createCIATDiagram();
			case CiatPackage.SOCIOGRAM: return createSociogram();
			case CiatPackage.SOCIOGRAM_NODE: return createSociogramNode();
			case CiatPackage.ROL: return createRol();
			case CiatPackage.ACTOR: return createActor();
			case CiatPackage.SOFTWARE_AGENT: return createSoftwareAgent();
			case CiatPackage.TEAM: return createTeam();
			case CiatPackage.GROUP: return createGroup();
			case CiatPackage.SOCIOGRAM_LINK: return createSociogramLink();
			case CiatPackage.INHERITANCE: return createInheritance();
			case CiatPackage.ACTING: return createActing();
			case CiatPackage.ASSOCIATION: return createAssociation();
			case CiatPackage.PROCESS_DIAGRAM: return createProcessDiagram();
			case CiatPackage.PROCESS_NODE: return createProcessNode();
			case CiatPackage.INIT: return createInit();
			case CiatPackage.END: return createEnd();
			case CiatPackage.SIMPLE_TASK: return createSimpleTask();
			case CiatPackage.INDIVIDUAL_TASK: return createIndividualTask();
			case CiatPackage.COOPERATIVE_TASK: return createCooperativeTask();
			case CiatPackage.COLLABORATIVE_TASK: return createCollaborativeTask();
			case CiatPackage.ABSTRACT_TASK: return createAbstractTask();
			case CiatPackage.TOOL: return createTool();
			case CiatPackage.OBJECT: return createObject();
			case CiatPackage.TEMPORAL_CONDITION: return createTemporalCondition();
			case CiatPackage.NOTIFICATION: return createNotification();
			case CiatPackage.CONDITION: return createCondition();
			case CiatPackage.DOMAIN_DIAGRAM: return createDomainDiagram();
			case CiatPackage.SHARED_OBJECT: return createSharedObject();
			case CiatPackage.VISUALIZATION_AREA: return createVisualizationArea();
			case CiatPackage.EXCLUSIVE_EDITION_AREA: return createExclusiveEditionArea();
			case CiatPackage.COLLABORATIVE_AREA: return createCollaborativeArea();
			case CiatPackage.INDIVIDUAL_AREA: return createIndividualArea();
			case CiatPackage.ATTRIBUTE: return createAttribute();
			case CiatPackage.OPERATION: return createOperation();
			case CiatPackage.SHARED_LINK: return createSharedLink();
			case CiatPackage.SH_ASSOCIATION_LINK: return createShAssociationLink();
			case CiatPackage.SH_GENERALIZATION_LINK: return createShGeneralizationLink();
			case CiatPackage.SH_AGGREGATION_LINK: return createShAggregationLink();
			case CiatPackage.CTT_DIAGRAM: return createCTTDiagram();
			case CiatPackage.CTT_TASK: return createCTTTask();
			case CiatPackage.EXCLUSIVE_EDITION: return createExclusiveEdition();
			case CiatPackage.COLLABORATIVE_VISUALIZATION: return createCollaborativeVisualization();
			case CiatPackage.INDIVIDUAL_VISUALIZATION: return createIndividualVisualization();
			case CiatPackage.USER_TASK: return createUserTask();
			case CiatPackage.CTT_ABSTRACT_TASK: return createCTTAbstractTask();
			case CiatPackage.INTERACTIVE_TASK: return createInteractiveTask();
			case CiatPackage.CTT_COLLABORATIVE_TASK: return createCTTCollaborativeTask();
			case CiatPackage.APPLICATION_TASK: return createApplicationTask();
			case CiatPackage.DEPENDENCY: return createDependency();
			case CiatPackage.AGGREGATION: return createAggregation();
			case CiatPackage.ENABLING: return createEnabling();
			case CiatPackage.DISABLING: return createDisabling();
			case CiatPackage.ENABLING_WITH_INFORMATION_PASSING: return createEnablingWithInformationPassing();
			case CiatPackage.DISABLING_WITH_INFORMATION_PASSING: return createDisablingWithInformationPassing();
			case CiatPackage.INDEPENDENT_CONCURRENCY: return createIndependentConcurrency();
			case CiatPackage.ORDER_INDEPENDENCE: return createOrderIndependence();
			case CiatPackage.SUSPEND_RESUME: return createSuspendResume();
			case CiatPackage.CONCURRENCY_WITH_INFORMATION_PASSING: return createConcurrencyWithInformationPassing();
			case CiatPackage.DETERMINISTIC_CHOICE: return createDeterministicChoice();
			case CiatPackage.UNDETERMINISTIC_CHOICE: return createUndeterministicChoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CiatPackage.VISUALIZATIONS:
				return createVisualizationsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CiatPackage.VISUALIZATIONS:
				return convertVisualizationsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIATDiagram createCIATDiagram() {
		CIATDiagramImpl ciatDiagram = new CIATDiagramImpl();
		return ciatDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sociogram createSociogram() {
		SociogramImpl sociogram = new SociogramImpl();
		return sociogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SociogramNode createSociogramNode() {
		SociogramNodeImpl sociogramNode = new SociogramNodeImpl();
		return sociogramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareAgent createSoftwareAgent() {
		SoftwareAgentImpl softwareAgent = new SoftwareAgentImpl();
		return softwareAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SociogramLink createSociogramLink() {
		SociogramLinkImpl sociogramLink = new SociogramLinkImpl();
		return sociogramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Acting createActing() {
		ActingImpl acting = new ActingImpl();
		return acting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessDiagram createProcessDiagram() {
		ProcessDiagramImpl processDiagram = new ProcessDiagramImpl();
		return processDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessNode createProcessNode() {
		ProcessNodeImpl processNode = new ProcessNodeImpl();
		return processNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Init createInit() {
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleTask createSimpleTask() {
		SimpleTaskImpl simpleTask = new SimpleTaskImpl();
		return simpleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualTask createIndividualTask() {
		IndividualTaskImpl individualTask = new IndividualTaskImpl();
		return individualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CooperativeTask createCooperativeTask() {
		CooperativeTaskImpl cooperativeTask = new CooperativeTaskImpl();
		return cooperativeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeTask createCollaborativeTask() {
		CollaborativeTaskImpl collaborativeTask = new CollaborativeTaskImpl();
		return collaborativeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTask createAbstractTask() {
		AbstractTaskImpl abstractTask = new AbstractTaskImpl();
		return abstractTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ciat.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCondition createTemporalCondition() {
		TemporalConditionImpl temporalCondition = new TemporalConditionImpl();
		return temporalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainDiagram createDomainDiagram() {
		DomainDiagramImpl domainDiagram = new DomainDiagramImpl();
		return domainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SharedObject createSharedObject() {
		SharedObjectImpl sharedObject = new SharedObjectImpl();
		return sharedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualizationArea createVisualizationArea() {
		VisualizationAreaImpl visualizationArea = new VisualizationAreaImpl();
		return visualizationArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusiveEditionArea createExclusiveEditionArea() {
		ExclusiveEditionAreaImpl exclusiveEditionArea = new ExclusiveEditionAreaImpl();
		return exclusiveEditionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeArea createCollaborativeArea() {
		CollaborativeAreaImpl collaborativeArea = new CollaborativeAreaImpl();
		return collaborativeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualArea createIndividualArea() {
		IndividualAreaImpl individualArea = new IndividualAreaImpl();
		return individualArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SharedLink createSharedLink() {
		SharedLinkImpl sharedLink = new SharedLinkImpl();
		return sharedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShAssociationLink createShAssociationLink() {
		ShAssociationLinkImpl shAssociationLink = new ShAssociationLinkImpl();
		return shAssociationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShGeneralizationLink createShGeneralizationLink() {
		ShGeneralizationLinkImpl shGeneralizationLink = new ShGeneralizationLinkImpl();
		return shGeneralizationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShAggregationLink createShAggregationLink() {
		ShAggregationLinkImpl shAggregationLink = new ShAggregationLinkImpl();
		return shAggregationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CTTDiagram createCTTDiagram() {
		CTTDiagramImpl cttDiagram = new CTTDiagramImpl();
		return cttDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CTTTask createCTTTask() {
		CTTTaskImpl cttTask = new CTTTaskImpl();
		return cttTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusiveEdition createExclusiveEdition() {
		ExclusiveEditionImpl exclusiveEdition = new ExclusiveEditionImpl();
		return exclusiveEdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeVisualization createCollaborativeVisualization() {
		CollaborativeVisualizationImpl collaborativeVisualization = new CollaborativeVisualizationImpl();
		return collaborativeVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualVisualization createIndividualVisualization() {
		IndividualVisualizationImpl individualVisualization = new IndividualVisualizationImpl();
		return individualVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CTTAbstractTask createCTTAbstractTask() {
		CTTAbstractTaskImpl cttAbstractTask = new CTTAbstractTaskImpl();
		return cttAbstractTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractiveTask createInteractiveTask() {
		InteractiveTaskImpl interactiveTask = new InteractiveTaskImpl();
		return interactiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CTTCollaborativeTask createCTTCollaborativeTask() {
		CTTCollaborativeTaskImpl cttCollaborativeTask = new CTTCollaborativeTaskImpl();
		return cttCollaborativeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationTask createApplicationTask() {
		ApplicationTaskImpl applicationTask = new ApplicationTaskImpl();
		return applicationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enabling createEnabling() {
		EnablingImpl enabling = new EnablingImpl();
		return enabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disabling createDisabling() {
		DisablingImpl disabling = new DisablingImpl();
		return disabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnablingWithInformationPassing createEnablingWithInformationPassing() {
		EnablingWithInformationPassingImpl enablingWithInformationPassing = new EnablingWithInformationPassingImpl();
		return enablingWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisablingWithInformationPassing createDisablingWithInformationPassing() {
		DisablingWithInformationPassingImpl disablingWithInformationPassing = new DisablingWithInformationPassingImpl();
		return disablingWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndependentConcurrency createIndependentConcurrency() {
		IndependentConcurrencyImpl independentConcurrency = new IndependentConcurrencyImpl();
		return independentConcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderIndependence createOrderIndependence() {
		OrderIndependenceImpl orderIndependence = new OrderIndependenceImpl();
		return orderIndependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendResume createSuspendResume() {
		SuspendResumeImpl suspendResume = new SuspendResumeImpl();
		return suspendResume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyWithInformationPassing createConcurrencyWithInformationPassing() {
		ConcurrencyWithInformationPassingImpl concurrencyWithInformationPassing = new ConcurrencyWithInformationPassingImpl();
		return concurrencyWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeterministicChoice createDeterministicChoice() {
		DeterministicChoiceImpl deterministicChoice = new DeterministicChoiceImpl();
		return deterministicChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndeterministicChoice createUndeterministicChoice() {
		UndeterministicChoiceImpl undeterministicChoice = new UndeterministicChoiceImpl();
		return undeterministicChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualizations createVisualizationsFromString(EDataType eDataType, String initialValue) {
		Visualizations result = Visualizations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualizationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiatPackage getCiatPackage() {
		return (CiatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CiatPackage getPackage() {
		return CiatPackage.eINSTANCE;
	}

} //CiatFactoryImpl
