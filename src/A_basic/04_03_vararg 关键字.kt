package A_basic

fun main(args: Array<String>) {
    fun myFun(vararg a:Int) {
        for (i in a) {
            println(i)
        }
    }
    myFun(1,2,3,4)
}