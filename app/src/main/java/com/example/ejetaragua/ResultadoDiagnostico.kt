package com.example.ejetaragua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.ejetaragua.Fragments.Header
import com.example.ejetaragua.Fragments.Menu

class ResultadoDiagnostico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_diagnostico)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.header_container, Header())
                .commit()

            supportFragmentManager.beginTransaction()
                .replace(R.id.menu_container, Menu())
                .commit()

        }

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl("https://ejetaragua.com")

    }
}