package com.autohome.kotlin

/**
 * lambda简写的两个原则
 */
fun main(args: Array<String>) {
    var list = listOf("Java", "Kotlin", "Go")
    // 正常调用
    var rt = list.dropWhile({it -> it.length > 3})
    // 简化：最后一个参数是Lambda表达式，可将表达式写在括号外面
    rt = list.dropWhile(){it.length > 3}
    // 再一次简化：dropWhile函数只有一个类型为lambda表达式的形式参数
    rt = list.dropWhile {it.length > 3}
    println(rt) // 输出[Go]
}