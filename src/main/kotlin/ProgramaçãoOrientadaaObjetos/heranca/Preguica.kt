package programaçãoorientadaaobjetos.heranca

class Preguica(
    nome: String,
    idade: Int,
    var cor: String): Animal(nome, idade) {

    override fun emitirSom(): String {
        return "Preguiça: Aaaaa, Aaa, Aaaaa"
    }

    override fun correr(): String {
        return "Rastejando como uma preguiça"
    }

    fun subirEmArvore(): String {
        return "Subindo na arvore como uma preguiça!!!"
    }
}