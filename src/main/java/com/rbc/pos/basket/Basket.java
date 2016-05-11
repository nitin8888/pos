/**
 * 
 */
package com.rbc.pos.basket;

import java.util.List;

import com.rbc.pos.item.Item;

/**
 * The Basket interface to add items and retrieve order details.
 * 
 * @author Nitin Shreyakar
 *
 */
public interface Basket {

	/**
	 * Add item to the basket
	 * @param item the item to be added 
	 * @param quantity the quantity of the item
	 */
	void addItem(Item item, int quantity);

	/**
	 * Gets the orderDetails
	 * @return the orderDetails
	 */
	List<OrderDetail> getOrderDetails();
}
