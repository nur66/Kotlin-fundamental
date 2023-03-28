package oop.app

import oop.data.Handphone
import oop.data.Laptop

// Intinya kita bisa menerima parameter apapun dengan menggunakan any
// Dan dia smart casts dalam artian dia akan mengkonversi data secara otomatis dengan menggunakan is
fun printObject(any: Any){
    if(any is Handphone){
        println("Handphone with name ${any.name} and merk ${any.merk}")
    } else if (any is Laptop){
        println("Laptop with name ${any.name} and merk ${any.merk}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Handphone -> println("Handphone with name ${any.name} and merk ${any.merk}")
        is Laptop -> println("Laptop with name ${any.name} and merk ${any.merk}")
        else -> println(any)
    }
}

fun printString(any : Any){
    // dia memaksa wajib menggunakan string dengan menggunakan keyword as
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
//    val value = any as? String    // bisa keduanya
    val value : String? = any as? String
    println(value)
}

fun main(){

    // Check with if
    printObject(Handphone("Samsung","S10 PRO"))
    printObject(Laptop("Samsung","SyncMater SA300"))

    println()

    // Check with when
    printObjectWithWhen(Handphone("Oppo", "Joy 9A"))
    printObjectWithWhen(Laptop("ASUS", "Gold D gear"))

    println()

    // Unsave casts atau memaksakan tipe data
    printString("Nur")
    //    printObjectString(1) // dia akan error.

    println()

    // safe nullable casts
    printStringSafe(1)
    // karena yang diharapkan adalah string, maka ketika integer yang di pass dia akan null


    // is digunakann untuk melakukan pengecekan apakah sebuah data merupokan tipe data tertentu
    // untuk melakuakn konversi kita bisa menlakukan nya dengan ini

}