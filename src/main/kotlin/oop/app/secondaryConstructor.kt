package oop.app

import oop.data.Address

// Alt + Enter untuk melihat class yang tersedia beserta param
// Ctrl + P untuk melihat param yang tersedia
fun main(){
    val address1 = Address("Jalan Imam Bonjol", "Jakarta")
    val address2 = Address("Jalan Ahmad Yani", "Batam", "Indonesia")

    println("Addres1 : " + address1.street)
    println("Addres1 : " +address1.city)

    println("Addres2 : " + address2.street)
    println("Addres2 : " + address2.city)
    println("Addres2 : " + address2.country)
}