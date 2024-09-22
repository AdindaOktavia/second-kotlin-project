// Penerapan For-Loop dalam Tabel Perkalian
fun main(args: Array<String>) {
    println("Simple multiplication table using loops:")

    for (i in 1..10) {
        print("$i\t")  // Tambahkan tab untuk keteraturan
    }
    println()

    for (i in 1..10) {
        print("${i * 2}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 4}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 5}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 6}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 7}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 8}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 9}\t")
    }
    println()

    for (i in 1..10) {
        print("${i * 10}\t")
    }

    println("\n\nHere's a simple multiplication table using nested loops:")

    // Tabel perkalian menggunakan nested loop
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")  // Gunakan tab untuk keteraturan
        }
        println()  // Pindah ke baris baru setelah setiap baris selesai
    }
}
