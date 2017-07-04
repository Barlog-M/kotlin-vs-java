package li.barlog.kvj.bigdecimal

import org.junit.Assert.assertEquals
import org.junit.Test
import java.math.BigDecimal

class KotlinBigDecimal {
	fun compoundInterest(base: BigDecimal,
						 interest: BigDecimal,
						 years: Int): BigDecimal =
		(base * (BigDecimal("1.00") + interest / BigDecimal("100.00")).pow(years))
			.setScale(2, BigDecimal.ROUND_HALF_UP)

	@Test
	fun compoundInterestTest() {
		assertEquals(
			BigDecimal("2011.36"),
			compoundInterest(
				BigDecimal("1000.00"),
				BigDecimal("15.00"),
				5
			))
	}
}