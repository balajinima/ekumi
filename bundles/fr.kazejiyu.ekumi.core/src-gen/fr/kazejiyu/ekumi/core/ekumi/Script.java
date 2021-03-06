/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Script#getPath <em>Path</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Script#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Script#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScript()
 * @model abstract="true"
 * @generated
 */
public interface Script extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScript_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Script#getPath <em>Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScript_Inputs()
	 * @model
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScript_Outputs()
	 * @model
	 * @generated
	 */
	EList<Variable> getOutputs();

} // Script
