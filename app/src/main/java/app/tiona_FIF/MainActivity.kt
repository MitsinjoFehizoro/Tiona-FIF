package app.tiona_FIF

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import app.tiona_FIF.ui.navigation.Navigation
import app.tiona_FIF.ui.screen.HomeScreen
import app.tiona_FIF.ui.screen.InfoScreen
import app.tiona_FIF.ui.screen.ListScreen
import app.tiona_FIF.ui.screen.LoadingScreen
import app.tiona_FIF.ui.theme.TionaFIFTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            TionaFIFTheme {
               Navigation()
            }
        }
    }
}

