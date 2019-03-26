package com.autohome.kotlin

/**
 * null 安全
 */
fun main(args: Array<String>) {

    var str : String? = "kotlin"
    //有可能导致NPE，编译无法通过
//    println(str.length);

    //加上?进行安全调用，可以防止出现NPE
    println(str?.length) //输出6
    str = null;
    println(str?.length) //null

    //强制调用
    println(str!!.length) //可能引发NPE


}