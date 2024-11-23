package app.tiona_FIF.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.tiona_FIF.data.repository.UserPreferencesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userPreferencesRepository: UserPreferencesRepository
) : ViewModel() {

    val isDarkModeFlow : Flow<Boolean> = userPreferencesRepository.userPreferencesFlow.map { userPreferences ->
        userPreferences.isDarkMode
    }

    fun toggleIsDarkMode(isDarkMode : Boolean){
        viewModelScope.launch {
            userPreferencesRepository.updateIsDarkMode(isDarkMode)
        }
    }
}