package oop.app

// biasanya digunakan untuk kontrak

import oop.data.Human

fun main(){
    val human = Human("Nur Iswanto Interface")

    println(human.name)
    human.sayHello("Nur Iswanto")
    human.sayHi("Lisa")
    human.go()  // Multiple inheritanse in go
}