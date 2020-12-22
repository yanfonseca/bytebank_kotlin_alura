//Projeto
//Criar uma conta digital
//Sacar, depositar, transferir dinheiro
//Criar funcionário


fun main() {
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111.111",
        salario = 1000.0,
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao()}")


    val fran = Gerente("fran", "2", 2000.0, 123)

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao()}")
    println("senha: ${fran.autentica(1234)}")

}



