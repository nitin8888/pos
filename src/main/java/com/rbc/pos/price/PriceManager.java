/**
 * 
 */
package com.rbc.pos.price;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.rbc.pos.item.Item;
import com.rbc.pos.util.CurrencyUtil;

/**
 * Thread-safe singleton Price manager to store and retrieve Item price.
 * 
 * @author Nitin Shreyakar
 */
public class PriceManager {

	/**
	 * An instance of PriceManager. 
	 */
	private static final PriceManager INSTANCE = new PriceManager();

	/**
	 * Map of Item and Price.
	 */
	private final Map<Item, Integer> itemPriceMap = new ConcurrentHashMap<>(); 
	
	/**
	 * Gets an instance of PriceManager.
	 * @return PriceManager
	 */
	public static PriceManager getInstance() {
		return INSTANCE;
	}

	/**
	 * Store Item and Price in the map.
	 * @param item the item to be stored
	 * @param price the price of the item 
	 */
	public void storeItemPrice(Item item, double price) {
		itemPriceMap.put(item, CurrencyUtil.costInPence(price));
	}

	/**
	 * Gets the price of Item.
	 * @param item the item's price to be queried
	 * @return the price of Item in pence 
	 */
	public int getItemPrice(Item item) {
		assert item != null : "Passed parameter item should not be null";
		Integer price = itemPriceMap.get(item);
		if (price == null) {
			throw new IllegalArgumentException("No price specified for item:" + item.getName());
		}
		return price;
	}
	
	/**
	 * Private constructor to avoid external instantiation
	 */
	private PriceManager() {
	}
}
