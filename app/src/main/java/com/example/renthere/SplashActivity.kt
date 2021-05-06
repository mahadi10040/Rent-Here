package com.example.renthere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    private lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        this.window.setFlags(WindowManager.LayoutParams.TYPE_STATUS_BAR, WindowManager.LayoutParams.TYPE_STATUS_BAR)

        textView = findViewById(R.id.textView)
        textAnimation()

        moveToAuthenticationActivity()
    }

    private fun textAnimation(){
        val fade = AnimationUtils.loadAnimation(this, R.anim.fade)
        fade.duration = 3000
        textView.animation = fade
    }

    private fun moveToAuthenticationActivity(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, AuthenticationActivity::class.java))
            finish()
        },4000)
    }
}