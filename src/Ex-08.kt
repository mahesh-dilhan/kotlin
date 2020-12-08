fun main() {
    val items = arrayListOf<String>("A","X","B","T","K")
    val sort= Sort()
    println(sort.sort(items))
    println(sort.reverse(items))
}
class Sort{
    fun sort(s: List<String>):List<String>{
        return s.sorted()
    }
}

fun Sort.reverse(a:List<String>):List<String> {
    return a.sorted().reversed()
}
