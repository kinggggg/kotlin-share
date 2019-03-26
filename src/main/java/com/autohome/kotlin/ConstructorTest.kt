

/**
 * Kotlin主构造器与初始化块
 */
// 提供主构造器，该构造器包含一个参数
class ConstructorTest(name: String){
    var name: String
    // 定义初始化块，相当于主构造器的执行体
    init {
        // 初始化块里的this代表它进行初始化的对象
        // 下面两行代码将传入的1个参数赋给this代表对象的name属性
        this.name = name
    }

}
fun main(args: Array<String>) {
    // 使用自定义的构造器来创建对象
    // 系统将会对该对象执行自定义的初始化
    var tc = ConstructorTest("Kotlin实战")
    // 输出ConstructorTest对象的name属性
    println(tc.name)
}