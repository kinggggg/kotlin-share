package com.autohome.kotlin

/**
 * lambda表达式代替局部函数
 */
// 定义函数，该函数的返回值类型为(Int) -> Int
fun getFunc(type: String) : (Int) -> Int {
    // 该函数返回的是Lambda表达式
    when(type) {
        "square" -> return {n: Int ->
            n * n
        }
        "cube" -> return {n: Int ->
            n * n * n
        }
        else -> return {n: Int ->
            n + n
        }
    }
}
fun main(args: Array<String>) {
    // 调用getMathFunc()，程序返回一个(Int)->Int类型的函数
    var mathFunc = getFunc("cube") // 得到cube函数
    println(mathFunc(5)) // 输出125
    mathFunc = getFunc("square") // 得到square函数
    println(mathFunc(5)) // 输出25
    mathFunc = getFunc("other")
    println(mathFunc(5)) // 输出10
}