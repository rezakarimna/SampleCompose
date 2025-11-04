package com.samplecompose.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsScreen(myName: String?, myAge: Int?) {

    Column(
        Modifier.padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Details Screen", fontSize = 34.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(65.dp))
        Text(text = "Your name is: $myName", fontSize = 34.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(65.dp))
        Text(text = "Your age is:  $myAge", fontSize = 34.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(65.dp))

    }
}