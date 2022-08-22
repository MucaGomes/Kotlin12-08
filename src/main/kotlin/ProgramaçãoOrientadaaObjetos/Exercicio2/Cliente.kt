package ProgramaçãoOrientadaaObjetos.Exercicio2

class Cliente (var nome : String, var nascimento : String, var altura : Double, var banco : String, var tipoDeConta : String){

    var limite = false
    var saldoLimite = 0.0

    constructor(
        nome :String,
        nascimento :String,
        altura: Double,
        banco : String,
        tipoDeConta: String,
        limite: Boolean,
        saldoLimite: Double
    ): this(nome,nascimento, altura, banco, tipoDeConta){
        this.limite = limite
        this.saldoLimite = saldoLimite
    }
}
