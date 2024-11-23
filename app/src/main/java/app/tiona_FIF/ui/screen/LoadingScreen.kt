package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.loadingScreen.Logo
import app.tiona_FIF.ui.theme.CustomColors

@Composable
fun LoadingScreen(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors().secondary,
                        CustomColors().tertiary
                    ),
                    start = Offset(1000f, 200f),
                    end = Offset(0f, 800f),
                )
            ),
    ) {
        val (roundRef, logoRef) = createRefs()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(CircleShape)
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
                    centerVerticallyTo(parent)
                }
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(logoRef) {
                    centerVerticallyTo(parent)
                }
        ) {
           Logo()
        }

    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun LoadingScreenPreview(){
    LoadingScreen()
}