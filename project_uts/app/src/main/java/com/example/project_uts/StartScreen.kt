package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartScreen : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_screen)

        btnLogin = findViewById(R.id.btnLogIn)
        btnSignUp = findViewById(R.id.btnSignUp)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogin.setOnClickListener(){
            val intentMenu2 = Intent(this@StartScreen, PageLogin::class.java)
            startActivity(intentMenu2)
        }
        btnSignUp.setOnClickListener(){
            val intentMenu2 = Intent(this@StartScreen, PageLogin::class.java)
            startActivity(intentMenu2)
        }
    }
}