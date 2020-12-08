fun main() {
    val numbers : MutableCollection<Int> = mutableListOf(1,2,3,4,5)
    for (a in numbers)
        println(a)
    val addmore : MutableCollection<Int> = mutableListOf(10,11,12)
    numbers.addAll(addmore)

    for (a in numbers)
        println(a)

    val items = listOf(1,2,3,4)
    println(items.filter{it % 2==0})

}

