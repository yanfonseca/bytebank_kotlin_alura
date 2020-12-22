class Conta(
    val titular: String,
    val numero: Int = 1000000
) {
    var saldo = 0.0
        private set


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


//// As variáveis criadas dentro de uma classe são chamadas properties
//// Os atributos informados dentro de Conta(...) são obrigatórios para criar o objeto
//class Conta(
//    val titular: String, // val declara properiedade imutável
//    val numero: Int = 1000000  // É possível atribuir um valor padrão
//) {
//    var saldo = 0.0 // var possibilita a alteração da variável
//        private set // propriedade privada, somente dentro da classe pode ser alterada diretamente
//
//
//    //Outra forma para tornar os atributos obrigatórios para criação de objeto
////    constructor(titular: String, numero: Int){
////        this.titular = titular
////        this.numero = numero
////    }
//
//    //Para executar algo durante durante a construção do objeto
////    init {
////        //funçao
////    }
//
//    //Outra maneira para alterar o set e get
////    var saldo = 0.0
////        set(valor){ //properties
////            println("field $field")
////            if (valor > 0){
////            field = valor
////            }
////        }
////        get(){
////            return field
////        }
//
//    fun deposita(valor: Double) {
//        if (valor > 0) {
//            this.saldo += valor
//        }
//    }
//
//    fun saca(valor: Double) {
//        if (saldo >= valor) {
//            saldo -= valor
//        }
//    }
//
//    fun transfere(valor: Double, destino: Conta): Boolean {   // Métodos e funções retornam Unit por padrão
//        if (saldo >= valor) {
//            saldo -= valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }
//
//    //Deve-se evitar criar métodos get e set no Kotlin, para isso é possível usar o private set, por exemplo
////    fun getSaldo(): Double{
////        return this.saldo
////    }
//
////    fun setSaldo(valor: Double){
////        when {
////                valor > 0 -> saldo = valor
////        }
////    }
//}