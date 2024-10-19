package C_FaceToObject.H_ObjectExp

/*
 伴随对象的调用不用创建包含伴随对象的实例，调用方式有两种，
 一种是类名.伴随对象.XX，另外一种方式是类名.xx

 伴生对象所在的类被加载，伴生对象被初始化，与Java静态成员一样。
 */
class Books(var name: String, val page: Int) {
    companion object ComBooks{
        val a : Int = 10
        fun doNote() {
            println("do note")
        }
    }
}
fun main(args: Array<String>) {
    Books.ComBooks.doNote()
    println("Book.a = ${Books.ComBooks.a}")
    println("-------------")
    Books.doNote()

}

// Log
//do note
//Book.a = 10
//-------------
//do note