package oop.data

// inheritance
open class Employee(val nameParam : String) {
    fun sayHelloEmployee(name : String){
        println("Hello $name, My name is ${this.nameParam}")
    }
}

// dia extend dari Employee dan harus punya constructor
class Manager(name : String) : Employee(name)

// dia extend dari Employee dan harus punya constructor
class VicePresident(name : String) : Employee(name)