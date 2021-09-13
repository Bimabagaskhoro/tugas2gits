package tugas9

fun main() {

    val outer = Data()
    println(outer.Inner().callMe())
    println("---------")
    val inner = Data().Inner()
    println("Npm: ${inner.callNpmInner()}")
    println("Nama: ${inner.callNameInner()}")
    println("---------")
}