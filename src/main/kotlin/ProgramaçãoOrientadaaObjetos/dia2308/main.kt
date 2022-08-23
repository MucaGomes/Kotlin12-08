package programaçãoorientadaaobjetos.dia2308

/*
    1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.


 */


fun main() {


    try {
    print("Digite seu nome [A-Z]: ")
    val nomeCliente = readln()
    print("Digite seu endereço: ")
    val enderecoCliente = readln()
    print("Digite seu telefone [0-9]: ")
    val telefoneCliente = readln()


        val cliente1 = Cliente(nomeCliente, enderecoCliente, telefoneCliente)


        while (true) {
            println()
            println()
            println(
                "Nome: " + cliente1.nome + "\n" +
                "Endereço: " + cliente1.endereco + "\n" +
                "Telefone: " + cliente1.telefone + "\n"
            )
            println("=========================")
            println("    Lista de Compras     ")
            println("=========================")
            println("| 1 - Adicionar Produto |")
            println("| 2 - Remover Produto   |")
            println("| 3 - Exibir Produtos   |")
            println("| 4 - Sair              |")
            println("=========================")
            println()

            print("Opção: ")

            when (readln().toInt()) {
                1 -> {
                    print("Digite o nome do produto para adicionar á lista: ")
                    val produto = readln()
                    cliente1.addProduto(produto)
                }

                2 -> {
                    print("Digite o nome do produto para remover da lista: ")
                    val produto = readln()
                    cliente1.removerProduto(produto)
                }

                3 -> {
                    cliente1.exibirProdutos()
                }

                4 -> break
            }
        }
    }catch (e : Exception) {
        print(e)
    }
}