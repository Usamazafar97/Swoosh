package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        mensBtn.setOnClickListener {

            // changing background
            changeBackground(it)
        }

        womenBtn.setOnClickListener {

            // changing background
            changeBackground(it)
        }

        coedBtn.setOnClickListener {

            // changing background
            changeBackground(it)
        }

        nextBtn.setOnClickListener {

            // intent for transfer the handle from current activity to League Activity
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillActivityIntent)
        }
    }

    private fun changeBackground(view: View?) {

        view?.setBackgroundResource(R.drawable.swoosh_button_checked)
    }


}