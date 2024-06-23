package com.example.conduitrealworldapp.ui.auth.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.conduitrealworldapp.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.conduitrealworldapp.components.AppTextField
import com.example.conduitrealworldapp.ui.auth.viewmodel.SignInViewModel



@Composable
fun SignInScreen(modifier: Modifier, navController: NavHostController,) {

   // val signInViewModel:SignInViewModel = viewModel()
    SignInScreenContent(modifier = modifier, onSignClick = {
        //call signup api here
        navController.navigate("Sign up")
    })
}

@Composable
fun SignInScreenContent(
    modifier: Modifier,
    viewModel: SignInViewModel = viewModel(),
    onSignClick: () -> Unit
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
            text = stringResource(id = R.string.label_sign_in),
            style = TextStyle(
                color = colorResource(
                    id = R.color.black_light_title,
                ),
                fontSize = 32.sp,
            ),

            )

        Text(
            text = stringResource(id = R.string.label_need_an_account),
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
            textFieldValue = viewModel.email,
            onValueChange = { value -> viewModel.updateEmail(value) },
            hint = stringResource(id = R.string.hint_email), modifier = paddingTopLeftRight
        )

        AppTextField(
            textFieldValue = viewModel.password,
            onValueChange = { value -> viewModel.updatePassword(value) },
            hint = stringResource(id = R.string.hint_password), modifier = paddingTopLeftRight
        )

        Button(
            onClick = onSignClick, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.primary_color)
            ), shape = RoundedCornerShape(8.dp), modifier = paddingTopLeftRight
        ) {
            Text(text = stringResource(id = R.string.label_sign_in),style=TextStyle(
                fontSize = 16.sp, fontWeight = FontWeight.Normal,
                color = Color.White
            ))
        }

    }
}

