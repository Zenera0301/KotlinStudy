package D_Function_Lambda.C_HigherOrderFunctions

/*
  将函数作为参数或返回一个函数，称为高阶函数。
 */
fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

fun main(args: Array<String>) {
    var items = listOf(1, 2, 3, 4, 5, 6)
    // 使用Lambda调用参数
    val doubledItems = items.map {
        println("当前数字是：$it")
        it * 2
    }
    doubledItems.map { println(it) }

    // 输入函数参数调用map
    fun process(i:Int):Int{
        return i*3
    }
    val processedItems = items.map(::process)
    println(processedItems)
}
