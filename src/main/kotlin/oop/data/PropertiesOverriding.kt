package oop.data

open class PropertiesOverriding {
    open val corner : Int = -1
}

class childProrson : PropertiesOverriding() {
    override val corner : Int = 4
}