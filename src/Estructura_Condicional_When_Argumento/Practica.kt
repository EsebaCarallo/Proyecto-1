package Estructura_Condicional_When_Argumento

fun main() {
    var h0 = 0
    var h1 = 0
    var h2 = 0
    var hmas = 0

    for (i in 1..10){
        println("Ingrese la cantidad de hijos: ")
        val valor = readln().toInt()
        when(valor){
            0 -> h0++
            1 -> h1++
            2 -> h2++
            else -> hmas++
        }
    }
    println("La cantidad de familias con 0 hijos es de: $h0")
    println("La cantidad de familias con 1 hijo es de: $h1")
    println("La cantidad de familias con 2 hijos es de: $h2")
    println("La cantidad de familias con 3 o más hijos es de: $hmas")
}