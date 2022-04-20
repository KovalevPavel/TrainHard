package me.kovp.trainhard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import me.kovp.navigation.screens.CounterScreen
import me.kovp.navigation.screens.Router

class CardViewModelImpl : ViewModel(), CardViewModel {
    override val cardState = mutableStateOf(CardElementState())

    private val router: Router
        @Composable
        get() = Router(navController = rememberNavController())

    @Composable
    override fun onClick() {
        if (cardState.value.currentValue == cardState.value.maxValue) return
        cardState.value = cardState.value.copy(currentValue = cardState.value.currentValue + 1)
        router.NavigateTo(CounterScreen)
    }
}