package tugas7

class Biodata(nama: String, npm: String ,  universitas: String, fakultas: String,umur: Int){
    val nama = nama
    val npm = npm
    val universitas = universitas
    val fakultas = fakultas
    val umur = umur

    fun tampilkan(): String{
        val hasil = "--- Biodata ---\nNama: " + nama +
                "\nNpm: " + npm +
                "\nUniversitas: " + universitas +
                "\nJurusan: " + fakultas +
                "\nUmur: " + umur +
                "\n--- Studi Independet Gits Android Kotlin"
        return hasil
    }
}

fun main() {
    val bima = Biodata(
        "Bima Bagaskhoro",
        "201810225230",
        "Universitas Bhayangkara Jakara Raya",
        "Fakulta Ilmu Komputer",
        22,
    )
    val hasil = bima.tampilkan()
    println(hasil)
}