package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val  edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val  bntcalcular = findViewById<Button>(R.id.bnt_calcular)

        bntcalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text

            println("text")
        }
    }
}