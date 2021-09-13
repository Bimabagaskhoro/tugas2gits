package tugas9

fun main(){
    Data()
    println(Data.Nested().a)
    println(Data.Nested().b)
    println("---------")
    val nested = Data.Nested()
    println(nested.callName())
    println(nested.callNpm())
    println("---------")
}