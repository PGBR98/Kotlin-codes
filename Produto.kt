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
                println("\n--- Atualizar um produto ---")
                println("Digite 1 para atualizar o primeiro produto da lista, 2 para o segundo e 3 para o terceiro: ")
                when (readln()) {
                    "1" -> {
                        println("\n--- Atualizar o produto 1 ---")
                        println("Digite o nome do produto, seu preço e a nova quantidade em estoque respectivamente: ")
                        produtos.set(0, (Produto(readln(), readln(), readln())))
                    }
                    "2" -> {
                        println("\n--- Atualizar o produto 2 ---")
                        println("Digite o nome do produto, seu preço e a nova quantidade em estoque respectivamente: ")
                        produtos.set(1, (Produto(readln(), readln(), readln())))
                    }
                    "3" -> {
                        println("\n--- Atualizar o produto 3 ---")
                        println("Digite o nome do produto, seu preço e a nova quantidade em estoque respectivamente: ")
                        produtos.set(2, (Produto(readln(), readln(), readln())))
                    }
                    else -> {
                        println("Opção inválida. Tente novamente.")
                    }
                }
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
