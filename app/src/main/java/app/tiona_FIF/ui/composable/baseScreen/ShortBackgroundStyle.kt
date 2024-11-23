package app.tiona_FIF.ui.composable.baseScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.theme.CustomColors


@Composable
fun ShortBackgroundStyle(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomStart = 36.dp,
                    bottomEnd = 36.dp
                )
            )
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors().secondary,
                        CustomColors().tertiary
                    ),
                    start = Offset(400f, 0f),
                    end = Offset(200f, 800f)
                )
            )
    ){
       val roundRef = createRef()
        Box(
            modifier = Modifier
                .size(320.dp, 300.dp)
                .clip(
                    RoundedCornerShape(
                        topStartPercent = 0,
                        topEndPercent = 40,
                        bottomEndPercent = 80,
                        bottomStartPercent = 30
                    )
                )
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            CustomColors().primary.copy(alpha = .2f),
                            CustomColors().primary
                        )
                    )
                )
                .constrainAs(roundRef) {
                    start.linkTo(parent.start, margin = -24.dp)
                    bottom.linkTo(parent.bottom, margin = 48.dp)
                }
        )
    }

}