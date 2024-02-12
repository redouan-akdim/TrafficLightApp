package com.akdim.trafficlightapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.akdim.trafficlightapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var trafficLightButton: Button
    private lateinit var binding: ActivityMainBinding

    // Flags that determine the traffic light state
    private var isGo:Boolean = false
    private var isWait:Boolean = false
    private var isStop:Boolean = true

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        trafficLightButton = binding.trafficLightButton

        // Set initial color of button to red
        trafficLightButton.setBackgroundColor(Color.RED)

        // Click listener for the traffic light button
        trafficLightButton.setOnClickListener{
            if (isStop) {
                // Change button
                trafficLightButton.text = "Go"
                trafficLightButton.setBackgroundColor(Color.GREEN)

                isStop = false
                isGo = true
                isWait = false

                binding.greenTrafficLightImageView.visibility = View.VISIBLE
                binding.redTrafficLightImageView.visibility = View.INVISIBLE
                binding.yellowTrafficLightImageView.visibility = View.INVISIBLE
            }
            else if(isGo){
                // Change button
                trafficLightButton.text = "Wait"
                trafficLightButton.setBackgroundColor(Color.YELLOW)

                isStop = false
                isGo = false
                isWait = true

                binding.greenTrafficLightImageView.visibility = View.INVISIBLE
                binding.redTrafficLightImageView.visibility = View.INVISIBLE
                binding.yellowTrafficLightImageView.visibility = View.VISIBLE
            }
            else{
                // Change button
                trafficLightButton.text = "Stop"
                trafficLightButton.setBackgroundColor(Color.RED)

                isStop = true
                isGo = false
                isWait = false

                binding.greenTrafficLightImageView.visibility = View.INVISIBLE
                binding.redTrafficLightImageView.visibility = View.VISIBLE
                binding.yellowTrafficLightImageView.visibility = View.INVISIBLE
            }
        }
    }
}