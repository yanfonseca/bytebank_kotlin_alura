fun getSaldo2(saldo: Double) {

    when {
        saldo > 0.0 -> {
            println("Saldo positivo")
        }
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    }
}