package me.kovp.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

fun NavGraphBuilder.register(
    api: ScreenApi,
    navController: NavHostController,
    modifier: Modifier
) {
    api.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}