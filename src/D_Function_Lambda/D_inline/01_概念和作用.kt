package D_Function_Lambda.D_inline

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/*
使用高阶函数(higher-order functions)会导致一些性能的损耗:
    每个函数都是对象,且会捕获闭包closure(即变量会在函数体内被访问),
    函数对象/类会增加内存分配,而且虚拟调用栈也会增加额外内存开销！

可用内联函数(inline function)消除这些额外内存开销,
说白了就是在调用处插入函数体代码,以此减少新建函数栈和对象的内存开销!
被inline修饰的函数或lambda表达式,在调用时都会被内联(在调用处插入函数体代码)
 */
fun main(args: Array<String>) {
    var l = ReentrantLock()
    //编译器实际生成以下代码(就是直接把代码插入到调用处):
    print("开始************")
    lock(l) { foo() }
    print("结束************")

    /*
     //编译器实际生成以下代码(就是直接把代码插入到调用处):
    print("开始************")
    l.lock()
    try {
        foo()
    }
    finally {
        l.unlock()
    }
    print("结束************")

     */
}

fun foo(): Any {
    return 1;
}

inline fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

