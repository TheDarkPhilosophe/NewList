package com.android.newlist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewsActivity : AppCompatActivity() {
    var Login: String? = ""
    var Password: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news)
        val nButton = findViewById<View>(R.id.button_information) as Button
        val dButton = findViewById<View>(R.id.button_details) as Button
        val intent = intent
        val hasLogin = intent.hasExtra("login")
        val hasPwd = intent.hasExtra("Password")
        if (hasLogin) Login = intent.getStringExtra("login")
        if (hasPwd) Password = intent.getStringExtra("Password")
        title = "$localClassName : $Login"
        nButton.setOnClickListener {
            val url = "https://news.google.com/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        dButton.setOnClickListener { view ->
            val intent = Intent(view.context, DetailsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
        System.exit(0)
    }
}