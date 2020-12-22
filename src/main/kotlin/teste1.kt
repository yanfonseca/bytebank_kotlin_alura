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