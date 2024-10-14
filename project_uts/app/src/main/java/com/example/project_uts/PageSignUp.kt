package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageSignUp : AppCompatActivity() {

    private lateinit var txtLogin : TextView
    private lateinit var btnSignUp1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_sign_up)

        txtLogin = findViewById(R.id.txtLogIn)
        btnSignUp1 = findViewById(R.id.btnSignUp1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtLogin.setOnClickListener() {
            val intentPassingData = Intent(
                this@PageSignUp,
                PageLogin::class.java
            )
            startActivity(intentPassingData)
        }
        btnSignUp1.setOnClickListener() {
            val intentPassingData = Intent(
                this@PageSignUp,
                PageLogin::class.java
            )
            startActivity(intentPassingData)
        }
    }
}