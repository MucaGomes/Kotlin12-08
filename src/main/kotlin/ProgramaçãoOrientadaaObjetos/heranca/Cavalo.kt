package programaçãoorientadaaobjetos.heranca

class Cavalo(
    nome: String,
    idade: Int,
    var cor: String): Animal(nome, idade){

     override fun emitirSom() {
        print("Inha rara")
     }

    override fun correr() {
        print("galopando")
    }
}
