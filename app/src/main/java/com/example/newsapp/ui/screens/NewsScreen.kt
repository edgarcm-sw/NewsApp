package com.example.newsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.R
import com.example.newsapp.ui.components.NewsCard
import com.example.newsapp.ui.components.NewsCardTop

@Composable
fun NewsScreen() {

    // Aquí creo la lista de las noticias que van a estar en la app
    val recentNews = listOf(
        "Gobierno de México concede 479 amnistías en los últimos 12 meses" to "Septiembre 1 - 2025",
        "México descarta acuerdo de libre comercio con Brasil pese a intentos" to "Agosto 28 - 2025",
        "El Banco de México celebra su centenario con el lanzamiento de una nueva moneda..." to "Agosto 26 -2025"
    )

    // Lista donde estara la información del segundo apartado de noticias
    val newsList = listOf(
        // En la primer cadena de texto iría la ruta de la imagen
        R.drawable.nt1 to "Primer Informe de Gobierno de Claudia Sheinbau",
        R.drawable.nt2 to "México y EE.UU. firman acuerdo de seguridad",
        R.drawable.nt3 to "Sheinbaum responde a Trump: 'El crimen no gobierna México'",
        R.drawable.nt4 to "Equinoccio de otoño 2025: rituales y ciencia",
        R.drawable.nt5 to "Tormenta tropical Bárbara se forma cerca de México",
        R.drawable.nt6 to "Aumenta el turismo en Quintana Roo"
    )

    // Aquí en un column pongo el titulo del texto de lo que va a ir en ese apartado y para que se
    // muestren en columna
    Column {
        Text(
            text = "Ultimas Noticias",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 15.dp)
        )

        // Creo un LazyRow  para hacer interactiva la seccion
        LazyRow {

            // Aquí es donde voy a mostrar los items con su texto y su fecha
            items(recentNews) { (texto, fecha) ->
                NewsCardTop(texto, fecha)
            }
        }

        // Diseño del texto de la segunda parte de noticias
        Text(
            text = "Alrededor del mundo",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 15.dp)
        )

        // Dos columnas verticales con boxes en modo de "tarjetas" para mostrar las noticias
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {

            // Se pasan los valor o información de la lista
            items(newsList) { (imagenId, texto) ->
                NewsCard(imagenId, texto)
            }
        }
    }
}