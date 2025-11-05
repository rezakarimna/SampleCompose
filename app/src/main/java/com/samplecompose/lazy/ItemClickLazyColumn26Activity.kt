package com.samplecompose.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.samplecompose.R
import com.samplecompose.lazy.screen.DetailsScreen
import com.samplecompose.lazy.screen.MainScreen
import com.samplecompose.ui.theme.SampleComposeTheme

class ItemClickLazyColumn26Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val imageId = arrayOf(
                        R.drawable.p1,
                        R.drawable.p2,
                        R.drawable.p3,
                        R.drawable.p4,
                        R.drawable.p5,
                        R.drawable.p6
                    )

                    val names = arrayOf(
                        "Peperoni",
                        "Vegan",
                        "FourCheese",
                        "Margaritta",
                        "American",
                        "Mexican"
                    )

                    val ingredients = arrayOf(
                        "Tomato sos, cheese, oregano, peperoni",
                        "Tomato sos, cheese, oregano, spinach, green paprika, rukola",
                        "Tomato sos, oregano, mozzarella, goda, parmesan, cheddar",
                        "Tomato sos, cheese, oregano, bazillion",
                        "Tomato sos, cheese, oregano, green paprika, red beans",
                        "Tomato sos, cheese, oregano, corn, jalapeno, chicken"
                    )

                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "MainScreen") {
                        composable(route = "MainScreen") {
                            MainScreen(imageId, names, ingredients, navController = navController)
                        }
                        composable(
                            route = "DetailsScreen/{index}",
                            arguments = listOf(
                                navArgument(name = "index") {
                                    type = NavType.IntType
                                }
                            )) { NavBackStackEntry ->
                            DetailsScreen(
                                photos = imageId,
                                names = names,
                                ingredients = ingredients,
                                indexItem = NavBackStackEntry.arguments?.getInt("index")
                            )
                        }
                    }


                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    SampleComposeTheme {
        val imageId = arrayOf(
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
        )

        val names = arrayOf(
            "Peperoni",
            "Vegan",
            "FourCheese",
            "Margaritta",
            "American",
            "Mexican"
        )

        val ingredients = arrayOf(
            "Tomato sos, cheese, oregano, peperoni",
            "Tomato sos, cheese, oregano, spinach, green paprika, rukola",
            "Tomato sos, oregano, mozzarella, goda, parmesan, cheddar",
            "Tomato sos, cheese, oregano, bazillion",
            "Tomato sos, cheese, oregano, green paprika, red beans",
            "Tomato sos, cheese, oregano, corn, jalapeno, chicken"
        )

        DetailsScreen(modifier = Modifier, imageId, names, ingredients, 1)
    }
}