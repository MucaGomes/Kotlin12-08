fun main() {

    println("Digite um numero: ")
    val n1 = readln().toInt()
    println("Digite outro numero: ")
    val n2 = readln().toInt()
    println("Digite mais um numero: ")
    val n3 = readln().toInt()

    if(n1 < n2 && n1 < n3 && n2 < n3){
        println("A sequencia é: $n1  $n2  $n3")
    } else if (n1 < n3 && n1 < n2 && n2 > n1 ) {
        println("A sequencia é: $n1  $n3  $n2")
    } else if (n2 < n1 && n2 < n3 && n3 > n1) {
        println("A sequencia é: $n2  $n1  $n3")
    } else if (n3 < n2 && n3 < n1 && n2 < n1) {
        println("A sequencia é: $n3  $n2  $n1")
    } else if (n3 < n1 && n3 < n2 && n1 < n2) {
        println("A sequencia é: $n3  $n1  $n2")
    } else if (n2 < n3 && n2 < n1) {
        println("A sequencia é: $n2  $n3  $n1")
    }

}