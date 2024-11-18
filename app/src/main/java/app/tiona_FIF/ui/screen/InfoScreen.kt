package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.baseScreen.Footer
import app.tiona_FIF.ui.composable.baseScreen.LongBackgroundStyle
import app.tiona_FIF.ui.composable.infoScreen.Contact
import app.tiona_FIF.ui.composable.infoScreen.HeaderAndLogo
import app.tiona_FIF.ui.composable.listScreen.InfoCard
import app.tiona_FIF.ui.theme.CustomColors

@Composable
fun InfoScreen () {
    ConstraintLayout (
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomColors.background)
    ) {
        LongBackgroundStyle()
        InfoContent()
    }
}

@Composable
fun InfoContent () {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        HeaderAndLogo()
        ConstraintLayout (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 32.dp)
        ) {
            val ref = createRef()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .constrainAs(ref) {
                        top.linkTo(parent.top, margin = -32.dp)
                    }
            ) {
                Contact()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 36.dp)
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    InfoCard()
                    InfoCard()
                }
            }
        }
        Footer()
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InfoScreenPreview(){
    InfoScreen()
}