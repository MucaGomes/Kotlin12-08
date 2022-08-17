import java.time.LocalDate
/*
 Faça um sistema que leia a idade de uma pessoa expressa em anos,
 meses e dias e mostre-a expressa apenas em dias.
*/
fun main() {
    print("Digite a sua Idade em anos: ")
    val idade = readln().toInt()
    print("Digite quantos meses tem desde o seu ultimo aniversário [1-12]: ")
    val mesNiver = readln().toInt()
    print("Digite quantos dias: ")
    val diaAniversario = readln().toInt()

    var dia : Double = idade * 365.0
    var meses : Int = mesNiver * 30
    var diaNiver: Double = dia + meses + diaAniversario
    print("Você tem $diaNiver dias vividos")

}