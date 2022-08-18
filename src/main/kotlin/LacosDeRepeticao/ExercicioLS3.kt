fun main () {

    var cont20 : Int = 0
    var cont50 : Int = 0

    while (true) {
        print("Digite uma idade: ")
        val idade = readln().toInt()

        if (idade in 1..21){
            cont20++
        }else if(idade >= 50) {
            cont50++
        }
        if (idade == -99) {
            break
        }
    }
    println("$cont20 pessoas tem idade menor ou igual a 20 anos")
    println("$cont50 pessoas tem idade maior ou igual a 50 anos")
}