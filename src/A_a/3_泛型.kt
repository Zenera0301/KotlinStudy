package A_a

abstract class A6<T> {
    abstract fun test(): T
}

class B6: A6<String>() {  //子类直接明确为String类型
    override fun test(): String = "Hello World" //明确后所有用到泛型的地方都要变成具体类型
}

abstract class C6<T>: A6<T>() {  //子类也有泛型参数
    abstract override fun test(): T
}

fun main() {
    val b = B6()
    println(b.test())
}