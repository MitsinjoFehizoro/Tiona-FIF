package app.tiona_FIF.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.tiona_FIF.ui.screen.HomeScreen
import app.tiona_FIF.ui.screen.InfoScreen
import app.tiona_FIF.ui.screen.ListScreen

@Composable
fun Navigation () {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.ListScreen.itineraire ) {
        composable(route = Route.HomeScreen.itineraire){
            HomeScreen()
        }
        composable(route = Route.ListScreen.itineraire){
            ListScreen()
        }
        composable(route = Route.InfoScreen.itineraire){
            InfoScreen()
        }
    }
}