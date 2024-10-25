package org.robok.engine.ui.theme

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

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

public val LightColorScheme: ColorScheme =
    ColorScheme(
        primary = Color(0xFF000000),
        onPrimary = Color(0xFFE2E2E2),
        primaryContainer = Color(0xFF3B3B3B),
        onPrimaryContainer = Color(0xFFFFFFFF),
        inversePrimary = Color(0xFFFFFFFF),
        secondary = Color(0xFF5E5E5E),
        onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFD4D4D4),
        onSecondaryContainer = Color(0xFF1B1B1B),
        tertiary = Color(0xFF3B3B3B),
        onTertiary = Color(0xFFE2E2E2),
        tertiaryContainer = Color(0xFF747474),
        onTertiaryContainer = Color(0xFFFFFFFF),
        background = Color(0xFFF9F9F9),
        onBackground = Color(0xFF1B1B1B),
        surface = Color(0xFFF9F9F9),
        onSurface = Color(0xFF1B1B1B),
        surfaceVariant = Color(0xFFE2E2E2),
        onSurfaceVariant = Color(0xFF474747),
        surfaceTint = Color(0xFF000000),
        inverseSurface = Color(0xFF131313),
        inverseOnSurface = Color(0xFFE2E2E2),
        error = Color(0xFFB3261E),
        onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFF9DEDC),
        onErrorContainer = Color(0xFF410E0B),
        outline = Color(0xFF747474),
        outlineVariant = Color(0xFFC6C6C6),
        scrim = Color(0xFF000000),
        surfaceBright = Color(0xFFF9F9F9),
        surfaceDim = Color(0xFFDADADA),
        surfaceContainer = Color(0xFFEEEEEE),
        surfaceContainerHigh = Color(0xFFE8E8E8),
        surfaceContainerHighest = Color(0xFFE2E2E2),
        surfaceContainerLow = Color(0xFFF3F3F3),
        surfaceContainerLowest = Color(0xFFFFFFFF),
    )

public val DarkColorScheme: ColorScheme =
    ColorScheme(
        primary = Color(0xFFFFFFFF),
        onPrimary = Color(0xFF1B1B1B),
        primaryContainer = Color(0xFFD4D4D4),
        onPrimaryContainer = Color(0xFF000000),
        inversePrimary = Color(0xFF000000),
        secondary = Color(0xFFC6C6C6),
        onSecondary = Color(0xFF1B1B1B),
        secondaryContainer = Color(0xFF474747),
        onSecondaryContainer = Color(0xFFE2E2E2),
        tertiary = Color(0xFFE2E2E2),
        onTertiary = Color(0xFF1B1B1B),
        tertiaryContainer = Color(0xFF919191),
        onTertiaryContainer = Color(0xFF000000),
        background = Color(0xFF131313),
        onBackground = Color(0xFFE2E2E2),
        surface = Color(0xFF131313),
        onSurface = Color(0xFFE2E2E2),
        surfaceVariant = Color(0xFF474747),
        onSurfaceVariant = Color(0xFFC6C6C6),
        surfaceTint = Color(0xFFFFFFFF),
        inverseSurface = Color(0xFFF9F9F9),
        inverseOnSurface = Color(0xFF1B1B1B),
        error = Color(0xFFF2B8B5),
        onError = Color(0xFF601410),
        errorContainer = Color(0xFF8C1D18),
        onErrorContainer = Color(0xFFF9DEDC),
        outline = Color(0xFF919191),
        outlineVariant = Color(0xFF474747),
        scrim = Color(0xFF000000),
        surfaceBright = Color(0xFF393939),
        surfaceDim = Color(0xFF131313),
        surfaceContainer = Color(0xFF1F1F1F),
        surfaceContainerHigh = Color(0xFF2A2A2A),
        surfaceContainerHighest = Color(0xFF353535),
        surfaceContainerLow = Color(0xFF1B1B1B),
        surfaceContainerLowest = Color(0xFF0E0E0E),
    )