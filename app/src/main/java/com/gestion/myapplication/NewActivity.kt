package com.gestion.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "KotlinApp"
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.textView)
        messageTextView.text = message

    }
}