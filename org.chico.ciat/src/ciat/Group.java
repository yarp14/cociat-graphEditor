/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.Group#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getGroup()
 * @model annotation="gmf.node label='name' tool.name='Group' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/Group.gif'"
 * @generated
 */
public interface Group extends SociogramNode {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link ciat.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see ciat.CiatPackage#getGroup_Contains()
	 * @model
	 * @generated
	 */
	EList<Actor> getContains();

} // Group
