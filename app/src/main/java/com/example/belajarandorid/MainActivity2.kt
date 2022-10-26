package com.example.belajarandorid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(){

    var sisi: Double? = null
    var volume: Double? = null
    var luas: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "Kalkulator Kubus"

        findViewById<Button>(R.id.buttonVolume).setOnClickListener{
            if (findViewById<EditText>(R.id.panjangRusuk).getText().toString().trim().isEmpty()){
                Toast.makeText(this@MainActivity2, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            } else {
                sisi = findViewById<EditText>(R.id.panjangRusuk).getText().toString().toDouble()
                volume = sisi!! * sisi!! * sisi!!
                findViewById<TextView>(R.id.textVolume).setText(volume.toString())
            }
        }
        findViewById<Button>(R.id.buttonLuas).setOnClickListener{
            if (findViewById<EditText>(R.id.panjangRusuk).getText().toString().trim().isEmpty()){
                Toast.makeText(this@MainActivity2, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            } else {
                sisi = findViewById<EditText>(R.id.panjangRusuk).getText().toString().toDouble()
                luas = 6 * sisi!! * sisi!!
                findViewById<TextView>(R.id.textLuas).setText(luas.toString())
            }
        }
    }

}