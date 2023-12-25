package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.multiscreenapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val TEXT = "TEXT"
    private var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            text = intent.getStringExtra("TEXT").toString()
            textView.text = text
            btnFirstActivity.setOnClickListener {

                text = editTextSecond.text.toString()

                val intent = Intent(applicationContext, MainActivity::class.java)
                intent.putExtra(TEXT,text)
                startActivity(intent)
            }
        }

    }
}