package me.kovp.feature_splash.presentation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import me.kovp.feature_splash_api.SplashScreenApi

class SplashScreen : SplashScreenApi {
    override fun navRoute() = ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(ROUTE) {
            SplashScreenCompose(navController)
        }
    }

    companion object {
        private const val ROUTE = "splash_screen"
    }
}