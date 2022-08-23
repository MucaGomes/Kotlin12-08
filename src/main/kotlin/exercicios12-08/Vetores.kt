fun main() {

    val num = IntArray(5)

    for (i in 0 until 5 step 1) {

        println("Digite um valor: ")
        num[i] = readln().toInt()
    }

    for (i in 0 until 5 step 1) {
        print("|" + num[i])
    }
}