package com.example.areader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.areader.screens.ReaderSplashScreen
import com.example.areader.screens.createAccount.ReaderCreateAccountScreen
import com.example.areader.screens.details.ReaderBookDetailsScreen
import com.example.areader.screens.home.ReaderHomeScreen
import com.example.areader.screens.login.ReaderLoginScreen
import com.example.areader.screens.search.ReaderBookSearchScreen
import com.example.areader.screens.stats.ReaderStatsScreen
import com.example.areader.screens.update.ReaderBookUpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = ReaderScreens.SplashScreen.name){
        composable(ReaderScreens.SplashScreen.name){
            ReaderSplashScreen(navController)
        }
        composable(ReaderScreens.LoginScreen.name){
            ReaderLoginScreen(navController)
        }
        composable(ReaderScreens.CreateAccountScreen.name){
            ReaderCreateAccountScreen(navController)
        }
        composable(ReaderScreens.ReaderHomeScreen.name){
            ReaderHomeScreen(navController)
        }
        composable(ReaderScreens.SearchScreen.name){
            ReaderBookSearchScreen(navController)
        }
        composable(ReaderScreens.DetailScreen.name){
            ReaderBookDetailsScreen(navController)
        }
        composable(ReaderScreens.UpdateScreen.name){
            ReaderBookUpdateScreen(navController)
        }
        composable(ReaderScreens.ReaderStatsScreen.name){
            ReaderStatsScreen(navController)
        }

    }
}
