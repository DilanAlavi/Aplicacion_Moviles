package com.example.aplicacion_ucb_restaurante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.aplicacion_ucb_restaurante.ui.login.LoginGustoUI
import com.example.aplicacion_ucb_restaurante.ui.screens.HomeScreen
import com.example.aplicacion_ucb_restaurante.ui.theme.Aplicacion_Ucb_RestauranteTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aplicacion_Ucb_RestauranteTheme {
                LoginGustoUI()
            }
        }
    }
}