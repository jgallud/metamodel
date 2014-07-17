/**
 */
package offlinemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.AbstractNode#getParent <em>Parent</em>}</li>
 *   <li>{@link offlinemodel.AbstractNode#getName <em>Name</em>}</li>
 *   <li>{@link offlinemodel.AbstractNode#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link offlinemodel.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Node)
	 * @see offlinemodel.OfflinemodelPackage#getAbstractNode_Parent()
	 * @see offlinemodel.Node#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link offlinemodel.AbstractNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see offlinemodel.OfflinemodelPackage#getAbstractNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link offlinemodel.AbstractNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link offlinemodel.OfflineModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(OfflineModel)
	 * @see offlinemodel.OfflinemodelPackage#getAbstractNode_Root()
	 * @see offlinemodel.OfflineModel#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	OfflineModel getRoot();

	/**
	 * Sets the value of the '{@link offlinemodel.AbstractNode#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(OfflineModel value);

} // AbstractNode
