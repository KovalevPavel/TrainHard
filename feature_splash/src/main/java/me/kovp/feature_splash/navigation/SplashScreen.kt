package me.kovp.feature_splash.navigation

import androidx.compose.runtime.Composable

import me.kovp.feature_splash.SplashViewModel
import me.kovp.feature_splash.SplashViewModelImpl
import me.kovp.feature_splash.presentation.Splash
import me.kovp.navigation.screens.Screen
import org.koin.androidx.compose.viewModel

object SplashScreen : Screen<SplashViewModelImpl>() {
    override val navRoute: String = "splash"

    @Composable
    override fun Creator() {
        Splash()
    }

    override val vm = SplashViewModelImpl()

    private val tt: SplashViewModel by viewModel<SplashViewModelImpl>()
}