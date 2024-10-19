package D_Function_Lambda.C_HigherOrderFunctions

fun main(args: Array<String>) {
    println((0..5).reduce { total, item -> total + item })
    // 输出 15
    //0
    //1
    //2
    //3
    //4
}