package me.kovp.trainhard

import androidx.compose.material.ExperimentalMaterialApi
import me.kovp.core.named
import me.kovp.feature_main.MainScreen
import me.kovp.feature_main_api.MainScreenApi
import me.kovp.feature_splash.presentation.SplashScreen
import me.kovp.feature_splash_api.SplashScreenApi
import org.koin.dsl.module

@OptIn(ExperimentalMaterialApi::class)
fun hostNavigationModule() = module {
    single(named(StartDestinationRoute::class.java)) { SplashScreen().navRoute() }
    single<SplashScreenApi> { SplashScreen() }
    single<MainScreenApi> { MainScreen() }
}