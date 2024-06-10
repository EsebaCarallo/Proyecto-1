fun main() {
    /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor = readln().toInt()
        if (valor < 10)
            println("El valor ingresado tiene un digito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos digitos")
        else
            println("El valor ingresado tiene tres digitos")
    }while (valor != 0)

     */
/*
    var cant = 0
    var suma = 0
    do {
        println("Ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }
    } while (valor != 0)
    if (cant != 0) {
        val promedio = suma / cant
        println("El promedio de los valores ingresados es: $promedio")
    }else{
        println("No se ingresaron valores.")
    }

 */


    var cant_inferior = 0 //por debajo de 9.8
    var cant_superior = 0 //por debajo de 10.2
    var cant_adecuada = 0 //entre 9.8 y 10.2

    do {
        print("Ingrese el peso de la pieza(0 para finalizar):")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant_superior ++
        else
            if (peso >= 9.8 && peso <= 10.2)
            cant_adecuada++
        else
            cant_inferior++
    }while (peso != 0.0)
    println("Piezas aptas: $cant_adecuada")
    println("Piezas peso superior a 10.2: $cant_superior")
    println("Piezas peso inferior a 9.8: $cant_inferior")
    val suma = cant_adecuada + cant_inferior + cant_superior
    println("Cantidad total de piezas procesadas: $suma")


}