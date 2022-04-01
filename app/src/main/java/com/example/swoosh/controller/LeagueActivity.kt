package com.example.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    // passing the selected league to the next activity
    var player =  Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        menBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to men
            player.leagueSelected = "men"
        }

        womenBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to women
            player.leagueSelected = "women"
        }

        coedBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the selected league to co-ed
            player.leagueSelected = "co-ed"
        }

        nextBtn.setOnClickListener {

            callSkillActivity(player)
        }
    }

    private fun callSkillActivity(leagueSelected: Player) {

        // if user doesn't select any league
        if (player.leagueSelected != ""){

            // intent for transfer the handle from current activity to Skill Activity
            val skillActivityIntent = Intent(this, SkillActivity::class.java)

            // adding the data to intent
            skillActivityIntent.putExtra(PLAYER, player)

            // calling the skill activity
            startActivity(skillActivityIntent)

        }
        else{

            // show message to select the league
            Toast.makeText(this,"Please select the league",Toast.LENGTH_SHORT).show()
        }
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