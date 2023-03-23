fun main() {

    // When
    val nilai : String = "A"
    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try again next year")
        }
    }

    // When multi option
    when(nilai){
        "A", "B", "C" -> {
            println("Congratulation, you are pass the examp")
        } else -> {
            println("Try Again next year")
        }
    }

    // When expression In
    val nilaiLulus : Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("You are graduation")
        !in nilaiLulus -> println("Try again next year")
    }


    // When expression Is
    val name : String = "Nur"
    when (name) {
        is String -> println("Name is string")
        !is String -> println("Name is not string")
    }

    // When pengganti if else
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good")
        nilaiUjian > 70 -> println("Not bad")
        else -> println("Bad")
    }
}