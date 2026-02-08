package com.example.samuelramonmiguel_mycity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samuelramonmiguel_mycity.data.Datasource
import com.example.samuelramonmiguel_mycity.data.InfoExtra
import com.example.samuelramonmiguel_mycity.data.InfoRegion
import com.example.samuelramonmiguel_mycity.data.Regiones
import com.example.samuelramonmiguel_mycity.ui.theme.SamuelRamonMiguelMyCityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SamuelRamonMiguelMyCityTheme {
                // Fondo inicial
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Image(
                            painter = painterResource(id = R.drawable.fondo),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.75f)))
                        // Función inicial
                        MainApp(modifier = Modifier.fillMaxSize())
                    }
                }
            }
        }
    }
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    // Datos de la carpeta Data
    val datasource = Datasource()
    // Lista de las regiones
    val listaRegiones = datasource.regiones

    // Estados de si esta seleccionado un botón de región y el otro de info final
    var regionSeleccionada by remember { mutableStateOf<Regiones?>(null) }
    var infoExtraSeleccionada by remember { mutableStateOf<InfoExtra?>(null) }

    // Si no hay nada seleccionado muestra el menú inicial
    if (regionSeleccionada == null) {
        // Column con la imagen del juego y un lazy Column con los botones
        Column(
            modifier = modifier.fillMaxSize().padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.titulo),
                contentDescription = "Título de la App",
            )
            // Botones de las regiones que llaman a la funcion que genera las cartas
            LazyColumn(
                modifier = Modifier.weight(1f).padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(listaRegiones) { region ->
                    RegionCard(region = region, onClick = { regionSeleccionada = region })
                }
            }
        }
        // Si hay botón seleccionado dentro de un submenú llama a la función de mostrar info final
    } else if (infoExtraSeleccionada != null) {
        // Función de info final
        PantallaDetalleProfundo(
            infoExtra = infoExtraSeleccionada!!,
            onVolver = { infoExtraSeleccionada = null }
        )
        // Si hay seleccionado un botón del menú inicial pero no de submenú
    } else {
        // Busca los detalles de la primera región encontrada con el mismo nombre de la región seleccionada
        val detallesEncontrados = datasource.infoRegion.find {
            it.region == regionSeleccionada?.nombre
        } ?: datasource.infoRegion[0]
        // Llamamos a la función del submenú con la región seleccionada
        SubMenuRegion(
            region = regionSeleccionada!!,
            onVolver = { regionSeleccionada = null },
            infoRegion = detallesEncontrados,
            onInfoExtraClick = { extra -> infoExtraSeleccionada = extra }
        )
    }
}
// Función que llama al menú con la información final
@Composable
fun PantallaDetalleProfundo(infoExtra: InfoExtra, onVolver: () -> Unit) {
    // Column con un botón de volver al inicio y un lazyColumn con info
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF010A13))
            .padding(16.dp)
    ) {
        // Función de botón personalizado
        BotonVolverHextech(onVolver = onVolver)
        // Cada item es un column con una imagen un titulo y un texto informativo
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(infoExtra.infoProfunda) { detalle ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color(0xFFC8AA6E).copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                        .background(Color(0xFF010A13))
                ) {
                    // Imagen arriba
                    Image(
                        painter = painterResource(id = detalle.imagenResId),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )

                    // Textos debajo
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = detalle.titulo.uppercase(),
                            color = Color(0xFFC8AA6E),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                        // Espacio entre el titulo y el texto
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = detalle.info,
                            color = Color.White,
                            fontSize = 15.sp,
                            lineHeight = 22.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    }
                }
            }
        }
    }
}
// Función del submenú
@Composable
fun SubMenuRegion(
    region: Regiones,
    onVolver: () -> Unit,
    infoRegion: InfoRegion,
    onInfoExtraClick: (InfoExtra) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    // Fondo con la imagen de la region seleccionada
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = region.imagenResId),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // Oscurecemos la imagen
        Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.6f)))
        // Column con el botón de volver personalizado la imagen del título del lol y un lazyColumn
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(modifier = Modifier.align(Alignment.Start)) {
                BotonVolverHextech(onVolver = onVolver)
            }

            Image(
                painter = painterResource(id = R.drawable.titulo),
                contentDescription = null,
                modifier = Modifier.height(80.dp)
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(bottom = 32.dp)
            ) {
                // El primer item es una card que tiene el titulo y la imagen de la region seleccionada
                item {
                    Card(
                        modifier = Modifier
                            .padding(vertical = 16.dp)
                            .fillMaxWidth(0.95f)
                            .animateContentSize()
                            // Si la clickeas se expande
                            .clickable { expanded = !expanded },
                        shape = RoundedCornerShape(16.dp),
                    ) {
                        Column(modifier = Modifier.background(Color(0xFF010A13))) {
                            Box(modifier = Modifier.fillMaxWidth().height(80.dp)) {
                                Image(
                                    painter = painterResource(id = region.imagenResId),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = region.nombre,
                                    color = Color(0xFFC8AA6E),
                                    fontSize = 25.sp,
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                        .border(2.dp, Color(0xFFC8AA6E), RectangleShape)
                                        .background(Color(0xFF010A13).copy(alpha = 0.8f))
                                        .padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                            // Si esta expandida se muestra la info
                            if (expanded) {
                                Text(
                                    text = infoRegion.info,
                                    color = Color.White,
                                    modifier = Modifier.padding(16.dp),
                                    fontSize = 14.sp
                                )
                            }
                        }
                    }
                }
                // El siguiente item era un column con 2 row que muestra info importante de la region
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.95f)
                            .border(2.dp, color= Color(0xFFC8AA6E), RectangleShape)
                            .background(Color(0xFF010A13))
                            .padding(20.dp)
                    ) {
                        // Los 2 row llaman a una función que es para escribir los detalles de la info
                        Row(modifier = Modifier.fillMaxWidth()) {
                            DetallesInfo(Modifier.weight(1f), "Gobierno:", infoRegion.gobierno)
                            DetallesInfo(Modifier.weight(1f), "Magia:", infoRegion.magia)
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
                            DetallesInfo(Modifier.weight(1f), "Tecnología:", infoRegion.tecnologia)
                            DetallesInfo(Modifier.weight(1f), "Entorno:", infoRegion.Entorno)
                        }
                    }
                }
                // Por último son todos los botones de info más profunda de la región
                items(infoRegion.infoExtra) { extra ->
                    CardInfoExtra(
                        infoExtra = extra,
                        onClick = { onInfoExtraClick(extra) }
                    )
                }
            }
        }
    }
}
// Función que hace las card del menú inicial
@Composable
fun RegionCard(region: Regiones, onClick: () -> Unit) {
    // Simplemente una card con un titulo y una imagen y que sea clickeable
    Card(
        modifier = Modifier.padding(16.dp).fillMaxWidth(0.9f).height(200.dp).clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = region.imagenResId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.4f))
            )
            Text(
                text = region.nombre,
                color = Color(0xFFC8AA6E),
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.align(Alignment.Center).border(2.dp, Color(0xFFC8AA6E), RectangleShape).background(Color(0xFF010A13).copy(alpha = 0.8f)).padding(16.dp)
            )
        }
    }
}
// Esta es la función que crea las card del submenú
@Composable
fun CardInfoExtra(infoExtra: InfoExtra, onClick: () -> Unit) {
    // Es lo mismo que la otra función solo que con info diferente
    Card(
        modifier = Modifier.padding(vertical = 8.dp)
            .fillMaxWidth(0.95f)
            .height(100.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = infoExtra.imagenResId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.4f))
            )
            Text(
                text = infoExtra.titulo.uppercase(),
                color = Color(0xFFC8AA6E),
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.align(Alignment.Center).border(1.dp, Color(0xFFC8AA6E), RectangleShape).background(Color(0xFF010A13).copy(alpha = 0.8f)).padding(8.dp)
            )
        }
    }
}

// Función para mostrar el botón decorativo de volver
@Composable
fun BotonVolverHextech(onVolver: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(60.dp)
            .clickable(onClick = onVolver)
    ) {
        // Esto es el cuadrado de atrás solo que lo rotamos 42 grados para que parezca un rombo
        Box(
            modifier = Modifier.size(42.dp)
                .rotate(45f)
                .background(Color(0xFF1E2328))
                .border(1.dp, Color(0xFFC8AA6E))
        )
        // Este es el circulo de dentro del rombo
        Box(
            modifier = Modifier.size(34.dp)
                .background(Color(0xFF010A13), CircleShape)
                .border(1.dp, Color(0xFFC8AA6E).copy(alpha = 0.5f), CircleShape)
        )
        // Y el símbolo del botón
        Text(
            text = "<",
            color = Color(0xFFC8AA6E),
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold)
    }
}
// La función de mostrar detalles de la info importante del submenú
@Composable
fun DetallesInfo(modifier: Modifier, label: String, value: String) {
    Column(modifier = modifier) {
        Text(
            text = label,
            color = Color(0xFFC8AA6E).copy(alpha = 0.7f),
            fontSize = 13.sp
        )
        Text(
            text = value.uppercase(),
            color = Color(0xFFC8AA6E),
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace
        )
    }
}