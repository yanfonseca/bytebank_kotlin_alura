class ContaTeste1(
    val titular: String, // val declara properiedade imutável
    val numero: Int = 1000000
) {
    var saldo = 0.0 // var possibilita a alteração da variável
        private set // Só pode ser alterada dentro da classe

    init {
        println("Criou ContaTeste1!")
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