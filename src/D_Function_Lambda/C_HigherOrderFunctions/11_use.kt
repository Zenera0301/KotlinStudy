package D_Function_Lambda.C_HigherOrderFunctions

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {

    //古老方法
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true) {
            line = it.readLine() ?: break // 注意是用 it 调用
            println(line)
        }
    }
    //简单方式
    val br = BufferedReader(FileReader("hello.txt")).readText()
}
