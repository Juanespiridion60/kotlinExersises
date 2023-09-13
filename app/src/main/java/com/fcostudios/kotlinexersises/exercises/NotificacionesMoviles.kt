package com.fcostudios.kotlinexersises.exercises


fun main() {
    val morningNotification = 20
    val eveningNotification = 134

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages > 99){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else{
        println("You have $numberOfMessages notifications.")
    }
}

/*
* You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
* */