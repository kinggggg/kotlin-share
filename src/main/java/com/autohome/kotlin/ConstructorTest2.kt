package com.autohome.kotlin

/**
 * Kotlin中的次构造器
 */
class ConstructorTest2 {
    var name: String?
    var age: Int
    init{
        println("初始化块！")
    }
    // 提供无参数的构造器
    constructor(){
        name = null
        age = 0
    }
    constructor(name:String, count:Int){
        this.name = name
        this.age = count
    }
}
fun main(args: Array<String>) {
    // 通过无参数构造器创建ConstructorTest2对象
    var oc1 = ConstructorTest2()
    // 通过有参数构造器创建ConstructorTest2对象
    var oc2 = ConstructorTest2(
            "张三", 18);
    println("${oc1.name} ${oc1.age}")
    println("${oc2.name} ${oc2.age}")
}