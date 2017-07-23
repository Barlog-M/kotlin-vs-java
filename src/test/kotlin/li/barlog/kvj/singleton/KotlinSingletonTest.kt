package li.barlog.kvj.singleton

import org.junit.Test
import org.junit.Assert.assertTrue

class KotlinSingletonTest {
	@Test
	fun test() {
		val foo = Foo
		val bar = Foo
		assertTrue(foo === bar)
	}
}
