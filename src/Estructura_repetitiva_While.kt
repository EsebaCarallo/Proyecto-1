fun main(){
    /*
    var x = 1
    while (x <= 100){
    println(x)
    x++
    }
     */
/*
    println("Ingrese un valor:")
    val valor: Int = readln().toInt()
    var x = 1
    while (x <= valor){
        println(x)
        x++
    }
 */
/*
    var x = 1
    var suma = 0

    while (x <= 10){
        println("Ingrese el valor $x:")
        val valor = readln().toInt()
        suma = suma + valor
        x++
    }
    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio  es $promedio")

 */


    print("Cuantas piezas procesará?:")
    val n = readln().toInt()
    var x = 1
    var cant = 0
    while (x <= n){
        println("Ingrese la medida de la pieza:")
        val largo: Double = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30){
            cant = cant + 1
        }
            x++
        println("La cantidad de piezas aptas son $cant")

    }

}