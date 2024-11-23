package app.tiona_FIF.ui.composable.baseScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
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
fun LongBackgroundStyle(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f)
            .clip(
                RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomStart = 44.dp,
                    bottomEnd = 44.dp
                )
            )
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors().secondary,
                        CustomColors().secondary,
                        CustomColors().tertiary
                    ),
                    start = Offset(800f, 0f),
                    end = Offset(200f, 1000f)
                )
            )
    ){
        val roundRef = createRef()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(
                    RoundedCornerShape(
                        topStartPercent = 0,
                        topEndPercent = 50,
                        bottomEndPercent = 50,
                        bottomStartPercent = 50
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
                    end.linkTo(parent.end, margin = 32.dp)
                    top.linkTo(parent.top, margin = -32.dp)
                }
        )

    }

}