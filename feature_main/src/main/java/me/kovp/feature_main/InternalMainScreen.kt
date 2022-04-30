package me.kovp.feature_main

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import me.kovp.navigation.ScreenApi

internal class InternalMainScreen : ScreenApi {

    fun screenA() = SCREEN_A_ROUTE
    fun screenB(parameter: String) = "$SCREEN_B_ROUTE/${parameter}"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.navigation(
            route = SCENARIO_AB_ROUTE,
            startDestination = SCREEN_A_ROUTE
        ) {
            composable(route = SCREEN_A_ROUTE) {
                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(screenB("TEST_PARAM"))
                    },
                    text = "Screen A"
                )
            }
            composable(
                route = "${SCREEN_B_ROUTE}/{$PARAMETER_KEY}",
                arguments = listOf(navArgument(PARAMETER_KEY) {
                    type = NavType.StringType
                })
            ) { navBackStackEntry ->
                val arguments = requireNotNull(navBackStackEntry.arguments)
                val argument = arguments.getString(PARAMETER_KEY)
                Text(text = "Screen B with argument $argument")
            }
        }
    }

    companion object {
        private const val SCENARIO_AB_ROUTE = "main_screen/abRoute"
        private const val PARAMETER_KEY = "PARAMETER_KEY"
        private const val SCREEN_B_ROUTE = "main_screen/screenB"
        private const val SCREEN_A_ROUTE = "main_screen/screenA"
    }
}