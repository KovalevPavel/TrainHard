package me.kovp.trainhard

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import me.kovp.navigation.screens.CounterScreen
import me.kovp.navigation.screens.NavigationInitializer
import me.kovp.navigation.screens.SplashScreen

class NavigationInitializerImpl(
    private val navController: NavHostController
) : NavigationInitializer {

    @Composable
    override fun Initialize() {
        NavHost(navController = navController, startDestination = "") {
            SplashScreen.getScreen(this)
            CounterScreen.getScreen(this)
        }
    }
}