/**
 */
package offlinemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.Navigation#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getNavigation()
 * @model abstract="true"
 * @generated
 */
public interface Navigation extends Facet {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(Node)
	 * @see offlinemodel.OfflinemodelPackage#getNavigation_Dest()
	 * @model required="true"
	 * @generated
	 */
	Node getDest();

	/**
	 * Sets the value of the '{@link offlinemodel.Navigation#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(Node value);

} // Navigation
