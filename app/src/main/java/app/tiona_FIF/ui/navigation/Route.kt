package app.tiona_FIF.ui.navigation

sealed class Route( val itineraire : String ) {
    object HomeScreen : Route("home_screen")
    object ListScreen : Route("list_screen")
    object InfoScreen : Route("info_screen")
}
