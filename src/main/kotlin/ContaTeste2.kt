class ContaTeste2 {
    var titular: String
    var numero: Int

    var saldo = 0.0
        private set

    init {
        println("Criou ContaTeste2!")
    }

    constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}