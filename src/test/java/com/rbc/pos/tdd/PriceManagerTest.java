package com.rbc.pos.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rbc.pos.item.Item;
import com.rbc.pos.price.PriceManager;

/**
 * The class to test <code>PriceManager</code>.
 * 
 * @author Nitin Shreyakar
 */
public class PriceManagerTest {

	/**
	 * test Store and get Item Price.
	 */
	@Test
	public void testStoreItemPrice() {

		Item item = new Item("abc");
		double priceInPounds = 123.45;
		int priceInPence = 12345;
		PriceManager priceManager = PriceManager.getInstance();
		priceManager.storeItemPrice(item, priceInPounds);
		assertTrue("Failed to store £" + priceInPounds + " and retrieve " + priceInPence + " pence", 
				priceInPence == priceManager.getItemPrice(item));
	}
}
