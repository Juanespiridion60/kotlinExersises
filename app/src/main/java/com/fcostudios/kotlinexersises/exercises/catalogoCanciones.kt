package com.fcostudios.kotlinexersises.exercises

import java.time.Year

fun main(){
    val reproductions = 42000000
    Song("Point of no Return", "Adam Port", 2023, reproductions)
}

fun Song(tittle: String, artis: String, releaseYear: Int, popularity: Int) {
    println("$tittle, interpretada por $artis en $releaseYear")
    if (popularity > 1000) println("Esta cancion es muy escuchada")else
        println("Pocas reproducciones")
}
