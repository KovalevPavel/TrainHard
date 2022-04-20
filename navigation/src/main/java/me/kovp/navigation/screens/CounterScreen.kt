package me.kovp.navigation.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import me.kovp.navigation.creators.CounterScreen

object CounterScreen : BottomNavScreen() {
    override val labelRes: Int = 0
    override val icon: ImageVector = Icons.Default.Email
    override val navRoute: String = "next_screen"

    @Composable
    override fun Creator() {
        CounterScreen()
    }
}