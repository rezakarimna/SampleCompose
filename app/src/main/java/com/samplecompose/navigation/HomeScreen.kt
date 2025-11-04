package com.samplecompose.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    val modifier = Modifier
    var nameValue by remember {
        mutableStateOf("")
    }
    var ageValue by remember {
        mutableStateOf("")
    }
    Column(
        modifier.padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen", fontSize = 54.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(65.dp))

        TextField(
            value = nameValue,
            onValueChange = { nameValue = it },
            modifier = modifier.padding(20.dp),
            placeholder = {
                Text(text = "Enter your name")
            })

        TextField(
            value = ageValue,
            onValueChange = { ageValue = it },
            modifier = modifier.padding(40.dp),
            placeholder = {
                Text(text = "Enter your name")
            })

        Button(onClick = {
            navController.navigate("Details?name=$nameValue&age=$ageValue")
        }) {
            Text(text = "Pass data", fontSize = 30.sp)
        }
    }
}