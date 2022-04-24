package me.kovp.views.counter

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import me.kovp.views.R

object Toolbar {

    @Composable
    fun SimpleToolbar(modifier: Modifier = Modifier) {
        TopAppBar(modifier = modifier) {
            Text(
                style = MaterialTheme.typography.h1,
                modifier = modifier.padding(start = 16.dp),
                text = stringResource(R.string.app_name)
            )
        }
    }

    @ExperimentalMaterialApi
    @Composable
    fun NavigationToolbar(modifier: Modifier = Modifier, onBackClick: () -> Boolean) {
        TopAppBar(modifier = modifier) {
            Surface(
                shape = CircleShape,
                color = Color.Transparent,

                onClick = { onBackClick() }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier.padding(8.dp),
                )
            }

            Text(
                style = MaterialTheme.typography.h1,
                text = stringResource(R.string.app_name)
            )
        }
    }
}