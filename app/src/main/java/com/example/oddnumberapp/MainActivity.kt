package com.example.oddnumberapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)

        editText.setText(currentNumber.toString())

        button.setOnClickListener {
            currentNumber = when (currentNumber) {
                0 -> 1
                1 -> 3
                3 -> 5
                5 -> 7
                7 -> 9
                else -> 1
            }
            editText.setText(currentNumber.toString())
        }
    }
}