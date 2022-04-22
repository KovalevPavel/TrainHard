package me.kovp.navigation.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.ui.graphics.vector.ImageVector

data class MainScreen(
    override val labelRes: Int = 0,
    override val icon: ImageVector = Icons.Default.Email
) : BottomNavScreen {
    override val navRoute: String = "next_screen"
}