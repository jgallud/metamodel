/**
 */
package offlinemodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import offlinemodel.AbstractNode;
import offlinemodel.Node;
import offlinemodel.OfflinemodelPackage;
import offlinemodel.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link offlinemodel.impl.NodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link offlinemodel.impl.NodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link offlinemodel.impl.NodeImpl#isComposite <em>Composite</em>}</li>
 *   <li>{@link offlinemodel.impl.NodeImpl#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractNodeImpl implements Node {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> children;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isComposite() <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComposite() <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean composite = COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfflinemodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<AbstractNode>(AbstractNode.class, this, OfflinemodelPackage.NODE__CHILDREN, OfflinemodelPackage.ABSTRACT_NODE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.NODE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfflinemodelPackage.NODE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfflinemodelPackage.NODE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.NODE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposite(boolean newComposite) {
		boolean oldComposite = composite;
		composite = newComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.NODE__COMPOSITE, oldComposite, composite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfflinemodelPackage.NODE__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * The cached invocation delegate for the '{@link #existeNodoPreCache() <em>Existe Nodo Pre Cache</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #existeNodoPreCache()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXISTE_NODO_PRE_CACHE__EINVOCATION_DELEGATE = ((EOperation.Internal)OfflinemodelPackage.Literals.NODE___EXISTE_NODO_PRE_CACHE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean existeNodoPreCache() {
		try {
			return (Boolean)EXISTE_NODO_PRE_CACHE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #existeNodoDefault() <em>Existe Nodo Default</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #existeNodoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXISTE_NODO_DEFAULT__EINVOCATION_DELEGATE = ((EOperation.Internal)OfflinemodelPackage.Literals.NODE___EXISTE_NODO_DEFAULT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean existeNodoDefault() {
		try {
			return (Boolean)EXISTE_NODO_DEFAULT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #existeNodoNoCache() <em>Existe Nodo No Cache</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #existeNodoNoCache()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXISTE_NODO_NO_CACHE__EINVOCATION_DELEGATE = ((EOperation.Internal)OfflinemodelPackage.Literals.NODE___EXISTE_NODO_NO_CACHE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean existeNodoNoCache() {
		try {
			return (Boolean)EXISTE_NODO_NO_CACHE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case OfflinemodelPackage.NODE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case OfflinemodelPackage.NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case OfflinemodelPackage.NODE__TYPE:
				return basicSetType(null, msgs);
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
			case OfflinemodelPackage.NODE__CHILDREN:
				return getChildren();
			case OfflinemodelPackage.NODE__TYPE:
				return getType();
			case OfflinemodelPackage.NODE__COMPOSITE:
				return isComposite();
			case OfflinemodelPackage.NODE__IS_ROOT:
				return isIsRoot();
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
			case OfflinemodelPackage.NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case OfflinemodelPackage.NODE__TYPE:
				setType((Type)newValue);
				return;
			case OfflinemodelPackage.NODE__COMPOSITE:
				setComposite((Boolean)newValue);
				return;
			case OfflinemodelPackage.NODE__IS_ROOT:
				setIsRoot((Boolean)newValue);
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
			case OfflinemodelPackage.NODE__CHILDREN:
				getChildren().clear();
				return;
			case OfflinemodelPackage.NODE__TYPE:
				setType((Type)null);
				return;
			case OfflinemodelPackage.NODE__COMPOSITE:
				setComposite(COMPOSITE_EDEFAULT);
				return;
			case OfflinemodelPackage.NODE__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
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
			case OfflinemodelPackage.NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case OfflinemodelPackage.NODE__TYPE:
				return type != null;
			case OfflinemodelPackage.NODE__COMPOSITE:
				return composite != COMPOSITE_EDEFAULT;
			case OfflinemodelPackage.NODE__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
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
			case OfflinemodelPackage.NODE___EXISTE_NODO_PRE_CACHE:
				return existeNodoPreCache();
			case OfflinemodelPackage.NODE___EXISTE_NODO_DEFAULT:
				return existeNodoDefault();
			case OfflinemodelPackage.NODE___EXISTE_NODO_NO_CACHE:
				return existeNodoNoCache();
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
		result.append(" (composite: ");
		result.append(composite);
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
