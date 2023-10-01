package com.example.conduitrealworldapp.ui.auth.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel:ViewModel() {

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var userName by mutableStateOf("")
        private set
    fun updateEmail(emailValue: String){
        email = emailValue
    }

    fun updatePassword(passwordValue: String){
        password = passwordValue
    }

    fun updateUserName(userNameValue: String){
        userName = userNameValue
    }
}
