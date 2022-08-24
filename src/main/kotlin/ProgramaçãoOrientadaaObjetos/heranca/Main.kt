package programaçãoorientadaaobjetos.heranca


fun main() {

  val dog1 = Cachorro("Jake", 2, "Amarelo")
  println(dog1.emitirSom())
  println(dog1.correr())

  println()
  val horse1 = Cavalo("Pé de Pano",2,"Branco")
  println(horse1.emitirSom())
  println(horse1.correr())

  println()
  val lazy = Preguica("Sid", 4,"Bege")
  println(lazy.subirEmArvore())
  println(lazy.emitirSom())
  println(lazy.correr())
}
