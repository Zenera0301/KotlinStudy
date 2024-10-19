package C_FaceToObject.A_Class

fun main(args: Array<String>) {
    //创建对象
    var person = Person()

    //调用属性
    println(person.name)

    //调用方法
    person.printInfo()
}

class Person {
    //定义成员属性
    var name = "billy"
    var age = 18
    //定义成员方法
    fun printInfo(): Unit {
        println("我是$name,我今年$age")
    }
}