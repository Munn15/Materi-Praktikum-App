package com.example.praktikum03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikum03.databinding.ActivityMainBinding

class semester1 : AppCompatActivity() {
    val modelList = ArrayList<Model>()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initData()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        val adapter = ExpendableRecyclerAdapter(modelList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }

    private fun initData() {
        modelList.add(Model(
            "Algoritma Pemrograman",
            "Dosen: Pak Jemmy",
            "",
            "Pengenalan Python dan Tipe Data"
        ))

        modelList.add(Model(
            "Dasar Pemrograman",
            "Dosen: Pak Ryan",
            "",
            "Operator"
        ))

        modelList.add(Model(
            "Pengantar Teknologi Informasi",
            "Dosen: Pak Jefry",
            "",
            "MANAJEMEN DOKUMEN DENGAN MICROSOFT WORD "
        ))

        modelList.add(Model(
            "",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy"
        ))

        modelList.add(Model(
            "",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy"
        ))
        modelList.add(Model(
            "",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy "
        ))
    }
}