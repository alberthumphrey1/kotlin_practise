fun main(args: Array<String>) {
    var marks = 75
    var result = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }
    println(result)

    var bettingNumber = 2
    var bettingResult = when(bettingNumber){
        1->{
            "Oops!! You've lost"
        }
        2->{
            "Congrats!! You won"
        }
        3->{
            "Oops!! You've lost"
        }else->{
            "Please enter a number from 1 - 3 to bet"
        }
    }
    println(bettingResult)
}