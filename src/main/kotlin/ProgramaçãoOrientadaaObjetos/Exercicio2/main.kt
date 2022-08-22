package ProgramaçãoOrientadaaObjetos.Exercicio2

fun main() {

    val cliente1 = Cliente(
        "Marcos",
        "11/10/2002",
        1.80,
        "Itaú",
        "Poupança",
        true,
        1500.0
    )

    println(cliente1.nome + "\n" +
            cliente1.nascimento+ "\n" +
            cliente1.altura+ "\n" +
            cliente1.banco+ "\n" +
            cliente1.tipoDeConta+ "\n"+
            cliente1.limite+ "\n" +
            cliente1.saldoLimite+ "\n"

            )
}