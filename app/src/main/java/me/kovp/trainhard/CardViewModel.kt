package me.kovp.trainhard

import androidx.compose.runtime.State


interface CardViewModel {
    val cardState: State<CardElementState>
    fun onClick()
}