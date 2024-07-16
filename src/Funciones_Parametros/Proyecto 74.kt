package Funciones_Parametros

fun mostrarMensaje(mensaje: String){
    println("*******************************")
    println(mensaje)
    println("*******************************")
}
fun cargarSuma() {
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es de $suma")
}
fun main() {
    mostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado.")
    cargarSuma()
    mostrarMensaje("Gracias por utilizar este programa")
}