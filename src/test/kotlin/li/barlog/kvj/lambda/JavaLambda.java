package li.barlog.kvj.lambda;

public class JavaLambda {
	static Runnable l = () -> System.out.println("foo");

	static void foo(Runnable l) {
		l.run();
	}

	public static void main(String... args) {
		foo(l);
	}
}
