package oop.data

class Member {
    var namaDepan : String = ""
    var namaBelakang : String = ""
    fun sayHelloMember(firstName : String, lastName : String){
        println("Hallo $firstName, My name is ${this.namaDepan}")
    }
}