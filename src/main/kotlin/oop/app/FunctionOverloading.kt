package oop.app

import oop.data.Person
import sayHello

fun main(){
    val nur = Person()
    nur.firstName = "Nur"

    nur.sayHello("Lisa")
    nur.sayHello("Nur", "Iswanto")
}