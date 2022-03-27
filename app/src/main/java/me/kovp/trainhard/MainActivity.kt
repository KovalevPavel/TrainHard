package me.kovp.trainhard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.BadgedBox
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import me.kovp.navigation.screens.counterScreen
import org.koin.androidx.compose.viewModel

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            me.kovp.core_ui.theme.TrainHardTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    name = "Home",
                                    route = "home",
                                    icon = Icons.Default.Home
                                ),
                                BottomNavItem(
                                    name = "Chat",
                                    route = "chat",
                                    icon = Icons.Default.Notifications,
                                    badgeCount = 23
                                ),
                                BottomNavItem(
                                    name = "Settings",
                                    route = "settings",
                                    icon = Icons.Default.Settings
                                )
                            ),
                            navController = navController,
                            onItemClick = {
                                it.badgeCount = 0
                                navController.navigate(it.route)
                            }
                        )
                    }
                ) {
                    Navigation(
                        navHost = navController
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String?) {
    Text(text = "Hello $name!")
}

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.DarkGray,
        elevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = Color.Green,
                unselectedContentColor = Color.White,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        if (item.badgeCount > 0) {
                            BadgedBox(
                                badge = { Text(text = item.badgeCount.toString()) }
                            ) {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = item.name
                                )
                            }
                        } else {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.name
                            )
                        }
                        if (selected) {
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun Navigation(navHost: NavHostController) {
    val vm: CardViewModel by viewModel<CardViewModelImpl>()
    NavHost(navController = navHost, startDestination = "home") {
        counterScreen()
        composable("chat") {
            Greeting("Chat")
        }
        composable("settings") {
            Greeting("Settings")
        }
    }
}

//@Composable
//fun CardScreen() {
//    loadKoinModules(counterVM())
//    val vm: CounterViewModel by viewModel<CounterViewModelImpl>()
//    Column {
//        Counter(
//            text = vm.counterState.value.currentWeight.toString(),
//            onDecrease = { vm.onEvent(DecreaseWeight) },
//            onIncrease = { vm.onEvent(IncreaseWeight) }
//        )
//        Spacer(modifier = Modifier.size(50.dp))
//        Counter(
//            text = vm.counterState.value.currentReps.toString(),
//            onDecrease = { vm.onEvent(DecreaseReps) },
//            onIncrease = { vm.onEvent(IncreaseReps) }
//        )
//    }
//}