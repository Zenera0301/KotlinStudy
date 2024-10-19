package C_FaceToObject.B_Extend

open class Person2(var name: String, var age: Int) {// 基类

}

//子类有主构函数,需要在主构函数中处理父类的主构函数
class Student01(name: String, age: Int, var score: Int) : C_FaceToObject.B_Extend.Person2(name, age) {
    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试考了${score}分")
    }
}

// 测试
fun main(args: Array<String>) {
    val s = C_FaceToObject.B_Extend.Student01("小名", 18, 89)
    s.printInfo()
}