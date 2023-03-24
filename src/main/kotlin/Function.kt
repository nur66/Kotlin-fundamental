// Params lastName null
fun sayHello(firstName: String, lastName: String?){
    if(lastName == null) {
        println("$firstName")
    } else {
        println("$firstName $firstName")
    }
}

// default Argument
fun sayHi(firstName: String, lastName: String? = null){
    if(lastName == null) println("$firstName")
    else println("$firstName $lastName")
}

// Function Named Argument
fun fullName(
    firstName: String,
    middleName: String?,
    lastName: String
){
    if(middleName == null) println("$firstName $lastName")
    else println("$firstName $middleName $lastName")
}

// unit returning value
// function ada 2 jenis, mengembalikan nilai dan tidak mengembalikan nilai
// function di atas tidak mengembalikan nilai, dia mengembalikan nilai Unit, artinya dia tidak mengembalikan apapun
// Penulisan Unit tidak wajib, tetapi jika kita menulis tipe data maka secara otomatis dia adalah Unit
// contoh fun yang tidak mengembalikan Unit seharusnya seperti dibawah, hanya saja penulisannya tidak wajib
//fun myName(firstName: String, lastName: String) : Unit {
//
//}

// Function return type
fun sumAll(a: Int, b: Int, c: Int = 0) : Int {
    var total = 0
    if(c != 0)total = a + b + c
    else total = a + b
    return total
}

// Single Expression Function
// deklarasi function hanya dengan 1 baris code
fun kaliDua(a: Int) : Int = a * 2
fun sapa(name: String) : Unit = println("Hello $name")

fun main(){
    sayHello("Nur", null)
    sayHello("Lisa", "Mufia")
    sayHi("Uwais")
    fullName("Nur", null, "Iswanto")
    val result1 = sumAll(1, 2)
    println(result1)
    val result2 = sumAll(1, 2, 3)
    println(result2)
    println(kaliDua(2)) // jika mengembalikan nilai maka perlu di println
    sapa("Nur")
}