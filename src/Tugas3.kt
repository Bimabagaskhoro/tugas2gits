fun main(){

    //variable i = 2
    var i = 2

    // menggunakan perintah while loops untuk melakukan perulangan yang flexible,
    // yang bertujuan untuk melakukan pengecekan kondisi
    while (true) {
        println("Berhenti di Kambing $i")
        i++

        // *menggunakan "if" untuk mencari nilai index
        // serta break steatment jika data sudah di temukan
        if (i < 5){
            break
        }
    }

    // menggunakan perintah for loops untuk melakukan perulangan
    for (i in 1..10){

        // *menggunakan "if" untuk mencari nilai ganjil dikarenakan rumusnya di bagi 2
        // dan berhenti di angka 10 dikarenakan data yang di perintahkan dari angka 1 sampai 10

        if (i % 2 == 0){
            continue
        }
        println("Kambing $i")
    }
}