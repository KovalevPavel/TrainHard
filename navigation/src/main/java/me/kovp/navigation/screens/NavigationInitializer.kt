package me.kovp.navigation.screens

import androidx.compose.runtime.Composable

fun interface NavigationInitializer {
    @Composable
    fun Initialize()
}