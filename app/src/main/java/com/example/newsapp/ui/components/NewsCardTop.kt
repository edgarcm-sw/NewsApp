package com.example.newsapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.AzulBoxes

@Composable
fun NewsCardTop(texto: String, fecha: String) {
    // En un box voy a guardar cada noticia, estos se estaran creando en base a las noticias
    Box(
        modifier = Modifier
            .size(width = 250.dp, height = 200.dp)
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(AzulBoxes),
        contentAlignment = Alignment.BottomStart
    ) {

        // En esta otra columna es el como se van a estar acomodando los textos de cada
        // Noticia y su fecha
        Column(
            modifier = Modifier
                .padding(start = 10.dp, bottom = 5.dp)
        ) {

            // Aquí estara el texto con su respectivo diseño
            Text(
                text = texto,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
            // Y la fecha con su respectivo diseño
            Text(
                text = fecha,
                fontSize = 12.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
        }
    }
}