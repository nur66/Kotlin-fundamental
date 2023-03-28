package oop.data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat: Animal(){
    // karena class nya abstract maka kita wajib dibuat ulang
    // properties
    override val name: String = "Tom Cat"

    // function
    override fun run() {
        println("This is ${this.name}")
    }
}