import java.util.Scanner
import kotlin.math.pow

fun main() {
    val area: Double
    val pi = 3.14
    val leia = Scanner(System.`in`)

    println("Escreva o valor do raio: ")
    val raio = leia.next().toDouble()

    area = pi * (raio + 2.0).pow(raio)

    print("O valor da area é $area")
}