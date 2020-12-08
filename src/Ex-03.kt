fun main() {
    val numbers :IntArray = intArrayOf(1,2,3,4,5,6)
    println(numbers)

    println(numbers[2])
    println(numbers[0])
    //println(numbers[6])//exception

    for( j in numbers)
        println(j)
}