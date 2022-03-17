package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

        val image = img(num)
        val imageDados = findViewById<ImageView>(R.id.imagem)
        imageDados.setImageResource(image)
    }

    private fun img(num:Int):Int {
        return when(num) {
            1 -> R.drawable.d20_1
            2 -> R.drawable.d20_2
            3 -> R.drawable.d20_3
            4 -> R.drawable.d20_4
            5 -> R.drawable.d20_5
            6 -> R.drawable.d20_6
            7 -> R.drawable.d20_7
            8 -> R.drawable.d20_8
            9 -> R.drawable.d20_9
            10 -> R.drawable.d20_10
            11 -> R.drawable.d20_11
            12 -> R.drawable.d20_12
            13 -> R.drawable.d20_13
            14 -> R.drawable.d20_14
            15 -> R.drawable.d20_15
            16 -> R.drawable.d20_16
            17 -> R.drawable.d20_17
            18 -> R.drawable.d20_18
            19 -> R.drawable.d20_19
            else ->R.drawable.d20_20
        }

    }


}




