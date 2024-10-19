package D_Function_Lambda.C_HigherOrderFunctions

/*
with函数是一个单独的函数，并不是Kotlin中的extension，
所以调用方式有点不一样，返回是最后一行，
然后可以直接调用对象的方法，感觉像是let和apply的结合。
 */
fun main(args: Array<String>) {
    testWith()
}

fun testWith() {

    /*
     // public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
     //public inline fun <T, R> T.let(block: (T) -> R): R = block(this)


     ()-->R   表示系统环境中的,返回值为类型为R的函数
     T.() -> R  其中 T.() 表示,T里面的成员函数以及拓展函数


    //对参数一,进行大括号里面的操作
    //T.()决定with整体的返回值
    //比如这里的方返回值就是
    {
        add("testWith")
        add("testWith")
        add("testWith")
//       println("this = " + this)
        "aa"
    }它的返回值
    继续,
    Lambda表达式的返回值就是代码的最后一行

    let代表用什么对象干什么事情
    谁调用了let函数,it就代表谁
    比如这里
    it就是
     with(ArrayList<String>(), {
        add("testWith")
        add("testWith")
        add("testWith")
//        println("this = " + this)
        "aa"
    })
    也就是"aa"
     */
    with(ArrayList<String>(), {
        add("testWith")
        add("testWith")
        add("testWith")
//        println("this = " + this)
        "aa"
    }).let { println(it) }





















    //如果这个函数的最后一个参数是一个函数，我们可以把这个函数移动到圆括号外面
   /* with(ArrayList<String>()) {
        add("testWith")
        add("testWith")
        add("testWith")
        println("this = " + this)
    }.let { println(it) }*/
}
// 运行结果
// this = [testWith, testWith, testWith]
// kotlin.Unit