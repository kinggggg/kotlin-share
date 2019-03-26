

/**
 * 数组方法
 */
fun main(args: Array<String>) {
    // 定义一个数组
    var arr = arrayOf(2, 4, 5, 6)
    // 判断是否所有元素的平方都大于20
    println(arr.all({it * it > 20})) // 输出false
    // 判断是否任一元素的平方大于20
    println(arr.any({it * it > 20})) // 输出true

    // 创建一个可变Map集合，用于追加根据数组计算出来Key-Value对
    var map = mutableMapOf(1 to 100, 2 to 120, -1 to 130)
    // 将计算出来Key（元素的平方)、Value（元素）对添加到map集合中 4:2 16:4 25:5 36:6
    arr.associateByTo(map, {it * it})
    println(map)

    // 计算数组所有元素的总和
    println(arr.fold(0 , {acc, e -> acc + e})) // 输出17

    // 定义一个a数组
    var a = arrayOf(3, 4 , 5, 6)
    // 定义一个a2数组
    var a2 = arrayOf(3, 4 , 5, 6)
    // a数组和a2数组的长度相等，每个元素依次相等，将输出true
    println("a数组和a2数组是否相等：${a.contentEquals(a2)}")


    var c = arrayOf("Java", "Go", "Kotlin")
    var d = arrayOf("Lua", "Kotlin", "Python")
    println((c + d).contentToString()) // 计算两个集合的并集
    println("Java" in c) // 输出true
}