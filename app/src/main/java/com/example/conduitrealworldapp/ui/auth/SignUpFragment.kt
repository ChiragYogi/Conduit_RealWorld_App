package com.example.conduitrealworldapp.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.conduitrealworldapp.databinding.AuthSignUpFragmentBinding

class SignUpFragment:Fragment() {

    lateinit var binding:AuthSignUpFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AuthSignUpFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListener()
    }

    private fun setUpClickListener() {
        binding.textViewHaveAnAccount.setOnClickListener {
                findNavController().navigateUp()
        }

        binding.buttonSignUp.setOnClickListener {
            validateAndRegisterUser()
        }
    }

    private fun validateAndRegisterUser() {

    }


}