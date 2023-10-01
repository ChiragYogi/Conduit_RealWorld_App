package com.example.conduitrealworldapp.components

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.conduitrealworldapp.R

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    textFieldValue: String, onValueChange: (String) -> Unit,
    hint: String,
    maxLine: Int = 1,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Text,
        imeAction = ImeAction.Next
    ),
    visualTransformation: VisualTransformation = VisualTransformation.None,
     textStyle: TextStyle = TextStyle(
        fontSize = 16.sp, fontWeight = FontWeight.Normal,
        color = Color.Black
    )
) {

    val appTextFieldInteractionSource = remember { MutableInteractionSource() }
    val isFocused by appTextFieldInteractionSource.collectIsFocusedAsState()

    BasicTextField(
        value = textFieldValue,
        onValueChange = onValueChange,
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .border(
                        width = 1.dp,
                        color = if (isFocused) colorResource(id = R.color.primary_color) else colorResource(
                            id = R.color.black_light_title
                        ),
                        shape = RoundedCornerShape(corner = CornerSize(12.dp))
                    )
                    .padding(16.dp)
                    .fillMaxWidth()

            ) {
                if (textFieldValue.isEmpty() && !isFocused) {
                    Text(
                        hint, fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray
                    )
                }
                innerTextField()
            }
        },
        textStyle = textStyle,
        maxLines = maxLine,
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation,
        modifier = modifier
    )

}