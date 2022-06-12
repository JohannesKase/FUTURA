package com.dicoding.capstone_project

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        supportActionBar?.hide()

        val saintek = intent.getIntExtra(EXTRA_SAINTEK, -1)
        val soshum = intent.getIntExtra(EXTRA_SOSHUM, -1)

        if (saintek == 0) {
            //Spinner Universitas
            var items = arrayOf(
                "Pilih Universitas",
                "Universitas Siliwangi",
                "Universitas Andalas",
                "Universitas Sumatera Utara"
            )
            val spinner: Spinner = findViewById(R.id.uni_spinner)
            val spinnerAdapter =
                object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items) {
                    override fun isEnabled(position: Int): Boolean {
                        return position != 0
                    }

                    override fun getDropDownView(
                        position: Int,
                        convertView: View?,
                        parent: ViewGroup
                    ): View {
                        val view: TextView =
                            super.getDropDownView(position, convertView, parent) as TextView
                        if (position == 0) {
                            view.setTextColor(Color.GRAY)
                        } else {
                        }
                        return view
                    }
                }
            spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = spinnerAdapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {}

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val value = parent!!.getItemAtPosition(position).toString()
                    if (value == items[0]) {
                        (view as TextView).setTextColor(Color.GRAY)
                    }
                }

            }

            //Spinner Jurusan
            var item =
                arrayOf("Pilih Jurusan", "Pendidikan Matematika", "Pendidikan Dokter", "Farmasi")
            val spinnerJurusan: Spinner = findViewById(R.id.jurusan_spinner)
            val spinnerAdapters =
                object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, item) {
                    override fun isEnabled(position: Int): Boolean {
                        return position != 0
                    }

                    override fun getDropDownView(
                        position: Int,
                        convertView: View?,
                        parent: ViewGroup
                    ): View {
                        val view: TextView =
                            super.getDropDownView(position, convertView, parent) as TextView
                        if (position == 0) {
                            view.setTextColor(Color.GRAY)
                        } else {
                        }
                        return view
                    }
                }
            spinnerAdapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerJurusan.adapter = spinnerAdapters

            spinnerJurusan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {}

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val value = parent!!.getItemAtPosition(position).toString()
                    if (value == item[0]) {
                        (view as TextView).setTextColor(Color.GRAY)
                    }
                }
            }

            val buttonLanjutSaintek = findViewById<Button>(R.id.btnLanjut)
            buttonLanjutSaintek.setOnClickListener {
                var dataUni = spinner.selectedItem.toString()
                var dataJurusan = spinnerJurusan.selectedItem.toString()
                val intent = Intent(this, ScoreScientekActivity::class.java)
                intent.putExtra(ScoreSoshumActivity.EXTRA_UNI, dataUni)
                intent.putExtra(ScoreSoshumActivity.EXTRA_JURUSAN, dataJurusan)
                startActivity(intent)
            }
        }

        if (soshum == 1) {
            //Spinner Universitas
            var items =
                arrayOf(
                    "Pilih Universitas",
                    "Universitas Syiah Kuala",
                    "Universitas Negeri Medan",
                    "Universitas Indonesia"
                )
            val spinner: Spinner = findViewById(R.id.uni_spinner)
            val spinnerAdapter =
                object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items) {
                    override fun isEnabled(position: Int): Boolean {
                        return position != 0
                    }

                    override fun getDropDownView(
                        position: Int,
                        convertView: View?,
                        parent: ViewGroup
                    ): View {
                        val view: TextView =
                            super.getDropDownView(position, convertView, parent) as TextView
                        if (position == 0) {
                            view.setTextColor(Color.GRAY)
                        } else {
                        }
                        return view
                    }
                }
            spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = spinnerAdapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {}

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val value = parent!!.getItemAtPosition(position).toString()
                    if (value == items[0]) {
                        (view as TextView).setTextColor(Color.GRAY)
                    }
                }
            }
            //Spinner Jurusan
            var item = arrayOf("Pilih Jurusan", "Ekonomi Pembangunan", "Manajemen", "Akutansi")
            val spinnerJurusan: Spinner = findViewById(R.id.jurusan_spinner)
            val spinnerAdapters =
                object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, item) {
                    override fun isEnabled(position: Int): Boolean {
                        return position != 0
                    }

                    override fun getDropDownView(
                        position: Int,
                        convertView: View?,
                        parent: ViewGroup
                    ): View {
                        val view: TextView =
                            super.getDropDownView(position, convertView, parent) as TextView
                        if (position == 0) {
                            view.setTextColor(Color.GRAY)
                        } else {
                        }
                        return view
                    }
                }
            spinnerAdapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerJurusan.adapter = spinnerAdapters

            spinnerJurusan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {}

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val value = parent!!.getItemAtPosition(position).toString()
                    if (value == item[0]) {
                        (view as TextView).setTextColor(Color.GRAY)
                    }
                }
            }
            val buttonLanjutSoshum = findViewById<Button>(R.id.btnLanjut)
            buttonLanjutSoshum.setOnClickListener {
                var dataUni = spinner.selectedItem.toString()
                var dataJurusan = spinnerJurusan.selectedItem.toString()
                val intent = Intent(this, ScoreSoshumActivity::class.java)
                intent.putExtra(ScoreSoshumActivity.EXTRA_UNI, dataUni)
                intent.putExtra(ScoreSoshumActivity.EXTRA_JURUSAN, dataJurusan)
                startActivity(intent)
            }
        }
    }

    companion object {
        const val EXTRA_SAINTEK = "extra_saintek"
        const val EXTRA_SOSHUM = "extra_soshum"
    }
}