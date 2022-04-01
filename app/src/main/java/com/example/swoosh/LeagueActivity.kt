package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        mensBtn.setOnClickListener {

            // toggling
//            mensBtn.isEnabled = !mensBtn.isEnabled

//            mensBtn.isEnabled = true

            Toast.makeText(this, "Men Clicked", Toast.LENGTH_SHORT).show()
        }

        womenBtn.setOnClickListener {

//            womenBtn.isEnabled = !mensBtn.isEnabled

            Toast.makeText(this, "Women Clicked", Toast.LENGTH_SHORT).show()
        }

        nextBtn.setOnClickListener {

            // intent for transfer the handle from current activity to League Activity
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillActivityIntent)
        }
    }
}