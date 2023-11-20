package com.example.ejetaragua

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ejetaragua.Fragments.Header
import com.example.ejetaragua.Fragments.Menu


class FormDiagnostico : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_diagnostico)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.header_container, Header())
                .commit()

            supportFragmentManager.beginTransaction()
                .replace(R.id.menu_container, Menu())
                .commit()

        }

        val btDiagnostico = findViewById<Button>(R.id.bt_diagnostico)

        btDiagnostico.setOnClickListener{
            val intent = Intent(this, ResultadoDiagnostico::class.java)
            startActivity(intent)

        }
    }




}