package com.example.appbible

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // Importação corrigida
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textViewGreeting)
        val button: Button = findViewById(R.id.buttonClick)

        button.setOnClickListener {
//            textView.setText(R.string.app_name)

            // Navega para a nova Activity
            val intent = Intent(this, BibleListActivity::class.java)
            startActivity(intent)
        }


    }
}