class Biblioteca {
    val livros = mutableListOf(
        Livro("Livro A", "Paulo",30),
        Livro("Livro B", "Pedro",40),
        Livro("Livro C", "Samuel",50),
        )
    val livrosEmprestados = mutableListOf(Livro("Livro D", "João",20))
    fun adicionarLivro(){
        println("Digite respectivamente o titulo, autor e numero de Paginas do livro que deseja armazenar: ")
        livros.add(Livro(readln(), readln(), readln().toInt()))
    }
    fun emprestarLivro(){
        println("Selecione o livro que quer pegar emprestado digitando por 0 ao ultimo: ")
        println(livros)
        var selecionado = readln().toInt()
        livrosEmprestados.add(livros.get(selecionado))
        livros.remove(livros.get(selecionado))
    }
    fun devolverLivro(){
        println("Selecione o livro que quer devolver digitando por 0 ao ultimo: ")
        println(livrosEmprestados)
        var selecionado = readln().toInt()
        livros.add(livrosEmprestados.get(selecionado))
        livrosEmprestados.remove(livrosEmprestados.get(selecionado))
    }
    fun verificarDisponivel(){
        println("Livros disponiveis: ")
        println(livros)
    }

    override fun toString(): String {
        return livros
    }
}
fun main(){
    var biblioteca = Biblioteca()
    while (true) {
        println("\n--- Menu ---")
        println("1. Para adicionar um livro")
        println("2. Para pegar um livro emprestado")
        println("3. Para devolver um livro")
        println("4. Para ver quais estão disponiveis")
        println("5. Para sair")
        print("Escolha uma opção: ")

        when (readln()) {
            "1" -> {
                biblioteca.adicionarLivro()
            }
            "2" -> {
                biblioteca.emprestarLivro()
            }
            "3" -> {
                biblioteca.devolverLivro()
            }
            "4" -> {
                biblioteca.verificarDisponivel()
            }
            "5" -> {
                println("Programa encerrado")
                return
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}