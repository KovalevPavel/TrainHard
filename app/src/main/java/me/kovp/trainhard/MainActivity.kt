package me.kovp.trainhard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import me.kovp.core.named
import me.kovp.core_ui.theme.TrainHardTheme
import me.kovp.feature_main.MainScreen
import me.kovp.feature_splash.presentation.SplashScreen
import me.kovp.navigation.register
import org.koin.androidx.compose.inject
import org.koin.core.context.loadKoinModules

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        loadKoinModules(
            hostNavigationModule()
        )
        super.onCreate(savedInstanceState)

        setContent {
            TrainHardTheme {
                val navController = rememberNavController()
                val startDestination by inject<String>(named(StartDestinationRoute::class.java))

                Scaffold {
                    NavHost(navController, startDestination) {
                        register(SplashScreen(), navController, Modifier)
                        register(MainScreen(), navController, Modifier)
                    }
                }
            }
        }
    }
}