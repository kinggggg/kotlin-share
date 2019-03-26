

/**
 * 形参默认值
 */
// 为两个参数指定默认值
fun sayHi(name: String = "张三",
	message: String = "工作"){
	println("${name} , 您好")
	println("消息是：${message}")
}
fun main(args: Array<String>) {
	// 全部使用默认参数
	sayHi()
	// 只有message参数使用默认值
	sayHi("李四")
	// 两个参数都不使用默认值
	sayHi("李四", "回家")
	// 只有name参数使用默认值
	sayHi(message = "欢迎学习Kotlin")

}
