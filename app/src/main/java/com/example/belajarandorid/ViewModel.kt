package com.example.belajarandorid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class ViewModel(val DataMahasiswa: ListMahasiswa): ViewModel() {
    var mahasiswa = MutableLiveData<List<Mahasiswa>>()
    fun getMahasiswa(): LiveData<List<Mahasiswa>>{
        mahasiswa .value = DataMahasiswa.getMahasiswa()
        return mahasiswa
    }
    fun tambahMahasiswa(newMhs: Mahasiswa){
        DataMahasiswa.tambahMahasiswa(newMhs)
        mahasiswa .value = DataMahasiswa.getMahasiswa()
    }
}
