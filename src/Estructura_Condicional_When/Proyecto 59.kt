package Estructura_Condicional_When

fun main() {

    print("Ingrese coordenada x del punto:")
    val x = readln().toInt()
    print("Ingrese coordenada Y del punto:")
    val y = readln().toInt()

    when{
        x > 0 && y > 0 -> println("Primer cuadrante")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }



}