package C_FaceToObject.E_DataClass_WrapperClass

data class User(val name:String,val age:Int)

fun main(args: Array<String>) {
    val jack = User("Jack",20)
    val olderJack = User("OldJack",60)

    //默认封装好了toString方法
    println(jack)
    println(olderJack)
}