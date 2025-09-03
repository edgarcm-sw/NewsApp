package com.example.newsapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.R
import com.example.newsapp.ui.theme.AzulTopBar

@Composable
fun TopBar(innerPadding: PaddingValues) {

    // Estado del texto del buscador que se actualizará dinámicamente en la UI
    var browseText by remember {
        mutableStateOf("")
    }

    OutlinedTextField(

        // Para hacer la actualización el UI
        value = browseText,
        onValueChange = {
            browseText = it
        },

        // Estado del texto del buscador que se actualizará dinámicamente en la UI
        placeholder = {
            Text (
                text = "Buscar",
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        },

        // Icono personalizado a la izquierda del buscador (leadingIcon)
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.iconbrowser),
                contentDescription = "Icono Buscar",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(34.dp)
            )
        },

        // Borde personalizado sobre el borde por defecto para aumentar grosor y cambiar color
        // Mantener el mismo shape evita que se vea el borde original debajo
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = AzulTopBar,
                shape = RoundedCornerShape(24.dp)
            ),
        shape = RoundedCornerShape(24.dp),

        // Limita el campo a una sola línea de texto
        singleLine = true
    )
}