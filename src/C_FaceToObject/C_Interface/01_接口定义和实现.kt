package C_FaceToObject.C_Interface

interface MyInterface01 {
    //必须被覆写
    fun myFun1();
    fun myFun2() {
        println("myFun2")
    }
}
class MyClass01 :MyInterface01{
    override fun myFun1() {
        println("myFun1")
    }
}

fun main(args: Array<String>) {
    var myClass01 = MyClass01()
    myClass01.myFun1()
    myClass01.myFun2()
}