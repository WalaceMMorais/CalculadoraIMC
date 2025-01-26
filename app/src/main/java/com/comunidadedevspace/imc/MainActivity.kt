package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.comunidadedevspace.imc.Result
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val  edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val  bntcalcular = findViewById<Button>(R.id.bnt_calcular)

        bntcalcular.setOnClickListener {

            val pesoStr:String = edtpeso.text.toString()
            val alturaStr:String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                Snackbar.make(
                    edtpeso,
                    "Preencha Todo os Campos",
                    Snackbar.LENGTH_LONG
                ).show()
            }else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                val intent = Intent(this, Result::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

            }
        }
    }
}