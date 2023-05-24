package com.vasyerp.androiddevsvasyerp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Practice : AppCompatActivity() {
    lateinit var signupBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        signupBtn=findViewById(R.id.signUpBtn)
        signupBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))        }

    }
}