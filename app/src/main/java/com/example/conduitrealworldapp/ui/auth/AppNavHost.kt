package com.example.conduitrealworldapp.ui.auth

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.navigation.compose.composable
import com.example.conduitrealworldapp.ui.auth.screens.SignInScreen
import com.example.conduitrealworldapp.ui.auth.screens.SignUpScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = AuthNavigation.Login.route// other parameters
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(AuthNavigation.Login.route) {
            SignInScreen(modifier, navController)
        }
        composable(AuthNavigation.SignUp.route) {
            SignUpScreen(modifier = modifier, navController = navController)
        }
    }
}