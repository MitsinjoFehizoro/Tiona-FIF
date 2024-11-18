package app.tiona_FIF.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import app.tiona_FIF.ui.composable.baseScreen.BaseScreen
import app.tiona_FIF.ui.composable.baseScreen.Footer
import app.tiona_FIF.ui.composable.baseScreen.Header
import app.tiona_FIF.ui.composable.baseScreen.LongBackgroundStyle
import app.tiona_FIF.ui.composable.homeScreen.Menu
import app.tiona_FIF.ui.composable.baseScreen.ShortBackgroundStyle
import app.tiona_FIF.ui.composable.loadingScreen.Logo
import app.tiona_FIF.ui.theme.CustomColors

@Composable
fun HomeScreen () {
    BaseScreen(
        isLongBackgroundStyle = true,
        headerTitle = "Tongasoa"
    ) {
        HomeContent()
    }
}


@Composable
fun HomeContent (){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Logo()
        Menu()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}