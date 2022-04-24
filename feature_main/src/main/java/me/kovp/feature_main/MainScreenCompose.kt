package me.kovp.feature_main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import me.kovp.views.counter.Toolbar
import me.kovp.views.counter.presentation.Counter

@ExperimentalMaterialApi
@Composable
fun MainScreenCompose(navHost: NavHostController) {

    Scaffold(
        modifier = Modifier,
        topBar = { Toolbar.NavigationToolbar(onBackClick = { navHost.popBackStack() }) }
    ) {
        Row {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .size(
                        width = 140.dp,
                        height = 140.dp
                    ),
                elevation = 16.dp,
                backgroundColor = Color.Blue
            ) {

            }
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .size(
                        width = 140.dp,
                        height = 140.dp
                    ),
                elevation = 16.dp,
            ) {

            }
        }

        Box(modifier = Modifier.background(Color.White)) {
            Counter(
                text = "ttt",
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}