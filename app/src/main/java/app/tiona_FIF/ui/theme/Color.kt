package app.tiona_FIF.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import app.tiona_FIF.ui.MainViewModel

val primaryLight  = Color(0xFF1576FB)
val secondaryLight = Color(0xFF59DFAA)
val tertiaryLight = Color(0xFF48C5FB)
val backgroundLight = Color(0xFFF7FAFF)

val white = Color(0xFFFFFFFF)
val black = Color(0xFF000000)

data class MyColor(
    val primary : Color,
    val secondary : Color,
    val tertiary : Color,
    val background : Color
)
@Composable
fun CustomColors (mainViewModel: MainViewModel = hiltViewModel()) : MyColor {

    val isDarkMode = mainViewModel.isDarkModeFlow.collectAsState(initial = false).value

    return if(isDarkMode){
        MyColor(
            primary = primaryLight,
            secondary = secondaryLight,
            tertiary = tertiaryLight,
            background = backgroundLight
        )
    } else {
        MyColor(
            primary = primaryLight,
            secondary = secondaryLight,
            tertiary = tertiaryLight,
            background = backgroundLight
        )
    }
}