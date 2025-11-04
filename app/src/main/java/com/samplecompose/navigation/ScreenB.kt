package com.samplecompose.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenB(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Screen B", fontSize = 64.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(45.dp))
        Button(onClick = { navController.navigate("C") }) {
            Text(text = "Go to Screen C", fontSize = 20.sp)
        }
        Spacer(Modifier.height(45.dp))
        Button(onClick = { navController.navigate("A") }) {
            Text(text = "Go to Screen A", fontSize = 20.sp)
        }
    }
}