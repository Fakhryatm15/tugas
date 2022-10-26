package com.example.belajarandorid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
class Adapter(val mhs: LiveData<List<Mahasiswa>>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(items: View) : RecyclerView.ViewHolder(items)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.data_mahasiswa, parent, false)
        return ViewHolder(layoutInflater)
    }
    override fun getItemCount(): Int {
        return mhs.value?.size ?: 0
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            val tvNama = findViewById<TextView>(R.id.textNama)
            val tvNIM = findViewById<TextView>(R.id.textNim)
            val tvKelas = findViewById<TextView>(R.id.textKelas)
            tvNama.text = mhs.value?.get(position)?.nama ?: ""
            tvNIM.text = mhs.value?.get(position)?.nim ?: ""
            tvKelas.text = mhs.value?.get(position)?.kelas ?: ""
        }
    }
}
