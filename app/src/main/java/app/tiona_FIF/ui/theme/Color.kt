package app.tiona_FIF.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import app.tiona_FIF.ui.MainViewModel

val primaryLight  = Color(0xFF1576FB)
val primaryDark = Color(0xFF2E86FF)

val secondaryLight = Color(0xFF59DFAA)
val secondaryDark = Color(0xFF5EF8BB)

val tertiaryLight = Color(0xFF48C5FB)
val tertiaryDark = Color(0xFF58CDFF)

val quaternaryLight = Color(0xFFFFFFFF)
val quaternaryDark = Color(0xFF252728)

val backgroundLight = Color(0xFFF7FAFF)
val backgroundDark = Color(0xFF1C1C1D)

val white = Color(0xFFFFFFFF)
val black = Color(0xFF000000)

data class MyColor(
    val primary : Color,
    val secondary : Color,
    val tertiary : Color,
    val quaternary : Color,
    val background : Color,
    val typography : Color
)
@Composable
fun CustomColors (mainViewModel: MainViewModel = hiltViewModel()) : MyColor {

    val isDarkMode = mainViewModel.isDarkModeFlow.collectAsState(initial = false).value

    return if(isDarkMode){
        MyColor(
            primary = primaryDark,
            secondary = secondaryDark,
            tertiary = tertiaryDark,
            quaternary = quaternaryDark,
            background = backgroundDark,
            typography = white
        )
    } else {
        MyColor(
            primary = primaryLight,
            secondary = secondaryLight,
            tertiary = tertiaryLight,
            quaternary = quaternaryLight,
            background = backgroundLight,
            typography = black
        )
    }
}