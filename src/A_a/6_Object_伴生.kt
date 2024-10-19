package A_a

object Singleton {   //声明的一个单例类
    private var name = "张三"
    override fun toString() = "我叫$name"
    fun test() = println("IDEA，启动！")
}

class Student3(val name: String, val age: Int) {
    //使用companion关键字在内部编写一个伴生对象，它同样是单例的
    companion object Tools {
        //伴生对象定义的函数可以直接通过外部类名调用
        fun create(name: String, age: Int) = Student(name, age)
    }
}

fun main() {
    // 单例
    val singleton = Singleton  //通过类名直接得到此单例类的对象 不可以通过构造函数的形式创建对象
    println(singleton)
    Singleton.test()   //单例定义的函数直接使用类名即可调用

    //现在Student不仅具有对象的函数，还可以通过类名直接调用其伴生对象通过的函数
    val student = Student3.create("小明", 18)
    println(student.toString())
}