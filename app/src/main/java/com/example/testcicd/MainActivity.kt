package com.example.testcicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var companyId: Int = 221
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate: test ")
        Toast.makeText(applicationContext, "Company ID $companyId", Toast.LENGTH_LONG).show()
    }
}

