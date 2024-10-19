package C_FaceToObject.A_Class

fun main(args: Array<String>) {
    //创建外部类对象
    var outer = Outer();
    var inner = Outer.Inner();

    //调用方法
    outer.myFun()
    inner.myFun()

}

class Outer {
    var outerVal = 10

    fun myFun() {
        println("outer")
    }

    class Inner {
        fun myFun(): Unit {
            println("Inner")
        }
    }
}