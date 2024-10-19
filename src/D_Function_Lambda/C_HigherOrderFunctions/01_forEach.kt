package D_Function_Lambda.C_HigherOrderFunctions

class TTT {


    fun BBB(name: String) {
        println(name)
    }

    fun main(args: Array<String>) {


        var items = listOf<String>("a", "b", "c", "d")

        /*
    public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
      }
     */

        //1.根据函数的定义
        items.forEach({
            a ->
            println(a)
        })


        //1.根据函数定义传递
        val print = fun(name: String) {
            println(name)
        }



        items.forEach(print)


        //2.看源码类似这样的效果
        for (element in items) {
            println(element)
        }


        //3.还可以这样
        items.forEach {
            a ->
            println(a)
        }

        //4.如果这个函数只接收一个参数，那我们可以使用 it 引用，而不用去指定左边的参数。
        items.forEach {
            println(it)
        }

        //5.还可以这样
        items.forEach(::println)


        var b = TTT()
        items.forEach(b::BBB)

        /*
    @kotlin.internal.InlineOnly
     public inline fun println(message: Any?) {
         System.out.println(message)
     }
     */
    }

    fun aa(): Unit {
        var items = listOf<String>("a", "b", "c", "d")
        items.forEach(this::BBB)
    }
}
