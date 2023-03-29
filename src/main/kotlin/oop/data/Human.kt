package oop.data

interface Interaction {
    val name : String
    fun sayHello(name: String)

    // bisa juga langsung buat seperti ini
    fun sayHi(name: String){
        println("Hi $name, my namme is ${this.name}")
    }
}

// Multiple inheritance in interface
interface Go {
    fun go(){
        println("Go!")
    }
}

class Human(override val name: String) : Interaction, Go {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}