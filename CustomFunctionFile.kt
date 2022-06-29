fun main(args: Array<String>) {
motto()
userVerification(username = "King Wanyama", email = "king@gmail.com")

average(23.0, 50, 65.0f)

println(addition(300, 300.0))
login("King")
login("King@gmail.com","king123")
}
fun motto(){
    println("Hello, this is our motto")
}

fun userVerification(username:String, email:String){
    println("Your username is $username and your email is $email")
}
fun average (x:Double, y:Int, z:Float) {
    var result = (x + y + z)/ 3.0
    println("Hello, your average is $result")

}

fun addition(x:Int, y:Double):Double{
    var answer = x + y
    return answer
}

fun login(name:String){
    println("Hello, yuour name is $name")
}
fun login(email:String, password:String){
    println("Hello, yuour email is $email and your password is $password")
}