package com.akdim.trafficlightapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.akdim.trafficlightapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var trafficLightButton: Button
    private lateinit var binding: ActivityMainBinding

    // Define the paths of the traffic lights
    private var redlight = "green_light.png"
    private var greenlight = "green_light.png"
    private var yellowlight = "green_light.png"

    private var count = 0       // 0 -> Red, 1 -> Green, 2 -> Yellow

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val trafficLightImageView = binding.trafficLightImageView           // Image showing the traffic light

        /*binding.trafficLightButton.setOnClickListener{
            count++
            println(binding.trafficLightImageView)
            binding.trafficLightImageView.setImageResource(R.drawable.green_light)
        }*/
    }
}