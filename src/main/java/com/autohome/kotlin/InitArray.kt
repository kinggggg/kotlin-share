/**
 * 数组
 */
fun main(args: Array<String>) {
	// 创建包含指定元素的数组（相当于Java数组的静态初始化）
	var arr1 = arrayOf("Java", "Kotlin", "Swift", "Go")
	//默认情况下数组中的元素类型为Integer包装类
	var intArr1 = arrayOf(2, 4, 500, -34)
	//kotlin提供了用于基本类型的intArrayOf方法，相当于Java中的int[], long[]
	var intArr11 = intArrayOf(1, 3, 4)
	// 创建指定长度、元素为null的数组（相当于Java数组的动态初始化）
	var arr2 = arrayOfNulls<Double>(5)
	var intArr2 = arrayOfNulls<Int>(6)
	// 创建长度为0的空数组
	var arr3 = emptyArray<String>()
	var intArr3 = emptyArray<Int>()
	// 创建指定长度、使用Lambda表达式初始化数组元素的数组，it是循环变量从0开始
	var arr4 = Array(5, {(it * 2 + 97).toChar()})
	var strArr4 = Array(6, {"fkit"})
}