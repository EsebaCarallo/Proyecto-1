package Arreglos

import kotlin.random.Random

/*
fun main() {
    val elementos = IntArray(8)


    for (i in elementos.indices) {
        print("Ingrese el elemento ${i + 1}: ")
        elementos[i] = readLine()!!.toInt()
    }

    var valorAcumulado = 0
    var valorAcumuladoMayor36 = 0
    var cantidadMayores50 = 0


    for (elemento in elementos) {
        valorAcumulado += elemento
        if (elemento > 36) {
            valorAcumuladoMayor36 += elemento
        }
        if (elemento > 50) {
            cantidadMayores50++
        }
    }


    println("Valor acumulado de todos los elementos: $valorAcumulado")
    println("Valor acumulado de los elementos mayores a 36: $valorAcumuladoMayor36")
    println("Cantidad de valores mayores a 50: $cantidadMayores50")
}

 */
/*
fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglos = IntArray(4)

    println("Ingrese los elementos del primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readLine()!!.toInt()
    }

    println("Ingrese los elementos del segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readLine()!!.toInt()
    }

    for (i in sumaArreglos.indices) {
        sumaArreglos[i] = arreglo1[i] + arreglo2[i]
    }

    println("La suma de los dos arreglos es:")
    for (i in sumaArreglos.indices) {
        println("Elemento ${i + 1}: ${sumaArreglos[i]}")
    }
}


 */

//segunda opcion propuesto 2

fun main() {
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    var arreglo2 = IntArray(4)
    val arreglosuma = IntArray(4)

    var verarreglo1 = "Arreglo1: "
    var verarreglo2 = "Arreglo2: "
    var verarreglosuma = "ArregloSumado: "
    for (i in 0..arreglo1.size - 1) {

        arreglo1[i] = Random.nextInt(0, 10)
        arreglo2[i] = Random.nextInt(0, 10)
        arreglosuma[i]= arreglo1[i]+ arreglo2[i]

        verarreglo1 += if (i == arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + ","

        verarreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString() + ","

        verarreglosuma += if (i == arreglosuma.lastIndex)
            arreglosuma[i] else arreglosuma[i].toString() + ","

    }
    println(verarreglo1)
    println(verarreglo2)
    println(verarreglosuma)
}