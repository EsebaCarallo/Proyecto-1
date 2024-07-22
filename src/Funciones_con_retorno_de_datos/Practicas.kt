package Funciones_con_retorno_de_datos
/*
fun retornarPromedio(v1: Int, v2: Int, v3: Int): Int {
    val promedio = (v1 + v2 + v3) / 3
    return promedio
}

fun main() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    println("El promedio de los tres números ingresados es ${retornarPromedio(valor1, valor2, valor3)}")
}
/*
fun retornarPerimetro(lado: Int): Int {
    val perimetro = lado * 4
    return perimetro
}


 */
fun main() {
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro es: ${retornarPerimetro(lado)}")
}

 */

fun retornarSuperficie(lado1: Int,lado2: Int): Int {
    return lado1 * lado2
}
fun main() {
    println("Primer rectangulo")
    print("Ingrese lado menor del rectangulo:")
    val lado1 = readln().toInt()
    print("Ingrese lado mayor del rectangulo:")
    val lado2 = readln().toInt()
    println("Segundo rectangulo")
    print("Ingrese lado menor del rectangulo:")
    val lado3 = readln().toInt()
    print("Ingrese lado mayor del rectangulo:")
    val lado4 = readln().toInt()
    if (retornarSuperficie(lado1,lado2) == retornarSuperficie(lado3,lado4))
        print("Los dos rectangulos tiene la misma superficie")
    else
        if (retornarSuperficie(lado1,lado2) > retornarSuperficie(lado3,lado4))
            print("El primer rectangulo tiene una superficie mayor")
        else
            print("El segundo rectangulo tiene una superficie mayor")
}



