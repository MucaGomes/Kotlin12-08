fun main() {

    var maior : Int? = null
    print("Digite o primeiro número: ")
    var n1 = readln().toInt()
    print("Digite o segundo número: ")
    var n2 = readln().toInt()
    print("Digite o terceio numero: ")
    var n3 = readln().toInt()

    if (n1 > n2 && n1 > n3 ) {
        maior = n1
    }else if (n2 > n1 && n2 > n3){
        maior = n2
    }else if (n3 > n2 && n3 > n1) {
        maior = n3
    }

    print("o maior numero digitado foi $maior")

}