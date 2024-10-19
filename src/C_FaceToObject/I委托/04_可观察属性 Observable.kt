package C_FaceToObject.I委托

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("默认值") {
        prop, old, new ->
        println(prop)
//        println("旧值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}