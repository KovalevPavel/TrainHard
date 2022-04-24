package me.kovp.feature_main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import me.kovp.feature_main_api.MainScreenApi

@ExperimentalMaterialApi
class MainScreen: MainScreenApi {

    override fun navRoute() = ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(ROUTE) {
            MainScreenCompose(navController)
        }
    }

    companion object {
        private const val ROUTE = "main_screen"
    }
}