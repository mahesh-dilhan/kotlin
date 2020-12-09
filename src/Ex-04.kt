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
    println(items.maxBy { it })

    val books : MutableCollection<Book> =
        mutableListOf(Book(1900,"Davinci Code"),Book(2000,"Beach"),Book(2003,"Shadows of early grey"))
    println(books.maxBy { it.publish })
    println(books.minBy { it.publish })

}
data class Book(val publish:Int, val name:String)

