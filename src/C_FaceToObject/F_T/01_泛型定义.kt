package C_FaceToObject.F_T

class Box<T>(var value: T)

fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxStr = Box<String>("string")

    println(boxInt.value)
    println(boxStr.value)
}