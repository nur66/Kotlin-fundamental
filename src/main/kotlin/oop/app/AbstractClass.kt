package oop.app

import oop.data.City
import oop.data.Country
import oop.data.Location

fun main(){
    // abstract class artinya class tersebut tidak bisa dijadikan object, hanya bisa diturunkan
//    val city = Location()  // otomatis dia akan error
    val city = City("Batam")
    println(city.name)
    println()
    val country = Country("Indonesia")
    println(country.name)
}