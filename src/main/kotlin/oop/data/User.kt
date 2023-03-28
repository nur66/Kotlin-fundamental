package oop.data

class User(usernameParam: String, passwordParam: String) {
    var username : String = usernameParam
    var password : String = passwordParam

    // function toString ketika memanggil println juga bisa kita ovveride
    override fun toString(): String {
        return "User with username = $username"
    }
}