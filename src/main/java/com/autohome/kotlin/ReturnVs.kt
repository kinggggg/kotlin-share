package com.autohome.kotlin

/**
 * 匿名函数中的return VS lambda中的return
 */
fun main(args: Array<String>) {
    var list = listOf(1, 2, 3)
    // 使用匿名函数执行forEach()方法，相当于执行多次函数调用，输出1，2，3
    list.forEach(fun(n) {
        println("元素依次为：${n}")
        // 匿名函数中的return用于返回该函数本身
        return
    })
	// 使用Lambda表达式执行forEach()方法，只输出1
	list.forEach({n ->
		println("元素依次为：${n}")
		// Lambda表达式中的return用于返回它所在的函数（main函数）
		return
	})
}