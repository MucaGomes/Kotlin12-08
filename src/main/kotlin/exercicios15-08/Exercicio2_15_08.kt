import java.text.DecimalFormat

fun main() {
    //2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule
    // a área e o perímetro dele

    /*
    A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²)
    O raio de um círculo é sempre igual à metade do comprimento de seu diâmetro (diâmetro / 2)
    Perímetro da circunferência (C = 2 * π * r)
    */

    print("Digite o diâmetro do circulo que será calculado: ")
    val diam = readln().toDouble()

    val raio = diam / 2
    val area = 3.14 * (raio * raio)
    val per =  (2 * 3.14) * raio

    print("A área da círculo é $area, e o perimetro é ${"%.2f".format(per)}")

}