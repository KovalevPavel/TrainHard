package me.kovp.trainhard

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CardViewModelImpl : ViewModel(), CardViewModel{
    override val cardState = mutableStateOf(CardElementState())

    override fun onClick() {
        if (cardState.value.currentValue == cardState.value.maxValue) return
        cardState.value = cardState.value.copy(currentValue = cardState.value.currentValue + 1)
    }
}