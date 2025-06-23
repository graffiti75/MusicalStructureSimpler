package br.android.cericatto.musicalstructure.vintageradio.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Using the vintage-inspired placeholder colors
private val DarkColorScheme = darkColorScheme(
    primary = VintageOrange,
    secondary = VintageCream,
    tertiary = VintageRed,
    background = Color(0xFF1C1B1F), // Dark background
    surface = Color(0xFF3A383E),   // Slightly lighter dark surface
    onPrimary = VintageBrown,
    onSecondary = VintageBrown,
    onTertiary = VintageCream,
    onBackground = VintageCream,
    onSurface = VintageCream,
)

private val LightColorScheme = lightColorScheme(
    primary = VintageBrown,
    secondary = VintageOrange,
    tertiary = VintageRed,
    background = VintageCream,
    surface = Color(0xFFFFFBFE), // Light surface, slightly off-white from cream
    onPrimary = VintageCream,
    onSecondary = VintageBrown,
    onTertiary = VintageCream,
    onBackground = VintageBrown,
    onSurface = VintageBrown,

    /* Other default colors to override
    surfaceVariant = MaterialTheme.colorScheme.surfaceVariant,
    outline = MaterialTheme.colorScheme.outline,
    inverseOnSurface = MaterialTheme.colorScheme.inverseOnSurface,
    inverseSurface = MaterialTheme.colorScheme.inverseSurface,
    inversePrimary = MaterialTheme.colorScheme.inversePrimary,
    surfaceTint = MaterialTheme.colorScheme.surfaceTint,
    outlineVariant = MaterialTheme.colorScheme.outlineVariant,
    scrim = MaterialTheme.colorScheme.scrim,
    */
)

@Composable
fun VintageRadioAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false, // Set to false to strictly use our vintage theme
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
