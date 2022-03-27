package me.kovp.views.counter.presentation

import androidx.compose.runtime.State
import me.kovp.views.counter.domain.CounterEvent
import me.kovp.views.counter.domain.CounterState

interface CounterViewModel {
    val counterState: State<CounterState>
    fun onEvent(event: CounterEvent)
}