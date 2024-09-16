fun main() {
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackward = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackward}")

    println(numbers.first() == numbersBackward.first())
    println(numbers.first() == numbersBackward.first())

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set value are"+strings)
}