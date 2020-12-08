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

class PrintConstruct(val consstr: String){

}
fun main() {
    val printValue= PrintValue()
    printValue.printme("this is the str")
    val nestedOuter= NestedOuter.Inner().printme("this is nested str")
    val nestedInner= NestedInner().Inner().printme("this is nested inner str")
    val printConstruct=PrintConstruct(" constructor")
    println("this is : ${printConstruct.consstr}")
}