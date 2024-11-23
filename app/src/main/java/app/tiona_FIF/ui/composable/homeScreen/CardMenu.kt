package app.tiona_FIF.ui.composable.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.black
import app.tiona_FIF.ui.theme.white


@Composable
fun CardMenu(
    title : String,
    subtitle : String,
    id_icon : Int,
    onClick : () -> Unit,
){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(76.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(white)
            .clickable { onClick() }
            .padding(10.dp)
    ){
        Box (
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = CustomColors().primary),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = id_icon),
                contentDescription = null, tint = white,
                modifier = Modifier.size(22.dp)
            )
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 4.dp, bottom = 6.dp, start = 8.dp, end = 2.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = black.copy(alpha = .6f)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = subtitle,
                    fontSize = 14.sp,
                    color = black.copy(alpha = .5f)
                )
                Box(
                    modifier = Modifier
                        .width(36.dp)
                        .background(
                            color = CustomColors().primary,
                            shape = RoundedCornerShape(4.dp)
                        )
                        .clip(shape = RoundedCornerShape(4.dp)),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "253",
                        fontSize = 12.sp,
                        color = white
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}
