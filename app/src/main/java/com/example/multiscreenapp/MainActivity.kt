package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TEXT = "TEXT"
    private var text = ""


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            text = if (intent.getStringExtra("TEXT").toString()=="null") {
                 "First window"
            } else  intent.getStringExtra("TEXT").toString()
            FirstTextView.text = text



            btnSecondActivity.setOnClickListener{
                text = editText.text.toString()

                val intent = Intent(applicationContext, SecondActivity::class.java)
                intent.putExtra(TEXT,text)
                startActivity(intent)
            }
        }

    }
}