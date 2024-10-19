package D_Function_Lambda.C_HigherOrderFunctions

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5);
    val newList = list.map {
        it * 2 + 3
    }
    newList.forEach(::println) // 输出 5 7 9 11 13
}