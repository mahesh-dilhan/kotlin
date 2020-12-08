class PrintValue{
    fun printme(s: String) {
        println(s)
    }

}
class NestedOuter {
    class Inner {
        fun printme(s:String){
            println(s)
        }

    }
}
fun main() {
    val printValue= PrintValue()
    printValue.printme("this is the str")
    val nestedOuter= NestedOuter.Inner().printme("this is nested str")
}