package com.example.myapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Orange,
    onPrimary = White,
    secondary = LightGray,
    onSecondary = DarkGray
)

private val DarkColorScheme = darkColorScheme(
    primary = Orange,
    onPrimary = DarkGray,
    secondary = LightGray,
    onSecondary = White
)

@Composable
fun MyAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = CustomTypography,
        content = content
    )
}
