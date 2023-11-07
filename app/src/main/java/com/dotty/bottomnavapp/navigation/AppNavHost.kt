package com.dotty.bottomnavapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dotty.bottomnavapp.ui.theme.screens.bottomnav.BottomNavScreen
import com.dotty.bottomnavapp.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
    navController:NavHostController= rememberNavController(),
    startDestination: String= ROUTE_SPLASH
) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination){

        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUTE_BOTTOMNAV){
            BottomNavScreen(navController)
        }
    }

}