package me.kovp.feature_splash_api

import me.kovp.navigation.ScreenApi

interface SplashScreenApi : ScreenApi {
    fun navRoute(): String
}