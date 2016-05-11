/**
 * 
 */
package com.rbc.pos.basket;

import com.rbc.pos.item.Item;

/**
 * The class for storing the order line item of the shopping basket.
 * 
 * @author Nitin Shreyakar
 */
public class OrderDetail {

	/**
	 * The item in the shopping basket.
	 */
	private final Item item;
	
	/**
	 * The quantity of the item.
	 */
	private final int quantity;
	
	/**
	 * Create an instance of this class and initialize parameters.
	 * @param item the item in the shopping basket
	 * @param quantity the quantity of the item
	 */
	public OrderDetail(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
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
	 * Gets the quantity
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
}
