package me.kovp.navigation.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import org.koin.androidx.compose.viewModel

abstract class Screen<T : Any, R : ViewModel> {
    abstract val navRoute: String

    private val tt: T by viewModel<R>()
//    lateinit var vm: T
//        private set

    @Composable
    abstract fun Creator()

    fun getScreen(navGraphBuilder: NavGraphBuilder) =
        navGraphBuilder.composable(route = navRoute) {
            Creator()
        }.also {
//            vm by viewModel<R>()
        }
}
