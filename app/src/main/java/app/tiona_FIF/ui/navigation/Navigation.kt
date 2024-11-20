package app.tiona_FIF.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import app.tiona_FIF.ui.screen.HomeScreen
import app.tiona_FIF.ui.screen.InfoScreen
import app.tiona_FIF.ui.screen.ListScreen

@Composable
fun Navigation () {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.HomeScreen.itineraire ) {
        composable(route = Route.HomeScreen.itineraire){
            HomeScreen(navController = navController)
        }
        composable(
            route = "${Route.ListScreen.itineraire}/{type}",
            arguments = listOf(
                navArgument("type"){
                    type = NavType.StringType
                }
            )
        ){
            ListScreen(type = it.arguments?.getString("type")!! ,navController = navController)
        }
        composable(route = Route.InfoScreen.itineraire){
            InfoScreen(navController = navController)
        }
    }
}