package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {

    private lateinit var txtSignUp: TextView
    private lateinit var btnLogin1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtSignUp = findViewById(R.id.txtSignUp)
        btnLogin1 = findViewById(R.id.btnLogin1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtSignUp.setOnClickListener(){
            val intentPassingData = Intent(this@PageLogin,
                PageSignUp::class.java)
            startActivity(intentPassingData)
        }
        btnLogin1.setOnClickListener(){
            val intentPassingData = Intent(this@PageLogin,
                RecycleMakanan::class.java)
            startActivity(intentPassingData)
        }
    }
}