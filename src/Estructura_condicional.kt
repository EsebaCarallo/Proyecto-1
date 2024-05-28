fun main(){
    /*
    //Problema 1
    println("Ingrese el sueldo del empleado")
    val sueldo: Double = readln().toDouble()

    //Condicional if, si sueldo es mayor 3000,
    //Imprimir "Debe pagar impuestos
    if (sueldo > 3000){
        println("Debe pagar impuestos")
   }
     */
/*
    //Problema 2
    println("Ingrese primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    // Condicional con if/ else
    if (valor1 > valor2){
        println("El mayor valor es $valor1")
    }else{
        println("El mayor valor es $valor2")
    }

 */
/*
    //Problema 3
    println("Ingrese primer valor:")
    val valor1: Int = readln().toInt()
    println("Ingrese segundo valor:")
    val valor2: Int = readln().toInt()
    if (valor1 < valor2){
        val suma: Int = valor1 + valor2
        val resta: Int = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    }else {
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        println("El pruducto de los dos valores es: $producto")
        println("La division de los dos valores es: $division")
    }
    /*
 */
    println("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    println("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    println("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()
    if ((nota1 + nota2 + nota3)/3 >= 7){
        val promedio = (nota1 + nota2 + nota3)/3
        println("Nota promedia es $promedio")
        println("Promocionado")
    }

 */
    println("Ingrese numero entre 1-99:")
    val valor1: Int = readln().toInt()
        if (valor1 < 1){
            println("Numero no valido")
        if (valor1 > 99){
            println("Numero no valido")
        }
    }
    if (valor1 >= 10) {
        println("Tiene dos digitos")
    }else{
        println("Tiene un solo digito")
    }




}