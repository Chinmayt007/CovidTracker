package com.example.covidtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        Handler().postDelayed({
            val startAct=Intent(this@splashScreen,MainActivity::class.java)
            startActivity(startAct)
        },2000)
    }
}
