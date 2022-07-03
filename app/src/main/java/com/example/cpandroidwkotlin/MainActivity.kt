package com.example.cpandroidwkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val btnEnviarInformacion = findViewById<Button>(R.id.btnEnviarInformacion)

        val btnEnviarInformacion:Button = findViewById(R.id.btnEnviarInformacion)
        val edTextName:EditText = findViewById(R.id.edTextName)

        btnEnviarInformacion.setOnClickListener {
            Toast.makeText(this,"Se envió la información", Toast.LENGTH_SHORT).show()

            //val intent = Intent(this,Secondactivity::class.java) startActivity(intent)

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("nombre_usuario",edTextName.text.toString())
            startActivity(intent)
        }

    }
}