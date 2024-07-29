package Arreglos

fun main() {
    val arreglo=IntArray(5)
    for (i in arreglo.indices){
        print("Ingrese elemento: ")
        arreglo[i]= readln().toInt()
    }
    println("Primer componente del arreglo ${arreglo[0]}")
    println("Ultimo componente del " +
    "arreglo ${arreglo[arreglo.lastIndex]}")
}