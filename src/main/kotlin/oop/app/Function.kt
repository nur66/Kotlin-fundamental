package oop.app

import oop.data.Person

fun main(){
    val nur = Person()
    nur.firstName = "Nur"
    nur.middleName = ""
    nur.lastName = "Iswanto"

    nur.sayHello("Nur")

    val fullName = nur.getFullName()
    println(fullName)
}