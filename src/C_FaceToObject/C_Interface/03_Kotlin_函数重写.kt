package C_FaceToObject.C_Interface

interface A100 {
    fun foo() {
        print("A100")
    }   // 已实现

    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface B100 {
    fun foo() {
        print("B100")
    }   // 已实现

    fun bar() {
        print("bar")
    } // 已实现
}


class C100 : A100 {
    override fun bar() {
        print("bar")
    }   // 重写
}

/**
 * 这里需要实现两个方法
 */
class D100 : A100, B100 {
    override fun foo() {
        println("D100-Foo()")
    }

    override fun bar() {
        println("D100-Bar()")
    }
}


fun main(args: Array<String>) {
    val d = D100()
    d.foo();
    d.bar();
}
