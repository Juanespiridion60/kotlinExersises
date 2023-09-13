package com.fcostudios.kotlinexersises.exercises

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile(referrer = null)
    atiqah.showProfile(referrer = amanda)
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile(referrer: Person?) {
        println("Name: $name")
        println("Age: $age")
        print("Likes to $hobby. ")
        if (referrer != null) println("Has a referrer name $referrer, who likes to $hobby \n")
        else println("Doesn't have a referrer.")
    }
}

/*
Name: Amanda
Age: 33
Likes to play tennis. Doesn't have a referrer.

Name: Atiqah
Age: 28
Likes to climb. Has a referrer named Amanda, who likes to play tennis.
* */
