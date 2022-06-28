package com.example.bancodedadossqlite.UI

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancodedadossqlite.DATA.MatchesApi
import com.example.bancodedadossqlite.databinding.ActivityMainBinding
import com.google.gson.Gson
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Url
import retrofit2.Retrofit as Retrofit1

class MainActivity : AppCompatActivity() {
    private lateinit var biding : ActivityMainBinding
    private lateinit var matchesApi : MatchesApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        httpClient()
        matchesList()
        matchesRefresh()
        floatingActionButton()

    }

    private fun httpClient() {
       // TODO("RETROFIT")
        val retro = retrofit2.Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/erickferrareto/matches_api/master")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val matchesApi = retro.create(MatchesApi.class);
    }




    private fun floatingActionButton() {
        //TODO("Not yet implemented")
    }

    private fun matchesRefresh() {
        //TODO("atualizar as partidas")
    }

    private fun matchesList() {
        //TODO("Listar as partidas")
    }
}