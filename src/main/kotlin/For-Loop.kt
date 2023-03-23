fun main(){

    // For pada Array
    val names : Array<String> = arrayOf("Nur", "Iswanto", "Lisa", "Mufia", "Uwais")
//    val names = arrayOf("Nur", "Iswanto") // bisa juga seperti ini

    var total = 1
    for (name in names) {
        println(name)
        total += 1
    }

    println("Total perulangan $total")


    // For pada Range, bilangan ganjil
    for (i in 1..100 step 2) {
        println(i)
    }

    // For untuk Array dan Range
    val ukuranArray = names.size - 1
    for(i in 0..ukuranArray){
        println("Index $i = ${names.get(i)}")
    }

}