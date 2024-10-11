package com.inforcap.main

data class Author(
    val nombres: String,
    val apellidos: String,
    val obrasDestacadas: List<String>,
    val birthDate: Int,
    val deathDate: Int?,
    val comentarios: String
)

fun calculateAge (birthDate: Int,deathDate: Int?): Int {
    return if (deathDate == null) {
        -1
    } else {
        deathDate - birthDate
    }
}

