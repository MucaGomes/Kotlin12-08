fun main() {

    var estacoes = listOf<String>("Verão", "Outono", "Inverno", "Primavera")

    println("================================")
    println("|       BEM VINDO AO           |")
    println("|  PROGRAMA ESTAÇÕES DO ANO    |")
    println("================================")
    println("| [1] Verão      [2] Outono    |")
    println("| [3] Inverno    [4] Primavera |")
    println("================================")

    print("Olá , digite qual estação do ano quer saber mais [1 a 4]: ")
    val estacao = readln().toInt()

    when (estacao) {

        1 -> print(estacoes[0]+" De 21 de dezembro a 21 de março.")
        2 -> print(estacoes[1]+" De 21 de março a 21 de junho.")
        3 -> print(estacoes[2]+" De 21 de junho a 23 de setembro.")
        4 -> print(estacoes[3]+" De 23 de setembro a 21 de dezembro.")
        else -> {
            print("Estação digitada Inválida :( ♫ ")
        }
    }

}