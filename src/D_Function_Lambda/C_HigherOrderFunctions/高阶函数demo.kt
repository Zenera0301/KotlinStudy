package D_Function_Lambda.C_HigherOrderFunctions

//1个参数 1个返回值 Function2
fun highfun(sa: Calc, method: Calc.(Calc) -> String):Int{
        return sa.method(sa).toInt()
}


fun main(args: Array<String>) {
    var calc = Calc()
    highfun(calc,{

            println("hhH")
            "188"
            print(i)
            "222"

    })+1



}

fun  Calc.multi(x:Int,y:Int) = x*y

class Calc{
    fun add(x:Int,y:Int):Int  {println(x+y);return x+y}
    fun sub(x:Int,y:Int) = x-y
    var i = 88
}