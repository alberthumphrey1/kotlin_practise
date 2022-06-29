fun main(args: Array<String>) {

    //While loop
    var countOne = 0
    while (countOne <= 5){
        println(countOne)
        countOne++
    }


    //Do while loop
    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while (countTwo <= 15)

    //Repeat loop
    repeat(10){
        println("Good Morning")
    }

    //For in loop
    var names = arrayOf("King", "Faith", "Shanky", "Linet", "Brian")
    names.sort()
    //names.sortDescending()
    for (jina in names){
        println(jina)
    }

    var ascendingNumbers = 0 .. 20
    for (nambari in ascendingNumbers){
        println(nambari)
    }

    var descendingNumbers = 20 downTo 0
    for (n in descendingNumbers){
        println(n)
    }
}