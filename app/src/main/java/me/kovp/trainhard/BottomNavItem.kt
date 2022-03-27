package me.kovp.trainhard

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    var badgeCount: Int = 0
)
