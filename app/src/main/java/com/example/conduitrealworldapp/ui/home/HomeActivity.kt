package com.example.conduitrealworldapp.ui.home


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.conduitrealworldapp.ui.auth.SignInScreen
import com.example.conduitrealworldapp.ui.auth.SignUpScreen
import com.example.conduitrealworldapp.ui.theme.AppTheme

class HomeActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Sign in") {
                    composable("Sign in") {
                        SignInScreen(modifier = Modifier.fillMaxSize(),navController)
                    }
                    composable("Sign up") {
                        SignUpScreen(
                        modifier = Modifier.fillMaxSize(),
                        navController = navController
                    )
                    }
                    /*...*/
                }

            }
        }
    }
}