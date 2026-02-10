package com.example.samuelramonmiguel_mycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samuelramonmiguel_mycity.data.Datasource
import com.example.samuelramonmiguel_mycity.data.InfoExtra
import com.example.samuelramonmiguel_mycity.data.InfoRegion
import com.example.samuelramonmiguel_mycity.data.Regiones
import com.example.samuelramonmiguel_mycity.data.Campeon

import com.example.samuelramonmiguel_mycity.ui.theme.SamuelRamonMiguelMyCityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SamuelRamonMiguelMyCityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Image(
                            painter = painterResource(id = R.drawable.fondo),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.75f)))
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
    val listaRegiones = datasource.regiones
    val listaCampeones = datasource.campeones // Asumo que están en tu datasource

    // Estados de selección
    var regionSeleccionada by remember { mutableStateOf<Regiones?>(null) }
    var infoExtraSeleccionada by remember { mutableStateOf<InfoExtra?>(null) }
    var campeonSeleccionado by remember { mutableStateOf<Campeon?>(null) }

    // Si se ha seleccionado un campeón se abre el menú del campeón
    if (campeonSeleccionado != null) {
        menuCampeon(
            campeon = campeonSeleccionado!!,
            onVolver = { campeonSeleccionado = null }
        )
        // Si se ha seleccionado un botón de info extra se abre el menú de info extra
    } else if (infoExtraSeleccionada != null) {
        PantallaDetalleProfundo(
            infoExtra = infoExtraSeleccionada!!,
            onVolver = { infoExtraSeleccionada = null }
        )
        // Si se ha seleccionado una región se abre el menú de la región
    } else if (regionSeleccionada != null) {
        val detallesEncontrados = datasource.infoRegion.find {
            it.region == regionSeleccionada?.nombre
        } ?: datasource.infoRegion[0]

        SubMenuRegion(
            region = regionSeleccionada!!,
            onVolver = { regionSeleccionada = null },
            infoRegion = detallesEncontrados,
            onInfoExtraClick = { extra -> infoExtraSeleccionada = extra },
            listaCampeones = listaCampeones,
            onCampeonClick = { campeon -> campeonSeleccionado = campeon }
        )
        // Si no hay nada seleccionado esta el menú principal
    } else {
        // Pantalla de inicio
        Column(
            modifier = modifier.fillMaxSize().padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.titulo),
                contentDescription = "Título de la App",
            )
            LazyColumn(
                modifier = Modifier.weight(1f).padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(listaRegiones) { region ->
                    RegionCard(region = region, onClick = { regionSeleccionada = region })
                }
            }
        }
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
// Función del submenú de cada región
@Composable
fun SubMenuRegion(
    region: Regiones,
    onVolver: () -> Unit,
    infoRegion: InfoRegion,
    onInfoExtraClick: (InfoExtra) -> Unit,
    listaCampeones: List<Campeon>,
    onCampeonClick: (Campeon) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    // Filtrar campeones que pertenecen a esta región
    val campeonesFiltrados = listaCampeones.filter { it.region == region.nombre }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = region.imagenResId),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.6f)))

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
                // Card de la Región
                item {
                    Card(
                        modifier = Modifier
                            .padding(vertical = 16.dp)
                            .fillMaxWidth(0.95f)
                            .animateContentSize()
                            // Si clickeas se expande la tarjeta
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
                            // Si esta expandida se ve la info
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

                // LazyRow de Campeones filtrados
                item {
                    Text(
                        text = "CAMPEONES DE LA REGIÓN",
                        color = Color(0xFFC8AA6E),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(0.95f),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        contentPadding = PaddingValues(bottom = 20.dp)
                    ) {
                        items(campeonesFiltrados) { campeon ->
                            CardCampeon(
                                campeon = campeon,
                                // Si clickeas te mete al menú del campeón
                                onClick = { onCampeonClick(campeon) }
                            )
                        }
                    }
                }

                // Detalles de la región
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.95f)
                            .border(2.dp, color= Color(0xFFC8AA6E), RectangleShape)
                            .background(Color(0xFF010A13))
                            .padding(20.dp)
                        // Llama a la función de destalles
                    ) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            DetallesInfo(Modifier.weight(1f), "Gobierno:", infoRegion.gobierno)
                            DetallesInfo(Modifier.weight(1f), "Actitud respecto a la magia::", infoRegion.magia)
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
                            DetallesInfo(Modifier.weight(1f), "Nivel de tecnología:", infoRegion.tecnologia)
                            DetallesInfo(Modifier.weight(1f), "Entorno general:", infoRegion.Entorno)
                        }
                    }
                }

                // Botones de info extra
                items(infoRegion.infoExtra) { extra ->
                    CardInfoExtra(
                        infoExtra = extra,
                        // Si se clickea entras al menú de info extra
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
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth(0.9f)
            .height(200.dp)
            // Si lo clickeas entras al submenú de la región
            .clickable(onClick = onClick),
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
// Función de las tarjetas de los campeones
@Composable
fun CardCampeon(campeon: Campeon, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .size(80.dp)
            // Si lo clickeas se mete al menú del campeón
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color(0xFFC8AA6E))
    ) {
        Image(
            painter = painterResource(id = campeon.imagenResId),
            contentDescription = campeon.nombre,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}
// Menú que sale cuando le das a un campeón
@Composable
fun menuCampeon(campeon: Campeon, onVolver: () -> Unit) {
    // Usamos LazyColumn para que al estar horizontal el móvil se pueda ver todo
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF010A13))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                BotonVolverHextech(onVolver = onVolver)
            }
        }
        item {
            Image(
                painter = painterResource(id = campeon.imagenResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(250.dp)
                    .border(2.dp, Color(0xFFC8AA6E)),
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter
            )
        }
        item {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = campeon.nombre.uppercase(),
                    color = Color(0xFFC8AA6E),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )
                Text(
                    text = "Región: ${campeon.region}",
                    color = Color(0xFFC8AA6E).copy(alpha = 0.7f),
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = campeon.bio,
                    color = Color.White,
                    fontSize = 15.sp,
                    lineHeight = 22.sp,
                    fontFamily = FontFamily.SansSerif
                )
            }
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
