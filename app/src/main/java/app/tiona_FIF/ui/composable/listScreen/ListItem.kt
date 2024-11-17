package app.tiona_FIF.ui.composable.listScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.black
import app.tiona_FIF.ui.theme.white


@Composable
fun ListItem(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(
                    color = white
                ),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.note),
                contentDescription = null,
                modifier = Modifier.width(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "1 - Andriamanitra fitiavana",
                fontSize = 14.sp,
                color = black.copy(alpha = .6f)
            )
        }
    }

}
