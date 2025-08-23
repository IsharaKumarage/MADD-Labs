package com.example.lab2ceb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val openCalculatorButton: Button = findViewById(R.id.buttonOpenCalculator)
		openCalculatorButton.setOnClickListener {
			startActivity(Intent(this, BillCalculatorActivity::class.java))
		}
	}
}