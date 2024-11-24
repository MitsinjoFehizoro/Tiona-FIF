package app.tiona_FIF.ui.composable.infoScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.white


@Composable
fun InfoCard () {
    Column (
        modifier = Modifier
            .size(136.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(
                color = CustomColors().quaternary,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.circle_exclamation_solid),
                contentDescription = null,
                tint = CustomColors().secondary,
                modifier = Modifier
                    .size(36.dp)
            )
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(36.dp)
                .background(
                    color = CustomColors().secondary,
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "TSY AZO AMIDY",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = CustomColors().quaternary
            )
        }
    }
}