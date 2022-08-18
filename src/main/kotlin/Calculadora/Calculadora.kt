package Calculadora

fun main () {


    print("Digite um Numero: ")
    val n1 : Double = readln().toDouble()

    print("Digite outro numero: ")
    val n2 : Double = readln().toDouble()

    println("==============================")
    println("      Escolha o calculo       ")
    println("[+]Soma           [-]Subtraçao")
    println("[*]Multiplicação  [/]Divisão  ")
    println("================================")
    print("R: ")
    val resp = readln()

    if (resp == "+") {
        soma(n1,n2)
    } else if (resp == "-") {
        sub(n1,n2)
    } else if (resp == "*") {
        mult(n1,n2)
    } else if (resp == "/"){
        divisa(n1,n2)
    }
}