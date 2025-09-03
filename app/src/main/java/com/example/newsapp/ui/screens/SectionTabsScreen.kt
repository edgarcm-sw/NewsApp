package com.example.newsapp.ui.screens

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.AzulTopBar

@Composable
fun SectionTabsScreen(
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {

    // Crea la lista de cada tab que va a estar en el TabRow
    val tabs = listOf("Noticias", "Eventos", "Clima")

    TabRow(

        // Este maneja la posición del tab en el que va a estar el usuario
        selectedTabIndex = selectedTabIndex,

        // Aquí agarramos el indicador de cada Tab para personalizarlo que se vea mas grande
        // el borde, mas chico y le agregamos color
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier
                    .tabIndicatorOffset(tabPositions[selectedTabIndex])
                    .padding(horizontal = 30.dp)
                    .height(4.dp),
                color = AzulTopBar
            )
        },

        // Este divider elimina la linea divisora fina que aparece por defecto en el TabRow
        divider = {},
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
    ) {
        tabs.forEachIndexed { index, string ->
            Tab(
                selected =  selectedTabIndex == index,
                onClick = { onTabSelected(index) },
                text = {
                    Text(
                        text = string,
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            )
        }
    }
}