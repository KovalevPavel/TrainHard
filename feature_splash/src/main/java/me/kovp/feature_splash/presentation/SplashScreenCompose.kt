package me.kovp.feature_splash.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import me.kovp.feature_main_api.MainScreenApi
import me.kovp.feature_splash.R
import org.koin.androidx.compose.inject

@Composable
fun SplashScreenCompose(navHost: NavHostController) {
    val mainApi by inject<MainScreenApi>()
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                modifier = Modifier.clickable {
                    navHost.navigate(route = mainApi.navRoute()) {
//                        popUpTo(SplashScreen.navRoute) { inclusive = true }
                    }
                },
                painter = painterResource(R.drawable.ic_splash_logo),
                contentDescription = null
            )
        }
    }
}