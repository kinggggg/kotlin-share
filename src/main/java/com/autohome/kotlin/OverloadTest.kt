

/**
 * 函数重载
 */
// 下面定义了3个test()函数，但函数的形参列表不同
// 系统可以区分它们，这被称为函数重载
fun test() {
	println("无参数的test()函数")
}
// 该函数类型为(String): Unit
fun test(msg:String) {
	println("重载的test()函数${msg}")
}
// 该函数类型为(Int): String
fun test(msg: Int): String {
	println("重载的test()函数${msg},带返回值")
	return "test"
}