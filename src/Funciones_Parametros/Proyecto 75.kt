package Funciones_Parametros

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor: ")
    if (v1 > v2 && v1 > v3)
        print(v1)
    else
        if (v2 > v1 && v2 > v3)
            print(v2)
    else
        print(v3)
}

fun main() {
    println("Ingrese primer valor: ")
    val valor1 = readln().toInt()
    println("Ingrese segundo valor: ")
    val valor2 = readln().toInt()
    println("Ingrese tercer valor: ")
    val valor3 = readln().toInt()
    mostrarMayor(valor1, valor2, valor3)
}