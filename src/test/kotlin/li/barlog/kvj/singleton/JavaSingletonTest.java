package li.barlog.kvj.singleton;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JavaSingletonTest {
	@Test
	public void test() {
		JavaSingleton foo = JavaSingleton.getInstance();
		JavaSingleton bar = JavaSingleton.getInstance();
		assertTrue(foo == bar);
	}
}
