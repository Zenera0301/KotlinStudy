package B_StreamContrl

fun main(args: Array<String>) {
    //基本条件比较
    var a = 1
    var b = 2
    var max = 0

    /* if (a > b) {
         max = a
     } else {
         max = b
     }*/

    //可以简写为表达式
//    if (a > b) max = a else max = b

    //可以赋值
    max = if (a > b) a else b

    println("max:${max}")
}