package com.example.tiketbis

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val pilih : Spinner = findViewById(R.id.spinner)
        getCurrentData(pilih)

        pesan.setOnClickListener{
            val intent = Intent(this, ListBus::class.java)
            startActivity(intent)
        }
    }

    private fun getCurrentData(pilih: Spinner) {
        pilih.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    p2: Int,
                    p3: Long
                ) {
                    if (pilih.getSelectedItem().toString().equals("JAKARTA")){
                        Toast.makeText(this@Home, "You clicked Jakarta.", Toast.LENGTH_SHORT).show()

                    } else if (pilih.getSelectedItem().toString().equals("BANDUNG")) {

                        Toast.makeText(this@Home, "You clicked Bandung.", Toast.LENGTH_SHORT).show()

                    }else if (pilih.getSelectedItem().toString().equals("PURWOKERTO")) {

                        Toast.makeText(this@Home, "You clicked Purwokerto.", Toast.LENGTH_SHORT).show()
                    }
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
    }
}
