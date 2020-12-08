open class Person{
    open fun age(a:Int){
        println("this is the age $a")
    }
}
class Child: Person(){

}

class God:Person(){
    override fun age(a:Int){
        println("this is God $a")
    }
}
fun main(){
    val a = Child()
    a.age(4)

    val b = God()
    b.age(10000)
}