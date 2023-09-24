package com.example.conduitrealworldapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.conduitrealworldapp.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding:HomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}