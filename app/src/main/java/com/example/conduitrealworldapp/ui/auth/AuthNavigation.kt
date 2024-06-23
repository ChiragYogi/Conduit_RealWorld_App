package com.example.conduitrealworldapp.ui.auth



enum class AuthScreen {
    LOGIN,
    SIGNUP
}
sealed class AuthNavigation(val route: String) {
    object SignUp : AuthNavigation(AuthScreen.SIGNUP.name)
    object Login : AuthNavigation(AuthScreen.LOGIN.name)
}