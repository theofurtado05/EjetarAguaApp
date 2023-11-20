package com.example.ejetaragua

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.ejetaragua.Fragments.Header
import android.net.Uri
import com.example.ejetaragua.Fragments.Menu


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.header_container, Header())
                .commit()

            supportFragmentManager.beginTransaction()
                .replace(R.id.menu_container, Menu())
                .commit()

        }

        val mediaPlayer = MediaPlayer.create(this, R.raw.ejetaragua)

        val btEjetarAgua = findViewById<Button>(R.id.bt_ejetar)
        var ejetando = false


        btEjetarAgua.setOnClickListener {
            val contexto = it.context

            if (!ejetando) {
                btEjetarAgua.setBackgroundColor(ContextCompat.getColor(contexto, R.color.vermelho))
                btEjetarAgua.text = "PARAR!"
                ejetando = true

                mediaPlayer.setOnCompletionListener {

                    btEjetarAgua.setBackgroundColor(ContextCompat.getColor(contexto, R.color.PrimaryColor))
                    btEjetarAgua.text = "Ejetar água"
                    ejetando = false
                }

                mediaPlayer.start()

            } else {
                btEjetarAgua.setBackgroundColor(ContextCompat.getColor(it.context, R.color.PrimaryColor))
                btEjetarAgua.text = "Ejetar água"
                mediaPlayer.stop()
                mediaPlayer.release() // Liberar recursos do MediaPlayer
                ejetando = false
            }
        }


    }
}