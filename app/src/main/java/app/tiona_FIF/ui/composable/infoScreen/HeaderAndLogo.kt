package app.tiona_FIF.ui.composable.infoScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.composable.homeScreen.Header
import app.tiona_FIF.ui.composable.loadingScreen.Logo


@Composable
fun HeaderAndLogo (){
    ConstraintLayout (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp)
            .padding(horizontal = 32.dp)
            .fillMaxHeight(.5f)
    ) {
        val logoRef = createRef()
        Header(title = "Tsara Ho Fantatra")
        Box(
            modifier = Modifier
                .constrainAs(logoRef){
                    centerHorizontallyTo(parent)
                    centerVerticallyTo(parent)
                }
        ) {
            Logo()
        }
    }
}