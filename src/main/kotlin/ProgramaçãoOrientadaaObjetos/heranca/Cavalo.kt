package programaçãoorientadaaobjetos.heranca

class Cavalo(
    nome: String,
    idade: Int,
    var cor: String): Animal(nome, idade){

     override fun emitirSom(): String {
        return "Cavalo: Hiin in in"
     }

    override fun correr(): String {
        return "Correndo como um cavalo Hiin in in!!!! "
    }
}
