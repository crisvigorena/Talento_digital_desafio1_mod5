package com.inforcap.main

fun main(){
    val author1 = Author (
        nombres = "Howard Phillips",
        apellidos = "Lovecraft",
        obrasDestacadas = listOf("La llamada de Cthulhu", "El Necromicón", "Las Montañas de la locura"),
        birthDate = 1890,
        deathDate = 1937,
        comentarios = "Escritor estadounidense de novelas de terror y ciencia ficcion"
)
    val author2 = Author (
        nombres = "Robert Anthony",
        apellidos = "Salvatore",
        obrasDestacadas = listOf("El elfo oscuro", "El valle del viento helado"),
        birthDate = 1959,
        deathDate = null,
        comentarios = "Escritor estadounidense de literatura fantastica y ciencia ficcion"
    )

    var autores: ArrayList<Author> = ArrayList()
        autores.add(author1)
        autores.add(author2)

    for (a in autores){
        printdetails(a)
    }
}

fun printdetails(author: Author){
    println("***************************************")
    println("Nombre del autor: ${author.nombres} ${author.apellidos}")
    println("Obras destacadas: ")
        for (libro in author.obrasDestacadas!!){
            println("\t- ${libro}")
        }
    println("Año de nacimiento: ${author.birthDate}")
    var edad = calculateAge(author.birthDate, author.deathDate)
    println("Año de deceso: " + if (edad > 0) "${author.deathDate}, murio a los ${edad} años de vida" else "Aun esta vivo")
    println("Comentarios: ${author.comentarios}")
}