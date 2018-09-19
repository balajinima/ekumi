package fr.kazejiyu.ekumi.catalog.provider;

import fr.kazejiyu.ekumi.core.ekumi.provider.ItemProviderAdapterDecorator;

/**
 * A decorator that forwards any method call to the item provider generated by EMF.
 * 
 * @author Emmanuel CHEBBI
 */
public class ForwardingItemProviderAdapterDecorator extends ItemProviderAdapterDecorator {

	public ForwardingItemProviderAdapterDecorator(CatalogDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
}