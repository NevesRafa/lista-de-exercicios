package com.example.exercicios.aumento_salario

import org.junit.Assert.assertEquals
import org.junit.Test

class AumentoSalarioPresenterTest {
    @Test
    fun testCalculoAumentoSalario() {

        val activity = AumentoSalarioAcitivity()
        val presenter = AumentoSalarioPresenter(activity)

        val resultado = presenter.calculoAumentoSalario(1000.0)
        assertEquals(1058.0, resultado, 0.0)
    }
}