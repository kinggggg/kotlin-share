

/**
 * �ڲ�����
 */
// ���庯�����ú����ķ���ֵ����ΪInt
fun getMathFunc(type: String , nn: Int) : Int {
	// ����һ������ƽ���ľֲ�����
	fun square(n: Int) : Int {
		return n * n
	}
	// ����һ�����������ľֲ�����
	fun cube(n: Int) : Int {
		return n * n * n
	}
	when(type) {
		// ���þֲ�����
		"square" -> return square(nn)
		"cube" -> return cube(nn)
		else -> return square(nn)
	}
}

fun main(args: Array<String>) {
	println(getMathFunc("square", 3)) // ���9
	println(getMathFunc("cube", 3)) // ���27
}