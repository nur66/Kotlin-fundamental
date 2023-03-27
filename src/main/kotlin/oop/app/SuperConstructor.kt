package oop.app

import oop.data.ExecutiveCustomer
import oop.data.PremiumCustomer

fun main(){
    val premium = PremiumCustomer("Nur")
    println(premium.name)

    val executive = ExecutiveCustomer("Nur", 172)
    println(executive.name)
    println(executive.balance)
}