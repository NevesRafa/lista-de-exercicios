package com.example.exercicios.aumento_salario

class AumentoSalarioPresenter(val aumentoSalarioActivity: AumentoSalarioAcitivity) {

    fun calculoAumentoSalario(salario: Double): Double {

        var aumento = salario * 0.15
        var salarioComAumento = salario + aumento
        var imposto = salarioComAumento * 0.08
        var valorFinal = salarioComAumento - imposto

        return valorFinal
    }

    fun calculaValorFinal(salario: Double) {

        val valorFinal = "O seu salário com aumento de 15% e desconto de 8% de impostos é ${
            calculoAumentoSalario(salario)
        }"
        aumentoSalarioActivity.mostraResultado(valorFinal)

    }

}