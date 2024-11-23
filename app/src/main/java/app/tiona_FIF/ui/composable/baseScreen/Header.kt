package app.tiona_FIF.ui.composable.baseScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import app.tiona_FIF.ui.MainViewModel
import app.tiona_FIF.ui.navigation.Route
import app.tiona_FIF.ui.theme.white
import app.tiona_FIF.R

@Composable
fun Header (
    title : String,
    navController : NavController,
    mainViewModel: MainViewModel = hiltViewModel()
){
    Row(
        modifier = Modifier
            .padding(top = 18.dp)
            .padding(horizontal = 32.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(
            onClick = { navController.popBackStack() }
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                tint = white.copy(alpha = .6f)
            )
        }
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = white.copy(alpha = .6f)
        )

        val isDarkMode = mainViewModel.isDarkModeFlow.collectAsState(initial = false).value
        IconButton(
            onClick = { mainViewModel.toggleIsDarkMode(!isDarkMode) }
        ) {
            Icon(
                painter = painterResource(id = if(isDarkMode) R.drawable.sun_regular else R.drawable.moon_solid),
                contentDescription = null,
                tint = white.copy(alpha = .6f),
                modifier = Modifier.size(20.dp)
            )
        }
    }
}
