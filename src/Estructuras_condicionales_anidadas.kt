fun main(){
    /* //Problema 1
    println("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    println("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    println("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()

    val promedio = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7)
            println("Promocionado")
    else
    if (promedio >=4)
            println("Regular")
    else
        println("Reprobado")

     */
    /* //Problema 2
    println("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    println("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    println("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()

    val promedio = (nota1 + nota2 + nota3) / 3
    val estado = if (promedio >= 7)"Promocionado" else if (promedio >=4)"Regular" else "Reprobado"
    println("Estado del alomno $estado")

     */
/*
//Practicas
    println("Ingrese primer cantidad:")
    val nota1: Int = readln().toInt()
    println("Ingrese segunda cantidad:")
    val nota2: Int = readln().toInt()
    println("Ingrese tercer cantidad:")
    val nota3: Int = readln().toInt()
    if (nota3 > nota2)
        println("El mayor numero es $nota3")
    else
        if (nota2 > nota1)
        println("El mayor numero es $nota2")
    else
        println("El mayor numero es $nota1")

 */



/*
    println("Ingrese una cantidad de hasta 3 cifras:")
    val cant: Int = readln().toInt()
    if (cant > 999)
        println("ERROR")
    else
        if (cant > 99)
            println("Tiene 3 cifras")
    else
        if (cant > 9)
            println("Tiene 2 cifras")
    else
            println("Tiene 1 cifra")

 */

   println("Ingrese cantidad total de preguntas:")
    val cant1 = readln().toInt()
    println("Ingrese cantidad de preguntas contestadas correctamente:")
   val cant2 = readln().toInt()
    val promedio : Float = cant2/cant1.toFloat()
    if (promedio >= 0.9)
        println("Nivel maximo")
    if (promedio >= 0.75 && promedio < 0.9)
        println("Nivel medio")
    if (promedio >= 0.50 && promedio < 0.75)
        println("Nivel regular")
    else
        println("Fuera de nivel")





}