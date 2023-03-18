package com.crezo.dcdealz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        goTomain();
    }

    private fun goTomain() {
        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}