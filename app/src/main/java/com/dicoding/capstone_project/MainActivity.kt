package com.dicoding.capstone_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun onClickSaintek(view: View) {
        val intent = Intent(this, DataActivity::class.java)
        intent.putExtra(DataActivity.EXTRA_SAINTEK, 0)
        startActivity(intent)
    }

    fun onClickSoshum(view: View) {
        val intent = Intent(this, DataActivity::class.java)
        intent.putExtra(DataActivity.EXTRA_SOSHUM, 1)
        startActivity(intent)
    }

}