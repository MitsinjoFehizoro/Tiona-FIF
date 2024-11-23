package app.tiona_FIF.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import app.tiona_FIF.ui.navigation.Navigation
import app.tiona_FIF.ui.theme.TionaFIFTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val mainViewModel : MainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val isDarkMode = mainViewModel.isDarkModeFlow.collectAsState(initial = false).value
            TionaFIFTheme{
               Navigation()
            }
        }
    }
}

