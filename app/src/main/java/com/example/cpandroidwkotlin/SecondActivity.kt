package com.example.cpandroidwkotlin
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val nombre: String? = intent.getStringExtra("nombre_usuario")
        val txtName: TextView = findViewById(R.id.txtName)

        txtName.setText(nombre)

    }
}