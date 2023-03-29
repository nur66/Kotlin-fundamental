package oop.app

import oop.data.Television

fun main(){
    val tv = Television()
    tv.brand = "Samsung"    // kalau tidak di assign maka akan error
    println(tv.brand)

    tv.initTelevision("Toshiba")
    println(tv.brand)
}