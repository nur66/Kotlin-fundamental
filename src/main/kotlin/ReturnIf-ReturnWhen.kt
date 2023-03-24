fun sayHello2(fullName : String) : String {
    return if (fullName == ""){
        "Hello Gaes"
    } else {
        "Hello $fullName"
    }
}
fun sayHello3(fullName : String) : String {
    return when (fullName) {
        "" -> "Hello Gaes"
        else -> "Hello $fullName"
    }
}
fun main(){
    // return if
    println(sayHello2("Nur Iswanto"))

    // return when
    println(sayHello3("Lisa Mufia"))

}