package com.samplecompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument


@Composable
fun Nav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Home") {
/*        composable("A") {
            ScreenA(navController)
        }
        composable("B") { ScreenB(navController) }
        composable("C") { ScreenC(navController) }*/
        composable("Home") {
            HomeScreen(navController)
        }
        composable(
            route = "Details?name={name}&age={age}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
//                    defaultValue = ""
                    nullable = true
                },
                navArgument(name = "age") {
                    type = NavType.IntType
                    nullable = false
                }
            )
        ) {
            DetailsScreen(
                myName = it.arguments?.getString("name"),
                myAge = it.arguments?.getInt("age")
            )
        }
    }
}