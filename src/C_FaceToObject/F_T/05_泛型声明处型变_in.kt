package C_FaceToObject.F_T

// 定义一个支持逆变的类
class Runoob1<in A>(a: A) {
    fun foo(a: A) {
    }
}

fun main(args: Array<String>) {
    var strDCo = Runoob1("a")
    var anyDCo = Runoob1<Any>("b")
    strDCo = anyDCo
}