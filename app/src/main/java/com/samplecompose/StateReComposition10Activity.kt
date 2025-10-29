package com.samplecompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samplecompose.ui.theme.SampleComposeTheme

class StateReComposition10Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleComposeTheme {
                // ButtonTypes()

            }
        }
    }
}

@Composable
fun ButtonTypes() {
    var count by remember {
        mutableIntStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { count++ }) {
            Text("count= $count")
        }
        Spacer(modifier = Modifier.size(25.dp))
        Text("count= $count")
    }
}

@Composable
fun StylingText() {
    val myFont = FontFamily(Font(R.font.alegreya_sc))
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        text = stringResource(R.string.reza_karimnia),
        color = Color.Red,
        fontSize = 24.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Cursive
    )
}

@Composable
fun TextField12Jetpack() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val context = LocalContext.current
        var textNewValue by remember {
            mutableStateOf("")
        }
        var textNewValue2 by remember {
            mutableStateOf("")
        }
        val keyboardControl = LocalSoftwareKeyboardController.current
        val focusManager = LocalFocusManager.current
        Column(verticalArrangement = Arrangement.spacedBy(25.dp)) {

            TextField(
                value = textNewValue, onValueChange = { text ->
                    textNewValue = text
                },
                label = { Text("Enter your name") },
                maxLines = 2,
                singleLine = true,
                modifier = Modifier.width(300.dp),
                placeholder = { Text("hinttttttttt") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = { Icon(Icons.Outlined.Email, "ICon email") },
                trailingIcon = {
                    IconButton(onClick = {
                        Toast.makeText(context, textNewValue, Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(Icons.Outlined.Done, "icon action")
                    }
                }

            )

            OutlinedTextField(
                value = textNewValue2, onValueChange = { text ->
                    textNewValue2 = text
                },
                label = { Text("Enter your Email") },
                maxLines = 2,
                singleLine = true,
                modifier = Modifier.width(300.dp),
                placeholder = { Text("hinttttttttt") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = { Icon(Icons.Outlined.Email, "ICon email") },
                trailingIcon = {
                    IconButton(onClick = {
                        Toast.makeText(context, textNewValue2, Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(Icons.Outlined.Send, "icon action")
                    }
                },
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Sentences,
                    keyboardType = KeyboardType.Decimal,
                    imeAction = ImeAction.Send

                ),
                keyboardActions = KeyboardActions(
                    onSend = {
                        keyboardControl?.hide()
                        Toast.makeText(context, "send button click", Toast.LENGTH_SHORT).show()
                        focusManager.clearFocus()
                    }
                )


            )

            BasicTextField(
                textNewValue, { textNewValue = it },
                modifier = Modifier
                    .width(300.dp)
                    .background(Color.Red),
                enabled = true
            )
        }

    }
}

@Composable
fun StylingTextField13() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 40.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var textstate6 by remember { mutableStateOf("") }
            val myColor6 = Color(0xFFF86B3F)


            //t5

            TextField(
                value = textstate6,
                onValueChange = { textstate6 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = " your name") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email icon",
                        // tint = myColor5
                    )
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Filled.Send, contentDescription = null)

                },
                colors = TextFieldDefaults.colors(
                    focusedTextColor = myColor6,
                    unfocusedTextColor = myColor6,
                    focusedContainerColor = myColor6.copy(alpha = 0.2f),
                    unfocusedContainerColor = myColor6.copy(alpha = 0.2f),
                    cursorColor = myColor6,
                    focusedLeadingIconColor = myColor6,
                    unfocusedLeadingIconColor = myColor6,
                    focusedTrailingIconColor = myColor6,
                    unfocusedTrailingIconColor = myColor6,
                    focusedLabelColor = myColor6,
                    unfocusedLabelColor = myColor6,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(25.dp)
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun ButtonTypesPreview() {
    SampleComposeTheme {
        StylingTextField13()
    }
}