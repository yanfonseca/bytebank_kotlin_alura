class ContaTeste4 {
    var titular: String
    var numero: Int
    var saldo = 0.0

    init {
        println("Criou ContaTeste4!")
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

//    Deve-se evitar criar métodos get e set no Kotlin, para isso é possível usar o private set, por exemplo
    @JvmName("getSaldo3")
    fun getSaldo(): Double{
        return this.saldo
    }

    @JvmName("setSaldo1")
    fun setSaldo(valor: Double){
        when {
                valor > 0 -> saldo = valor
        }
    }
}