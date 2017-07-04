package li.barlog.kvj.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class JavaBigDecimal {
	BigDecimal compoundInterest(
		BigDecimal base,
		BigDecimal interest,
		int years
	) {
		return interest.divide(new BigDecimal("100.00"))
			.add(BigDecimal.ONE)
			.pow(years)
			.multiply(base)
			.setScale(2, BigDecimal.ROUND_HALF_UP);
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
