package com.autohome.kotlin

/**
 * 变量
 */
fun main(args: Array<String>) {
    var name : String = "tom"
    name = "jerry"

    val age : Int = 18
    //编译无法通过
//    age = 20

    //不带?相当于java中的基本类型，带?相当于java中的包装类型Integer
    var salary1 : Int = 200;
    var salary2 : Int = 200;
    println(salary1 === salary2) //true
    var salary3 : Int? = 200; //TODO 换成100，提问
    var salary4 : Int? = 200;
    println(salary3 === salary4) //false
}