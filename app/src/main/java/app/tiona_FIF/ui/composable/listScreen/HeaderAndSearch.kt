package app.tiona_FIF.ui.composable.listScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.baseScreen.Header
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.black
import app.tiona_FIF.ui.theme.white


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

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(CircleShape)
                .background(color = white)
                .padding(horizontal = 18.dp)
        ){
            val (iconRef, fieldRef) = createRefs()
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = CustomColors.tertiary,
                modifier = Modifier
                    .constrainAs(iconRef){
                        centerVerticallyTo(parent)
                    }
            )
            TextField(
                value = "Hitady...",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Transparent)
                    .constrainAs(fieldRef) {
                        start.linkTo(iconRef.end, margin = -8.dp)
                    },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = CustomColors.tertiary,
                    containerColor = Color.Transparent
                ),
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    color = black.copy(alpha = .6f)
                ),
            )
        }

    }
}