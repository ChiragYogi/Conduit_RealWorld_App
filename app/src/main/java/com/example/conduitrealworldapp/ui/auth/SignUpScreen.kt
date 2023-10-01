package com.example.conduitrealworldapp.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.conduitrealworldapp.R
import com.example.conduitrealworldapp.components.AppTextField
import com.example.conduitrealworldapp.ui.auth.viewmodel.SignUpViewModel

@Composable
fun SignUpScreen(modifier: Modifier, navController: NavHostController) {

    val signUpViewModel: SignUpViewModel = viewModel()
    SignUpScreenContent(signUpViewModel,onSignUpClick={
        //do signup api call here
    },modifier)
}

@Composable
fun SignUpScreenContent(
    signUpViewModel: SignUpViewModel,
    onSignUpClick: () -> Unit,
    modifier: Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {

        val paddingTopLeftRight = Modifier.padding(
            top = dimensionResource(id = R.dimen.dp_18),
            start = dimensionResource(id = R.dimen.dp_18),
            end = dimensionResource(id = R.dimen.dp_18)
        )

        Text(
            text = stringResource(id = R.string.label_sign_up),
            style = TextStyle(
                color = colorResource(
                    id = R.color.black_light_title,
                ),
                fontSize = 32.sp,
            ),

            )

        Text(
            text = stringResource(id = R.string.label_have_an_account),
            style = TextStyle(
                color = colorResource(
                    id = R.color.primary_color
                ),
                fontSize = 16.sp
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = dimensionResource(id = R.dimen.dp_18))
        )

        AppTextField(
            textFieldValue = signUpViewModel.email,
            onValueChange = { value -> signUpViewModel.updateEmail(value) },
            hint = stringResource(id = R.string.hint_email), modifier = paddingTopLeftRight
        )

        AppTextField(
            textFieldValue = signUpViewModel.userName,
            onValueChange = { value -> signUpViewModel.updateUserName(value) },
            hint = stringResource(id = R.string.hint_user_name), modifier = paddingTopLeftRight
        )

        AppTextField(
            textFieldValue = signUpViewModel.password,
            onValueChange = { value -> signUpViewModel.updatePassword(value) },
            hint = stringResource(id = R.string.hint_password), modifier = paddingTopLeftRight
        )

        Button(
            onClick = onSignUpClick, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.primary_color)
            ), shape = RoundedCornerShape(8.dp), modifier = paddingTopLeftRight,
        ) {
            Text(text = stringResource(id = R.string.label_sign_up),style= TextStyle(
                fontSize = 16.sp, fontWeight = FontWeight.Normal,
                color = Color.White
            )
            )
        }

    }
}
