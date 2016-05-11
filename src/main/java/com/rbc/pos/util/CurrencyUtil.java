/**
 * 
 */
package com.rbc.pos.util;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Currency utility class to convert amount from pound to pence for all calculations
 * and later back from pence to pound when returning result back to the user.
 * 
 * This strategy is used for high performance calculation using primitive data type int/long
 * whenever possible. 
 * Primitive data type double uses native floating-point types which might cause inaccurate calculation
 * and BigDecimal is not very performance efficient.
 * 
 * @author Nitin Shreyakar
 *
 */
public final class CurrencyUtil {

	/**
	 * Hundred double value.
	 */
	private static final double HUNDRED = 100.0;

	/**
	 * Hundred BigDecimal value.
	 */
	private static final BigDecimal HUNDRED_BD = new BigDecimal(100);

	/**
	 * Convert cost amount from Pound to Pence.
	 * @param costInPounds the amount in pounds
	 * @return the amount in pence
	 */
	public static int costInPence(double costInPounds) {
		return costInPence(new BigDecimal(Double.toString(costInPounds)));
	}

	/**
	 * Convert cost amount from Pound to Pence.
	 * @param costInPounds the amount in pounds
	 * @return the amount in pence
	 */
	public static int costInPence(BigDecimal costInPounds) {
		if (costInPounds != null) {
			assert costInPounds.scale() <= 2 : "Scale must be less than or equal to 2";
			return costInPounds.multiply(HUNDRED_BD, MathContext.UNLIMITED).intValueExact();
		} else {
			return 0;
		}
	}

	/**
	 * Convert cost amount from Pence to Pounds.
	 * @param costInPence the amount in pence
	 * @return the amount in pounds
	 */
	public static double costInPounds(int costInPence) {
		return costInPence / HUNDRED;
	}

	/**
	 * Private constructor to avoid external instantiation.
	 */
	private CurrencyUtil() {
	}
}
