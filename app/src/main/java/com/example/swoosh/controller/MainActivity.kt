package com.example.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {

            // intent for transfer the handle from current activity to League Activity
            val leagueActivityIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueActivityIntent)
        }

    }
}