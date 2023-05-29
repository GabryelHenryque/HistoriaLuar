package com.example.historias.historias

import android.graphics.Bitmap
import android.graphics.LinearGradient
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.IdRes
import com.example.historias.R
import com.example.historias.tela1

class historia1 : AppCompatActivity() {
    lateinit var Hvoltar1 : ImageButton


    //cria variavel com tipo de LinearLayout:
    lateinit var linearLayout : LinearLayout
    lateinit var vTextos: Array<String>
    lateinit var images: Array<Int>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia1)

        var _tela2 = intent.getIntExtra("tela2",0)


        if (_tela2 == 1)
        {
            //valor de texto(texto guadado no values/strings)
            vTextos = arrayOf(
                getString(R.string.text1),
                getString(R.string.text2),
                getString(R.string.text3),
                getString(R.string.text4),
                getString(R.string.text5),
                getString(R.string.text6),
                getString(R.string.text7)
            )

            //cria uma array com valor de ids de imagens(drawable/images)
            images = arrayOf(
                R.drawable.batata,
                R.drawable.srbatata,
                R.drawable.sratatacopia,
                R.drawable.obatatabanho,
                R.drawable.thepotato,
                R.drawable.obatataestudando,
                R.drawable.obatatacantando
            )

        }
        if (_tela2 == 2)
        {
            vTextos = arrayOf(
                getString(R.string.text1b),
                getString(R.string.text2b),
                getString(R.string.text3b),
                getString(R.string.text4b)
            )
            //cria uma array com valor de ids de imagens(drawable/batata)

            images = arrayOf(
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
            )
        }
        else{

        }

        Hvoltar1 = findViewById(R.id.IBvoltar1);

        Hvoltar1.setOnClickListener {
            finish()
        }

        //ONcreat:

        //da um id ao linear
        linearLayout = findViewById(R.id.LL1) // Substitua R.id.linearLayout pelo ID correto

        //cria um laço de repetiçao(for(in))
        for (_i in vTextos.indices) {

            //texto:

            // recebe texto| imagem para o parametro
            val _tView = TextView(this)
            val verImagem = ImageView(this)

            //configurações de  parametros do xml:

            //TextColor
            _tView.setTextColor(resources.getColor(R.color.white))

            //layout_width e layout_height (text||imagem)
            val parametroL = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val IparametroL = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

            //margins(text)
            parametroL.setMargins(100,0,100,0)

            /*gravity
            parametroL.gravity = Gravity.CENTER_HORIZONTAL */

            //atribui os parametros
            _tView.layoutParams = parametroL
            verImagem.layoutParams = IparametroL


            //mudando e adicionando o text| imagem
            _tView.text = vTextos[_i]
            linearLayout.addView(_tView)

            verImagem.setImageResource(images[_i])
            linearLayout.addView(verImagem)
        }

    }

}