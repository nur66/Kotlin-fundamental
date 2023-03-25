package oop.data

// Didalam Car() adalah constructor, lebih tepatnya primary contructor
class Car(paramBrand: String, paramName: String, paramYear: Int){

    // initializer block, secara otomatis dijalankan ketika class dipanggil
    init {
        println("Car $paramBrand created")
    }

    // secondary constructor
    // wajib memanggil primary constructor menggunakan keyword this, this ini merepresentasikan primary costructor
    // karena kita tidak butuh paramYear maka kita dapat mengisiya secara default
    // kita juga bisa menambahkan body, misalnya kita cetak constructor 1
    constructor(paramBrand: String, paramName: String): this(paramBrand, paramName, 2020){
        println("Secondary constructor 1")
    }

    // Kalau mau buat multiple constructor, jumlah paramnya harus berbeda
    constructor(paramBrand: String): this(paramBrand, ""){
        println("Secondary constructor 2")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}