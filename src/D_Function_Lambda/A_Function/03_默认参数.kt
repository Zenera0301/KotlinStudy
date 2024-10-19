package D_Function_Lambda.A_Function

fun printfInfo(name: String = "billy", age: Int = 19): Unit {
    println("我是$name,我今年$age 岁")
}

fun main(args: Array<String>) {
    //默认参数可以不用传递
    printfInfo()
}