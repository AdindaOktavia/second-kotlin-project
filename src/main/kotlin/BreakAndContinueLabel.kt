//break dan continue label pada perulangan for-loop
fun main(args: Array<String>) {
    println("Example of Break and Continue label")
    mylabel@ for (x in 1..10){
        if(x == 5){
            println("I am inside if block withe value"+x+"\n-- hence it will close the operator")
            break@mylabel
        }else{
            println("I am inside else block with value"+x)
            continue@mylabel
        }
        println("Not Print")

    }
}