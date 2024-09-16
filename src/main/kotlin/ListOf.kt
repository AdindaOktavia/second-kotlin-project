fun main(args: Array<String>) {
    // List of numbers as strings
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}") // Akses elemen ketiga
    println("Fourth element: ${numbers[3]}") // Akses elemen keempat
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    // List of people with objects of Person class
    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 21), bob)

    // Compare the lists
    println(people == people2)

    // Modify the age of 'bob'
    bob.age = 32

    // Compare the lists again
    println(people == people2)
}

// Class Person definition
class Person(var name: String, var age: Int)
