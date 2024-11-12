package app.tiona_FIF.ui.composable.LoadingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstrainedLayoutReference
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.bagelFont
import app.tiona_FIF.ui.theme.white

@Composable
fun Logo() {
    Image(
        painter = painterResource(id = R.drawable.guitar),
        contentDescription = "Guitar",
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