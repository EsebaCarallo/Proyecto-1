package funciones_con_argumentos_nombrados

fun calcularsueldo(nombre: String, costohota: Double, canthoras: Int){
    val sueldo = costohota + canthoras
    println("$nombre trabajo $canthoras horas, se le paga por hora $costohota por " +
            "lo tanto le corresponde un sueldo de $sueldo")
}
fun main() {
    calcularsueldo("Juan", 10.5, 120)
    calcularsueldo(costohota = 12.0, canthoras = 40, nombre = "Ana")
    calcularsueldo(canthoras = 90, nombre = "Luis", costohota = 7.25)
}