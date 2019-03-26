package com.autohome.kotlin

/**
 * 数据类型
 */
fun main(args: Array<String>) {

    //基本数据类型Int, Short, Long, Double, Float, Boolean, Char, Byte
    var intType : Int = 10
    var shortType : Short = 20
    var longType : Long = 30
    var doubleType : Double = 40.0
    var floutType : Float = 50.0F
    var booleanType : Boolean = true
    var charType : Char = 'd'
    var byteType : Byte = 60

    //通过?定义与基本数据类型对应的包装类型
    var intType2 : Int? = 10

    //String类型几乎与Java中的String相同，只不过增加了很多实用的方法
    var strType : String = "kotlin"
    //例如字符串模板
    var strType2 : String = "hi, ${strType}"
    println(strType2)



}