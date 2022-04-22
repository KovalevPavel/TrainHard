package me.kovp.trainhard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.navigation.compose.rememberNavController

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            me.kovp.core_ui.theme.TrainHardTheme {
                val navController = rememberNavController()
                Scaffold {
                    NavigationInitializerImpl(navController).Initialize()
                }
            }
        }
    }
}