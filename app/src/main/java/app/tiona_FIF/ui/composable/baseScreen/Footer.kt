package app.tiona_FIF.ui.composable.baseScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.white


@Composable
fun Footer(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(86.dp)
            .clip(shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50))
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50),
                ambientColor = CustomColors.tertiary.copy(alpha = .6f),
                spotColor = CustomColors.tertiary.copy(alpha = .6f)
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(76.dp)
                .clip(shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50))
                .background(
                    color = white
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    tint = CustomColors.tertiary.copy(alpha = 1f),
                    modifier = Modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    tint = CustomColors.tertiary.copy(alpha = .4f),
                    modifier = Modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = CustomColors.tertiary.copy(alpha = .4f),
                    modifier = Modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = CustomColors.tertiary.copy(alpha = .4f),
                    modifier = Modifier.size(24.dp)
                )
            }

        }
    }

}