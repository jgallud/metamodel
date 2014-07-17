/**
 */
package offlinemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see offlinemodel.OfflinemodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface OfflinemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offlinemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://offlinemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "offlinemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OfflinemodelPackage eINSTANCE = offlinemodel.impl.OfflinemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link offlinemodel.impl.OfflineModelImpl <em>Offline Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.OfflineModelImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOfflineModel()
	 * @generated
	 */
	int OFFLINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL__NODES = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL__MODE = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL__SCHEME = 2;

	/**
	 * The number of structural features of the '<em>Offline Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Root Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL___ROOT_NODE = 0;

	/**
	 * The number of operations of the '<em>Offline Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.AbstractNodeImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ROOT = 2;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.NodeImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = ABSTRACT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ROOT = ABSTRACT_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSITE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_ROOT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Existe Nodo Pre Cache</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EXISTE_NODO_PRE_CACHE = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Existe Nodo Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EXISTE_NODO_DEFAULT = ABSTRACT_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Existe Nodo No Cache</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EXISTE_NODO_NO_CACHE = ABSTRACT_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.ElementImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = ABSTRACT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ROOT = ABSTRACT_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FACETS = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.TypeImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.NoCacheImpl <em>No Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.NoCacheImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNoCache()
	 * @generated
	 */
	int NO_CACHE = 5;

	/**
	 * The number of structural features of the '<em>No Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CACHE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CACHE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.PreCacheImpl <em>Pre Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.PreCacheImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getPreCache()
	 * @generated
	 */
	int PRE_CACHE = 6;

	/**
	 * The number of structural features of the '<em>Pre Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CACHE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CACHE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.DefaultImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 7;

	/**
	 * The number of structural features of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.FacetImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 8;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__ENABLED_ONLINE = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__STORAGE = 1;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__ENABLED_OFFLINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__NAME = 4;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.InputImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 9;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ENABLED_ONLINE = FACET__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__STORAGE = FACET__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__UPDATE = FACET__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ENABLED_OFFLINE = FACET__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = FACET__NAME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.OutputImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ENABLED_ONLINE = FACET__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__STORAGE = FACET__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__UPDATE = FACET__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ENABLED_OFFLINE = FACET__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = FACET__NAME;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.ControlImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ENABLED_ONLINE = FACET__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__STORAGE = FACET__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__UPDATE = FACET__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ENABLED_OFFLINE = FACET__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = FACET__NAME;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.NavigationImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 12;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__ENABLED_ONLINE = FACET__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__STORAGE = FACET__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__UPDATE = FACET__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__ENABLED_OFFLINE = FACET__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__NAME = FACET__NAME;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__DEST = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.OfflineImpl <em>Offline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.OfflineImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOffline()
	 * @generated
	 */
	int OFFLINE = 13;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__ENABLED_ONLINE = NAVIGATION__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__STORAGE = NAVIGATION__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__UPDATE = NAVIGATION__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__ENABLED_OFFLINE = NAVIGATION__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__NAME = NAVIGATION__NAME;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__DEST = NAVIGATION__DEST;

	/**
	 * The number of structural features of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.OnlineImpl <em>Online</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.OnlineImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOnline()
	 * @generated
	 */
	int ONLINE = 14;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__ENABLED_ONLINE = NAVIGATION__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__STORAGE = NAVIGATION__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__UPDATE = NAVIGATION__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__ENABLED_OFFLINE = NAVIGATION__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__NAME = NAVIGATION__NAME;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__DEST = NAVIGATION__DEST;

	/**
	 * The number of structural features of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.impl.NormalImpl
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 15;

	/**
	 * The feature id for the '<em><b>Enabled Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__ENABLED_ONLINE = NAVIGATION__ENABLED_ONLINE;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__STORAGE = NAVIGATION__STORAGE;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__UPDATE = NAVIGATION__UPDATE;

	/**
	 * The feature id for the '<em><b>Enabled Offline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__ENABLED_OFFLINE = NAVIGATION__ENABLED_OFFLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__NAME = NAVIGATION__NAME;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__DEST = NAVIGATION__DEST;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offlinemodel.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.Mode
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 16;

	/**
	 * The meta object id for the '{@link offlinemodel.Scheme <em>Scheme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offlinemodel.Scheme
	 * @see offlinemodel.impl.OfflinemodelPackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 17;


	/**
	 * Returns the meta object for class '{@link offlinemodel.OfflineModel <em>Offline Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline Model</em>'.
	 * @see offlinemodel.OfflineModel
	 * @generated
	 */
	EClass getOfflineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link offlinemodel.OfflineModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see offlinemodel.OfflineModel#getNodes()
	 * @see #getOfflineModel()
	 * @generated
	 */
	EReference getOfflineModel_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.OfflineModel#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see offlinemodel.OfflineModel#getMode()
	 * @see #getOfflineModel()
	 * @generated
	 */
	EAttribute getOfflineModel_Mode();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.OfflineModel#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see offlinemodel.OfflineModel#getScheme()
	 * @see #getOfflineModel()
	 * @generated
	 */
	EAttribute getOfflineModel_Scheme();

	/**
	 * Returns the meta object for the '{@link offlinemodel.OfflineModel#rootNode() <em>Root Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Root Node</em>' operation.
	 * @see offlinemodel.OfflineModel#rootNode()
	 * @generated
	 */
	EOperation getOfflineModel__RootNode();

	/**
	 * Returns the meta object for class '{@link offlinemodel.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see offlinemodel.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the container reference '{@link offlinemodel.AbstractNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see offlinemodel.AbstractNode#getParent()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.AbstractNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offlinemodel.AbstractNode#getName()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Name();

	/**
	 * Returns the meta object for the container reference '{@link offlinemodel.AbstractNode#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see offlinemodel.AbstractNode#getRoot()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Root();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see offlinemodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link offlinemodel.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see offlinemodel.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the containment reference '{@link offlinemodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see offlinemodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Node#isComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite</em>'.
	 * @see offlinemodel.Node#isComposite()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Composite();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Node#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see offlinemodel.Node#isIsRoot()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsRoot();

	/**
	 * Returns the meta object for the '{@link offlinemodel.Node#existeNodoPreCache() <em>Existe Nodo Pre Cache</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Existe Nodo Pre Cache</em>' operation.
	 * @see offlinemodel.Node#existeNodoPreCache()
	 * @generated
	 */
	EOperation getNode__ExisteNodoPreCache();

	/**
	 * Returns the meta object for the '{@link offlinemodel.Node#existeNodoDefault() <em>Existe Nodo Default</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Existe Nodo Default</em>' operation.
	 * @see offlinemodel.Node#existeNodoDefault()
	 * @generated
	 */
	EOperation getNode__ExisteNodoDefault();

	/**
	 * Returns the meta object for the '{@link offlinemodel.Node#existeNodoNoCache() <em>Existe Nodo No Cache</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Existe Nodo No Cache</em>' operation.
	 * @see offlinemodel.Node#existeNodoNoCache()
	 * @generated
	 */
	EOperation getNode__ExisteNodoNoCache();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see offlinemodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link offlinemodel.Element#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see offlinemodel.Element#getFacets()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Facets();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see offlinemodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link offlinemodel.NoCache <em>No Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Cache</em>'.
	 * @see offlinemodel.NoCache
	 * @generated
	 */
	EClass getNoCache();

	/**
	 * Returns the meta object for class '{@link offlinemodel.PreCache <em>Pre Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Cache</em>'.
	 * @see offlinemodel.PreCache
	 * @generated
	 */
	EClass getPreCache();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default</em>'.
	 * @see offlinemodel.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see offlinemodel.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Facet#isEnabledOnline <em>Enabled Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Online</em>'.
	 * @see offlinemodel.Facet#isEnabledOnline()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_EnabledOnline();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Facet#isStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see offlinemodel.Facet#isStorage()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Storage();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Facet#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see offlinemodel.Facet#isUpdate()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Update();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Facet#isEnabledOffline <em>Enabled Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Offline</em>'.
	 * @see offlinemodel.Facet#isEnabledOffline()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_EnabledOffline();

	/**
	 * Returns the meta object for the attribute '{@link offlinemodel.Facet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offlinemodel.Facet#getName()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Name();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see offlinemodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see offlinemodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see offlinemodel.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see offlinemodel.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the reference '{@link offlinemodel.Navigation#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see offlinemodel.Navigation#getDest()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Dest();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Offline <em>Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline</em>'.
	 * @see offlinemodel.Offline
	 * @generated
	 */
	EClass getOffline();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online</em>'.
	 * @see offlinemodel.Online
	 * @generated
	 */
	EClass getOnline();

	/**
	 * Returns the meta object for class '{@link offlinemodel.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see offlinemodel.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for enum '{@link offlinemodel.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see offlinemodel.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link offlinemodel.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme</em>'.
	 * @see offlinemodel.Scheme
	 * @generated
	 */
	EEnum getScheme();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OfflinemodelFactory getOfflinemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link offlinemodel.impl.OfflineModelImpl <em>Offline Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.OfflineModelImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOfflineModel()
		 * @generated
		 */
		EClass OFFLINE_MODEL = eINSTANCE.getOfflineModel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFLINE_MODEL__NODES = eINSTANCE.getOfflineModel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFLINE_MODEL__MODE = eINSTANCE.getOfflineModel_Mode();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFLINE_MODEL__SCHEME = eINSTANCE.getOfflineModel_Scheme();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFLINE_MODEL___ROOT_NODE = eINSTANCE.getOfflineModel__RootNode();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.AbstractNodeImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__PARENT = eINSTANCE.getAbstractNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__NAME = eINSTANCE.getAbstractNode_Name();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__ROOT = eINSTANCE.getAbstractNode_Root();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.NodeImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COMPOSITE = eINSTANCE.getNode_Composite();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_ROOT = eINSTANCE.getNode_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Existe Nodo Pre Cache</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___EXISTE_NODO_PRE_CACHE = eINSTANCE.getNode__ExisteNodoPreCache();

		/**
		 * The meta object literal for the '<em><b>Existe Nodo Default</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___EXISTE_NODO_DEFAULT = eINSTANCE.getNode__ExisteNodoDefault();

		/**
		 * The meta object literal for the '<em><b>Existe Nodo No Cache</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___EXISTE_NODO_NO_CACHE = eINSTANCE.getNode__ExisteNodoNoCache();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.ElementImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__FACETS = eINSTANCE.getElement_Facets();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.TypeImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.NoCacheImpl <em>No Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.NoCacheImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNoCache()
		 * @generated
		 */
		EClass NO_CACHE = eINSTANCE.getNoCache();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.PreCacheImpl <em>Pre Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.PreCacheImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getPreCache()
		 * @generated
		 */
		EClass PRE_CACHE = eINSTANCE.getPreCache();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.DefaultImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.FacetImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '<em><b>Enabled Online</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__ENABLED_ONLINE = eINSTANCE.getFacet_EnabledOnline();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__STORAGE = eINSTANCE.getFacet_Storage();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__UPDATE = eINSTANCE.getFacet_Update();

		/**
		 * The meta object literal for the '<em><b>Enabled Offline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__ENABLED_OFFLINE = eINSTANCE.getFacet_EnabledOffline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__NAME = eINSTANCE.getFacet_Name();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.InputImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.OutputImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.ControlImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.NavigationImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__DEST = eINSTANCE.getNavigation_Dest();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.OfflineImpl <em>Offline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.OfflineImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOffline()
		 * @generated
		 */
		EClass OFFLINE = eINSTANCE.getOffline();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.OnlineImpl <em>Online</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.OnlineImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getOnline()
		 * @generated
		 */
		EClass ONLINE = eINSTANCE.getOnline();

		/**
		 * The meta object literal for the '{@link offlinemodel.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.impl.NormalImpl
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '{@link offlinemodel.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.Mode
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link offlinemodel.Scheme <em>Scheme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offlinemodel.Scheme
		 * @see offlinemodel.impl.OfflinemodelPackageImpl#getScheme()
		 * @generated
		 */
		EEnum SCHEME = eINSTANCE.getScheme();

	}

} //OfflinemodelPackage
