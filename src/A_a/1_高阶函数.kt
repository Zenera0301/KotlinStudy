package A_a

typealias lalala = String

fun main(args: Array<String>) {
//    var func: (String)->Int = fun(s:String) = 10
    var func: (String)->Int = {
        println("func函数作为入参，func函数的参数是：$it")
        10
    }

    var func2: (String,String)->Int = {a,b->
        println(a+b)
        10
    }
    var func3: (String,String)->Int = {_,b->
        println(b)
        10
    }
    test(func)

    test ({
        println("lambda函数作为入参，lambda函数的参数是：$it")
        11
    })

    test {
        println("lambda函数作为入参，且去掉括号，lambda函数的参数是：$it")
        12
    }


}

// 参数是个函数，所以test是高阶函数
fun test(func: (String)->Int){
    val res = func("hello world")
    println("调用结果=$res")
}

