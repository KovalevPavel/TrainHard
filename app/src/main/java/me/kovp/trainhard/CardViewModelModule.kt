package me.kovp.trainhard

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val cardViewModelModule = module {
    viewModel { CardViewModelImpl() }
}