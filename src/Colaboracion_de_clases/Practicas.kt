package Colaboracion_de_clases

class Socio(val nombre: String, val antiguedad: Int)
class Club(val socio1: Socio, val socio2: Socio, val socio3: Socio) {


    fun obtenerSocioConMayorAntiguedad(): Socio {
        var mayorAntiguedad = socio1

        if (socio2.antiguedad > mayorAntiguedad.antiguedad) {
            mayorAntiguedad = socio2
        }

        if (socio3.antiguedad > mayorAntiguedad.antiguedad) {
            mayorAntiguedad = socio3
        }

        return mayorAntiguedad
    }
}

// Ejemplo de uso
fun main() {
    val socio1 = Socio("Juan", 5)
    val socio2 = Socio("Ana", 10)
    val socio3 = Socio("Luis", 7)
    val club = Club(socio1, socio2, socio3)
    val socioConMayorAntiguedad = club.obtenerSocioConMayorAntiguedad()
    println("El socio con mayor antigüedad es: ${socioConMayorAntiguedad.nombre}")
}