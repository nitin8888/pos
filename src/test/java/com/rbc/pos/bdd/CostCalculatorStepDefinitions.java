package com.rbc.pos.bdd;


import static org.junit.Assert.assertTrue;

import java.util.List;

import com.rbc.pos.basket.Basket;
import com.rbc.pos.basket.ShoppingBasket;
import com.rbc.pos.bdd.convertor.ItemPriceConvertor;
import com.rbc.pos.bdd.convertor.ItemQuantityConvertor;
import com.rbc.pos.cost.CostCalculator;
import com.rbc.pos.item.Item;
import com.rbc.pos.price.PriceManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * CostCalculator BDD Step definitions.
 * @author Nitin Shreyakar
 */
public class CostCalculatorStepDefinitions {
	
	/**
	 * The shopping basket.
	 */
	private final Basket basket;
	
	/**
	 * Create an instance of this class and initialize parameters.
	 */
	public CostCalculatorStepDefinitions() {
		basket = new ShoppingBasket();
	}

	/**
	 * Store Item and Price in PriceManager 
	 * @param itemPrices the Item and Price object 
	 * @throws Throwable any error
	 */
	@Given("^cost of items$")
	public void cost_of_items(List<ItemPriceConvertor> itemPrices) throws Throwable {

		for (ItemPriceConvertor itemPrice : itemPrices) {
			Item item = new Item(itemPrice.getItem());
			PriceManager.getInstance().storeItemPrice(item, itemPrice.getPrice());
		}
	}
	
	/**
	 * Add Items to shopping basket 
	 * @param itemQuantities the Item and Quantity object
	 * @throws Throwable any error
	 */
	@Given("^items in my shopping basket are$")
	public void items_in_my_shopping_basket_are(List<ItemQuantityConvertor> itemQuantities) throws Throwable {
		for (ItemQuantityConvertor itemQuantity : itemQuantities) {
			Item item = new Item(itemQuantity.getItem());
			basket.addItem(item, itemQuantity.getQuantity());
		}
	}
	
	/**
	 * Test cost parameter to the calculated total cost.  
	 * @param cost the cost to verify
	 * @throws Throwable any error
	 */
	@Then("^it should cost me (.+)$")
	public void it_should_cost_me(double cost) throws Throwable {
	    double totalCost = CostCalculator.getInstance().getTotalCost(basket);
	    System.out.println("Total Cost:" + totalCost);
    	assertTrue("The cost should be equal", cost == totalCost);
	}
}
