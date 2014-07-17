/**
 */
package offlinemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link offlinemodel.Element#getFacets <em>Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see offlinemodel.OfflinemodelPackage#getElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ForceParentNode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ForceParentNode='\n\t\t\tnot self.parent.oclIsUndefined()'"
 * @generated
 */
public interface Element extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link offlinemodel.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see offlinemodel.OfflinemodelPackage#getElement_Facets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Facet> getFacets();

} // Element
