package com.example.thehistoryapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private fun resetApp(){ //declaration of a private function
        val intent = Intent(this, MainActivity :: class.java) //creating an intent object
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK) //adding flags to intent
        startActivity(intent) //start activity specified in intent
        finish() //finishes the current activity
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGen = findViewById<Button>(R.id.btnGen) //declaration of btnGen, Button
        val viewDisplay = findViewById<TextView>(R.id.viewDisplay) //declaration of TextView
        val edtAge: EditText = findViewById(R.id.edtAge) //declaration of EditText
        var people: String = " " //creating a variable as a string
        val btnClear = findViewById<Button>(R.id.btnClear) //declaration of btnClear, Button

        btnClear.setOnClickListener { resetApp() } //creating a new intent, and reset button
    }
}


