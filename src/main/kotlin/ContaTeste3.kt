class ContaTeste3 {
    var titular: String
    var numero: Int
    var saldo = 0.0
        set(valor){
            println("field $field")
            if (valor > 0){
            field = valor
            }
        }
        // Esse já é o padrão
        get(){
            return field
        }

    init {
        println("Criou ContaTeste3!")
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

    fun transfere(valor: Double, destino: Conta): Boolean {   // Métodos e funções retornam Unit por padrão
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}