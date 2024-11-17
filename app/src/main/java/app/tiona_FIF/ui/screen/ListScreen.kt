package app.tiona_FIF.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.tiona_FIF.R
import app.tiona_FIF.ui.composable.homeScreen.Footer
import app.tiona_FIF.ui.composable.listScreen.ListItem
import app.tiona_FIF.ui.composable.listScreen.ShortBackgroundStyle
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.black
import app.tiona_FIF.ui.theme.white


@Composable
fun ListScreen () {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomColors.background)
    ) {
        ShortBackgroundStyle()
        ListContent()
    }
}

@Composable
fun ListContent (){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 16.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            for (i in 1..30){
                ListItem()
            }
        }
        Footer()
    }

}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListScreenPreview(){
    ListScreen()
}