package C_FaceToObject.C_Interface

interface MyInterface {
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}

class Child : MyInterface {
    override fun bar() {
        // 方法体
        println("bar")
    }

    override fun foo() {
        //super.foo()
        println("child foo")
    }
}

fun main(args: Array<String>) {
    val c = Child()
    c.foo();
    c.bar();
}