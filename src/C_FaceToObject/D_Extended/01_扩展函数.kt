package C_FaceToObject.D_Extended

class User(var name: String)

//拓展方法
fun User.printUserInfo(): Unit {
    println("我是 ${name}")
}

fun main(args: Array<String>) {
    var user = User("大头儿子")
    user.printUserInfo()
}