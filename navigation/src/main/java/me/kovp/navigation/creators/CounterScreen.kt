package me.kovp.navigation.creators

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.kovp.views.counter.presentation.Counter

@Preview
@Composable
fun CounterScreen() {
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
        Counter(text = "ttt",
        modifier = Modifier.padding(20.dp))
    }
}