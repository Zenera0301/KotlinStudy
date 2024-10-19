package C_FaceToObject.C_Interface

interface MyInterface201 {
    var name: String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}

class Child201 : MyInterface201 {
    override var name: String = "runoob" //重载属性
    override fun bar() {
        // 方法体
        println("bar")
    }
}

fun main(args: Array<String>) {
    val c = Child201()
    c.foo();
    c.bar();
    println(c.name)

}