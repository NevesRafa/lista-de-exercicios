package com.example.exercicios.conversor_temperatura

class ConversorTemperaturaPresenter(val conversorTemperaturaActivity: ConversorTemperaturaActivity) {

    fun formulaParaFahrenheit(celsius: Double): Double {

        return (celsius * 9.0 / 5.0) + 32.0

    }

    fun formulaParaCelsius(fahrenheit: Double): Double {

        return (fahrenheit - 32.0) * (5.0 / 9.0)
    }

    fun conversorParaFahrenheit(celsius: Double) {

        val resultadoF = "${formulaParaFahrenheit(celsius)} °F"
        conversorTemperaturaActivity.mostraResultado(resultadoF)
    }

    fun conversorParaCelsius(fahrenheit: Double) {

        val resultado = "${formulaParaCelsius(fahrenheit)} °C"
        conversorTemperaturaActivity.mostraResultado(resultado)
    }
}