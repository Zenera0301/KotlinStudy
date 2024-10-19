package C_FaceToObject.H_ObjectExp

object Site {
    var url: String = "";
    var name: String = ""
}

fun main(args: Array<String>) {
    var s1 = Site
    var s2 = Site

    s1.url = "www.ithiema.com"
    s1.name = "黑马程序员"

    s2.url = "www.itcast.cn"
    s2.name = "传智播客"

    println(s1.name)
    println(s2.name)
}