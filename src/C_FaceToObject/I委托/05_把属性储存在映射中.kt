package C_FaceToObject.I委托

class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    val site = Site(mapOf(
            "name" to "黑马程序员",
            "url" to "www.itheima.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)
}