package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.homeScreen.Header
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.backgroundLight
import app.tiona_FIF.ui.theme.black
import app.tiona_FIF.ui.theme.white


@Composable
fun ListScreen () {
    ConstraintLayout (
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomColors.background)
    ) {
        ShortBackgroundStyle()
    }
}




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
                    bottomStart = 44.dp,
                    bottomEnd = 44.dp
                )
            )
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        CustomColors.secondary,
                        CustomColors.tertiary
                    ),
                    start = Offset(400f, 0f),
                    end = Offset(200f, 800f)
                )
            )
    ){
        val (roundRef) = createRefs()
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
                            CustomColors.primary.copy(alpha = .2f),
                            CustomColors.primary
                        )
                    )
                )
                .constrainAs(roundRef) {
                    start.linkTo(parent.start, margin = -16.dp)
                    bottom.linkTo(parent.bottom, margin = 48.dp)
                }
        )
        HeaderAndSearch()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderAndSearch(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 18.dp, bottom = 36.dp)
            .padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header(title = "Fihirana Fifohazana")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(CircleShape)
                .background(color = white)
                .padding(horizontal = 8.dp)
        ){

        }
//        TextField(
//            value = "hitady",
//            onValueChange = {},
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(48.dp)
//                .clip(CircleShape)
//                .background(color = white, CircleShape),
//            colors = TextFieldDefaults.textFieldColors(
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent,
//                containerColor = Color.Transparent,
//            ),
//            textStyle = TextStyle(
//                color = black.copy(alpha = .6f),
//            )
//
//        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListScreenPreview(){
    ListScreen()
}