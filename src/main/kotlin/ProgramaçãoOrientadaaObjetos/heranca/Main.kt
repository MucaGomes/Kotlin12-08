package programaçãoorientadaaobjetos.heranca


fun main() {

  val dog1 = Cachorro("Jake", 2, "Amarelo")
  dog1.emitirSom()

  println()
  val horse1 = Cavalo("Pé de Pano",2,"Branco")
  horse1.emitirSom()

  println()
  val lazy = Preguica("Sid", 4,"Bege")
  lazy.emitirSom()
}
