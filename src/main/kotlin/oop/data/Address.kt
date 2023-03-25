package oop.data

// Tanpa Primary Constructor
class Address {
    var street: String = ""
    var city: String = ""
    var country: String = ""

    constructor(paramStreet: String, paramCity: String){
        street = paramStreet
        city = paramCity
    }

    // Jika kita memanggil constructor lain
    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity){
        country = paramCountry
    }
}