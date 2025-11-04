package com.samplecompose.nested_navigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.samplecompose.nested_navigation.screens.HomeScreen
import com.samplecompose.nested_navigation.screens.ScreenA
import com.samplecompose.nested_navigation.screens.ScreenB

fun NavGraphBuilder.appGraph(navController: NavController) {
    navigation(startDestination = Screens.ScreenHomeRoute.route, route = Screens.AppRoute.route) {
        composable(route = Screens.ScreenHomeRoute.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screens.ScreenARoute.route) {
            ScreenA(navController = navController)
        }
        composable(route = Screens.ScreenBRoute.route) {
            ScreenB(navController = navController)
        }
    }
}