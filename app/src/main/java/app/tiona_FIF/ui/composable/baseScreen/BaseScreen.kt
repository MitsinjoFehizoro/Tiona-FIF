package app.tiona_FIF.ui.composable.baseScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import app.tiona_FIF.ui.theme.CustomColors


@Composable
fun BaseScreen (
    isLongBackgroundStyle : Boolean,
    headerTitle: String,
    content : @Composable () -> Unit
) {
    ConstraintLayout (
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomColors.background)
    ) {
        if(isLongBackgroundStyle) {
            LongBackgroundStyle()
        } else {
            ShortBackgroundStyle()
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Header(title = headerTitle)
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                content()
            }
            Footer()
        }
    }
}