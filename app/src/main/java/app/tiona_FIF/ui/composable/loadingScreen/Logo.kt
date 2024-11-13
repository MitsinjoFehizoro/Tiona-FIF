package app.tiona_FIF.ui.composable.loadingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.bagelFont
import app.tiona_FIF.ui.theme.white

@Composable
fun Logo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.guitar_solid),
            contentDescription = null,
            tint = white,
            modifier = Modifier
                .size(56.dp)
                .rotate(-45f)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "TIONA",
            fontFamily = bagelFont,
            color = white,
            fontSize = 18.sp
        )
        Text(
            text = "FIFOHAZANA",
            fontFamily = bagelFont,
            color = white,
            fontSize = 18.sp
        )
    }

}