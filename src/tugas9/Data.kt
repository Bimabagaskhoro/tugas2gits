package tugas9

class Data {
    class Nested {
        val a = "Studi Independent Android Kotlin"
        val b = "PT GITS"
        fun callName() = "Bima Bagaskhoro"
        fun callNpm() = "201810225230"
    }

    val c = "Studi Independent Android Kotlin"
    val e = "Bima Bagaskhoro"
    val f = "201810225230"
    inner class Inner {
        fun callMe() = c
        fun callNameInner() = e
        fun callNpmInner() = f
    }
}