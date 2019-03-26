package com.autohome.kotlin.javakotlin

/**
 * StudentKotlin
 */
class StudentKotlin{
    var name : String = "张三"
    val age : Int = 18
}

fun main(args: Array<String>) {
    //在kotlin中调用java
    //1. 创建Java对象
    var studentJava = StudentJava("张三", 18)
    //2. 调用对象属性
    println(studentJava.name)
    println(studentJava.age)
    //3. 调用对象方法
    studentJava.hello()
    //4. 使用Java中的集合
    val source = listOf<Int>(1, 2, 3, 4, 5)
    // 使用Java的ArrayList
    val list = ArrayList<Int>()
    for (item in source) {
        list.add(item) // ArrayList.add()
    }
    //5. 如果Java中的方法是void返回类型，在Kotlin中就为Unit类型
    var value = studentJava.hello()
    //6. 将 Kotlin 中是关键字的 Java 标识符进行转义，需要加``，类似的还要in等
    val s = studentJava.`object`
    println(s)
}