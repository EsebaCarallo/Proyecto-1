package Conceptos_Funciones

fun presentacion(){
    println("Programa que permite cargar dos veces por teclado.")
    println("Efectua la suma de los valores.")
    println("Muestra el resultado de la suma.")
    println("************************************************")
}

fun cargarsuma(){
    print("Ingrese primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor: ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es de: $suma")
}

fun finalizacion(){
    println("************************************************")
    println("Gracias por utilizar este programa!")
}
fun main() {
    presentacion()
    cargarsuma()
    finalizacion()
}