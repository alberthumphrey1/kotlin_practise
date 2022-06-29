package oop

fun main(args: Array<String>) {
    var firstUser = User("King", "king@gmail.com", "123", "123")

    firstUser.register()
    firstUser.login()

    var secondUser = User("emobilis", "emobilis@gmail.com", "12345", "12345")

    secondUser.login()


}

class User {
    //Theses are the user properties
    var name:String
    var email:String
    var password:String
    var confirmpassword:String


//This is a constructor
    constructor(name: String,email:String,password:String,confirmpassword:String){
        this.name = name
        this.email = email
        this.password = password
        this.confirmpassword = confirmpassword
    }

    //These are the functionalities
    fun register(){
        if (!password.equals(confirmpassword)){
            println("Passwords don't match")
        }else{
            println("User registered successfully")
        }
    }

    fun login(){
        if (email.equals("emobilis@gmail.com")&&password.equals("12345")){
            println("Login successful")
        }else{
            println("Login failed")
        }
    }
}