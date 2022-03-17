package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botao6)
        val botao2 = findViewById<Button>(R.id.botao12)
        val botao3 = findViewById<Button>(R.id.botao20)

        botao.setOnClickListener {
            jogarDados(6)
        }
        botao2.setOnClickListener {
            jogarDados(12)
        }
        botao3.setOnClickListener {
            jogarDados(20)
        }
    }


    private fun jogarDados(lados: Int) {
        var num = (1..lados).random()

        val result = findViewById<TextView>(R.id.Dado)

        result.text = num.toString()


    }



}




