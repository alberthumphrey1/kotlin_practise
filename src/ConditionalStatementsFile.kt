fun main(args: Array<String>) {
    var age = 18
    if (age < 18){
        println("Go Home")
        }else{
        println("Welcome to the Party")
    }

    //Grading System
    var marks = 30
    if(marks < 40){
        println("E")
    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else{
        println("A")
    }

    //Betting System
    var bettingNumber = 3
    when(bettingNumber){
        1->{
            println("Oooops!! You've lost")
        }
        2->{
            println("Oooops You've lost")
        }
        3->{
            println("Congrats!! You've won")
        }
        4->{
            println("Ooops You've lost")
        }
        else->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}