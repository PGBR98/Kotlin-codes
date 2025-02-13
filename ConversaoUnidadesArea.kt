class ConversaoUnidadesArea{
    fun MetroParaPes(medida: Double): Double{
        return medida*10.76
    }
    fun PesParaCentimetro(medida: Double): Double{
        return medida*929
    }
    fun MilhasParaAcres(medida: Double): Double{
        return medida*640
    }
    fun AcresParaPes(medida: Double): Double{
        return medida*43.560
    }
}
fun main(args: Array<String>) {
    var converter = ConversaoUnidadesArea()
    var medida: Double = 0.0
    while (true) {
        println("\n--- Menu ---")
        println("1. Para converter de metros para pés")
        println("2. Para converter de pés para centimetros")
        println("3. Para converter de milhas para acres")
        println("4. Para converter de acres para pés")
        println("5. Para sair")
        print("Escolha uma opção: ")

        when (readln()) {
            "1" -> {
                print("Entre com a medida em metros: ")
                medida = readln().toDouble()
                println(converter.MetroParaPes(medida))
            }
            "2" -> {
                print("Entre com a medida em pés: ")
                medida = readln().toDouble()
                println(converter.MetroParaPes(medida))
            }
            "3" -> {
                print("Entre com a medida em milhas: ")
                medida = readln().toDouble()
                println(converter.MetroParaPes(medida))
            }
            "4" -> {
                print("Entre com a medida em acres: ")
                medida = readln().toDouble()
                println(converter.MetroParaPes(medida))
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