package oop.app

import oop.data.User

fun main(){

    val user1 = User("nurland", "rahasia123")
    val user2 = User("lisamufmuf", "rahasiadeh")

    println("User1 : " + user1.username)
    println("User1 : " + user1.password)
    println()
    println("User2 : " + user2.username)
    println("User2 : " + user2.password)

}
