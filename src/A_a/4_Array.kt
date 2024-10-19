package A_a

fun main(){
    // 数组遍历
    val arr: Array<Int> = arrayOf(1,2,3)
    print("方法1遍历:")
    for (i in 0..<arr.size){
        print(arr[i])
    }

    println();print("方法2遍历:")
    for (item in arr){
        print(item)
    }

    println();print("方法3遍历:")
    for (i in arr.indices){
        print(arr[i])
    }

    println();print("方法4遍历:")
    for ((index, item) in arr.withIndex()) {  //使用withIndex解构后可以同时遍历索引和元素
        print("(元素$item，位置$index) ")
    }

    println();print("方法56遍历:")
    arr.forEach { print(it) }   //只带元素的
    print(" ")
    arr.forEachIndexed { index, item ->   //同时带索引和元素的
        print("(元素$item，位置$index)")
    }

    println();print("方法78910遍历:")
    println(arr.joinToString())  //使用joinToString将数组中的元素转换为字符串，默认使用逗号隔开：7, 3, 9, 1, 6
    println(arr.joinToString(" - ", "> ", " <"))  //自定义分隔符，前后缀: > 7 - 3 - 9 - 1 - 6 <
    println(arr.joinToString(limit = 2, truncated = "..."))  //甚至可以限制数量，多余的用自定义的字符串...代替: 7, ...
    println(arr.joinToString() { (it * it).toString() })   //自定义每一个元素转换为字符串的结果


    // 数组创建 比较
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5)  //两个内容相同的数组
    val array2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    //println(array1 == array2)   //不可以使用==来判断数组内容是否相同，不支持
    println(array1.contentEquals(array2))   //需要使用扩展函数contentEquals来进行内容比较

    // 数组拷贝
    val array31 = array1.sliceArray(1..3)   //从第二个元素到第四个元素共三个元素的数组
    val array32: Array<Int> = array1.copyOf()   //使用copyOf来拷贝数据内容并创建一个新的数组存储,与源不是同一个对象
    val array33: Array<Int?> = array1.copyOf(10)//在拷贝时指定要拷贝的长度，如果小于数组长度则只保留前面一部分内容，如果大于则在末尾填充null，因此返回的类型是Int?可空
    val array34: Array<Int> = array1.copyOfRange(1, 3)  //从第二个元素开始拷贝到第四个元素前为止，共2个元素 使用copyOfRange拷贝指定下标范围上的元素
    val array35 = array1 + array2
    val array36 = arrayOf(*array1) // 扩展运算符（*）此运算符将数组的每个元素作为单个参数传递
    testVararg(1, *array1.toIntArray(), 2,3)   //前面后面甚至还能继续写
    val arrayString = arrayOf("AAA", "BBB", "CCC")
    testVarargString("111", *arrayString, "DDD", "EEE")   //前面后面甚至还能继续写

    // 包含某个元素、寻找元素位置、拿到指定位置的元素
    val array = arrayOf(13, 16, 27, 32, 38)
    println(array.any())   //判断数组是否为非空数组（容量大于0）
    println(array.isEmpty())   //判断数组是否为空数组（容量为0）
    println(array.contains(13))   //判断数组中是否包含3这个元素
    println(13 in array)   //跟contains函数效果一样，判断数组中是否包含3这个元素

    println(array.indexOf(26))    //寻找指定元素的下标位置
    println(array.binarySearch(16))    //二分搜索某个元素的下标位置（效率吊打上面那个函数，但是需要数组元素有序，具体原因可以学习数据结构与算法了解）
    println(array.first())   //快速获取首个元素
    println(array.last())    //快速获取最后一个元素


    // 排序
    val array4: Array<Int> = array1.reversedArray()   //翻转数组元素顺序，并生成新的数组
    array1.reverse()   //直接在原数组上进行元素顺序翻转
    array1.reverse(1, 3)   //仅翻转指定下标范围内的元素
    array1.shuffle()  //使用shuffle函数将数组中元素顺序打乱
    array1.sort()   //使用sort函数对数组中元素进行排序，排序规则可以自定义
    array1.sort(1, 3)   //仅排序指定下标范围内的元素
    array1.sortDescending()   //按相反顺序排序

    val arrayStudent = arrayOf(Student2("小明", 18), Student2("小红", 17))
    arrayStudent.sort()
    println(arrayStudent.joinToString())

    // 原生类型数组 免拆装
    val array5: IntArray = intArrayOf(7, 3, 9, 1, 6)//使用arrayOf的变种intArrayOf快速生成IntArray
    println(array5.sum())  //快速求和操作，获得数组中所有元素之和
    println(array5.average())   //求整个数组的平均数
    println(array5.min()) // 最小值
    println(array5.max()) // 最大值


    // 多维数组
    // 比较
    val arr1: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    val arr2: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    println(arr1.contentEquals(arr2))   //此函数只会简单比较里面的每一个元素，当里面每个元素是数组时不会再继续去比较第二层第三层等
    println(arr1.contentDeepEquals(arr2))  //此函数会一直深入比较每一层，多维使用这个比较
    //只要内层使用Any类型，就可以接收所有类型的嵌套数组
    //虽然我们使用的看起来确实类似于二维数组，但是每一个数组的长度并不需要是相同的
    val arr3: Array<Array<out Any>> = arrayOf(arrayOf(1, 3, 4, 5), arrayOf("AAA", "BBB"))

}



//首先类型需要实现Comparable接口，泛型参数T填写为当前类型
class Student2(private val name: String, private val age: Int) : Comparable<Student2> {
    //接口中就这样一个函数需要实现，这个是比较的核心算法，要参数是另一个需要比较的元素，然后返回值是一个Int
    //使用当前对象this和给定对象other进行比较，如果返回小于0的数，说明this对象应该排在前面，反之this对象排后面，返回0表示同样的级别
    // 如果是this-other结果为负，说明this比other小，this在前，说明小的在前，从小到大排，顺序
    // 如果是other-this结果为负，说明this比other大，this在前，说明大的在前，从大到小排，逆序
    override fun compareTo(other: Student2): Int = other.age - this.age
    override fun toString(): String = "$name ($age)"
}

fun testVararg(vararg n: Int) {
    //使用vararg关键字将参数标记为可变长参数
}

fun testVarargString(vararg strings: String) {
    //var str: Array<out String> = strings  //在函数中得到的是一个Array<out String>类型的数组
}