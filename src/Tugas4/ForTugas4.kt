package Tugas4

fun main(){
    val arrList = arrayListOf("Mangga", "Jeruk", "Apel", "Semangka")
    try {
        for (i in arrList) {
            arrList.forEach { _ -> println(arrList) }
        }
    } catch (error: ValidationException) {
        println("Error ${error.message}")
    }
}