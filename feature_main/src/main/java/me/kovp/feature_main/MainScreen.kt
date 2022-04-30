package me.kovp.feature_main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import me.kovp.feature_main.presentation.MainScreenCompose
import me.kovp.feature_main_api.MainScreenApi
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject

@ExperimentalMaterialApi
class MainScreen : MainScreenApi {
    private val internalScreen by inject<InternalMainScreen>(InternalMainScreen::class.java)

    init {
        loadKoinModules(
            module {
                single { InternalMainScreen() }
            }
        )
    }

    override fun navRoute() = ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(ROUTE) {
            MainScreenCompose(navController)
        }

        internalScreen.registerGraph(
            navGraphBuilder, navController, modifier
        )
    }

    companion object {
        private const val ROUTE = "main_screen"
    }
}