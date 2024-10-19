package A_basic

fun main(args: Array<String>) {
    //定义数组方式一:自定义内容,[1,2,3]
    val arr1 = arrayOf(1, 2, 3)
    //定义数组方式一:规则化内容,[0,2,4]
    val arr2 = Array(3, { i -> (i * 2) })

    //数组遍历
    for (i in arr1) {
        println(i)
    }

    for (i in arr2) {
        println(i)
    }



    val a1 = arrayOf(1,2,3,4)
    val a2 = Array(2, {i->i*3})
    for (i in a1) {
        print("${i} ")
    }
    println()
    for (i in a2) {
        print(i)
        print(" ")
    }
    println()
}