package li.barlog.kvj.bigdecimal

import org.junit.Assert.assertEquals
import org.junit.Test
import java.math.BigDecimal
import java.math.BigDecimal.ONE
import java.math.BigDecimal.ROUND_HALF_EVEN

class KotlinBigDecimal {
	companion object {
		 private val ONE_HUNDRED = BigDecimal("100.00")
	}

	fun compoundInterest(base: BigDecimal,
						 interest: BigDecimal,
						 years: Int): BigDecimal =
		(base * (ONE + interest / ONE_HUNDRED).pow(years))
			.setScale(2, ROUND_HALF_EVEN)

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
