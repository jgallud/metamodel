/**
 */
package offlinemodel.impl;

import offlinemodel.Facet;
import offlinemodel.OfflinemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link offlinemodel.impl.FacetImpl#isEnabledOnline <em>Enabled Online</em>}</li>
 *   <li>{@link offlinemodel.impl.FacetImpl#isStorage <em>Storage</em>}</li>
 *   <li>{@link offlinemodel.impl.FacetImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link offlinemodel.impl.FacetImpl#isEnabledOffline <em>Enabled Offline</em>}</li>
 *   <li>{@link offlinemodel.impl.FacetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FacetImpl extends MinimalEObjectImpl.Container implements Facet {
	/**
	 * The default value of the '{@link #isEnabledOnline() <em>Enabled Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledOnline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_ONLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabledOnline() <em>Enabled Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledOnline()
	 * @generated
	 * @ordered
	 */
	protected boolean enabledOnline = ENABLED_ONLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean storage = STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabledOffline() <em>Enabled Offline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledOffline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_OFFLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabledOffline() <em>Enabled Offline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledOffline()
	 * @generated
	 * @ordered
	 */
	protected boolean enabledOffline = ENABLED_OFFLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfflinemodelPackage.Literals.FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabledOnline() {
		return enabledOnline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledOnline(boolean newEnabledOnline) {
		boolean oldEnabledOnline = enabledOnline;
		enabledOnline = newEnabledOnline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.FACET__ENABLED_ONLINE, oldEnabledOnline, enabledOnline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(boolean newStorage) {
		boolean oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.FACET__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.FACET__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabledOffline() {
		return enabledOffline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledOffline(boolean newEnabledOffline) {
		boolean oldEnabledOffline = enabledOffline;
		enabledOffline = newEnabledOffline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.FACET__ENABLED_OFFLINE, oldEnabledOffline, enabledOffline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.FACET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OfflinemodelPackage.FACET__ENABLED_ONLINE:
				return isEnabledOnline();
			case OfflinemodelPackage.FACET__STORAGE:
				return isStorage();
			case OfflinemodelPackage.FACET__UPDATE:
				return isUpdate();
			case OfflinemodelPackage.FACET__ENABLED_OFFLINE:
				return isEnabledOffline();
			case OfflinemodelPackage.FACET__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OfflinemodelPackage.FACET__ENABLED_ONLINE:
				setEnabledOnline((Boolean)newValue);
				return;
			case OfflinemodelPackage.FACET__STORAGE:
				setStorage((Boolean)newValue);
				return;
			case OfflinemodelPackage.FACET__UPDATE:
				setUpdate((Boolean)newValue);
				return;
			case OfflinemodelPackage.FACET__ENABLED_OFFLINE:
				setEnabledOffline((Boolean)newValue);
				return;
			case OfflinemodelPackage.FACET__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OfflinemodelPackage.FACET__ENABLED_ONLINE:
				setEnabledOnline(ENABLED_ONLINE_EDEFAULT);
				return;
			case OfflinemodelPackage.FACET__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case OfflinemodelPackage.FACET__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case OfflinemodelPackage.FACET__ENABLED_OFFLINE:
				setEnabledOffline(ENABLED_OFFLINE_EDEFAULT);
				return;
			case OfflinemodelPackage.FACET__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OfflinemodelPackage.FACET__ENABLED_ONLINE:
				return enabledOnline != ENABLED_ONLINE_EDEFAULT;
			case OfflinemodelPackage.FACET__STORAGE:
				return storage != STORAGE_EDEFAULT;
			case OfflinemodelPackage.FACET__UPDATE:
				return update != UPDATE_EDEFAULT;
			case OfflinemodelPackage.FACET__ENABLED_OFFLINE:
				return enabledOffline != ENABLED_OFFLINE_EDEFAULT;
			case OfflinemodelPackage.FACET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (EnabledOnline: ");
		result.append(enabledOnline);
		result.append(", storage: ");
		result.append(storage);
		result.append(", update: ");
		result.append(update);
		result.append(", EnabledOffline: ");
		result.append(enabledOffline);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FacetImpl
