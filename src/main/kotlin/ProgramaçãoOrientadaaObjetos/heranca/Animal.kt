package programaçãoorientadaaobjetos.heranca

abstract class Animal(
    var nome: String,
    var idade: Int
    ){

    open fun emitirSom(): String {
        return ""
    }

    open fun correr(): String {
        return ""
    }

}