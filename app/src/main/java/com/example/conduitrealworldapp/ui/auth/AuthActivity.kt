package com.example.conduitrealworldapp.ui.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.conduitrealworldapp.ui.auth.screens.SignInScreen
import com.example.conduitrealworldapp.ui.theme.AppTheme

class AuthActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                val navController = rememberNavController()
                AppNavHost(navController=navController)
            }
        }
    }
}

