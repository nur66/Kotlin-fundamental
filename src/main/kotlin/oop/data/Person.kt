package oop.data

class Person {
    var firstName : String = ""
    var middleName : String? = null
    var lastName : String = ""

    fun sayHello(name: String){
        println("Hello $name, My name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("Hello $firstNameParam $lastNameParam, My name is $firstName")
    }

    fun getFullName() : String {
        return "$firstName, $middleName $lastName"
    }
}