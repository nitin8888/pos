/**
 * 
 */
package com.rbc.pos.bdd.convertor;

/**
 * ItemQuantity feature file Convertor. 
 * 
 * @author Nitin Shreyakar
 *
 */
public class ItemQuantityConvertor {

	/**
	 * The item.
	 */
	private final String item;
	
	/**
	 * The quantity for the item.
	 */
	private final int quantity;
	
	/**
	 * Create an instance of this class and initialize parameters.
	 * @param item the item
	 * @param quantity the quantity for the item
	 */
	public ItemQuantityConvertor(String item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	/* -- Getters -- */
	/**
	 * Gets the item
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	
	/**
	 * Gets the quantity
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
}
