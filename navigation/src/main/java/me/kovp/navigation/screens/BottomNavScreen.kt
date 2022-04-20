package me.kovp.navigation.screens

import androidx.compose.ui.graphics.vector.ImageVector

abstract class BottomNavScreen : Screen() {
    abstract val labelRes: Int
    abstract val icon: ImageVector
}