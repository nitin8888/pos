/**
 * 
 */
package com.rbc.pos.price;

import com.rbc.pos.item.Item;

/**
 * The class for storing item and price.
 * 
 * @author Nitin Shreyakar
 */
public class ItemPrice {

	/**
	 * The item.
	 */
	private final Item item;
	
	/**
	 * The price for the item.
	 */
	private final int price;
	
	/**
	 * Create an instance of this class and initialize parameters.
	 * @param item the item
	 * @param price the price for the item
	 */
	public ItemPrice(Item item, int price) {
		this.item = item;
		this.price = price;
	}

	/* -- Getters -- */
	/**
	 * Gets the item
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	
	/**
	 * Gets the price
	 * @return the price
	 */
	public int getQuantity() {
		return price;
	}
}
