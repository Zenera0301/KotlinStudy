package A_a

fun main(args: Array<String>) {
    val set1: Set<String> = mutableSetOf("AAA", "BBB", "BBB", "CCC")//set1: Set<String> 不允许add
    println(set1)   //由于不允许出现重复元素，得到 [AAA, BBB, CCC]
    //set1.add("BBB")// 报错，不允许add

    val set2: MutableSet<String> = mutableSetOf("AAA", "DDD", "CCC") // set: MutableSet<String> 才行
    set2.add("BBB")

    // 借助迭代器有序
    val set = linkedSetOf("AAA", "DDD", "CCC")
    println(set.elementAt(1))   //elementAt是通过迭代器的遍历顺序取得对应位置的元素

    // 交互 得到的结果始终是set
    val set3 = mutableSetOf("AAA", "DDD", "CCC")
    val set4 = mutableSetOf("BBB", "CCC", "EEE")
    println(set3 union set4)   //+ 求两个集合的并集: [AAA, DDD, CCC, BBB, EEE]  Set的+运算与这个效果一样
    println(set3 intersect set4)   //求两个集合的交集: [CCC]
    println(set3 subtract set4)  //- 求集合1在集合2中的的差集: [AAA, DDD]  Set的-运算与这个效果一样
    println((set3 - set4) union (set4 - set3))   //去掉公共部分 并集减去交集

    val set5 = hashSetOf("AAA", "DDD", "BBB")   //创一个不重复且无序的Set集合
    val set6 = linkedSetOf("AAA", "DDD", "BBB")  //跟mutableSetOf一样得到一个不重复且有序的Set集合

    val hashSet = HashSet<String>()  //创一个不重复且无序的Set集合
    val linkedHashSet = LinkedHashSet<String>()   //跟mutableSetOf一样得到一个不重复且有序的Set集合

    val set7 = setOf("AAA", "DDD", "BBB")   //只读的Set集合
    val set8 = setOfNotNull("AAA", "DDD", "BBB", null)   //自动过滤Null元素的Set集合

    val set9 = sortedSetOf("AAA", "DDD", "BBB")   //元素自动排序的Set集合，可以自定义排序规则



}
