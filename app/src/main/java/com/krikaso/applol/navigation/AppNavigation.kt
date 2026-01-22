package com.krikaso.applol.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.krikaso.applol.views.AudioScreen
import com.krikaso.applol.views.LocalScreen
import com.krikaso.applol.views.VideoScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Local.route) {
        composable(Screens.Audio.route) { AudioScreen(navController) }
        composable(Screens.Local.route) { LocalScreen(navController) }
        composable(Screens.Video.route) { VideoScreen(navController) }
    }
}