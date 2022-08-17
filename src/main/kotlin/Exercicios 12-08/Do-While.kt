fun main() {

    var i = 1
    var soma = 0

    print("Digite um numero de 0 a 9: ")
    var valor: Int = readln().toInt()

    do {
        soma = soma + i
        i++
    } while (i <= valor)

    print(soma)
}




