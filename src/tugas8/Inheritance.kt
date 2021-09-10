package tugas8

open class Merk {
    open fun jenis(){

    }
}

class Samsung: Merk(){
    override fun jenis() {
        println("Samsung S10 Ultra\n" +
                "Harga Rp.12.000.000,00")
    }
}

class Apple: Merk(){
    override fun jenis() {
        println("Iphone XR\n" +
                "Harga Rp.15.000.000,00")
    }
}

fun main(){
    val samsung = Samsung()
    val apple = Apple()

    println("---Jenis Handphone yang tersedia---")
    samsung.jenis()
    println("-----------------------------------")
    apple.jenis()
}