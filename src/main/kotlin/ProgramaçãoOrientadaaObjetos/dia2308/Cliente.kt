package programaçãoorientadaaobjetos.dia2308

import java.lang.Exception

/* Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()). */

class Cliente(
    var nome: String,
    var endereco: String,
    var telefone: String
) {

    private var listaDeCompras = mutableListOf<String>()

    init {
        verificarString()
    }

    fun addProduto(produto: String) {
        listaDeCompras.add(produto)
    }

    fun removerProduto (produto : String) {
        listaDeCompras.remove(produto)
    }

    fun exibirProdutos() {
        listaDeCompras.forEach {
            println(it)
        }
    }

    private fun verificarString () {
        if (nome == " ") {
            throw Exception("Não é permitido caracteres especiais ou numeros , nem nome vazio.")
        }
    }
}