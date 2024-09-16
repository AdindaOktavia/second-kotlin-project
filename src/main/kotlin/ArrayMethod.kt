import javax.swing.text.Position

fun main(args: Array<String>) {
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }

    print('\n')

    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted){
        print(simpson + ' ')
    }
    print('\n')

    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("Yeah, that's my number ${position + 1} Simpson!")
    }else{
        println("Hey that's not Simpson!")
    }

    val  simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.min())
    println("Max = "+ simpsonsE.max())
    println("First = "+ simpsonsE.first())
    println("Last = "+ simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}