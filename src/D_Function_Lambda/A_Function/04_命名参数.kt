package D_Function_Lambda.A_Function

//部分参数带默认参数的方法
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
    println("str = [${str}], normalizeCase = [${normalizeCase}], upperCaseFirstLetter = [${upperCaseFirstLetter}], divideByCamelHumps = [${divideByCamelHumps}]," +
            " wordSeparator = [${wordSeparator}]")
}

fun main(args: Array<String>) {
    //只需要传递一个参数即可
    reformat("哈哈")

    //传递所有参数
    reformat("哈哈", true, true, false, '_')

    //命名参数我们可以使代码更具有可读性
    reformat(str = "哈哈",
            normalizeCase = true,
            upperCaseFirstLetter = true,
            divideByCamelHumps = false,
            wordSeparator = '_'
    )
    //传递部分参数
    reformat("哈哈", wordSeparator = '_')
}

