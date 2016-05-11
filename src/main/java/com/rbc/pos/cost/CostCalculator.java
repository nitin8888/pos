/**
 * 
 */
package com.rbc.pos.cost;

import com.rbc.pos.basket.Basket;
import com.rbc.pos.basket.OrderDetail;
import com.rbc.pos.price.PriceManager;
import com.rbc.pos.util.CurrencyUtil;

/**
 * Thread-safe singleton CostCalculator. It takes a basket of items and outputs its total cost.
 * 
 * @author Nitin Shreyakar
 */
public class CostCalculator {

	/**
	 * An instance of CostCalculator. 
	 */
	private static final CostCalculator INSTANCE = new CostCalculator();

	/**
	 * Gets an instance of CostCalculator.
	 * @return CostCalculator
	 */
	public static CostCalculator getInstance() {
		return INSTANCE;
	}

	/**
	 * Gets total cost for a basket of items.
	 * Note: This method calculates using primitive data type for high performance instead
	 * of using BigDecimal class.
	 * 
	 * @param basket the basket of items
	 * @return the total cost  
	 */
	public double getTotalCost(Basket basket) {
		int cost = 0;
		if (basket != null) {
			for (OrderDetail orderDetail : basket.getOrderDetails()) {
				int itemPrice = PriceManager.getInstance().getItemPrice(orderDetail.getItem());
				cost += itemPrice * orderDetail.getQuantity();
			}
		}
		return CurrencyUtil.costInPounds(cost);
	}
	
	/**
	 * Private constructor to avoid external instantiation
	 */
	private CostCalculator() {
	}
}
