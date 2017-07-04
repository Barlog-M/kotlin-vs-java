package li.barlog.kvj.lambda

val l = { println("foo") }

fun foo(fn: () -> Unit) {
	fn()
}

fun main(vararg args: String) {
	foo(l)
}
