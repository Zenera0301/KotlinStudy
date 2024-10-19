package C_FaceToObject.I委托

/*
所谓的委托属性，就是对其属性值的操作不再依赖于其自身的getter()/setter()方法，
是将其托付给一个代理类，从而每个使用类中的该属性可以通过代理类统一管理，再也不用在每个类中，对其声明重复的操作方法。
当我们使用属性的get或者set的时候，属性委托的getValue和setValue就会被调用。

一些属性值的存和取是固定的,交给一个专门去读取就行了.
 */
import kotlin.reflect.KProperty

// 定义包含属性委托的类
class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }

}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)     // 访问该属性，调用 getValue() 函数

    e.p = "Person2" // 调用 setValue() 函数
    println(e.p)    // 访问该属性，调用 getValue() 函数
//    Triple
    //Pair
}