package com.example.belajarandorid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Biodata: AppCompatActivity(){

    var namaa: String? = null
    var nimm: String? = null
    var emaill: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        title = "Biodata"
        findViewById<Button>(R.id.simpan).setOnClickListener{
            if (findViewById<EditText>(R.id.nama).getText().toString().trim().isEmpty()){
                Toast.makeText(this@Biodata, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            } else {
                namaa = findViewById<EditText>(R.id.nama).getText().toString()
                findViewById<TextView>(R.id.textNama).setText(namaa.toString())
                nimm = findViewById<EditText>(R.id.nim).getText().toString()
                findViewById<TextView>(R.id.textNim).setText(nimm.toString())
                emaill = findViewById<EditText>(R.id.email).getText().toString()
                findViewById<TextView>(R.id.textEmail).setText(emaill.toString())

            }
        }
        findViewById<Button>(R.id.edit).setOnClickListener{
            Toast.makeText(applicationContext, "Anda bisa mulai mengedit!", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.foto).setOnClickListener{
            Toast.makeText(applicationContext, "Anda bisa melihat foto!", Toast.LENGTH_SHORT).show()
        }
    }

}