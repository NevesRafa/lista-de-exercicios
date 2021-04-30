package com.example.exercicios

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicios.conversor_temperatura.ConversorTemperaturaActivity
import com.example.exercicios.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    lateinit var telaInicial: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        telaInicial = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(telaInicial.root)

        telaInicial.conversorTemperatura.setOnClickListener {

            val intent = Intent(this, ConversorTemperaturaActivity::class.java)
            startActivity(intent)
        }
    }
}