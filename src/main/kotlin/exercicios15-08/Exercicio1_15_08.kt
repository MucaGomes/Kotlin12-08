import java.time.LocalDate

fun main() {
    // 1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    print("Bem vindo, Digite sua idade: ")
    val idade = readln().toInt()

    val mesAtual = LocalDate.now().monthValue

    print("Digite o mês em que você nasceu [1-12]: ")
    val mesNasc = readln().toInt()

    if (mesNasc >= mesAtual && mesNasc <= mesAtual) {
        print("Você nasceu no ano de ${2022 - idade}")
    } else {
        print("Você nasceu no ano de ${2022 - idade - 1}")
    }
}