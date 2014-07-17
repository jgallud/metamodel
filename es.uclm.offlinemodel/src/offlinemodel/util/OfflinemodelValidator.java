/**
 */
package offlinemodel.util;

import java.util.Map;

import offlinemodel.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see offlinemodel.OfflinemodelPackage
 * @generated
 */
public class OfflinemodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OfflinemodelValidator INSTANCE = new OfflinemodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "offlinemodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfflinemodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OfflinemodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OfflinemodelPackage.OFFLINE_MODEL:
				return validateOfflineModel((OfflineModel)value, diagnostics, context);
			case OfflinemodelPackage.ABSTRACT_NODE:
				return validateAbstractNode((AbstractNode)value, diagnostics, context);
			case OfflinemodelPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case OfflinemodelPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case OfflinemodelPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case OfflinemodelPackage.NO_CACHE:
				return validateNoCache((NoCache)value, diagnostics, context);
			case OfflinemodelPackage.PRE_CACHE:
				return validatePreCache((PreCache)value, diagnostics, context);
			case OfflinemodelPackage.DEFAULT:
				return validateDefault((Default)value, diagnostics, context);
			case OfflinemodelPackage.FACET:
				return validateFacet((Facet)value, diagnostics, context);
			case OfflinemodelPackage.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case OfflinemodelPackage.OUTPUT:
				return validateOutput((Output)value, diagnostics, context);
			case OfflinemodelPackage.CONTROL:
				return validateControl((Control)value, diagnostics, context);
			case OfflinemodelPackage.NAVIGATION:
				return validateNavigation((Navigation)value, diagnostics, context);
			case OfflinemodelPackage.OFFLINE:
				return validateOffline((Offline)value, diagnostics, context);
			case OfflinemodelPackage.ONLINE:
				return validateOnline((Online)value, diagnostics, context);
			case OfflinemodelPackage.NORMAL:
				return validateNormal((Normal)value, diagnostics, context);
			case OfflinemodelPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case OfflinemodelPackage.SCHEME:
				return validateScheme((Scheme)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfflineModel(OfflineModel offlineModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(offlineModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateOfflineModel_IncrementalScheme(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateOfflineModel_MandatoryScheme(offlineModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateOfflineModel_FreeScheme(offlineModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IncrementalScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OFFLINE_MODEL__INCREMENTAL_SCHEME__EEXPRESSION = "\t\t\t\n" +
		"\t\t\tscheme=Scheme::Incremental implies rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()";

	/**
	 * Validates the IncrementalScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfflineModel_IncrementalScheme(OfflineModel offlineModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OfflinemodelPackage.Literals.OFFLINE_MODEL,
				 offlineModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IncrementalScheme",
				 OFFLINE_MODEL__INCREMENTAL_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MandatoryScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OFFLINE_MODEL__MANDATORY_SCHEME__EEXPRESSION = "\t\t\t\n" +
		"\t\t\tscheme=Scheme::Mandatory implies self.rootNode().existeNodoPreCache() and not self.rootNode().existeNodoDefault()";

	/**
	 * Validates the MandatoryScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfflineModel_MandatoryScheme(OfflineModel offlineModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OfflinemodelPackage.Literals.OFFLINE_MODEL,
				 offlineModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MandatoryScheme",
				 OFFLINE_MODEL__MANDATORY_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FreeScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OFFLINE_MODEL__FREE_SCHEME__EEXPRESSION = "\t\t\t\n" +
		"\t\t\tscheme=Scheme::Free implies not self.rootNode().existeNodoPreCache() and self.rootNode().existeNodoDefault()";

	/**
	 * Validates the FreeScheme constraint of '<em>Offline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfflineModel_FreeScheme(OfflineModel offlineModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OfflinemodelPackage.Literals.OFFLINE_MODEL,
				 offlineModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FreeScheme",
				 OFFLINE_MODEL__FREE_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractNode(AbstractNode abstractNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_ForceParentNode(element, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ForceParentNode constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT__FORCE_PARENT_NODE__EEXPRESSION = "\n" +
		"\t\t\tnot self.parent.oclIsUndefined()";

	/**
	 * Validates the ForceParentNode constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_ForceParentNode(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OfflinemodelPackage.Literals.ELEMENT,
				 element,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ForceParentNode",
				 ELEMENT__FORCE_PARENT_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCache(NoCache noCache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreCache(PreCache preCache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefault(Default default_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(default_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacet(Facet facet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(input, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(control, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigation(Navigation navigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(navigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffline(Offline offline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnline(Online online, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(online, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormal(Normal normal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheme(Scheme scheme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OfflinemodelValidator
