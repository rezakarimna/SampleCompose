package com.samplecompose.nested_navigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.samplecompose.nested_navigation.screens.ForgetPassScreen
import com.samplecompose.nested_navigation.screens.LoginScreen
import com.samplecompose.nested_navigation.screens.RegisterScreen

fun NavGraphBuilder.authGraph(navController: NavController) {
    navigation(startDestination = Screens.ScreenLoginRoute.route, route = Screens.AuthRoute.route) {
        composable(route = Screens.ScreenLoginRoute.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screens.ScreenRegisterRoute.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = Screens.ScreenForgetPassRoute.route) {
            ForgetPassScreen(navController = navController)
        }
    }
}