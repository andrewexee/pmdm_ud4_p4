package com.krikaso.applol.views

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.krikaso.applol.R

@Composable
fun VideoScreen(navController: NavController) {
    val context = LocalContext.current
    val videoUri = Uri.parse("android.resource://${context.packageName}/${R.raw.garen_video}")

    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = {
            VideoView(it).apply {
                setVideoURI(videoUri)
                val mediaController = MediaController(it)
                mediaController.setAnchorView(this)
                setMediaController(mediaController)
                setOnPreparedListener { mp ->
                    mp.isLooping = true
                    start()
                }
            }
        }
    )
}