package org.robok.engine.core.settings.repositories

/*
 *  This file is part of Robok © 2024.
 *
 *  Robok is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Robok is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Robok.  If not, see <https://www.gnu.org/licenses/>.
 */

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.map
import org.robok.engine.core.settings.DefaultValues

class PreferencesRepository(private val dataStore: DataStore<Preferences>) {
  private val installedRDKVersionPreference = stringPreferencesKey("installed_rdk_version")
  private val appIsUseMonetPreference = booleanPreferencesKey("app_monet")
  private val appIsUseAmoledPreference = booleanPreferencesKey("app_amoled")
  private val editorThemePreference = intPreferencesKey("editor_theme")
  private val editorTypefacePreference = intPreferencesKey("editor_typeface")
  private val editorIsUseWordWrapPreference = booleanPreferencesKey("editor_word_wrap")
  private val editorFontPreference = intPreferencesKey("editor_font")

  val installedRDKVersion =
    dataStore.data.map { it[installedRDKVersionPreference] ?: DefaultValues.INSTALLED_RDK_VERSION }
  val appIsUseMonet =
    dataStore.data.map { it[appIsUseMonetPreference] ?: DefaultValues.IS_USE_MONET }
  val appIsUseAmoled =
    dataStore.data.map { it[appIsUseAmoledPreference] ?: DefaultValues.IS_USE_AMOLED }
  val editorTheme = dataStore.data.map { it[editorThemePreference] ?: DefaultValues.EDITOR_THEME }
  val editorTypeface =
    dataStore.data.map { it[editorTypefacePreference] ?: DefaultValues.EDITOR_TYPEFACE }
  val editorIsUseWordWrap =
    dataStore.data.map {
      it[editorIsUseWordWrapPreference] ?: DefaultValues.EDITOR_IS_USE_WORD_WRAP
    }
  val editorFont = dataStore.data.map { it[editorFontPreference] ?: DefaultValues.EDITOR_FONT }

  suspend fun setInstalledRDKVersion(value: String) =
    dataStore.edit { preferences -> preferences[installedRDKVersionPreference] = value }

  suspend fun setMonetEnable(value: Boolean) =
    dataStore.edit { preferences -> preferences[appIsUseMonetPreference] = value }

  suspend fun setAmoledEnable(value: Boolean) =
    dataStore.edit { preferences -> preferences[appIsUseAmoledPreference] = value }

  suspend fun setEditorTheme(value: Int) =
    dataStore.edit { preferences -> preferences[editorThemePreference] = value }

  suspend fun setEditorTypeface(value: Int) =
    dataStore.edit { preferences -> preferences[editorTypefacePreference] = value }

  suspend fun setEditorWordWrapEnable(value: Boolean) =
    dataStore.edit { preferences -> preferences[editorIsUseWordWrapPreference] = value }

  suspend fun setEditorFont(value: Int) =
    dataStore.edit { preferences -> preferences[editorFontPreference] = value }
}
