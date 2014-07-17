/**
 */
package offlinemodel.impl;

import offlinemodel.AbstractNode;
import offlinemodel.Control;
import offlinemodel.Default;
import offlinemodel.Element;
import offlinemodel.Facet;
import offlinemodel.Input;
import offlinemodel.Mode;
import offlinemodel.Navigation;
import offlinemodel.NoCache;
import offlinemodel.Node;
import offlinemodel.Normal;
import offlinemodel.Offline;
import offlinemodel.OfflineModel;
import offlinemodel.OfflinemodelFactory;
import offlinemodel.OfflinemodelPackage;
import offlinemodel.Online;
import offlinemodel.Output;
import offlinemodel.PreCache;
import offlinemodel.Scheme;
import offlinemodel.Type;

import offlinemodel.util.OfflinemodelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfflinemodelPackageImpl extends EPackageImpl implements OfflinemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offlineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see offlinemodel.OfflinemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OfflinemodelPackageImpl() {
		super(eNS_URI, OfflinemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OfflinemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OfflinemodelPackage init() {
		if (isInited) return (OfflinemodelPackage)EPackage.Registry.INSTANCE.getEPackage(OfflinemodelPackage.eNS_URI);

		// Obtain or create and register package
		OfflinemodelPackageImpl theOfflinemodelPackage = (OfflinemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OfflinemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OfflinemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOfflinemodelPackage.createPackageContents();

		// Initialize created meta-data
		theOfflinemodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOfflinemodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OfflinemodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOfflinemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OfflinemodelPackage.eNS_URI, theOfflinemodelPackage);
		return theOfflinemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfflineModel() {
		return offlineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfflineModel_Nodes() {
		return (EReference)offlineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfflineModel_Mode() {
		return (EAttribute)offlineModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfflineModel_Scheme() {
		return (EAttribute)offlineModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOfflineModel__RootNode() {
		return offlineModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Parent() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Name() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Root() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Children() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Type() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Composite() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_IsRoot() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__ExisteNodoPreCache() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__ExisteNodoDefault() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__ExisteNodoNoCache() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Facets() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoCache() {
		return noCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreCache() {
		return preCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_EnabledOnline() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_Storage() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_Update() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_EnabledOffline() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacet_Name() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigation() {
		return navigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigation_Dest() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffline() {
		return offlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnline() {
		return onlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormal() {
		return normalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScheme() {
		return schemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfflinemodelFactory getOfflinemodelFactory() {
		return (OfflinemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		offlineModelEClass = createEClass(OFFLINE_MODEL);
		createEReference(offlineModelEClass, OFFLINE_MODEL__NODES);
		createEAttribute(offlineModelEClass, OFFLINE_MODEL__MODE);
		createEAttribute(offlineModelEClass, OFFLINE_MODEL__SCHEME);
		createEOperation(offlineModelEClass, OFFLINE_MODEL___ROOT_NODE);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__PARENT);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__NAME);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__ROOT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__CHILDREN);
		createEReference(nodeEClass, NODE__TYPE);
		createEAttribute(nodeEClass, NODE__COMPOSITE);
		createEAttribute(nodeEClass, NODE__IS_ROOT);
		createEOperation(nodeEClass, NODE___EXISTE_NODO_PRE_CACHE);
		createEOperation(nodeEClass, NODE___EXISTE_NODO_DEFAULT);
		createEOperation(nodeEClass, NODE___EXISTE_NODO_NO_CACHE);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__FACETS);

		typeEClass = createEClass(TYPE);

		noCacheEClass = createEClass(NO_CACHE);

		preCacheEClass = createEClass(PRE_CACHE);

		defaultEClass = createEClass(DEFAULT);

		facetEClass = createEClass(FACET);
		createEAttribute(facetEClass, FACET__ENABLED_ONLINE);
		createEAttribute(facetEClass, FACET__STORAGE);
		createEAttribute(facetEClass, FACET__UPDATE);
		createEAttribute(facetEClass, FACET__ENABLED_OFFLINE);
		createEAttribute(facetEClass, FACET__NAME);

		inputEClass = createEClass(INPUT);

		outputEClass = createEClass(OUTPUT);

		controlEClass = createEClass(CONTROL);

		navigationEClass = createEClass(NAVIGATION);
		createEReference(navigationEClass, NAVIGATION__DEST);

		offlineEClass = createEClass(OFFLINE);

		onlineEClass = createEClass(ONLINE);

		normalEClass = createEClass(NORMAL);

		// Create enums
		modeEEnum = createEEnum(MODE);
		schemeEEnum = createEEnum(SCHEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getAbstractNode());
		elementEClass.getESuperTypes().add(this.getAbstractNode());
		noCacheEClass.getESuperTypes().add(this.getType());
		preCacheEClass.getESuperTypes().add(this.getType());
		defaultEClass.getESuperTypes().add(this.getType());
		inputEClass.getESuperTypes().add(this.getFacet());
		outputEClass.getESuperTypes().add(this.getFacet());
		controlEClass.getESuperTypes().add(this.getFacet());
		navigationEClass.getESuperTypes().add(this.getFacet());
		offlineEClass.getESuperTypes().add(this.getNavigation());
		onlineEClass.getESuperTypes().add(this.getNavigation());
		normalEClass.getESuperTypes().add(this.getNavigation());

		// Initialize classes, features, and operations; add parameters
		initEClass(offlineModelEClass, OfflineModel.class, "OfflineModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOfflineModel_Nodes(), this.getAbstractNode(), this.getAbstractNode_Root(), "nodes", null, 0, -1, OfflineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfflineModel_Mode(), this.getMode(), "mode", null, 1, 1, OfflineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfflineModel_Scheme(), this.getScheme(), "scheme", null, 1, 1, OfflineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOfflineModel__RootNode(), this.getNode(), "rootNode", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNode_Parent(), this.getNode(), this.getNode_Children(), "parent", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_Root(), this.getOfflineModel(), this.getOfflineModel_Nodes(), "root", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Children(), this.getAbstractNode(), this.getAbstractNode_Parent(), "children", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Type(), this.getType(), null, "type", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Composite(), ecorePackage.getEBoolean(), "composite", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__ExisteNodoPreCache(), ecorePackage.getEBoolean(), "existeNodoPreCache", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__ExisteNodoDefault(), ecorePackage.getEBoolean(), "existeNodoDefault", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__ExisteNodoNoCache(), ecorePackage.getEBoolean(), "existeNodoNoCache", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Facets(), this.getFacet(), null, "facets", null, 1, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noCacheEClass, NoCache.class, "NoCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preCacheEClass, PreCache.class, "PreCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facetEClass, Facet.class, "Facet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacet_EnabledOnline(), ecorePackage.getEBoolean(), "EnabledOnline", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_Storage(), ecorePackage.getEBoolean(), "storage", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_Update(), ecorePackage.getEBoolean(), "update", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_EnabledOffline(), ecorePackage.getEBoolean(), "EnabledOffline", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationEClass, Navigation.class, "Navigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigation_Dest(), this.getNode(), null, "dest", null, 1, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offlineEClass, Offline.class, "Offline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlineEClass, Online.class, "Online", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.OFFLINE);
		addEEnumLiteral(modeEEnum, Mode.ONLINE);
		addEEnumLiteral(modeEEnum, Mode.EDITION);

		initEEnum(schemeEEnum, Scheme.class, "Scheme");
		addEEnumLiteral(schemeEEnum, Scheme.MANDATORY);
		addEEnumLiteral(schemeEEnum, Scheme.FREE);
		addEEnumLiteral(schemeEEnum, Scheme.INCREMENTAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (offlineModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "IncrementalScheme MandatoryScheme FreeScheme"
		   });							
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ForceParentNode"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";				
		addAnnotation
		  (offlineModelEClass, 
		   source, 
		   new String[] {
			 "IncrementalScheme", "\t\t\t\n\t\t\tscheme=Scheme::Incremental implies rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()",
			 "MandatoryScheme", "\t\t\t\n\t\t\tscheme=Scheme::Mandatory implies self.rootNode().existeNodoPreCache() and not self.rootNode().existeNodoDefault()",
			 "FreeScheme", "\t\t\t\n\t\t\tscheme=Scheme::Free implies not self.rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()"
		   });		
		addAnnotation
		  (getOfflineModel__RootNode(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tnodes->any(parent.oclIsUndefined())"
		   });		
		addAnnotation
		  (getNode__ExisteNodoPreCache(), 
		   source, 
		   new String[] {
			 "body", "self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(PreCache))"
		   });		
		addAnnotation
		  (getNode__ExisteNodoDefault(), 
		   source, 
		   new String[] {
			 "body", "self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(Default))"
		   });		
		addAnnotation
		  (getNode__ExisteNodoNoCache(), 
		   source, 
		   new String[] {
			 "body", "self.children->closure(ch:AbstractNode | if (ch.oclIsTypeOf(Node)) then (ch.oclAsType(Node).children->including(self)) else Set(AbstractNode){} endif)->including(self)->select( oclIsTypeOf(Node))->collect(oclAsType(Node))->exists(v:Node | v.type.oclIsTypeOf(NoCache))"
		   });			
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "ForceParentNode", "\n\t\t\tnot self.parent.oclIsUndefined()"
		   });
	}

} //OfflinemodelPackageImpl
