package A_a
// 创建键值对的中缀函数
public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

fun main(args: Array<String>) {
    // 创建键值对
    val pair: Pair<Int, String> = 10001 to "小明"   //得到一个由学号指向学生名称的键值对

    // 使用mutableMapOf可以放入多个键值对，并生成一个Map对象
    val map: MutableMap<Int, Student> = mutableMapOf(
        10001 to Student("小明", 18),
        10002 to Student("小红", 17),
        10003 to Student("小刚", 19)
    )

    // 判断包含性
    map.contains(1)   //判断是否包含指定Key
    map.containsKey(1)   //同上
    10001 in map    //同上
    map.containsValue(Student("小明", 18))   //判断是包含指定Value
    // 注意：Map中的键值对存储，只能通过Key去访问Value，而不能通过Value来反向查找Key，映射关系是单向的！

    //获取到Key和Value的集合
    val keys: MutableSet<Int> = map.keys   //以Set形式存储的[10001, 10002, 10003]
    val value: Collection<Student> = map.values    //以Collection接口类型返回的 [小明 (18), 小红 (17), 小刚 (19)] 具体类型是Map的内部类实现的

    // 遍历
    map.forEach { (k, v) -> println("键: $k, 值 $v") }  //forEach提供两个参数，key和value

    for (entry in map) {   //使用for循环也可以直接安排，这里得到的是一个entry
        entry.key
        entry.value
    }

    for ((key, value) in map) {  //也可以可以直接写成这样
        println("键: $key, 值 $value")
    }

    // 增
    map[10004] = Student("小强", 18)   //跟之前一样，直接对着赋值就行了
    map.put(10004, Student("小强", 18))  //使用函数也可以，跟上面效果一样
    val newMap = map + (10004 to Student("小强", 18))   //添加新的键值对并生成一个新的Map
    map += (10004 to Student("小强", 18))  //直接添加键值对到当前Map里面
    map += mapOf(10004 to Student("小强", 18))  //或者添加其他Map到此Map中
    map.putAll(mapOf(10004 to Student("小强", 18)))   //跟上面一样
    map.putAll(setOf(10004 to Student("小强", 18)))   //键值对集合也可以的
    val old = map.put(10003, Student("小强", 18))   //put的返回值如果没有覆盖元素返回null，否则返回被覆盖的元素
    println("被覆盖的$old")   //被覆盖的小刚 (19)

    // 删
    val old2 = map.remove(10001)   //使用remove函数移除指定键值对
    println("被移除的$old2")
    map -= 10001   //等价于 map.remove(10001)
    map -= listOf(10001, 10002)   //是的你没猜错，这个是批量移除
    map.values.remove(Student("小明", 18))   //通过这种方式移除也只会移除按顺序下来的第一个

    // 查
    val student: Student? = map[10001]   //使用[]运算符通过Key查找Value 得到小明这个对象
    val student2: Student? = map[10005]   //Map中根本没有键为10005的键值对，得到的结果是null
    //使用getOrDefault在没有结果时返回给定的默认值
    var studentTest1: Student = map.getOrDefault(10004, Student("小强", 16))
    //跟上面一样，只不过是使用函数式返回默认值
    var studentTest12: Student = map.getOrElse(10004){ Student("小强", 16) }
    //这个不仅能返回默认值，还能顺手把默认值给加到Map里面去，很方便
    var studentTest13: Student = map.getOrPut(10004){ Student("小强", 16) }
    println(map)  //结果为 {10001=小明 (18), 10002=小红 (17), 10003=小刚 (19), 10004=小强 (16)}

    // 其他创建
    val map1 = mapOf(1 to "AAA")   //只读Map
    val map2 = hashMapOf(1 to "AAA")   //不保存Key顺序的Map
    val map3 = linkedMapOf(1 to "AAA")   //保存Key顺序的Map，跟mutableMapOf一样
    val map4 = sortedMapOf(1 to "AAA")   //根据排序规则自动对Key排序的Map
    val map5 = emptyMap<Int, String>()   //空Map
    val hashMap = HashMap<Int, String>()   //采用构造函数创建的HashMap，不保存Key顺序的Map，同map2
    val linkedHashSet = LinkedHashMap<Int, String>()   //采用构造函数创建的LinkedHashMap，保存Key顺序的Map，同map3
}