package com.android.newlist

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        title = localClassName
        val mButton = findViewById<View>(R.id.button_login) as Button
        val mEDTid = findViewById<View>(R.id.username) as EditText
        val mEDTpwd = findViewById<View>(R.id.password) as EditText
        mButton.setOnClickListener { view ->
            val intent = Intent(view.context, NewsActivity::class.java)
            intent.putExtra("login", mEDTid.text.toString())
            intent.putExtra("Password", mEDTpwd.text.toString())
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}