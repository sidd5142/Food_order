package com.example.data_transfer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_orders.*

class orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val orderOfCustomer = intent.getStringExtra(MainActivity.key)
        val paytm = findViewById<Button>(R.id.payment)

        textOrder.text = orderOfCustomer.toString()

        paytm.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.paytmbank.com/")
            startActivity(intent)
        }

    }
}