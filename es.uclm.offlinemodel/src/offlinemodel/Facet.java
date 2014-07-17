/**
 */
package offlinemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.Facet#isEnabledOnline <em>Enabled Online</em>}</li>
 *   <li>{@link offlinemodel.Facet#isStorage <em>Storage</em>}</li>
 *   <li>{@link offlinemodel.Facet#isUpdate <em>Update</em>}</li>
 *   <li>{@link offlinemodel.Facet#isEnabledOffline <em>Enabled Offline</em>}</li>
 *   <li>{@link offlinemodel.Facet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getFacet()
 * @model abstract="true"
 * @generated
 */
public interface Facet extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Online</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Online</em>' attribute.
	 * @see #setEnabledOnline(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getFacet_EnabledOnline()
	 * @model
	 * @generated
	 */
	boolean isEnabledOnline();

	/**
	 * Sets the value of the '{@link offlinemodel.Facet#isEnabledOnline <em>Enabled Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Online</em>' attribute.
	 * @see #isEnabledOnline()
	 * @generated
	 */
	void setEnabledOnline(boolean value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getFacet_Storage()
	 * @model
	 * @generated
	 */
	boolean isStorage();

	/**
	 * Sets the value of the '{@link offlinemodel.Facet#isStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #isStorage()
	 * @generated
	 */
	void setStorage(boolean value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getFacet_Update()
	 * @model
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link offlinemodel.Facet#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * Returns the value of the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Offline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Offline</em>' attribute.
	 * @see #setEnabledOffline(boolean)
	 * @see offlinemodel.OfflinemodelPackage#getFacet_EnabledOffline()
	 * @model
	 * @generated
	 */
	boolean isEnabledOffline();

	/**
	 * Sets the value of the '{@link offlinemodel.Facet#isEnabledOffline <em>Enabled Offline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Offline</em>' attribute.
	 * @see #isEnabledOffline()
	 * @generated
	 */
	void setEnabledOffline(boolean value);

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
	 * @see offlinemodel.OfflinemodelPackage#getFacet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link offlinemodel.Facet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Facet
