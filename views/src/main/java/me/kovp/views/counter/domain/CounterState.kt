package me.kovp.views.counter.domain

data class CounterState(
    var currentWeight: Float = 0f,
    val weightIncrement: Float = 0f,
    val minWeight: Float = 0f,
    var currentReps: Float = 0f,
    val repsIncrement: Float = 0f,
    val minReps: Float = 0f
)
