fun main() {

    // Break diginakan untuk menghentikan seluruh pengulangan
    // Contiue menghentikan pengulangan yang berjalan / jeda. dan melanjutkan ke perulangan berikutnya

    var i = 0

    while (true) {
        println("Hello ke $i")
        i++

        if(i > 100){
            break
        }
    }

    println("continue")
    for(i in 1..100){
        if(i % 2 == 0){
            continue
        }
        println(i)
    }

}