package D_Function_Lambda.A_Function

fun main(a:Array<String>){
    var result = 0
    ollOld(10000,result)
    println(result)
}

tailrec fun ollOld(num:Int, result:Int):Int{
    println("第${num}次运算，result=$result")
    if(num == 0){
        return 1
    }else{
        return ollOld(num-1, result+num)
    }
}