package oop.app

import oop.data.User

fun main(){
    val user = User("Nur66", "rahasia1")

    // karena di dalam class nya sudah kita override maka kita tidak perlu lagi buat $userNameParam
    println(user)
}