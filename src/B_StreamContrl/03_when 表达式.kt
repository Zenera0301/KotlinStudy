package B_StreamContrl

fun main(args: Array<String>) {
    var x = 0
    when (x) {
    //是否是Int类型
        is Int -> println("是Int类型")
    //是否是0或者1
        0, 1 -> println("不是0,就是1")
    //是否在[0,10]区间
        in 0..10 -> println("在[0,10]")
    //是否不在[0,10]区间
        !in 0..10 -> println("不在[0,10]区间")
    //是否是1
        1 -> println("是1")
    //是否是2
        2 -> println("是2")

    //如果都不满足
        else -> println("所有情况都不满足")
    }

    val y = "test"
    when(y){
//        is String-> println(y)
        "abc","t"-> println("是abc或者t")
        in arrayOf("abc","test")-> println("是abc或者test")
        else -> println("以上均不是")
//        !in 0..100-> println("不在[0,100]")
    }
}