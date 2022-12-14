/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.DomainDiagram#getName <em>Name</em>}</li>
 *   <li>{@link ciat.DomainDiagram#getSharedContext <em>Shared Context</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getDomainDiagram()
 * @model annotation="gmf.node label='name' tool.name='Domain Diagram' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/DomainDiagram.gif'"
 * @generated
 */
public interface DomainDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getDomainDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.DomainDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shared Context</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.SharedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Context</em>' containment reference list.
	 * @see ciat.CiatPackage#getDomainDiagram_SharedContext()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<SharedObject> getSharedContext();

} // DomainDiagram
