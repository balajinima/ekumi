package fr.kazejiyu.ekumi.catalog.provider;

import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;

import fr.kazejiyu.ekumi.model.catalog.ActivityTemplate;
import fr.kazejiyu.ekumi.model.catalog.Catalog;
import fr.kazejiyu.ekumi.model.catalog.Category;
import fr.kazejiyu.ekumi.model.catalog.provider.CatalogItemProviderAdapterFactory;

public class CatalogDecoratorAdapterFactory extends DecoratorAdapterFactory {
	
	public CatalogDecoratorAdapterFactory() {
		super(new CatalogItemProviderAdapterFactory());
	}

	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target, Object type) {
		// Delegate to custom item providers
		if (target instanceof Catalog)
			return new CatalogItemProviderDecorator(this);
		if (target instanceof Category)
			return new CategoryItemProviderDecorator(this);
		if (target instanceof ActivityTemplate)
			return new ActivityTemplateItemProviderDecorator(this);
		
		// Use default, generated item providers
		return new ForwardingItemProviderAdapterDecorator(this);
	}

}
