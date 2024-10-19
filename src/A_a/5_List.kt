package A_a

fun main(){
    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4)   //使用mutableListOf来创建一个可修改的List集合
    list[0] = 10   //修改某个位置上的元素
    println(list[1])   //获取某个位置上的元素
    println(list)    //打印出来的结果也是非常标准的: [10, 2, 3, 4]
    // 增
    list.add(5)   //使用add函数添加一个新的元素到列表末尾
    list.add(2, 666)   //将666插入到第三个元素的位置上去
    //删
    list.removeAt(2)  //使用removeAt可以删除指定位置上的元素
    list.remove(2)    //使用remove可以删除指定元素
    // 改 仅mutable的元素可改
    // 查 同Array


    // 不可变列表
    val listString: List<String> = listOf("AAA", "BBB", "CCC", "DDD")  //使用listOf生成的列表是只读的
    //listString[0] = "XXX"   //在修改时会直接提示不支持
    // 非Null
    val array = arrayOf("AAA", null, "CCC", "DDD")
    val listNotNull: List<String> = listOfNotNull(*array)   //使用listOfNotNull可以自动去除所有null的元素，再创建只读列表
    // 空列表
    val listNull: List<String> = emptyList()   //返回空列表
    //通过构造函数构造
    val listByConstructor: List<String> = List(3){ "TZ" }  //跟数组一样
    // 操作符+-
    val l1 = listOf("AAA", "DDD", "CCC")
    val l2 = listOf("BBB", "CCC", "EEE")
    println(l1 + l2)   //合并两个List的内容，顺序直接在后面拼接: [AAA, DDD, CCC, BBB, CCC, EEE]
    println(l1 - l2)   //让前面的集合减去与后面集合存在重复内容的部分: [AAA, DDD]
}