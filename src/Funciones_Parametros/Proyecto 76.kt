package Funciones_Parametros
fun mostrarPerimetro(lado:Int){
    val perimetro = lado * 4
    println("El perimetro es: $perimetro")
}
fun mostrarSuperficie(lado: Int){
    val superficie = lado * lado
    println("La superficie es: $superficie")
}

fun main() {
    print("Ingrese el valor del lado de un cuadro: ")
    val la = readln().toInt()
    print("Quiere calcular el perimetro o la superficie[Ingresar texto:perimetro/superficie]")
    var respuesta = readln()
    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }
}
