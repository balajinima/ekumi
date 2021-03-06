/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getActivityTemplate()
 * @model
 * @generated
 */
public interface ActivityTemplate extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Model Path</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Path</em>' attribute.
	 * @see #setModelPath(String)
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getActivityTemplate_ModelPath()
	 * @model
	 * @generated
	 */
	String getModelPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getModelPath <em>Model Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Path</em>' attribute.
	 * @see #getModelPath()
	 * @generated
	 */
	void setModelPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.catalog.Category#getActivityTemplates <em>Activity Templates</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getActivityTemplate_Category()
	 * @see fr.kazejiyu.ekumi.model.catalog.Category#getActivityTemplates
	 * @model opposite="activityTemplates" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getCategory <em>Category</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Activity toActivity();

} // ActivityTemplate
