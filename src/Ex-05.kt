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

class NestedInner {
    inner class Inner{
        fun printme(s:String) {
            println(s);
        }

    }
}
fun main() {
    val printValue= PrintValue()
    printValue.printme("this is the str")
    val nestedOuter= NestedOuter.Inner().printme("this is nested str")
    val nestedInner= NestedInner().Inner().printme("this is nested inner str")

}