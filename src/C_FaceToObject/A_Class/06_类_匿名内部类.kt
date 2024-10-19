package C_FaceToObject.A_Class

interface OnClickListener {
    fun onClick();
}
interface OnLongClickListener{
    fun onLongClick();
}
class Button {
    fun setOnclickListener(listener: OnClickListener): Unit {

    }
    fun setOnLongClickLinstener(listener: OnLongClickListener){

    }
}

fun main(args: Array<String>) {
    var btn = Button();
    btn.setOnclickListener(object : OnClickListener {
        override fun onClick() {
            println("按钮被点击了")
        }
    })

    btn.setOnLongClickLinstener(object :OnLongClickListener{
        override fun onLongClick() {
            println("按钮被长按了")
        }

    })
}