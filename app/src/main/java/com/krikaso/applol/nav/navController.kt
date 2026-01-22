package com.krikaso.applol.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.krikaso.applol.views.LocalScreen
import com.krikaso.applol.views.MainScreen

// 1. Definimos las rutas de forma segura
sealed class Screens(val route: String) {
    object Main : Screens("main_screen")
    object Local : Screens("local_screen")
    // Añade aquí Remote y Video después
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // 2. El NavHost que gestiona los cambios
    NavHost(navController = navController, startDestination = Screens.Main.route) {
        composable(Screens.Main.route) {
            // Pasamos la acción de navegar al MainScreen
            MainScreen(navController = navController)
        }
        composable(Screens.Local.route) {
            LocalScreen(navController = navController)
        }
    }
}