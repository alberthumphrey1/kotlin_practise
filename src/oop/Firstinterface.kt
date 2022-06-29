package oop

fun main(args: Array<String>) {
    var firtSchool = School()
    firtSchool.motto()
    print (firtSchool.login())
}

interface Firstinterface {
    var age:Int
    fun login():String
    fun motto(){
        println("Hello, this is our motto")
    }
}

class School():Firstinterface{
    override var age:Int = 100
    override fun login():String{
        val loginStatement = "Yeah, I an login"
        return loginStatement
    }
}