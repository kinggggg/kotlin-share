package com.autohome.kotlin

/**
 * 利用componentN方法解构
 */
class User(name: String, pass: String, age: Int){
    var name = name
    var pass = pass
    var age = age
    // 定义operator修饰的componentN方法，用于解构
    operator fun component1(): String{
        return this.name
    }
    // 定义operator修饰的componentN方法，用于解构
    operator fun component2(): String{
        return this.pass
    }
    // 定义operator修饰的componentN方法，用于解构
    operator fun component3(): Int{
        return this.age
    }
}
fun main(args: Array<String>) {
    // 创建User对象
    val user = User("yeeku", "668899", 29)
    // 将User对象解构给2个变量
    // 只利用user对象的component1()和component2()方法
    var (name, pass: String) = user
    println(name)
    println(pass)
    // 将User对象解构给3个变量
    // 只利用user对象的component1()、component2()和component3()方法
    var (name2, pass2, age) = user
    println(name2)
    println(pass2)
    println(age)

    // 如果不想要前面的某个属性，用_代替它
    var (_, pass3, age2) = user
    println(pass3)
    println(age2)
}