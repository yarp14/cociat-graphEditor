/**
 */
package ciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.TemporalCondition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getTemporalCondition()
 * @model annotation="gmf.node label='name' tool.name='Temporal Condition' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/TemporalCondition.gif'"
 * @generated
 */
public interface TemporalCondition extends ProcessNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"..."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getTemporalCondition_Name()
	 * @model default="..."
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.TemporalCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TemporalCondition
