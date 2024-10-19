package C_FaceToObject.A_Class

fun main(args: Array<String>) {
    //创建对象
    var person = Person()

    //调用属性
    println(person.name)

    //调用方法
    person.printInfo()


    //创建对象
    var person1 = Person1()
    person1.name = "王凤"
    person1.age = 24
    person1.printInfo()

}

//定义类
class Person1 {
    //定义成员属性
    var name = "billy"
        get() = field
        set
    var age = 18
            //自定义setter方法
        set(value) {
            if (value > 18) {
                println("设置年龄->设置大于18岁")
            } else {
                println("设置年龄->设置小于18岁")
            }
            field = value
        }
        get() = field

    //定义成员方法
    fun printInfo(): Unit {
        println("我是$name,我今年$age")
    }
}