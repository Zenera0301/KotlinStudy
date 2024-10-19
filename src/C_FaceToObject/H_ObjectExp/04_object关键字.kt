package C_FaceToObject.H_ObjectExp

// 在Kotlin中，oject的神奇之对象表达式，什么是对象表达式呢？我们把它认为是一个匿名类的实例，该匿名类可以继承自某个类或者多个接口。不过，我们需要通过object关键字将其声明，表示这是一个对象。对于文章开始的单击事件监听我们可以这么写：
//
//btn.setOnClickListener(object : OnClickListener{
//    // 处理单击事件逻辑
//    ***
//});

//注
//
//如果被继承的基类中为有参构造器且没有无参构造器时，那么必须向构造器传递适当的参数，否则编译器会报错。
//对象表达式内的代码可以访问创建这个对象的代码范围内的变量，与Java不同的是,被访问的变量不需要被限制为final变量。

//val a = 10
//
//val listener = object : Info("submit"),IClickListener {
//    override fun doClick() {
//        println("a:$a")
//    }
//
//}

//listener.doClick() // 打印 a:10
//“只需要对象”, 而不需要继承任何有价值的基类, 可以简单写：

val adHoc = object {
    var x: Int = 0
    var y: Int = 0
}

//print(adHoc.x + adHoc.y)

//当关键字object之后指定了一个名称, 那么它就不再是“对象表达式”，
// 而是一个对“对象声明”。此时，此对象不再是表达式，看作类的变种更为合适吧，
// 不能再将其赋值给一个变量。在使用它时，只需要它的名字引用即可。

//object MyInfo: Info("submit"),IClickListener {
//
//    override fun doClick() {
//        println("MyInfo do click, $text") // Log: MyInfo do click, , submit
//    }
//}

//fun main(args: Array<String>) {
//
//    MyInfo.doClick()
//}

