package com.engefour.regambiental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailUsuario = emailId!!.text.toString()

        var senhaUsuario  = senhaId!!.text.toString()


        botaoId.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            intent.putExtra("email", emailUsuario)
            intent.putExtra("senha", senhaUsuario)
            startActivity(intent)


            }




    }
}
