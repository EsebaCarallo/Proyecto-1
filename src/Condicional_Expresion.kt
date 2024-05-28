fun main(){
    /*
    println("Ingrese primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")

     */

    /*
    println("Ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 ==0){
        println("Cuadrado:")
        valor * valor
    }else{
        println("Cubo:")
        valor * valor * valor
    }
    println(resultado)

     */

    println("Ingrese numero entre 1-99:")
    val num: Int = readln().toInt()
    val cant = if (num >= 10) println("$num tiene 2 digitos") else println("$num tiene 1 digito")



}




