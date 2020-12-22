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