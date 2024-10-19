package A_basic

fun main(args: Array<String>) {
    var a: Int
    var b: String

    //不能重复定义
//    var b:String ="hello";

    //声明的时候赋值
    var c: Int = 1;

    //声明和赋值分开
    var d: Int;
    d = 10;

    //类型自动推断
    var e = 2;

    //var关键字变量可以修改
    e += 1;


    var f = 45;
    var g = '2'
    var h = g+1
    println(h)
}