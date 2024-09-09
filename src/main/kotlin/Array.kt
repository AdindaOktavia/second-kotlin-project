fun main(args: Array<String>) {
    // Array kosong dan menambahkan elemen 34
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])  // Output: 34

    // Membuat array lain dan menambahkan elemen dari 1 sampai 10
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    // Mencetak elemen di arrB
    for (i in arrB) {
        print("$i ")
    }
}