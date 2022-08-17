fun main () {

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    */

    var contPar : Int = 0
    var contImpar : Int = 0

    for(i in 1 .. 10) {
        print("Digite um numero: ")
        var N = readln().toInt()

        // Verifica se os numeros digitados serao par e conta eles , senão for é soma na variavel impar
        if (N % 2 == 0) {
            contPar++
        } else {
            contImpar ++
        }
    }
    println("$contPar Desses numeros são pares")
    println("$contImpar Desses numeros são ímpares")
}