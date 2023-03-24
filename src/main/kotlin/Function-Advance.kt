// Function Extension
// Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
// untuk mengakses datanya di extension function kita bisa menggunakan keyword this
fun String.hello() : String = "Hello $this"
fun String.printHello() : Unit = println("Hello $this")

fun main(){
    // function extension
    val name = "Nur"
    println(name.hello())

    "Nur Iswanto".printHello()


}

