package com.autohome.kotlin

/**
 * Set
 */
fun main(args: Array<String>) {
    // 创建不可变集合,返回值是Set。默认情况下返回的是LinkedHashSet
    var set = setOf("Java", "Kotlin", "Go")
    println(set) // 集合元素按添加顺序排列
    // 创建可变集合,返回值是MutableSet
    var mutableSet = mutableSetOf("Java", "Kotlin", "Go")
    println(mutableSet) // 集合元素按添加顺序排列
    println("setOf的返回对象的实际类型:${set.javaClass}")
    println("mutableSetOf的返回对象的实际类型:${mutableSet.javaClass}")
    // 创建HashSet集合
    var hashSet = hashSetOf("Java", "Kotlin", "Go")
    println(hashSet) // 不保证元素的顺序
    // 创建LinkedHashSet集合
    var linkedHashSet = linkedSetOf("Java", "Kotlin", "Go")
    println(linkedHashSet) // 集合元素按添加顺序排列
    // 创建TreeSet集合。查看其源码底层直接使用的是Java对Tree的实现
    var treeSet = sortedSetOf("Java", "Kotlin", "Go")
    println(treeSet) // 集合元素由小到大排列

    var setAll = setOf("Java", "JavaScript", "Json")
    val all = setAll.all { e -> e.contains("J") }
    println(all)

    var setAny = setOf("Java", "Kotlin", "Go")
    var any = setAll.any { e -> e.contains("J") }
    println(any)

}