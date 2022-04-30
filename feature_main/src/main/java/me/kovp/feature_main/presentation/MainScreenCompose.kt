package me.kovp.feature_main.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import me.kovp.feature_main.InternalMainScreen
import me.kovp.views.counter.Toolbar
import org.koin.androidx.compose.inject

@ExperimentalMaterialApi
@Composable
fun MainScreenCompose(navHost: NavHostController) {
    Scaffold(
        topBar = { Toolbar.SimpleToolbar() },
    ) {
        MainScreen_InfoPlate(0, "", navHost)
    }
}

@ExperimentalMaterialApi
@Composable
fun MainScreen_InfoPlate(currentDate: Long, currentPattern: String, navHost: NavHostController) {
    val internalScreens by inject<InternalMainScreen>()

    Row(modifier = Modifier.padding(16.dp)) {
        Card(
            modifier = Modifier.size(100.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = 16.dp,
            onClick = {
                navHost.navigate(internalScreens.screenA())
            }
        ) {
            Column(
                modifier = Modifier.padding(6.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    fontSize = 34.sp,
                    text = "25"
                )
                Text(
                    fontSize = 20.sp,
                    text = "сентября"
                )
            }
        }
    }
}