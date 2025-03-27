package com.example.aplicacion_ucb_restaurante.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacion_ucb_restaurante.ui.screens.ConfiguracionScreen
import com.example.aplicacion_ucb_restaurante.ui.viewmodel.ConfiguracionViewModel

@Composable
fun AppNavigation(viewModel: ConfiguracionViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "configuracion"
    ) {
        composable("configuracion") {
            ConfiguracionScreen(
                viewModel = viewModel,
                onBackClick = { /* Manejar el regreso */ },
                onMenuItemClick = { route ->
                    navController.navigate(route)
                }
            )
        }

        // Aquí definirías las demás pantallas para cada opción del menú
        composable("mi_cuenta") {
            // Implementación de la pantalla Mi cuenta
        }

        composable("filtros_comida") {
            // Implementación de la pantalla Filtros de comida
        }

        // Continuar con las demás rutas...
    }
}