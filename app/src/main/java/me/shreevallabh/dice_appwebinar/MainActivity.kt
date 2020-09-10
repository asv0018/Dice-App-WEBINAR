package me.shreevallabh.dice_appwebinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    // To create a function in kotlin, we use the keyword called "fun fun_name(){}"
    fun rollMe(view: View) {
        button.text = "Roll me again"
        val number = generateRandomNumber()
        if(number==1){
            imageView.setImageResource(R.drawable.dice1)
        }else if(number==2){
            imageView.setImageResource(R.drawable.dice2)
        }else if(number==3){
            imageView.setImageResource(R.drawable.dice3)
        }else if(number==4){
            imageView.setImageResource(R.drawable.dice4)
        }else if(number==5){
            imageView.setImageResource(R.drawable.dice5)
        }else if(number==6){
            imageView.setImageResource(R.drawable.dice6)
        }
    }

    fun generateRandomNumber(): Int {
        return (1..6).random()
    }

}