package tugas4

fun main() {
    val arrList = arrayListOf("Kotlin", "Python", "JavaScript")
    var i = 0
    try {
        while (i < arrList.size){
            arrList.forEach { _ -> println(arrList) }
            i++
        }

    } catch (error: ValidationException){
        println("Error ${error.message}")
    }
}