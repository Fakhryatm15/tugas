package com.example.belajarandorid
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Biodata Mahasiswa"

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Detail>()

        data.add(Detail("Nafia Albashita Setyawan", "205150200111005", "Menulis", R.drawable.nafia))
        data.add(Detail("Fakhriyyatum Muslimah", "205150201111004", "Membaca & Menonton", R.drawable.eva))
        data.add(Detail("Zahra Diva", "205150201111005", "Membaca & Menonton", R.drawable.diva))
        // This will pass the ArrayList to our Adapter
        val adapter = AdapterBiodata(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}