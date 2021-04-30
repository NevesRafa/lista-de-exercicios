package com.example.exercicios.conversor_temperatura

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.exercicios.databinding.ActivityConversorTemperaturaBinding

class ConversorTemperaturaActivity : AppCompatActivity() {

    lateinit var presenter: ConversorTemperaturaPresenter
    lateinit var conversorTemperatura: ActivityConversorTemperaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        conversorTemperatura = ActivityConversorTemperaturaBinding.inflate(layoutInflater)
        setContentView(conversorTemperatura.root)

        presenter = ConversorTemperaturaPresenter(this)

        conversorTemperatura.botaoCelsius.setOnClickListener {
            converteParaCelsius()
        }

        conversorTemperatura.conversor.doAfterTextChanged { text ->
            if (text.isNullOrEmpty()) {
                conversorTemperatura.resultado.text = ""
            }
        }

        conversorTemperatura.botaoFahrenheit.setOnClickListener {
            converteParaFahrenheit()
        }
    }

    fun converteParaCelsius() {

        val meuNum = pegaNumero()

        if (meuNum != null) {
            presenter.conversorParaCelsius(meuNum)
        }
    }

    fun converteParaFahrenheit() {

        val meuNum = pegaNumero()

        if (meuNum != null) {
            presenter.conversorParaFahrenheit(meuNum)
        }
    }

    fun pegaNumero(): Double? {

        val valorRecebido = conversorTemperatura.conversor.text.toString()

        if (valorRecebido.isBlank()) {
            Toast.makeText(this, "Favor inserir um valor!", Toast.LENGTH_SHORT).show()
            return null
        }

        val valorNumero = valorRecebido.toDoubleOrNull()

        if (valorNumero == null) {
            Toast.makeText(this, "Valor invalido!", Toast.LENGTH_SHORT).show()
        }

        return valorNumero
    }


    fun mostraResultado(resultado: String) {
        conversorTemperatura.resultado.text = resultado
    }

}