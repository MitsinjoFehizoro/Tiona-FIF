package app.tiona_FIF.ui.composable.baseScreen

import android.view.Menu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import app.tiona_FIF.ui.theme.CustomColors
import app.tiona_FIF.ui.theme.white
import app.tiona_FIF.R
import app.tiona_FIF.ui.navigation.Route


@Composable
fun Footer(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(86.dp)
            .clip(shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50))
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50),
                ambientColor = CustomColors().tertiary.copy(alpha = .6f),
                spotColor = CustomColors().tertiary.copy(alpha = .6f)
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(76.dp)
                .clip(shape = RoundedCornerShape(topStartPercent = 50, topEndPercent = 50))
                .background(
                    color = white
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            val currentRoute = navController.currentBackStackEntry?.destination?.route
            val currentType = navController.currentBackStackEntry?.arguments?.getString("type")
            println(currentType)
            data class ButtonFooter(val icon : Int, val route : String, val isActive : Boolean )

            val btn_home = ButtonFooter(R.drawable.house_solid, Route.HomeScreen.itineraire, Route.HomeScreen.itineraire === currentRoute )
            val btn_fif = ButtonFooter(R.drawable.music_solid, "${Route.ListScreen.itineraire}/FIF", currentType == "FIF" )
            val btn_ffpm = ButtonFooter(R.drawable.book_open_solid, "${Route.ListScreen.itineraire}/FFPM",  currentType == "FFPM" )
            val btn_info = ButtonFooter(R.drawable.circle_info_solid, Route.InfoScreen.itineraire, Route.InfoScreen.itineraire === currentRoute )

            val buttons = listOf<ButtonFooter>(btn_home, btn_fif, btn_ffpm, btn_info)


            buttons.forEach { button ->
                IconButton(
                    onClick = { navController.navigate(button.route) }
                ) {
                    Icon(
                        painter = painterResource(id = button.icon),
                        contentDescription = null,
                        tint = Tint(isActive = button.isActive),
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }

}

@Composable
fun Tint (isActive : Boolean) : Color {
    return if(isActive){
        CustomColors().tertiary.copy(alpha = 1f)
    } else {
        CustomColors().tertiary.copy(alpha = .25f)
    }
}