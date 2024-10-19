package C_FaceToObject.D_Extended

class MyClass {
    companion object {}  // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴随对象的扩展函数")
}

val MyClass.Companion.number: Int
    get() = 10

fun main(args: Array<String>) {
    println("number:${MyClass.number}")
    MyClass.foo()
}