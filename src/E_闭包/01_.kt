package E_闭包

fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

fun main(args: Array<String>) {
    val add6 = add(6)
    println(add6(10)) // 输出 16
}