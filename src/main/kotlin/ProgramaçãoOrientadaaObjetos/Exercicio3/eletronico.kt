package ProgramaçãoOrientadaaObjetos.Exercicio3

class eletronico(var cor: String , var marca: String, var teclado: Boolean, var mouse: Boolean) {

    fun exibir () {
        print("A cor do computador é $cor , a marca é $marca, tem teclado?: $teclado e tem mouse? $mouse")
    }
}