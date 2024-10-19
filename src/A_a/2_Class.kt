package A_a

class Student(var name: String, var age: Int) {
    // 解构声明
    operator fun component1() = name
    operator fun component2() = age

    // 中缀
    infix fun add(s: Student):String {
        return "${this.name} 和 ${s.name} 年龄加起来 ${this.age+s.age}岁"
    }
}

// 用到解构
val func1: (Student) -> Unit = { (a, b) ->  //使用括号包括结构出来的两个参数
    println("名字: $a, 年龄: $b")
}
// 用到解构
val func2: (Student, Int) -> Unit = { (a, b), i ->
    println("名字: $a, 年龄: $b")
    println(i)
}

fun main(args: Array<String>) {
    val student = Student("小明", 20)
    // 用到解构
    val (a, b) = student
    println("名字: $a, 年龄: $b")
    func1(student)
    func2(student,23)

    // 用到中缀
    val student2 = Student("小红",18)
    println(student add student2)

    // 初始化子类对象前先初始化父对象
    YellowCat()

    // 扩展函数
    B4(A4()).world()

    // func是对String类型的扩展函数，类型是：String.() -> Int
    val func: String.() -> Int = {
        this.length   //扩展函数中的this指的是被扩展的类对象
    }
    println("sahda".func())  //可以直接对符合类型的对象使用这个函数
    println(func("Hello"))  //如果是直接调用，那么必须要传入对应类型的对象作为首个参数，此时this就指向我们传入的参数

}


open class Cat() {
    init { println("父类初始化") }
    fun hello() = println("我会打招呼")
}

class YellowCat() : Cat() {
    init { println("子类初始化") }
    fun draw() = println("我会画画")
}


interface Dog {
    var x: String
        get() = "666"
        set(value) {  /* 默认的setter会直接报错，因为使用了field字段 */}
    fun doSomething()= println("do something")
}

interface A{
    fun sleep() = println("管他什么早八不早八的，睡舒服再说")
}
interface B{
    fun sleep() = println("7点起床学Java了，不能再睡了")
}
class C: A, B  //由于A和B都具有sleep函数，那现在到底继承谁的呢？
{
    // 不处理sleep，会报错
    override fun sleep() = super<A>.sleep()  // 明确用A的sleep
    //override fun sleep()= println("睡个der，起来学习") // AB的sleep都不用，自己覆盖一个sleep

}


// 类的扩展
class A2 {
    fun hello() = "Hello World"
}
class B2 {
    fun A2.test() {
        hello()   //直接在类A的扩展函数中调用A中定义的函数
    }
}


class A3 {
    fun hello() = "Hello World"
}
class B3 (private val a: A3){
    private fun A3.test() = hello() + "!!!"
    fun world() = println(a.test())   //只能在类中通过A的实例使用扩展函数
}
//fun main() = B3(A3()).world()


class A4 {
    fun hello() = "Hello World"
}
class B4 (private val a: A4){
    private fun A4.test() {
        println(hello())   // Hello World 直接使用优先匹配被扩展类中的方法
        println(this.hello())   // Hello World 扩展函数中的this依然指的是被扩展的类对象
        println(this@B4.hello())  // Bye World 这里调用的才是下面的
    }
    private fun hello() = "Bye World"
    fun world() = a.test()
}
