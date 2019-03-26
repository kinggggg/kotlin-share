package com.autohome.kotlin

/**
 * kotlin中的属性
 */
class Address {

    val street: String = ""
    var city = ""

    constructor(city: String) {
        this.city = city
    }
}

fun main(args: Array<String>) {
    var address  = Address("beijing")
    //val属性只能取值不能赋值
    print(address.street)
    //var属性既能取值也能赋值
    println(address.city)
    address.city = "shanghai"
    println(address.city)
}

