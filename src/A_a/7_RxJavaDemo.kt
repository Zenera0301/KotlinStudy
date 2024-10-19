package A_a

fun main(args: Array<String>) {
    create{ // 起点，没有输入源
        123
        456
        true
        "Hello"//最后一行，输出源
    }.map{
        111
        // this 或 it
        "[${it}]"
    }.map{
        "---${it}---"
    }.observer{
        println("最终消费：${it}")
    }
}

class RxJavaCoreClassObject<T> (var valueItem:T)

inline fun <CREATE_OUTPUT> create(createLambda: ()->CREATE_OUTPUT): RxJavaCoreClassObject<CREATE_OUTPUT> {
    val createResult:CREATE_OUTPUT = createLambda()
    return RxJavaCoreClassObject(createResult)
}

inline fun<INPUT, OUTPUT> RxJavaCoreClassObject<INPUT>.map(mapAction:(INPUT)->OUTPUT): RxJavaCoreClassObject<OUTPUT> {
    val mapResult:OUTPUT = mapAction(this.valueItem)
    return RxJavaCoreClassObject(mapResult)
}

inline fun<INPUT> RxJavaCoreClassObject<INPUT>.observer(observerAction:(INPUT)->Unit):Unit{
    observerAction(this.valueItem)
}

