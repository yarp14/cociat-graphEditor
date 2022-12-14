/**
 */
package ciat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.Object#getName <em>Name</em>}</li>
 *   <li>{@link ciat.Object#getObject <em>Object</em>}</li>
 *   <li>{@link ciat.Object#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ciat.Object#getModifiedBy <em>Modified By</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getObject()
 * @model annotation="gmf.node label='name' tool.name='Object' label.icon='false' figure='rectangle' color='154,236,255' size='120,28' border.color='0,179,255' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/Object.gif'"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"C/R/W: Object"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getObject_Name()
	 * @model default="C/R/W: Object"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Object)
	 * @see ciat.CiatPackage#getObject_Object()
	 * @model
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link ciat.Object#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see #setModifier(String)
	 * @see ciat.CiatPackage#getObject_Modifier()
	 * @model
	 * @generated
	 */
	String getModifier();

	/**
	 * Sets the value of the '{@link ciat.Object#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(String value);

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By</em>' reference.
	 * @see #setModifiedBy(SociogramNode)
	 * @see ciat.CiatPackage#getObject_ModifiedBy()
	 * @model required="true"
	 * @generated
	 */
	SociogramNode getModifiedBy();

	/**
	 * Sets the value of the '{@link ciat.Object#getModifiedBy <em>Modified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' reference.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(SociogramNode value);

} // Object
