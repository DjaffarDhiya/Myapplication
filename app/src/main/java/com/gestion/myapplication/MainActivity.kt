package com.gestion.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var changeActivityButton: Button
    lateinit var messageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        messageEditText = findViewById(R.id.etMessage)
        changeActivityButton = findViewById(R.id.newActivityBtn)
        changeActivityButton.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity::class.java)
            val message = messageEditText.text.toString()
            intent.putExtra("message_key", message)
            startActivity(intent)

        }
    }
}