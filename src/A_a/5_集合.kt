package A_a

fun main(){
    // iterator 迭代器
    val list = listOf("AAA", "BBB", "CCC")
    val iterator: Iterator<String> = list.iterator()   //通过iterator函数得到迭代器对象
    while (iterator.hasNext()) {   //使用while不断判断是否存在下一个
        println(iterator.next())   //每次循环都取出一个
    }

    //现在无论什么集合/数组都可以按照统一的方式去进行处理
    forEach(listOf("AAA", "BBB", "CCC").iterator())
    forEach(setOf("AAA", "BBB", "CCC").iterator())
    forEach(arrayOf("AAA", "BBB", "CCC").iterator())
    forEach(mapOf(1 to "AAA", 2 to "BBB",3 to "CCC").iterator())

    // 自己写的类带迭代器就能用for in遍历
//    val test = Test()
//    for (s in test) {
//        println(s)
//    }

    // ListIterator
    val listIterator: ListIterator<String> = list.listIterator()   //使用listIterator函数来获取ListIterator
    println("正向下一个元素：${listIterator.next()}")  //不仅可以正着迭代
    println("正向下一个元素：${listIterator.next()}")  //不仅可以正着迭代
    println("正向下一个Index：${listIterator.nextIndex()}")   //还可以直接告诉你下一个迭代的是List的第几个元素
    println("反向下一个元素：${listIterator.previous()}")   //还能反着来

    // 遍历中修改
    val listModify = mutableListOf("AAA", "BBB", "CCC")
    val iteratorModify: MutableIterator<String> = listModify.iterator()
    while (iteratorModify.hasNext()) {
        iteratorModify.next()
    }
    iteratorModify.remove()   //删除当前迭代器已经遍历的最后一个元素
    println("listModify：")
    forEach(listModify.iterator())


    // 集合与数组
    val array = arrayOf("AAA", "BBB", "CCC")
    val list1: List<String> = array.toList()
    val list2: MutableList<String> = array.toMutableList()
    val set1: Set<String> = array.toSet()
    val set2: MutableSet<String> = array.toMutableSet()
    // map操作
    val lenList: List<Int> = list.map { it.length } // 获取长度数组
    val mapList: List<String> = list.mapIndexed { index, it -> "$index.${it}" }//结果 [0.AAA, 1.BBB, 2.CCC] 快速编号操作
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(numbersMap.mapKeys { it.key.uppercase() })   //对所有的Key进行Map操作
    println(numbersMap.mapValues { it.value + it.key.length })
    // 压缩
    val list3 = listOf(1, 2, 3)
    val list4 = listOf("AAA", "BBB", "CCC")
    val pairs: List<Pair<Int, String>> = list3.zip(list4)
    println(pairs)
    // 压缩进阶 快速将两个List集合揉成一个Map集合
    val map = mutableMapOf<Int, String>()
    map.putAll(list3.zip(list4))
    println(map)  //结果 {1=AAA, 2=BBB, 3=CCC}
    // 解压缩
    val list5 = listOf(1 to "AAA", 2 to "BBB", 3 to "CCC")  //把合在一起的Pair每个元素都分开
    val unzipList: Pair<List<Int>, List<String>> = list5.unzip()  //转换出来是一个存放两个List的Pair
    println(unzipList)

    //associateWith
    val list6 = listOf("AAA", "BBB", "CCC")
    //使用associateWith快速构建以列表中每个元素为Key的Map映射
    val associate1: Map<String, Int> = list6.associateWith { it.length }   //提供一个函数，返回值作为生成的Map对应Key的Value
    println(associate1)  //结果 {AAA=3, BBB=3, CCC=3}

    //associateBy
    val list7 = listOf("AAA", "BBB", "CCC")
    //使用associateBy快速构建以列表中每个元素为Value的Map映射
    val associate2: Map<Int, String> = list7.associateBy { it.length }   //提供一个函数，返回值作为生成的Map对应Value的Key
    println(associate2)   //结果{3=CCC}，因为上面生产出来的Key全是3，覆盖完只剩下最后一个了
    // 自行构建规则
    val associate: Map<String, Int> = list7.associate { it to it.length }  //返回一个Pair
    //嵌套集合的扁平化
    val list8 = listOf(listOf("AAA", "BBB"), listOf("CCC", "DDD"))
    val flatten: List<String> = list8.flatten()   //使用flatten函数将嵌套集合扁平化
    println(flatten)   //可以看到内容自动被展平了 [AAA, BBB, CCC, DDD]

    // flatMap 把下面这个给展平
//    val list9 = listOf(Container(listOf("AAA", "BBB")), Container(listOf("CCC", "DDD")))
//    //使用flatMap函数进行操作，支持自定义获取列表然后再进行扁平化操作
//    val flatList: List<String> = list9.flatMap { it.list }   //通过Lambda将每一个Container映射为List
//    println(flatList)   //结果为：[AAA, BBB, CCC, DDD]
    //
    val list83 = listOf("AA", "BBB", "CC", "DDD")
    //使用chunked进行分块，这里2个元素为一组进行分块，得到一个嵌套的集合
    println(list83.chunked(2))   //结果 [[AA, BBB], [CC, DDD]]

    // 过滤
    val list10 = listOf("AAA", "BB", "CCC")
    //使用filter来过滤不满足条件的元素，这里的意思是只保留长度大于2的字符串
    val filterList: List<String> = list10.filter { it.length > 2 }
    println(filterList)  //结果为：[AAA, CCC]

    val numbersMap2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    //Map同样支持这样的操作
    val filteredMap = numbersMap2.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)
    // 过滤空值
    val list11 = listOf("AAA", null, "BBB", null)
    val filterList2: List<String> = list11.filterNotNull()
    println(filterList2)   //结果 [AAA, BBB]
    // 过滤留下指定类型的数据
    val list12 = listOf("AAA", Any(), "BBB", 123, 3.14)
    val filterList3: List<String> = list12.filterIsInstance<String>()  //快速过滤出所有的String元素
    println(filterList3)   //结果 [AAA, BBB]
    // 过滤留下的、过滤筛掉的 都要
    val list13 = listOf("AA", "BBB", "CC", "DDD")
    val (match, mismatch) = list13.partition { it.length > 2 }//分区操作得到一个匹配列表和一个不匹配列表
    println("匹配的列表: $match")
    println("不匹配的列表: $mismatch")
    //测试元素是否满足条件
    val list14 = listOf("AA", "BBB", "CC", "DDD")
    list14.any { it.length > 2 }  //判断集合中是否至少存在一个元素满足条件
    list14.none { it.length > 2 }  //判断集合中是否不存在任何一个元素满足条件
    list14.all { it.length > 2 }   //判断集合中是否每一个元素都满足条件
    // 按元素类别分类， key是类别，value是元素集合
    val list15 = listOf("AA", "BBB", "CC", "DDD")
    println(list15.groupBy { it.length })  //按照字符串的长度进行分组 得到 {2=[AA, CC], 3=[BBB, DDD]}
    //集合裁剪
    val list16 = listOf("AA", "BBB", "CC", "DDD")
    println(list16.slice(1..2))   //截取从第二个元素到第三个元素共两个元素的List片段，结果：[BBB, CC]
    println(list16.take(2))  //使用take获取从第一个元素开始的长度为N的元素片段，结果：[AA, BBB]
    println(list16.takeLast(2)) //同上，但是从尾部倒着来，结果：[CC, DDD]
    println(list16.drop(2))   //这个跟take是反着的，直接跳过前N个元素截取，结果：[DDD]
    println(list16.dropLast(2))  //不用多说了吧
    println(list16.takeWhile { it.length > 2 })   //从第一个元素开始，依次按照给定的函数进行判断，如果判断成功则添加到返回列表中，直到遇到一个不满足条件的就返回，这里的结果就是 [AA]


}

fun <T> forEach(iterator: Iterator<T>) {   //统一接收迭代器对象
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

class Test : Iterable<String> {    //这个接口实不实现其实都无所谓
    //实现这个运算符重载函数iterator是必须要的，否则不支持
    override operator fun iterator(): Iterator<String> = TestIterator()

    class TestIterator: Iterator<String> {  //自己随便写一个迭代器实现
        override fun hasNext(): Boolean = true
        override fun next(): String = "666"
    }
}