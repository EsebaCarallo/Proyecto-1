package Estructura_repetitiva_for

fun main(){

    var suma = 0

    for (index in 1..10) {
        println("Ingrese el valor de $index:")
        val valor = readln().toInt()
        suma += valor
    }
    println("La suma de los valores ingresados es $suma")
    val promedio = suma / 10
    println("Su promedio es $promedio")




}