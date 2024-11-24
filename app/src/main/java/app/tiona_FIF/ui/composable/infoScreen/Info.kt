package app.tiona_FIF.ui.composable.infoScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.white


@Composable
fun Contact () {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(68.dp)
            .background(
                color = CustomColors().quaternary,
                shape = RoundedCornerShape(8.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = R.drawable.email),
            contentDescription = null,
            modifier = Modifier.size(36.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.appel),
            contentDescription = null,
            modifier = Modifier.size(36.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = null,
            modifier = Modifier.size(36.dp)
        )
    }
}