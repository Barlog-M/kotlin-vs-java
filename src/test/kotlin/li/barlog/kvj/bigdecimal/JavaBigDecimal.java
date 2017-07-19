package li.barlog.kvj.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ROUND_HALF_EVEN;

public class JavaBigDecimal {
	private static BigDecimal ONE_HUNDRED = new BigDecimal("100.00");

	BigDecimal compoundInterest(
		BigDecimal base,
		BigDecimal interest,
		int years
	) {
		return interest.divide(ONE_HUNDRED)
			.add(ONE)
			.pow(years)
			.multiply(base)
			.setScale(2, ROUND_HALF_EVEN);
	}

	@Test
	public void compoundInterestTest() {
		assertEquals(
			new BigDecimal("2011.36"),
			compoundInterest(
				new BigDecimal("1000.00"),
				new BigDecimal("15.00"),
				5
			));
	}
}
