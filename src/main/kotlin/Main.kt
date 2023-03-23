const val APPLICATION = "Belajar_Kotlin"
const val VERSION = "0.0.1"

fun main(args: Array<String>) {
    // variabel
    var userName : String = "Nur"
    userName = "Lisa"
    var address : String = """
        Street Not yet Done,
        Province Kepulauan Riau,
        City Batam
    """.trimIndent().trimMargin(">")
    println(address)




    // Integer
    var maxIntegerValue : Int = Int.MAX_VALUE
    var minIntegerVaule : Int = Int.MIN_VALUE

    println("Maximal value is $maxIntegerValue!")
    println("Minimal value is $minIntegerVaule")



    // String template
    var firstName : String = "Nur"
    var lastName : String = "Iswanto"
    var fullName : String = firstName + " " + lastName
    var desc : String = "Fullname $fullName, char = ${fullName.length}"
    println(desc)


    // Variable, Mutable(bisa di edit menggunakan var) dan immutable(tidak bisa diedit, menggunakan val)
    // Variable constant adalah immutable yang dapat diakses untuk keperluan global, biasanya menggunakan Upper case
    println("$APPLICATION : $VERSION")
}