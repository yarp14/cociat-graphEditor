/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.ProcessDiagram#getName <em>Name</em>}</li>
 *   <li>{@link ciat.ProcessDiagram#getProcessNodes <em>Process Nodes</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getProcessDiagram()
 * @model annotation="gmf.node label='name' tool.name='Process Diagram' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/ProcessDiagram.gif'"
 * @generated
 */
public interface ProcessDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getProcessDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.ProcessDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.ProcessNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Nodes</em>' containment reference list.
	 * @see ciat.CiatPackage#getProcessDiagram_ProcessNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<ProcessNode> getProcessNodes();

} // ProcessDiagram
