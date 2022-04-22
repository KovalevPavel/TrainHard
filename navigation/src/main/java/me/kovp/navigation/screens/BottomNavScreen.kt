package me.kovp.navigation.screens

import androidx.compose.ui.graphics.vector.ImageVector

interface BottomNavScreen : Screen {
    val labelRes: Int
    val icon: ImageVector
}