package com.example.exercicios.conversor_temperatura

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversorTemperaturaPresenterTest {
    @Test
    fun testFormulaCelsius() {

        val activity = ConversorTemperaturaActivity()
        val presenter = ConversorTemperaturaPresenter(activity)

//        assertTrue(presenter.formulaParaCelsius(32.0) == 0.0)
//        assertFalse(presenter.formulaParaCelsius(32.0) == 10.0)

        val resultado = presenter.formulaParaCelsius(32.0)
        assertEquals(0.0, resultado, 0.0)
    }

    @Test
    fun testFormulafahrenheit() {

        val activity = ConversorTemperaturaActivity()
        val presenter = ConversorTemperaturaPresenter(activity)

        val resultado = presenter.formulaParaFahrenheit(0.0)
        assertEquals(32.0, resultado, 0.0)

    }
}