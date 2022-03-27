package me.kovp.views.counter.domain

sealed class CounterEvent {
    object Decrease: CounterEvent()
    object Increase: CounterEvent()
}
