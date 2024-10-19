package A_basic

fun main(args: Array<String>) {
    println("--------循环输出--------")
    for (i in 1..4) {
        println(i)
    }

    println("--------循环输出,带Step 2--------")
    for (i in 1..5 step 2) {
        println(i)
    }

    println("--------循环输出,倒序--------")
    for (i in 4 downTo 1) {
        println(i)
    }

    println("--------unit关键字,排除结束元素--------")
    for (i in 1 until 4) {
        println(i)
    }
    println("--------4..1,这种写法不对--------")
    for (i in 4..1) {
        println(i)
    }
}
