package Estructura_Condicional_When

fun main() {

    //1.
    /*
    print("Ingrese un número entero:")
    val num = readln().toInt()
    when{
        num > 0 -> println("Es positivo")
        num < 0 -> println("Es negativo")
        else -> println("Nulo")
    }

     */

    //2.
    /*
    var mayor = 0

    for (i in 1..5){
        println("Ingrese el primer valor:")
        val num1 = readln().toInt()
        println("Ingrese el segundo valor:")
        val num2 = readln().toInt()
        println("Ingrese el tercer valor:")
        val num3 = readln().toInt()
        mayor += when {
            num1 > num2 && num1 > num3 -> num1
            num2 > num1 && num2 > num3 -> num2
            else -> num3
        }
    }
        println("El valor acumulado de los numeros mayores es de: $mayor")

     */
    //3.
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0

    print("Ingrese la cantidad de triangulos que desea ingresar con ls datos de sus lados:")
    val n = readln().toInt()
    for (i in 1..n) {
        println("Ingrese la medida del primer lado:")
        val l1 = readln().toInt()
        println("Ingrese la medida del segundo lado:")
        val l2 = readln().toInt()
        println("Ingrese la medida del tercer lado:")
        val l3 = readln().toInt()
        when {
            l1 == l2 && l1 == l3 -> {
                println("El tipo de triángulo es equilátero")
                equilatero++
            }

            l1 == l2 || l1 == l3 || l2 == l3 -> {
                println("El tipo de triángulo es isósceles")
                isosceles++
            }

            else -> {
                println("El tipo de triágulo es escaleno")
                escaleno++
            }
        }
    }
println("La cantidad de triángulos equiláteros son: $equilatero")
println("La cantidad de triángulos isósceles son: $isosceles")
println("La cantidad de triángulos escalenos son: $escaleno")









}