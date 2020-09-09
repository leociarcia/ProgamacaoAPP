package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun validar(componente:View){

//        Toast.makeText(this, "Boa noite", Toast.LENGTH_SHORT).show()

        var nome = false

        if(et_nome.length()<4){
            tv_nomeV.visibility = View.VISIBLE
        }
        else{
            tv_nomeV.visibility = View.GONE
            nome=true
        }

        val n1 = et_n1.text.toString().toInt()
        val n2 = et_n2.text.toString().toInt()

        var nota1 = false
        var nota2 = false

        if(n1 < 0 || n1> 10){
            tv_n1V.visibility = View.VISIBLE
        }
        else{
            tv_n1V.visibility = View.GONE
            nota1=true

        }

        if(n2 < 0 || n2> 10){
            tv_n2V.visibility = View.VISIBLE
        }
        else{
            tv_n2V.visibility = View.GONE
            nota2 = true
        }

        if(nota1 == true && nota2 == true && nome==true){

        val media = (n1+n2)/2

        if (media < 5){
            tv_resultado.text = et_nome.text.toString() + ", sua média foi de " + media + "(arredondado)."
            tv_resultado.setTextColor(Color.RED)
        }
        else{
            tv_resultado.text = et_nome.text.toString() + ", sua média foi de " + media + "(arredondado)."
            tv_resultado.setTextColor(Color.BLUE)
        }
    }
    }
}