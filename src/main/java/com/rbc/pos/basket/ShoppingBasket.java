/**
 * 
 */
package com.rbc.pos.basket;

import java.util.ArrayList;
import java.util.List;

import com.rbc.pos.item.Item;

/**
 * The implementation of Basket interface to add items and retrieve order details.
 * 
 * @author Nitin Shreyakar
 */
public class ShoppingBasket implements Basket {

	/**
	 * Store list of <code>OrderDetail</code> objects
	 */
	private final List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();

	/* -- Basket implementation methods -- */
	@Override
	public void addItem(Item item, int quantity) {
		orderDetails.add(new OrderDetail(item, quantity));
	}

	@Override
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
}
