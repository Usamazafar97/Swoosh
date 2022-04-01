package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    // passing the selected league to the next activity
    var leagueSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        menBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to men
            leagueSelected = "men"
        }

        womenBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to women
            leagueSelected = "women"
        }

        coedBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to co-ed
            leagueSelected = "co-ed"
        }

        nextBtn.setOnClickListener {

            callSkillActivity(leagueSelected)
        }
    }

    private fun callSkillActivity(leagueSelected: String) {

        // intent for transfer the handle from current activity to Skill Activity
        val skillActivityIntent = Intent(this, SkillActivity::class.java)

        // adding the data to intent
        skillActivityIntent.putExtra(LEAGUE_SELECTED, leagueSelected)

        // calling the skill activity
        startActivity(skillActivityIntent)
    }

    private fun removeOtherButtonBackground(view: View) {

        // checking the view (button), and normalize the remaining buttons to normal background
        when(view){
            menBtn -> {
                womenBtn.setBackgroundResource(R.drawable.swoosh_button)
                coedBtn.setBackgroundResource(R.drawable.swoosh_button)
            }
            womenBtn -> {
                menBtn.setBackgroundResource(R.drawable.swoosh_button)
                coedBtn.setBackgroundResource(R.drawable.swoosh_button)
            }
            coedBtn -> {
                womenBtn.setBackgroundResource(R.drawable.swoosh_button)
                menBtn.setBackgroundResource(R.drawable.swoosh_button)
            }

        }
    }

    private fun changeBackground(view: View?) {

        view?.setBackgroundResource(R.drawable.swoosh_button_checked)
    }


}