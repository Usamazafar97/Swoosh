package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // getting the data from the previous activity
        val selectedLeague = intent.getStringExtra(LEAGUE_SELECTED)

        Toast.makeText(this,selectedLeague,Toast.LENGTH_SHORT).show()

    }
}