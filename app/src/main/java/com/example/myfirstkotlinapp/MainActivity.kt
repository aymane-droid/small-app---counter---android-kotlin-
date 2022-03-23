package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ok = findViewById<Button>(R.id.btn_ok)
        val prenom = findViewById<EditText>(R.id.Prenom)
        val result =findViewById<TextView>(R.id.result)
        var timeClicked = 0

        ok.setOnClickListener{
            timeClicked += 1
            result.text = timeClicked.toString()
            Toast.makeText(this,"hey am a Dancer",Toast.LENGTH_LONG).show()
        }
}}