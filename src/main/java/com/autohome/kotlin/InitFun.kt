package com.autohome.kotlin

/**
 * 函数
 */

// 定义一个函数，声明2个形参，返回值为Int类型
fun max(x:Int , y:Int): Int {
    // 定义一个常量z，该常量等于x、y中较大的值
    val z = if (x > y) x else y
    // 返回常量z的值
    return z
}

// 定义一个没有返回值的函数
fun unitFuc1(x:Int , y:Int) {
    println("Hello")
}

//定义一个没有返回值的函数，第二种形式. Kotlin中的Unit相当于Java中的void
fun unitFuc2(x:Int , y:Int) : Unit{
    println("Hello")
}

// 定义单表达式函数
fun area(x: Double, y: Double): Double = x * y

fun main(args: Array<String>) {

}