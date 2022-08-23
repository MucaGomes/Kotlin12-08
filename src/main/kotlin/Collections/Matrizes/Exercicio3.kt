package collections.Matrizes

fun main() {

    val n1 = mutableListOf<Int>(0,0)
    val n2 = mutableListOf<Int>(0,0)


    print("Digite o primeiro numero: ")
    n1[0]= readln().toInt()

    print("Digite o segundo numero para somar com o primeiro: ")
    n1[1] = readln().toInt()

    n2[0] = n1[0]
    n2[1] = n1[1]

    val M1 = mutableListOf<Int>(n1[0] + n2[1], n1[1] + n2[1])

    print("A soma dos dois numeros digitados são: ${M1[0]}")

    val M2 = mutableListOf<Int>(n1[0] - n1[1])
    print("A diferença entre ${n1[0]} e ${n1[1]} é: $M2")

  /*
    Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
    a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
    das matrizes N1 e N2;
    b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
    posição das matrizes N1 e N2.
   */

}