package C_FaceToObject.D_Extended

class C1 {
    fun printInfo() {
        println("成员函数 C1")
    }
}

fun C1.printInfo(): Unit {
    println("拓展函数 C1")
}

fun main(args: Array<String>) {
    var c = C1();
    c.printInfo()
}