package me.kovp.navigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

class Router(
    private val navController: NavHostController
) {
    @Composable
    fun NavigateTo(screen: Screen) {
        navController.navigate(screen.navRoute) {

        }
    }

    @Composable
    fun NavigateBack() {
        navController.popBackStack()
    }
}