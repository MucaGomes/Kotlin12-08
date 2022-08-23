package collections.Matrizes

/*
    Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
    em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
    diagonal, ou seja, diagonal principal.
*/

fun main() {



    val linha1 = mutableListOf<Int>(0, 0, 0)
    val linha2 = mutableListOf<Int>(0, 0, 0)
    val linha3 = mutableListOf<Int>(0, 0, 0)


    println(linha1)
    println(linha2)
    println(linha3)


    for (i in 0..2) {
        print("Digite o $i º para preencher a tabela 3x3: ")
        linha1[i] = readln().toInt()
    }

    println(linha1)

    for (i in 0..2) {
        print("Digite o $i º para preencher a tabela 3x3: ")
        linha2[i] = readln().toInt()
    }

    println(linha1)
    println(linha2)

    for (i in 0..2) {
        print("Digite o $i º para preencher a tabela 3x3: ")
        linha3[i] = readln().toInt()
    }

    println(linha1)
    println(linha2)
    println(linha3)

    println("A soma dos valores de todos os numeros digitados é: ${
        linha1[0] + linha1[1] + linha1[2] +
        linha2[0] + linha2[1] + linha2[2] +
        linha3[0] + linha3[1] + linha3[2]
    } ")

    println("E a soma da diagonal principal que são os valores: ")

    linha1[1] = 0
    linha1[2] = 0
    linha2[0] = 0
    linha2[2] = 0
    linha3[0] = 0
    linha3[1] = 0


    println(linha1)
    println(linha2)
    println(linha3)

    println("${linha1[0]}"+ " + " + "${linha2[1]}" + " + " + "${linha3[2]} : ${linha1[0] + linha2[1] + linha3[2]}")

}