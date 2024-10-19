package C_FaceToObject.B_Extend

open class Person03(var name: String) {
    //允许重载的方法,需要指定open
    open fun chuanyifu(): Unit {
        println("是人都要穿衣服")
    }
}

class Student03 : Person03 {
    var age = 0
    var score = 0

    constructor(name: String, age: Int, score: Int) : super(name) {
        this.age = age
        this.score = score
    }

    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试得了${score}分")
    }

    override fun chuanyifu() {
        super.chuanyifu()
        println("我是学生,我穿校服")
    }
}

fun main(args: Array<String>) {
    var xiaoming = Student03("小名", 20, 99)
    xiaoming.printInfo()
    xiaoming.chuanyifu()
}