fun main(args: Array<String>) {
    if (15 > 15)
        println("True")
    println("The program continues her...")

    val a:Int = 5
    val b:Int = 5
    var max: Int

    if (a > b) {
        max = a
    }else {
        max = b
    }
    println("Maximum of a or b is " + max)

    var myVar: Int = 0
    if (myVar == 0){
        myVar = 1
    }else if (myVar == 1){
        myVar = 0
    }else{
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)

    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("The number you entered is greater than 5!")
    println("Thanks for the input!")
}