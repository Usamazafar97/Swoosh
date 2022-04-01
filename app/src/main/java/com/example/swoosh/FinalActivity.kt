package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val skill = intent.getStringExtra(SKILL)
        val leagueSelected = intent.getStringExtra(LEAGUE_SELECTED)

        finalWords.text = "Looking for a $leagueSelected $skill league near you..."
    }
}