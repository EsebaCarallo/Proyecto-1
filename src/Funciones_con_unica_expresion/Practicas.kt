package Funciones_con_unica_expresion
/*
fun promedio(val1: Int, val2: Int, val3: Int) = (val1+val2+val3)/3
fun main(){
    print("Ingrese el primer numero: ")
    val numero = readln().toInt()
    print("Ingrese un segundo numero: ")
    val numeroo = readln().toInt()
    print("Ingrese un tercer numero: ")
    val numerooo = readln().toInt()
    println("El promedio de estos numeros es:" +
            "${promedio(numero, numeroo, numerooo)}")
}
/*

fun perimetro(lado: Int) = lado*4
fun main(){
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readln().toInt()
    print("El perimetro del cuadrado es: " +
            "${perimetro(lado)}")
}

 */




fun retornarSuperficie(lado1: Int,lado2: Int) = lado1*lado2
fun main() {
    print("Escriba el primer lado del primer rectangulo:")
    val la1 = readln().toInt()
    print("Escriba el segundo lado del primer rectangulo:")
    val la2 = readln().toInt()
    print("Escriba el primer lado del segundo rectangulo:")
    val la3 = readln().toInt()
    print("Escriba el segundo lado del segundo rectangulo:")
    val la4 = readln().toInt()
    if (retornarSuperficie(la1, la2) == (retornarSuperficie(la3, la4)))
        print("Las dos superficies de los 2 rectangulos son iguales")
    else
        if (retornarSuperficie(la1, la2) > (retornarSuperficie(la3, la4)))
            print("El primer rectangulo tiene una superficie mayor, su superficie es ${retornarSuperficie(la1, la2)}")
        else
            print("El segundo rectangulo tiene una superficie mayor, su superficie es ${retornarSuperficie(la3, la4)}")
}

 */

fun largo(nombre: String) = nombre.length

fun main() {
    print("Ingrese un nombre:")
    val nombre1 = readln()
    print("Ingrese otro nombre:")
    val nombre2 = readln()
    if (largo(nombre1) == largo(nombre2))
        print("Los nombres: $nombre1 y $nombre2 tienen la misma cantidad de caracteres")
    else
        if (largo(nombre1) > largo(nombre2))
            print("$nombre1 es mas largo")
        else
            print("$nombre2 es mas largo")
}