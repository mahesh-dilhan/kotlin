interface Repository{
    var reslimit: Int
    fun getAll():MutableCollection<String>

    fun log(s:String){
        println("log -- $s")
    }
}
interface PagingRepository: Repository{
    fun getPage(s:Int, e:Int):List<String>
}

class PersonRepoImple: PagingRepository {
    val items = arrayListOf("A","B","C","E","F")
    override var reslimit: Int=25
    override fun getAll(): MutableCollection<String> {
        return items
    }

    override fun getPage(s: Int, e: Int): List<String> {
        return items.subList(s,e)
    }

}

fun main() {
    var person = PersonRepoImple()
    println(person.getAll())
    println(person.getPage(2,5))
}