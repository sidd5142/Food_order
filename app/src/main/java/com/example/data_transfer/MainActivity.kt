package com.example.data_transfer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val key = " com.example.data_transfer.MainActivity.Key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {

            val ordersList = edt1.text.toString()+" " + edt2.text.toString()+" " + edt3.text.toString()+" " +
                    edt4.text.toString()+" "


            intent = Intent(this,orders::class.java)
            intent.putExtra(key, ordersList)
            startActivity(intent)

        }
    }
}