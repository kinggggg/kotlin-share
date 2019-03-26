

/**
 * 内部函数
 */
// 定义函数，该函数的返回值类型为Int
fun getMathFunc(type: String , nn: Int) : Int {
	// 定义一个计算平方的局部函数
	fun square(n: Int) : Int {
		return n * n
	}
	// 定义一个计算立方的局部函数
	fun cube(n: Int) : Int {
		return n * n * n
	}
	when(type) {
		// 调用局部函数
		"square" -> return square(nn)
		"cube" -> return cube(nn)
		else -> return square(nn)
	}
}

fun main(args: Array<String>) {
	println(getMathFunc("square", 3)) // 输出9
	println(getMathFunc("cube", 3)) // 输出27
}