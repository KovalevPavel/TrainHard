package me.kovp.navigation.screens

import androidx.compose.runtime.Composable
import me.kovp.navigation.creators.Splash

object SplashScreen : Screen() {
    override val navRoute: String = "main_screen"

    @Composable
    override fun Creator() {
        Splash()
    }
}