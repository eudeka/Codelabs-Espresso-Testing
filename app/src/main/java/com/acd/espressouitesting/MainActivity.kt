package com.acd.espressouitesting

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var hasil: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hasil = findViewById(R.id.hasil)

    }

    fun onClick(view: View) {

        when (view.getId()) {
            R.id.kuda -> hasil!!.text = "Kuda"
            R.id.kelinci -> hasil!!.text = "Kelinci"
            R.id.kucing -> hasil!!.text = "Kucing"
            R.id.sapi -> hasil!!.text = "Sapi"
            R.id.kambing -> hasil!!.text = "Kambing"
        }
    }
}