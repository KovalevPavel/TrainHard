package me.kovp.navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import me.kovp.views.counter.presentation.Counter


//@Composable
fun NavGraphBuilder.counterScreen() = composable("home") {
    EEE()
}
@Preview
@Composable
fun EEE() {
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