package oop

fun main(args: Array<String>) {
    var firstAdmin = Admin("King", 900000.00, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)

    firstAdmin.setIdNumber("134567")
    println(firstAdmin.getIdNumber())
}
//abstract class
//It does not allow one to create objects out of this class
class Admin {

    var name:String
    var salary:Double
    var email:String
    private var phoneNumber:String = ""
    private var idNumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }
    fun registerUser(){
        println("Yeah, I can register a user")
    }
    fun suspendEmployee(){
        println("Yeah, I can suspend the employee")
    }

    fun setPhoneNumber(phonNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun getPhoneNumber():String{
        return this.phoneNumber
    }

    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getIdNumber():String{
        return this.idNumber
    }
}