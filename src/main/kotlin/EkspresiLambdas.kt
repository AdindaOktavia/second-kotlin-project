fun main(args: Array<String>) {
    val mylambda :(String)->Unit = {s:String-> print(s) }
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)

    myFun(v,mylambda)
}

fun myFunction(x: String): String{
    var c: String = "Hey!! Wlecome to -----"
    return ((c+x))
}

fun myFun(a:String, action:(String)->Unit){
    print("\nHeyyy!!!")
    action(a)
}