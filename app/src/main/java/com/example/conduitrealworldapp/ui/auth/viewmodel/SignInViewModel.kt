package com.example.conduitrealworldapp.ui.auth.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class SignInViewModel:ViewModel() {

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set
    fun updateEmail(emailValue: String){
        email = emailValue
    }

    fun updatePassword(passwordValue: String){
        password = passwordValue
    }
}