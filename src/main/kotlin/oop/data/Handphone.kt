package oop.data

class Handphone(phoneName: String, phoneMerk: String) {
    init {
        println("Welcome to class handphone")
    }

    constructor(phoneName: String) : this(phoneName, ""){
        println("Name $phoneName")
    }

    var name = phoneName
    var merk = phoneMerk

}