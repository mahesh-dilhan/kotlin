val greet: String by lazy {
    "Hello Layzy loading ...."
}
fun main(){
   println(greet +"world")
    val d = Square()
    println(DerivedShape(d).area(10,10))
}

interface Shape{
    fun area(a:Int, b:Int):Int
}

class Square: Shape{
    override fun area(a:Int, b:Int):Int {
        return a*b
    }
}
class DerivedShape (d: Shape): Shape by d