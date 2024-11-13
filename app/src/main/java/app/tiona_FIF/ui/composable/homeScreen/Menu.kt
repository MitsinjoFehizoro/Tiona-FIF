package app.tiona_FIF.ui.composable.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.white

@Composable
fun Menu (){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.5.dp,
                color = white.copy(alpha = .6f),
                shape = RoundedCornerShape(18.dp)
            )
            .background(
                color = CustomColors.tertiary.copy(alpha = .12f),
                shape = RoundedCornerShape(18.dp)
            )
            .padding(vertical = 32.dp, horizontal = 24.dp)
    ) {
        CardMenu()
        CardMenu()
        CardMenu()
    }
}