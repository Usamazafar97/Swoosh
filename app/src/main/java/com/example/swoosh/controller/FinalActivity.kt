package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(PLAYER)

        finalWords.text = "Looking for a ${player?.leagueSelected} ${player?.skill} league near you..."
    }
}