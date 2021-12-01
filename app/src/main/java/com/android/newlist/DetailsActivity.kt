package com.android.newlist

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)
        title = localClassName
        val ok_Btn = findViewById<View>(R.id.button_ok) as Button
        ok_Btn.setOnClickListener {
            val intent = Intent(this@DetailsActivity, NewsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@DetailsActivity, NewsActivity::class.java)
        startActivity(intent)
    }
}