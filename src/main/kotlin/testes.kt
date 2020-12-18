//Projeto
//Criar uma conta digital
//Sacar, depositar, transferir dinheiro


fun main() {
    criaConta1() // Paradigma de OO
    criaConta2() // Paradigma procedural
}

fun criaConta1(){
    println("Bem vindo ao Bytebank")
    val contaYan = Conta(titular="Yan", numero = 1)
    val contaAlice = Conta("Alice")

    contaYan.deposita(200.0)
    contaAlice.deposita(200.0)

    println("####")
    println(contaYan.titular)
    println(contaYan.numero)
    println(contaYan.saldo)
    println("####")
    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)
    println("####")

    contaYan.transfere(10.00, contaAlice)

    println("####")
    println(contaYan.titular)
    println(contaYan.numero)
    println(contaYan.saldo)
    println("####")
    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)
    println("####")

    contaYan.saca(10.00)

    println("####")
    println(contaYan.titular)
    println(contaYan.numero)
    println(contaYan.saldo)
    println("####")
    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)
    println("####")

}

// As variáveis criadas dentro de uma classe são chamadas properties
// Os atributos informados dentro de Conta(...) são obrigatórios para criar o objeto
class Conta(
    val titular: String, // val declara properiedade imutável
    val numero: Int = 1000000  // É possível atribuir um valor padrão
) {
    var saldo = 0.0 // var possibilita a alteração da variável
        private set // propriedade privada, somente dentro da classe pode ser alterada diretamente


    //Outra forma para tornar os atributos obrigatórios para criação de objeto
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    //Para executar algo durante durante a construção do objeto
//    init {
//        //funçao
//    }

    //Outra maneira para alterar o set e get
//    var saldo = 0.0
//        set(valor){ //properties
//            println("field $field")
//            if (valor > 0){
//            field = valor
//            }
//        }
//        get(){
//            return field
//        }

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

    //Deve-se evitar criar métodos get e set no Kotlin, para isso é possível usar o private set, por exemplo
//    fun getSaldo(): Double{
//        return this.saldo
//    }

//    fun setSaldo(valor: Double){
//        when {
//                valor > 0 -> saldo = valor
//        }
//    }
}


fun criaConta2() {

    val titular: String = "Yan"
    val numeroConta: Int = 2222
    var saldo: Double = 0.0
    saldo = 100 + 0.0
    saldo += 400
    saldo -= 501

    println("Titular: $titular")
    println("Número: $numeroConta")
    println("Saldo: $saldo")

    getSaldo1(saldo)
    getSaldo2(saldo)

    teste1()
    teste2()
    teste3()
    teste4()
}


fun getSaldo1(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo zerado")
    } else {
        println("Saldo negativo")
    }
}


fun getSaldo2(saldo: Double) {

    when {
        saldo > 0.0 -> {
            println("Saldo positivo")
        }
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    }
}


fun teste1() {
    for (i in 1..3) {
        val titular: String = "Yan $i"
        val numeroConta: Int = 2222 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular") // Alternativa println("Titular: " + titular)
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun teste2(){
    for (i in 10 downTo 1 step 2) {

        if (i == 6) {
            continue   // Também existe o break
        }

        println(i)
    }
}


fun teste3() {
    var i = 0
    while (i != 21) {
        println("while $i")
        i++
    }
}


fun teste4() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}
