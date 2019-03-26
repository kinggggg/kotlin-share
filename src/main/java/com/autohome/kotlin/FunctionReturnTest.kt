package com.autohome.kotlin

/**
 * 函数返回值类型是函数
 */
// 定义函数，该函数的返回值类型为(Int) -> Int
fun getMathFunc(type: String): (Int) -> Int {
    // 定义一个计算平方的局部函数
    fun square(n: Int) : Int {  // ①
        return n * n
    }
    // 定义一个计算立方的局部函数
    fun cube(n: Int) : Int {  // ②
        return n * n * n
    }
    if(type == "square") {
        return ::square
    }else {
        return ::cube
    }
}
fun main(args: Array<String>) {
    // 调用getMathFunc()，程序返回一个(Int)->Int类型的函数
    var mathFunc = getMathFunc("cube") // 得到cube函数
    println(mathFunc(5)) // 输出125
    mathFunc = getMathFunc("square") // 得到square函数
    println(mathFunc(5)) // 输出25
}