package D_Function_Lambda.C_HigherOrderFunctions

fun main(args: Array<String>) {
    testRun()
}
fun testRun() {
    // fun <T, R> T.run(f: T.() -> R): R = f()
    "testRun".run {
        println("this = " + this)
    }.let { println(it) }
}
// 运行结果
// this = testRun
// kotlin.Unit