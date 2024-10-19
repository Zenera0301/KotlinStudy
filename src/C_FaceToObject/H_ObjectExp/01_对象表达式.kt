package C_FaceToObject.H_ObjectExp

object Site100 {
    var url: String = ""
    val name: String = "黑马程序员"
}

fun main(args: Array<String>) {
    var s1 = Site100
    var s2 = Site100
    var s3 = Site100
    s1.url = "www.itheima.com"
    println(s1.url)
    println(s2.url)
    println(s3.url)
}