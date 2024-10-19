package B_StreamContrl

fun main(args: Array<String>) {
    //定义标签
    ding@ for (i in 1..4) {
        for (j in 1..4) {
            if (i == 2 && j == 2) {
                //break到指定标签
                break@ding
            }
            println("i = $i, j = $j")
        }
    }
}