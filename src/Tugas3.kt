fun main(){

    var i = 2
    while (true) {
        println("Berhenti di Kambing $i")
        i++

        if (i < 5){
            break
        }
    }
    for (i in 1..10){
        if (i % 2 == 0){
            continue
        }
        println("Kambing $i")
    }
}