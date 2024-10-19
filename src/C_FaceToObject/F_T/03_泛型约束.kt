package C_FaceToObject.F_T

fun <T : Comparable<T>> sort(list: List<T>) {

}


fun main(args: Array<String>) {
    // OK。Int 是 Comparable<Int> 的子类型
    sort(listOf(1, 2, 3))
    // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
//    sort(listOf(HashMap<Int, String>()))
}
