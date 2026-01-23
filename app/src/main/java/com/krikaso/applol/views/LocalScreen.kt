package com.krikaso.applol.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.krikaso.applol.R

data class Champion(val name: String, val imageRes: Int)

@Composable
fun LocalScreen(navController: NavHostController) {
    val champions = listOf(
        Champion("Garen", R.drawable.garen_local),
        Champion("Malphite", R.drawable.malphite_local),
        Champion("Twitch", R.drawable.twitch_local)
    )

    LazyColumn {
        items(champions) { champion ->
            ChampionCard(champion)
        }
    }
}

@Composable
fun ChampionCard(champion: Champion) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = champion.name,
            style = TextStyle(
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Image(
            painter = painterResource(id = champion.imageRes),
            contentDescription = "Imagen de ${champion.name}",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
    }
}