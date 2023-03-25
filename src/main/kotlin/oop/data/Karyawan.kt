package oop.data

// Function overide
// Agar bisa membuat function yang sama kita bisa menggunakan keyword open pada function
open class Karyawan(val nameParam : String) {
    open fun sayHello(name : String){
        println("Hello $name, My name is ${this.nameParam}")
    }
}

// Ini Inheritance, menggunakan keyword open
open class Menejer(name : String) : Karyawan(name){
    final override fun sayHello(name : String){
        println("Hello $name, My name is ${this.nameParam}")
    }
}

// karena diberikan keyword final, maka sekarang tidak bisa override lagi
//open class SuperAdmin(name : String) : Menejer(name){
//    override fun sayHello(name : String){
//        println("Hello $name, My name is ${this.nameParam}")
//    }
//}