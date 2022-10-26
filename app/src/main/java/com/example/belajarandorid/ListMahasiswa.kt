package com.example.belajarandorid

class ListMahasiswa {
    var ListMhs = mutableListOf<Mahasiswa>()
    init {
        ListMhs.add(Mahasiswa("Kin Seon Ho ", "205112345678904", "PSI-E"))
    }
    fun getMahasiswa() = ListMhs
    fun tambahMahasiswa(newMhs: Mahasiswa){
        ListMhs.add(newMhs)
        getMahasiswa()
    }
}
