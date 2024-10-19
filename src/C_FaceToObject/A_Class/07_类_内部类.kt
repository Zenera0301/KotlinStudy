package C_FaceToObject.A_Class

fun main(args: Array<String>) {
    //创建外部类对象
    var outer = Outer1();
    var inner = outer.Inner1();

    //调用方法
    outer.myFun()
    inner.myFun()

}

class Outer1 {
    private var outerVal = 10
    fun myFun() {
        println("outer")
    }

    inner class Inner1 {
        fun myFun(): Unit {
            println("Inner1 " + outerVal)
        }
    }
}