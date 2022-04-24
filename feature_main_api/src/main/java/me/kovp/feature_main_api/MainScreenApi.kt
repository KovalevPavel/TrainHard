package me.kovp.feature_main_api

import me.kovp.navigation.ScreenApi

interface MainScreenApi : ScreenApi {
    fun navRoute(): String
}