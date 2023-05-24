package com.vasyerp.androiddevsvasyerp

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var ed_name: EditText
    lateinit var ed_email:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_name=findViewById(R.id.edt_name)
        ed_email=findViewById(R.id.ed_email)

        //Hello


        var button = findViewById<Button>(R.id.signUpBtn)

        button.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }


    }
}