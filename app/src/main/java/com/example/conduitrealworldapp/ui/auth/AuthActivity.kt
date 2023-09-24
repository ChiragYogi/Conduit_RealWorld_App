package com.example.conduitrealworldapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.conduitrealworldapp.R
import com.example.conduitrealworldapp.databinding.AuthActivityBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: AuthActivityBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AuthActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNavController()
    }

    private fun setUpNavController() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_auth_host_fragment) as NavHostFragment

        navController = navHostFragment.navController

        //setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}