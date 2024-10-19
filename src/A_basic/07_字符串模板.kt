package A_basic

fun main(args: Array<String>) {
    var a = 1;
    //${变量}
    var s1 = "a is ${a}"
    println(s1)


    //可以去掉{}括号
    var s2 = "a is $a"
    println(s2)

    //调用方法,执行代码块
    var s3 = "调用方法->${hellword()},执行代码块->${s2.replace("is", "was")}"
    var s4 = "测试调方法：${hellword()}, 随便执行一个代码块：${s2.isBlank()}"
    println(s3)
    println(s4)
}

fun hellword(): String {
    return "hello world"
}