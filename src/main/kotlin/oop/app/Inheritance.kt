package oop.app

import oop.data.Manager
import oop.data.VicePresident

fun main(){
    val manager = Manager("Nur")
    manager.sayHelloEmployee("Lisa")

    println()

    val vicePresident = VicePresident("Uwais")
    vicePresident.sayHelloEmployee("Umar")
}