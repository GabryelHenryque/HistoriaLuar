package com.example.historias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.historias.historias.historia1

class tela1 : AppCompatActivity() {

    lateinit var Bir1 : androidx.appcompat.widget.AppCompatButton
    lateinit var Bir2 : androidx.appcompat.widget.AppCompatButton
    //private  var Thistoria : Int
     var Thistoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        Bir1 = findViewById(R.id.Bir1)
        Bir2 = findViewById(R.id.Bir2)

        Bir1.setOnClickListener {
                Thistoria = 1
                tela2()

        }
        Bir2.setOnClickListener {
            Thistoria = 2
            tela2()

        }

    }
    fun tela2(){
        val Tbatata = Intent(this, historia1::class.java )
        Tbatata.putExtra("tela2", Thistoria)
        startActivity(Tbatata)
    }

}