package com.example.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    private lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // getting the data from the previous activity
        player = intent.getParcelableExtra<Player>(PLAYER)!!

//        Toast.makeText(this,selectedLeague,Toast.LENGTH_SHORT).show()

        beginnerBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the skill to beginner
            player.skill = "beginner"

        }

        ballerBtn.setOnClickListener {

            // changing background
            changeBackground(it)

            // remove other button's background to normal
            removeOtherButtonBackground(it)

            // set the skill to baller
            player.skill = "baller"

        }

        finishBtn.setOnClickListener {

            callFinishActivity(player)
        }



    }

    private fun callFinishActivity(player: Player) {

        // if user doesn't select any league
        if (player.skill != ""){

            // intent for transfer the handle from current activity to Final Activity
            val finalActivityIntent = Intent(this, FinalActivity::class.java)

            // putting data
            finalActivityIntent.putExtra(PLAYER, player)

            // calling the skill activity
            startActivity(finalActivityIntent)

        }
        else{

            // show message to select the league
            Toast.makeText(this,"Please select the skill", Toast.LENGTH_SHORT).show()
        }

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