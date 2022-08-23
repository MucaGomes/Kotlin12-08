fun main() {


    var Excesso: Int = 0
    var Multa: Int = 0


    println("Digite o peso dos Tomates: ")
    var P: Int = readln().toInt()

    Excesso = P - 50

    if (Excesso > 0) {

        Multa = 4 * Excesso

        println("O valor da multa a se pagar é: R$" + Multa + " pois passou " + Excesso + " quilos De excesso")

    } else {

        Multa = 0
        Excesso = 0

        println("O valor da multa é: R$" + Multa + " pois teve " + Excesso + " quilos de excesso!!!")
    }
}