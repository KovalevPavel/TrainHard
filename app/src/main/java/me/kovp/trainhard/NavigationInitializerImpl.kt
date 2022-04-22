package me.kovp.trainhard

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.kovp.feature_main.MainScreenCompose
import me.kovp.feature_splash.presentation.SplashScreenCompose
import me.kovp.navigation.screens.MainScreen
import me.kovp.navigation.NavigationInitializer
import me.kovp.navigation.screens.SplashScreen

class NavigationInitializerImpl(
    private val navController: NavHostController
) : NavigationInitializer {

    @Composable
    override fun Initialize() {
        NavHost(navController = navController, startDestination = SplashScreen.navRoute) {
            composable(SplashScreen.navRoute) { SplashScreenCompose(navController) }
            composable(MainScreen().navRoute) { MainScreenCompose() }
        }
    }
}