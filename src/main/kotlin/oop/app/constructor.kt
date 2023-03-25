package oop.app

import oop.data.Car

fun main(){
    // otomatis ini memanggil secondary constructor 2
    val avanza = Car("Toyota")

    // otomatis ini memanggil secondary constructor 1
    val innova = Car("Toyota", "Innova")

    println(avanza.brand)
    println(avanza.year)
    println(innova.brand)
    println(innova.year)
}
