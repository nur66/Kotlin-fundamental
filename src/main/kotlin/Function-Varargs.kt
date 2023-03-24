// Function varagrs parameter
// parameter yang terakhir memiliki kemampuan dijadikan sebuah varargs
// varags sama seperti array, bedanya kita tidak perlu membuat array terlebih dahulu sebelum mengirimkan ke function
// contoh jika tidak menggunakan varags
fun hitungTotal(values: Array<Int>) : Int {
    var total = 0
    for(value in values){
        total += value
    }
    return total
}

fun sumTotal(vararg nilai : Int) : Int {
    var total = 0
    for(n in nilai){
        total += n
    }

    return total
}

fun main(){

    // contoh jika tidak menggunakan varags
    val nilai = arrayOf(10, 10, 10, 10, 10)
    val result = hitungTotal(nilai)
    println(result)

    // contoh mengguankan varags
    val result2 = sumTotal(10, 10, 10, 10, 10, 50)
    println(result2)
}