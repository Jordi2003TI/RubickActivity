package com.example.rubickactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val menu: Button = findViewById(R.id.MenuPrincipal)
        menu.setOnClickListener {
            val intent = Intent(this, MenuPrincipalActivity::class.java)
            startActivity(intent)
        }

        val login: Button = findViewById(R.id.Login)
        login.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        val registro: Button = findViewById(R.id.Registro)
        registro.setOnClickListener{
            val intent = Intent(this,RegistroActivity::class.java)
            startActivity(intent)
        }
        val Ajustes: Button = findViewById(R.id.AjustesMain)
        Ajustes.setOnClickListener{
            val intent = Intent(this,AjustesActivity::class.java)
            startActivity(intent)
        }
        val scroll: Button = findViewById(R.id.AjustesScroll)
        scroll.setOnClickListener{
            val intent = Intent(this,AjustesScrollActivity::class.java)
            startActivity(intent)
        }

        val comunidad: Button = findViewById(R.id.Comunidad)
        comunidad.setOnClickListener{
            val intent = Intent(this,ComunidadActivity::class.java)
            startActivity(intent)
        }

        val datosRegistro: Button = findViewById(R.id.DatosRegisto)
        datosRegistro.setOnClickListener{
            val intent = Intent(this,DatosRegistroActivity::class.java)
            startActivity(intent)
        }

        val cargaRegistro: Button = findViewById(R.id.CargaRegistro)
        cargaRegistro.setOnClickListener{
            val intent = Intent(this,CargaRegistroActivity::class.java)
            startActivity(intent)
        }


    }
}