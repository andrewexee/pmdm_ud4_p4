package com.krikaso.applol.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.krikaso.applol.R
import com.krikaso.applol.nav.Screens

@Composable
fun LocalScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(top = 60.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // DURO COMO LA PIEDRA
            Text(
                text = "Duro como la piedra",
                style = TextStyle(
                    fontSize = 24.sp, // Tamaño de la fuente (sp es para unidades escalables)
                    color = Color.Black, // Color del texto
                    textAlign = TextAlign.Center // Justificación del texto
                ),
                modifier = Modifier
                    .padding(16.dp) // Añade un poco de padding para que se vea mejor
                    .background(Color.Green) // Fondo para ver la alineación
            )
            Image(
                painter = painterResource(id = R.drawable.malphite_local),
                contentDescription = "Imagen local de Malphite",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            // DEMACIAAA
            Text(
                text = "DEMACIAAA",
                style = TextStyle(
                    fontSize = 24.sp, // Tamaño de la fuente (sp es para unidades escalables)
                    color = Color.Black, // Color del texto
                    textAlign = TextAlign.Center // Justificación del texto
                ),
                modifier = Modifier
                    .padding(16.dp) // Añade un poco de padding para que se vea mejor
                    .background(Color.Cyan) // Fondo para ver la alineación
            )
            Image(
                painter = painterResource(id = R.drawable.garen_local),
                contentDescription = "Imagen local de Malphite",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            // Tututututu
            Text(
                text = "Tututututu",
                style = TextStyle(
                    fontSize = 24.sp, // Tamaño de la fuente (sp es para unidades escalables)
                    color = Color.Black, // Color del texto
                    textAlign = TextAlign.Center // Justificación del texto
                ),
                modifier = Modifier
                    .padding(16.dp) // Añade un poco de padding para que se vea mejor
                    .background(Color.Magenta) // Fondo para ver la alineación
            )
            Image(
                painter = painterResource(id = R.drawable.twitch_local),
                contentDescription = "Imagen local de Malphite",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Button(onClick = {
                // Aquí haces la redirección al archivo LocalScreen.kt
                navController.navigate(Screens.Main.route)
                },
                modifier = Modifier
                    .padding(top = 60.dp)
            ) {
                Text("Ir a Main Screen")
            }
        }
    }

}

