@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.conduitrealworldapp.ui.auth


import android.R.attr
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.conduitrealworldapp.R
import android.R.attr.textColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(modifier: Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        var email by remember { mutableStateOf("") }
        Text(
            text = stringResource(id = R.string.label_sign_in),
            style = TextStyle(
                color = colorResource(
                    id = R.color.black_light_title,
                ),
                fontSize = 32.sp,
                textAlign = TextAlign.Center
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

        TextField(
            value = email,
            onValueChange = { value ->
                email = value
            },
            label = { Text(stringResource(id = R.string.hint_email)) },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Gray,
                disabledTextColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = dimensionResource(id = R.dimen.dp_18),
                    start = dimensionResource(id = R.dimen.dp_18),
                    end = dimensionResource(id = R.dimen.dp_18)
                )
                .heightIn(min = dimensionResource(id = R.dimen.dp_54))
                .border(
                    width = dimensionResource(id = R.dimen.dp_2),
                    color = if (email.isNotEmpty() && email.isNotBlank()) colorResource(id = R.color.primary_color) else colorResource(
                        id = R.color.black
                    ),
                    shape = RoundedCornerShape(corner = CornerSize(12.dp))
                )

        )
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun SignInScreenPreview() {
    SignInScreen(modifier = Modifier.fillMaxWidth())
}