package com.example.activitycycle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityMain : AppCompatActivity() {


   private lateinit var text: TextView


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "OnCreate call", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onCreate Method is called")

        val btn = findViewById<Button>(R.id.btn_1)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.setDisplayShowTitleEnabled(false)


        text = findViewById<TextView>(R.id.txt_1)
        text.setText("This is my First set onCreate")

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart call", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onStart Method called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onRestart Method Called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onResume Method Called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onPause Method Called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onStop Method Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onDestroy Called")

    }
}