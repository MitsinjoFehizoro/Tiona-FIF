package app.tiona_FIF.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val primaryLight  = Color(0xFF1576FB)
val secondaryLight = Color(0xFF59DFAA)
val tertiaryLight = Color(0xFF48C5FB)
val backgroundLight = Color(0xFFF7FAFF)

val white = Color(0xFFFFFFFF)
val black = Color(0xFF000000)

object CustomColors {
    val primary : Color
        @Composable
        get() = if (isSystemInDarkTheme()) primaryLight else primaryLight

    val secondary : Color
        @Composable
        get() = if (isSystemInDarkTheme()) secondaryLight else secondaryLight

    val tertiary : Color
        @Composable
        get() = if (isSystemInDarkTheme()) tertiaryLight else tertiaryLight

    val background : Color
        @Composable
        get() = if(isSystemInDarkTheme()) backgroundLight else backgroundLight
}