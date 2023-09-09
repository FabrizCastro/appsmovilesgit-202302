package com.example.app_sem3_s1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //Con putExtra envia
        //Con getStringExtra recupera

        val message = intent.getStringExtra(EXTRA_MESS)

        val textView = findViewById<TextView>(R.id.tvName).apply{
                text=message
        }
    }
}