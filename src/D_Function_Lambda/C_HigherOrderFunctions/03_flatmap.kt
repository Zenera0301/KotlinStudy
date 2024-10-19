package D_Function_Lambda.C_HigherOrderFunctions

fun main(args: Array<String>) {
    val list = listOf(1..5, 3..8, 10..15)
    val flatList = list.flatMap {
        it
    }
    flatList.forEach(::println) // 输出 1 2 3 4 5 3 4 5 6 7 8 10 11 12 13 14 15
}