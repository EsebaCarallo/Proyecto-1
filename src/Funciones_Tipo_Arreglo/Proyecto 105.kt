package Funciones_Tipo_Arreglo

fun cargar(arreglo: IntArray){
    for (i in arreglo.indices) {
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
}

fun imp(arreglo: IntArray){
    for (i in arreglo)
        println(i)
}

fun main() {
    val arre = IntArray(5)
    cargar(arre)
    imp(arre)
}