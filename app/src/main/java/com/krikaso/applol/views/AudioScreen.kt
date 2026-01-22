package com.krikaso.applol.views

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.krikaso.applol.R

@Composable
fun AudioScreen(navController: NavController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AudioButton(context = context, name = "Garen", audioResId = R.raw.garen_audio)
        AudioButton(context = context, name = "Twitch", audioResId = R.raw.twitch_audio)
        AudioButton(context = context, name = "Malphite", audioResId = R.raw.malphite_audio)
    }
}

@Composable
fun AudioButton(context: Context, name: String, audioResId: Int) {
    Button(
        onClick = {
            val mediaPlayer = MediaPlayer.create(context, audioResId)
            mediaPlayer.setOnCompletionListener { mp -> mp.release() }
            mediaPlayer.start()
        },
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = "Reproducir audio de $name")
    }
}