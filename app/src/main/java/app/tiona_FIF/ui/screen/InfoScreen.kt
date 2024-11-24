package app.tiona_FIF.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import app.tiona_FIF.ui.composable.baseScreen.BaseScreen
import app.tiona_FIF.ui.composable.infoScreen.Contact
import app.tiona_FIF.ui.composable.infoScreen.InfoCard
import app.tiona_FIF.ui.composable.loadingScreen.Logo

@Composable
fun InfoScreen (navController : NavController) {
   BaseScreen(
       isLongBackgroundStyle = true,
       headerTitle = "Tsara Ho Fantatra",
       navController = navController
   ) {
       InfoContent()
   }
}

@Composable
fun InfoContent () {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Logo()
            Spacer(modifier = Modifier.size(48.dp))
        }
        ConstraintLayout (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            val ref = createRef()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .constrainAs(ref) {
                        top.linkTo(parent.top, margin = -24 .dp)
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
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InfoScreenPreview(){
    InfoScreen(navController = NavController(LocalContext.current))
}