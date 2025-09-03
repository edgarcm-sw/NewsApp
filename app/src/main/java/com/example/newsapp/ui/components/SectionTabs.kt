package com.example.newsapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.newsapp.ui.screens.EventsScreen
import com.example.newsapp.ui.screens.NewsScreen
import com.example.newsapp.ui.screens.SectionTabsScreen
import com.example.newsapp.ui.screens.WeatherScreen

@Composable
fun SectionTabsFun(innerPadding: PaddingValues) {
    // Crea la variable para que se actualice la vista de cada tab dentro de SectionTabs
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(horizontal = 12.dp)
    ) {
        TopBar(innerPadding)

        // Paso los parámetros definidos en SectionTabs para que se actualice
        // correctamente la vista
        SectionTabsScreen (

            // Este indica en que Tab estamos
            selectedTabIndex = selectedTabIndex,

            // Esta función actualiza el índice del Tab seleccionado por el usuario
            onTabSelected = { selectedTabIndex = it }
        )

        // Aquí ya solo mandamo a llamar a la función que se va a ejecutar dependiendo del Tab
        // en el que estemos, se va a estar actualizando la UI automaticamente
        when (selectedTabIndex) {
            0 -> NewsScreen()
            1 -> EventsScreen()
            2 -> WeatherScreen()
        }
    }
}