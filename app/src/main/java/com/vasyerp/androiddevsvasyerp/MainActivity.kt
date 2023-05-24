package com.vasyerp.androiddevsvasyerp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var ed_name: EditText
    lateinit var ed_email:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_name=findViewById(R.id.edt_name)
        ed_email=findViewById(R.id.ed_email)


    }
}