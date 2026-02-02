package com.example.samuelramonmiguel_mycity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samuelramonmiguel_mycity.ui.theme.SamuelRamonMiguelMyCityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SamuelRamonMiguelMyCityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Box para poner el fondo de pantalla
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Image(
                            painter = painterResource(id = R.drawable.fondo),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        // Box para meterle sombreado al fondo
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.75f))
                        )
                        // Main
                        MainApp(modifier = Modifier.fillMaxSize())
                    }
                }
            }
        }
    }
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    // Lista de regiones con su nombre y imagen con el objeto Lugar
    var regionSeleccionada by remember { mutableStateOf<Lugar?>(null) }

    val regionesLOL = remember {
        listOf(
            Lugar("Noxus", R.drawable.noxus),
            Lugar("Demacia", R.drawable.demacia),
            Lugar("Jonia", R.drawable.jonia),
            Lugar("Freljord", R.drawable.freljord),
            Lugar("Shurima", R.drawable.shurima),
            Lugar("Targon", R.drawable.targon),
            Lugar("Ixtal", R.drawable.ixtal),
            Lugar("Piltover", R.drawable.piltover),
            Lugar("Zaun", R.drawable.zaun),
            Lugar("El Vacío", R.drawable.vacio),
            Lugar("Ciudad bandle", R.drawable.bandle),
            Lugar("Isla de sombras", R.drawable.islasombras),
            Lugar("Aguas estancadas", R.drawable.aguasestancadas),
        )
    }

    val context = LocalContext.current

    // Si no hay region seleccionada sale el lazyColumn con todas las regiones
    if (regionSeleccionada == null) {

        LazyColumn(
            // Lo centramos horizontalmente y le añadimos una separación entre botones
            modifier = modifier.padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Siempre que añadamos
            items(regionesLOL) { lugar ->
                RegionCard(
                    lugar = lugar,
                    onClick = {
                        regionSeleccionada = lugar
                        Toast.makeText(context, "Entrando en ${lugar.nombre}", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
        // Si si hay region seleccionada sale el menú de la región
    } else {
        SubMenuRegion(
            lugar = regionSeleccionada!!,
            onVolver = { regionSeleccionada = null }
        )
    }
}

@Composable
fun RegionCard(
    lugar: Lugar,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(0.9f)
            .height(200.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = lugar.imagenResId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.4f))
            )

            Text(
                text = lugar.nombre,
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.Center)
                    .border(2.dp, Color.White, RectangleShape)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}


@Composable
fun SubMenuRegion(lugar: Lugar, onVolver: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = lugar.imagenResId),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.4f))
        )
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = lugar.nombre,
            color = Color.White,
            fontSize = 45.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )

        Button(
            onClick = onVolver,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text(text = "Volver", color = Color.White)
        }
    }
}

data class Lugar(
    val nombre: String,
    @DrawableRes val imagenResId: Int
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SamuelRamonMiguelMyCityTheme {
        MainApp()
    }
}