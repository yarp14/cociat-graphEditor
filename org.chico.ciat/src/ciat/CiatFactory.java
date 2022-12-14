/**
 */
package ciat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ciat.CiatPackage
 * @generated
 */
public interface CiatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CiatFactory eINSTANCE = ciat.impl.CiatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIAT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIAT Diagram</em>'.
	 * @generated
	 */
	CIATDiagram createCIATDiagram();

	/**
	 * Returns a new object of class '<em>Sociogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram</em>'.
	 * @generated
	 */
	Sociogram createSociogram();

	/**
	 * Returns a new object of class '<em>Sociogram Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram Node</em>'.
	 * @generated
	 */
	SociogramNode createSociogramNode();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Software Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Agent</em>'.
	 * @generated
	 */
	SoftwareAgent createSoftwareAgent();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Sociogram Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram Link</em>'.
	 * @generated
	 */
	SociogramLink createSociogramLink();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Acting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acting</em>'.
	 * @generated
	 */
	Acting createActing();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Diagram</em>'.
	 * @generated
	 */
	ProcessDiagram createProcessDiagram();

	/**
	 * Returns a new object of class '<em>Process Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Node</em>'.
	 * @generated
	 */
	ProcessNode createProcessNode();

	/**
	 * Returns a new object of class '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init</em>'.
	 * @generated
	 */
	Init createInit();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Task</em>'.
	 * @generated
	 */
	SimpleTask createSimpleTask();

	/**
	 * Returns a new object of class '<em>Individual Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Task</em>'.
	 * @generated
	 */
	IndividualTask createIndividualTask();

	/**
	 * Returns a new object of class '<em>Cooperative Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooperative Task</em>'.
	 * @generated
	 */
	CooperativeTask createCooperativeTask();

	/**
	 * Returns a new object of class '<em>Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Task</em>'.
	 * @generated
	 */
	CollaborativeTask createCollaborativeTask();

	/**
	 * Returns a new object of class '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Task</em>'.
	 * @generated
	 */
	AbstractTask createAbstractTask();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Temporal Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Condition</em>'.
	 * @generated
	 */
	TemporalCondition createTemporalCondition();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Domain Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Diagram</em>'.
	 * @generated
	 */
	DomainDiagram createDomainDiagram();

	/**
	 * Returns a new object of class '<em>Shared Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Object</em>'.
	 * @generated
	 */
	SharedObject createSharedObject();

	/**
	 * Returns a new object of class '<em>Visualization Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Area</em>'.
	 * @generated
	 */
	VisualizationArea createVisualizationArea();

	/**
	 * Returns a new object of class '<em>Exclusive Edition Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Edition Area</em>'.
	 * @generated
	 */
	ExclusiveEditionArea createExclusiveEditionArea();

	/**
	 * Returns a new object of class '<em>Collaborative Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Area</em>'.
	 * @generated
	 */
	CollaborativeArea createCollaborativeArea();

	/**
	 * Returns a new object of class '<em>Individual Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Area</em>'.
	 * @generated
	 */
	IndividualArea createIndividualArea();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Shared Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Link</em>'.
	 * @generated
	 */
	SharedLink createSharedLink();

	/**
	 * Returns a new object of class '<em>Sh Association Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sh Association Link</em>'.
	 * @generated
	 */
	ShAssociationLink createShAssociationLink();

	/**
	 * Returns a new object of class '<em>Sh Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sh Generalization Link</em>'.
	 * @generated
	 */
	ShGeneralizationLink createShGeneralizationLink();

	/**
	 * Returns a new object of class '<em>Sh Aggregation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sh Aggregation Link</em>'.
	 * @generated
	 */
	ShAggregationLink createShAggregationLink();

	/**
	 * Returns a new object of class '<em>CTT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Diagram</em>'.
	 * @generated
	 */
	CTTDiagram createCTTDiagram();

	/**
	 * Returns a new object of class '<em>CTT Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Task</em>'.
	 * @generated
	 */
	CTTTask createCTTTask();

	/**
	 * Returns a new object of class '<em>Exclusive Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Edition</em>'.
	 * @generated
	 */
	ExclusiveEdition createExclusiveEdition();

	/**
	 * Returns a new object of class '<em>Collaborative Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Visualization</em>'.
	 * @generated
	 */
	CollaborativeVisualization createCollaborativeVisualization();

	/**
	 * Returns a new object of class '<em>Individual Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Visualization</em>'.
	 * @generated
	 */
	IndividualVisualization createIndividualVisualization();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>CTT Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Abstract Task</em>'.
	 * @generated
	 */
	CTTAbstractTask createCTTAbstractTask();

	/**
	 * Returns a new object of class '<em>Interactive Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactive Task</em>'.
	 * @generated
	 */
	InteractiveTask createInteractiveTask();

	/**
	 * Returns a new object of class '<em>CTT Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Collaborative Task</em>'.
	 * @generated
	 */
	CTTCollaborativeTask createCTTCollaborativeTask();

	/**
	 * Returns a new object of class '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Task</em>'.
	 * @generated
	 */
	ApplicationTask createApplicationTask();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Enabling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling</em>'.
	 * @generated
	 */
	Enabling createEnabling();

	/**
	 * Returns a new object of class '<em>Disabling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabling</em>'.
	 * @generated
	 */
	Disabling createDisabling();

	/**
	 * Returns a new object of class '<em>Enabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling With Information Passing</em>'.
	 * @generated
	 */
	EnablingWithInformationPassing createEnablingWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Disabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabling With Information Passing</em>'.
	 * @generated
	 */
	DisablingWithInformationPassing createDisablingWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Independent Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Independent Concurrency</em>'.
	 * @generated
	 */
	IndependentConcurrency createIndependentConcurrency();

	/**
	 * Returns a new object of class '<em>Order Independence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Independence</em>'.
	 * @generated
	 */
	OrderIndependence createOrderIndependence();

	/**
	 * Returns a new object of class '<em>Suspend Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Resume</em>'.
	 * @generated
	 */
	SuspendResume createSuspendResume();

	/**
	 * Returns a new object of class '<em>Concurrency With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency With Information Passing</em>'.
	 * @generated
	 */
	ConcurrencyWithInformationPassing createConcurrencyWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Deterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic Choice</em>'.
	 * @generated
	 */
	DeterministicChoice createDeterministicChoice();

	/**
	 * Returns a new object of class '<em>Undeterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeterministic Choice</em>'.
	 * @generated
	 */
	UndeterministicChoice createUndeterministicChoice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CiatPackage getCiatPackage();

} //CiatFactory
