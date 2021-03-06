/**
 */
package fr.kazejiyu.ekumi.model.catalog.impl;

import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;

import fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl;

import fr.kazejiyu.ekumi.model.catalog.ActivityTemplate;
import fr.kazejiyu.ekumi.model.catalog.Catalog;
import fr.kazejiyu.ekumi.model.catalog.CatalogFactory;
import fr.kazejiyu.ekumi.model.catalog.CatalogPackage;
import fr.kazejiyu.ekumi.model.catalog.Catalogs;
import fr.kazejiyu.ekumi.model.catalog.Category;
import fr.kazejiyu.ekumi.model.catalog.Group;

import fr.kazejiyu.ekumi.model.catalog.Identifiable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

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
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CatalogPackageImpl() {
		super(eNS_URI, CatalogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CatalogPackage init() {
		if (isInited)
			return (CatalogPackage) EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Obtain or create and register package
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CatalogPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EkumiPackageImpl theEkumiPackage = (EkumiPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EkumiPackage.eNS_URI) instanceof EkumiPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(EkumiPackage.eNS_URI)
						: EkumiPackage.eINSTANCE);

		// Create package meta-data objects
		theCatalogPackage.createPackageContents();
		theEkumiPackage.createPackageContents();

		// Initialize created meta-data
		theCatalogPackage.initializePackageContents();
		theEkumiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCatalogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
		return theCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_ActivityTemplates() {
		return (EReference) categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Categories() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Parent() {
		return (EReference) groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogs() {
		return catalogsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogs_Content() {
		return (EReference) catalogsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityTemplate() {
		return activityTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityTemplate_ModelPath() {
		return (EAttribute) activityTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityTemplate_Category() {
		return (EReference) activityTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityTemplate__ToActivity() {
		return activityTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Name() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Description() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactory getCatalogFactory() {
		return (CatalogFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		catalogEClass = createEClass(CATALOG);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__ACTIVITY_TEMPLATES);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__CATEGORIES);
		createEReference(groupEClass, GROUP__PARENT);

		catalogsEClass = createEClass(CATALOGS);
		createEReference(catalogsEClass, CATALOGS__CONTENT);

		activityTemplateEClass = createEClass(ACTIVITY_TEMPLATE);
		createEAttribute(activityTemplateEClass, ACTIVITY_TEMPLATE__MODEL_PATH);
		createEReference(activityTemplateEClass, ACTIVITY_TEMPLATE__CATEGORY);
		createEOperation(activityTemplateEClass, ACTIVITY_TEMPLATE___TO_ACTIVITY);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__NAME);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DESCRIPTION);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EkumiPackage theEkumiPackage = (EkumiPackage) EPackage.Registry.INSTANCE.getEPackage(EkumiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogEClass.getESuperTypes().add(this.getGroup());
		categoryEClass.getESuperTypes().add(this.getGroup());
		groupEClass.getESuperTypes().add(this.getIdentifiable());
		activityTemplateEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_ActivityTemplates(), this.getActivityTemplate(), this.getActivityTemplate_Category(),
				"activityTemplates", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Categories(), this.getGroup(), this.getGroup_Parent(), "categories", null, 0, -1,
				Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Parent(), this.getGroup(), this.getGroup_Categories(), "parent", null, 0, 1,
				Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogsEClass, Catalogs.class, "Catalogs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogs_Content(), this.getCatalog(), null, "content", null, 0, -1, Catalogs.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityTemplateEClass, ActivityTemplate.class, "ActivityTemplate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityTemplate_ModelPath(), ecorePackage.getEString(), "modelPath", null, 0, 1,
				ActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getActivityTemplate_Category(), this.getCategory(), this.getCategory_ActivityTemplates(),
				"category", null, 0, 1, ActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityTemplate__ToActivity(), theEkumiPackage.getActivity(), "toActivity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CatalogPackageImpl
