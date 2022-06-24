package com.example.bancodedadossqlite

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancodedadossqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var biding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)


    }
}