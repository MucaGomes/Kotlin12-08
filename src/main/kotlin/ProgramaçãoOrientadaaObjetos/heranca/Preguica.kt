package programaçãoorientadaaobjetos.heranca

class Preguica(
    nome: String,
    idade: Int,
    var cor: String): Animal(nome, idade) {

    override fun emitirSom() {
        print("Aaaaa Aaa aaaa")
    }

    fun subirEmArvore() {
        println("subindo em arvore.")
    }
}