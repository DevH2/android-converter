package com.example.omniconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonRMB: Button
    private lateinit var buttonEuro:Button
    private lateinit var buttonPound:Button
    private lateinit var buttonCAD:Button
    private lateinit var userInput:EditText
    private lateinit var outputView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRMB = findViewById(R.id.buttonRMB)
        buttonCAD = findViewById(R.id.buttonCAD)
        buttonPound = findViewById(R.id.buttonPound)
        buttonEuro = findViewById(R.id.buttonEuro)
        userInput = findViewById(R.id.editTextUserInput)
        outputView = findViewById(R.id.outputView)


        buttonRMB.setOnClickListener(this)
        buttonCAD.setOnClickListener(this)
        buttonPound.setOnClickListener(this)
        buttonEuro.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val userInputNumber:Float = userInput.text.toString().toFloat()
        when(view.id){
            R.id.buttonCAD -> {
                if(userInput.text.isEmpty()) return
                outputView.text = (userInputNumber*ConversionRatios.CAD_CONVERSION).toString()
            }
            R.id.buttonPound -> {
                if(userInput.text.isEmpty()) return
                outputView.text = (userInputNumber*ConversionRatios.POUND_CONVERSION).toString()
            }
            R.id.buttonRMB -> {
                if(userInput.text.isEmpty()) return
                outputView.text = (userInputNumber*ConversionRatios.RMB_CONVERSION).toString()
            }
            R.id.buttonEuro -> {
                if(userInput.text.isEmpty()) return
                outputView.text = (userInputNumber*ConversionRatios.EURO_CONVERSION).toString()
            }
        }
    }
}