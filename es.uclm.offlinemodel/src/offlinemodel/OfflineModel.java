/**
 */
package offlinemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offline Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.OfflineModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link offlinemodel.OfflineModel#getMode <em>Mode</em>}</li>
 *   <li>{@link offlinemodel.OfflineModel#getScheme <em>Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getOfflineModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IncrementalScheme MandatoryScheme FreeScheme'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IncrementalScheme='\t\t\t\n\t\t\tscheme=Scheme::Incremental implies rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()' MandatoryScheme='\t\t\t\n\t\t\tscheme=Scheme::Mandatory implies self.rootNode().existeNodoPreCache() and not self.rootNode().existeNodoDefault()' FreeScheme='\t\t\t\n\t\t\tscheme=Scheme::Free implies not self.rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()'"
 * @generated
 */
public interface OfflineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link offlinemodel.AbstractNode}.
	 * It is bidirectional and its opposite is '{@link offlinemodel.AbstractNode#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see offlinemodel.OfflinemodelPackage#getOfflineModel_Nodes()
	 * @see offlinemodel.AbstractNode#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link offlinemodel.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see offlinemodel.Mode
	 * @see #setMode(Mode)
	 * @see offlinemodel.OfflinemodelPackage#getOfflineModel_Mode()
	 * @model required="true"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link offlinemodel.OfflineModel#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see offlinemodel.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link offlinemodel.Scheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see offlinemodel.Scheme
	 * @see #setScheme(Scheme)
	 * @see offlinemodel.OfflinemodelPackage#getOfflineModel_Scheme()
	 * @model required="true"
	 * @generated
	 */
	Scheme getScheme();

	/**
	 * Sets the value of the '{@link offlinemodel.OfflineModel#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see offlinemodel.Scheme
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(Scheme value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tnodes->any(parent.oclIsUndefined())'"
	 * @generated
	 */
	Node rootNode();

} // OfflineModel
