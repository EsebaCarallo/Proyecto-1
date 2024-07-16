package Estructura_Condicional_When_Argumento

fun main() {
    print("Digite un valor positivo entre 1-99999: ")
    val valor = readln().toInt()
when(valor){
    in 1..9 -> println("Tiene un dígito")
    in 10..99 -> println("Tiene dos dígitos")
    in 100..999 -> println("Tiene tres dígitos")
    in 1000..9999 -> println("Tiene cuatro dígitos")
    in 10000..99999 -> println("Tiene cinco dígitos")
    else -> println("No se encuentra comprendido" +
            " en el rango indicado")

}








}