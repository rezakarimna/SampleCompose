package com.mkrdeveloper.nestednavexamplejetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.samplecompose.nested_navigation.navigation.Screens
import com.samplecompose.nested_navigation.navigation.appGraph
import com.samplecompose.nested_navigation.navigation.authGraph

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route) {
        authGraph(navController)
        appGraph(navController)
    }
}