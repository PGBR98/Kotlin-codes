class Pessoa {
    var name: String = ""
    var idade: Int = 0
    var profissao: String = ""

    constructor(name: String, idade: Int, profissao: String){
        this.name = name
        this.idade = idade
        this.profissao = profissao
    }
}
fun main() {
    var pessoa = Pessoa("Paulo", 18, "Programmer")
    println("Nome: ${pessoa.name}\nIdade: ${pessoa.idade}\nProfissão: ${pessoa.profissao}")
}