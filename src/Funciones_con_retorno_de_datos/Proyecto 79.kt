package Funciones_con_retorno_de_datos

fun retornarSuperficie(lado: Int): Int{
    val sup = lado * lado
    return sup
}

fun main() {
    print("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es $superficie")
}