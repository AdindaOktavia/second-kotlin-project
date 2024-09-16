fun main(args: Array<String>) {
    returnLoop()
}

fun returnLoop(){
    var x:Int
    println("Example of return in for-loop")
    for (x in 1..10){
        if (x < 5){
            println("${x - 1}")
        }else{
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")
}