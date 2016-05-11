/**
 * 
 */
package com.rbc.pos.bdd.convertor;

/**
 * ItemPrice feature file Convertor.
 * 
 * @author Nitin Shreyakar
 */
public class ItemPriceConvertor {

	/**
	 * The item.
	 */
	private final String item;
	
	/**
	 * The price for the item.
	 */
	private final double price;
	
	/**
	 * Create an instance of this class and initialize parameters.
	 * @param item the item
	 * @param price the price for the item
	 */
	public ItemPriceConvertor(String item, double price) {
		this.item = item;
		this.price = price;
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
	 * Gets the price
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
}
