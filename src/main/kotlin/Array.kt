fun main() {
    // Array

    val names : Array<String> = arrayOf("Nur", "Lisa", "Uwais")
    names.set(0,"Iswanto")
    println(names[0])

    // Array Nullable
    val members : Array<String?> = arrayOfNulls(5)
    members[0] = "Nur"
    members[1] = "Iswanto"
    members[2] = "Lisa"
    members[3] = "Mufia"
    members[4] = "Uwais"
    println(members.size)
}