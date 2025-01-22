class User(val username:String, val password:String){
    init {
        require(password.length >= 8){"password must be at least 8 char long"}
        println("user $username has been created")
    }

}

fun main(){
    print("masukan username>> ")
    val username = readln().toString()
    print("masukan password>> ")
    val password = readln().toString()

    var user1 = User(username, password)
}