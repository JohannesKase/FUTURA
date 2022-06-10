package com.dicoding.capstone_project

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreSoshumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_soshum)
        supportActionBar?.hide()

    }

    fun onClickScoreSoshum(view: View) {
        val namaUni = intent.getStringExtra(EXTRA_UNI) as String
        val namaJurusan = intent.getStringExtra(EXTRA_JURUSAN) as String
        var MyLayout = layoutInflater.inflate(R.layout.popup, null)
        val myDialogBuilder = AlertDialog.Builder(this).apply {
            setView(MyLayout)
        }
        var myDialog = myDialogBuilder.create()
        var nilai = MyLayout.findViewById<TextView>(R.id.tv_hasil)
        var temp = String.format("%.2f%%", 95.56)
        nilai.text = getString(R.string.hasil, temp)
        var deskripsi = MyLayout.findViewById<TextView>(R.id.tv_deskripsi)
        deskripsi.text = getString(R.string.result, namaUni, namaJurusan, temp)
        var kembali = MyLayout.findViewById<Button>(R.id.btn_kembali)
        kembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            myDialog.cancel()
        }
        myDialog.show()
    }

    companion object {
        const val EXTRA_UNI = "extra_uni"
        const val EXTRA_JURUSAN = "extra_jurusan"
    }
}