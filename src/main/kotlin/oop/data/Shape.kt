package oop.data

open class Shape {
    open val corner = -1
}

class Triangle : Shape() {
    override val corner = 4
    val parentCorner : Int = super.corner
}