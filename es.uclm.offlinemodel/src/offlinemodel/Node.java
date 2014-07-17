/**
 */
package offlinemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link offlinemodel.Node#getType <em>Type</em>}</li>
 *   <li>{@link offlinemodel.Node#isComposite <em>Composite</em>}</li>
 *   <li>{@link offlinemodel.Node#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link offlinemodel.AbstractNode}.
	 * It is bidirectional and its opposite is '{@link offlinemodel.AbstractNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see offlinemodel.OfflinemodelPackage#getNode_Children()
	 * @see offlinemodel.AbstractNode#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AbstractNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see offlinemodel.OfflinemodelPackage#getNode_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link offlinemodel.Node#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' attribute.
	 * @see #setComposite(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getNode_Composite()
	 * @model
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link offlinemodel.Node#isComposite <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getNode_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link offlinemodel.Node#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(PreCache))'"
	 * @generated
	 */
	boolean existeNodoPreCache();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(Default))'"
	 * @generated
	 */
	boolean existeNodoDefault();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(NoCache))'"
	 * @generated
	 */
	boolean existeNodoNoCache();

} // Node
