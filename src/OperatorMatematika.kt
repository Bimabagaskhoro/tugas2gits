fun main(){
    val examValue1 = 90
    val examValue2 = 80
    val examValue3 = 90
    val examValue4 = 80
    val examValue5 = 90

    val result:Int = (examValue1 + examValue2 + examValue3 + examValue4 + examValue5) / 5

    when {
        result > 95 -> {
            println(result)
            println("A")
            println("Wow Nilai Rata-Rata Kamu Sangat Bagus")
        }
        result > 85 -> {
            println(result)
            println("B")
            println("Wow Nilai Rata-Rata Kamu Cukup Bagus")
        }
        result > 75 -> {
            println(result)
            println("C")
            println("Yah Nilainya Rata-Rata Pas Banget :(")
        }
        result > 65 -> {
            println(result)
            println("D")
            println("Yah Nilainya Dibawah Rata-Rata")
        }
        else -> {
            println(result)
            println("E")
            println("Kamu Ulang Lagi Tahun Depan Ya")
        }
    }
}