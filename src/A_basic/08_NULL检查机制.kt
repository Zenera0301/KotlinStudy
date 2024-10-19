package A_basic

fun main(args: Array<String>) {
    //默认变量不能赋值为null
    var age: String? = null;

    //可为null的变量直接使用,可能报错
//        val age1 = age.toInt()
    // 在进行过 null 值检查之后, age的类型会被自动转换为非null变量
//    if (age != null) {
//        val age1 = age.toInt()
//    }

    //变量后面加!!,如果变量为null,抛出异常,后面的代码不执行
//    val age1 = age!!.toInt()
//    println(age1)
//    println("aa")//这个代码不执行

    //变量后面加?,返回 null,后面的代码继续执行
//    val age1 = age?.toInt()
//    println(age1)
//    println("aa")

    //变量后面加?,如果为null,追加?:,可以重新赋值变量,后面的代码继续执行
    val age1 = age?.toInt()?:-1
    println(age1)
    println("aa")


    //方法返回值也可以标记为可为null
//    fun myFun1(): Int? {
//        return null;
//    }
}