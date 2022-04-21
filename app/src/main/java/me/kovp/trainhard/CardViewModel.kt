package me.kovp.trainhard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State

interface CardViewModel {
    val cardState: State<CardElementState>
    @Composable
    fun onClick()
}