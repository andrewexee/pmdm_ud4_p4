package com.krikaso.applol.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.krikaso.applol.nav.Screens

@Composable
fun MainScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Esta es la Pantalla Principal",
            style = TextStyle(
                fontSize = 24.sp, // Tamaño de la fuente (sp es para unidades escalables)
                color = Color.Black, // Color del texto
                textAlign = TextAlign.Center // Justificación del texto
            ),
        )

        Button(onClick = {
            // Aquí haces la redirección al archivo LocalScreen.kt
            navController.navigate(Screens.Local.route)
        }) {
            Text("Ir a Local Screen")
        }
    }
}