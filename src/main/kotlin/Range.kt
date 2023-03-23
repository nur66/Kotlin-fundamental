fun main() {

    val range1 = 0..100
    println("range1 : $range1.count()")
    println(range1.contains(200))
    println(range1.contains(50))
    println(range1.first)
    println(range1.last)

    // downTo = decrement
    // step = melewatkan step 1

    val range = 100 downTo 0 step 1
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}