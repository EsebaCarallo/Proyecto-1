package Conceptos_Funciones
/*
fun cua(){
    print("Ingrese un número que desee elevar al cuadrado: ")
    val c1 = readln().toInt()
    val elev = c1 * c1
    println("La elevación al cuadrado de la cantidad que ingresaste es: $elev")
}

fun mult(){
    print("Ingrese el primer valor que desea multiplicar: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor que desea multiplicar: ")
    val valor2 = readln().toInt()
    val producto = valor1 * valor2
    println("El producto de los dos valores es de $producto")
}
fun main() {
    cua()
    mult()
}

 */

fun men(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    when{
        valor1 < valor2 && valor1 < valor3 -> println("El valor menor es: $valor1")
        valor2 < valor1 && valor2 < valor3 -> println("El valor menor es: $valor2")
        valor3 < valor1 && valor3 < valor2 -> println("El valor menor es: $valor3")
    }

}
fun main() {
    men()
    men()
}