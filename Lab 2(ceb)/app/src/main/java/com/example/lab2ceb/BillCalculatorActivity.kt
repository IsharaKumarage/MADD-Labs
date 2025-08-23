package com.example.lab2ceb

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class BillCalculatorActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_bill_calculator)

		val unitsEditText: EditText = findViewById(R.id.editUnits)
		val rateEditText: EditText = findViewById(R.id.editRate)
		val calculateButton: Button = findViewById(R.id.buttonCalculate)
		val resultTextView: TextView = findViewById(R.id.textResult)

		calculateButton.setOnClickListener {
			val units = unitsEditText.text.toString().toDoubleOrNull()
			val rate = rateEditText.text.toString().toDoubleOrNull()

			if (units == null || rate == null) {
				resultTextView.text = "Please enter valid numeric values."
				return@setOnClickListener
			}

			val total = units * rate
			resultTextView.text = "Total Bill: ${'$'}${"%.2f".format(total)}"
		}
	}
}