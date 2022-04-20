package me.kovp.navigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

abstract class Screen {
    abstract val navRoute: String

    @Composable
    abstract fun Creator()

    fun getScreen(navGraphBuilder: NavGraphBuilder) =
        navGraphBuilder.composable(route = navRoute) {
            Creator()
        }
}
