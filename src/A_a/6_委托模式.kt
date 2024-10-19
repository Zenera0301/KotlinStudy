package A_a

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

//// 将类的实现交给某个对象
//interface Base {
//    fun print()
//}
//class Derived(val base: Base): Base {   //将一个Base的实现类作为属性保存到类中，同样实现Base接口
//    override fun print() = base.print()   //真正去实现这个接口的，实际上并不是当前类，而是被拉进来的那个替身
//}
//class Derived2(val b: Base): Base by b  //使用by关键字将所有接口待实现操作委托给指定成员



//// 将属性委托给他人
//class Example(var s:String) {
//    var p: String by Delegate()  //属性也可以使用by关键字委托给其他对象
//    val a: String by lazy { "懒加载" }   //lazy为我们生成一个委托对象，这样在获取属性值的时候就会执行lazy里面的操作了，看起来效果就像是延迟执行一样，由于只能获取，所以说只支持val变量
//    var q: String by Delegates.observable("我是初始值") { prop, old, new ->
//        println("检测到$prop 的值发生变化，旧值：$old -> 新值：$new")
//    }
//    var r: String by ::s   //使用双冒号来委托给其他属性 当前属性的值修改，会直接导致其他属性的值也会修改，相反同样它们已经被相互绑定了
//}
//
//// 委托的类
//class Delegate {
//    //需要重载属性的获取和设置两个运算
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, 这里委托了 ${property.name} 属性"
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        println("$thisRef 的 ${property.name} 属性赋值为 $value")
//    }
//}
//
//fun main() {
//    println(Example("hello").p)
//    println(Example("hello").a)
//    Example("hello").q = "你干嘛"
//    val example = Example("ByBy")
//    println(example.r)
//}


class User(map: MutableMap<String, Any>) {
    var name: String by map   //直接委托给外部传入的Map集合
    var age: Int by map   //变量的值从Map中进行存取
    override fun toString(): String = "名称: $name, 年龄: $age"
}

fun main() {
    val map: MutableMap<String, Any> = mutableMapOf(
        "name" to "John Doe",
        "age"  to 25
    )
    val user = User(map)
    println(user)   //名称: John Doe, 年龄: 25
    map["age"] = 10   //映射的值修改会直接影响变量的值
    println(user)  //名称: John Doe, 年龄: 10
}