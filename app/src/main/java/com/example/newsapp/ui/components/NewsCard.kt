package com.example.newsapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.AzulBoxes

@Composable
fun NewsCard(imagenId: Int, texto: String) {
    // Diseño de la primer box donde ira la imagen
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 200.dp)
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Gray),
        contentAlignment = Alignment.BottomCenter
    ) {

        // Imagen de fondo que ocupa toda la Box
        Image(
            painter = painterResource(id = imagenId),
            contentDescription = "Imagen de noticia",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )


        // Diseño de la segunda box donde ira la información
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(AzulBoxes),
            contentAlignment = Alignment.BottomCenter
        ) {

            // Diseño del texto de la información
            Text(
                text = texto,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 5.dp)
            )
        }
    }
}