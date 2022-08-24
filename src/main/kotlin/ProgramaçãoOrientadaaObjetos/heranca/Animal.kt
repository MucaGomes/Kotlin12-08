package programaçãoorientadaaobjetos.heranca

abstract class Animal(
    var nome: String,
    var idade: Int
    ){

    open fun emitirSom() {
        print("som")
    }

    open fun correr() {
        print("correr")
    }

}