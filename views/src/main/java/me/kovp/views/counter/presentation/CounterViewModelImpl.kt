package me.kovp.views.counter.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import me.kovp.views.counter.domain.CounterEvent
import me.kovp.views.counter.domain.CounterState

class CounterViewModelImpl : ViewModel(), CounterViewModel {

    override val counterState = mutableStateOf(
        CounterState(
            weightIncrement = 5f,
            repsIncrement = 1f
        )
    )

    override fun onEvent(event: CounterEvent) {
//        when (event) {
//            is IncreaseWeight -> counterState.value =
//                counterState.value.copy(
//                    currentWeight = counterState.value.currentWeight +
//                            counterState.value.weightIncrement
//                )
//            is DecreaseWeight -> counterState.value =
//                counterState.value.copy(
//                    currentWeight = counterState.value.currentWeight -
//                            counterState.value.weightIncrement
//                )
//            is IncreaseReps -> counterState.value =
//                counterState.value.copy(
//                    currentReps = counterState.value.currentReps +
//                            counterState.value.repsIncrement
//                )
//            is DecreaseReps -> counterState.value =
//                counterState.value.copy(
//                    currentReps = counterState.value.currentReps -
//                            counterState.value.repsIncrement
//                )
//        }
    }
}