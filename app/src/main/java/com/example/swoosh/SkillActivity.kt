package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // getting the data from the previous activity
        val selectedLeague = intent.getStringExtra(LEAGUE_SELECTED)

//        Toast.makeText(this,selectedLeague,Toast.LENGTH_SHORT).show()

        beginnerBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the skill to beginner
            skill = "beginner"

        }

        ballerBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the skill to baller
            skill = "baller"

        }

        finishBtn.setOnClickListener {

            callFinishActivity(skill, selectedLeague)
        }



    }

    private fun callFinishActivity(skill: String, selectedLeague: String?) {

        // intent for transfer the handle from current activity to Final Activity
        val finalActivityIntent = Intent(this, FinalActivity::class.java)

        // putting data
        finalActivityIntent.putExtra(LEAGUE_SELECTED, selectedLeague)
        finalActivityIntent.putExtra(SKILL, skill)

        // calling the skill activity
        startActivity(finalActivityIntent)
    }

    private fun removeOtherButtonBackground(view: View) {

        // checking the view (button), and normalize the remaining buttons to normal background
        when(view){
            beginnerBtn -> {
                ballerBtn.setBackgroundResource(R.drawable.swoosh_button)
            }
            ballerBtn -> {
                beginnerBtn.setBackgroundResource(R.drawable.swoosh_button)
            }

        }
    }


    private fun changeBackground(view: View?) {

        view?.setBackgroundResource(R.drawable.swoosh_button_checked)
    }
}