package com.example.historias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ONCREAT:

        //abre a outra tela altomaticamente e fecha essa
        Handler(Looper.getMainLooper()).postDelayed({
            val _intent = Intent(this@MainActivity, tela1::class.java)
            startActivity(_intent)
            finish()
        },2000)

    }
}