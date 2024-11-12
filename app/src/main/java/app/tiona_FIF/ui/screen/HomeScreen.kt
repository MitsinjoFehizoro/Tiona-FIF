package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.LoadingScreen.Logo
import app.tiona_FIF.ui.theme.CustomColors

@Composable
fun HomeScreen () {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomColors.background),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        LongBackground()
    }
}

@Composable
fun LongBackground(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.55f)
            .clip(
                RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomStart = 56.dp,
                    bottomEnd = 56.dp
                )
            )
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors.secondary,
                        CustomColors.secondary,
                        CustomColors.tertiary
                    ),
                    start = Offset(800f, 0f),
                    end = Offset(200f, 1000f)
                )
            )
    ){
        val (roundRef, logoRef) = createRefs()
        Box(
            modifier = Modifier
                .width(2000.dp)
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
                            CustomColors.primary.copy(alpha = .2f),
                            CustomColors.primary
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}