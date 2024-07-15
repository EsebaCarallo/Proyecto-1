package Estructura_Condicional_When

fun main() {

    print("Ingrese primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3)/3

    when{
        promedio >= 7 -> println("Promocionado")
        promedio >= 4 -> println("Regular")
        else -> println("Libre")
    }






}