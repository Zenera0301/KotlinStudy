package C_FaceToObject.D_Extended

class C101 {
    fun foo() {
        println("成员函数")
    }
}

fun C101.foo() {
    println("扩展函数")
}

fun main(arg: Array<String>) {
    var c = C101()
    c.foo()
}