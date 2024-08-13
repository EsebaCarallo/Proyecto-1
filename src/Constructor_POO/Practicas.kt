package Constructor_POO

class Punto(val x: Int, val y: Int){

    fun cuadrante(): String{
        return when{
            x > 0 && y > 0 -> "1er cuadrante"
            x < 0 && y > 0 -> "2do cuadrante"
            x < 0 && y < 0 -> "3er cuadrante"
            x > 0 && y < 0 -> "4to cuadrante"
            x == 0 && y !=0 -> "En el eje Y"
            y == 0 && x !=0 -> "En el eje X"
            else -> "En el origen"
        }
    }

}

fun main() {
    val punto1 = Punto(3, 4)
    val punto2 = Punto(-5, 6)
    val punto3 = Punto(-7, -8)
    val punto4 = Punto(9, -10)
    val punto5 = Punto(0, 5)

    println("Punto 1: ${punto1.cuadrante()}")
    println("Punto 2: ${punto2.cuadrante()}")
    println("Punto 3: ${punto3.cuadrante()}")
    println("Punto 4: ${punto4.cuadrante()}")
    println("Punto 5: ${punto5.cuadrante()}")



}