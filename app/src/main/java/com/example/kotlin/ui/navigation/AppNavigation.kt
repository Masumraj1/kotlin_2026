package com.example.kotlin.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin.ui.screens.DataListScreen
//import com.example.kotlin.ui.screens.LoginScreen
import com.example.kotlin.ui.screens.ProfileScreen
//import com.example.kotlin.ui.screens.DataListScreen
import com.example.kotlin.ui.screens.HomeScreen // Ekta main home screen thakbe
import com.example.kotlin.ui.screens.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController() // Flutter-e Navigator-er moto kaj kore

    NavHost(navController = navController, startDestination = "home") {
        // ১. Home Screen (Jekhane sob button thakbe)
        composable("home") {
            HomeScreen(
                onProfileClick = { navController.navigate("profile") },
                onLoginClick = { navController.navigate("login") },
                onDataClick = { navController.navigate("data_list") }
            )
        }

        // ২. Profile Screen
        composable("profile") {
            ProfileScreen()
        }

        // ৩. Login Screen
        composable("login") {
            LoginScreen() // এখন এটি এরর দিবে না কারণ ফাইলটি আপনি তৈরি করেছেন
        }

// ৪. Data List Screen
        composable("data_list") {
            DataListScreen() // এখন এটিও কাজ করবে
        }
    }
}