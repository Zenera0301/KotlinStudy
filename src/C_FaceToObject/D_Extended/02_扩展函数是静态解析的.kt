package C_FaceToObject.D_Extended

open class Base

class Child : Base()

//给base拓展方法print
fun Base.print(): Unit {
    println("Base exFun")
}

//给child拓展方法print
fun Child.print(): Unit {
    println("Child exFun")
}

//参数接收基类对象
fun executePrintBase(base: Base) {
    base.print()
}
fun executePrintChild(child: Child) {
    child.print()
}

fun main(args: Array<String>) {
    //创建child对象
    var child = Child()
    //调用executePrint
    /*
扩展函数是静态解析的，并不是接收者类型的虚拟成员，在调用扩展函数时，
具体被调用的的是哪一个函数，由调用函数的的对象表达式来决定的，
而不是动态的类型决定的:
 */
    executePrintBase(child)
    executePrintChild(child)
}