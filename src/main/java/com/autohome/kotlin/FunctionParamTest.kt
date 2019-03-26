

/**
 * 函数的参数是函数类型
 */
// 定义函数类型的形参，其中fn是(Int) -> Int类型的形参
fun map(data : Array<Int>,  fn: (Int) -> Int) : Unit {
    // 遍历data数组中每个元素，并用fn函数对data[i]进行计算
    // 然后将计算结果作为新数组的元素
    for (i in data.indices) {
        println(fn(i))
    }
}
// 定义一个计算平方的函数
fun square(n: Int) : Int {
    return n * n
}
// 定义一个计算立方的函数
fun cube(n: Int) : Int {
    return n * n * n
}
fun main(args: Array<String>) {
    var data = arrayOf(3 , 4 , 9 , 5, 8)
    // 下面程序代码2次调用map()函数，每次调用时传入不同的函数
    println("计算数组元素的平方")
    map(data , ::square)
    println("计算数组元素的立方")
    map(data , ::cube)
}