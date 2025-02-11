//Exercicios de fixação
import kotlin.random.Random
fun main(args: Array<String>) {
//Exercicio 1
    var numero = 0
    for (i in 1 .. 10) {
        numero = Random.nextInt(0, 51)
        if (numero % 2 == 0)
            println("$numero é par")
        else
            println("$numero é impar")
    }
//Exercicio 2
    var numDado = Random.nextInt(0,7)
    println(numDado)
}