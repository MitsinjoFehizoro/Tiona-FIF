package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import app.tiona_FIF.ui.composable.baseScreen.BaseScreen
import app.tiona_FIF.ui.composable.baseScreen.Footer
import app.tiona_FIF.ui.composable.baseScreen.Header
import app.tiona_FIF.ui.composable.listScreen.ListItem
import app.tiona_FIF.ui.composable.baseScreen.ShortBackgroundStyle
import app.tiona_FIF.ui.composable.listScreen.Search
import app.tiona_FIF.ui.theme.CustomColors


@Composable
fun ListScreen (navController: NavController) {
    BaseScreen(
        isLongBackgroundStyle = false ,
        headerTitle = "Fihirana Fifohazana",
        navController = navController
    ) {
        ListContent()
    }
}

@Composable
fun ListContent (){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(48.dp))
        Search()
        Spacer(modifier = Modifier.height(38.dp))
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
    }

}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListScreenPreview(){
    ListScreen(navController = NavController(LocalContext.current))
}