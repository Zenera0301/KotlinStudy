package C_FaceToObject.G_Enum

enum class Week {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

enum class Led{
    RED, YELLOW, GREEN
}
fun printLed(led:Led){
    when(led){
        Led.RED-> println("Stop")
        Led.YELLOW-> println("Slow down")
        Led.GREEN -> println("run")
    }
}

fun printInfo(c: Week): Unit {
    when (c) {
        Week.MON -> println("今天是 星期一")
        Week.TUE -> println("今天是 星期二")
        Week.WED -> println("今天是 星期三")
        Week.THU -> println("今天是 星期四")
        Week.FRI -> println("今天是 星期五")
        Week.SAT -> println("今天是 星期六")
        Week.SUN -> println("今天是 星期日")
    }
}

fun main(args: Array<String>) {
    printInfo(Week.MON)

    println("--------遍历集合--------")
    for (value in Week.values()) {
        println(value.name)
    }


    println(Week.MON.name)
    println(Week.MON.ordinal)

    println(Week.FRI.name)
    println(Week.FRI.ordinal)

    println("--------遍历Led集合--------")
    for (led in Led.values()){
        printLed(led)
    }
}






