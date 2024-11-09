package app.tiona_FIF.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.R
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.bagelFont
import app.tiona_FIF.ui.theme.white

@Composable
fun LoadingScreen(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors.secondary,
                        CustomColors.tertiary
                    ),
                    start = Offset(1000f, 200f),
                    end = Offset(0f, 800f),
                )
            ),
    ) {
        val (round, logo) = createRefs()
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .aspectRatio(1f)
                .clip(
                    shape = RoundedCornerShape(50)
                )
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            CustomColors.primary.copy(alpha = .2f),
                            CustomColors.primary
                        )
                    )
                )
                .constrainAs(round) {
                    end.linkTo(parent.end, margin = 32.dp)
                    centerVerticallyTo(parent)
                }
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(logo) {
                    centerHorizontallyTo(parent)
                    centerVerticallyTo(parent)
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.guitar),
                contentDescription = "Guitar",
                modifier = Modifier
                    .size(68.dp)
                    .rotate(-45f)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "TIONA FIHIRANA",
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

    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun LoadingScreenPreview(){
    LoadingScreen()
}