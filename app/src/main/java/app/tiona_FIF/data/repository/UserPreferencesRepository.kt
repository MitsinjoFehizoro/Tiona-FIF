package app.tiona_FIF.data.repository

import android.content.Context
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import app.tiona_FIF.data.model.UserPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


const val USER_PREFERENCES_NAME = "user_preferences"
private val Context.dataStore by preferencesDataStore(name = USER_PREFERENCES_NAME)
class UserPreferencesRepository @Inject constructor(
    @ApplicationContext private val context: Context
){
    private val dataStore : DataStore<Preferences> = context.dataStore
    private object PreferencesKey {
        val DARK_MODE = booleanPreferencesKey(name = "dark_mode")
    }

    val userPreferencesFlow : Flow<UserPreferences> = dataStore.data.map { preferences ->
       val isDarkMode = preferences[PreferencesKey.DARK_MODE] ?: false
        UserPreferences(isDarkMode)
    }
    suspend fun updateIsDarkMode (isDarkMode : Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKey.DARK_MODE] = isDarkMode
        }
    }
}