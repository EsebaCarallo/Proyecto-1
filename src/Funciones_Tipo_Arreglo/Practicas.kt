package Funciones_Tipo_Arreglo
/*
fun main() {

    print("Ingrese la cantidad de elementos del arreglo: ")
    val n = readLine()?.toIntOrNull() ?: return
    val array = crearYcargarArreglo(n)
    val suma = sumarElementos(array)
    println("La suma de los elementos del arreglo es: $suma")
}


fun crearYcargarArreglo(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        print("Ingrese el elemento $i: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }
    return array
}

fun sumarElementos(array: IntArray): Int {
    var suma = 0
    for (elemento in array) {
        suma += elemento
    }
    return suma
}

 */

fun main() {

    print("Ingrese la cantidad de elementos del arreglo: ")
    val n = readLine()?.toIntOrNull() ?: return

    val array = IntArray(n)
    for (i in 0 until n) {
        print("Ingrese el elemento en la posición $i: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }


    val menorElemento = array.minOrNull() ?: return
    val frecuencia = array.count { it == menorElemento }
    println("El menor elemento es: $menorElemento")
    if (frecuencia > 1) {
        println("El menor elemento se repite $frecuencia veces en el arreglo.")
    } else {
        println("El menor elemento no se repite en el arreglo.")
    }

}
