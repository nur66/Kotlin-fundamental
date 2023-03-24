fun main() {
    // Lambda adalah function yang tidak memiliki nama

    // (String, String) adalah parameter function Lambda
    // -> String adalah return value harus dengan tipe data String
    // = { firstName....  memang kita harus mendeklarasikan ulang nama paramnya
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        // tidak perlu pakai return karena secara otomatis memang sudah return value
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Nur", "Iswanto")
    println(result)

    val lambdaByMySelf : (Int, Int, Int) -> Int = { integerA : Int, integerB : Int, integerC : Int ->
        integerA + integerB + integerC
    }

    println(lambdaByMySelf(1,2,3))
}