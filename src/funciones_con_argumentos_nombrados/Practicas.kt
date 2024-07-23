package funciones_con_argumentos_nombrados

fun tabla(valor: Int, termino: Int = 10){
    for (i in 1..termino){
        println("$valor * $i = ${valor * i}")
    }
}

fun main() {
    tabla(valor = 5, termino = 12)
    tabla(valor = 7)
}