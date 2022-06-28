package com.example.bancodedadossqlite.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.bancodedadossqlite.databinding.ActivityDetailBinding
import com.example.bancodedadossqlite.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    lateinit private var biding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(biding.root)
        setSupportActionBar(biding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }


}