package com.msn.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fs=findViewById<Button>(R.id.fs)
        val cs=findViewById<Button>(R.id.cs)
        fs.setOnClickListener{
            intent= Intent(this,fullStack::class.java)
            startActivity(intent)

        }
        cs.setOnClickListener {
            intent = Intent(this, fullStack::class.java)
            startActivity(intent)
        }
        }
    }
