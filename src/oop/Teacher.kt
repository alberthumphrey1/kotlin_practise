package oop

fun main(args: Array<String>) {
    var firstStudent = Student("Faith", 20)
    firstStudent.viewResults()
    firstStudent.publishMagazine()

    var firstBoardmember = Boardmember("Linet", 25)
    firstBoardmember.publishMagazine()
}

//use open class for inheritance
open class Teacher(open var name:String, open var age:Int) {
    fun viewResults(){
        println("Hello $name, you can view results")
    }
    fun publishMagazine(){
        println("Hello $name, you are $age years and you can publish a magazine")
    }
}

open class Student(name: String, age: Int):Teacher(name,age){
    fun sitForExams(){
        println("Hello, I can it for exams")
    }
}

class Boardmember (name: String, age: Int):Student(name, age){

}