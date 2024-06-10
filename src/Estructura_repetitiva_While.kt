fun main() {
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

    /*
    print("Cuantas piezas procesará?:")
    val n = readln().toInt()
    var x = 1
    var cant = 0
    while (x <= n) {
        println("Ingrese la medida de la pieza:")
        val largo: Double = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30) {
            cant = cant + 1
        }
        x++
        println("La cantidad de piezas aptas son $cant")
    }

 */

//Problemas
    /*
    var x = 1
    var suma = 0
    var mayor = 0
    var menor = 0

    while (x <= 10) {
        println("Ingrese la nota del alumno:")
        val valor = readln().toInt()
        suma = suma + valor
        x++
        if (valor >= 7) {
            mayor = mayor + 1
        }else{
            menor = menor +1
        }
    }
    println("La cantidad de notas mayores o iguales a 7 son: $mayor")
    println("La cantidad de notas menores a 7 son: $menor")

 */
    /*
    var x = 1
    println("Ingrese el numero de alturas que desea ingresar:")
    val n: Int = readln().toInt()
    var suma = 0.0
    while (x <= n){
        println("Ingrese la altura:")
        val alt: Double = readln().toDouble()
        suma = suma + alt
        x++
    }
    val promedio = suma / n
    println("El promedio  es $promedio")

     */

    /*
   var x = 1
   print("Ingrese la cantidad de empleados:")
   val n: Int = readln().toInt()
   var suma = 0
   var sueldomin = 0
   var sueldomax = 0
   while (x <= n) {
       print("Ingrese el sueldo del empleado:")
       val sueldo: Int = readln().toInt()
       suma = suma + sueldo
       x = x + 1
       if(sueldo >= 100 && sueldo <= 300)
           sueldomin = sueldomin + 1
       else
           if(sueldo >= 300 && sueldo <= 500)
               sueldomax = sueldomax + 1
   }
   val importe = suma*n
   println("Los cantidad de empleados que cobran entre $100 y $300 son: $sueldomin")
   println("Los cantidad de empleados que cobran más de $300 son: $sueldomax")
   println("El importe que gasta la empresa es de $importe

 */

    /*
        var x = 8
        while (x <= 500) {
            println("$x")
            x = x + 8
        }
        */

    /*
   var x = 1
   var x2 = 1
   var suma1 = 0
   var suma2 = 0
   println("Lista 1")
   while (x <= 5) {
       print("Ingrese un valor:")
       val vall1: Int = readln().toInt()
       suma1 = suma1 + vall1
       x = x + 1
   }
   println("Lista 2")
   while (x2 <= 5) {
       print("Ingrese un valor:")
       val vall2: Int = readln().toInt()
       suma2 = suma2 + vall2
       x2 = x2 + 1
   }
   if(suma1 == suma2)
       println("Listas iguales")
   else
       if(suma1 > suma2)
           println("Lista 1 mayor")
   else
       if(suma2 > suma1)
           println("Lista 2 mayor")
   */

    /*
   var x = 1
   var pares = 0
   var impares = 0
   print("Ingrese la cantidad de numeros deseada a ingresar:")
   val n : Int = readln().toInt()
   while (x <= n) {
       print("Ingrese un numero:")
       val num: Int = readln().toInt()
       x = x + 1
       if (num % 2 == 0)
           pares = pares + 1
       else
           impares = impares + 1
   }
   println("La cantidad de numeros pares es: $pares")
   println("La cantidad de numerosg impares es: $impares")
   */
}









