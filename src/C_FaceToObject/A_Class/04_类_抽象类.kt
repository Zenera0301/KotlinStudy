package C_FaceToObject.A_Class

fun main(args: Array<String>) {
    var person1 = Man()
    var person2 = Woman()
    person1.xiaobian()
    person2.xiaobian()
}

//人
abstract class Person4 {
    //有名字
    var name: String = ""

    //小便
    abstract fun xiaobian(): Unit
}

class Man : Person4() {
    override fun xiaobian() {
        println("我是男的,站着小便")
    }
}

class Woman : Person4() {
    override fun xiaobian() {
        println("我是女的,蹲着小便")
    }
}