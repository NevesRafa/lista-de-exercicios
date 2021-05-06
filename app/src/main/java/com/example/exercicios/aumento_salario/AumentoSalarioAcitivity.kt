package com.example.exercicios.aumento_salario

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicios.databinding.ActivityAumentoSalarioBinding

class AumentoSalarioAcitivity : AppCompatActivity() {

    lateinit var presenter: AumentoSalarioPresenter
    lateinit var aumentoSalario: ActivityAumentoSalarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aumentoSalario = ActivityAumentoSalarioBinding.inflate(layoutInflater)
        setContentView(aumentoSalario.root)

        presenter = AumentoSalarioPresenter(this)

        aumentoSalario.botaoCalcular.setOnClickListener {
            calculaAumento()
        }
    }


    fun calculaAumento() {

        val numeroRecebido = pegaNum()

        if (numeroRecebido != null) {
            presenter.calculaValorFinal(numeroRecebido)
        }
    }


    fun pegaNum(): Double? {

        var valorRecebido = aumentoSalario.salario.text.toString()
        if (valorRecebido.isBlank()) {
            Toast.makeText(this, "Favor inserir o seu Salário!", Toast.LENGTH_SHORT).show()
            return null
        }

        val valorNumero = valorRecebido.toDoubleOrNull()

        if (valorNumero == null) {
            Toast.makeText(this, "Valor invalido!", Toast.LENGTH_SHORT).show()
        }

        return valorNumero
    }

    fun mostraResultado(resultado: String) {
        aumentoSalario.valorFinal.text = resultado

    }


}

