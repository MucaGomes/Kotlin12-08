package programaçãoorientadaaobjetos.heranca

class Cachorro(
    nome: String,
    idade: Int,
    var cor: String,
) : Animal(nome, idade) {
    override fun emitirSom(): String {
        return "AuAu, morde!"
    }

    override fun correr(): String {
        return "Correndo como um cachorro , lingua pra fora e esbarrando em todos"
    }
}


