/**
 */
package offlinemodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import offlinemodel.AbstractNode;
import offlinemodel.Mode;
import offlinemodel.Node;
import offlinemodel.OfflineModel;
import offlinemodel.OfflinemodelPackage;
import offlinemodel.Scheme;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offline Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link offlinemodel.impl.OfflineModelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link offlinemodel.impl.OfflineModelImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link offlinemodel.impl.OfflineModelImpl#getScheme <em>Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfflineModelImpl extends MinimalEObjectImpl.Container implements OfflineModel {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> nodes;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Mode MODE_EDEFAULT = Mode.OFFLINE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final Scheme SCHEME_EDEFAULT = Scheme.MANDATORY;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected Scheme scheme = SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfflineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfflinemodelPackage.Literals.OFFLINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<AbstractNode>(AbstractNode.class, this, OfflinemodelPackage.OFFLINE_MODEL__NODES, OfflinemodelPackage.ABSTRACT_NODE__ROOT);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.OFFLINE_MODEL__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheme getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(Scheme newScheme) {
		Scheme oldScheme = scheme;
		scheme = newScheme == null ? SCHEME_EDEFAULT : newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.OFFLINE_MODEL__SCHEME, oldScheme, scheme));
	}

	/**
	 * The cached invocation delegate for the '{@link #rootNode() <em>Root Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #rootNode()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ROOT_NODE__EINVOCATION_DELEGATE = ((EOperation.Internal)OfflinemodelPackage.Literals.OFFLINE_MODEL___ROOT_NODE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node rootNode() {
		try {
			return (Node)ROOT_NODE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				return getNodes();
			case OfflinemodelPackage.OFFLINE_MODEL__MODE:
				return getMode();
			case OfflinemodelPackage.OFFLINE_MODEL__SCHEME:
				return getScheme();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case OfflinemodelPackage.OFFLINE_MODEL__MODE:
				setMode((Mode)newValue);
				return;
			case OfflinemodelPackage.OFFLINE_MODEL__SCHEME:
				setScheme((Scheme)newValue);
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
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				getNodes().clear();
				return;
			case OfflinemodelPackage.OFFLINE_MODEL__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case OfflinemodelPackage.OFFLINE_MODEL__SCHEME:
				setScheme(SCHEME_EDEFAULT);
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
			case OfflinemodelPackage.OFFLINE_MODEL__NODES:
				return nodes != null && !nodes.isEmpty();
			case OfflinemodelPackage.OFFLINE_MODEL__MODE:
				return mode != MODE_EDEFAULT;
			case OfflinemodelPackage.OFFLINE_MODEL__SCHEME:
				return scheme != SCHEME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OfflinemodelPackage.OFFLINE_MODEL___ROOT_NODE:
				return rootNode();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //OfflineModelImpl
