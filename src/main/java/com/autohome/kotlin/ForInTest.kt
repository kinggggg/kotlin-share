package com.autohome.kotlin

/**
 * 数组遍历
 */
fun main(args: Array<String>) {

    var books = arrayOf("Thinking in Java" ,
            "Java从入门到放弃",
            "Java8实战")

    // 使用for-in循环来遍历数组元素
    // 其中book将会自动迭代每个数组元素
    for (book in books) {
        println(book)
    }

    //使用数组索引遍历数组：数组提供的indices属性
    for (i in books.indices) {
        println(books[i])
    }

    //通过withIndex()方法像Java中的通过Map.Entry遍历Map一样
    for ((index, value) in books.withIndex()){
        println("${index} : ${value}")
    }
}