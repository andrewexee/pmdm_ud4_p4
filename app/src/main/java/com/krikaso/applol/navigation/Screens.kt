package com.krikaso.applol.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Audio : Screens("audio_screen", "Audio", Icons.Filled.MusicNote)
    object Local : Screens("local_screen", "Fotos", Icons.Filled.PhotoLibrary)
    object Video : Screens("video_screen", "Video", Icons.Filled.Videocam)
}