package com.rbc.pos.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rbc.pos.util.CurrencyUtil;

/**
 * The class to test <code>CurrencyUtil</code>.
 * 
 * @author Nitin Shreyakar
 */
public class CurrencyUtilTest {

	/**
	 * test Conversion of Pounds to Pence.
	 */
	@Test
	public void testCostInPence() {

		assertTrue("Failed to convert £3.50 to 350 pence", 350 == CurrencyUtil.costInPence(3.50));
		assertTrue("Failed to convert £4 to 400 pence", 400 == CurrencyUtil.costInPence(4));
		assertTrue("Failed to convert £0 to 0 pence", 0 == CurrencyUtil.costInPence(0));
		assertTrue("Failed to convert £-5 to -500 pence", -500 == CurrencyUtil.costInPence(-5));
		assertTrue("Failed to convert £-7.99 to -799 pence", -799 == CurrencyUtil.costInPence(-7.99));

		assertTrue("Failed to convert £9999999.99 to 999999999 pence", 999999999 == CurrencyUtil.costInPence(9999999.99));
		assertTrue("Failed to convert £-9999999.99 to -999999999 pence", -999999999 == CurrencyUtil.costInPence(-9999999.99));
		assertTrue("Failed to convert £1234567.89 to 123456789 pence", 123456789 == CurrencyUtil.costInPence(1234567.89));
		assertTrue("Failed to convert £-1234567.89 to -123456789 pence", -123456789 == CurrencyUtil.costInPence(-1234567.89));
	}
	
	/**
	 * test Conversion of Pence to Pounds.
	 */
	@Test
	public void testCostInPounds() {

		assertTrue("Failed to convert 350 pence to £3.50", 3.50 == CurrencyUtil.costInPounds(350));
		assertTrue("Failed to convert 400 pence to £4.00", 4.00 == CurrencyUtil.costInPounds(400));
		assertTrue("Failed to convert 0 pence to £0", 0 == CurrencyUtil.costInPounds(0));
		assertTrue("Failed to convert -500 pence to £-5.00", -5.00 == CurrencyUtil.costInPounds(-500));
		assertTrue("Failed to convert -799 pence to £-7.99", -7.99 == CurrencyUtil.costInPounds(-799));

		assertTrue("Failed to convert 999999999 pence to 9999999.99", 9999999.99 == CurrencyUtil.costInPounds(999999999));
		assertTrue("Failed to convert -999999999 pence to -9999999.99", -9999999.99 == CurrencyUtil.costInPounds(-999999999));
		assertTrue("Failed to convert 123456789 pence to 1234567.89", 1234567.89 == CurrencyUtil.costInPounds(123456789));
		assertTrue("Failed to convert -123456789 pence to -1234567.89", -1234567.89 == CurrencyUtil.costInPounds(-123456789));
	}
}
