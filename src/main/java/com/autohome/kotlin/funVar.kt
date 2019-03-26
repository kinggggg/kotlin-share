package com.autohome.kotlin

/**
 * 函数类型变量
 */
fun main(args: Array<String>) {

    //定义函数
    fun fun1(i : Int, j : Int) : Int {
        return i + j
    }

    //定义函数类型变量，其类型为(Int, Int) -> Int
    var v1 : (Int, Int) -> Int

    //将函数赋值给函数类型的变量
    v1 = ::fun1
    //调用
    println(v1(1, 2))

}
