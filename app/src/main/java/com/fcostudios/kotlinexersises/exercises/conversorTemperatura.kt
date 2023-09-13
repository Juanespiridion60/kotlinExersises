package com.fcostudios.kotlinexersises.exercises

fun main() {
    printFinalTemperature(27.0, "Celcius", "Fahrenheit") {(9.0 / 5.0) + it + 32}
    printFinalTemperature(350.0, "Kelvin", "Celsius") {it - 273.15}
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") {(5.0 / 9.0) * (it - 32) + 273.15}

}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double)
{
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

/*OUTPUT
* 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.*/