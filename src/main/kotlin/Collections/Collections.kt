package Collections

fun main() {

    while (true) {
        println("=========================")
        println("| 1 - Adicionar Produto |")
        println("| 2 - Remover Produto   |")
        println("| 3 - Atualizar Produto |")
        println("| 4 - Exibir Produtos   |")
        println("| 5 - Sair              |")
        println("=========================")
        println()

        print("Opção: ")

        when (readln().toInt()) {
            1 -> addProduto()
            2 -> removeProduto()
            3 -> updateProduto()
            4 -> exibir()
            5 -> break
            else -> print("Opcao Invalida!!")
        }
    }
}