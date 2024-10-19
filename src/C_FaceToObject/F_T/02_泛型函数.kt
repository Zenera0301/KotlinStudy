package C_FaceToObject.F_T

//泛型推断
fun <T> printInfo(content: T) {
    when (content) {
        is Int -> println("传入的$content,是一个Int类型")
        is String -> println("传入的$content,是一个String类型")
        else -> println("传入的$content,不是Int也不是String")
    }
}

fun main(args: Array<String>) {
    printInfo(10)
    printInfo("hello world")
    printInfo(true)
}