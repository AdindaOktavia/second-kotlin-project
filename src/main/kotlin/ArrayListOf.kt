fun main(args: Array<String>) {
    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array : ")
    for (item in arrayList){
        print("$item")
    }
    print("\n")

    arrayList += 9

    print("Tambahkan elemen 9 dalam arrayList : ")
    println(arrayList)

    arrayList.reverse()
    print("Reverse last element in arrayList")
    print(arrayList)

    arrayList -= 1
    print("Remove last element in arrayList : ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}