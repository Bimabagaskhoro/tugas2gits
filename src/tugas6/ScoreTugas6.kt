package tugas6

import tugas4.ValidationException

fun main (){
    val score1 = Score()
    score1.score = 9.9
    println("Score Dhani Adalah : ${score1.score}")

    val score2 = Score()
    score2.score = 9.2
    println("Score Ahmad Adalah : ${score2.score}")
}

class Score {
    var score: Double = 0.0
    get() = field
    set(value) {
        try {
            field = if (value < 9.5)
                9.0
            else (if (value > 9.5)
                10.0
            else
                value)
        } catch (error: ValidationException) {
            println("Error ${error.message}")
        }
    }
}
