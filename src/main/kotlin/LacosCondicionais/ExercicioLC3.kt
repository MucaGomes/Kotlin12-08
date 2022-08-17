fun main() {

        println()
        println("==================")
        println("|   BEM VINDO    |")
        println("==================")

        print("Digite sua idade: ")
        val idade = readln().toInt()

        if (idade >=1 && idade <=14) {
            println("Sua categoria é: Infantil :)")
        } else if(idade < 1) {
            print("Idade Abaixo do limite permitido :(")
        } else if (idade in 15..17) {
            println("Sua categoria é: Juvenil :) ")
        } else if (idade in 18..25) {
            println("Sua categoria é: Adulto :) ")
        } else {
            print("Idade Limite Atingido")
        }
}