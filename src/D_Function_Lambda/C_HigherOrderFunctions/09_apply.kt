package D_Function_Lambda.C_HigherOrderFunctions

/*
apply函数是这样的，调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
 */
fun main(args: Array<String>) {
    testApply()
}
fun testApply() {
    // fun <T> T.apply(f: T.() -> Unit): T { f(); return this }
    ArrayList<String>().apply {
        add("testApply")
        add("testApply")
        add("testApply")
        println("this = " + this)
    }.let { println(it) }
}

// 运行结果
// this = [testApply, testApply, testApply]
// [testApply, testApply, testApply]