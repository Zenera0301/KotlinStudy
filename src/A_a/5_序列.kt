package A_a

// Sequence是一个延迟获取数据的集合，只有需要元素时才会生产元素并提供给外部，
// 包括所有对元素操作，并不是一次性全部处理，而是根据情况选择合适的元素进行操作
// 处理大量数据时获得显著的性能提升

val sequence: Sequence<Int> = generateSequence {
    println("生成一个新的元素")
    10   //返回值就是生成的元素
}

fun main(args: Array<String>) {
    //sequence.forEach { println(it) }

    val list = listOf("AA", "BBB", "CCC", "DD", "EEE", "FF", "GGG", "HH")

    //以下操作用于获取前两个长度大于2的字符串，并进行小写转换操作
//    val result1 = list.filter {
//        println("进行过滤操作: $it")
//        it.length > 2
//    }.map {
//        println("进行小写转换操作：${it}")
//        it.lowercase()
//    }.take(2)
//    println(result1)


    //使用asSequence函数将集合转换为一个序列
    val result2 = list.asSequence().filter {
        println("进行过滤操作: $it")
        it.length > 2
    }.map {
        println("进行小写转换操作：${it}")
        it.lowercase()
    }.take(2).toList()
    println(result2)  //如果这句不执行，不获取元素，以上整个操作都是不会进行的

}