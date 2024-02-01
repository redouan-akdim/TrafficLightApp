package com.akdim.trafficlightapp

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trafficLightButton.setBackgroundColor(Color.RED)

        // Click listener for the traffic light button
        binding.trafficLightButton.setOnClickListener{
            if (isStop) {
                // Change button
                binding.trafficLightButton.text = "Go"
                binding.trafficLightButton.setBackgroundColor(Color.GREEN)

                isStop = false
                isGo = true
                isWait = false

                binding.greenTrafficLightImageView.visibility = View.VISIBLE
                binding.redTrafficLightImageView.visibility = View.INVISIBLE
                binding.yellowTrafficLightImageView.visibility = View.INVISIBLE
            }
            else if(isGo){
                // Change button
                binding.trafficLightButton.text = "Wait"
                binding.trafficLightButton.setBackgroundColor(Color.YELLOW)

                isStop = false
                isGo = false
                isWait = true

                binding.greenTrafficLightImageView.visibility = View.INVISIBLE
                binding.redTrafficLightImageView.visibility = View.INVISIBLE
                binding.yellowTrafficLightImageView.visibility = View.VISIBLE
            }
            else{
                // Change button
                binding.trafficLightButton.text = "Stop"
                binding.trafficLightButton.setBackgroundColor(Color.RED)

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