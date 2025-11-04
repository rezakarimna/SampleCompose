package com.samplecompose.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.samplecompose.ui.theme.SampleComposeTheme


class NavigationCompose23Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleComposeTheme {
                val navController = rememberNavController()
                Nav(navController)
            }
        }
    }
}