fun main() {
    var soma = 0

    do {

        print("Digite um numero: ")
        val num = readln().toInt()
        soma += num

    }while(num != 0)

    print("A soma de todos os numeros digitados resulta em: $soma")
}