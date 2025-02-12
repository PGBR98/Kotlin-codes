class Produto {
    var nome: String = ""
    var preco: String = ""
    var qtdEstoque: String = ""
    constructor(nome: String, preco: String, qtdEstoque: String){
        this.nome = nome
        this.preco = preco
        this.qtdEstoque = qtdEstoque
    }
    override fun toString(): String {
        return "\nNome do produto: $nome, preço do produto: $preco, Quantidade em estoque: $qtdEstoque"
    }
}
fun main(){
    val produtos = mutableListOf(
        Produto("Notebook", "3500", "10"),
        Produto("Smartphone", "1500", "20"),
        Produto("Tablet", "1200", "15")
    )
    while (true) {
        println("\n--- Menu ---")
        println("1. Exibir informações dos produtos")
        println("2. Atualizar os dados de um produto")
        println("3. Sair")
        print("Escolha uma opção: ")

        when (readln()) {
            "1" -> {
                println("\n--- Informações dos Produtos ---")
                println(produtos)
            }
            "2" -> {
                println("\n--- Adicionar novo produto ---")
                println("Digite o nome do produto, seu preço e a nova quantidade em estoque respectivamente: ")
                produtos.add(Produto(readln(), readln(), readln()))
            }
            "3" -> {
                println("Programa encerrado")
                return
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}
