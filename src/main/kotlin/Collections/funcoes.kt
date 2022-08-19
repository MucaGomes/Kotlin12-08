package Collections
var estoque = mutableListOf<String>()

fun addProduto (){
    print("Digite o nome do produto para adicionar á lista: ")
    val nome = readln()
    if (nome != "") {
        estoque.add(nome)
    }else {
        print("Nome Inválido")
    }
}

fun removeProduto (){
    print("Digite o nome do produto para remover da lista: ")
    val nome = readln()
    if (estoque.contains(nome)) {
        estoque.remove(nome)
        println("Produto $nome Removido com Sucesso")
    }else {
        print("Produto Inexistente")
    }
}

fun updateProduto() {
    print("Digite um produto para atualizar na lista: ")
    val nome = readln()

    if (estoque.contains(nome)) {
        val posicao = estoque.indexOf(nome)
        print("Digite o novo produto para atualizar na lista: ")
        estoque[posicao] = readln()

    }
}

fun exibir (){

    println("Lista de produtos: $estoque")

}