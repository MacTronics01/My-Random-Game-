package com.example.myrandomgame

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var editTextMin: EditText
    lateinit var editTextMax: EditText
    lateinit var button: Button
    lateinit var textView: TextView
    private var min = 0
    private var max: Int = 0
    private var output: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "MacTronicsApp"
        val random = Random()
        editTextMin = findViewById(R.id.editTextMin)
        editTextMax = findViewById(R.id.editTextMax)
        button = findViewById(R.id.btn_generate)
        textView = findViewById(R.id.textViewResult)
        button.setOnClickListener {
            val tempMin: String = editTextMin.text.toString()
            val tempMax: String = editTextMax.text.toString()
            if (tempMin != "" && tempMax != "") {
                min = tempMin.toInt()
                max = tempMax.toInt()
                if (max > min) {
                    output = random.nextInt(max - min + 1) + min; textView.text = "" + output
                }
            }
        }
    }
}
