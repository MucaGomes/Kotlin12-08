package programaçãoorientadaaobjetos.heranca

class Cachorro(
    nome: String,
    idade: Int,
    var cor: String,
) : Animal(nome, idade) {
    override fun emitirSom() {
        print("Auau")
    }

    override fun correr() {
        print("Correndo como um dog")
    }
}


