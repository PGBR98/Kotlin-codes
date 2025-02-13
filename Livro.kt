class Livro {
    var titulo: String = ""
    var autor: String = ""
    var numPaginas: Int = 0
    constructor(titulo: String, autor: String, numPaginas: Int){
        this.titulo = titulo
        this.autor = autor
        this.numPaginas = numPaginas
    }
    override fun toString(): String {
        return super.toString()
    }
}