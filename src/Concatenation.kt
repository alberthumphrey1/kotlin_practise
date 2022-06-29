fun main(args: Array<String>) {
    var name = "King"
    var age = 100
    println("Hello $name, you are $age years old")
    println("Hello "+name+", you are "+age+" years old")

    //Calculate the SI of a loan borrowed
    var principal = 100000
    var rate = 5
    var time =2
    var interest = (principal*rate*time)/100.0
    println("Hello there, your interest is $interest ")
}